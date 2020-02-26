package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: bbk  reason: default package */
/* compiled from: PG */
public final class bbk extends awc implements bcp {
    public final bcq c;
    private final bbh d;
    private final Uri e;
    private final bbf f;
    private final awl g;
    private final anu h;
    private final bip i;
    private final int j;
    private bjf k;

    static {
        akf.a("goog.exo.hls");
    }

    public /* synthetic */ bbk(Uri uri, bbf bbf, bbh bbh, awl awl, anu anu, bip bip, bcq bcq, int i2) {
        this.e = uri;
        this.f = bbf;
        this.d = bbh;
        this.g = awl;
        this.h = anu;
        this.i = bip;
        this.c = bcq;
        this.j = i2;
    }

    public final aws a(awt awt, bhk bhk, long j2) {
        return new bbj(this.d, this.c, this.f, this.k, this.h, this.i, a(awt), bhk, this.g, this.j);
    }

    public final void d() {
        bcc bcc = (bcc) this.c;
        bix bix = bcc.g;
        if (bix != null) {
            bix.a();
        }
        Uri uri = bcc.k;
        if (uri != null) {
            bcc.b(uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcq, biq] */
    /* access modifiers changed from: protected */
    public final void a(bjf bjf) {
        boolean z;
        this.k = bjf;
        axg a = a((awt) null);
        ? r0 = this.c;
        Uri uri = this.e;
        bcc bcc = r0;
        bcc.h = new Handler();
        bcc.f = a;
        bcc.i = this;
        bja bja = new bja(bcc.a.a(), uri, 4, new bck());
        if (bcc.g == null) {
            z = true;
        } else {
            z = false;
        }
        bks.b(z);
        bcc.g = new bix("DefaultHlsPlaylistTracker:MasterPlaylist");
        bcc.g.a(bja, r0, bcc.b.a(bja.b));
        a.c(bja.b);
    }

    public final void a(aws aws) {
        bbj bbj = (bbj) aws;
        ((bcc) bbj.a).d.remove(bbj);
        for (bbs bbs : bbj.d) {
            if (bbs.l) {
                for (axw j2 : bbs.i) {
                    j2.j();
                }
            }
            bbs.d.a(bbs);
            bbs.g.removeCallbacksAndMessages(null);
            bbs.p = true;
            bbs.h.clear();
        }
        bbj.c = null;
        bbj.b.b();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        bcc bcc = (bcc) this.c;
        bcc.k = null;
        bcc.l = null;
        bcc.j = null;
        bcc.n = -9223372036854775807L;
        bcc.g.f();
        bcc.g = null;
        for (bcb bcb : bcc.c.values()) {
            bcb.a.f();
        }
        bcc.h.removeCallbacksAndMessages(null);
        bcc.h = null;
        bcc.c.clear();
    }
}
