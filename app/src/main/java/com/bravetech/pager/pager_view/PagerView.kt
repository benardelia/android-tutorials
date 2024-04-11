package com.bravetech.pager.pager_view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.bravetech.pager.R

class PagerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pager_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val images = listOf(
            R.drawable.field1,
            R.drawable.field2,
            R.drawable.field3,
            R.drawable.field4,
            R.drawable.field5
        )
        val pager: ViewPager2 = findViewById(R.id.view_pager)
        val  adapter = ViewPagerAdapter(images)

        pager.adapter = adapter

        pager.beginFakeDrag()
        pager.fakeDragBy(-20f)
        pager.endFakeDrag()

    }
}