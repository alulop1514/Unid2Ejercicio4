package com.example.unid2_ejercicio4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numeroAleatorio = 0

        b1.setOnClickListener {
            et1.text.clear()
            tv1.text = ""
            numeroAleatorio = ((Math.random() * 99) + 1).toInt()
        }
        et1.setOnClickListener {
            et1.hint = ""
        }
        b2.setOnClickListener {
            if (et1.text.toString().toInt() <= 100) {
                if (et1.text.toString().toInt() == numeroAleatorio)
                    tv1.text = "Ganas, pulsar para volver a jugar"
                else
                    tv1.text = "Piedes, pulsar para volver a jugar"
            } else
                Toast.makeText(this, "Introduce un numero del 1 al 100, por favor", Toast.LENGTH_LONG).show()

        }
    }
}