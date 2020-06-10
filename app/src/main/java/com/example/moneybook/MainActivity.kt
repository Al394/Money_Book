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


        fun lista(size: Int): List<ItemCardData> {
            val list = ArrayList<ItemCardData>()
            for (i in 0 until size) {
                val drawable = when (i % 3) {
                    0 -> R.drawable.vertical_line
                   else -> R.drawable.vertical_line
                }
                val item = ItemCardData(drawable, "Casa", "Line 2","20",1)
                list += item
            }
            return list
        }
    lista(50)

    }


}
