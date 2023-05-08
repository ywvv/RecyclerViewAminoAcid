package com.example.recyclerviewaminoacid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AminoAcidAdapter(
    private val aminoAcidList: List<AminoAcidModal>
) : RecyclerView.Adapter<AminoAcidAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.textView)
        val tv3Letter: TextView = view.findViewById(R.id.textView2)
        val tv1Letter: TextView = view.findViewById(R.id.textView3)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = aminoAcidList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = aminoAcidList[position].aminoAcidName
        holder.tv3Letter.text = aminoAcidList[position].aminoAcidAbbreviation
        holder.tv1Letter.text = aminoAcidList[position].aminoAcidAbbreviationSmall
        holder.imageView.setImageResource(aminoAcidList[position].image)
    }
}