package p000;

import android.content.Context;
import android.media.tv.TvContract;
import android.net.Uri;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: cxl */
/* compiled from: PG */
public final class cxl extends cxi {

    /* renamed from: a */
    private final Context f7842a;

    /* renamed from: b */
    private final Deque f7843b = new LinkedList();

    public cxl(Context context) {
        this.f7842a = context.getApplicationContext();
    }

    /* renamed from: b */
    public final int mo3934b(Uri uri) {
        return (TvContract.isChannelUri(uri) || cwz.m5862a(uri) || cwz.m5864b(uri)) ? 100 : 0;
    }

    /* renamed from: a */
    public final cwi mo3932a(Uri uri) {
        cxn cxn = (cxn) this.f7843b.pollFirst();
        if (cxn == null) {
            cxn = new cxn(this.f7842a);
        }
        cwz cwz = new cwz(this.f7842a, cxn);
        cwz.f7804c = uri;
        cwz.f7805d = cwz.f7804c.getQueryParameter("input");
        if (TvContract.isChannelUri(uri)) {
            cwz.f7807f = 1;
        } else if (cwz.m5862a(uri)) {
            cwz.f7807f = 2;
        } else if (cwz.m5864b(uri)) {
            cwz.f7807f = 3;
        }
        return cwz;
    }

    /* renamed from: a */
    public final void mo3933a(cwi cwi) {
        if (cwi.mo3881a() != 1) {
            cwi.mo3888d();
        }
        if (this.f7843b.size() < 2) {
            this.f7843b.addFirst((cxn) cwi.mo3890f());
        }
    }
}
