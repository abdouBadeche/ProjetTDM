package com.example.quoran.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quoran.data.Verset
import com.example.quoran.databinding.RowLayoutBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var oldData = emptyList<Verset>()

    class MyViewHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RowLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.ageTextView.text = oldData[position].id.toString()
        holder.binding.firstNameTextView.text = oldData[position].text_ar
        holder.binding.lastNameTextView.text = oldData[position].text_ar
    }

    override fun getItemCount(): Int {
        return oldData.size
    }

    fun setData(newData: List<Verset>){
        oldData = newData
        notifyDataSetChanged()
    }

}
