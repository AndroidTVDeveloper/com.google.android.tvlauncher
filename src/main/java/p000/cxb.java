package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: cxb */
/* compiled from: PG */
final class cxb extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ cxe f7814a;

    public cxb(cxe cxe) {
        this.f7814a = cxe;
    }

    public final void onPageFinished(WebView webView, String str) {
        cxe cxe = this.f7814a;
        int i = cxe.f7827h;
        cxe.f7827h = 3;
        super.onPageFinished(webView, str);
        this.f7814a.f7820a.zoomBy(1.0f);
        if (i == 1) {
            cxe cxe2 = this.f7814a;
            cxe2.mo3885a(cxe2.f7830k);
        }
    }
}
