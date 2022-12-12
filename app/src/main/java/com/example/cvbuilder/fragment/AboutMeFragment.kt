package com.example.cvbuilder.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilder.R
import com.example.cvbuilder.entity.EducationList
import com.example.cvbuilder.entity.MyCertificationList
import com.example.cvbuilder.myadapters.ListAdapter


class AboutMeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_me_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData(view)
    }

    private fun bindData(view: View) {

        view.findViewById<TextView>(R.id.tv_aboutMe).text = getString(R.string.about_me)
        setEducationList(view)
        setCertificationList(view)
    }

    private fun setEducationList(view: View) {
        val educationList = ArrayList<EducationList>()

        educationList.add(
            EducationList(
                1, R.drawable.miu,
                getString(R.string.uni1),
                getString(R.string.uni1detials)
            )
        )
        educationList.add(
            EducationList(
                2, R.drawable.pisa,
                getString(R.string.uni2),
                getString(R.string.uni2details)
            )
        )

        val adapter = ListAdapter()
        val rv_list = view.findViewById<RecyclerView>(R.id.rv_educationList)
        adapter.setAdapterType(ListAdapter.EDUCATION_TYPE)
        adapter.addEducations(educationList)
        rv_list.adapter = adapter
    }

    private fun setCertificationList(view: View) {

        val myCertificationListList = ArrayList<MyCertificationList>()

        myCertificationListList.add(
            MyCertificationList(
                1, R.drawable.gcp,
                getString(R.string.cirtification1), 2020
            )
        )
        myCertificationListList.add(
            MyCertificationList(
                2, R.drawable.androidassociate,
                getString(R.string.cirtification2), 2021
            )
        )
        val myAdapter = ListAdapter()
        val certificationsList = view.findViewById<RecyclerView>(R.id.rv_certificationList)
        myAdapter.setAdapterType(ListAdapter.CERTIFICATION_TYPE)
        myAdapter.addCertifications(myCertificationListList!!)
        certificationsList.adapter = myAdapter
    }


}