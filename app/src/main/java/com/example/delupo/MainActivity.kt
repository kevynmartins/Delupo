package com.example.delupo

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.delupo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val webView = binding.webView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.delupo.com.br/")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
    }
}