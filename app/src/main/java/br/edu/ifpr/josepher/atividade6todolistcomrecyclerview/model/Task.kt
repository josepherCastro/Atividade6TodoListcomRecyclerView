package br.edu.ifpr.josepher.atividade6todolistcomrecyclerview.model

data class Task(var title: String, var description: String, var status: Boolean) {
    companion object{
        fun example(): MutableList<Task>{
            return mutableListOf(
                Task("Termina isso!", "Essa atividade esta te deixando irritado, pois é a segunda vez que tu esta fazendo a mesma coisa", true)
            )
        }
    }
}