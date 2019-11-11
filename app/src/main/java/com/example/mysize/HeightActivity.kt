package com.example.mysize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HeightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height)
    }
    override fun onResume() {
        super.onResume()

        spinner.onItemSelectedListener =
            object : AdapterView.OnItemSlectedListener{
                override fun OnItemSlected(
                    parent:adapterView<*>?,
                    view: view?,
                    position: Int,
                    id: Long
                ){
                    val spinner = parent as? Spinner
                    val item = spinner?.selectedItem as? string
                    Item?.let{
                        if(it.isNotEmpty()) height.text = it
                    }
                }
                override fun onNothingSelected(AdapterView<*>){
                    //何もしない
                }
            }
    }




}
