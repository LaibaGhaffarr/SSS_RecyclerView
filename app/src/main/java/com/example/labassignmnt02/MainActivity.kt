package com.example.labassignmnt02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
val recyclerView: RecyclerView=findViewById(R.id.recyclerview)
val adapter: ArticlesAdapter=ArticlesAdapter(getArticles())
        recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(this)
    }
    fun getArticles():List<Article>{
        val articles=ArrayList<Article>()
        articles.add(Article("The Skyline School Rafiq Safdar Campus Sahiwal","May 4, 2024",R.drawable.skyline,"The Skyline School Rafiq Safdar Campus in Sahiwal is a prominent educational institution dedicated to providing quality education to students. The schools goal is to provide students with a rounded education that focuses on both academics and moral development creating an environment where students can thrive and develop into individuals."))
        articles.add(Article(
            "Allied School Main Boys Campus Sahiwal",
            "May 5, 2024",
            R.drawable.allied_boys,
            "Allied Boys Campus is the Magnet School located in the heart of the city of Sahiwal, Pakistan. The institution was set up as one of the schools under the Allied Schools network. It operates with a vision of offering quality education and a conducive environment for the male students."
        ))

        articles.add(Article(
            "Mukabbir Schools Sahiwal",
            "May 6, 2024",
            R.drawable.mukabbir_schools,
            "The ideal of Mukabbir Schools is to create a nurturing environment that promotes academic success, character growth, and general welfare of its students. This establishment is proud of training leaders and provides education that is not based on any discrimination while considering the utmost importance of Islamic values and rules."
        ))
        articles.add(Article(
            "Beaconhouse Sahiwal Boys Campus Sahiwal",
            "May 7, 2024",
            R.drawable.beaconhouse,
            "The Beaconhouse Sahiwal Boys Campus in Sahiwal, Pakistan is one of the most respected institutions that provide education to its students. The school provides various programs, which include the Middle School Programme, Primary Years Programme, and Secondary School Programme. Under the leadership of Head Muhammad Azhar Asghar, the campus aims at developing academic excellence and holistic development. Beaconhouse Sahiwal Boys Campus seeks to motivate and enable students so that they realize their full potential."
        ))

        articles.add(Article(
            "St. Mary’s Convent Higher Secondary School for Girls Sahiwal",
            "May 8, 2024",
            R.drawable.convent,
            "St. Mary’s Convent Higher Secondary School for Girls, located in Sahiwal, Punjab, was established in 1955. With over 65 years of history, this school has a long tradition of providing quality education and guiding the personal and academic development of girls. As a private Catholic all-girls school, it is acknowledged not only for its delivery of knowledge within a values-based framework but also for promoting holistic development and character growth."
        ))
        articles.add(Article("EFA School Systems Sahiwal","May 4, 2024",R.drawable.efa,"EFA School Systems in Sahiwal is an institution of an education partners network committed to offering an excellent education. EFA School Systems provides an environment that nurtures the student enabling those students to excel academically and holistically. The institute’s dedication to creating versatile individuals is manifested in its programs that are well-rounded and focused on character building. Sahiwal-based EFA School Systems has a mission to build students with the necessary knowledge and skills for their future."))
        articles.add(Article(
            "Government Comprehensive High Secondary School Sahiwal",
            "May 2, 2024",
            R.drawable.comprehensive,
            "The Government Comprehensive High Secondary School Sahiwal is the oldest and most reputable academic institution in the city of Sahiwal, Pakistan. Dating back for a number of decades, the school was set up with a strong history of providing quality education and supporting worthwhile academic and personal development for their students. GCHSS Sahiwal is facilitating its students for successful performance in both local and all Pakistan examinations."
        ))

        articles.add(Article(
            "The City School Sahiwal",
            "May 2, 2024",
            R.drawable.city,
            "The City School Sahiwal, one of the renowned institutions in the City Schools Network, is a symbol of educational excellence. It offers a wide range of curriculum and a conducive learning atmosphere. The school is part of a network comprising 160 schools in 49 cities across Pakistan, making it distinctive in its pursuit of high academic standards and fostering a passion for both local and international examinations."
        ))

        articles.add(Article(
            "Lahore Grammar School Sahiwal",
            "May 1, 2024",
            R.drawable.lgs,
            "Lahore Grammar School (LGS) Sahiwal is a well-renowned educational institution in Punjab's Sahiwal city. Established in 1979, it is part of the LGS chain, known for nurturing academic excellence and holistic student growth. The school follows the Cambridge Board of International Examinations for O and A Levels, with a complete education system that emphasizes analytical thinking, logical reasoning, and a rich co-curricular program."
        ))
        articles.add(Article(
            "Divisional Public School & College Sahiwal",
            "May 1, 2024",
            R.drawable.dps,
            "Divisional Public School & College Sahiwal, part of the prestigious Divisional Public Schools and College system, is Sahiwal’s premier educational institution. Established as a mega-school in 1963, DPS Sahiwal has a long-standing tradition of academic excellence and all-round development for students. Affiliated with some of the top examination boards like BISE and CIE, the school aims to prepare students for a successful future."
        ))

        articles.add(Article(
            "Bloomfield Hall School Sahiwal",
            "May 1, 2024",
            R.drawable.bhs,
            "Founded in 1976, Bloomfield Hall School Sahiwal is the leading English-medium school in the city, known for its academic rigor and commitment to holistic development. Under the leadership of Mrs. Alia Ahsan, the school has risen to prominence, offering a top-tier curriculum and nurturing learning environment. It aims to provide students with the tools necessary for success in the 21st century."
        ))

        articles.add(Article(
            "SEEK School And College Sahiwal",
            "May 1, 2024",
            R.drawable.seek,
            "SEEK School And College Sahiwal is recognized for its commitment to offering a broad curriculum including subjects like English, Mathematics, Science, and Islamiat. The SEEK Educational Organization provides affordable education for students from diverse backgrounds. The school’s focus on budget-friendly, quality education makes it a beacon of learning and academic success in the district."
        ))
        articles.add(Article("The Educators Sahiwal", "May 4, 2024", R.drawable.educators, "The Educators Sahiwal is a prominent educational institution that focuses on providing quality education at affordable rates. With a curriculum designed to foster academic excellence and personal growth, the school emphasizes holistic development for its students. The Educators strives to create a nurturing environment where students can excel both academically and socially."))

        articles.add(Article("Smart School Sahiwal", "May 4, 2024", R.drawable.smart, "Smart School Sahiwal is known for its innovative teaching methods and modern educational approach. The institution aims to develop critical thinking and creativity among students through a diverse curriculum. With a strong emphasis on technology integration in learning, Smart School prepares students for the challenges of the future."))

        articles.add(Article("Apsacs - Campus Sahiwal", "May 4, 2024", R.drawable.aps, "Apsacs - Campus Sahiwal is part of the Apsacs network, which is dedicated to providing quality education with a strong focus on academic and moral development. The school offers a well-rounded curriculum that includes extracurricular activities to ensure students achieve excellence in all aspects of their education."))


        return articles
    }
}