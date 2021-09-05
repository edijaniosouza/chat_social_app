package br.com.edijanio.chatapp

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.adapters.RecyclerAdapterPosts
import br.com.edijanio.chatapp.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapterPosts: RecyclerView.Adapter<RecyclerAdapterPosts.ViewHolder>
    private lateinit var firebase : FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        layoutManager = LinearLayoutManager(this)

        rv_posts.layoutManager = layoutManager
        adapterPosts = RecyclerAdapterPosts()
        rv_posts.adapter = adapterPosts

        firebase = Firebase.firestore


        clickListeners(binding)
    }

    fun clickListeners(binding: ActivityMainBinding) {

        binding.fab.setOnClickListener {
            startActivity(Intent(this, NewPostActivity::class.java))
        }

        binding.ivNotifications.setOnClickListener {
            Toast.makeText(this, "clicou em notificações", Toast.LENGTH_LONG).show()

            //TODO: Criar pagina de notificações

            /*firebase.collection("users").document("DkNlvnmm29gIAy6s7Om6")
                .get()
                .addOnSuccessListener {

                    Log.d(TAG, "Documento: ${it.data?.get("born")}")
                }
                .addOnFailureListener {
                    Log.w(TAG, "Error getting documents.", it)
                }*/
        }

        binding.ivMessages.setOnClickListener {
            Toast.makeText(this, "clicou em mensagens", Toast.LENGTH_LONG).show()

            /*
            val user = hashMapOf(
                "first" to "Edijanio",
                "last" to "Barros",
                "born" to 1998
            )

            firebase.collection("users").add(user).addOnSuccessListener {
                Log.d(TAG, "Documento inserido com ID: ${it.id}")
            }.addOnFailureListener {
                Log.w(TAG, "Erro ao adicionar documento", it)
            }*/
            //TODO: Criar pagina de mensagens
        }

        binding.ivProfile.setOnClickListener {
            Toast.makeText(this, "clicou em perfil", Toast.LENGTH_LONG).show()

            //TODO: Criar pagina de perfis
        }

    }


}