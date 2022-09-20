package com.example.wishlist_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
//class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ItemAdapter (private val mItems: MutableList<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row

//        val itemNameInput = itemView.findViewById<EditText>(R.id.itemNameInput)
//        val itemURLInput = itemView.findViewById<EditText>(R.id.itemURLInput)
//        val itemPriceInput = itemView.findViewById<EditText>(R.id.itemPriceInput)


        val itemName = itemView.findViewById<TextView>(R.id.itemName)
        val itemURL = itemView.findViewById<TextView>(R.id.itemURL)
        val itemPrice = itemView.findViewById<TextView>(R.id.itemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.item_layout, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)    }

    override fun onBindViewHolder(viewHolder: ItemAdapter.ViewHolder, position: Int) {
        // Get the data model based on position

        val itemList = mItems[position]
        viewHolder.itemName.text = itemList.itemName
        viewHolder.itemURL.text = itemList.itemURL
        viewHolder.itemPrice.text = itemList.itemPrice.toString()
//
//        viewHolder.itemNameInput.text = itemList.itemName
//        viewHolder.itemURLInput.text = itemList.itemURL
//        viewHolder.itemPriceInput.text = itemList.itemPrice




//        val itemName: Item = mItems.get(position)
//        // Set item views based on your views and data model
//        val nameTv = viewHolder.itemName
//        nameTv.setText(itemName.itemName)
//
//        val itemURL: Item = mItems.get(position)
//        // Set item views based on your views and data model
//        val urlTv = viewHolder.itemURL
//        urlTv.setText(itemName.itemURL)
//
//        val itemPrice: Item = mItems.get(position)
//        // Set item views based on your views and data model
//        val priceTv = viewHolder.itemPrice
//        priceTv.setText(itemName.itemPrice.toString())

    }

    override fun getItemCount(): Int {
        return mItems.size
    }
}

private fun TextView.setText(itemPrice: Number) {

}
