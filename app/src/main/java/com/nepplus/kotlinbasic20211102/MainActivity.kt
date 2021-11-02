package com.nepplus.kotlinbasic20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       menu1.setOnClickListener {
           Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show()
       }
        menu2.setOnClickListener {
            Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show()
        }
        menu3.setOnClickListener {
            Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show()
        }
        menu4.setOnClickListener {
            Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show()
        }
        hamburger.setOnClickListener {
            Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show()
        }



        btnLogin.setOnClickListener {
            val inputID = edtID.text.toString()
            txtResult.text = inputID
            Toast.makeText(this, "성공", Toast.LENGTH_SHORT).show()
        }
        }
    }
