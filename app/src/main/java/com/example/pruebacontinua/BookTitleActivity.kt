package com.example.pruebacontinua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookTitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_title)

        val button : Button = findViewById(R.id.button)
        val titulo : EditText = findViewById(R.id.editTextText)
        val paginas : EditText = findViewById(R.id.editTextText2)

        button.setOnClickListener {
            val intent = Intent (this, BookDetailsActivity::class.java)
            intent.putExtra("titulo", titulo.text.toString())
            intent.putExtra("paginas", paginas.text.toString())
            startActivity(intent)
        }
    }
}