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

        btnLog.setOnClickListener {
            Log.d("메인화면에서 찍는 로그", "로그찍기 버튼이 눌림")
            Log.e("메인화면에서 찍는 로그","로그e")
        }
//  이 줄은 주석이 됨(ctrl+/)
        btnToast.setOnClickListener {
//            토스트 버튼이 눌리면 할일 따로 설정
            Toast.makeText(this,"버튼이 눌렸습니다.",Toast.LENGTH_SHORT).show()
        }
        btnToast2.setOnClickListener {
            Toast.makeText(this, "두번째 버튼이 눌렸습니다", Toast.LENGTH_SHORT).show()

        }

        btnCopyText.setOnClickListener {
//            1. 입력칸에 어떤 내용이 적혀있는지? 컴퓨터에게 메모시키자 ->변수를 만들고 값을 담아두자
            val inputcontent = edtContent.text.toString()
//            2. 텍스트 뷰에 알아낸 내용을 세팅 -> apahgoens sodyddmf TXT의 속성에 대입
            txtCopyResult.text = inputcontent
        btnContentToast.setOnClickListener {
            val inputContent = edtContent.text.toString()

            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()
        }

        }
    }
}