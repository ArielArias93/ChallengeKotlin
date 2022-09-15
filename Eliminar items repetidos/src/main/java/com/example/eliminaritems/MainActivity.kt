package com.example.eliminaritems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = " name=Dan B, username=db, email=db@gmail.com, id=123; name=Hannah, username=hsmith, id=333, email=hsm@test.com; name=Dan Brick, username=db, email=db@gmail.com, id=663;"

        println(items)

        val num = Regex(", id=[^A-Za-z][^A-Za-z][^A-Za-z]")

        items = num.replace(items, "")

        println(LogDumpGetUnique(items))

    }

    fun LogDumpGetUnique(items: String): String{

        var array = items.split("; ").toTypedArray()

        val array2 = items.split("; ").toTypedArray()

        val array3 = items.split("; ", ",").toTypedArray()

        val array4 = items.split("; ", ",").toTypedArray()

        var i = 0

        while(i < array.size){

            var j= i+1

            while (j < array2.size){

                var k = 0

                while (k < array3.size){

                    var l = k+1

                    while (l < array4.size) {

                        if (array3[k] == array4[l]) {

                            var result = array2.toMutableList()
                            result.removeAt(j)
                            array = result.toTypedArray()
                        }
                        l++
                    }
                    k++
                }
            j++
            }
        i++
        }

        val resultadoFinal = array.joinToString("; ")

        return resultadoFinal
    }

}