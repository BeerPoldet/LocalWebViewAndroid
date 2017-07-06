package example.localwebview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Poldet on 7/6/2017.
 */

public class WebViewInterface {
    private Context context;

    WebViewInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void formDidSubmitted(String firstName, String lastName) {
        Toast.makeText(context, "Hello " + firstName + " " + lastName, Toast.LENGTH_LONG).show();
    }
}
