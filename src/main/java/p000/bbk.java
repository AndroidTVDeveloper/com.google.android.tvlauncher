package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: bbk */
/* compiled from: PG */
public final class bbk extends awc implements bcp {

    /* renamed from: c */
    public final bcq f3119c;

    /* renamed from: d */
    private final bbh f3120d;

    /* renamed from: e */
    private final Uri f3121e;

    /* renamed from: f */
    private final bbf f3122f;

    /* renamed from: g */
    private final awl f3123g;

    /* renamed from: h */
    private final anu f3124h;

    /* renamed from: i */
    private final bip f3125i;

    /* renamed from: j */
    private final int f3126j;

    /* renamed from: k */
    private bjf f3127k;

    static {
        akf.m726a("goog.exo.hls");
    }

    public /* synthetic */ bbk(Uri uri, bbf bbf, bbh bbh, awl awl, anu anu, bip bip, bcq bcq, int i) {
        this.f3121e = uri;
        this.f3122f = bbf;
        this.f3120d = bbh;
        this.f3123g = awl;
        this.f3124h = anu;
        this.f3125i = bip;
        this.f3119c = bcq;
        this.f3126j = i;
    }

    /* renamed from: a */
    public final aws mo1496a(awt awt, bhk bhk, long j) {
        return new bbj(this.f3120d, this.f3119c, this.f3122f, this.f3127k, this.f3124h, this.f3125i, mo1464a(awt), bhk, this.f3123g, this.f3126j);
    }

    /* renamed from: d */
    public final void mo1494d() {
        bcc bcc = (bcc) this.f3119c;
        bix bix = bcc.f3225g;
        if (bix != null) {
            bix.mo1649a();
        }
        Uri uri = bcc.f3229k;
        if (uri != null) {
            bcc.mo1759b(uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcq, biq] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1471a(bjf bjf) {
        boolean z;
        this.f3127k = bjf;
        axg a = mo1464a((awt) null);
        ? r0 = this.f3119c;
        Uri uri = this.f3121e;
        bcc bcc = r0;
        bcc.f3226h = new Handler();
        bcc.f3224f = a;
        bcc.f3227i = this;
        bja bja = new bja(bcc.f3219a.mo1703a(), uri, 4, new bck());
        if (bcc.f3225g == null) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        bcc.f3225g = new bix("DefaultHlsPlaylistTracker:MasterPlaylist");
        bcc.f3225g.mo1984a(bja, r0, bcc.f3220b.mo1973a(bja.f4105b));
        a.mo1533c(bja.f4105b);
    }

    /* renamed from: a */
    public final void mo1497a(aws aws) {
        bbj bbj = (bbj) aws;
        ((bcc) bbj.f3100a).f3222d.remove(bbj);
        for (bbs bbs : bbj.f3103d) {
            if (bbs.f3174l) {
                for (axw j : bbs.f3171i) {
                    j.mo1597j();
                }
            }
            bbs.f3166d.mo1986a(bbs);
            bbs.f3169g.removeCallbacksAndMessages(null);
            bbs.f3178p = true;
            bbs.f3170h.clear();
        }
        bbj.f3102c = null;
        bbj.f3101b.mo1526b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1474c() {
        bcc bcc = (bcc) this.f3119c;
        bcc.f3229k = null;
        bcc.f3230l = null;
        bcc.f3228j = null;
        bcc.f3232n = -9223372036854775807L;
        bcc.f3225g.mo1991f();
        bcc.f3225g = null;
        for (bcb bcb : bcc.f3221c.values()) {
            bcb.f3208a.mo1991f();
        }
        bcc.f3226h.removeCallbacksAndMessages(null);
        bcc.f3226h = null;
        bcc.f3221c.clear();
    }
}
