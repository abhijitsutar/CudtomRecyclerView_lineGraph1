package com.bold.customrecyclerview_3_assignment_graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var lineGraphView : LineGraphView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()

        lineGraphView.values = arrayOf(40, 90, 35, 70, 25, 60)

    }
    private fun initData(){
        setContentView(R.layout.activity_main)
        lineGraphView = findViewById(R.id.lineGraphView)
    }
}