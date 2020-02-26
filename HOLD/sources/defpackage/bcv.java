package defpackage;

import java.util.ArrayList;

/* renamed from: bcv  reason: default package */
/* compiled from: PG */
final class bcv implements aws, axy {
    public final axg a;
    public awr b;
    public bda c;
    public ays[] d;
    private final bct e;
    private final bjf f;
    private final biy g;
    private final anu h;
    private final bip i;
    private final bhk j;
    private final aye k;
    private final awl l;
    private axz m;
    private boolean n;

    public bcv(bda bda, bct bct, bjf bjf, awl awl, anu anu, bip bip, axg axg, biy biy, bhk bhk) {
        this.c = bda;
        this.e = bct;
        this.f = bjf;
        this.g = biy;
        this.h = anu;
        this.i = bip;
        this.a = axg;
        this.j = bhk;
        this.l = awl;
        ayc[] aycArr = new ayc[bda.c.length];
        int i2 = 0;
        while (true) {
            bcz[] bczArr = bda.c;
            if (i2 < bczArr.length) {
                akh[] akhArr = bczArr[i2].c;
                akh[] akhArr2 = new akh[akhArr.length];
                for (int i3 = 0; i3 < akhArr.length; i3++) {
                    akh akh = akhArr[i3];
                    if (akh.l != null) {
                        akh = akh.b();
                    }
                    akhArr2[i3] = akh;
                }
                aycArr[i2] = new ayc(akhArr2);
                i2++;
            } else {
                this.k = new aye(aycArr);
                ays[] aysArr = new ays[0];
                this.d = aysArr;
                this.m = awl.a(aysArr);
                axg.a();
                return;
            }
        }
    }

    public final aye b() {
        return this.k;
    }

    public final boolean c(long j2) {
        return this.m.c(j2);
    }

    public final void d(long j2) {
        for (ays d2 : this.d) {
            d2.d(j2);
        }
    }

    public final long a(long j2, alb alb) {
        for (ays ays : this.d) {
            if (ays.a == 2) {
                return ays.a(j2, alb);
            }
        }
        return j2;
    }

    public final long d() {
        return this.m.d();
    }

    public final long e() {
        return this.m.e();
    }

    public final boolean f() {
        return this.m.f();
    }

    public final void a() {
        this.g.a();
    }

    public final /* bridge */ /* synthetic */ void a(axz axz) {
        this.b.a((axz) this);
    }

    public final void a(awr awr, long j2) {
        this.b = awr;
        awr.a((aws) this);
    }

    public final long c() {
        if (this.n) {
            return -9223372036854775807L;
        }
        this.a.c();
        this.n = true;
        return -9223372036854775807L;
    }

    public final void g(long j2) {
        this.m.g(j2);
    }

    public final long b(long j2) {
        for (ays b2 : this.d) {
            b2.b(j2);
        }
        return j2;
    }

    public final long a(bgl[] bglArr, boolean[] zArr, axx[] axxArr, boolean[] zArr2, long j2) {
        bgl bgl;
        bgl[] bglArr2 = bglArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < bglArr2.length) {
            axx axx = axxArr[i2];
            if (axx != null) {
                ays ays = (ays) axx;
                bgl bgl2 = bglArr2[i2];
                if (bgl2 == null || !zArr[i2]) {
                    ays.c();
                    axxArr[i2] = null;
                } else {
                    ((bcu) ays.e).a(bgl2);
                    arrayList.add(ays);
                }
            }
            if (axxArr[i2] == null && (bgl = bglArr2[i2]) != null) {
                int a2 = this.k.a(bgl.e());
                bct bct = this.e;
                biy biy = this.g;
                bda bda = this.c;
                bjf bjf = this.f;
                bhv a3 = ((bcr) bct).a.a();
                if (bjf != null) {
                    a3.a(bjf);
                }
                ays ays2 = r0;
                ays ays3 = new ays(this.c.c[a2].a, null, null, new bcs(biy, bda, a2, bgl, a3), this, this.j, j2, this.h, this.i, this.a);
                arrayList.add(ays2);
                axxArr[i2] = ays2;
                zArr2[i2] = true;
            }
            i2++;
            bglArr2 = bglArr;
        }
        ays[] aysArr = new ays[arrayList.size()];
        this.d = aysArr;
        arrayList.toArray(aysArr);
        this.m = this.l.a(this.d);
        return j2;
    }
}
