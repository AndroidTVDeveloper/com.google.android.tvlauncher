package p000;

import java.util.ArrayList;

/* renamed from: bcv */
/* compiled from: PG */
final class bcv implements aws, axy {

    /* renamed from: a */
    public final axg f3326a;

    /* renamed from: b */
    public awr f3327b;

    /* renamed from: c */
    public bda f3328c;

    /* renamed from: d */
    public ays[] f3329d;

    /* renamed from: e */
    private final bct f3330e;

    /* renamed from: f */
    private final bjf f3331f;

    /* renamed from: g */
    private final biy f3332g;

    /* renamed from: h */
    private final anu f3333h;

    /* renamed from: i */
    private final bip f3334i;

    /* renamed from: j */
    private final bhk f3335j;

    /* renamed from: k */
    private final aye f3336k;

    /* renamed from: l */
    private final awl f3337l;

    /* renamed from: m */
    private axz f3338m;

    /* renamed from: n */
    private boolean f3339n;

    public bcv(bda bda, bct bct, bjf bjf, awl awl, anu anu, bip bip, axg axg, biy biy, bhk bhk) {
        this.f3328c = bda;
        this.f3330e = bct;
        this.f3331f = bjf;
        this.f3332g = biy;
        this.f3333h = anu;
        this.f3334i = bip;
        this.f3326a = axg;
        this.f3335j = bhk;
        this.f3337l = awl;
        ayc[] aycArr = new ayc[bda.f3372c.length];
        int i = 0;
        while (true) {
            bcz[] bczArr = bda.f3372c;
            if (i < bczArr.length) {
                akh[] akhArr = bczArr[i].f3362c;
                akh[] akhArr2 = new akh[akhArr.length];
                for (int i2 = 0; i2 < akhArr.length; i2++) {
                    akh akh = akhArr[i2];
                    if (akh.f559l != null) {
                        akh = akh.mo426b();
                    }
                    akhArr2[i2] = akh;
                }
                aycArr[i] = new ayc(akhArr2);
                i++;
            } else {
                this.f3336k = new aye(aycArr);
                ays[] aysArr = new ays[0];
                this.f3329d = aysArr;
                this.f3338m = awl.mo1495a(aysArr);
                axg.mo1517a();
                return;
            }
        }
    }

    /* renamed from: b */
    public final aye mo1485b() {
        return this.f3336k;
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        return this.f3338m.mo1487c(j);
    }

    /* renamed from: d */
    public final void mo1489d(long j) {
        for (ays d : this.f3329d) {
            d.mo1633d(j);
        }
    }

    /* renamed from: a */
    public final long mo1480a(long j, alb alb) {
        for (ays ays : this.f3329d) {
            if (ays.f2797a == 2) {
                return ays.mo1629a(j, alb);
            }
        }
        return j;
    }

    /* renamed from: d */
    public final long mo1488d() {
        return this.f3338m.mo1488d();
    }

    /* renamed from: e */
    public final long mo1490e() {
        return this.f3338m.mo1490e();
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f3338m.mo1491f();
    }

    /* renamed from: a */
    public final void mo1482a() {
        this.f3332g.mo1649a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo414a(axz axz) {
        this.f3327b.mo414a((axz) this);
    }

    /* renamed from: a */
    public final void mo1483a(awr awr, long j) {
        this.f3327b = awr;
        awr.mo412a((aws) this);
    }

    /* renamed from: c */
    public final long mo1486c() {
        if (this.f3339n) {
            return -9223372036854775807L;
        }
        this.f3326a.mo1532c();
        this.f3339n = true;
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
        this.f3338m.mo1492g(j);
    }

    /* renamed from: b */
    public final long mo1484b(long j) {
        for (ays b : this.f3329d) {
            b.mo1631b(j);
        }
        return j;
    }

    /* renamed from: a */
    public final long mo1481a(bgl[] bglArr, boolean[] zArr, axx[] axxArr, boolean[] zArr2, long j) {
        bgl bgl;
        bgl[] bglArr2 = bglArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bglArr2.length) {
            axx axx = axxArr[i];
            if (axx != null) {
                ays ays = (ays) axx;
                bgl bgl2 = bglArr2[i];
                if (bgl2 == null || !zArr[i]) {
                    ays.mo1632c();
                    axxArr[i] = null;
                } else {
                    ((bcu) ays.f2801e).mo1765a(bgl2);
                    arrayList.add(ays);
                }
            }
            if (axxArr[i] == null && (bgl = bglArr2[i]) != null) {
                int a = this.f3336k.mo1611a(bgl.mo1833e());
                bct bct = this.f3330e;
                biy biy = this.f3332g;
                bda bda = this.f3328c;
                bjf bjf = this.f3331f;
                bhv a2 = ((bcr) bct).f3317a.mo1949a();
                if (bjf != null) {
                    a2.mo1501a(bjf);
                }
                ays ays2 = r0;
                ays ays3 = new ays(this.f3328c.f3372c[a].f3360a, null, null, new bcs(biy, bda, a, bgl, a2), this, this.f3335j, j, this.f3333h, this.f3334i, this.f3326a);
                arrayList.add(ays2);
                axxArr[i] = ays2;
                zArr2[i] = true;
            }
            i++;
            bglArr2 = bglArr;
        }
        ays[] aysArr = new ays[arrayList.size()];
        this.f3329d = aysArr;
        arrayList.toArray(aysArr);
        this.f3338m = this.f3337l.mo1495a(this.f3329d);
        return j;
    }
}
