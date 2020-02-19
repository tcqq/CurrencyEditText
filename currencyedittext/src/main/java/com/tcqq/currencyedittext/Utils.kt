package com.tcqq.currencyedittext

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.NumberFormat
import java.text.ParseException
import java.util.*

internal fun parseMoneyValue(
    value: String,
    groupingSeparator: String,
    currencySymbol: String
): String =
    value.replace(groupingSeparator, "").replace(currencySymbol, "")

internal fun parseMoneyValueWithLocale(
    locale: Locale,
    value: String,
    groupingSeparator: String,
    currencySymbol: String
): Number {
    val valueWithoutSeparator = parseMoneyValue(value, groupingSeparator, currencySymbol)
    return try {
        NumberFormat.getInstance(locale).parse(valueWithoutSeparator)!!
    } catch (exception: ParseException) {
        0
    }
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
internal fun getLocaleFromTag(localeTag: String): Locale {
    return if (isLollipopAndAbove()) {
        Locale.Builder().setLanguageTag(localeTag).build()
    } else {
        Locale.getDefault()
    }
}

internal fun isLollipopAndAbove(): Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
