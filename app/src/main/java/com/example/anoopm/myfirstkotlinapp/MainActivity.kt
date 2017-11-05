package com.example.anoopm.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myArray = intArrayOf(10,20,30,40)
        println(myArray[0])

        myArray[0] = 45

        println(myArray[0])

        // Tutorial 2:16
        // for

        for (i in myArray.indices){

            println(myArray[i])
        }
        // Set

        val myCustomSet = HashSet<String>()

        myCustomSet.add("Hello")
        myCustomSet.add("Hello")

        println(myCustomSet.size)

        // Map

        // Similar to Dictionaries
        // It wont accept duplicate keys, butr doesnt give any crash
        val hashMap = HashMap<String, String>()

        hashMap.put("name","Don")
        hashMap.put("name","Don")

        println(hashMap.entries.size)
    }

    fun change (view: View){

        imageView3.setImageResource(R.drawable.dead2)
    }

    fun changeText (view: View){

        textView.text = "Hello Changed Text"
    }

    fun sum (a: Int, b: Int) :Int{

        return a + b
    }

    fun save(view: View){
        prepareStudentData()
    }

    fun prepareStudentData(){

        val student1 = Student(nameText.text.toString(),Integer.parseInt(ageText.text.toString()),gradeText.text.toString(),"11-05-1986","12-08-2016")

        textView.text = student1.name + " " + student1.age.toString() + " " + student1.grade
    }


}
