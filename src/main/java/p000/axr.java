package p000;

import android.net.Uri;

/* renamed from: axr */
/* compiled from: PG */
public final class axr extends awc implements axm {

    /* renamed from: c */
    private final Uri f2679c;

    /* renamed from: d */
    private final bhu f2680d;

    /* renamed from: e */
    private final aol f2681e;

    /* renamed from: f */
    private final anu f2682f;

    /* renamed from: g */
    private final bip f2683g;

    /* renamed from: h */
    private long f2684h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f2685i;

    /* renamed from: j */
    private boolean f2686j;

    /* renamed from: k */
    private bjf f2687k;

    public axr(Uri uri, bhu bhu, aol aol, anu anu, bip bip) {
        this.f2679c = uri;
        this.f2680d = bhu;
        this.f2681e = aol;
        this.f2682f = anu;
        this.f2683g = bip;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1474c() {
    }

    /* renamed from: d */
    public final void mo1494d() {
    }

    /* renamed from: a */
    public final aws mo1496a(awt awt, bhk bhk, long j) {
        bjo b = ((bjp) this.f2680d).mo1949a();
        bjf bjf = this.f2687k;
        if (bjf != null) {
            b.mo1501a(bjf);
        }
        return new axq(this.f2679c, b, this.f2681e.mo1201a(), this.f2682f, this.f2683g, mo1464a(awt), this, bhk);
    }

    /* renamed from: b */
    private final void m2360b(long j, boolean z, boolean z2) {
        this.f2684h = j;
        this.f2685i = z;
        this.f2686j = z2;
        mo1466a(new aya(j, z, z2));
    }

    /* renamed from: a */
    public final void mo1542a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f2684h;
        }
        if (this.f2684h != j || this.f2685i != z || this.f2686j != z2) {
            m2360b(j, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1471a(bjf bjf) {
        this.f2687k = bjf;
        m2360b(this.f2684h, this.f2685i, this.f2686j);
    }

    /* renamed from: a */
    public final void mo1497a(aws aws) {
        axq axq = (axq) aws;
        if (axq.f2669q) {
            for (axw j : axq.f2666n) {
                j.mo1597j();
            }
        }
        axq.f2659g.mo1986a(axq);
        axq.f2662j.removeCallbacksAndMessages(null);
        axq.f2663k = null;
        axq.f2678z = true;
        axq.f2655c.mo1526b();
    }
}
