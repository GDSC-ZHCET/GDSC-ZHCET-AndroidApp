package com.example.gdsc_zhcet_androidapp.model

import com.example.gdsc_zhcet_androidapp.R

data class AboutData(
    val name: String = "Zakir Husain College of Engineering and Technology Aligarh",
    val about: String = "Welcome to Google Developer Student Clubs, ZHCET. Google Developer Student Clubs are university-based community groups for students interested in Google developer technologies. By joining a GDSC, students get access to Google Developer resources, build their personal and professional network, and work together to build solutions for local problems in a peer-to-peer learning environment.",
    val what_we_do: List<String> = listOf(
        "Hands-on Workshops",
        "Collaborative Events with Fellow GDSCs",
        "Talks: Get updated with the latest technologies by the industry experts",
        "Codelabs: Get hands-on experience and guidance from the community members",
        "Build Projects & Compete in the GDSC Solution Challenge",
        "Campus Roadshows: Share knowledge in different Companies, Colleges, and Universities",
        "Share knowledge in different Colleges and Universities through Google Cloud / Android Study Jams",
        "GDG / GDE expert talks"
    ),
    val how_to_join: List<String> = listOf(
        "Create a Profile",
        "Join the Chapter",
        "Get a Confirmation Email",
        "Attend Events"
    ),
    val partnersName: List<String> = listOf(
        "GDSC Aligarh Muslim University",
        "Microsoft Learn Student Ambassadors",
        "GDSC VelTech",
        "Codechef ZHCET Chapter"
    ),
    val partnersImage: List<Int> = listOf(
        R.drawable.gdsclogo,
        R.drawable.msla,
        R.drawable.gdsc_veltech,
        R.drawable.codechef
    )
)
