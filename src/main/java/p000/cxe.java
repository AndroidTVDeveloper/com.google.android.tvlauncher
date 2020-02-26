package p000;

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

/* renamed from: cxe */
/* compiled from: PG */
public final class cxe implements cwi {

    /* renamed from: l */
    private static final byte[] f7818l = new byte[1024];

    /* renamed from: m */
    private static String f7819m;

    /* renamed from: a */
    public final WebView f7820a;

    /* renamed from: b */
    public Uri f7821b;

    /* renamed from: c */
    public String f7822c;

    /* renamed from: d */
    public int f7823d;

    /* renamed from: e */
    public int f7824e;

    /* renamed from: f */
    public boolean f7825f;

    /* renamed from: g */
    public boolean f7826g;

    /* renamed from: h */
    public int f7827h;

    /* renamed from: i */
    public cwh f7828i;

    /* renamed from: j */
    public int f7829j = 1;

    /* renamed from: k */
    public boolean f7830k;

    /* renamed from: n */
    private Context f7831n;

    /* renamed from: o */
    private Handler f7832o = new Handler();

    /* renamed from: a */
    public final int mo3881a() {
        return this.f7829j;
    }

    /* renamed from: b */
    public final Uri mo3886b() {
        return this.f7821b;
    }

    /* renamed from: e */
    public final int mo3889e() {
        return 0;
    }

    /* renamed from: f */
    public final View mo3890f() {
        return this.f7820a;
    }

    public cxe(Context context) {
        this.f7831n = context;
        if (f7819m == null) {
            String str = null;
            try {
                InputStream open = context.getAssets().open("youtube_template.html");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    for (int read = open.read(f7818l); read >= 0; read = open.read(f7818l)) {
                        byteArrayOutputStream.write(f7818l, 0, read);
                    }
                    open.close();
                    str = byteArrayOutputStream.toString();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                dhr.m6454a(e2);
            }
            f7819m = str;
        }
        if (f7819m != null) {
            this.f7827h = 0;
            WebView webView = new WebView(this.f7831n);
            this.f7820a = webView;
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
            this.f7820a.setVerticalScrollBarEnabled(false);
            this.f7820a.setHorizontalScrollBarEnabled(false);
            this.f7820a.setOnTouchListener(new cxa());
            return;
        }
        throw new IllegalStateException("Failed to read youtube html template");
    }

    /* renamed from: a */
    public final void mo3925a(String str) {
        this.f7820a.evaluateJavascript(str, null);
    }

    @JavascriptInterface
    public void onJsPlayerChangeState(int i) {
        this.f7832o.post(new cxc(this, i));
    }

    @JavascriptInterface
    public void onJsPlayerError(int i) {
        this.f7832o.post(new cxd(this));
    }

    /* renamed from: c */
    public final void mo3887c() {
        this.f7829j = 2;
        this.f7825f = true;
        this.f7826g = false;
        if (this.f7827h == 0) {
            this.f7820a.addJavascriptInterface(this, "Android");
            this.f7820a.loadDataWithBaseURL("", f7819m.replace("<video_id>", this.f7822c).replace("<display_width>", Integer.toString(this.f7823d)).replace("<display_height>", Integer.toString(this.f7824e)), "text/html", "UTF-8", null);
            this.f7820a.setInitialScale(100);
            this.f7827h = 1;
            this.f7820a.setWebViewClient(new cxb(this));
            return;
        }
        this.f7820a.setInitialScale(100);
    }

    /* renamed from: a */
    public final void mo3883a(int i, int i2) {
        this.f7823d = i;
        this.f7824e = i2;
        if (this.f7829j == 3) {
            WebView webView = this.f7820a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("player.setSize(");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(");");
            webView.evaluateJavascript(sb.toString(), null);
            this.f7825f = true;
            return;
        }
        this.f7825f = false;
    }

    /* renamed from: a */
    public final void mo3885a(boolean z) {
        this.f7830k = z;
        if (this.f7827h != 3) {
            return;
        }
        if (!z) {
            mo3925a("player.pauseVideo();");
        } else {
            mo3925a("player.playVideo();");
        }
    }

    /* renamed from: a */
    public final void mo3884a(cwh cwh) {
        this.f7828i = cwh;
    }

    /* renamed from: a */
    public final void mo3882a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("player.setVolume(");
        sb.append((int) (f * 100.0f));
        sb.append(");");
        mo3925a(sb.toString());
    }

    /* renamed from: d */
    public final void mo3888d() {
        int i = this.f7827h;
        if (i == 1) {
            this.f7827h = 2;
        } else if (i == 3) {
            mo3925a("player.seekTo(0, false);player.pauseVideo();");
            this.f7829j = 1;
        }
    }
}
