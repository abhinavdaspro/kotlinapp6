package com.example.kotlinapp6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview=findViewById<TextView>(R.id.textView1)
        val ch1=findViewById<CheckBox>(R.id.check1)
        val ch2=findViewById<CheckBox>(R.id.check2)
        val ch3=findViewById<CheckBox>(R.id.check3)

        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        ch3.setOnClickListener(this)

    }
    fun toast(message: String){
        Toast.makeText(applicationContext,message+" will be of new PM",Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.check1 ->{val s:String=findViewById<CheckBox>(R.id.check1).text.toString()
               if(check1.isChecked) toast(s)
           }
           R.id.check2 ->{ val s:String=findViewById<CheckBox>(R.id.check2).text.toString()

               if(check2.isChecked)toast(s)
           }
           R.id.check3 ->{ val s:String=findViewById<CheckBox>(R.id.check3).text.toString()
               if(check3.isChecked)toast(s)}
       }

}
}
