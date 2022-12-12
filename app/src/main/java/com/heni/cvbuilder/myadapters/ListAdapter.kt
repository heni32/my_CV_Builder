package com.heni.cvbuilder.myadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilder.R
import com.heni.cvbuilder.entity.EducationList
import com.heni.cvbuilder.entity.MyCertificationList
import com.heni.cvbuilder.entity.WorkExperience

class ListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var workExperienceList: List<WorkExperience>
    private lateinit var eduList: List<EducationList>
    private lateinit var certificationList: List<MyCertificationList>

    private var objectType = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (objectType) {
            EXPERIENCE_TYPE -> ExperiencesItemVM(
                inflater.inflate(
                    R.layout.experience,
                    parent,
                    false
                )
            )
            EDUCATION_TYPE -> EducationItemVM(
                inflater.inflate(
                    R.layout.education,
                    parent,
                    false
                )
            )
            else -> CertificationItemVM(
                inflater.inflate(
                    R.layout.certification,
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (objectType) {
            EXPERIENCE_TYPE ->
                workExperienceList.let {
                    (holder as ExperiencesItemVM).bind(it[position])
                }
            EDUCATION_TYPE ->
                eduList.let {
                    (holder as EducationItemVM).bind(it[position])
                }
            else ->
                certificationList.let {
                    (holder as CertificationItemVM).bind(it[position])
                }
        }
    }

    override fun getItemCount(): Int {
        return when (objectType) {
            EXPERIENCE_TYPE -> workExperienceList.size
            EDUCATION_TYPE -> eduList.size
            else -> certificationList.size
        }
    }

    fun setAdapterType(type: Int) {
        this.objectType = type
    }

    fun addExperiences(experiencesList: List<WorkExperience>) {
        this.workExperienceList = experiencesList
        notifyDataSetChanged()
    }

    fun addEducations(educationList: List<EducationList>) {
        this.eduList = educationList
        notifyDataSetChanged()
    }

    fun addCertifications(cerList: List<MyCertificationList>) {
        this.certificationList = cerList
        notifyDataSetChanged()
    }

    companion object {
        const val EXPERIENCE_TYPE = 1
        const val EDUCATION_TYPE = 2
        const val CERTIFICATION_TYPE = 3
    }

    inner class ExperiencesItemVM(val items: View) : RecyclerView.ViewHolder(items) {
        fun bind(workExperience: WorkExperience) {
            items.findViewById<ImageView>(R.id.img_comp_logo)
                .setImageResource(workExperience.image_Url)
            items.findViewById<TextView>(R.id.tv_item_job_title)
                .text = workExperience.job_Title
            items.findViewById<TextView>(R.id.tv_item_comp_title)
                .text = workExperience.companyName
            items.findViewById<TextView>(R.id.tv_item_job_period_data)
                .text = workExperience.date_duration
            items.findViewById<TextView>(R.id.tv_item_job_location)
                .text = workExperience.companyLocation
            items.findViewById<TextView>(R.id.tv_item_job_des)
                .text = workExperience.role

        }
    }

    inner class EducationItemVM(val myItem: View) : RecyclerView.ViewHolder(myItem) {
        fun bind(educationList: EducationList) {
            myItem.findViewById<ImageView>(R.id.img_edu_logo)
                .setImageResource(educationList.image_Url)
            myItem.findViewById<TextView>(R.id.tv_edu_school)
                .text = educationList.university
            myItem.findViewById<TextView>(R.id.tv_edu_degree)
                .text = educationList.degreeLevel
        }
    }

    inner class CertificationItemVM(val myItem: View) : RecyclerView.ViewHolder(myItem) {
        fun bind(myCertificationList: MyCertificationList) {
            myItem.findViewById<ImageView>(R.id.img_cer_logo)
                .setImageResource(myCertificationList.image_Url)
            myItem.findViewById<TextView>(R.id.tv_cer_name)
                .text = myCertificationList.title + "(" + myCertificationList.date + ")"

        }
    }
}