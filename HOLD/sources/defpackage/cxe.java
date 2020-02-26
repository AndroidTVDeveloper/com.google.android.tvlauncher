package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cxe  reason: default package */
/* compiled from: PG */
public final class cxe implements cwi {
    private static final byte[] l = new byte[1024];
    private static String m;
    public final WebView a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public cwh i;
    public int j = 1;
    public boolean k;
    private Context n;
    private Handler o = new Handler();

    public final int a() {
        return this.j;
    }

    public final Uri b() {
        return this.b;
    }

    public final int e() {
        return 0;
    }

    public final View f() {
        return this.a;
    }

    public cxe(Context context) {
        this.n = context;
        if (m == null) {
            String str = null;
            try {
                InputStream open = context.getAssets().open("youtube_template.html");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    for (int read = open.read(l); read >= 0; read = open.read(l)) {
                        byteArrayOutputStream.write(l, 0, read);
                    }
                    open.close();
                    str = byteArrayOutputStream.toString();
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                dhr.a(e3);
            }
            m = str;
        }
        if (m != null) {
            this.h = 0;
            WebView webView = new WebView(this.n);
            this.a = webView;
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setAllowFileAccess(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setCacheMode(1);
            settings.setAppCacheEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            this.a.setVerticalScrollBarEnabled(false);
            this.a.setHorizontalScrollBarEnabled(false);
            this.a.setOnTouchListener(new cxa());
            return;
        }
        throw new IllegalStateException("Failed to read youtube html template");
    }

    public final void a(String str) {
        this.a.evaluateJavascript(str, null);
    }

    @JavascriptInterface
    public void onJsPlayerChangeState(int i2) {
        this.o.post(new cxc(this, i2));
    }

    @JavascriptInterface
    public void onJsPlayerError(int i2) {
        this.o.post(new cxd(this));
    }

    public final void c() {
        this.j = 2;
        this.f = true;
        this.g = false;
        if (this.h == 0) {
            this.a.addJavascriptInterface(this, "Android");
            this.a.loadDataWithBaseURL("", m.replace("<video_id>", this.c).replace("<display_width>", Integer.toString(this.d)).replace("<display_height>", Integer.toString(this.e)), "text/html", "UTF-8", null);
            this.a.setInitialScale(100);
            this.h = 1;
            this.a.setWebViewClient(new cxb(this));
            return;
        }
        this.a.setInitialScale(100);
    }

    public final void a(int i2, int i3) {
        this.d = i2;
        this.e = i3;
        if (this.j == 3) {
            WebView webView = this.a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("player.setSize(");
            sb.append(i2);
            sb.append(",");
            sb.append(i3);
            sb.append(");");
            webView.evaluateJavascript(sb.toString(), null);
            this.f = true;
            return;
        }
        this.f = false;
    }

    public final void a(boolean z) {
        this.k = z;
        if (this.h != 3) {
            return;
        }
        if (!z) {
            a("player.pauseVideo();");
        } else {
            a("player.playVideo();");
        }
    }

    public final void a(cwh cwh) {
        this.i = cwh;
    }

    public final void a(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("player.setVolume(");
        sb.append((int) (f2 * 100.0f));
        sb.append(");");
        a(sb.toString());
    }

    public final void d() {
        int i2 = this.h;
        if (i2 == 1) {
            this.h = 2;
        } else if (i2 == 3) {
            a("player.seekTo(0, false);player.pauseVideo();");
            this.j = 1;
        }
    }
}
