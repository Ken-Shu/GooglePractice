package com.ken_shu.app_u2_recyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//這兩個stringResourceId和imageResourceId是整數值。
// 儘管這看起來還不錯，但調用方可能會意外地以錯誤的順序傳遞參數
// （imageResourceId首先使用而不是stringResourceId）。
//
//為了避免這種情況，您可以使用資源註釋。
// 註釋之所以有用，是因為它們將附加信息添加到類，
// 方法或參數中。註釋始終以@符號聲明。在這種情況下
// ，將@StringRes註釋添加到字符串資源ID屬性，
// 並將@DrawableRes註釋添加到可繪製資源ID屬性。
// 如果您提供的資源ID類型錯誤，則會收到警告。
data class Affirmation (@StringRes val  stingResourceId : Int
                        ,@DrawableRes val imageResoutrceId : Int)
