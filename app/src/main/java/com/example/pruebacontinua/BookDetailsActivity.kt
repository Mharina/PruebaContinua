package com.example.pruebacontinua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val button : Button = findViewById(R.id.button2)
        val autor : EditText = findViewById(R.id.editTextText3)
        val anio : EditText = findViewById(R.id.editTextText4)

        val titulo = intent.getStringExtra("titulo")
        val paginas = intent.getStringExtra("paginas")

        button.setOnClickListener {
            val intent = Intent (this, BookDisplayActivity::class.java)
            intent.putExtra("titulo",titulo)
            intent.putExtra("paginas",paginas)
            intent.putExtra("autor", autor.text.toString())
            intent.putExtra("anio", anio.text.toString())
            startActivity(intent)
        }

    }
}