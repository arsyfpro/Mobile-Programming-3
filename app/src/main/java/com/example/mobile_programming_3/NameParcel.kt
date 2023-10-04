package com.example.mobile_programming_3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NameParcel(
    val firstName: String,
    val lastName: String
) : Parcelable
