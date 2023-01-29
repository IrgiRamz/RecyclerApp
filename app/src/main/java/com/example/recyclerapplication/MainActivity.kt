package com.example.recyclerapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerapplication.detail_food.Companion.EXTRA_detail

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods:RecyclerView
    private var list:ArrayList<Foods> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)
        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecycleList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.menu_list->{
                title = "Mode List"
                showRecycleList()
            }
            R.id.menu_grid->{
                title = "Mode Grid"
                showRecycleGrid()
            }

            R.id.menu_card->{
                title = "Mode Card"
                showRecycleCard()
            }
        }
    }


    private fun showRecycleList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodsAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodsAdapter

        listFoodsAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data : Foods) {
                val itemMakanan = Foods (
                    data.photo,
                    data.name,
                    data.detail
                        )
                val intent = Intent(this@MainActivity, detail_food::class.java)
                intent.putExtra(EXTRA_detail, itemMakanan)
                startActivity(intent)
                showSelectedFood(data)
            }
        })
    }

    private fun showRecycleGrid() {
        rvFoods.layoutManager = GridLayoutManager(this,2)
        val gridFoodsAdapter = GridFoodAdapter(list)
        rvFoods.adapter = gridFoodsAdapter

        gridFoodsAdapter.setOnItemClickCallback(object : GridFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Foods) {
                val itemMakanan = Foods (
                    data.photo,
                    data.name,
                    data.detail
                )
                val intent = Intent(this@MainActivity, detail_food::class.java)
                intent.putExtra(EXTRA_detail, itemMakanan)
                startActivity(intent)
                showSelectedFood(data)
            }
        })
    }

    private fun showRecycleCard() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val cardFoodsAdapter = CardFoodAdapter(list)
        rvFoods.adapter = cardFoodsAdapter

        cardFoodsAdapter.setOnItemClickCallback(object : CardFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Foods) {
                val itemMakanan = Foods (
                    data.photo,
                    data.name,
                    data.detail
                )
                val intent = Intent(this@MainActivity, detail_food::class.java)
                intent.putExtra(EXTRA_detail, itemMakanan)
                startActivity(intent)
                showSelectedFood(data)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedFood(food: Foods) {
        Toast.makeText(this, "You Choose " + food.name, Toast.LENGTH_SHORT).show()
    }

}