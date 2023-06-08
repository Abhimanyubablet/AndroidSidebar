package com.example.form_workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner

class protfolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protfolio)

        val lang=arrayOf<String>("Gender","Male","Female")
        val spin=findViewById<Spinner>(R.id.spin)
        val adapt=ArrayAdapter(this,R.layout.spinner,lang)
        spin.adapter=adapt

//        val lan=arrayOf<String>("My name is abhi.","Your name is rahul.")
//        val List=findViewById<ListView>(R.id.ListView)
//        val adap=ArrayAdapter(this,R.layout.spinner,lan)
//        List.adapter=adap


        val Data= arrayListOf<DataModel>(
            DataModel("Edugaon","admission open","https://media.yourobserver.com/img/photos/2023/04/25/img-homepage-meta_0_t1100.jpeg?31a214c4405663fd4bc7e33e8c8cedcc07d61559"),
            DataModel("Abhimanyu","My Dream", "https://www.imgcorporations.com/images/bg-img.jpg")
        )

        val ListView=findViewById<ListView>(R.id.ListView)
        val adapter=CustomAdpater(this,Data)
        ListView.adapter=adapter

    }
}