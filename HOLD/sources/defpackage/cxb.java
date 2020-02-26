package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: cxb  reason: default package */
/* compiled from: PG */
final class cxb extends WebViewClient {
    private final /* synthetic */ cxe a;

    public cxb(cxe cxe) {
        this.a = cxe;
    }

    public final void onPageFinished(WebView webView, String str) {
        cxe cxe = this.a;
        int i = cxe.h;
        cxe.h = 3;
        super.onPageFinished(webView, str);
        this.a.a.zoomBy(1.0f);
        if (i == 1) {
            cxe cxe2 = this.a;
            cxe2.a(cxe2.k);
        }
    }
}
