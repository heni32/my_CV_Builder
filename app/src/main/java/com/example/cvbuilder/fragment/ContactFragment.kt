package com.example.cvbuilder.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cvbuilder.R

class ContactFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myBindData(view)
    }

    private fun myBindData(view: View) {

        view.findViewById<TextView>(R.id.tv_title_mobile)
            .text = getString(R.string.phone)
        view.findViewById<TextView>(R.id.tv_title_gmail)
            .text = getString(R.string.email)
        view.findViewById<TextView>(R.id.tv_title_linkedIn)
            .text = getString(R.string.linkedIn)
        view.findViewById<TextView>(R.id.tv_title_github)
            .text = getString(R.string.github)
        view.findViewById<TextView>(R.id.tv_title_resume)
            .text = getString(R.string.pdf)

    }


}