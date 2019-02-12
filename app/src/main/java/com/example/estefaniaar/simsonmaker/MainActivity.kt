package com.example.estefaniaar.simsonmaker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSimpson(view: View)
    {
        val simpson = Simpson(name.text.toString(),Integer.parseInt(age.text.toString()),job.text.toString())
        textView.text="Name: "+simpson.name + " Age: "+simpson.age + " Job: "+simpson.job
    }
}
