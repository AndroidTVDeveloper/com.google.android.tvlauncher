package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axq  reason: default package */
/* compiled from: PG */
final class axq implements aws, aok, biq, biu, axv {
    public static final Map a;
    public static final akh b = akh.a("icy", "application/x-icy", Long.MAX_VALUE);
    private final Uri A;
    private final bhv B;
    private final anu C;
    private final bip D;
    private final bhk E;
    private final axl F;
    private final Runnable G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private long L;
    private boolean M;
    private int N;
    public final axg c;
    public final axm d;
    public final String e = null;
    public final long f = 1048576;
    public final bix g = new bix("Loader:ProgressiveMediaPeriod");
    public final bki h;
    public final Runnable i;
    public final Handler j;
    public awr k;
    public aos l;
    public aul m;
    public axw[] n;
    public axp[] o;
    public boolean p;
    public boolean q;
    public axn r;
    public boolean s;
    public int t;
    public long u;
    public long v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = Collections.unmodifiableMap(hashMap);
    }

    private final boolean o() {
        return this.L != -9223372036854775807L;
    }

    public final void g(long j2) {
    }

    public axq(Uri uri, bhv bhv, aoi[] aoiArr, anu anu, bip bip, axg axg, axm axm, bhk bhk) {
        this.A = uri;
        this.B = bhv;
        this.C = anu;
        this.D = bip;
        this.c = axg;
        this.d = axm;
        this.E = bhk;
        this.F = new axl(aoiArr);
        this.h = new bki();
        this.G = new axi(this);
        this.i = new axj(this);
        this.j = new Handler();
        this.o = new axp[0];
        this.n = new axw[0];
        this.L = -9223372036854775807L;
        this.v = -1;
        this.u = -9223372036854775807L;
        this.t = 1;
        axg.a();
    }

    public final boolean c(long j2) {
        if (this.y || this.g.b() || this.M) {
            return false;
        }
        if (this.q && this.K == 0) {
            return false;
        }
        boolean a2 = this.h.a();
        if (this.g.d()) {
            return a2;
        }
        m();
        return true;
    }

    private final void a(axk axk) {
        if (this.v == -1) {
            this.v = axk.b;
        }
    }

    public final void d(long j2) {
        if (!o()) {
            boolean[] zArr = l().d;
            int length = this.n.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.n[i2].b(j2, zArr[i2]);
            }
        }
    }

    public final void S() {
        this.p = true;
        this.j.post(this.G);
    }

    public final long a(long j2, alb alb) {
        aos aos = l().a;
        if (!aos.d()) {
            return 0;
        }
        aoq d2 = aos.d(j2);
        return blm.a(j2, alb, d2.a.b, d2.b.b);
    }

    public final long d() {
        long j2;
        boolean[] zArr = l().c;
        if (this.y) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.L;
        }
        if (this.s) {
            int length = this.n.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.n[i2].a.f()) {
                    j2 = Math.min(j2, this.n[i2].h());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = j();
        }
        return j2 == Long.MIN_VALUE ? this.x : j2;
    }

    private final int n() {
        int i2 = 0;
        for (axw b2 : this.n) {
            i2 += b2.b();
        }
        return i2;
    }

    public final long j() {
        long j2 = Long.MIN_VALUE;
        for (axw h2 : this.n) {
            j2 = Math.max(j2, h2.h());
        }
        return j2;
    }

    public final long e() {
        if (this.K == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    private final axn l() {
        return (axn) bks.a(this.r);
    }

    public final aye b() {
        return l().b;
    }

    public final boolean f() {
        return this.g.d() && this.h.c();
    }

    public final void a(int i2) {
        axn l2 = l();
        boolean[] zArr = l2.e;
        if (!zArr[i2]) {
            akh a2 = l2.b.a(i2).a(0);
            axg axg = this.c;
            bkt.g(a2.i);
            axg.b(this.x);
            zArr[i2] = true;
        }
    }

    public final void b(int i2) {
        boolean[] zArr = l().c;
        if (this.M && zArr[i2]) {
            if (!this.n[i2].b(false)) {
                this.L = 0;
                this.M = false;
                this.I = true;
                this.x = 0;
                this.N = 0;
                for (axw a2 : this.n) {
                    a2.a();
                }
                ((awr) bks.a(this.k)).a((axz) this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.g.a(this.D.a(this.t));
    }

    public final void a() {
        h();
        if (this.y && !this.q) {
            throw new ako("Loading finished before preparation is complete.");
        }
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z2) {
        axk axk = (axk) bit;
        this.c.a(axk.a, this.u);
        if (!z2) {
            a(axk);
            for (axw a2 : this.n) {
                a2.a();
            }
            if (this.K > 0) {
                ((awr) bks.a(this.k)).a((axz) this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        aos aos;
        long j4;
        axk axk = (axk) bit;
        if (this.u == -9223372036854775807L && (aos = this.l) != null) {
            boolean d2 = aos.d();
            long j5 = j();
            if (j5 != Long.MIN_VALUE) {
                j4 = j5 + 10000;
            } else {
                j4 = 0;
            }
            this.u = j4;
            this.d.a(j4, d2, this.w);
        }
        this.c.b(axk.a, this.u);
        a(axk);
        this.y = true;
        ((awr) bks.a(this.k)).a((axz) this);
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j2, long j3, IOException iOException, int i2) {
        bir bir;
        aos aos;
        axk axk = (axk) bit;
        a(axk);
        long a2 = this.D.a(iOException, i2);
        if (a2 != -9223372036854775807L) {
            int n2 = n();
            boolean z2 = n2 > this.N;
            if (this.v != -1 || ((aos = this.l) != null && aos.b() != -9223372036854775807L)) {
                this.N = n2;
            } else if (this.q && !i()) {
                this.M = true;
                bir = bix.a;
            } else {
                this.I = this.q;
                this.x = 0;
                this.N = 0;
                for (axw a3 : this.n) {
                    a3.a();
                }
                axk.a(0, 0);
            }
            bir = bix.a(z2, a2);
        } else {
            bir = bix.b;
        }
        this.c.a(axk.a, this.u, iOException, !bir.a());
        return bir;
    }

    public final void g() {
        for (axw k2 : this.n) {
            k2.k();
        }
        axl axl = this.F;
        if (axl.a != null) {
            axl.a = null;
        }
    }

    public final void k() {
        this.j.post(this.G);
    }

    public final void a(awr awr, long j2) {
        this.k = awr;
        this.h.a();
        m();
    }

    public final aov a(axp axp) {
        int length = this.n.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (axp.equals(this.o[i2])) {
                return this.n[i2];
            }
        }
        axw axw = new axw(this.E, this.C);
        axw.c = this;
        int i3 = length + 1;
        axp[] axpArr = (axp[]) Arrays.copyOf(this.o, i3);
        axpArr[length] = axp;
        this.o = (axp[]) blm.a((Object[]) axpArr);
        axw[] axwArr = (axw[]) Arrays.copyOf(this.n, i3);
        axwArr[length] = axw;
        this.n = (axw[]) blm.a((Object[]) axwArr);
        return axw;
    }

    public final long c() {
        if (!this.J) {
            this.c.c();
            this.J = true;
        }
        if (!this.I) {
            return -9223372036854775807L;
        }
        if (!this.y && n() <= this.N) {
            return -9223372036854775807L;
        }
        this.I = false;
        return this.x;
    }

    public final void a(aos aos) {
        if (this.m != null) {
            aos = new aor(-9223372036854775807L);
        }
        this.l = aos;
        this.j.post(this.G);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final long b(long j2) {
        axn l2 = l();
        aos aos = l2.a;
        boolean[] zArr = l2.c;
        if (!aos.d()) {
            j2 = 0;
        }
        this.I = false;
        this.x = j2;
        if (!o()) {
            if (this.t != 7) {
                int length = this.n.length;
                int i2 = 0;
                while (i2 < length) {
                    axw axw = this.n[i2];
                    axw.i();
                    if (axw.a(j2, false) != -1 || (!zArr[i2] && this.s)) {
                        i2++;
                    }
                }
                return j2;
            }
            this.M = false;
            this.L = j2;
            this.y = false;
            if (this.g.d()) {
                this.g.e();
            } else {
                this.g.c();
                for (axw a2 : this.n) {
                    a2.a();
                }
            }
            return j2;
        }
        this.L = j2;
        return j2;
    }

    public final long a(bgl[] bglArr, boolean[] zArr, axx[] axxArr, boolean[] zArr2, long j2) {
        bgl bgl;
        boolean z2;
        axn l2 = l();
        aye aye = l2.b;
        boolean[] zArr3 = l2.d;
        int i2 = this.K;
        int i3 = 0;
        for (int i4 = 0; i4 < bglArr.length; i4++) {
            axx axx = axxArr[i4];
            if (axx != null && (bglArr[i4] == null || !zArr[i4])) {
                int i5 = ((axo) axx).a;
                bks.b(zArr3[i5]);
                this.K--;
                zArr3[i5] = false;
                axxArr[i4] = null;
            }
        }
        boolean z3 = this.H ? i2 == 0 : j2 != 0;
        for (int i6 = 0; i6 < bglArr.length; i6++) {
            if (axxArr[i6] == null && (bgl = bglArr[i6]) != null) {
                if (bgl.f() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bks.b(z2);
                bks.b(bgl.b(0) == 0);
                int a2 = aye.a(bgl.e());
                bks.b(!zArr3[a2]);
                this.K++;
                zArr3[a2] = true;
                axxArr[i6] = new axo(this, a2);
                zArr2[i6] = true;
                if (!z3) {
                    axw axw = this.n[a2];
                    axw.i();
                    z3 = axw.a(j2, true) == -1 && axw.e() != 0;
                }
            }
        }
        if (this.K == 0) {
            this.M = false;
            this.I = false;
            if (this.g.d()) {
                axw[] axwArr = this.n;
                int length = axwArr.length;
                while (i3 < length) {
                    axwArr[i3].l();
                    i3++;
                }
                this.g.e();
            } else {
                axw[] axwArr2 = this.n;
                int length2 = axwArr2.length;
                while (i3 < length2) {
                    axwArr2[i3].a();
                    i3++;
                }
            }
        } else if (z3) {
            j2 = b(j2);
            while (i3 < axxArr.length) {
                if (axxArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.H = true;
        return j2;
    }

    private final void m() {
        axk axk = new axk(this, this.A, this.B, this.F, this, this.h);
        if (this.q) {
            aos aos = l().a;
            bks.b(o());
            long j2 = this.u;
            if (j2 != -9223372036854775807L && this.L > j2) {
                this.y = true;
                this.L = -9223372036854775807L;
                return;
            }
            axk.a(aos.d(this.L).a.c, this.L);
            this.L = -9223372036854775807L;
        }
        this.N = n();
        this.g.a(axk, this, this.D.a(this.t));
        this.c.c(axk.a, this.u);
    }

    public final boolean i() {
        return this.I || o();
    }

    public final aov a(int i2, int i3) {
        return a(new axp(i2, false));
    }
}
