package br.com.edijanio.chatapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.adapters.RecyclerAdapterPosts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapterPosts: RecyclerView.Adapter<RecyclerAdapterPosts.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        rv_posts.layoutManager = layoutManager
        adapterPosts = RecyclerAdapterPosts()
        rv_posts.adapter = adapterPosts

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener {onClickFab(this)}

        val notification : View = findViewById(R.id.iv_notifications)
        notification.setOnClickListener{onClickNotification(this)}
        val message : View = findViewById(R.id.iv_messages)
        message.setOnClickListener{onClickMessage(this)}
        val profile : View = findViewById(R.id.iv_profile)
        profile.setOnClickListener{onClickProfile(this)}
    }


    private fun onClickFab (context: Context){
        Toast.makeText(context, "clicou no float buttom", Toast.LENGTH_LONG).show()

        //TODO: Criar pagina de nova postagem
    }

    private fun onClickNotification (context: Context){
        Toast.makeText(context, "clicou em notificações", Toast.LENGTH_LONG).show()

        //TODO: Criar pagina de notificações
    }

    private fun onClickMessage (context: Context){
        Toast.makeText(context, "clicou em mensagens", Toast.LENGTH_LONG).show()

        //TODO: Criar pagina de mensagens
    }

    private fun onClickProfile (context: Context){
        Toast.makeText(context, "clicou em perfil", Toast.LENGTH_LONG).show()

        //TODO: Criar pagina de perfis
    }


}