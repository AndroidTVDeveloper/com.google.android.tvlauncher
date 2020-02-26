package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: bcs  reason: default package */
/* compiled from: PG */
public final class bcs implements bcu {
    private final biy a;
    private final int b;
    private final ayo[] c;
    private final bhv d;
    private bgl e;
    private bda f;
    private int g;
    private IOException h;

    public bcs(biy biy, bda bda, int i, bgl bgl, bhv bhv) {
        aqp[] aqpArr;
        bda bda2 = bda;
        int i2 = i;
        bgl bgl2 = bgl;
        this.a = biy;
        this.f = bda2;
        this.b = i2;
        this.e = bgl2;
        this.d = bhv;
        bcz bcz = bda2.c[i2];
        this.c = new ayo[bgl.f()];
        int i3 = 0;
        while (i3 < this.c.length) {
            int b2 = bgl2.b(i3);
            akh akh = bcz.c[b2];
            if (akh.l != null) {
                aqpArr = bda2.b.c;
            } else {
                aqpArr = null;
            }
            aqp[] aqpArr2 = aqpArr;
            int i4 = bcz.a;
            int i5 = i3;
            aqo aqo = r7;
            aqo aqo2 = new aqo(b2, i4, bcz.b, -9223372036854775807L, bda2.d, akh, 0, aqpArr2, i4 == 2 ? 4 : 0, null, null);
            this.c[i5] = new ayo(new aqg(3, aqo), bcz.a, akh);
            i3 = i5 + 1;
        }
    }

    public final void a(ayl ayl) {
    }

    public final long a(long j, alb alb) {
        long j2;
        bcz bcz = this.f.c[this.b];
        int a2 = bcz.a(j);
        long a3 = bcz.a(a2);
        if (a3 >= j || a2 >= bcz.d - 1) {
            j2 = a3;
        } else {
            j2 = bcz.a(a2 + 1);
        }
        return blm.a(j, alb, a3, j2);
    }

    public final void a(long j, long j2, List list, ayp ayp) {
        int i;
        long j3;
        boolean z;
        long j4 = j2;
        ayp ayp2 = ayp;
        if (this.h == null) {
            bda bda = this.f;
            bcz bcz = bda.c[this.b];
            if (bcz.d == 0) {
                ayp2.b = !bda.a;
                return;
            }
            if (list.isEmpty()) {
                i = bcz.a(j4);
            } else {
                i = (int) (((ayx) list.get(list.size() - 1)).d() - ((long) this.g));
                if (i < 0) {
                    this.h = new awd();
                    return;
                }
            }
            if (i >= bcz.d) {
                ayp2.b = !this.f.a;
                return;
            }
            long j5 = j4 - j;
            bda bda2 = this.f;
            if (bda2.a) {
                bcz bcz2 = bda2.c[this.b];
                int i2 = bcz2.d - 1;
                j3 = (bcz2.a(i2) + bcz2.b(i2)) - j;
            } else {
                j3 = -9223372036854775807L;
            }
            int f2 = this.e.f();
            ayz[] ayzArr = new ayz[f2];
            boolean z2 = false;
            for (int i3 = 0; i3 < f2; i3++) {
                this.e.b(i3);
                ayzArr[i3] = new ayj((byte) 0);
            }
            this.e.a(j5, j3);
            long a2 = bcz.a(i);
            long b2 = a2 + bcz.b(i);
            long j6 = !list.isEmpty() ? -9223372036854775807L : j4;
            int i4 = this.g + i;
            int a3 = this.e.a();
            ayo ayo = this.c[a3];
            int b3 = this.e.b(a3);
            bks.b(true);
            if (bcz.g != null) {
                z = true;
            } else {
                z = false;
            }
            bks.b(z);
            if (i < bcz.g.size()) {
                z2 = true;
            }
            bks.b(z2);
            String num = Integer.toString(bcz.c[b3].e);
            String l = ((Long) bcz.g.get(i)).toString();
            Uri a4 = blk.a(bcz.e, bcz.f.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
            akh g2 = this.e.g();
            bhv bhv = this.d;
            int b4 = this.e.b();
            Object c2 = this.e.c();
            bhy bhy = r5;
            bhy bhy2 = new bhy(a4, 0, -1, null);
            ayp2.a = new ayu(bhv, bhy, g2, b4, c2, a2, b2, j6, -9223372036854775807L, (long) i4, 1, a2, ayo);
        }
    }

    public final int a(long j, List list) {
        if (this.h != null || this.e.f() < 2) {
            return list.size();
        }
        return this.e.a(j, list);
    }

    public final void a() {
        IOException iOException = this.h;
        if (iOException == null) {
            this.a.a();
            return;
        }
        throw iOException;
    }

    public final boolean a(ayl ayl, boolean z, Exception exc, long j) {
        if (!z || j == -9223372036854775807L) {
            return false;
        }
        bgl bgl = this.e;
        return bgl.a(bgl.a(ayl.g), j);
    }

    public final void a(bda bda) {
        bcz[] bczArr = this.f.c;
        int i = this.b;
        bcz bcz = bczArr[i];
        int i2 = bcz.d;
        bcz bcz2 = bda.c[i];
        if (i2 == 0 || bcz2.d == 0) {
            this.g += i2;
        } else {
            int i3 = i2 - 1;
            long a2 = bcz.a(i3);
            long b2 = bcz.b(i3);
            long a3 = bcz2.a(0);
            if (a2 + b2 <= a3) {
                this.g += i2;
            } else {
                this.g += bcz.a(a3);
            }
        }
        this.f = bda;
    }

    public final void a(bgl bgl) {
        this.e = bgl;
    }
}
