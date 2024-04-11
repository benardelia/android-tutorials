package com.bravetech.pager.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bravetech.pager.R

class FragmentsHolder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragments_holder)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val firstFragment = FragmentFirst()
        val secondFragment = FragmentSecond()

        val firstFragBtn: Button = findViewById(R.id.fragment_first_btn)
        val secondFragBtn: Button = findViewById(R.id.fragment_second_btn)

       // first it replace frame layout with fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, firstFragment)
            commit()
        }

        firstFragBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, firstFragment)
//                addToBackStack(null) // to create stack of fragment for when back button is clicked the activity should not pop
                commit()
            }
        }

        secondFragBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, secondFragment)
                addToBackStack(null) // only use this if its necessary
                commit()
            }
        }


    }
}