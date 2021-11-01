package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpWebView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setUpWebView() {
        web_view.webViewClient = WebViewClient()
        web_view.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }
}