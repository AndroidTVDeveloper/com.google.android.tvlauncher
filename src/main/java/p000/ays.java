package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ays */
/* compiled from: PG */
public final class ays implements axx, axz, biq, biu {

    /* renamed from: a */
    public final int f2797a;

    /* renamed from: b */
    public final int[] f2798b;

    /* renamed from: c */
    public final akh[] f2799c;

    /* renamed from: d */
    public final boolean[] f2800d;

    /* renamed from: e */
    public final ayt f2801e;

    /* renamed from: f */
    public final axg f2802f;

    /* renamed from: g */
    public final axw[] f2803g;

    /* renamed from: h */
    public long f2804h;

    /* renamed from: i */
    public long f2805i;

    /* renamed from: j */
    public boolean f2806j;

    /* renamed from: k */
    private final axy f2807k;

    /* renamed from: l */
    private final bip f2808l;

    /* renamed from: m */
    private final bix f2809m = new bix("Loader:ChunkSampleStream");

    /* renamed from: n */
    private final ayp f2810n = new ayp();

    /* renamed from: o */
    private final ArrayList f2811o;

    /* renamed from: p */
    private final List f2812p;

    /* renamed from: q */
    private final axw f2813q;

    /* renamed from: r */
    private final ayk f2814r;

    /* renamed from: s */
    private akh f2815s;

    /* renamed from: t */
    private ayr f2816t;

    /* renamed from: u */
    private long f2817u;

    /* renamed from: v */
    private int f2818v;

    public ays(int i, int[] iArr, akh[] akhArr, ayt ayt, axy axy, bhk bhk, long j, anu anu, bip bip, axg axg) {
        int i2;
        this.f2797a = i;
        this.f2798b = iArr;
        this.f2799c = akhArr;
        this.f2801e = ayt;
        this.f2807k = axy;
        this.f2802f = axg;
        this.f2808l = bip;
        ArrayList arrayList = new ArrayList();
        this.f2811o = arrayList;
        this.f2812p = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        if (iArr != null) {
            i2 = iArr.length;
        } else {
            i2 = 0;
        }
        this.f2803g = new axw[i2];
        this.f2800d = new boolean[i2];
        int i4 = i2 + 1;
        int[] iArr2 = new int[i4];
        axw[] axwArr = new axw[i4];
        axw axw = new axw(bhk, anu);
        this.f2813q = axw;
        iArr2[0] = i;
        axwArr[0] = axw;
        while (i3 < i2) {
            axw axw2 = new axw(bhk, anu.f1453a);
            this.f2803g[i3] = axw2;
            int i5 = i3 + 1;
            axwArr[i5] = axw2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.f2814r = new ayk(iArr2, axwArr);
        this.f2817u = j;
        this.f2804h = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo1634h() {
        return this.f2817u != -9223372036854775807L;
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        List list;
        long j2;
        int i = 0;
        if (this.f2806j || this.f2809m.mo1989d() || this.f2809m.mo1987b()) {
            return false;
        }
        boolean h = mo1634h();
        if (h) {
            list = Collections.emptyList();
            j2 = this.f2817u;
        } else {
            list = this.f2812p;
            j2 = m2472j().f2773k;
        }
        this.f2801e.mo1638a(j, j2, list, this.f2810n);
        ayp ayp = this.f2810n;
        boolean z = ayp.f2791b;
        ayl ayl = ayp.f2790a;
        ayp.f2790a = null;
        ayp.f2791b = false;
        if (z) {
            this.f2817u = -9223372036854775807L;
            this.f2806j = true;
            return true;
        } else if (ayl == null) {
            return false;
        } else {
            if (ayl instanceof ayi) {
                ayi ayi = (ayi) ayl;
                if (h) {
                    long j3 = ayi.f2772j;
                    long j4 = this.f2817u;
                    if (j3 == j4) {
                        j4 = 0;
                    }
                    this.f2805i = j4;
                    this.f2817u = -9223372036854775807L;
                }
                ayk ayk = this.f2814r;
                ayi.f2763c = ayk;
                int[] iArr = new int[ayk.f2765a.length];
                while (true) {
                    axw[] axwArr = ayk.f2765a;
                    if (i >= axwArr.length) {
                        break;
                    }
                    axw axw = axwArr[i];
                    if (axw != null) {
                        iArr[i] = axw.mo1585b();
                    }
                    i++;
                }
                ayi.f2764d = iArr;
                this.f2811o.add(ayi);
            }
            this.f2809m.mo1984a(ayl, this, this.f2808l.mo1973a(ayl.f2768f));
            this.f2802f.mo1534c(ayl.f2772j, ayl.f2773k);
            return true;
        }
    }

    /* renamed from: d */
    public final void mo1633d(long j) {
        if (!mo1634h()) {
            int d = this.f2813q.mo1591d();
            this.f2813q.mo1588b(j, true);
            int d2 = this.f2813q.mo1591d();
            if (d2 > d) {
                long g = this.f2813q.f2719a.mo1571g();
                int i = 0;
                while (true) {
                    axw[] axwArr = this.f2803g;
                    if (i >= axwArr.length) {
                        break;
                    }
                    axwArr[i].mo1588b(g, this.f2800d[i]);
                    i++;
                }
            }
            int min = Math.min(m2468a(d2, 0), this.f2818v);
            if (min > 0) {
                blm.m3646a(this.f2811o, 0, min);
                this.f2818v -= min;
            }
        }
    }

    /* renamed from: b */
    private final ayi m2470b(int i) {
        ayi ayi = (ayi) this.f2811o.get(i);
        ArrayList arrayList = this.f2811o;
        blm.m3646a(arrayList, i, arrayList.size());
        this.f2818v = Math.max(this.f2818v, this.f2811o.size());
        int i2 = 0;
        this.f2813q.mo1586b(ayi.mo1621a(0));
        while (true) {
            axw[] axwArr = this.f2803g;
            if (i2 >= axwArr.length) {
                return ayi;
            }
            int i3 = i2 + 1;
            axwArr[i2].mo1586b(ayi.mo1621a(i3));
            i2 = i3;
        }
    }

    /* renamed from: a */
    public final long mo1629a(long j, alb alb) {
        return this.f2801e.mo1636a(j, alb);
    }

    /* renamed from: d */
    public final long mo1488d() {
        if (this.f2806j) {
            return Long.MIN_VALUE;
        }
        if (mo1634h()) {
            return this.f2817u;
        }
        long j = this.f2804h;
        ayi j2 = m2472j();
        if (!j2.mo1642e()) {
            if (this.f2811o.size() > 1) {
                ArrayList arrayList = this.f2811o;
                j2 = (ayi) arrayList.get(arrayList.size() - 2);
            } else {
                j2 = null;
            }
        }
        if (j2 != null) {
            j = Math.max(j, j2.f2773k);
        }
        return Math.max(j, this.f2813q.mo1595h());
    }

    /* renamed from: j */
    private final ayi m2472j() {
        ArrayList arrayList = this.f2811o;
        return (ayi) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: e */
    public final long mo1490e() {
        if (mo1634h()) {
            return this.f2817u;
        }
        if (!this.f2806j) {
            return m2472j().f2773k;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: a */
    private final boolean m2469a(int i) {
        ayi ayi = (ayi) this.f2811o.get(i);
        if (this.f2813q.mo1592e() > ayi.mo1621a(0)) {
            return true;
        }
        int i2 = 0;
        while (true) {
            axw[] axwArr = this.f2803g;
            if (i2 >= axwArr.length) {
                return false;
            }
            int i3 = i2 + 1;
            if (axwArr[i2].mo1592e() > ayi.mo1621a(i3)) {
                return true;
            }
            i2 = i3;
        }
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f2809m.mo1989d();
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        return !mo1634h() && this.f2813q.mo1589b(this.f2806j);
    }

    /* renamed from: i */
    private final void m2471i() {
        int a = m2468a(this.f2813q.mo1592e(), this.f2818v - 1);
        while (true) {
            int i = this.f2818v;
            if (i <= a) {
                this.f2818v = i + 1;
                ayi ayi = (ayi) this.f2811o.get(i);
                akh akh = ayi.f2769g;
                if (!akh.equals(this.f2815s)) {
                    this.f2802f.mo1528b(ayi.f2772j);
                }
                this.f2815s = akh;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo1479b() {
        this.f2809m.mo1649a();
        this.f2813q.mo1590c();
        if (!this.f2809m.mo1989d()) {
            this.f2801e.mo1637a();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        ayl ayl = (ayl) bit;
        this.f2802f.mo1521a(ayl.f2772j, ayl.f2773k);
        if (!z) {
            this.f2813q.mo1581a();
            for (axw a : this.f2803g) {
                a.mo1581a();
            }
            this.f2807k.mo414a(this);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        ayl ayl = (ayl) bit;
        this.f2801e.mo1639a(ayl);
        this.f2802f.mo1529b(ayl.f2772j, ayl.f2773k);
        this.f2807k.mo414a(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        IOException iOException2 = iOException;
        ayl ayl = (ayl) bit;
        long c = ayl.mo1624c();
        boolean z = ayl instanceof ayi;
        int size = this.f2811o.size() - 1;
        boolean z2 = c == 0 || !z || !m2469a(size);
        bir bir2 = null;
        if (this.f2801e.mo1640a(ayl, z2, iOException, z2 ? this.f2808l.mo1974a(iOException2) : -9223372036854775807L)) {
            if (!z2) {
                Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            } else {
                bir2 = bix.f4092a;
                if (z) {
                    bks.m3512b(m2470b(size) == ayl);
                    if (this.f2811o.isEmpty()) {
                        this.f2817u = this.f2804h;
                    }
                }
            }
        }
        if (bir2 != null) {
            bir = bir2;
        } else {
            long a = this.f2808l.mo1975a(iOException2, i);
            bir = a == -9223372036854775807L ? bix.f4093b : bix.m3360a(false, a);
        }
        boolean z3 = !bir.mo1978a();
        this.f2802f.mo1522a(ayl.f2772j, ayl.f2773k, iOException, z3);
        if (z3) {
            this.f2807k.mo414a(this);
        }
        return bir;
    }

    /* renamed from: g */
    public final void mo1551g() {
        this.f2813q.mo1598k();
        for (axw k : this.f2803g) {
            k.mo1598k();
        }
        ayr ayr = this.f2816t;
        if (ayr != null) {
            ayr.mo1628a(this);
        }
    }

    /* renamed from: a */
    private final int m2468a(int i, int i2) {
        while (true) {
            i2++;
            if (i2 >= this.f2811o.size()) {
                return this.f2811o.size() - 1;
            }
            if (((ayi) this.f2811o.get(i2)).mo1621a(0) > i) {
                return i2 - 1;
            }
        }
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        if (mo1634h()) {
            return -3;
        }
        m2471i();
        return this.f2813q.mo1580a(aki, anj, z, this.f2806j, this.f2805i);
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
        int size;
        int a;
        if (!this.f2809m.mo1989d() && !this.f2809m.mo1987b() && !mo1634h() && (size = this.f2811o.size()) > (a = this.f2801e.mo1635a(j, this.f2812p))) {
            while (true) {
                if (a < size) {
                    if (!m2469a(a)) {
                        break;
                    }
                    a++;
                } else {
                    a = size;
                    break;
                }
            }
            if (a != size) {
                long j2 = m2472j().f2773k;
                ayi b = m2470b(a);
                if (this.f2811o.isEmpty()) {
                    this.f2817u = this.f2804h;
                }
                this.f2806j = false;
                axg axg = this.f2802f;
                axg.mo1520a(b.f2772j);
                axg.mo1520a(j2);
                axg.mo1525a(new buk());
            }
        }
    }

    /* renamed from: c */
    public final void mo1632c() {
        mo1630a((ayr) null);
    }

    /* renamed from: a */
    public final void mo1630a(ayr ayr) {
        this.f2816t = ayr;
        this.f2813q.mo1597j();
        for (axw j : this.f2803g) {
            j.mo1597j();
        }
        this.f2809m.mo1986a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: b */
    public final void mo1631b(long j) {
        ayi ayi;
        boolean z;
        boolean z2;
        this.f2804h = j;
        if (!mo1634h()) {
            int i = 0;
            while (true) {
                ayi = null;
                if (i >= this.f2811o.size()) {
                    break;
                }
                ayi ayi2 = (ayi) this.f2811o.get(i);
                long j2 = ayi2.f2772j;
                if (j2 != j || ayi2.f2761a != -9223372036854775807L) {
                    if (j2 > j) {
                        break;
                    }
                    i++;
                } else {
                    ayi = ayi2;
                    break;
                }
            }
            this.f2813q.mo1596i();
            if (ayi != null) {
                z = this.f2813q.f2719a.mo1565b(ayi.mo1621a(0));
                this.f2805i = 0;
            } else {
                axw axw = this.f2813q;
                if (j < mo1490e()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = axw.mo1579a(j, z2) != -1;
                this.f2805i = this.f2804h;
            }
            if (z) {
                this.f2818v = m2468a(this.f2813q.mo1592e(), 0);
                for (axw axw2 : this.f2803g) {
                    axw2.mo1596i();
                    axw2.mo1579a(j, false);
                }
                return;
            }
            this.f2817u = j;
            this.f2806j = false;
            this.f2811o.clear();
            this.f2818v = 0;
            if (this.f2809m.mo1989d()) {
                this.f2809m.mo1990e();
                return;
            }
            this.f2809m.mo1988c();
            this.f2813q.mo1581a();
            for (axw a : this.f2803g) {
                a.mo1581a();
            }
            return;
        }
        this.f2817u = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: a */
    public final int mo1476a(long j) {
        int i = 0;
        if (mo1634h()) {
            return 0;
        }
        if (this.f2806j && j > this.f2813q.mo1595h()) {
            i = this.f2813q.mo1600m();
        } else {
            int a = this.f2813q.mo1579a(j, true);
            if (a != -1) {
                i = a;
            }
        }
        m2471i();
        return i;
    }
}
