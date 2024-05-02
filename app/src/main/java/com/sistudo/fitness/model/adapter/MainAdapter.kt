package com.sistudo.fitness.model.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sistudo.fitness.R
import com.sistudo.fitness.databinding.MainItemBinding
import com.sistudo.fitness.model.Modules

class MainAdapter(
    private val context: Context,
    private val listModules: MutableList<Modules>
) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainViewHolder {
        val view = MainItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount()= listModules.size

    override fun onBindViewHolder(holder: MainAdapter.MainViewHolder, position: Int) {
        val module = listModules[position]
        holder.name.text = module.name
        holder.image.setImageResource(module.image ?: R.drawable.ico_default)
    }

    class MainViewHolder(binding: MainItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val name = binding.nameModule
        val image = binding.imgModule
    }


}
