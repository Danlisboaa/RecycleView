package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Create Data Class
        //Create List from Data class type
        //Create Adapter
        //Set Adapter
        //Linear layout


        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
    }
}

val contacts = listOf(
    Contact(
        name = "Vanessa",
        phone = "(55)73 9894699",
        R.drawable.sample1
    ),
    Contact(
        name = "João",
        phone = "(55)80 97966979",
        R.drawable.sample2
    ),
    Contact(
        name = "Tereza",
        phone = "(55)11 8139699",
        R.drawable.sample3
    ),
    Contact(
        name = "Guilherme",
        phone = "(55)12 98996590",
        R.drawable.sample4
    ),
    Contact(
        name = "Maria",
        phone = "(55)66 9999492",
        R.drawable.sample5
    ),
    Contact(
        name = "Joaquina",
        phone = "(55)62 97936990",
        R.drawable.sample6
    ),
    Contact(
        name = "Loli",
        phone = "(55)45 97791991",
        R.drawable.sample7
    ),
    Contact(
        name = "Augusto",
        phone = "(55)27 97199698",
        R.drawable.sample8
    )


)
