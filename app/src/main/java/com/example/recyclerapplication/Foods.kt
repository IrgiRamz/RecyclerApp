package com.example.recyclerapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Foods(
    var photo:Int = 0,
    var name:String = "",
    var detail:String = ""
) : Parcelable