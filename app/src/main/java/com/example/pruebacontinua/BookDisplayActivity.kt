package com.example.pruebacontinua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        val titulo = intent.getStringExtra("titulo")
        val paginas = intent.getStringExtra("paginas")
        val autor = intent.getStringExtra("autor")
        val anio = intent.getStringExtra("anio")

        val tb : TextView = findViewById(R.id.textView5)
        val pb : TextView = findViewById(R.id.textView6)
        val ab : TextView = findViewById(R.id.textView7)
        val anb : TextView = findViewById(R.id.textView8)

        tb.text=titulo
        pb.text=paginas
        ab.text=autor
        anb.text=anio

        val button : Button = findViewById(R.id.button4)

        button.setOnClickListener {
            val intent = Intent (this, BookTitleActivity::class.java)
            startActivity(intent)
        }
    }
}