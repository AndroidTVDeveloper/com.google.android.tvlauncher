package defpackage;

/* renamed from: axi  reason: default package */
/* compiled from: PG */
final /* synthetic */ class axi implements Runnable {
    private final axq a;

    public axi(axq axq) {
        this.a = axq;
    }

    public final void run() {
        int i;
        boolean z;
        boolean[] zArr;
        int i2;
        atw atw;
        axq axq = this.a;
        aos aos = axq.l;
        if (!axq.z && !axq.q && axq.p && aos != null) {
            axw[] axwArr = axq.n;
            int length = axwArr.length;
            char c = 0;
            int i3 = 0;
            while (i3 < length) {
                if (axwArr[i3].g() != null) {
                    i3++;
                    c = 0;
                } else {
                    return;
                }
            }
            axq.h.d();
            int length2 = axq.n.length;
            ayc[] aycArr = new ayc[length2];
            boolean[] zArr2 = new boolean[length2];
            axq.u = aos.b();
            int i4 = 0;
            while (i4 < length2) {
                akh g = axq.n[i4].g();
                String str = g.i;
                boolean a2 = bkt.a(str);
                if (a2 || bkt.b(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr2[i4] = z;
                axq.s = z | axq.s;
                aul aul = axq.m;
                if (aul == null) {
                    zArr = zArr2;
                } else {
                    if (a2 || axq.o[i4].a) {
                        atw atw2 = g.g;
                        if (atw2 == null) {
                            atv[] atvArr = new atv[1];
                            atvArr[c] = aul;
                            atw = new atw(atvArr);
                        } else {
                            atv[] atvArr2 = new atv[1];
                            atvArr2[c] = aul;
                            atw = atw2.a(atvArr2);
                        }
                        g = g.a(atw);
                    }
                    if (!a2) {
                        zArr = zArr2;
                    } else if (g.e != -1 || (i2 = aul.a) == -1) {
                        zArr = zArr2;
                    } else {
                        zArr = zArr2;
                        long j = g.m;
                        int i5 = g.n;
                        int i6 = g.o;
                        float f = g.p;
                        int i7 = g.q;
                        float f2 = g.r;
                        byte[] bArr = g.t;
                        int i8 = g.s;
                        blp blp = g.u;
                        int i9 = g.v;
                        int i10 = g.w;
                        int i11 = g.x;
                        int i12 = g.y;
                        int i13 = g.z;
                        String str2 = g.A;
                        int i14 = g.B;
                        Class cls = g.C;
                        g = new akh(g.a, g.b, g.c, g.d, i2, g.f, g.g, g.h, g.i, g.j, g.k, g.l, j, i5, i6, f, i7, f2, bArr, i8, blp, i9, i10, i11, i12, i13, str2, i14);
                    }
                }
                aycArr[i4] = new ayc(g);
                i4++;
                zArr2 = zArr;
                c = 0;
            }
            boolean[] zArr3 = zArr2;
            boolean z2 = false;
            if (axq.v == -1 && aos.b() == -9223372036854775807L) {
                z2 = true;
            }
            axq.w = z2;
            if (!z2) {
                i = 1;
            } else {
                i = 7;
            }
            axq.t = i;
            axq.r = new axn(aos, new aye(aycArr), zArr3);
            axq.q = true;
            axq.d.a(axq.u, aos.d(), axq.w);
            ((awr) bks.a(axq.k)).a((aws) axq);
        }
    }
}
