package br.edu.ifpr.josepher.atividade6todolistcomrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.adapters.TaskAdapter
import br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.model.Task
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = TaskAdapter()
        listTask.adapter = adapter
        listTask.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        btAdd.setOnClickListener{
            val task = Task(
                etTitle.text.toString(),
                etDescription.text.toString(),
                false
            )
            val position = adapter.add(task)
        }
    }
}