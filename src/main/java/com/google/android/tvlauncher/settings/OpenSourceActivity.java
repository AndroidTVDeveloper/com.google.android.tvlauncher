package com.google.android.tvlauncher.settings;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class OpenSourceActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView((int) R.layout.open_source_licenses);
            ((WebView) findViewById(R.id.content)).loadUrl("file:///android_asset/licenses.html");
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("WebView")) {
                throw e;
            }
            Log.e("OpenSourceActivity", "Failed to open WebView for open source text ", e);
            Toast.makeText(this, (int) R.string.failed_launch, 0).show();
            finish();
        }
    }
}
