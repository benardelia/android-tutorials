package com.bravetech.pager.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bravetech.pager.R


class FragmentSecond : Fragment() {
private lateinit var uTubeBtn : Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView = inflater.inflate(R.layout.fragment_second, container, false)
        uTubeBtn = fragmentView.findViewById(R.id.youtube_btn)!!
        uTubeBtn.setOnClickListener {

            // launch youtube from here
            Intent(Intent.ACTION_MAIN).also {
                it.`package` = "com.google.android.youtube"

                try {
                    startActivity(it)
                }catch (e: ActivityNotFoundException){
                    e.printStackTrace()
                }
            }
        }
        return fragmentView
    }



}