package com.example.adivinhenumero

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val numero = Random.nextInt(1,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun vereficar(view: View) {
        val palpite = ed_palpite.text.toString().toInt();
        if (palpite==numero) {
            Toast.makeText(this, "Acertou!", Toast.LENGTH_SHORT).show();
        } else if (palpite > numero ){
            Toast.makeText(this, "É menor!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "É maior!", Toast.LENGTH_SHORT).show();
        }
    }
}