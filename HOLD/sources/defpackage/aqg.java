package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: aqg  reason: default package */
/* compiled from: PG */
public final class aqg implements aoi {
    private static final byte[] a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final akh b = akh.a(null, "application/x-emsg", Long.MAX_VALUE);
    private long A;
    private long B;
    private aqf C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private aok I;
    private aov[] J;
    private aov[] K;
    private boolean L;
    private final int c;
    private final aqo d;
    private final List e;
    private final anq f;
    private final SparseArray g;
    private final bky h;
    private final bky i;
    private final bky j;
    private final byte[] k;
    private final bky l;
    private final blj m;
    private final aug n;
    private final bky o;
    private final ArrayDeque p;
    private final ArrayDeque q;
    private final aov r;
    private int s;
    private int t;
    private long u;
    private int v;
    private bky w;
    private long x;
    private int y;
    private long z;

    public aqg() {
        this((byte) 0);
    }

    public aqg(byte b2) {
        this(0, null);
    }

    public aqg(int i2, aqo aqo) {
        this(i2, null, aqo, null, Collections.emptyList());
    }

    public aqg(int i2, blj blj, aqo aqo, anq anq, List list) {
        this(i2, blj, aqo, anq, list, null);
    }

    public aqg(int i2, blj blj, aqo aqo, anq anq, List list, aov aov) {
        int i3;
        if (aqo != null) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.c = i2 | i3;
        this.m = blj;
        this.d = aqo;
        this.f = anq;
        this.e = Collections.unmodifiableList(list);
        this.r = aov;
        this.n = new aug();
        this.o = new bky(16);
        this.h = new bky(bkw.a);
        this.i = new bky(5);
        this.j = new bky();
        this.k = new byte[16];
        this.l = new bky(this.k);
        this.p = new ArrayDeque();
        this.q = new ArrayDeque();
        this.g = new SparseArray();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        a();
    }

    private final void a() {
        this.s = 0;
        this.v = 0;
    }

    private static final aqc a(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (aqc) sparseArray.valueAt(0);
        }
        return (aqc) bks.a((aqc) sparseArray.get(i2));
    }

    private static anq a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            apt apt = (apt) list.get(i2);
            if (apt.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = apt.a.a;
                UUID a2 = bty.a(bArr);
                if (a2 != null) {
                    arrayList.add(new anp(a2, "video/mp4", bArr));
                } else {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
            }
        }
        if (arrayList != null) {
            return new anq(arrayList);
        }
        return null;
    }

    public final void a(aok aok) {
        this.I = aok;
        aqo aqo = this.d;
        if (aqo != null) {
            aqf aqf = new aqf(aok.a(0, aqo.b));
            aqf.a(this.d, new aqc(0, 0, 0, 0));
            this.g.put(0, aqf);
            b();
            this.I.S();
        }
    }

    private final void b() {
        int i2;
        if (this.J == null) {
            aov[] aovArr = new aov[2];
            this.J = aovArr;
            aov aov = this.r;
            if (aov != null) {
                aovArr[0] = aov;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.c & 4) != 0) {
                this.J[i2] = this.I.a(this.g.size(), 4);
                i2++;
            }
            aov[] aovArr2 = (aov[]) Arrays.copyOf(this.J, i2);
            this.J = aovArr2;
            for (aov a2 : aovArr2) {
                a2.a(b);
            }
        }
        if (this.K == null) {
            this.K = new aov[this.e.size()];
            for (int i3 = 0; i3 < this.K.length; i3++) {
                aov a3 = this.I.a(this.g.size() + 1 + i3, 3);
                a3.a((akh) this.e.get(i3));
                this.K[i3] = a3;
            }
        }
    }

    private static void a(bky bky, int i2, aqq aqq) {
        bky.c(i2 + 8);
        int d2 = apu.d(bky.j());
        if ((d2 & 1) == 0) {
            boolean z2 = (d2 & 2) != 0;
            int n2 = bky.n();
            int i3 = aqq.e;
            if (n2 == i3) {
                Arrays.fill(aqq.m, 0, n2, z2);
                aqq.a(bky.b());
                bky.a(aqq.p.a, 0, aqq.o);
                aqq.p.c(0);
                aqq.q = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(n2);
            sb.append(", ");
            sb.append(i3);
            throw new ako(sb.toString());
        }
        throw new ako("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:223:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0596  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(long r55) {
        /*
            r54 = this;
            r0 = r54
        L_0x0002:
            java.util.ArrayDeque r1 = r0.p
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0731
            java.util.ArrayDeque r1 = r0.p
            java.lang.Object r1 = r1.peek()
            aps r1 = (defpackage.aps) r1
            long r1 = r1.a
            int r3 = (r1 > r55 ? 1 : (r1 == r55 ? 0 : -1))
            if (r3 != 0) goto L_0x0731
            java.util.ArrayDeque r1 = r0.p
            java.lang.Object r1 = r1.pop()
            aps r1 = (defpackage.aps) r1
            int r2 = r1.d
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4 = 12
            r7 = 8
            r8 = 0
            r9 = 1
            if (r2 != r3) goto L_0x0181
            aqo r2 = r0.d
            if (r2 != 0) goto L_0x0033
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
        L_0x0035:
            java.lang.String r3 = "Unexpected moov box."
            defpackage.bks.b(r2, r3)
            anq r2 = r0.f
            if (r2 == 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            java.util.List r2 = r1.b
            anq r2 = a(r2)
        L_0x0045:
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            aps r3 = r1.b(r3)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            java.util.List r10 = r3.b
            int r10 = r10.size()
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x005d:
            if (r5 >= r10) goto L_0x00cd
            java.util.List r6 = r3.b
            java.lang.Object r6 = r6.get(r5)
            apt r6 = (defpackage.apt) r6
            int r11 = r6.d
            r12 = 1953654136(0x74726578, float:7.6818474E31)
            if (r11 != r12) goto L_0x00a6
            bky r6 = r6.a
            r6.c(r4)
            int r11 = r6.j()
            int r12 = r6.n()
            int r13 = r6.n()
            int r14 = r6.n()
            int r6 = r6.j()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            aqc r4 = new aqc
            int r12 = r12 + -1
            r4.<init>(r12, r13, r14, r6)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            aqc r4 = (defpackage.aqc) r4
            r15.put(r6, r4)
            goto L_0x00c7
        L_0x00a6:
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r11 == r4) goto L_0x00ac
            goto L_0x00c7
        L_0x00ac:
            bky r4 = r6.a
            r4.c(r7)
            int r6 = r4.j()
            int r6 = defpackage.apu.c(r6)
            if (r6 != 0) goto L_0x00c0
            long r11 = r4.h()
            goto L_0x00c4
        L_0x00c0:
            long r11 = r4.p()
        L_0x00c4:
            r16 = r11
        L_0x00c7:
            int r5 = r5 + 1
            r4 = 12
            goto L_0x005d
        L_0x00cd:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List r4 = r1.c
            int r4 = r4.size()
            r5 = 0
        L_0x00d9:
            if (r5 >= r4) goto L_0x010a
            java.util.List r6 = r1.c
            java.lang.Object r6 = r6.get(r5)
            r10 = r6
            aps r10 = (defpackage.aps) r10
            int r6 = r10.d
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 != r7) goto L_0x0105
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            apt r11 = r1.a(r6)
            r6 = 0
            r12 = r16
            r14 = r2
            r7 = r15
            r15 = r6
            aqo r6 = defpackage.aqb.a(r10, r11, r12, r14, r15)
            if (r6 != 0) goto L_0x00ff
            goto L_0x0106
        L_0x00ff:
            int r10 = r6.a
            r3.put(r10, r6)
            goto L_0x0106
        L_0x0105:
            r7 = r15
        L_0x0106:
            int r5 = r5 + 1
            r15 = r7
            goto L_0x00d9
        L_0x010a:
            r7 = r15
            int r1 = r3.size()
            android.util.SparseArray r2 = r0.g
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0143
            android.util.SparseArray r2 = r0.g
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r9 = 0
        L_0x0122:
            defpackage.bks.b(r9)
        L_0x0125:
            if (r8 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r8)
            aqo r2 = (defpackage.aqo) r2
            android.util.SparseArray r4 = r0.g
            int r5 = r2.a
            java.lang.Object r4 = r4.get(r5)
            aqf r4 = (defpackage.aqf) r4
            int r5 = r2.a
            aqc r5 = a(r7, r5)
            r4.a(r2, r5)
            int r8 = r8 + 1
            goto L_0x0125
        L_0x0143:
        L_0x0145:
            if (r8 >= r1) goto L_0x0177
            java.lang.Object r2 = r3.valueAt(r8)
            aqo r2 = (defpackage.aqo) r2
            aqf r4 = new aqf
            aok r5 = r0.I
            int r6 = r2.b
            aov r5 = r5.a(r8, r6)
            r4.<init>(r5)
            int r5 = r2.a
            aqc r5 = a(r7, r5)
            r4.a(r2, r5)
            android.util.SparseArray r5 = r0.g
            int r6 = r2.a
            r5.put(r6, r4)
            long r4 = r0.A
            long r9 = r2.e
            long r4 = java.lang.Math.max(r4, r9)
            r0.A = r4
            int r8 = r8 + 1
            goto L_0x0145
        L_0x0177:
            r54.b()
            aok r1 = r0.I
            r1.S()
            goto L_0x0002
        L_0x0181:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r3) goto L_0x071c
            android.util.SparseArray r2 = r0.g
            int r3 = r0.c
            byte[] r4 = r0.k
            java.util.List r10 = r1.c
            int r10 = r10.size()
            r11 = 0
        L_0x0193:
            if (r11 >= r10) goto L_0x067f
            java.util.List r13 = r1.c
            java.lang.Object r13 = r13.get(r11)
            aps r13 = (defpackage.aps) r13
            int r14 = r13.d
            r15 = 1953653094(0x74726166, float:7.6813435E31)
            if (r14 != r15) goto L_0x065e
            r14 = 1952868452(0x74666864, float:7.301914E31)
            apt r14 = r13.a(r14)
            bky r14 = r14.a
            r14.c(r7)
            int r15 = r14.j()
            int r15 = defpackage.apu.d(r15)
            int r12 = r14.j()
            int r5 = r2.size()
            if (r5 != r9) goto L_0x01ca
            java.lang.Object r5 = r2.valueAt(r8)
            aqf r5 = (defpackage.aqf) r5
            r12 = r5
            goto L_0x01d1
        L_0x01ca:
            java.lang.Object r5 = r2.get(r12)
            aqf r5 = (defpackage.aqf) r5
            r12 = r5
        L_0x01d1:
            if (r12 == 0) goto L_0x021d
            r5 = r15 & 1
            if (r5 == 0) goto L_0x01e1
            long r5 = r14.p()
            aqq r8 = r12.b
            r8.b = r5
            r8.c = r5
        L_0x01e1:
            aqc r5 = r12.d
            r6 = r15 & 2
            if (r6 == 0) goto L_0x01ee
            int r6 = r14.n()
            int r6 = r6 + -1
            goto L_0x01f0
        L_0x01ee:
            int r6 = r5.a
        L_0x01f0:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x01f9
            int r8 = r14.n()
            goto L_0x01fb
        L_0x01f9:
            int r8 = r5.b
        L_0x01fb:
            r18 = r15 & 16
            if (r18 == 0) goto L_0x0206
            int r18 = r14.n()
            r9 = r18
            goto L_0x0208
        L_0x0206:
            int r9 = r5.c
        L_0x0208:
            r15 = r15 & 32
            if (r15 == 0) goto L_0x0211
            int r5 = r14.n()
            goto L_0x0213
        L_0x0211:
            int r5 = r5.d
        L_0x0213:
            aqq r14 = r12.b
            aqc r15 = new aqc
            r15.<init>(r6, r8, r9, r5)
            r14.a = r15
            goto L_0x021f
        L_0x021d:
            r12 = 0
        L_0x021f:
            if (r12 == 0) goto L_0x064e
            aqq r5 = r12.b
            long r8 = r5.r
            r12.a()
            r6 = 1952867444(0x74666474, float:7.3014264E31)
            apt r14 = r13.a(r6)
            if (r14 == 0) goto L_0x0252
            r14 = r3 & 2
            if (r14 != 0) goto L_0x0252
            apt r6 = r13.a(r6)
            bky r6 = r6.a
            r6.c(r7)
            int r8 = r6.j()
            int r8 = defpackage.apu.c(r8)
            r9 = 1
            if (r8 != r9) goto L_0x024e
            long r8 = r6.p()
            goto L_0x0252
        L_0x024e:
            long r8 = r6.h()
        L_0x0252:
            java.util.List r6 = r13.b
            int r14 = r6.size()
            r20 = r2
            r2 = 0
            r7 = 0
            r15 = 0
        L_0x025e:
            r21 = r8
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            if (r15 >= r14) goto L_0x028c
            java.lang.Object r9 = r6.get(r15)
            apt r9 = (defpackage.apt) r9
            r23 = r10
            int r10 = r9.d
            if (r10 != r8) goto L_0x0282
            bky r8 = r9.a
            r9 = 12
            r8.c(r9)
            int r8 = r8.n()
            if (r8 <= 0) goto L_0x0284
            int r2 = r2 + r8
            int r7 = r7 + 1
            goto L_0x0284
        L_0x0282:
            r9 = 12
        L_0x0284:
            int r15 = r15 + 1
            r8 = r21
            r10 = r23
            goto L_0x025e
        L_0x028c:
            r23 = r10
            r9 = 12
            r10 = 0
            r12.g = r10
            r12.f = r10
            r12.e = r10
            aqq r10 = r12.b
            r10.d = r7
            r10.e = r2
            int[] r15 = r10.g
            if (r15 == 0) goto L_0x02a4
            int r15 = r15.length
            if (r15 >= r7) goto L_0x02ac
        L_0x02a4:
            long[] r15 = new long[r7]
            r10.f = r15
            int[] r7 = new int[r7]
            r10.g = r7
        L_0x02ac:
            int[] r7 = r10.h
            if (r7 != 0) goto L_0x02b1
            goto L_0x02b5
        L_0x02b1:
            int r7 = r7.length
            if (r7 < r2) goto L_0x02b5
            goto L_0x02cd
        L_0x02b5:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r7 = new int[r2]
            r10.h = r7
            int[] r7 = new int[r2]
            r10.i = r7
            long[] r7 = new long[r2]
            r10.j = r7
            boolean[] r7 = new boolean[r2]
            r10.k = r7
            boolean[] r2 = new boolean[r2]
            r10.m = r2
        L_0x02cd:
            r2 = 0
            r7 = 0
            r10 = 0
        L_0x02d0:
            r15 = 2
            r24 = 0
            if (r2 < r14) goto L_0x04ca
            aqo r2 = r12.c
            aqc r6 = r5.a
            int r6 = r6.a
            aqp r2 = r2.a(r6)
            r6 = 1935763834(0x7361697a, float:1.785898E31)
            apt r6 = r13.a(r6)
            if (r6 == 0) goto L_0x035a
            bky r6 = r6.a
            int r7 = r2.d
            r8 = 8
            r6.c(r8)
            int r10 = r6.j()
            int r10 = defpackage.apu.d(r10)
            r12 = 1
            r10 = r10 & r12
            if (r10 != r12) goto L_0x0300
            r6.d(r8)
        L_0x0300:
            int r8 = r6.d()
            int r10 = r6.n()
            int r12 = r5.e
            if (r10 != r12) goto L_0x0339
            if (r8 != 0) goto L_0x0325
            boolean[] r8 = r5.m
            r12 = 0
            r14 = 0
        L_0x0312:
            if (r12 >= r10) goto L_0x0335
            int r9 = r6.d()
            int r14 = r14 + r9
            if (r9 <= r7) goto L_0x031d
            r9 = 1
            goto L_0x031f
        L_0x031d:
            r9 = 0
        L_0x031f:
            r8[r12] = r9
            int r12 = r12 + 1
            goto L_0x0312
        L_0x0325:
            if (r8 <= r7) goto L_0x0329
            r6 = 1
            goto L_0x032b
        L_0x0329:
            r6 = 0
        L_0x032b:
            int r14 = r8 * r10
            boolean[] r7 = r5.m
            r8 = 0
            java.util.Arrays.fill(r7, r8, r10, r6)
        L_0x0335:
            r5.a(r14)
            goto L_0x035a
        L_0x0339:
            ako r1 = new ako
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Length mismatch: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x035a:
            r6 = 1935763823(0x7361696f, float:1.7858967E31)
            apt r6 = r13.a(r6)
            if (r6 == 0) goto L_0x03ad
            bky r6 = r6.a
            r7 = 8
            r6.c(r7)
            int r8 = r6.j()
            int r9 = defpackage.apu.d(r8)
            r10 = 1
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0379
            r6.d(r7)
        L_0x0379:
            int r7 = r6.n()
            if (r7 != r10) goto L_0x0394
            long r9 = r5.c
            int r7 = defpackage.apu.c(r8)
            if (r7 != 0) goto L_0x038c
            long r6 = r6.h()
            goto L_0x0390
        L_0x038c:
            long r6 = r6.p()
        L_0x0390:
            long r9 = r9 + r6
            r5.c = r9
            goto L_0x03ad
        L_0x0394:
            ako r1 = new ako
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03ad:
            r6 = 1936027235(0x73656e63, float:1.8177412E31)
            apt r6 = r13.a(r6)
            if (r6 == 0) goto L_0x03bc
            bky r6 = r6.a
            r7 = 0
            a(r6, r7, r5)
        L_0x03bc:
            r6 = 1935828848(0x73626770, float:1.7937577E31)
            apt r6 = r13.a(r6)
            r7 = 1936158820(0x73677064, float:1.8336489E31)
            apt r7 = r13.a(r7)
            if (r6 == 0) goto L_0x0489
            if (r7 == 0) goto L_0x0489
            bky r6 = r6.a
            bky r7 = r7.a
            if (r2 == 0) goto L_0x03d9
            java.lang.String r12 = r2.b
            r28 = r12
            goto L_0x03dc
        L_0x03d9:
            r28 = 0
        L_0x03dc:
            r2 = 8
            r6.c(r2)
            int r2 = r6.j()
            int r8 = r6.j()
            r9 = 1936025959(0x73656967, float:1.817587E31)
            if (r8 != r9) goto L_0x0489
            int r2 = defpackage.apu.c(r2)
            r8 = 4
            r10 = 1
            if (r2 != r10) goto L_0x03f9
            r6.d(r8)
        L_0x03f9:
            int r2 = r6.j()
            if (r2 != r10) goto L_0x0481
            r2 = 8
            r7.c(r2)
            int r2 = r7.j()
            int r6 = r7.j()
            if (r6 != r9) goto L_0x0489
            int r2 = defpackage.apu.c(r2)
            if (r2 != r10) goto L_0x0426
            long r9 = r7.h()
            int r2 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r2 == 0) goto L_0x041e
            goto L_0x042c
        L_0x041e:
            ako r1 = new ako
            java.lang.String r2 = "Variable length description in sgpd found (unsupported)"
            r1.<init>(r2)
            throw r1
        L_0x0426:
            if (r2 < r15) goto L_0x042c
            r7.d(r8)
        L_0x042c:
            long r9 = r7.h()
            r14 = 1
            int r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0479
            r2 = 1
            r7.d(r2)
            int r6 = r7.d()
            r9 = r6 & 240(0xf0, float:3.36E-43)
            int r31 = r9 >> 4
            r32 = r6 & 15
            int r6 = r7.d()
            if (r6 != r2) goto L_0x0489
            int r29 = r7.d()
            r2 = 16
            byte[] r6 = new byte[r2]
            r8 = 0
            r7.a(r6, r8, r2)
            if (r29 != 0) goto L_0x0465
            int r2 = r7.d()
            byte[] r12 = new byte[r2]
            r7.a(r12, r8, r2)
            r33 = r12
            goto L_0x0468
        L_0x0465:
            r33 = 0
        L_0x0468:
            r2 = 1
            r5.l = r2
            aqp r2 = new aqp
            r27 = 1
            r26 = r2
            r30 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r5.n = r2
            goto L_0x0489
        L_0x0479:
            ako r1 = new ako
            java.lang.String r2 = "Entry count in sgpd != 1 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0481:
            ako r1 = new ako
            java.lang.String r2 = "Entry count in sbgp != 1 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0489:
            java.util.List r2 = r13.b
            int r2 = r2.size()
            r6 = 0
        L_0x0490:
            if (r6 >= r2) goto L_0x04bd
            java.util.List r7 = r13.b
            java.lang.Object r7 = r7.get(r6)
            apt r7 = (defpackage.apt) r7
            int r8 = r7.d
            r9 = 1970628964(0x75756964, float:3.1109627E32)
            if (r8 != r9) goto L_0x04ba
            bky r7 = r7.a
            r8 = 8
            r7.c(r8)
            r8 = 16
            r9 = 0
            r7.a(r4, r9, r8)
            byte[] r9 = defpackage.aqg.a
            boolean r9 = java.util.Arrays.equals(r4, r9)
            if (r9 != 0) goto L_0x04b7
            goto L_0x04ba
        L_0x04b7:
            a(r7, r8, r5)
        L_0x04ba:
            int r6 = r6 + 1
            goto L_0x0490
        L_0x04bd:
            r35 = r1
            r26 = r3
            r19 = r4
            r37 = r11
            r9 = 1
            r17 = 0
            goto L_0x066c
        L_0x04ca:
            java.lang.Object r9 = r6.get(r2)
            apt r9 = (defpackage.apt) r9
            int r15 = r9.d
            if (r15 != r8) goto L_0x0619
            int r15 = r10 + 1
            bky r9 = r9.a
            r8 = 8
            r9.c(r8)
            int r19 = r9.j()
            int r8 = defpackage.apu.d(r19)
            r19 = r4
            aqo r4 = r12.c
            r29 = r5
            aqq r5 = r12.b
            r30 = r6
            aqc r6 = r5.a
            r31 = r12
            int[] r12 = r5.g
            int r32 = r9.n()
            r12[r10] = r32
            long[] r12 = r5.f
            r32 = r13
            r33 = r14
            long r13 = r5.b
            r12[r10] = r13
            r34 = r8 & 1
            if (r34 != 0) goto L_0x050e
            r35 = r1
            r34 = r15
            goto L_0x051a
        L_0x050e:
            r34 = r15
            int r15 = r9.j()
            r35 = r1
            long r0 = (long) r15
            long r13 = r13 + r0
            r12[r10] = r13
        L_0x051a:
            r0 = r8 & 4
            int r1 = r6.d
            if (r0 != 0) goto L_0x0522
            goto L_0x0526
        L_0x0522:
            int r1 = r9.n()
        L_0x0526:
            r12 = r8 & 256(0x100, float:3.59E-43)
            r13 = r8 & 512(0x200, float:7.175E-43)
            r14 = r8 & 1024(0x400, float:1.435E-42)
            r8 = r8 & 2048(0x800, float:2.87E-42)
            long[] r15 = r4.h
            if (r15 == 0) goto L_0x0554
            r36 = r1
            int r1 = r15.length
            r37 = r11
            r11 = 1
            if (r1 != r11) goto L_0x0558
            r1 = 0
            r38 = r15[r1]
            int r11 = (r38 > r24 ? 1 : (r38 == r24 ? 0 : -1))
            if (r11 != 0) goto L_0x0552
            long[] r11 = r4.i
            r38 = r11[r1]
            r40 = 1000(0x3e8, double:4.94E-321)
            r11 = r2
            long r1 = r4.c
            r42 = r1
            long r24 = defpackage.blm.b(r38, r40, r42)
            goto L_0x055a
        L_0x0552:
            r11 = r2
            goto L_0x0559
        L_0x0554:
            r36 = r1
            r37 = r11
        L_0x0558:
            r11 = r2
        L_0x0559:
        L_0x055a:
            int[] r1 = r5.h
            int[] r2 = r5.i
            long[] r15 = r5.j
            r38 = r11
            boolean[] r11 = r5.k
            r39 = r11
            int r11 = r4.b
            r40 = r1
            r1 = 2
            if (r11 != r1) goto L_0x0575
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0573
            r1 = 1
            goto L_0x0576
        L_0x0573:
        L_0x0575:
            r1 = 0
        L_0x0576:
            int[] r11 = r5.g
            r11 = r11[r10]
            int r11 = r11 + r7
            r26 = r3
            long r3 = r4.c
            if (r10 <= 0) goto L_0x0586
            r47 = r3
            long r3 = r5.r
            goto L_0x058a
        L_0x0586:
            r47 = r3
            r3 = r21
        L_0x058a:
            if (r7 < r11) goto L_0x0596
            r5.r = r3
            r7 = r11
            r10 = r34
            r9 = 1
            r17 = 0
            goto L_0x0630
        L_0x0596:
            if (r12 != 0) goto L_0x059b
            int r10 = r6.b
            goto L_0x059f
        L_0x059b:
            int r10 = r9.n()
        L_0x059f:
            if (r13 == 0) goto L_0x05aa
            int r41 = r9.n()
            r49 = r5
            r5 = r41
            goto L_0x05ae
        L_0x05aa:
            r49 = r5
            int r5 = r6.c
        L_0x05ae:
            if (r7 != 0) goto L_0x05b7
            if (r0 == 0) goto L_0x05b7
            r50 = r0
            r0 = r36
            goto L_0x05c6
        L_0x05b7:
            if (r14 == 0) goto L_0x05c2
            int r41 = r9.j()
            r50 = r0
            r0 = r41
            goto L_0x05c6
        L_0x05c2:
            r50 = r0
            int r0 = r6.d
        L_0x05c6:
            if (r8 != 0) goto L_0x05d3
            r17 = 0
            r2[r7] = r17
            r51 = r6
            r53 = r8
            r52 = r9
            goto L_0x05e9
        L_0x05d3:
            r17 = 0
            r51 = r6
            int r6 = r9.j()
            r53 = r8
            r52 = r9
            long r8 = (long) r6
            r41 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r41
            long r8 = r8 / r47
            int r6 = (int) r8
            r2[r7] = r6
        L_0x05e9:
            r43 = 1000(0x3e8, double:4.94E-321)
            r41 = r3
            r45 = r47
            long r8 = defpackage.blm.b(r41, r43, r45)
            long r8 = r8 - r24
            r15[r7] = r8
            r40[r7] = r5
            r5 = 16
            int r0 = r0 >> r5
            r9 = 1
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0602
        L_0x0600:
            r0 = 0
            goto L_0x0607
        L_0x0602:
            if (r1 == 0) goto L_0x0606
            if (r7 != 0) goto L_0x0600
        L_0x0606:
            r0 = 1
        L_0x0607:
            r39[r7] = r0
            long r5 = (long) r10
            long r3 = r3 + r5
            int r7 = r7 + 1
            r5 = r49
            r0 = r50
            r6 = r51
            r9 = r52
            r8 = r53
            goto L_0x058a
        L_0x0619:
            r35 = r1
            r38 = r2
            r26 = r3
            r19 = r4
            r29 = r5
            r30 = r6
            r37 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r9 = 1
            r17 = 0
        L_0x0630:
            int r2 = r38 + 1
            r0 = r54
            r4 = r19
            r3 = r26
            r5 = r29
            r6 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r1 = r35
            r11 = r37
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            r9 = 12
            goto L_0x02d0
        L_0x064e:
            r35 = r1
            r20 = r2
            r26 = r3
            r19 = r4
            r23 = r10
            r37 = r11
            r9 = 1
            r17 = 0
            goto L_0x066c
        L_0x065e:
            r35 = r1
            r20 = r2
            r26 = r3
            r19 = r4
            r23 = r10
            r37 = r11
            r17 = 0
        L_0x066c:
            int r11 = r37 + 1
            r7 = 8
            r8 = 0
            r0 = r54
            r4 = r19
            r2 = r20
            r10 = r23
            r3 = r26
            r1 = r35
            goto L_0x0193
        L_0x067f:
            r35 = r1
            r17 = 0
            r0 = r54
            anq r1 = r0.f
            if (r1 != 0) goto L_0x0692
            r1 = r35
            java.util.List r1 = r1.b
            anq r12 = a(r1)
            goto L_0x0694
        L_0x0692:
            r12 = 0
        L_0x0694:
            if (r12 == 0) goto L_0x06ce
            android.util.SparseArray r1 = r0.g
            int r1 = r1.size()
            r2 = 0
        L_0x069d:
            if (r2 >= r1) goto L_0x06ce
            android.util.SparseArray r3 = r0.g
            java.lang.Object r3 = r3.valueAt(r2)
            aqf r3 = (defpackage.aqf) r3
            aqo r4 = r3.c
            aqq r5 = r3.b
            aqc r5 = r5.a
            int r5 = r5.a
            aqp r4 = r4.a(r5)
            if (r4 == 0) goto L_0x06b8
            java.lang.String r4 = r4.b
            goto L_0x06ba
        L_0x06b8:
            r4 = 0
        L_0x06ba:
            aov r5 = r3.a
            aqo r3 = r3.c
            akh r3 = r3.f
            anq r4 = r12.a(r4)
            akh r3 = r3.a(r4)
            r5.a(r3)
            int r2 = r2 + 1
            goto L_0x069d
        L_0x06ce:
            long r1 = r0.z
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0002
            android.util.SparseArray r1 = r0.g
            int r1 = r1.size()
            r2 = 0
        L_0x06e0:
            if (r2 >= r1) goto L_0x0712
            android.util.SparseArray r3 = r0.g
            java.lang.Object r3 = r3.valueAt(r2)
            aqf r3 = (defpackage.aqf) r3
            long r4 = r0.z
            long r4 = defpackage.aja.a(r4)
            int r6 = r3.e
        L_0x06f2:
            aqq r7 = r3.b
            int r8 = r7.e
            if (r6 < r8) goto L_0x06f9
            goto L_0x070f
        L_0x06f9:
            long r7 = r7.b(r6)
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x070f
            aqq r7 = r3.b
            boolean[] r7 = r7.k
            boolean r7 = r7[r6]
            if (r7 != 0) goto L_0x070a
            goto L_0x070c
        L_0x070a:
            r3.h = r6
        L_0x070c:
            int r6 = r6 + 1
            goto L_0x06f2
        L_0x070f:
            int r2 = r2 + 1
            goto L_0x06e0
        L_0x0712:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.z = r1
            goto L_0x0002
        L_0x071c:
            java.util.ArrayDeque r2 = r0.p
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0002
            java.util.ArrayDeque r2 = r0.p
            java.lang.Object r2 = r2.peek()
            aps r2 = (defpackage.aps) r2
            r2.a(r1)
            goto L_0x0002
        L_0x0731:
            r54.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.a(long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: aqf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.aoj r29, defpackage.aop r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
        L_0x0004:
            int r2 = r0.s
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 0
            r8 = 1
            if (r2 == 0) goto L_0x05ab
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x0359
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x02fa
            if (r2 == r12) goto L_0x0021
            goto L_0x014d
        L_0x0021:
            aqf r2 = r0.C
            if (r2 == 0) goto L_0x0026
            goto L_0x0073
        L_0x0026:
            android.util.SparseArray r2 = r0.g
            int r13 = r2.size()
            r14 = r3
            r4 = r6
            r3 = 0
        L_0x002f:
            if (r3 >= r13) goto L_0x0053
            java.lang.Object r16 = r2.valueAt(r3)
            r11 = r16
            aqf r11 = (defpackage.aqf) r11
            int r5 = r11.g
            aqq r9 = r11.b
            int r7 = r9.d
            if (r5 == r7) goto L_0x004d
            long[] r7 = r9.f
            r19 = r7[r5]
            int r5 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x004d
            r4 = r11
            r14 = r19
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            int r3 = r3 + 1
            r5 = 2
            goto L_0x002f
        L_0x0053:
            if (r4 == 0) goto L_0x02df
            aqq r2 = r4.b
            long[] r2 = r2.f
            int r3 = r4.g
            r13 = r2[r3]
            r2 = r1
            aof r2 = (defpackage.aof) r2
            long r2 = r2.c
            long r13 = r13 - r2
            int r9 = (int) r13
            if (r9 >= 0) goto L_0x006d
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r10, r2)
            r9 = 0
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            r1.a(r9)
            r0.C = r4
        L_0x0073:
            aqf r2 = r0.C
            aqq r3 = r2.b
            int[] r3 = r3.h
            int r4 = r2.e
            r3 = r3[r4]
            r0.D = r3
            int r5 = r2.h
            if (r4 >= r5) goto L_0x00bc
            r1.a(r3)
            aqf r1 = r0.C
            aqp r2 = r1.c()
            if (r2 == 0) goto L_0x00ad
            aqq r3 = r1.b
            bky r3 = r3.p
            int r2 = r2.d
            if (r2 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r3.d(r2)
        L_0x009a:
            aqq r2 = r1.b
            int r1 = r1.e
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L_0x00ad
            int r1 = r3.e()
            int r1 = r1 * 6
            r3.d(r1)
        L_0x00ad:
            aqf r1 = r0.C
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00b7
            r0.C = r6
        L_0x00b7:
            r0.s = r12
            goto L_0x02dd
        L_0x00bc:
            aqo r2 = r2.c
            int r2 = r2.g
            if (r2 != r8) goto L_0x00cb
            int r3 = r3 + -8
            r0.D = r3
            r2 = 8
            r1.a(r2)
        L_0x00cb:
            aqf r2 = r0.C
            aqp r3 = r2.c()
            if (r3 != 0) goto L_0x00d5
            r9 = 0
            goto L_0x0130
        L_0x00d5:
            int r4 = r3.d
            if (r4 != 0) goto L_0x00e5
            byte[] r3 = r3.e
            bky r4 = r2.j
            int r5 = r3.length
            r4.a(r3, r5)
            bky r3 = r2.j
            r4 = r5
            goto L_0x00eb
        L_0x00e5:
            aqq r3 = r2.b
            bky r3 = r3.p
        L_0x00eb:
            aqq r5 = r2.b
            int r7 = r2.e
            boolean r5 = r5.c(r7)
            bky r7 = r2.i
            byte[] r9 = r7.a
            if (r5 != 0) goto L_0x00fb
            r10 = 0
            goto L_0x00fe
        L_0x00fb:
            r10 = 128(0x80, float:1.794E-43)
        L_0x00fe:
            r10 = r10 | r4
            byte r10 = (byte) r10
            r11 = 0
            r9[r11] = r10
            r7.c(r11)
            aov r7 = r2.a
            bky r9 = r2.i
            r7.a(r9, r8)
            aov r7 = r2.a
            r7.a(r3, r4)
            if (r5 == 0) goto L_0x012d
            aqq r3 = r2.b
            bky r3 = r3.p
            int r5 = r3.e()
            r7 = -2
            r3.d(r7)
            int r5 = r5 * 6
            r7 = 2
            int r5 = r5 + r7
            aov r2 = r2.a
            r2.a(r3, r5)
            int r4 = r4 + r8
            int r9 = r4 + r5
            goto L_0x0130
        L_0x012d:
            int r9 = r4 + 1
        L_0x0130:
            r0.E = r9
            int r2 = r0.D
            int r2 = r2 + r9
            r0.D = r2
            r2 = 4
            r0.s = r2
            r2 = 0
            r0.F = r2
            aqf r2 = r0.C
            aqo r2 = r2.c
            akh r2 = r2.f
            java.lang.String r2 = r2.i
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            r0.H = r2
        L_0x014d:
            aqf r2 = r0.C
            aqq r3 = r2.b
            aqo r4 = r2.c
            aov r5 = r2.a
            int r2 = r2.e
            long r9 = r3.b(r2)
            r13 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r13
            blj r7 = r0.m
            if (r7 == 0) goto L_0x0168
            long r9 = r7.c(r9)
            goto L_0x0169
        L_0x0168:
        L_0x0169:
            int r7 = r4.j
            if (r7 == 0) goto L_0x0233
            bky r11 = r0.i
            byte[] r11 = r11.a
            r13 = 0
            r11[r13] = r13
            r11[r8] = r13
            r14 = 2
            r11[r14] = r13
            int r13 = r7 + 1
            r14 = 4
            int r7 = 4 - r7
        L_0x017e:
            int r14 = r0.E
            int r15 = r0.D
            if (r14 < r15) goto L_0x0186
            goto L_0x0266
        L_0x0186:
            int r14 = r0.F
            if (r14 != 0) goto L_0x01dc
            r1.b(r11, r7, r13)
            bky r14 = r0.i
            r15 = 0
            r14.c(r15)
            bky r14 = r0.i
            int r14 = r14.j()
            if (r14 <= 0) goto L_0x01d4
            int r14 = r14 + -1
            r0.F = r14
            bky r14 = r0.h
            r15 = 0
            r14.c(r15)
            bky r14 = r0.h
            r15 = 4
            r5.a(r14, r15)
            bky r14 = r0.i
            r5.a(r14, r8)
            aov[] r14 = r0.K
            int r14 = r14.length
            if (r14 <= 0) goto L_0x01c4
            akh r14 = r4.f
            java.lang.String r14 = r14.i
            byte r8 = r11[r15]
            boolean r8 = defpackage.bkw.a(r14, r8)
            if (r8 == 0) goto L_0x01c3
            r8 = 1
            goto L_0x01c5
        L_0x01c3:
        L_0x01c4:
            r8 = 0
        L_0x01c5:
            r0.G = r8
            int r8 = r0.E
            int r8 = r8 + 5
            r0.E = r8
            int r8 = r0.D
            int r8 = r8 + r7
            r0.D = r8
            r8 = 1
            goto L_0x017e
        L_0x01d4:
            ako r1 = new ako
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>(r2)
            throw r1
        L_0x01dc:
            boolean r8 = r0.G
            if (r8 == 0) goto L_0x021e
            bky r8 = r0.j
            r8.a(r14)
            bky r8 = r0.j
            byte[] r8 = r8.a
            int r14 = r0.F
            r15 = 0
            r1.b(r8, r15, r14)
            bky r8 = r0.j
            int r14 = r0.F
            r5.a(r8, r14)
            int r8 = r0.F
            bky r14 = r0.j
            byte[] r15 = r14.a
            int r14 = r14.c
            int r14 = defpackage.bkw.a(r15, r14)
            bky r15 = r0.j
            akh r12 = r4.f
            java.lang.String r12 = r12.i
            java.lang.String r6 = "video/hevc"
            boolean r6 = r6.equals(r12)
            r15.c(r6)
            bky r6 = r0.j
            r6.b(r14)
            bky r6 = r0.j
            aov[] r12 = r0.K
            defpackage.buk.a(r9, r6, r12)
            goto L_0x0224
        L_0x021e:
            r6 = 0
            int r8 = r5.a(r1, r14, r6)
        L_0x0224:
            int r6 = r0.E
            int r6 = r6 + r8
            r0.E = r6
            int r6 = r0.F
            int r6 = r6 - r8
            r0.F = r6
            r6 = 0
            r8 = 1
            r12 = 3
            goto L_0x017e
        L_0x0233:
            boolean r4 = r0.H
            if (r4 != 0) goto L_0x0239
            r4 = 0
            goto L_0x0254
        L_0x0239:
            int r4 = r0.D
            bky r6 = r0.l
            defpackage.alp.a(r4, r6)
            bky r4 = r0.l
            int r6 = r4.c
            r5.a(r4, r6)
            int r4 = r0.D
            int r4 = r4 + r6
            r0.D = r4
            int r4 = r0.E
            int r4 = r4 + r6
            r0.E = r4
            r4 = 0
            r0.H = r4
        L_0x0254:
            int r6 = r0.E
            int r7 = r0.D
            if (r6 >= r7) goto L_0x0266
            int r7 = r7 - r6
            int r6 = r5.a(r1, r7, r4)
            int r4 = r0.E
            int r4 = r4 + r6
            r0.E = r4
            r4 = 0
            goto L_0x0254
        L_0x0266:
            boolean[] r1 = r3.k
            boolean r1 = r1[r2]
            aqf r2 = r0.C
            aqp r2 = r2.c()
            if (r2 == 0) goto L_0x027c
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r3
            aou r6 = r2.c
            r21 = r1
            r24 = r6
            goto L_0x0281
        L_0x027c:
            r21 = r1
            r24 = 0
        L_0x0281:
            int r1 = r0.D
            r23 = 0
            r18 = r5
            r19 = r9
            r22 = r1
            r18.a(r19, r21, r22, r23, r24)
        L_0x028e:
            java.util.ArrayDeque r1 = r0.q
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02ce
            java.util.ArrayDeque r1 = r0.q
            java.lang.Object r1 = r1.removeFirst()
            aqe r1 = (defpackage.aqe) r1
            int r2 = r0.y
            int r3 = r1.b
            int r2 = r2 - r3
            r0.y = r2
            long r2 = r1.a
            long r2 = r2 + r9
            blj r4 = r0.m
            if (r4 == 0) goto L_0x02b1
            long r2 = r4.c(r2)
            goto L_0x02b2
        L_0x02b1:
        L_0x02b2:
            aov[] r4 = r0.J
            int r5 = r4.length
            r6 = 0
        L_0x02b6:
            if (r6 >= r5) goto L_0x028e
            r18 = r4[r6]
            r21 = 1
            int r7 = r1.b
            int r8 = r0.y
            r24 = 0
            r19 = r2
            r22 = r7
            r23 = r8
            r18.a(r19, r21, r22, r23, r24)
            int r6 = r6 + 1
            goto L_0x02b6
        L_0x02ce:
            aqf r1 = r0.C
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x02d9
            r1 = 0
            r0.C = r1
        L_0x02d9:
            r1 = 3
            r0.s = r1
        L_0x02dd:
            r1 = 0
            return r1
        L_0x02df:
            long r2 = r0.x
            r4 = r1
            aof r4 = (defpackage.aof) r4
            long r4 = r4.c
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x02f2
            r1.a(r3)
            r28.a()
            goto L_0x0004
        L_0x02f2:
            ako r1 = new ako
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x02fa:
            android.util.SparseArray r2 = r0.g
            int r2 = r2.size()
            r5 = r3
            r3 = 0
            r4 = 0
        L_0x0303:
            if (r3 >= r2) goto L_0x0328
            android.util.SparseArray r7 = r0.g
            java.lang.Object r7 = r7.valueAt(r3)
            aqf r7 = (defpackage.aqf) r7
            aqq r7 = r7.b
            boolean r8 = r7.q
            if (r8 == 0) goto L_0x0323
            long r7 = r7.c
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0323
            android.util.SparseArray r4 = r0.g
            java.lang.Object r4 = r4.valueAt(r3)
            aqf r4 = (defpackage.aqf) r4
            r5 = r7
            goto L_0x0324
        L_0x0323:
        L_0x0324:
            int r3 = r3 + 1
            goto L_0x0303
        L_0x0328:
            if (r4 == 0) goto L_0x0353
            r2 = r1
            aof r2 = (defpackage.aof) r2
            long r2 = r2.c
            long r5 = r5 - r2
            int r2 = (int) r5
            if (r2 < 0) goto L_0x034b
            r1.a(r2)
            aqq r2 = r4.b
            bky r3 = r2.p
            byte[] r3 = r3.a
            int r4 = r2.o
            r5 = 0
            r1.b(r3, r5, r4)
            bky r3 = r2.p
            r3.c(r5)
            r2.q = r5
            goto L_0x0004
        L_0x034b:
            ako r1 = new ako
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x0353:
            r2 = 3
            r0.s = r2
            goto L_0x0004
        L_0x0359:
            long r5 = r0.u
            int r2 = (int) r5
            int r5 = r0.v
            int r2 = r2 - r5
            bky r5 = r0.w
            if (r5 == 0) goto L_0x0599
            byte[] r5 = r5.a
            r6 = 8
            r1.b(r5, r6, r2)
            apt r2 = new apt
            int r5 = r0.t
            bky r6 = r0.w
            r2.<init>(r5, r6)
            r5 = r1
            aof r5 = (defpackage.aof) r5
            long r5 = r5.c
            java.util.ArrayDeque r7 = r0.p
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x038f
            java.util.ArrayDeque r3 = r0.p
            java.lang.Object r3 = r3.peek()
            aps r3 = (defpackage.aps) r3
            r3.a(r2)
            r5 = r0
            r0 = r1
            goto L_0x059f
        L_0x038f:
            int r7 = r2.d
            if (r7 != r4) goto L_0x045f
            bky r2 = r2.a
            r3 = 8
            r2.c(r3)
            int r3 = r2.j()
            r4 = 4
            r2.d(r4)
            long r13 = r2.h()
            int r3 = defpackage.apu.c(r3)
            if (r3 != 0) goto L_0x03b6
            long r3 = r2.h()
            long r7 = r2.h()
            long r5 = r5 + r7
            goto L_0x03c1
        L_0x03b6:
            long r3 = r2.p()
            long r7 = r2.p()
            long r5 = r5 + r7
        L_0x03c1:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r3
            r11 = r13
            long r20 = defpackage.blm.b(r7, r9, r11)
            r7 = 2
            r2.d(r7)
            int r15 = r2.e()
            int[] r11 = new int[r15]
            long[] r12 = new long[r15]
            long[] r9 = new long[r15]
            long[] r10 = new long[r15]
            r16 = r3
            r7 = r20
            r3 = 0
        L_0x03df:
            if (r3 >= r15) goto L_0x0432
            int r4 = r2.j()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = r4 & r18
            if (r18 != 0) goto L_0x042a
            long r22 = r2.h()
            r18 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r18
            r11[r3] = r4
            r12[r3] = r5
            r10[r3] = r7
            long r16 = r16 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r16
            r4 = r9
            r18 = r15
            r15 = r10
            r9 = r22
            r1 = r11
            r0 = r12
            r11 = r13
            long r7 = defpackage.blm.b(r7, r9, r11)
            r9 = r15[r3]
            long r9 = r7 - r9
            r4[r3] = r9
            r9 = 4
            r2.d(r9)
            r10 = r1[r3]
            long r10 = (long) r10
            long r5 = r5 + r10
            int r3 = r3 + 1
            r12 = r0
            r11 = r1
            r9 = r4
            r10 = r15
            r15 = r18
            r0 = r28
            r1 = r29
            goto L_0x03df
        L_0x042a:
            ako r0 = new ako
            java.lang.String r1 = "Unhandled indirect reference"
            r0.<init>(r1)
            throw r0
        L_0x0432:
            r4 = r9
            r15 = r10
            r1 = r11
            r0 = r12
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            aod r3 = new aod
            r3.<init>(r1, r0, r4, r15)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5 = r28
            r5.B = r1
            aok r1 = r5.I
            java.lang.Object r0 = r0.second
            aos r0 = (defpackage.aos) r0
            r1.a(r0)
            r0 = 1
            r5.L = r0
            r0 = r29
            goto L_0x059f
        L_0x045f:
            r5 = r0
            if (r7 != r3) goto L_0x0596
            bky r0 = r2.a
            aov[] r1 = r5.J
            if (r1 == 0) goto L_0x0596
            int r1 = r1.length
            if (r1 == 0) goto L_0x0596
            r1 = 8
            r0.c(r1)
            int r1 = r0.j()
            int r1 = defpackage.apu.c(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x04d8
            r4 = 1
            if (r1 == r4) goto L_0x049c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 46
            r0.<init>(r2)
            java.lang.String r2 = "Skipping unsupported emsg version: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r10, r0)
            r0 = r29
            goto L_0x059f
        L_0x049c:
            long r6 = r0.h()
            long r11 = r0.p()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = defpackage.blm.b(r11, r13, r15)
            long r11 = r0.h()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r6 = defpackage.blm.b(r11, r13, r15)
            long r10 = r0.h()
            java.lang.String r1 = r0.q()
            java.lang.Object r1 = defpackage.bks.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = r0.q()
            java.lang.Object r4 = defpackage.bks.a(r4)
            java.lang.String r4 = (java.lang.String) r4
            r21 = r1
            r14 = r2
            r22 = r4
            r23 = r6
            r25 = r10
            goto L_0x0523
        L_0x04d8:
            java.lang.String r1 = r0.q()
            java.lang.Object r1 = defpackage.bks.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = r0.q()
            java.lang.Object r4 = defpackage.bks.a(r4)
            java.lang.String r4 = (java.lang.String) r4
            long r12 = r0.h()
            long r6 = r0.h()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = defpackage.blm.b(r6, r8, r10)
            long r6 = r5.B
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0506
            long r6 = r6 + r14
            r18 = r6
            goto L_0x0509
        L_0x0506:
            r18 = r2
        L_0x0509:
            long r6 = r0.h()
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = r12
            long r6 = defpackage.blm.b(r6, r8, r10)
            long r10 = r0.h()
            r21 = r1
            r22 = r4
            r23 = r6
            r25 = r10
            r8 = r18
        L_0x0523:
            int r1 = r0.b()
            byte[] r1 = new byte[r1]
            int r4 = r0.b()
            r6 = 0
            r0.a(r1, r6, r4)
            aue r0 = new aue
            r20 = r0
            r27 = r1
            r20.<init>(r21, r22, r23, r25, r27)
            bky r1 = new bky
            aug r4 = r5.n
            byte[] r0 = r4.a(r0)
            r1.<init>(r0)
            int r0 = r1.b()
            aov[] r4 = r5.J
            int r6 = r4.length
            r7 = 0
        L_0x054d:
            if (r7 >= r6) goto L_0x055b
            r10 = r4[r7]
            r11 = 0
            r1.c(r11)
            r10.a(r1, r0)
            int r7 = r7 + 1
            goto L_0x054d
        L_0x055b:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0571
            java.util.ArrayDeque r1 = r5.q
            aqe r2 = new aqe
            r2.<init>(r14, r0)
            r1.addLast(r2)
            int r1 = r5.y
            int r1 = r1 + r0
            r5.y = r1
            r0 = r29
            goto L_0x059f
        L_0x0571:
            blj r1 = r5.m
            if (r1 == 0) goto L_0x057a
            long r8 = r1.c(r8)
            goto L_0x057b
        L_0x057a:
        L_0x057b:
            aov[] r1 = r5.J
            int r2 = r1.length
            r3 = 0
        L_0x057f:
            if (r3 >= r2) goto L_0x0593
            r18 = r1[r3]
            r21 = 1
            r23 = 0
            r24 = 0
            r19 = r8
            r22 = r0
            r18.a(r19, r21, r22, r23, r24)
            int r3 = r3 + 1
            goto L_0x057f
        L_0x0593:
            r0 = r29
            goto L_0x059f
        L_0x0596:
            r0 = r29
            goto L_0x059f
        L_0x0599:
            r5 = r0
            r0 = r29
            r0.a(r2)
        L_0x059f:
            r1 = r0
            aof r1 = (defpackage.aof) r1
            long r1 = r1.c
            r5.a(r1)
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x05ab:
            r5 = r0
            r0 = r1
            int r1 = r5.v
            if (r1 == 0) goto L_0x05b2
            goto L_0x05d7
        L_0x05b2:
            bky r1 = r5.o
            byte[] r1 = r1.a
            r2 = 8
            r6 = 1
            r7 = 0
            boolean r1 = r0.a(r1, r7, r2, r6)
            if (r1 == 0) goto L_0x0794
            r5.v = r2
            bky r1 = r5.o
            r1.c(r7)
            bky r1 = r5.o
            long r1 = r1.h()
            r5.u = r1
            bky r1 = r5.o
            int r1 = r1.j()
            r5.t = r1
        L_0x05d7:
            long r1 = r5.u
            r6 = 1
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x05f6
            bky r1 = r5.o
            byte[] r1 = r1.a
            r2 = 8
            r0.b(r1, r2, r2)
            int r1 = r5.v
            int r1 = r1 + r2
            r5.v = r1
            bky r1 = r5.o
            long r1 = r1.p()
            r5.u = r1
            goto L_0x0628
        L_0x05f6:
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0628
            r1 = r0
            aof r1 = (defpackage.aof) r1
            long r6 = r1.b
            r8 = -1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x061a
            java.util.ArrayDeque r2 = r5.p
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x061a
            java.util.ArrayDeque r2 = r5.p
            java.lang.Object r2 = r2.peek()
            aps r2 = (defpackage.aps) r2
            long r6 = r2.a
            goto L_0x061b
        L_0x061a:
        L_0x061b:
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0628
            long r1 = r1.c
            long r6 = r6 - r1
            int r1 = r5.v
            long r1 = (long) r1
            long r6 = r6 + r1
            r5.u = r6
        L_0x0628:
            long r1 = r5.u
            int r6 = r5.v
            long r6 = (long) r6
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x078c
            r1 = r0
            aof r1 = (defpackage.aof) r1
            long r8 = r1.c
            long r8 = r8 - r6
            int r2 = r5.t
            r6 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r6) goto L_0x0658
            android.util.SparseArray r2 = r5.g
            int r2 = r2.size()
            r7 = 0
        L_0x0645:
            if (r7 >= r2) goto L_0x0658
            android.util.SparseArray r10 = r5.g
            java.lang.Object r10 = r10.valueAt(r7)
            aqf r10 = (defpackage.aqf) r10
            aqq r10 = r10.b
            r10.c = r8
            r10.b = r8
            int r7 = r7 + 1
            goto L_0x0645
        L_0x0658:
            int r2 = r5.t
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r2 != r7) goto L_0x0682
            r1 = 0
            r5.C = r1
            long r1 = r5.u
            long r1 = r1 + r8
            r5.x = r1
            boolean r1 = r5.L
            if (r1 != 0) goto L_0x067a
            aok r1 = r5.I
            aor r2 = new aor
            long r3 = r5.A
            r2.<init>(r3, r8)
            r1.a(r2)
            r1 = 1
            r5.L = r1
        L_0x067a:
            r1 = 2
            r5.s = r1
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x0682:
            r7 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r7) goto L_0x0689
            goto L_0x0763
        L_0x0689:
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r7) goto L_0x0763
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r7) goto L_0x0763
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r7) goto L_0x0763
            r7 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r7) goto L_0x0763
            if (r2 == r6) goto L_0x0763
            r6 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r6) goto L_0x0763
            r6 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r6) goto L_0x0763
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 == r6) goto L_0x0763
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r1) goto L_0x072a
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r1) goto L_0x072a
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 != r1) goto L_0x06c2
            goto L_0x072a
        L_0x06c2:
            if (r2 == r4) goto L_0x072a
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r1) goto L_0x072a
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r1) goto L_0x072a
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r1) goto L_0x072a
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r1) goto L_0x072a
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r1) goto L_0x072a
            if (r2 == r3) goto L_0x072a
            long r1 = r5.u
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0722
            r1 = 0
            r5.w = r1
            r1 = 1
            r5.s = r1
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x0722:
            ako r0 = new ako
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x072a:
            int r1 = r5.v
            r2 = 8
            if (r1 != r2) goto L_0x075b
            long r1 = r5.u
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0753
            bky r3 = new bky
            int r2 = (int) r1
            r3.<init>(r2)
            r5.w = r3
            bky r1 = r5.o
            byte[] r1 = r1.a
            bky r2 = r5.w
            byte[] r2 = r2.a
            r3 = 8
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            r1 = 1
            r5.s = r1
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x0753:
            ako r0 = new ako
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x075b:
            ako r0 = new ako
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0763:
            long r3 = r1.c
            long r6 = r5.u
            long r3 = r3 + r6
            r6 = -8
            long r3 = r3 + r6
            java.util.ArrayDeque r1 = r5.p
            aps r6 = new aps
            r6.<init>(r2, r3)
            r1.push(r6)
            long r1 = r5.u
            int r6 = r5.v
            long r6 = (long) r6
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0785
            r28.a()
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x0785:
            r5.a(r3)
            r1 = r0
            r0 = r5
            goto L_0x0004
        L_0x078c:
            ako r0 = new ako
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0794:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.a(aoj, aop):int");
    }

    public final void a(long j2, long j3) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((aqf) this.g.valueAt(i2)).a();
        }
        this.q.clear();
        this.y = 0;
        this.z = j3;
        this.p.clear();
        this.H = false;
        a();
    }

    public final boolean a(aoj aoj) {
        return aqn.a(aoj, true);
    }
}
