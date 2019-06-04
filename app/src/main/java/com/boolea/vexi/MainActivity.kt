package com.boolea.vexi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadWebView()
    }

    fun loadWebView() {

        webview.settings.javaScriptEnabled = true
        webview.loadUrl("https://vexi.mx/")
        //Define WebViewClient() para poder leer eventos que ocurren durante el cargado de contenido en el WebView.
        webview.setWebViewClient(object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                //elimina ProgressBar.
            }
        })
    }
}
