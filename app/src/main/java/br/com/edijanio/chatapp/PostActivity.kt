package br.com.edijanio.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.adapters.RecyclerAdapterComments
import br.com.edijanio.chatapp.databinding.ActivityPostBinding
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {

    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapterComments: RecyclerView.Adapter<RecyclerAdapterComments.ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        layoutManager = LinearLayoutManager(this)
        rv_comments.layoutManager = layoutManager
        adapterComments = RecyclerAdapterComments()
        rv_comments.adapter = adapterComments

        clickListeners(binding)
    }

    private fun clickListeners(binding: ActivityPostBinding) {
        binding.fabAddComment.setOnClickListener{
            Toast.makeText(this, "Clicked at Float action button", Toast.LENGTH_LONG).show()
        }
    }


}