package br.com.edijanio.chatapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.MainActivity
import br.com.edijanio.chatapp.PostActivity
import br.com.edijanio.chatapp.R

class RecyclerAdapterPosts : RecyclerView.Adapter<RecyclerAdapterPosts.ViewHolder>() {

    private var categories = arrayOf("Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5", "Categoria 6", "Categoria 7", "Categoria 8", "Categoria 9", "Categoria 10")
    private var names = arrayOf("Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5", "Nome 6", "Nome 7", "Nome 8", "Nome 9", "Nome 10")
    private var posts = arrayOf("Portagem 1", "Postagem 2", "Postagem 3", "Postagem 4", "Postagem 5", "Postagem 6", "Postagem 7", "Postagem 8", "Postagem 9", "Postagem 10")
    private var images = arrayOf(
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image,
        R.drawable.category_image
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_post_preview, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemCategory.text = categories[position]
        holder.itemImage.setImageResource(images[position])
        holder.itemName.text = names[position]
        holder.itemPost.text = posts[position]

    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemCategory: TextView
        var itemName: TextView
        var itemPost : TextView

        init{

            itemImage = itemView.findViewById(R.id.imageSubject)
            itemCategory = itemView.findViewById(R.id.tv_name)
            itemName = itemView.findViewById(R.id.tv_name)
            itemPost = itemView.findViewById(R.id.tv_post)

            itemView.setOnClickListener{
                val position: Int = bindingAdapterPosition

                Toast.makeText(itemView.context, "clicou em ${names[position]}", Toast.LENGTH_LONG).show()

                val postReading = Intent(itemView.context, PostActivity::class.java)
                itemView.context.startActivity(postReading)

            }
        }
    }


}