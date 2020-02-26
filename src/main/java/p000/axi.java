package p000;

/* renamed from: axi */
/* compiled from: PG */
final /* synthetic */ class axi implements Runnable {

    /* renamed from: a */
    private final axq f2612a;

    public axi(axq axq) {
        this.f2612a = axq;
    }

    public final void run() {
        int i;
        boolean z;
        boolean[] zArr;
        int i2;
        atw atw;
        axq axq = this.f2612a;
        aos aos = axq.f2664l;
        if (!axq.f2678z && !axq.f2669q && axq.f2668p && aos != null) {
            axw[] axwArr = axq.f2666n;
            int length = axwArr.length;
            char c = 0;
            int i3 = 0;
            while (i3 < length) {
                if (axwArr[i3].mo1594g() != null) {
                    i3++;
                    c = 0;
                } else {
                    return;
                }
            }
            axq.f2660h.mo2036d();
            int length2 = axq.f2666n.length;
            ayc[] aycArr = new ayc[length2];
            boolean[] zArr2 = new boolean[length2];
            axq.f2673u = aos.mo1175b();
            int i4 = 0;
            while (i4 < length2) {
                akh g = axq.f2666n[i4].mo1594g();
                String str = g.f556i;
                boolean a = bkt.m3515a(str);
                if (a || bkt.m3516b(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr2[i4] = z;
                axq.f2671s = z | axq.f2671s;
                aul aul = axq.f2665m;
                if (aul == null) {
                    zArr = zArr2;
                } else {
                    if (a || axq.f2667o[i4].f2637a) {
                        atw atw2 = g.f554g;
                        if (atw2 == null) {
                            atv[] atvArr = new atv[1];
                            atvArr[c] = aul;
                            atw = new atw(atvArr);
                        } else {
                            atv[] atvArr2 = new atv[1];
                            atvArr2[c] = aul;
                            atw = atw2.mo1347a(atvArr2);
                        }
                        g = g.mo425a(atw);
                    }
                    if (!a) {
                        zArr = zArr2;
                    } else if (g.f552e != -1 || (i2 = aul.f2448a) == -1) {
                        zArr = zArr2;
                    } else {
                        zArr = zArr2;
                        long j = g.f560m;
                        int i5 = g.f561n;
                        int i6 = g.f562o;
                        float f = g.f563p;
                        int i7 = g.f564q;
                        float f2 = g.f565r;
                        byte[] bArr = g.f567t;
                        int i8 = g.f566s;
                        blp blp = g.f568u;
                        int i9 = g.f569v;
                        int i10 = g.f570w;
                        int i11 = g.f571x;
                        int i12 = g.f572y;
                        int i13 = g.f573z;
                        String str2 = g.f544A;
                        int i14 = g.f545B;
                        Class cls = g.f546C;
                        g = new akh(g.f548a, g.f549b, g.f550c, g.f551d, i2, g.f553f, g.f554g, g.f555h, g.f556i, g.f557j, g.f558k, g.f559l, j, i5, i6, f, i7, f2, bArr, i8, blp, i9, i10, i11, i12, i13, str2, i14);
                    }
                }
                aycArr[i4] = new ayc(g);
                i4++;
                zArr2 = zArr;
                c = 0;
            }
            boolean[] zArr3 = zArr2;
            boolean z2 = false;
            if (axq.f2674v == -1 && aos.mo1175b() == -9223372036854775807L) {
                z2 = true;
            }
            axq.f2675w = z2;
            if (!z2) {
                i = 1;
            } else {
                i = 7;
            }
            axq.f2672t = i;
            axq.f2670r = new axn(aos, new aye(aycArr), zArr3);
            axq.f2669q = true;
            axq.f2656d.mo1542a(axq.f2673u, aos.mo1177d(), axq.f2675w);
            ((awr) bks.m3507a(axq.f2663k)).mo412a((aws) axq);
        }
    }
}
