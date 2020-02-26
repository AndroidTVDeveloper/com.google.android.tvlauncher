package p000;

import android.util.SparseArray;

/* renamed from: ayo */
/* compiled from: PG */
public final class ayo implements aok {

    /* renamed from: a */
    public final aoi f2781a;

    /* renamed from: b */
    public aos f2782b;

    /* renamed from: c */
    public akh[] f2783c;

    /* renamed from: d */
    private final int f2784d;

    /* renamed from: e */
    private final akh f2785e;

    /* renamed from: f */
    private final SparseArray f2786f = new SparseArray();

    /* renamed from: g */
    private boolean f2787g;

    /* renamed from: h */
    private ayn f2788h;

    /* renamed from: i */
    private long f2789i;

    public ayo(aoi aoi, int i, akh akh) {
        this.f2781a = aoi;
        this.f2784d = i;
        this.f2785e = akh;
    }

    /* renamed from: S */
    public final void mo1210S() {
        akh[] akhArr = new akh[this.f2786f.size()];
        for (int i = 0; i < this.f2786f.size(); i++) {
            akhArr[i] = ((aym) this.f2786f.valueAt(i)).f2775a;
        }
        this.f2783c = akhArr;
    }

    /* renamed from: a */
    public final void mo1626a(ayn ayn, long j, long j2) {
        this.f2788h = ayn;
        this.f2789i = j2;
        if (this.f2787g) {
            aoi aoi = this.f2781a;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            aoi.mo1207a(0, j);
            for (int i = 0; i < this.f2786f.size(); i++) {
                ((aym) this.f2786f.valueAt(i)).mo1625a(ayn, j2);
            }
            return;
        }
        this.f2781a.mo1208a(this);
        if (j != -9223372036854775807L) {
            this.f2781a.mo1207a(0, j);
        }
        this.f2787g = true;
    }

    /* renamed from: a */
    public final void mo1212a(aos aos) {
        this.f2782b = aos;
    }

    /* renamed from: a */
    public final aov mo1211a(int i, int i2) {
        boolean z;
        akh akh;
        aym aym = (aym) this.f2786f.get(i);
        if (aym == null) {
            if (this.f2783c == null) {
                z = true;
            } else {
                z = false;
            }
            bks.m3512b(z);
            if (i2 == this.f2784d) {
                akh = this.f2785e;
            } else {
                akh = null;
            }
            aym = new aym(i2, akh);
            aym.mo1625a(this.f2788h, this.f2789i);
            this.f2786f.put(i, aym);
        }
        return aym;
    }
}
