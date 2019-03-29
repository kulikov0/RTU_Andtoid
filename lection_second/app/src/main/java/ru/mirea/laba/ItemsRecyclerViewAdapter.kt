package ru.mirea.laba

import android.annotation.SuppressLint
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_rv.view.*


class ItemsRecyclerViewAdapter(private val items: MutableList<Int>):
        RecyclerView.Adapter<ItemsRecyclerViewAdapter.ItemsViewHolder>() {

    fun addItems(items: List<Int>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun incrementItem() {
        this.items.add(items.size)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder =
            ItemsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) = holder.onBind(position)


    inner class ItemsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        @SuppressLint("SetTextI18n")
        fun onBind(position: Int) {
            itemView.apply {
                tv_item.text = "${position + 1}"
                if (position % 2 == 0) setBackgroundColor(ContextCompat.getColor(context, R.color.grey))
                else setBackgroundColor(ContextCompat.getColor(context, R.color.white))
                setOnClickListener { Toast.makeText(itemView.context, "Вы выбрали элемент #${position + 1}", Toast.LENGTH_SHORT).show() }
            }


        }

    }

}