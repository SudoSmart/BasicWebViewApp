package com.tosin.healthee.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.tosin.healthee.R;

public class ActivityWebPreview extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_preview);


        Intent intent = getIntent();
        String url = (String)intent.getSerializableExtra("URL");

        webview  = (WebView)findViewById(R.id.webactivity);
        WebSettings webSettings= webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(url);

        Log.d("Data", "onCreate: " + url);
    }
}
