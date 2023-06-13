package com.jake5113.cocktailwebapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wv: WebView = findViewById(R.id.wv)

        wv.settings.javaScriptEnabled = true

        wv.webViewClient = WebViewClient()
        wv.webChromeClient = WebChromeClient()

        wv.loadUrl("http://mrhicock.dothome.co.kr/")
    }
}