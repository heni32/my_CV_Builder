package com.heni.cvbuilder.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilder.R
import com.heni.cvbuilder.entity.WorkExperience
import com.heni.cvbuilder.myadapters.ListAdapter


class WorkFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_work, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpList(view)
    }

    private fun setUpList(view: View) {

        val workWorkExperienceList = ArrayList<WorkExperience>()
        workWorkExperienceList.add(
            WorkExperience(
                1, R.drawable.kitestring,
                "Software Consultant",
                "KiteString",
                "april 2021 - Current date",
                "Tx, USA",
                "Reactive java and Kafka developer."
            )
        )
        workWorkExperienceList.add(
            WorkExperience(
                1, R.drawable.creo,
                "Software Developer",
                "Creospan Inc.",
                "july 2019 - april 2021",
                "Tx, USA",
                "Developing for verizon microservice."
            )
        )
        workWorkExperienceList.add(
            WorkExperience(
                1, R.drawable.acuila,
                "Back-End Developer JAVA spring boot, micro-service",
                "AQUILA ICT Solution",
                "Feb 2017 - Jan 2019",
                "Pisa, Italy",
                "JAVA spring boot, micro-service"
            )
        )
        val myAdapter = ListAdapter()
        val workExperiencesList = view.findViewById<RecyclerView>(R.id.rv_workExperienceList)
        myAdapter.setAdapterType(ListAdapter.EXPERIENCE_TYPE)
        myAdapter.addExperiences(workWorkExperienceList!!)
        workExperiencesList.adapter = myAdapter

    }


}