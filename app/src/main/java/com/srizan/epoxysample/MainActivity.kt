package com.srizan.epoxysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.airbnb.epoxy.EpoxyRecyclerView
import com.srizan.epoxysample.entity.CarouselItem
import com.srizan.epoxysample.entity.Task
import com.srizan.epoxysample.epoxy.TaskController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = TaskController(
            onTaskExecutorItemClick = {
                Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            },
            onTaskItemClick = {
                Log.d("asd", "onCreate: $it")

                val a = Datasource.taskList[it].copy(isSelected = Datasource.taskList[it].isSelected.not())

                Datasource.taskList[it] = a


            }
        )
        findViewById<EpoxyRecyclerView>(R.id.rvTask).adapter = controller.adapter
        controller.requestModelBuild()
    }
}





