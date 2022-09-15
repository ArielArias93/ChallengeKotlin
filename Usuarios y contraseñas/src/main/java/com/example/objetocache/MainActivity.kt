package com.example.objetocache

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myArray1 = arrayListOf<String>()

        val a1 = agregar("a", "value1", myArray1)
        val a2 = agregar("b", "value2", myArray1)
        val a3 = agregar("b", "value2", myArray1)
        val a4 = agregar("rrrrr", "nothing", myArray1)


        val b1 = buscar("hello", myArray1)
        val b2 = buscar("word", myArray1)
        val b3 = buscar("b", myArray1)
        val b4 = buscar("rrrrr", myArray1)

        val cant = medir(myArray1)

        println("$a1 $a2 $a3 $a4 $b1 $b2 $b3 $b4 $cant")

    }

    private fun agregar(clave: String, valor: String, array: ArrayList<String>): String {

        array.add(clave)
        array.add(valor)

        val cant = array.size -2
        var i = 0
        var oA = "added"

        while(i < cant) {

            if(array[i] == clave) {

                if (array[i + 1] == valor) {

                    oA = "overwritted"
                }
            }
            i+=2
         }
        return oA
       }


    private fun buscar(clave: String, array: ArrayList<String>): String {

        val cant = array.size
        var i = 0
        var cM = "miss"

        while(i < cant) {

            if(array[i] == clave){

                cM = (array[i+1])
                break
            }
            i+=2
        }
        return cM
    }

    private fun medir(array: ArrayList<String>): Int {

        return ((array.size / 2) - 1)
    }
}