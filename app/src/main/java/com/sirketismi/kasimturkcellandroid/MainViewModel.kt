package com.sirketismi.kasimturkcellandroid

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()  {
    private var productList = mutableListOf<Product>()

    fun addProduct(product : Product) {
        productList.add(product)
    }
}