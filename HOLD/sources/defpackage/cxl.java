package defpackage;

import android.content.Context;
import android.media.tv.TvContract;
import android.net.Uri;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: cxl  reason: default package */
/* compiled from: PG */
public final class cxl extends cxi {
    private final Context a;
    private final Deque b = new LinkedList();

    public cxl(Context context) {
        this.a = context.getApplicationContext();
    }

    public final int b(Uri uri) {
        return (TvContract.isChannelUri(uri) || cwz.a(uri) || cwz.b(uri)) ? 100 : 0;
    }

    public final cwi a(Uri uri) {
        cxn cxn = (cxn) this.b.pollFirst();
        if (cxn == null) {
            cxn = new cxn(this.a);
        }
        cwz cwz = new cwz(this.a, cxn);
        cwz.c = uri;
        cwz.d = cwz.c.getQueryParameter("input");
        if (TvContract.isChannelUri(uri)) {
            cwz.f = 1;
        } else if (cwz.a(uri)) {
            cwz.f = 2;
        } else if (cwz.b(uri)) {
            cwz.f = 3;
        }
        return cwz;
    }

    public final void a(cwi cwi) {
        if (cwi.a() != 1) {
            cwi.d();
        }
        if (this.b.size() < 2) {
            this.b.addFirst((cxn) cwi.f());
        }
    }
}
