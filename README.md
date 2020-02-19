[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)
[ ![Download](https://api.bintray.com/packages/tcqq/android/currencyedittext/images/download.svg?version=1.0.1) ](https://bintray.com/tcqq/android/currencyedittext/1.0.1/link)
[![Licence](https://img.shields.io/badge/Licence-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# CurrencyEditText

Dynamically format EditTexts to take currency inputs.

# Usage
Supported attributes with _default_ values:
``` 
<com.tcqq.currencyedittext.CurrencyEditText
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android usual attrs
    (see below).../>
   
```
|**Attrs**|**Example** |
|:---|:---|
| `currency_symbol` | `$`
| `currency_locale_tag` | `en-US`
| `currency_symbol_hint` | `false`

```
edit_text.setCurrencySymbol("$")
edit_text.setLocale(Locale.US)
edit_text.getNumericValueBigDecimal()
```

# Setup
#### build.gradle
```
repositories {
    jcenter()
}
```
```
dependencies {
    // Using JCenter
    implementation 'com.tcqq.android:currencyedittext:1.0.1'
}
```

# Screenshots

![Screenshot](/screenshots/screenshot.png)

License
-------

Copyright 2020 CottaCush, Alan Perry.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
