package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bbs  reason: default package */
/* compiled from: PG */
final class bbs implements biq, biu, axz, aok, axv {
    private static final Set z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 4)));
    private final bhk A;
    private final akh B;
    private final anu C;
    private final bip D;
    private final int E;
    private final bbc F = new bbc();
    private final List G;
    private final Runnable H;
    private final Runnable I;
    private final Map J;
    private int[] K = new int[0];
    private final Set L = new HashSet(z.size());
    private final SparseIntArray M = new SparseIntArray(z.size());
    private aov N;
    private int O;
    private boolean P;
    private boolean[] Q = new boolean[0];
    private long R;
    private boolean S;
    private long T;
    private int U;
    public final int a;
    public final bbp b;
    public final bbe c;
    public final bix d = new bix("Loader:HlsSampleStreamWrapper");
    public final axg e;
    public final ArrayList f;
    public final Handler g;
    public final ArrayList h;
    public axw[] i = new axw[0];
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public akh n;
    public akh o;
    public boolean p;
    public aye q;
    public Set r;
    public int[] s;
    public int t;
    public boolean[] u = new boolean[0];
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;

    private static int a(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void a(aos aos) {
    }

    public final void g(long j2) {
    }

    public final boolean m() {
        return this.R != -9223372036854775807L;
    }

    public bbs(int i2, bbp bbp, bbe bbe, Map map, bhk bhk, long j2, akh akh, anu anu, bip bip, axg axg, int i3) {
        this.a = i2;
        this.b = bbp;
        this.c = bbe;
        this.J = map;
        this.A = bhk;
        this.B = akh;
        this.C = anu;
        this.D = bip;
        this.e = axg;
        this.E = i3;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.G = Collections.unmodifiableList(arrayList);
        this.h = new ArrayList();
        this.H = new bbm(this);
        this.I = new bbn(this);
        this.g = new Handler();
        this.v = j2;
        this.R = j2;
    }

    public final void o() {
        bks.b(this.l);
        bks.a(this.q);
        bks.a(this.r);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final boolean c(long j2) {
        long j3;
        List list;
        bbc bbc;
        boolean z2;
        long j4;
        int i2;
        if (this.y || this.d.d() || this.d.b()) {
            return false;
        }
        if (m()) {
            list = Collections.emptyList();
            j3 = this.R;
        } else {
            list = this.G;
            bbi l2 = l();
            if (!l2.c) {
                j3 = Math.max(this.v, l2.j);
            } else {
                j3 = l2.k;
            }
        }
        bbe bbe = this.c;
        boolean z3 = this.l || !list.isEmpty();
        bbc bbc2 = this.F;
        bbi bbi = !list.isEmpty() ? (bbi) list.get(list.size() - 1) : null;
        int a2 = bbi != null ? bbe.g.a(bbi.g) : -1;
        long j5 = j3 - j2;
        long j6 = bbe.p;
        boolean z4 = z3;
        long j7 = j6 != -9223372036854775807L ? j6 - j2 : -9223372036854775807L;
        if (bbi == null) {
            bbc = bbc2;
        } else if (!bbe.n) {
            bbc = bbc2;
            long j8 = bbi.k - bbi.j;
            j5 = Math.max(0L, j5 - j8);
            if (j7 != -9223372036854775807L) {
                j7 = Math.max(0L, j7 - j8);
            }
        } else {
            bbc = bbc2;
        }
        bbe.a(bbi, j3);
        bbe.o.a(j5, j7);
        int h2 = bbe.o.h();
        if (a2 != h2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Uri uri = bbe.d[h2];
        if (!bbe.f.a(uri)) {
            bbc.c = uri;
            bbe.q &= uri.equals(bbe.m);
            bbe.m = uri;
        } else {
            bbc bbc3 = bbc;
            bch a3 = bbe.f.a(uri, true);
            bks.a(a3);
            bbe.n = a3.p;
            bbe.p = !a3.i ? a3.a() - ((bcc) bbe.f).n : -9223372036854775807L;
            long j9 = a3.c - ((bcc) bbe.f).n;
            int i3 = a2;
            bch bch = a3;
            long a4 = bbe.a(bbi, z2, a3, j9, j3);
            if (a4 < bch.f && bbi != null && z2) {
                Uri uri2 = bbe.d[i3];
                bch a5 = bbe.f.a(uri2, true);
                bks.a(a5);
                uri = uri2;
                bch = a5;
                h2 = i3;
                j4 = a5.c - ((bcc) bbe.f).n;
                a4 = bbi.d();
            } else {
                j4 = j9;
            }
            long j10 = bch.f;
            if (a4 < j10) {
                bbe.l = new awd();
            } else {
                int i4 = (int) (a4 - j10);
                int size = bch.l.size();
                if (i4 < size) {
                    i2 = i4;
                } else if (!bch.i) {
                    bbc3.c = uri;
                    bbe.q &= uri.equals(bbe.m);
                    bbe.m = uri;
                } else if (!z4 && size != 0) {
                    i2 = size - 1;
                } else {
                    bbc3.b = true;
                }
                bbe.q = false;
                bbe.m = null;
                bcg bcg = (bcg) bch.l.get(i2);
                Uri a6 = bbe.a(bch, bcg.b);
                bbc3.a = bbe.a(a6, h2);
                if (bbc3.a == null) {
                    Uri a7 = bbe.a(bch, bcg);
                    bbc3.a = bbe.a(a7, h2);
                    if (bbc3.a == null) {
                        bbc3.a = bbi.a(bbe.a, bbe.b, bbe.e[h2], j4, bch, i2, uri, bbe.h, bbe.o.b(), bbe.o.c(), bbe.j, bbe.c, bbi, bbe.i.a(a7), bbe.i.a(a6));
                    }
                }
            }
        }
        bbc bbc4 = this.F;
        boolean z5 = bbc4.b;
        ayl ayl = bbc4.a;
        Uri uri3 = bbc4.c;
        bbc4.a();
        if (z5) {
            this.R = -9223372036854775807L;
            this.y = true;
            return true;
        } else if (ayl != null) {
            if (ayl instanceof bbi) {
                this.R = -9223372036854775807L;
                bbi bbi2 = (bbi) ayl;
                bbi2.b = this;
                this.f.add(bbi2);
                this.n = bbi2.g;
            }
            this.d.a(ayl, this, this.D.a(ayl.f));
            this.e.c(ayl.j, ayl.k);
            return true;
        } else if (uri3 == null) {
            return false;
        } else {
            ((bcb) ((bcc) ((bbj) this.b).a).c.get(uri3)).a();
            return false;
        }
    }

    public final void b() {
        if (!this.l) {
            c(this.v);
        }
    }

    private static aoh b(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i2);
        sb.append(" of type ");
        sb.append(i3);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new aoh();
    }

    public final aye a(ayc[] aycArr) {
        for (int i2 = 0; i2 < aycArr.length; i2++) {
            ayc ayc = aycArr[i2];
            akh[] akhArr = new akh[ayc.a];
            for (int i3 = 0; i3 < ayc.a; i3++) {
                akh a2 = ayc.a(i3);
                if (a2.l != null) {
                    a2 = a2.b();
                }
                akhArr[i3] = a2;
            }
            aycArr[i2] = new ayc(akhArr);
        }
        return new aye(aycArr);
    }

    private static akh a(akh akh, akh akh2, boolean z2) {
        String str;
        akh akh3 = akh;
        akh akh4 = akh2;
        if (akh3 == null) {
            return akh4;
        }
        int i2 = z2 ? akh3.e : -1;
        int i3 = akh3.v;
        int i4 = i3 != -1 ? i3 : akh4.v;
        String a2 = blm.a(akh3.f, bkt.g(akh4.i));
        String f2 = bkt.f(a2);
        if (f2 != null) {
            str = f2;
        } else {
            str = akh4.i;
        }
        String str2 = akh3.a;
        String str3 = akh3.b;
        atw atw = akh3.g;
        int i5 = akh3.n;
        int i6 = akh3.o;
        int i7 = akh3.c;
        String str4 = akh3.A;
        atw atw2 = akh4.g;
        if (atw2 != null) {
            atw = atw2.a(atw);
        }
        int i8 = akh4.d;
        String str5 = akh4.h;
        int i9 = akh4.j;
        List list = akh4.k;
        anq anq = akh4.l;
        long j2 = akh4.m;
        float f3 = akh4.p;
        int i10 = akh4.q;
        float f4 = akh4.r;
        byte[] bArr = akh4.t;
        int i11 = akh4.s;
        blp blp = akh4.u;
        int i12 = akh4.w;
        int i13 = akh4.x;
        int i14 = akh4.y;
        int i15 = akh4.z;
        int i16 = akh4.B;
        Class cls = akh4.C;
        return new akh(str2, str3, i7, i8, i2, a2, atw, str5, str, i9, list, anq, j2, i5, i6, f3, i10, f4, bArr, i11, blp, i4, i12, i13, i14, i15, str4, i16);
    }

    public final void S() {
        this.S = true;
        this.g.post(this.I);
    }

    public final long d() {
        if (this.y) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.R;
        }
        long j2 = this.v;
        bbi l2 = l();
        if (!l2.c) {
            if (this.f.size() > 1) {
                ArrayList arrayList = this.f;
                l2 = (bbi) arrayList.get(arrayList.size() - 2);
            } else {
                l2 = null;
            }
        }
        if (l2 != null) {
            j2 = Math.max(j2, l2.k);
        }
        if (this.k) {
            for (axw h2 : this.i) {
                j2 = Math.max(j2, h2.h());
            }
        }
        return j2;
    }

    public final bbi l() {
        ArrayList arrayList = this.f;
        return (bbi) arrayList.get(arrayList.size() - 1);
    }

    public final long e() {
        if (m()) {
            return this.R;
        }
        if (!this.y) {
            return l().k;
        }
        return Long.MIN_VALUE;
    }

    public final aye c() {
        o();
        return this.q;
    }

    public final void a(int i2, boolean z2, boolean z3) {
        if (!z3) {
            this.L.clear();
        }
        this.U = i2;
        for (axw a2 : this.i) {
            a2.a(i2);
        }
        if (z2) {
            for (axw axw : this.i) {
                axw.b = true;
            }
        }
    }

    public final boolean f() {
        return this.d.d();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbs.a(akh, akh, boolean):akh
     arg types: [akh, akh, int]
     candidates:
      bbs.a(int, boolean, boolean):void
      bbs.a(bit, long, long):void
      biq.a(bit, long, long):void
      bbs.a(akh, akh, boolean):akh */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r14 = this;
            boolean r0 = r14.p
            if (r0 != 0) goto L_0x016d
            int[] r0 = r14.s
            if (r0 != 0) goto L_0x016d
            boolean r0 = r14.k
            if (r0 == 0) goto L_0x016d
            axw[] r0 = r14.i
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0011:
            if (r3 < r1) goto L_0x0161
            aye r0 = r14.q
            r4 = 3
            r1 = -1
            if (r0 != 0) goto L_0x00f2
            axw[] r0 = r14.i
            int r3 = r0.length
            r5 = 6
            r0 = 0
            r6 = 6
            r7 = -1
        L_0x0020:
            r8 = 2
            r9 = 1
            if (r0 < r3) goto L_0x00b5
            bbe r0 = r14.c
            ayc r0 = r0.g
            int r4 = r0.a
            r14.t = r1
            int[] r1 = new int[r3]
            r14.s = r1
            r1 = 0
        L_0x0031:
            if (r1 >= r3) goto L_0x003a
            int[] r5 = r14.s
            r5[r1] = r1
            int r1 = r1 + 1
            goto L_0x0031
        L_0x003a:
            ayc[] r1 = new defpackage.ayc[r3]
            r5 = 0
        L_0x003d:
            if (r5 >= r3) goto L_0x0095
            axw[] r10 = r14.i
            r10 = r10[r5]
            akh r10 = r10.g()
            if (r5 != r7) goto L_0x0072
            akh[] r11 = new defpackage.akh[r4]
            if (r4 == r9) goto L_0x005d
            r12 = 0
        L_0x004e:
            if (r12 >= r4) goto L_0x0068
            akh r13 = r0.a(r12)
            akh r13 = a(r13, r10, r9)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x004e
        L_0x005d:
            akh r12 = r0.a(r2)
            akh r10 = r10.a(r12)
            r11[r2] = r10
        L_0x0068:
            ayc r10 = new ayc
            r10.<init>(r11)
            r1[r5] = r10
            r14.t = r5
            goto L_0x0092
        L_0x0072:
            r11 = 0
            if (r6 != r8) goto L_0x0082
            java.lang.String r12 = r10.i
            boolean r12 = defpackage.bkt.a(r12)
            if (r12 == 0) goto L_0x0081
            akh r11 = r14.B
            goto L_0x0083
        L_0x0081:
        L_0x0082:
        L_0x0083:
            ayc r12 = new ayc
            akh[] r13 = new defpackage.akh[r9]
            akh r10 = a(r11, r10, r2)
            r13[r2] = r10
            r12.<init>(r13)
            r1[r5] = r12
        L_0x0092:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0095:
            aye r0 = r14.a(r1)
            r14.q = r0
            java.util.Set r0 = r14.r
            if (r0 != 0) goto L_0x00a1
            r2 = 1
            goto L_0x00a3
        L_0x00a1:
        L_0x00a3:
            defpackage.bks.b(r2)
            java.util.Set r0 = java.util.Collections.emptySet()
            r14.r = r0
            r14.n()
            bbp r0 = r14.b
            r0.g()
            return
        L_0x00b5:
            axw[] r10 = r14.i
            r10 = r10[r0]
            akh r10 = r10.g()
            java.lang.String r10 = r10.i
            boolean r11 = defpackage.bkt.b(r10)
            if (r11 != 0) goto L_0x00d8
            boolean r8 = defpackage.bkt.a(r10)
            if (r8 != 0) goto L_0x00d6
            boolean r8 = defpackage.bkt.c(r10)
            if (r8 == 0) goto L_0x00d3
            r8 = 3
            goto L_0x00d9
        L_0x00d3:
            r8 = 6
            goto L_0x00d9
        L_0x00d6:
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            int r9 = a(r8)
            int r10 = a(r6)
            if (r9 <= r10) goto L_0x00e6
            r7 = r0
            r6 = r8
            goto L_0x00ed
        L_0x00e6:
            if (r8 == r6) goto L_0x00e9
        L_0x00e8:
            goto L_0x00ed
        L_0x00e9:
            if (r7 != r1) goto L_0x00ec
            goto L_0x00e8
        L_0x00ec:
            r7 = -1
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x00f2:
            int r5 = r0.b
            int[] r0 = new int[r5]
            r14.s = r0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
        L_0x00fc:
            if (r0 < r5) goto L_0x0113
            java.util.ArrayList r0 = r14.h
            int r1 = r0.size()
        L_0x0104:
            if (r2 >= r1) goto L_0x0112
            java.lang.Object r3 = r0.get(r2)
            bbl r3 = (defpackage.bbl) r3
            r3.c()
            int r2 = r2 + 1
            goto L_0x0104
        L_0x0112:
            return
        L_0x0113:
            r1 = 0
        L_0x0114:
            axw[] r3 = r14.i
            int r6 = r3.length
            if (r1 >= r6) goto L_0x015e
            r3 = r3[r1]
            akh r3 = r3.g()
            aye r6 = r14.q
            ayc r6 = r6.a(r0)
            akh r6 = r6.a(r2)
            java.lang.String r7 = r3.i
            java.lang.String r8 = r6.i
            int r9 = defpackage.bkt.g(r7)
            if (r9 == r4) goto L_0x013a
            int r3 = defpackage.bkt.g(r8)
            if (r9 == r3) goto L_0x0156
            goto L_0x015b
        L_0x013a:
            boolean r8 = defpackage.blm.a(r7, r8)
            if (r8 == 0) goto L_0x015b
            java.lang.String r8 = "application/cea-608"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0150
            java.lang.String r8 = "application/cea-708"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0156
        L_0x0150:
            int r3 = r3.B
            int r6 = r6.B
            if (r3 != r6) goto L_0x015b
        L_0x0156:
            int[] r3 = r14.s
            r3[r0] = r1
            goto L_0x015e
        L_0x015b:
            int r1 = r1 + 1
            goto L_0x0114
        L_0x015e:
            int r0 = r0 + 1
            goto L_0x00fc
        L_0x0161:
            r4 = r0[r3]
            akh r4 = r4.g()
            if (r4 == 0) goto L_0x016d
            int r3 = r3 + 1
            goto L_0x0011
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbs.j():void");
    }

    public final void h() {
        this.d.a();
        bbe bbe = this.c;
        IOException iOException = bbe.l;
        if (iOException == null) {
            Uri uri = bbe.m;
            if (uri != null && bbe.q) {
                bbe.f.b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z2) {
        ayl ayl = (ayl) bit;
        this.e.a(ayl.j, ayl.k);
        if (!z2) {
            i();
            if (this.m > 0) {
                this.b.a(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        ayl ayl = (ayl) bit;
        bbe bbe = this.c;
        if (ayl instanceof bbb) {
            bbb bbb = (bbb) ayl;
            bbe.k = bbb.a;
            bbe.i.a(bbb.e.a, (byte[]) bks.a(bbb.b));
        }
        this.e.b(ayl.j, ayl.k);
        if (!this.l) {
            c(this.v);
        } else {
            this.b.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ defpackage.bir a(defpackage.bit r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            r14 = this;
            r0 = r14
            r6 = r20
            r1 = r15
            ayl r1 = (defpackage.ayl) r1
            long r2 = r1.c()
            boolean r4 = r1 instanceof defpackage.bbi
            bip r5 = r0.D
            long r7 = r5.a(r6)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0032
            bbe r11 = r0.c
            bgl r12 = r11.o
            ayc r11 = r11.g
            akh r13 = r1.g
            int r11 = r11.a(r13)
            int r11 = r12.c(r11)
            boolean r7 = r12.a(r11, r7)
            r8 = r7
            goto L_0x0034
        L_0x0032:
            r8 = 0
        L_0x0034:
            r7 = 1
            if (r8 != 0) goto L_0x004d
            bip r2 = r0.D
            r3 = r21
            long r2 = r2.a(r6, r3)
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0047
            bir r2 = defpackage.bix.b
            r9 = r2
            goto L_0x007c
        L_0x0047:
            bir r2 = defpackage.bix.a(r5, r2)
            goto L_0x007b
        L_0x004d:
            if (r4 != 0) goto L_0x0050
        L_0x004f:
            goto L_0x0079
        L_0x0050:
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            java.util.ArrayList r2 = r0.f
            int r3 = r2.size()
            int r3 = r3 + -1
            java.lang.Object r2 = r2.remove(r3)
            bbi r2 = (defpackage.bbi) r2
            if (r2 != r1) goto L_0x0068
            r5 = 1
            goto L_0x006a
        L_0x0068:
        L_0x006a:
            defpackage.bks.b(r5)
            java.util.ArrayList r2 = r0.f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0079
            long r2 = r0.v
            r0.R = r2
        L_0x0079:
            bir r2 = defpackage.bix.a
        L_0x007b:
            r9 = r2
        L_0x007c:
            axg r2 = r0.e
            long r3 = r1.j
            long r10 = r1.k
            boolean r1 = r9.a()
            r7 = r7 ^ r1
            r1 = r2
            r2 = r3
            r4 = r10
            r6 = r20
            r1.a(r2, r4, r6, r7)
            if (r8 == 0) goto L_0x00a0
            boolean r1 = r0.l
            if (r1 != 0) goto L_0x009b
            long r1 = r0.v
            r14.c(r1)
            goto L_0x00a0
        L_0x009b:
            bbp r1 = r0.b
            r1.a(r14)
        L_0x00a0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbs.a(bit, long, long, java.io.IOException, int):bir");
    }

    public final void g() {
        for (axw k2 : this.i) {
            k2.k();
        }
    }

    public final void k() {
        this.g.post(this.H);
    }

    public final void i() {
        for (axw a2 : this.i) {
            a2.a(this.w);
        }
        this.w = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final boolean a(long j2, boolean z2) {
        this.v = j2;
        if (!m()) {
            if (this.k && !z2) {
                int length = this.i.length;
                int i2 = 0;
                while (i2 < length) {
                    axw axw = this.i[i2];
                    axw.i();
                    if (axw.a(j2, false) != -1 || (!this.Q[i2] && this.P)) {
                        i2++;
                    }
                }
                return false;
            }
            this.R = j2;
            this.y = false;
            this.f.clear();
            if (this.d.d()) {
                this.d.e();
            } else {
                this.d.c();
                i();
            }
            return true;
        }
        this.R = j2;
        return true;
    }

    public final void n() {
        this.l = true;
    }

    public final void a(boolean z2) {
        this.c.j = z2;
    }

    public final void b(long j2) {
        this.T = j2;
        for (axw b2 : this.i) {
            b2.b(j2);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:18:0x0052 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    public final aov a(int i2, int i3) {
        Set set = z;
        Integer valueOf = Integer.valueOf(i3);
        axw axw = null;
        if (!set.contains(valueOf)) {
            int i4 = 0;
            while (true) {
                axw[] axwArr = this.i;
                if (i4 < axwArr.length) {
                    if (this.K[i4] == i2) {
                        axw = axwArr[i4];
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        } else {
            bks.a(z.contains(valueOf));
            int i5 = this.M.get(i3, -1);
            if (i5 != -1) {
                if (this.L.add(valueOf)) {
                    this.K[i5] = i2;
                }
                axw = this.K[i5] == i2 ? this.i[i5] : b(i2, i3);
            }
        }
        if (axw == null) {
            if (this.S) {
                return b(i2, i3);
            }
            int length = this.i.length;
            bbr bbr = new bbr(this.A, this.C, this.J);
            bbr.b(this.T);
            bbr.a(this.U);
            bbr.c = this;
            int i6 = length + 1;
            int[] copyOf = Arrays.copyOf(this.K, i6);
            this.K = copyOf;
            copyOf[length] = i2;
            this.i = (axw[]) blm.b(this.i, bbr);
            boolean[] copyOf2 = Arrays.copyOf(this.Q, i6);
            this.Q = copyOf2;
            boolean z2 = true;
            if (!(i3 == 1 || i3 == 2)) {
                z2 = false;
            }
            copyOf2[length] = z2;
            this.P |= z2;
            this.L.add(Integer.valueOf(i3));
            this.M.append(i3, length);
            if (a(i3) > a(this.O)) {
                this.j = length;
                this.O = i3;
            }
            this.u = Arrays.copyOf(this.u, i6);
            axw = bbr;
        }
        if (i3 != 4) {
            return axw;
        }
        if (this.N == null) {
            this.N = new bbq(axw, this.E);
        }
        return this.N;
    }
}
