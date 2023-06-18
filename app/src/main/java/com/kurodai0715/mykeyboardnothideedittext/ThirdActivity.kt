package com.kurodai0715.mykeyboardnothideedittext

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val editText: EditText = findViewById(R.id.top_edit_text3)
        editText.requestFocus()

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener{
            finish()
        }
    }

}