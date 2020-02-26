package p000;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: bja */
/* compiled from: PG */
public final class bja implements bit {

    /* renamed from: a */
    public final bhy f4104a;

    /* renamed from: b */
    public final int f4105b;

    /* renamed from: c */
    public volatile Object f4106c;

    /* renamed from: d */
    private final bjd f4107d;

    /* renamed from: e */
    private final biz f4108e;

    public bja(bhv bhv, Uri uri, int i, biz biz) {
        bhy bhy = new bhy(uri);
        this.f4107d = new bjd(bhv);
        this.f4104a = bhy;
        this.f4105b = i;
        this.f4108e = biz;
    }

    /* renamed from: a */
    public final void mo1538a() {
    }

    /* renamed from: b */
    public final void mo1540b() {
        bjd bjd = this.f4107d;
        bjd.f4115a = 0;
        bhx bhx = new bhx(bjd, this.f4104a);
        try {
            bhx.mo1950a();
            this.f4106c = this.f4108e.mo1648a((Uri) bks.m3507a(this.f4107d.mo1500a()), bhx);
        } finally {
            blm.m3645a((Closeable) bhx);
        }
    }
}
