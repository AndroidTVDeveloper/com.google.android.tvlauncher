package p000;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axq */
/* compiled from: PG */
final class axq implements aws, aok, biq, biu, axv {

    /* renamed from: a */
    public static final Map f2639a;

    /* renamed from: b */
    public static final akh f2640b = akh.m735a("icy", "application/x-icy", Long.MAX_VALUE);

    /* renamed from: A */
    private final Uri f2641A;

    /* renamed from: B */
    private final bhv f2642B;

    /* renamed from: C */
    private final anu f2643C;

    /* renamed from: D */
    private final bip f2644D;

    /* renamed from: E */
    private final bhk f2645E;

    /* renamed from: F */
    private final axl f2646F;

    /* renamed from: G */
    private final Runnable f2647G;

    /* renamed from: H */
    private boolean f2648H;

    /* renamed from: I */
    private boolean f2649I;

    /* renamed from: J */
    private boolean f2650J;

    /* renamed from: K */
    private int f2651K;

    /* renamed from: L */
    private long f2652L;

    /* renamed from: M */
    private boolean f2653M;

    /* renamed from: N */
    private int f2654N;

    /* renamed from: c */
    public final axg f2655c;

    /* renamed from: d */
    public final axm f2656d;

    /* renamed from: e */
    public final String f2657e = null;

    /* renamed from: f */
    public final long f2658f = 1048576;

    /* renamed from: g */
    public final bix f2659g = new bix("Loader:ProgressiveMediaPeriod");

    /* renamed from: h */
    public final bki f2660h;

    /* renamed from: i */
    public final Runnable f2661i;

    /* renamed from: j */
    public final Handler f2662j;

    /* renamed from: k */
    public awr f2663k;

    /* renamed from: l */
    public aos f2664l;

    /* renamed from: m */
    public aul f2665m;

    /* renamed from: n */
    public axw[] f2666n;

    /* renamed from: o */
    public axp[] f2667o;

    /* renamed from: p */
    public boolean f2668p;

    /* renamed from: q */
    public boolean f2669q;

    /* renamed from: r */
    public axn f2670r;

    /* renamed from: s */
    public boolean f2671s;

    /* renamed from: t */
    public int f2672t;

    /* renamed from: u */
    public long f2673u;

    /* renamed from: v */
    public long f2674v;

    /* renamed from: w */
    public boolean f2675w;

    /* renamed from: x */
    public long f2676x;

    /* renamed from: y */
    public boolean f2677y;

    /* renamed from: z */
    public boolean f2678z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f2639a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: o */
    private final boolean m2332o() {
        return this.f2652L != -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
    }

    public axq(Uri uri, bhv bhv, aoi[] aoiArr, anu anu, bip bip, axg axg, axm axm, bhk bhk) {
        this.f2641A = uri;
        this.f2642B = bhv;
        this.f2643C = anu;
        this.f2644D = bip;
        this.f2655c = axg;
        this.f2656d = axm;
        this.f2645E = bhk;
        this.f2646F = new axl(aoiArr);
        this.f2660h = new bki();
        this.f2647G = new axi(this);
        this.f2661i = new axj(this);
        this.f2662j = new Handler();
        this.f2667o = new axp[0];
        this.f2666n = new axw[0];
        this.f2652L = -9223372036854775807L;
        this.f2674v = -1;
        this.f2673u = -9223372036854775807L;
        this.f2672t = 1;
        axg.mo1517a();
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        if (this.f2677y || this.f2659g.mo1987b() || this.f2653M) {
            return false;
        }
        if (this.f2669q && this.f2651K == 0) {
            return false;
        }
        boolean a = this.f2660h.mo2033a();
        if (this.f2659g.mo1989d()) {
            return a;
        }
        m2330m();
        return true;
    }

    /* renamed from: a */
    private final void m2328a(axk axk) {
        if (this.f2674v == -1) {
            this.f2674v = axk.f2615b;
        }
    }

    /* renamed from: d */
    public final void mo1489d(long j) {
        if (!m2332o()) {
            boolean[] zArr = m2329l().f2633d;
            int length = this.f2666n.length;
            for (int i = 0; i < length; i++) {
                this.f2666n[i].mo1588b(j, zArr[i]);
            }
        }
    }

    /* renamed from: S */
    public final void mo1210S() {
        this.f2668p = true;
        this.f2662j.post(this.f2647G);
    }

    /* renamed from: a */
    public final long mo1480a(long j, alb alb) {
        aos aos = m2329l().f2630a;
        if (!aos.mo1177d()) {
            return 0;
        }
        aoq d = aos.mo1176d(j);
        return blm.m3633a(j, alb, d.f1515a.f1520b, d.f1516b.f1520b);
    }

    /* renamed from: d */
    public final long mo1488d() {
        long j;
        boolean[] zArr = m2329l().f2632c;
        if (this.f2677y) {
            return Long.MIN_VALUE;
        }
        if (m2332o()) {
            return this.f2652L;
        }
        if (this.f2671s) {
            int length = this.f2666n.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f2666n[i].f2719a.mo1570f()) {
                    j = Math.min(j, this.f2666n[i].mo1595h());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo1554j();
        }
        return j == Long.MIN_VALUE ? this.f2676x : j;
    }

    /* renamed from: n */
    private final int m2331n() {
        int i = 0;
        for (axw b : this.f2666n) {
            i += b.mo1585b();
        }
        return i;
    }

    /* renamed from: j */
    public final long mo1554j() {
        long j = Long.MIN_VALUE;
        for (axw h : this.f2666n) {
            j = Math.max(j, h.mo1595h());
        }
        return j;
    }

    /* renamed from: e */
    public final long mo1490e() {
        if (this.f2651K == 0) {
            return Long.MIN_VALUE;
        }
        return mo1488d();
    }

    /* renamed from: l */
    private final axn m2329l() {
        return (axn) bks.m3507a(this.f2670r);
    }

    /* renamed from: b */
    public final aye mo1485b() {
        return m2329l().f2631b;
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f2659g.mo1989d() && this.f2660h.mo2035c();
    }

    /* renamed from: a */
    public final void mo1547a(int i) {
        axn l = m2329l();
        boolean[] zArr = l.f2634e;
        if (!zArr[i]) {
            akh a = l.f2631b.mo1612a(i).mo1604a(0);
            axg axg = this.f2655c;
            bkt.m3521g(a.f556i);
            axg.mo1528b(this.f2676x);
            zArr[i] = true;
        }
    }

    /* renamed from: b */
    public final void mo1550b(int i) {
        boolean[] zArr = m2329l().f2632c;
        if (this.f2653M && zArr[i]) {
            if (!this.f2666n[i].mo1589b(false)) {
                this.f2652L = 0;
                this.f2653M = false;
                this.f2649I = true;
                this.f2676x = 0;
                this.f2654N = 0;
                for (axw a : this.f2666n) {
                    a.mo1581a();
                }
                ((awr) bks.m3507a(this.f2663k)).mo414a((axz) this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo1552h() {
        this.f2659g.mo1985a(this.f2644D.mo1973a(this.f2672t));
    }

    /* renamed from: a */
    public final void mo1482a() {
        mo1552h();
        if (this.f2677y && !this.f2669q) {
            throw new ako("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        axk axk = (axk) bit;
        this.f2655c.mo1521a(axk.f2614a, this.f2673u);
        if (!z) {
            m2328a(axk);
            for (axw a : this.f2666n) {
                a.mo1581a();
            }
            if (this.f2651K > 0) {
                ((awr) bks.m3507a(this.f2663k)).mo414a((axz) this);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        aos aos;
        long j3;
        axk axk = (axk) bit;
        if (this.f2673u == -9223372036854775807L && (aos = this.f2664l) != null) {
            boolean d = aos.mo1177d();
            long j4 = mo1554j();
            if (j4 != Long.MIN_VALUE) {
                j3 = j4 + 10000;
            } else {
                j3 = 0;
            }
            this.f2673u = j3;
            this.f2656d.mo1542a(j3, d, this.f2675w);
        }
        this.f2655c.mo1529b(axk.f2614a, this.f2673u);
        m2328a(axk);
        this.f2677y = true;
        ((awr) bks.m3507a(this.f2663k)).mo414a((axz) this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        aos aos;
        axk axk = (axk) bit;
        m2328a(axk);
        long a = this.f2644D.mo1975a(iOException, i);
        if (a != -9223372036854775807L) {
            int n = m2331n();
            boolean z = n > this.f2654N;
            if (this.f2674v != -1 || ((aos = this.f2664l) != null && aos.mo1175b() != -9223372036854775807L)) {
                this.f2654N = n;
            } else if (this.f2669q && !mo1553i()) {
                this.f2653M = true;
                bir = bix.f4092a;
            } else {
                this.f2649I = this.f2669q;
                this.f2676x = 0;
                this.f2654N = 0;
                for (axw a2 : this.f2666n) {
                    a2.mo1581a();
                }
                axk.mo1539a(0, 0);
            }
            bir = bix.m3360a(z, a);
        } else {
            bir = bix.f4093b;
        }
        this.f2655c.mo1522a(axk.f2614a, this.f2673u, iOException, !bir.mo1978a());
        return bir;
    }

    /* renamed from: g */
    public final void mo1551g() {
        for (axw k : this.f2666n) {
            k.mo1598k();
        }
        axl axl = this.f2646F;
        if (axl.f2628a != null) {
            axl.f2628a = null;
        }
    }

    /* renamed from: k */
    public final void mo1555k() {
        this.f2662j.post(this.f2647G);
    }

    /* renamed from: a */
    public final void mo1483a(awr awr, long j) {
        this.f2663k = awr;
        this.f2660h.mo2033a();
        m2330m();
    }

    /* renamed from: a */
    public final aov mo1545a(axp axp) {
        int length = this.f2666n.length;
        for (int i = 0; i < length; i++) {
            if (axp.equals(this.f2667o[i])) {
                return this.f2666n[i];
            }
        }
        axw axw = new axw(this.f2645E, this.f2643C);
        axw.f2721c = this;
        int i2 = length + 1;
        axp[] axpArr = (axp[]) Arrays.copyOf(this.f2667o, i2);
        axpArr[length] = axp;
        this.f2667o = (axp[]) blm.m3656a((Object[]) axpArr);
        axw[] axwArr = (axw[]) Arrays.copyOf(this.f2666n, i2);
        axwArr[length] = axw;
        this.f2666n = (axw[]) blm.m3656a((Object[]) axwArr);
        return axw;
    }

    /* renamed from: c */
    public final long mo1486c() {
        if (!this.f2650J) {
            this.f2655c.mo1532c();
            this.f2650J = true;
        }
        if (!this.f2649I) {
            return -9223372036854775807L;
        }
        if (!this.f2677y && m2331n() <= this.f2654N) {
            return -9223372036854775807L;
        }
        this.f2649I = false;
        return this.f2676x;
    }

    /* renamed from: a */
    public final void mo1212a(aos aos) {
        if (this.f2665m != null) {
            aos = new aor(-9223372036854775807L);
        }
        this.f2664l = aos;
        this.f2662j.post(this.f2647G);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: b */
    public final long mo1484b(long j) {
        axn l = m2329l();
        aos aos = l.f2630a;
        boolean[] zArr = l.f2632c;
        if (!aos.mo1177d()) {
            j = 0;
        }
        this.f2649I = false;
        this.f2676x = j;
        if (!m2332o()) {
            if (this.f2672t != 7) {
                int length = this.f2666n.length;
                int i = 0;
                while (i < length) {
                    axw axw = this.f2666n[i];
                    axw.mo1596i();
                    if (axw.mo1579a(j, false) != -1 || (!zArr[i] && this.f2671s)) {
                        i++;
                    }
                }
                return j;
            }
            this.f2653M = false;
            this.f2652L = j;
            this.f2677y = false;
            if (this.f2659g.mo1989d()) {
                this.f2659g.mo1990e();
            } else {
                this.f2659g.mo1988c();
                for (axw a : this.f2666n) {
                    a.mo1581a();
                }
            }
            return j;
        }
        this.f2652L = j;
        return j;
    }

    /* renamed from: a */
    public final long mo1481a(bgl[] bglArr, boolean[] zArr, axx[] axxArr, boolean[] zArr2, long j) {
        bgl bgl;
        boolean z;
        axn l = m2329l();
        aye aye = l.f2631b;
        boolean[] zArr3 = l.f2633d;
        int i = this.f2651K;
        int i2 = 0;
        for (int i3 = 0; i3 < bglArr.length; i3++) {
            axx axx = axxArr[i3];
            if (axx != null && (bglArr[i3] == null || !zArr[i3])) {
                int i4 = ((axo) axx).f2635a;
                bks.m3512b(zArr3[i4]);
                this.f2651K--;
                zArr3[i4] = false;
                axxArr[i3] = null;
            }
        }
        boolean z2 = this.f2648H ? i == 0 : j != 0;
        for (int i5 = 0; i5 < bglArr.length; i5++) {
            if (axxArr[i5] == null && (bgl = bglArr[i5]) != null) {
                if (bgl.mo1835f() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bks.m3512b(z);
                bks.m3512b(bgl.mo1830b(0) == 0);
                int a = aye.mo1611a(bgl.mo1833e());
                bks.m3512b(!zArr3[a]);
                this.f2651K++;
                zArr3[a] = true;
                axxArr[i5] = new axo(this, a);
                zArr2[i5] = true;
                if (!z2) {
                    axw axw = this.f2666n[a];
                    axw.mo1596i();
                    z2 = axw.mo1579a(j, true) == -1 && axw.mo1592e() != 0;
                }
            }
        }
        if (this.f2651K == 0) {
            this.f2653M = false;
            this.f2649I = false;
            if (this.f2659g.mo1989d()) {
                axw[] axwArr = this.f2666n;
                int length = axwArr.length;
                while (i2 < length) {
                    axwArr[i2].mo1599l();
                    i2++;
                }
                this.f2659g.mo1990e();
            } else {
                axw[] axwArr2 = this.f2666n;
                int length2 = axwArr2.length;
                while (i2 < length2) {
                    axwArr2[i2].mo1581a();
                    i2++;
                }
            }
        } else if (z2) {
            j = mo1484b(j);
            while (i2 < axxArr.length) {
                if (axxArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f2648H = true;
        return j;
    }

    /* renamed from: m */
    private final void m2330m() {
        axk axk = new axk(this, this.f2641A, this.f2642B, this.f2646F, this, this.f2660h);
        if (this.f2669q) {
            aos aos = m2329l().f2630a;
            bks.m3512b(m2332o());
            long j = this.f2673u;
            if (j != -9223372036854775807L && this.f2652L > j) {
                this.f2677y = true;
                this.f2652L = -9223372036854775807L;
                return;
            }
            axk.mo1539a(aos.mo1176d(this.f2652L).f1515a.f1521c, this.f2652L);
            this.f2652L = -9223372036854775807L;
        }
        this.f2654N = m2331n();
        this.f2659g.mo1984a(axk, this, this.f2644D.mo1973a(this.f2672t));
        this.f2655c.mo1534c(axk.f2614a, this.f2673u);
    }

    /* renamed from: i */
    public final boolean mo1553i() {
        return this.f2649I || m2332o();
    }

    /* renamed from: a */
    public final aov mo1211a(int i, int i2) {
        return mo1545a(new axp(i, false));
    }
}
