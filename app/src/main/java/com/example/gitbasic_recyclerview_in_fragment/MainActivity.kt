package com.example.gitbasic_recyclerview_in_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    val fragment = fragmetn1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tran = supportFragmentManager.beginTransaction()
        tran.replace(R.id.container, fragment)

        tran.commit()
    }
}