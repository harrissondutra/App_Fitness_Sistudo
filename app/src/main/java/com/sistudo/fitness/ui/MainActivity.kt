package com.sistudo.fitness.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.sistudo.fitness.R
import com.sistudo.fitness.databinding.ActivityMainBinding
import com.sistudo.fitness.model.Modules
import com.sistudo.fitness.model.adapter.MainAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var listModules: MutableList<Modules> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.mainRecycler
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val adapter = MainAdapter(this, listModules)
        recyclerView.adapter = adapter

        getModules()


    }

    private fun getModules() {
        listModules.add(Modules("Exercícios", R.drawable.ico_default))
        listModules.add(Modules("Alimentação", R.drawable.ico_default))
        listModules.add(Modules("Medidas", R.drawable.ico_default))
        listModules.add(Modules("Histórico", R.drawable.ico_default))
    }
}