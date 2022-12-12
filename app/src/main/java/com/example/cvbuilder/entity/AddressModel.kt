package com.example.cvbuilder.entity

class AddressModel {
    var addressIcon: Int? = 0
    var myContactTypes: MyContactTypes? = null
    var addressInfo: String? = null
    var mediaTitle: String? = null

    init {
        when (myContactTypes) {
            MyContactTypes.MOBILE -> mediaTitle = "Mobile"
            MyContactTypes.EMAIL -> mediaTitle = "Email"
            MyContactTypes.LINKEDIN -> mediaTitle = "LinkedIn Website"
            MyContactTypes.GITHUB -> mediaTitle = "GitHub"
            MyContactTypes.RESUME -> mediaTitle = "My Resume.pdf"
            else -> {}
        }
    }
}