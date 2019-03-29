package ru.mirea.laba

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_set_items_count.*

class SetItemsCountActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_items_count)
        btn_next.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)
                .putExtra("itemsCount", et_items_count.text.toString().toInt())) }
    }
}