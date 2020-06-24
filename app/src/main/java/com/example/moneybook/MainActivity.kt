package com.example.moneybook


import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_element.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        add.setOnClickListener(){
            val sfm = supportFragmentManager
            val addfr=DialogAdd()
            addfr.show(sfm,"boh")

        }
        val elist= listx(200)
        recycle.adapter=ItemAdapter(elist)
        recycle.layoutManager= LinearLayoutManager(this)
        recycle.setHasFixedSize(true)
    }
fun listx(size: Int): List<ItemCardData> {
    val lista = ArrayList<ItemCardData>()

        for(i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.vertical_line

                else -> R.drawable.vertical_line
            }


            val item = ItemCardData(drawable, "Banca", "spesa", "10.00")
            lista += item

        }
            return lista


        }



}
