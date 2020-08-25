package com.example.moneybook

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_add_item.*
import kotlinx.android.synthetic.main.dialog_add_item.view.*

class DialogAdd : DialogFragment() {

    var Tipo = String
    val Descrizione = String
    val soldi = String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView:View=inflater.inflate(R.layout.dialog_add_item,container,false)
        var cancella= rootView.cancella
        var conferma = rootView.conferma

        cancella.setOnClickListener(){dismiss()}

        conferma.setOnClickListener() {

            val Tipo: String = tipo.text.toString()
            val Desc: String = descrizione.text.toString()
            val soldi : String = saldo.text.toString()
        }
        return rootView
    }






}