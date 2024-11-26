package com.sirketismi.kasimturkcellandroid

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(val name : String) : Parcelable {
}