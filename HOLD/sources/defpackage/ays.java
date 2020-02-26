package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ays  reason: default package */
/* compiled from: PG */
public final class ays implements axx, axz, biq, biu {
    public final int a;
    public final int[] b;
    public final akh[] c;
    public final boolean[] d;
    public final ayt e;
    public final axg f;
    public final axw[] g;
    public long h;
    public long i;
    public boolean j;
    private final axy k;
    private final bip l;
    private final bix m = new bix("Loader:ChunkSampleStream");
    private final ayp n = new ayp();
    private final ArrayList o;
    private final List p;
    private final axw q;
    private final ayk r;
    private akh s;
    private ayr t;
    private long u;
    private int v;

    public ays(int i2, int[] iArr, akh[] akhArr, ayt ayt, axy axy, bhk bhk, long j2, anu anu, bip bip, axg axg) {
        int i3;
        this.a = i2;
        this.b = iArr;
        this.c = akhArr;
        this.e = ayt;
        this.k = axy;
        this.f = axg;
        this.l = bip;
        ArrayList arrayList = new ArrayList();
        this.o = arrayList;
        this.p = Collections.unmodifiableList(arrayList);
        int i4 = 0;
        if (iArr != null) {
            i3 = iArr.length;
        } else {
            i3 = 0;
        }
        this.g = new axw[i3];
        this.d = new boolean[i3];
        int i5 = i3 + 1;
        int[] iArr2 = new int[i5];
        axw[] axwArr = new axw[i5];
        axw axw = new axw(bhk, anu);
        this.q = axw;
        iArr2[0] = i2;
        axwArr[0] = axw;
        while (i4 < i3) {
            axw axw2 = new axw(bhk, anu.a);
            this.g[i4] = axw2;
            int i6 = i4 + 1;
            axwArr[i6] = axw2;
            iArr2[i6] = iArr[i4];
            i4 = i6;
        }
        this.r = new ayk(iArr2, axwArr);
        this.u = j2;
        this.h = j2;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.u != -9223372036854775807L;
    }

    public final boolean c(long j2) {
        List list;
        long j3;
        int i2 = 0;
        if (this.j || this.m.d() || this.m.b()) {
            return false;
        }
        boolean h2 = h();
        if (h2) {
            list = Collections.emptyList();
            j3 = this.u;
        } else {
            list = this.p;
            j3 = j().k;
        }
        this.e.a(j2, j3, list, this.n);
        ayp ayp = this.n;
        boolean z = ayp.b;
        ayl ayl = ayp.a;
        ayp.a = null;
        ayp.b = false;
        if (z) {
            this.u = -9223372036854775807L;
            this.j = true;
            return true;
        } else if (ayl == null) {
            return false;
        } else {
            if (ayl instanceof ayi) {
                ayi ayi = (ayi) ayl;
                if (h2) {
                    long j4 = ayi.j;
                    long j5 = this.u;
                    if (j4 == j5) {
                        j5 = 0;
                    }
                    this.i = j5;
                    this.u = -9223372036854775807L;
                }
                ayk ayk = this.r;
                ayi.c = ayk;
                int[] iArr = new int[ayk.a.length];
                while (true) {
                    axw[] axwArr = ayk.a;
                    if (i2 >= axwArr.length) {
                        break;
                    }
                    axw axw = axwArr[i2];
                    if (axw != null) {
                        iArr[i2] = axw.b();
                    }
                    i2++;
                }
                ayi.d = iArr;
                this.o.add(ayi);
            }
            this.m.a(ayl, this, this.l.a(ayl.f));
            this.f.c(ayl.j, ayl.k);
            return true;
        }
    }

    public final void d(long j2) {
        if (!h()) {
            int d2 = this.q.d();
            this.q.b(j2, true);
            int d3 = this.q.d();
            if (d3 > d2) {
                long g2 = this.q.a.g();
                int i2 = 0;
                while (true) {
                    axw[] axwArr = this.g;
                    if (i2 >= axwArr.length) {
                        break;
                    }
                    axwArr[i2].b(g2, this.d[i2]);
                    i2++;
                }
            }
            int min = Math.min(a(d3, 0), this.v);
            if (min > 0) {
                blm.a(this.o, 0, min);
                this.v -= min;
            }
        }
    }

    private final ayi b(int i2) {
        ayi ayi = (ayi) this.o.get(i2);
        ArrayList arrayList = this.o;
        blm.a(arrayList, i2, arrayList.size());
        this.v = Math.max(this.v, this.o.size());
        int i3 = 0;
        this.q.b(ayi.a(0));
        while (true) {
            axw[] axwArr = this.g;
            if (i3 >= axwArr.length) {
                return ayi;
            }
            int i4 = i3 + 1;
            axwArr[i3].b(ayi.a(i4));
            i3 = i4;
        }
    }

    public final long a(long j2, alb alb) {
        return this.e.a(j2, alb);
    }

    public final long d() {
        if (this.j) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.u;
        }
        long j2 = this.h;
        ayi j3 = j();
        if (!j3.e()) {
            if (this.o.size() > 1) {
                ArrayList arrayList = this.o;
                j3 = (ayi) arrayList.get(arrayList.size() - 2);
            } else {
                j3 = null;
            }
        }
        if (j3 != null) {
            j2 = Math.max(j2, j3.k);
        }
        return Math.max(j2, this.q.h());
    }

    private final ayi j() {
        ArrayList arrayList = this.o;
        return (ayi) arrayList.get(arrayList.size() - 1);
    }

    public final long e() {
        if (h()) {
            return this.u;
        }
        if (!this.j) {
            return j().k;
        }
        return Long.MIN_VALUE;
    }

    private final boolean a(int i2) {
        ayi ayi = (ayi) this.o.get(i2);
        if (this.q.e() > ayi.a(0)) {
            return true;
        }
        int i3 = 0;
        while (true) {
            axw[] axwArr = this.g;
            if (i3 >= axwArr.length) {
                return false;
            }
            int i4 = i3 + 1;
            if (axwArr[i3].e() > ayi.a(i4)) {
                return true;
            }
            i3 = i4;
        }
    }

    public final boolean f() {
        return this.m.d();
    }

    public final boolean a() {
        return !h() && this.q.b(this.j);
    }

    private final void i() {
        int a2 = a(this.q.e(), this.v - 1);
        while (true) {
            int i2 = this.v;
            if (i2 <= a2) {
                this.v = i2 + 1;
                ayi ayi = (ayi) this.o.get(i2);
                akh akh = ayi.g;
                if (!akh.equals(this.s)) {
                    this.f.b(ayi.j);
                }
                this.s = akh;
            } else {
                return;
            }
        }
    }

    public final void b() {
        this.m.a();
        this.q.c();
        if (!this.m.d()) {
            this.e.a();
        }
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z) {
        ayl ayl = (ayl) bit;
        this.f.a(ayl.j, ayl.k);
        if (!z) {
            this.q.a();
            for (axw a2 : this.g) {
                a2.a();
            }
            this.k.a(this);
        }
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        ayl ayl = (ayl) bit;
        this.e.a(ayl);
        this.f.b(ayl.j, ayl.k);
        this.k.a(this);
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j2, long j3, IOException iOException, int i2) {
        bir bir;
        IOException iOException2 = iOException;
        ayl ayl = (ayl) bit;
        long c2 = ayl.c();
        boolean z = ayl instanceof ayi;
        int size = this.o.size() - 1;
        boolean z2 = c2 == 0 || !z || !a(size);
        bir bir2 = null;
        if (this.e.a(ayl, z2, iOException, z2 ? this.l.a(iOException2) : -9223372036854775807L)) {
            if (!z2) {
                Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            } else {
                bir2 = bix.a;
                if (z) {
                    bks.b(b(size) == ayl);
                    if (this.o.isEmpty()) {
                        this.u = this.h;
                    }
                }
            }
        }
        if (bir2 != null) {
            bir = bir2;
        } else {
            long a2 = this.l.a(iOException2, i2);
            bir = a2 == -9223372036854775807L ? bix.b : bix.a(false, a2);
        }
        boolean z3 = !bir.a();
        this.f.a(ayl.j, ayl.k, iOException, z3);
        if (z3) {
            this.k.a(this);
        }
        return bir;
    }

    public final void g() {
        this.q.k();
        for (axw k2 : this.g) {
            k2.k();
        }
        ayr ayr = this.t;
        if (ayr != null) {
            ayr.a(this);
        }
    }

    private final int a(int i2, int i3) {
        while (true) {
            i3++;
            if (i3 >= this.o.size()) {
                return this.o.size() - 1;
            }
            if (((ayi) this.o.get(i3)).a(0) > i2) {
                return i3 - 1;
            }
        }
    }

    public final int a(aki aki, anj anj, boolean z) {
        if (h()) {
            return -3;
        }
        i();
        return this.q.a(aki, anj, z, this.j, this.i);
    }

    public final void g(long j2) {
        int size;
        int a2;
        if (!this.m.d() && !this.m.b() && !h() && (size = this.o.size()) > (a2 = this.e.a(j2, this.p))) {
            while (true) {
                if (a2 < size) {
                    if (!a(a2)) {
                        break;
                    }
                    a2++;
                } else {
                    a2 = size;
                    break;
                }
            }
            if (a2 != size) {
                long j3 = j().k;
                ayi b2 = b(a2);
                if (this.o.isEmpty()) {
                    this.u = this.h;
                }
                this.j = false;
                axg axg = this.f;
                axg.a(b2.j);
                axg.a(j3);
                axg.a(new buk());
            }
        }
    }

    public final void c() {
        a((ayr) null);
    }

    public final void a(ayr ayr) {
        this.t = ayr;
        this.q.j();
        for (axw j2 : this.g) {
            j2.j();
        }
        this.m.a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final void b(long j2) {
        ayi ayi;
        boolean z;
        boolean z2;
        this.h = j2;
        if (!h()) {
            int i2 = 0;
            while (true) {
                ayi = null;
                if (i2 >= this.o.size()) {
                    break;
                }
                ayi ayi2 = (ayi) this.o.get(i2);
                long j3 = ayi2.j;
                if (j3 != j2 || ayi2.a != -9223372036854775807L) {
                    if (j3 > j2) {
                        break;
                    }
                    i2++;
                } else {
                    ayi = ayi2;
                    break;
                }
            }
            this.q.i();
            if (ayi != null) {
                z = this.q.a.b(ayi.a(0));
                this.i = 0;
            } else {
                axw axw = this.q;
                if (j2 < e()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = axw.a(j2, z2) != -1;
                this.i = this.h;
            }
            if (z) {
                this.v = a(this.q.e(), 0);
                for (axw axw2 : this.g) {
                    axw2.i();
                    axw2.a(j2, false);
                }
                return;
            }
            this.u = j2;
            this.j = false;
            this.o.clear();
            this.v = 0;
            if (this.m.d()) {
                this.m.e();
                return;
            }
            this.m.c();
            this.q.a();
            for (axw a2 : this.g) {
                a2.a();
            }
            return;
        }
        this.u = j2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final int a(long j2) {
        int i2 = 0;
        if (h()) {
            return 0;
        }
        if (this.j && j2 > this.q.h()) {
            i2 = this.q.m();
        } else {
            int a2 = this.q.a(j2, true);
            if (a2 != -1) {
                i2 = a2;
            }
        }
        i();
        return i2;
    }
}
