package dev.andrericardo.aprendendo_recyclerview_com_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmeAdapter: FilmeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.filmeAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {

        this.filmeAdapter = FilmeAdapter()
        rv_filmes.layoutManager = LinearLayoutManager(this@MainActivity)
        rv_filmes.adapter = this.filmeAdapter

    }
}