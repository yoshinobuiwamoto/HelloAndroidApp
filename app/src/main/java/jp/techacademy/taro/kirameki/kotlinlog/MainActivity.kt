package jp.techacademy.taro.kirameki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
 import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = total(50, 1000)     //ここでtotalからsumを返してもらう
        Log.d("kotlintest", t.toString())
    }
        private fun total(first:Int,last:Int):Int {
            var sum = 0
            for (i in first..last) {
                sum += i
            }
            return sum
        }
    }

