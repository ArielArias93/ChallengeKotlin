package com.example.puntuarrating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.SQLOutput

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        starRating(5.01)

    }

    private fun starRating(str: Double) {

        val starFull: Int = str.toInt()

        when (starFull) {

            0 -> {
                if (str == 0.00){
                    println("empty empty empty empty empty")
                } else {
                    println("half empty empty empty empty")
                }
            }

            1 -> {
                if (str == 1.00){
                    println("full empty empty empty empty")
                } else {
                    println("full half empty empty empty")
                }
            }

            2 -> {
                if (str == 2.00){
                    println("full full empty empty empty")
                } else {
                    println("full full half empty empty")
                }
            }

            3 -> {
                if (str == 3.00){
                    println("full full full empty empty")
                } else {
                    println("full full full half empty")
                }
            }

            4 -> {
                if (str == 4.00){
                    println("full full full full empty")
                } else {
                    println("full full full full half")
                }
            }

            5 -> {
                if (str == 5.00){
                    println("full full full full full")
                } else {
                    println("Ingrese un numero entre 0.00 y 5.00")
                }
            }

            else -> {
                println("Ingrese un numero entre 0.00 y 5.00")
            }

        }

    }

}