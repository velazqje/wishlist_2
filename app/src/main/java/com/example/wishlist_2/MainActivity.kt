package com.example.wishlist_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

//        lateinit var wishlist: List<Item>
    lateinit var items: MutableList<Item>

//    private var inputtedItem = mutableListOf<Item>()

    private var inputtedItem = ArrayList<String>()



    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items = ArrayList()
        items.add(Item("A Game of Thrones", "www.testurl.jv", 10.49))
        items.add(Item( "A Clash of Kings", "www.testurl.jv", 11.92))
        items.add(Item("A Storm of Swords", "www.testurl.jv", 12.49))
        items.add(Item( "A Feast for Crows", "www.testurl.jv", 13.92))
        items.add(Item("A Dance with Dragons", "www.testurl.jv", 14.49))
        items.add(Item( "The Winds of Winter", "www.testurl.jv", 15.92))
        items.add(Item("A Dream of Spring", "www.testurl.jv", 16.49))
        items.add(Item( "The Hedge Knight", "www.testurl.jv", 17.92))
        items.add(Item("The Sworn Sword", "www.testurl.jv", 18.49))
//        items.add(Item( "The Mystery Knight", "www.testurl.jv", 19.92))
//        items.add(Item("The World of Ice & Fire", "www.testurl.jv", 20.49))


//
        val itemNameInput = findViewById<EditText>(R.id.itemNameInput)
        val itemURLInput = findViewById<EditText>(R.id.itemURLInput)
        val itemPriceInput = findViewById<EditText>(R.id.itemPriceInput)

        val adapter = ItemAdapter(items)

        findViewById<Button>(R.id.button).setOnClickListener {


//            val item = Item(itemNameInput.text.toString(), itemURLInput.text.toString(), itemPriceInput.text.toString().toDouble())

            items.add(Item(itemNameInput.text.toString(), itemURLInput.text.toString(), itemPriceInput.text.toString().toDouble()))

//            inputtedItem.add(item.toString())
            adapter.notifyDataSetChanged()

//
            findViewById<EditText>(R.id.itemNameInput).text.clear()
            findViewById<EditText>(R.id.itemURLInput).text.clear()
            findViewById<EditText>(R.id.itemPriceInput).text.clear()
//
        }

        // ...
        // Lookup the recyclerview in activity layout
        val itemsRv = findViewById<View>(R.id.itemsRv) as RecyclerView
        // Initialize contacts
//        items = Item.createContactsList(20)
        // Create adapter passing in the sample user data
        // Attach the adapter to the recyclerview to populate items
        itemsRv.adapter = adapter
        // Set layout manager to position the items
        itemsRv.layoutManager = LinearLayoutManager(this)


        // That's all!

    }
}