package com.sirketismi.kasimturkcellandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.sirketismi.kasimturkcellandroid.databinding.ActivityAddProductBinding

class AddProductActivity : AppCompatActivity() {

    lateinit var binding : ActivityAddProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_add_product)

        binding = ActivityAddProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainBtnAddProduct.setOnClickListener {
            val product = Product(name = binding.txtProductName.text.toString())

            val intent = Intent()
            intent.putExtra("prm_product", product)
            setResult(RESULT_OK, intent)

            finish()
        }

        val prmValue = intent.getStringExtra("prm")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}