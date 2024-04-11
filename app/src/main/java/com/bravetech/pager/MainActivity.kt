package com.bravetech.pager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bravetech.pager.fragments.FragmentsHolder
import com.bravetech.pager.pager_view.PagerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentButton: Button = findViewById(R.id.fragment_btn)
        val pageViewButton: Button = findViewById(R.id.pager_view_btn)


        fragmentButton.setOnClickListener {
            val intent = Intent(this, FragmentsHolder::class.java)
            startActivity(intent)
        }

        pageViewButton.setOnClickListener {
            val intent = Intent(this, PagerView::class.java)
            startActivity(intent)
        }

    }
}