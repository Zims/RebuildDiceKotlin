package com.insultablogs.choreapp.rebuilddicekotlin

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.insultablogs.choreapp.rebuilddicekotlin.R.drawable.*
import junit.framework.Assert.assertTrue
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.Math.random
import java.util.*
import kotlin.collections.HashMap

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var diceOne = image_leftDice
        var diceTwo = image_rightDice

        var diceImg: Array<Int> = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)


        rollButton.setOnClickListener {
            Toast.makeText(this, "touched", Toast.LENGTH_LONG).show()
            var  r = Random()
            var  n=r.nextInt(6)
            image_leftDice.setImageDrawable(application.getDrawable(diceImg[n]))
            var  r2 = Random()
            var  n2=r2.nextInt(6)
            image_rightDice.setImageDrawable(application.getDrawable(diceImg[n2]))
        }

//            diceOne.setImageDrawable(application.getDrawable(diceImg[0]))
//            diceTwo.setImageDrawable(application.getDrawable(diceImg[5]))}
//
//            fun Random.nextInt(range: IntRange): Int {
//                return range.start + nextInt(range.last - range.start)
//            }
//            val random = Random()
//            val generatedNum = (random.nextInt(0..5))
//            println("generatedNum: " + generatedNum)
//            topText.text = generatedNum.toString()
//
//        }






//        rollButton.setOnClickListener {
//
//
//        }



    }

    }
