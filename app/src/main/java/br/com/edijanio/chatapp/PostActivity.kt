package br.com.edijanio.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edijanio.chatapp.adapters.RecyclerAdapterComments
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapterComments: RecyclerView.Adapter<RecyclerAdapterComments.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        layoutManager = LinearLayoutManager(this)
        rv_comments.layoutManager = layoutManager
        adapterComments = RecyclerAdapterComments()
        rv_comments.adapter = adapterComments
    }


}