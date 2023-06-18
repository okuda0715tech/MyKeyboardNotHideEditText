package com.kurodai0715.mykeyboardnothideedittext

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout

class SecondActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        editText = findViewById(R.id.top_edit_text2)
//        editText.requestFocus()

        val button : Button = findViewById(R.id.go_to_third_button)
        button.setOnClickListener{
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        }

        val constraintLayout: ConstraintLayout = findViewById(R.id.constraint_layout)
        constraintLayout.setOnClickListener {
            var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }
//        val linearLayout: LinearLayoutCompat = findViewById(R.id.linear_layout)
//        linearLayout.setOnClickListener {
//            var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow(it.windowToken, 0)
//        }
    }

    override fun onResume() {
        super.onResume()
        editText.requestFocus()
    }
}