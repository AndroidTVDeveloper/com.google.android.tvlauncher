package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: bcs */
/* compiled from: PG */
public final class bcs implements bcu {

    /* renamed from: a */
    private final biy f3318a;

    /* renamed from: b */
    private final int f3319b;

    /* renamed from: c */
    private final ayo[] f3320c;

    /* renamed from: d */
    private final bhv f3321d;

    /* renamed from: e */
    private bgl f3322e;

    /* renamed from: f */
    private bda f3323f;

    /* renamed from: g */
    private int f3324g;

    /* renamed from: h */
    private IOException f3325h;

    public bcs(biy biy, bda bda, int i, bgl bgl, bhv bhv) {
        aqp[] aqpArr;
        bda bda2 = bda;
        int i2 = i;
        bgl bgl2 = bgl;
        this.f3318a = biy;
        this.f3323f = bda2;
        this.f3319b = i2;
        this.f3322e = bgl2;
        this.f3321d = bhv;
        bcz bcz = bda2.f3372c[i2];
        this.f3320c = new ayo[bgl.mo1835f()];
        int i3 = 0;
        while (i3 < this.f3320c.length) {
            int b = bgl2.mo1830b(i3);
            akh akh = bcz.f3362c[b];
            if (akh.f559l != null) {
                aqpArr = bda2.f3371b.f3359c;
            } else {
                aqpArr = null;
            }
            aqp[] aqpArr2 = aqpArr;
            int i4 = bcz.f3360a;
            int i5 = i3;
            aqo aqo = r7;
            aqo aqo2 = new aqo(b, i4, bcz.f3361b, -9223372036854775807L, bda2.f3373d, akh, 0, aqpArr2, i4 == 2 ? 4 : 0, null, null);
            this.f3320c[i5] = new ayo(new aqg(3, aqo), bcz.f3360a, akh);
            i3 = i5 + 1;
        }
    }

    /* renamed from: a */
    public final void mo1639a(ayl ayl) {
    }

    /* renamed from: a */
    public final long mo1636a(long j, alb alb) {
        long j2;
        bcz bcz = this.f3323f.f3372c[this.f3319b];
        int a = bcz.mo1768a(j);
        long a2 = bcz.mo1769a(a);
        if (a2 >= j || a >= bcz.f3363d - 1) {
            j2 = a2;
        } else {
            j2 = bcz.mo1769a(a + 1);
        }
        return blm.m3633a(j, alb, a2, j2);
    }

    /* renamed from: a */
    public final void mo1638a(long j, long j2, List list, ayp ayp) {
        int i;
        long j3;
        boolean z;
        long j4 = j2;
        ayp ayp2 = ayp;
        if (this.f3325h == null) {
            bda bda = this.f3323f;
            bcz bcz = bda.f3372c[this.f3319b];
            if (bcz.f3363d == 0) {
                ayp2.f2791b = !bda.f3370a;
                return;
            }
            if (list.isEmpty()) {
                i = bcz.mo1768a(j4);
            } else {
                i = (int) (((ayx) list.get(list.size() - 1)).mo1641d() - ((long) this.f3324g));
                if (i < 0) {
                    this.f3325h = new awd();
                    return;
                }
            }
            if (i >= bcz.f3363d) {
                ayp2.f2791b = !this.f3323f.f3370a;
                return;
            }
            long j5 = j4 - j;
            bda bda2 = this.f3323f;
            if (bda2.f3370a) {
                bcz bcz2 = bda2.f3372c[this.f3319b];
                int i2 = bcz2.f3363d - 1;
                j3 = (bcz2.mo1769a(i2) + bcz2.mo1770b(i2)) - j;
            } else {
                j3 = -9223372036854775807L;
            }
            int f = this.f3322e.mo1835f();
            ayz[] ayzArr = new ayz[f];
            boolean z2 = false;
            for (int i3 = 0; i3 < f; i3++) {
                this.f3322e.mo1830b(i3);
                ayzArr[i3] = new ayj((byte) 0);
            }
            this.f3322e.mo1710a(j5, j3);
            long a = bcz.mo1769a(i);
            long b = a + bcz.mo1770b(i);
            long j6 = !list.isEmpty() ? -9223372036854775807L : j4;
            int i4 = this.f3324g + i;
            int a2 = this.f3322e.mo1709a();
            ayo ayo = this.f3320c[a2];
            int b2 = this.f3322e.mo1830b(a2);
            bks.m3512b(true);
            if (bcz.f3366g != null) {
                z = true;
            } else {
                z = false;
            }
            bks.m3512b(z);
            if (i < bcz.f3366g.size()) {
                z2 = true;
            }
            bks.m3512b(z2);
            String num = Integer.toString(bcz.f3362c[b2].f552e);
            String l = ((Long) bcz.f3366g.get(i)).toString();
            Uri a3 = blk.m3616a(bcz.f3364e, bcz.f3365f.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
            akh g = this.f3322e.mo1836g();
            bhv bhv = this.f3321d;
            int b3 = this.f3322e.mo1711b();
            Object c = this.f3322e.mo1712c();
            bhy bhy = r5;
            bhy bhy2 = new bhy(a3, 0, -1, null);
            ayp2.f2790a = new ayu(bhv, bhy, g, b3, c, a, b, j6, -9223372036854775807L, (long) i4, 1, a, ayo);
        }
    }

    /* renamed from: a */
    public final int mo1635a(long j, List list) {
        if (this.f3325h != null || this.f3322e.mo1835f() < 2) {
            return list.size();
        }
        return this.f3322e.mo1823a(j, list);
    }

    /* renamed from: a */
    public final void mo1637a() {
        IOException iOException = this.f3325h;
        if (iOException == null) {
            this.f3318a.mo1649a();
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public final boolean mo1640a(ayl ayl, boolean z, Exception exc, long j) {
        if (!z || j == -9223372036854775807L) {
            return false;
        }
        bgl bgl = this.f3322e;
        return bgl.mo1829a(bgl.mo1827a(ayl.f2769g), j);
    }

    /* renamed from: a */
    public final void mo1764a(bda bda) {
        bcz[] bczArr = this.f3323f.f3372c;
        int i = this.f3319b;
        bcz bcz = bczArr[i];
        int i2 = bcz.f3363d;
        bcz bcz2 = bda.f3372c[i];
        if (i2 == 0 || bcz2.f3363d == 0) {
            this.f3324g += i2;
        } else {
            int i3 = i2 - 1;
            long a = bcz.mo1769a(i3);
            long b = bcz.mo1770b(i3);
            long a2 = bcz2.mo1769a(0);
            if (a + b <= a2) {
                this.f3324g += i2;
            } else {
                this.f3324g += bcz.mo1768a(a2);
            }
        }
        this.f3323f = bda;
    }

    /* renamed from: a */
    public final void mo1765a(bgl bgl) {
        this.f3322e = bgl;
    }
}
