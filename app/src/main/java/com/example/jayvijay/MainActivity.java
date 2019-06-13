package com.example.jayvijay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.web_view);

        wv.loadUrl("http://jaivijaybookcentre.com/jaivijay");
        wv.setWebViewClient(new WebViewClient());
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebChromeClient(new WebChromeClient());

    }

    public void onBackPressed() {

        if (wv.canGoBack()) {
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

