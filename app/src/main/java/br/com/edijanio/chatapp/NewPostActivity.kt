package br.com.edijanio.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.edijanio.chatapp.databinding.ActivityNewPostBinding

class NewPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNewPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}