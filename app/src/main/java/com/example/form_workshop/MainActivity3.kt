package com.example.form_workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var User_Name_P=findViewById<TextView>(R.id.User_Name)
        var User_Password_Q=findViewById<TextView>(R.id.User_Password)
        var User_Address_R=findViewById<TextView>(R.id.User_Address)
        var User_Phone_S=findViewById<TextView>(R.id.User_Phone)

        val User_Name=intent.getStringExtra("p")
        User_Name_P.text=User_Name

        val User_Password=intent.getStringExtra("q")
        User_Password_Q.text=User_Password

        val User_Address=intent.getStringExtra("r")
        User_Address_R.text=User_Address

        val User_Phone=intent.getStringExtra("s")
        User_Phone_S.text=User_Phone
    }
}