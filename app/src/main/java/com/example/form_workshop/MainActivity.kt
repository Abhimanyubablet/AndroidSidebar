package com.example.form_workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name=findViewById<EditText>(R.id.Name)
        val Password=findViewById<EditText>(R.id.Password)
        val Address=findViewById<EditText>(R.id.Address)
        val Phone=findViewById<EditText>(R.id.Phone)

       val button=findViewById<Button>(R.id.btn)

        button.setOnClickListener{
            var intent= Intent(this,MainActivity3::class.java)
            intent.putExtra("p",Name.text.toString())
            intent.putExtra("q",Password.text.toString())
            intent.putExtra("r",Address.text.toString())
            intent.putExtra("s",Phone.text.toString())
            startActivity(intent)
        }

    }
}