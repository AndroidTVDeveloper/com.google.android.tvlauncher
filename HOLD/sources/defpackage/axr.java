package defpackage;

import android.net.Uri;

/* renamed from: axr  reason: default package */
/* compiled from: PG */
public final class axr extends awc implements axm {
    private final Uri c;
    private final bhu d;
    private final aol e;
    private final anu f;
    private final bip g;
    private long h = -9223372036854775807L;
    private boolean i;
    private boolean j;
    private bjf k;

    public axr(Uri uri, bhu bhu, aol aol, anu anu, bip bip) {
        this.c = uri;
        this.d = bhu;
        this.e = aol;
        this.f = anu;
        this.g = bip;
    }

    /* access modifiers changed from: protected */
    public final void c() {
    }

    public final void d() {
    }

    public final aws a(awt awt, bhk bhk, long j2) {
        bjo b = ((bjp) this.d).a();
        bjf bjf = this.k;
        if (bjf != null) {
            b.a(bjf);
        }
        return new axq(this.c, b, this.e.a(), this.f, this.g, a(awt), this, bhk);
    }

    private final void b(long j2, boolean z, boolean z2) {
        this.h = j2;
        this.i = z;
        this.j = z2;
        a(new aya(j2, z, z2));
    }

    public final void a(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.h;
        }
        if (this.h != j2 || this.i != z || this.j != z2) {
            b(j2, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(bjf bjf) {
        this.k = bjf;
        b(this.h, this.i, this.j);
    }

    public final void a(aws aws) {
        axq axq = (axq) aws;
        if (axq.q) {
            for (axw j2 : axq.n) {
                j2.j();
            }
        }
        axq.g.a(axq);
        axq.j.removeCallbacksAndMessages(null);
        axq.k = null;
        axq.z = true;
        axq.c.b();
    }
}
