package proyecto.which;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Shooting_Range extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooting_range);


        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://www.movilzona.es/category/moviles/");

    }
}
