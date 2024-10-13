package com.example.labassignmnt02

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles:List<Article>): RecyclerView.Adapter<SchoolViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHolder {
        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.item_school,parent, false)
        return SchoolViewHolder(view)
    }

    override fun getItemCount(): Int {
         return articles.size
    }

    override fun onBindViewHolder(holder: SchoolViewHolder, position: Int) {
       val article=articles.get(position)
        holder.title.text=article.title
        holder.image.setImageResource(article.image)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ArticleDetailsActivity::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("image", article.image)
            intent.putExtra("date", article.date)
            intent.putExtra("details", article.details)
            holder.itemView.context.startActivity(intent)
        }
    }
}