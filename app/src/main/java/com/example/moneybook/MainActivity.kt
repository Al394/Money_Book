package com.example.moneybook


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        add.setOnClickListener(){
            val sfm = supportFragmentManager
            val addfr=DialogAdd()
            addfr.show(sfm,"boh")
        }



    }


}
