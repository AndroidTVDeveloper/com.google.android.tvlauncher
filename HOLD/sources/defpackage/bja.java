package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: bja  reason: default package */
/* compiled from: PG */
public final class bja implements bit {
    public final bhy a;
    public final int b;
    public volatile Object c;
    private final bjd d;
    private final biz e;

    public bja(bhv bhv, Uri uri, int i, biz biz) {
        bhy bhy = new bhy(uri);
        this.d = new bjd(bhv);
        this.a = bhy;
        this.b = i;
        this.e = biz;
    }

    public final void a() {
    }

    public final void b() {
        bjd bjd = this.d;
        bjd.a = 0;
        bhx bhx = new bhx(bjd, this.a);
        try {
            bhx.a();
            this.c = this.e.a((Uri) bks.a(this.d.a()), bhx);
        } finally {
            blm.a((Closeable) bhx);
        }
    }
}
