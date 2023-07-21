package com.example.najmus.webtoapp;
/*====================================
    Author : JUNDY TEMPEST
======================================*/

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
   private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature ( Window.FEATURE_NO_TITLE );//for full screen
        getWindow ().setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_main );
        mywebView =(WebView)findViewById ( R.id.webView );
        WebSettings webSettings = mywebView.getSettings ();
        webSettings.setJavaScriptEnabled ( true );
        mywebView.loadUrl ( "https://fusiontempest.speedtestcustom.com" );
        mywebView.setWebViewClient ( new WebViewClient () );//prevents our url to open in another browser

    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack ()){
            mywebView.goBack ();
        }else{
            super.onBackPressed ();

        }

    }
}
