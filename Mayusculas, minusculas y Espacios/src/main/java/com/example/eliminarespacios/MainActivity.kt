package com.example.eliminarespacios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cadenaTexto = "cats AND*Dogs-are Awesome"

        val noSimbolo = Regex("[^A-Za-z0-9 ]")

        val cadenaSinSimbolos = noSimbolo.replace(cadenaTexto, " ")

        val cadenaMayusculas = cadenaSinSimbolos.StringChallenge()

        val cadenaSinEspacios = cadenaMayusculas.replace("\\s".toRegex(), "")

        val cadenaFinal = cadenaSinEspacios.replaceFirstChar { it.lowercase() }

        println(cadenaFinal)
    }

        private fun String.StringChallenge(): String = split(" ").joinToString(" ") {

            it.lowercase().replaceFirstChar{it.uppercase()}
        }

    }
