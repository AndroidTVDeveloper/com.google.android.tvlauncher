package p000;

import android.util.SparseArray;

/* renamed from: arx */
/* compiled from: PG */
final class arx {

    /* renamed from: a */
    public final aov f2107a;

    /* renamed from: b */
    public final boolean f2108b;

    /* renamed from: c */
    public final boolean f2109c;

    /* renamed from: d */
    public final SparseArray f2110d = new SparseArray();

    /* renamed from: e */
    public final SparseArray f2111e = new SparseArray();

    /* renamed from: f */
    public final bkz f2112f = new bkz(this.f2113g, 0, 0);

    /* renamed from: g */
    public byte[] f2113g = new byte[128];

    /* renamed from: h */
    public int f2114h;

    /* renamed from: i */
    public int f2115i;

    /* renamed from: j */
    public long f2116j;

    /* renamed from: k */
    public boolean f2117k;

    /* renamed from: l */
    public long f2118l;

    /* renamed from: m */
    public arw f2119m = new arw((byte) 0);

    /* renamed from: n */
    public arw f2120n = new arw((byte) 0);

    /* renamed from: o */
    public boolean f2121o;

    /* renamed from: p */
    public long f2122p;

    /* renamed from: q */
    public long f2123q;

    /* renamed from: r */
    public boolean f2124r;

    public arx(aov aov, boolean z, boolean z2) {
        this.f2107a = aov;
        this.f2108b = z;
        this.f2109c = z2;
        mo1291a();
    }

    /* renamed from: a */
    public final void mo1292a(bku bku) {
        this.f2111e.append(bku.f4234a, bku);
    }

    /* renamed from: a */
    public final void mo1293a(bkv bkv) {
        this.f2110d.append(bkv.f4240d, bkv);
    }

    /* renamed from: a */
    public final void mo1291a() {
        this.f2117k = false;
        this.f2121o = false;
        this.f2120n.mo1290a();
    }
}
