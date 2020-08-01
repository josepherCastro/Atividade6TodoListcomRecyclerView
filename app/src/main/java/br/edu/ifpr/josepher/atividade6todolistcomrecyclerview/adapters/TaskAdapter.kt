package br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.R
import br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.model.Task
import kotlinx.android.synthetic.main.one_task.view.*

class TaskAdapter(): RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    val task = Task.example()

    fun add(oneTask: Task){
        task.add(oneTask)
        notifyItemInserted(itemCount)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun fillView(task: Task){
            itemView.tvTitle.text = task.title
            itemView.tvDescription.text = task.description
            itemView.tvStatus.text = if(!task.status) "Não feita" else "Feita"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.one_task, parent, false))

    override fun getItemCount()= task.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val oneTask = task[position]
        holder.fillView(oneTask)
    }
}