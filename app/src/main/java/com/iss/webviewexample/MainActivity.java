package com.iss.webviewexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public static final String EXTERNAL_URL = "externalUrl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchBtn = findViewById(R.id.launchBtn);
        launchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String externalUrl =
                        "https://developer.android.com/guide/webapps/webview/";
                launchExternalPage(externalUrl);
            }
        });
    }

//    void launchExternalPage(String externalUrl) {
//        Intent intent = new Intent(
//                Intent.ACTION_VIEW, Uri.parse(externalUrl));
//        startActivity(intent);
//    }

    void launchExternalPage(String externalUrl) {
        Intent intent = new Intent(this, JustWebviewActivity.class);
        //        Intent intent = new Intent(MainActivity.this, WebviewActivity.class);
        intent.putExtra(EXTERNAL_URL, externalUrl);
        startActivity(intent);
    }
}

