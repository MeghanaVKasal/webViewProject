package com.maucassignments.meghana.webviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebView webHandler=(WebView)findViewById(R.id.website);
        webHandler.loadUrl("https://www.google.com");

        Button b1=(Button)findViewById(R.id.bWeb1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webHandler.loadUrl("https://www.google.com");
            }
        });

        Button b2=(Button)findViewById(R.id.bWeb2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webHandler.loadUrl("https://developer.android.com/guide/webapps/webview");
            }
        });

        Button b3=(Button)findViewById(R.id.bWeb3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webHandler.loadUrl("https://www.geeksforgeeks.org/");
            }
        });
    }
}
