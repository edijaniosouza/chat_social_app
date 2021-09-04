package br.com.edijanio.chatapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.R

class RecyclerAdapterComments : RecyclerView.Adapter<RecyclerAdapterComments.ViewHolder>() {

    private var names = arrayOf("Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5", "Nome 6", "Nome 7", "Nome 8", "Nome 9", "Nome 10")
    private var posts = arrayOf("Portagem 1", "Postagem 2", "Postagem 3", "Postagem 4", "Postagem 5", "Postagem 6", "Postagem 7", "Postagem 8", "Postagem 9", "Postagem 10")
    private var images = arrayOf(
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24,
        R.drawable.ic_account_circle_24
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapterComments.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_comments_preview, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapterComments.ViewHolder, position: Int) {
        holder.itemImageProfile.setImageResource(images[position])
        holder.itemName.text = names[position]
        holder.itemComment.text = posts[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImageProfile: ImageView
        var itemName: TextView
        var itemComment : TextView

        init{
            itemImageProfile = itemView.findViewById(R.id.iv_comments_profile)
            itemName = itemView.findViewById(R.id.tv_comments_name)
            itemComment = itemView.findViewById(R.id.tv_comments_on_post)

            itemView.setOnClickListener{
                val position: Int = bindingAdapterPosition

                Toast.makeText(itemView.context, "clicou em ${names[position]}", Toast.LENGTH_LONG).show()

                //TODO: Criar reação de postagem e responder comentario
            }
        }
    }
}