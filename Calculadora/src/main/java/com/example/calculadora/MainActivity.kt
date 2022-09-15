package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var op: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnuno.setOnClickListener {numeroPresionados("1")}
        btndos.setOnClickListener {numeroPresionados("2")}
        btntres.setOnClickListener {numeroPresionados("3")}
        btncuatro.setOnClickListener {numeroPresionados("4")}
        btncinco.setOnClickListener {numeroPresionados("5")}
        btnseis.setOnClickListener {numeroPresionados("6")}
        btnsiete.setOnClickListener {numeroPresionados("7")}
        btnocho.setOnClickListener {numeroPresionados("8")}
        btnnueve.setOnClickListener {numeroPresionados("9")}
        btncero.setOnClickListener {numeroPresionados("0")}

        btnresta.setOnClickListener {operacionpresionada(RESTA)}
        btnsuma.setOnClickListener {operacionpresionada(SUMA)}
        btnmultiplicacion.setOnClickListener {operacionpresionada(MULTI)}
        btndivision.setOnClickListener {operacionpresionada(DIVI)}

        btnborrar.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            resultadoview.text = "0"
            op = NO_OPERACION
        }

        btnresultado.setOnClickListener {
            var resultado = when (op) {

                SUMA ->  num1 + num2
                RESTA -> num1 - num2
                MULTI -> num1 * num2
                DIVI -> num1 / num2

                else -> 0
            }

            resultadoview.text = resultado.toString()
        }
    }

    private fun numeroPresionados(digito: String) {

        resultadoview.text = "${resultadoview.text}$digito"

        if (op == NO_OPERACION){
            num1 = resultadoview.text.toString().toDouble()
        } else {
            num2 = resultadoview.text.toString().toDouble()
        }

    }

    private fun operacionpresionada(operacion: Int){

        op = operacion

        resultadoview.text = "0"

    }

    companion object{
        const val SUMA =1
        const val RESTA =2
        const val MULTI =3
        const val DIVI =4
        const val NO_OPERACION =0
    }
}