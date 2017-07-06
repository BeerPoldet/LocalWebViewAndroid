package example.localwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/static/index.html");
        webView.addJavascriptInterface(new WebViewInterface(this), "androidInterface");

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
    }
}
