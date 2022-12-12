package com.example.cvbuilder.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cvbuilder.R
import de.hdodenhof.circleimageview.CircleImageView


class HomeFragment() : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData(view)
    }

    private fun bindData(myView: View) {
        myView.findViewById<CircleImageView>(R.id.img_personal)
            .setImageResource(R.drawable.heni_profile)
        myView.findViewById<ImageView>(R.id.img_cover).setImageResource(R.drawable.profile)
        myView.findViewById<TextView>(R.id.Last_name_first_name).text =
            getString(R.string.Last_name_first_name)
        myView.findViewById<TextView>(R.id.tv_job_title).text = "Software Developer"
        myView.findViewById<TextView>(R.id.tv_career_note).text = getString(R.string.career_note)
        myView.findViewById<TextView>(R.id.tech_languages).text = getString(R.string.tech_details)
    }

}