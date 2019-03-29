package ru.mirea.testproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListeners()

    }

    private fun setOnClickListeners() {
        btn_hello.setOnClickListener { sayHello() }
    }


    private fun sayHello() {

        Toast.makeText(this, et_hello.text.toString(), Toast.LENGTH_SHORT).show()

        startActivity(Intent(this, SecondActivity::class.java))
    }


}