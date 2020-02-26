package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azv  reason: default package */
/* compiled from: PG */
public final class azv implements azc {
    private final biy a;
    private final int[] b;
    private final int c;
    private final bhv d;
    private final long e;
    private final azz f;
    private final azu[] g;
    private bgl h;
    private bac i;
    private int j;
    private IOException k;
    private boolean l;
    private long m = -9223372036854775807L;

    public azv(biy biy, bac bac, int i2, int[] iArr, bgl bgl, int i3, bhv bhv, long j2, boolean z, List list, azz azz) {
        bgl bgl2 = bgl;
        this.a = biy;
        this.i = bac;
        this.b = iArr;
        this.h = bgl2;
        this.c = i3;
        this.d = bhv;
        this.j = i2;
        this.e = j2;
        this.f = azz;
        long b2 = bac.b(i2);
        ArrayList b3 = b();
        this.g = new azu[bgl.f()];
        for (int i4 = 0; i4 < this.g.length; i4++) {
            this.g[i4] = new azu(b2, i3, (bam) b3.get(bgl2.b(i4)), z, list, azz);
        }
    }

    public final long a(long j2, alb alb) {
        long j3;
        azu[] azuArr = this.g;
        int length = azuArr.length;
        int i2 = 0;
        while (i2 < length) {
            azu azu = azuArr[i2];
            if (azu.c == null) {
                i2++;
            } else {
                long c2 = azu.c(j2);
                long a2 = azu.a(c2);
                if (a2 >= j2 || c2 >= ((long) (azu.b() - 1))) {
                    j3 = a2;
                } else {
                    j3 = azu.a(c2 + 1);
                }
                return blm.a(j2, alb, a2, j3);
            }
        }
        return j2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: aza} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: ayu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: aza} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: aza} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r43, long r45, java.util.List r47, defpackage.ayp r48) {
        /*
            r42 = this;
            r0 = r42
            r9 = r48
            java.io.IOException r1 = r0.k
            if (r1 != 0) goto L_0x0301
            long r10 = r45 - r43
            bac r1 = r0.i
            boolean r2 = r1.c
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0021
            long r2 = r0.m
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            long r2 = r2 - r43
            r14 = r2
            goto L_0x0022
        L_0x001f:
        L_0x0021:
            r14 = r12
        L_0x0022:
            long r1 = r1.a
            long r1 = defpackage.aja.b(r1)
            bac r3 = r0.i
            int r4 = r0.j
            bah r3 = r3.a(r4)
            long r3 = r3.b
            long r3 = defpackage.aja.b(r3)
            long r1 = r1 + r3
            long r1 = r1 + r45
            azz r3 = r0.f
            if (r3 == 0) goto L_0x0086
            baa r3 = r3.b
            bac r4 = r3.f
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            boolean r5 = r3.h
            if (r5 != 0) goto L_0x0085
            long r4 = r4.g
            java.util.TreeMap r6 = r3.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.Map$Entry r4 = r6.ceilingEntry(r4)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r5 = r4.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0086
            java.lang.Object r1 = r4.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            azy r4 = r3.b
            azj r4 = (defpackage.azj) r4
            azq r4 = r4.a
            long r5 = r4.p
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0080
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0082
        L_0x0080:
            r4.p = r1
        L_0x0082:
            r3.a()
        L_0x0085:
            return
        L_0x0086:
            long r1 = r0.e
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 * r5
            goto L_0x00a0
        L_0x0097:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.e
            long r1 = r1 + r3
            long r1 = r1 * r5
        L_0x00a0:
            r7 = r1
            boolean r1 = r47.isEmpty()
            r16 = 0
            if (r1 != 0) goto L_0x00bb
            int r1 = r47.size()
            int r1 = r1 + -1
            r5 = r47
            java.lang.Object r1 = r5.get(r1)
            ayx r1 = (defpackage.ayx) r1
            r17 = r1
            goto L_0x00bf
        L_0x00bb:
            r5 = r47
            r17 = r16
        L_0x00bf:
            bgl r1 = r0.h
            int r6 = r1.f()
            ayz[] r3 = new defpackage.ayz[r6]
            r2 = 0
        L_0x00c8:
            if (r2 < r6) goto L_0x02a4
            bgl r1 = r0.h
            r1.a(r10, r14)
            azu[] r1 = r0.g
            bgl r2 = r0.h
            int r2 = r2.a()
            r10 = r1[r2]
            ayo r1 = r10.a
            if (r1 == 0) goto L_0x0146
            bam r2 = r10.b
            akh[] r1 = r1.c
            if (r1 != 0) goto L_0x00e6
            baj r1 = r2.e
            goto L_0x00e9
        L_0x00e6:
            r1 = r16
        L_0x00e9:
            azr r3 = r10.c
            if (r3 != 0) goto L_0x00f2
            baj r16 = r2.c()
            goto L_0x00f4
        L_0x00f2:
        L_0x00f4:
            r2 = r16
            if (r1 == 0) goto L_0x00f9
            goto L_0x00fc
        L_0x00f9:
            if (r2 != 0) goto L_0x00fc
            goto L_0x0146
        L_0x00fc:
            bhv r3 = r0.d
            bgl r4 = r0.h
            akh r21 = r4.g()
            bgl r4 = r0.h
            int r22 = r4.b()
            bgl r4 = r0.h
            java.lang.Object r23 = r4.c()
            bam r4 = r10.b
            java.lang.String r4 = r4.b
            if (r1 == 0) goto L_0x011e
            baj r2 = r1.a(r2, r4)
            if (r2 != 0) goto L_0x011e
            r2 = r1
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            bhy r1 = new bhy
            android.net.Uri r12 = r2.a(r4)
            long r13 = r2.a
            long r4 = r2.b
            bam r2 = r10.b
            java.lang.String r17 = r2.e()
            r11 = r1
            r15 = r4
            r11.<init>(r12, r13, r15, r17)
            ayw r2 = new ayw
            ayo r4 = r10.a
            r18 = r2
            r19 = r3
            r20 = r1
            r24 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r9.a = r2
            return
        L_0x0146:
            long r14 = r10.d
            r11 = 1
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x014f
            r6 = 1
            goto L_0x0151
        L_0x014f:
            r6 = 0
        L_0x0151:
            int r1 = r10.b()
            if (r1 == 0) goto L_0x02a0
            bac r1 = r0.i
            int r2 = r0.j
            long r18 = r10.a(r1, r2, r7)
            bac r1 = r0.i
            int r2 = r0.j
            long r7 = r10.b(r1, r2, r7)
            bac r1 = r0.i
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x0172
            long r1 = r10.b(r7)
            goto L_0x0174
        L_0x0172:
            r1 = r12
        L_0x0174:
            r0.m = r1
            r1 = r10
            r2 = r17
            r3 = r45
            r12 = r6
            r5 = r18
            r16 = r7
            long r1 = a(r1, r2, r3, r5, r7)
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x0190
            awd r1 = new awd
            r1.<init>()
            r0.k = r1
            return
        L_0x0190:
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 > 0) goto L_0x029d
            boolean r3 = r0.l
            if (r3 == 0) goto L_0x019c
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x029d
        L_0x019c:
            if (r12 != 0) goto L_0x019f
            goto L_0x01aa
        L_0x019f:
            long r3 = r10.a(r1)
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x01aa
            r9.b = r11
            return
        L_0x01aa:
            long r7 = r16 - r1
            r3 = 1
            long r7 = r7 + r3
            long r3 = java.lang.Math.min(r3, r7)
            int r4 = (int) r3
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01d0
        L_0x01bf:
            if (r4 <= r11) goto L_0x01d1
            long r7 = (long) r4
            long r7 = r7 + r1
            long r7 = r7 + r5
            long r7 = r10.a(r7)
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x01d0
            int r4 = r4 + -1
            goto L_0x01bf
        L_0x01d0:
        L_0x01d1:
            boolean r3 = r47.isEmpty()
            if (r3 != 0) goto L_0x01dd
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01df
        L_0x01dd:
            r32 = r45
        L_0x01df:
            bhv r3 = r0.d
            int r7 = r0.c
            bgl r8 = r0.h
            akh r8 = r8.g()
            bgl r12 = r0.h
            int r26 = r12.b()
            bgl r12 = r0.h
            java.lang.Object r27 = r12.c()
            bam r12 = r10.b
            long r28 = r10.a(r1)
            baj r13 = r10.d(r1)
            java.lang.String r14 = r12.b
            ayo r15 = r10.a
            if (r15 != 0) goto L_0x0234
            long r30 = r10.b(r1)
            bhy r4 = new bhy
            android.net.Uri r16 = r13.a(r14)
            long r5 = r13.a
            long r10 = r13.b
            java.lang.String r21 = r12.e()
            r15 = r4
            r17 = r5
            r19 = r10
            r15.<init>(r16, r17, r19, r21)
            aza r5 = new aza
            r22 = r5
            r23 = r3
            r24 = r4
            r25 = r8
            r32 = r1
            r34 = r7
            r35 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)
            goto L_0x029a
        L_0x0234:
            r7 = 1
        L_0x0235:
            if (r11 < r4) goto L_0x0238
            goto L_0x024d
        L_0x0238:
            long r5 = (long) r11
            long r5 = r5 + r1
            baj r5 = r10.d(r5)
            baj r5 = r13.a(r5, r14)
            if (r5 == 0) goto L_0x024d
            int r7 = r7 + 1
            int r11 = r11 + 1
            r13 = r5
            r5 = -1
            goto L_0x0235
        L_0x024d:
            long r4 = (long) r7
            long r4 = r4 + r1
            r15 = -1
            long r4 = r4 + r15
            long r30 = r10.b(r4)
            long r4 = r10.d
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0268
            int r6 = (r4 > r30 ? 1 : (r4 == r30 ? 0 : -1))
            if (r6 > 0) goto L_0x0268
            r34 = r4
            goto L_0x026a
        L_0x0268:
            r34 = r18
        L_0x026a:
            bhy r15 = new bhy
            r24 = r15
            android.net.Uri r16 = r13.a(r14)
            long r4 = r13.a
            long r13 = r13.b
            java.lang.String r21 = r12.e()
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r19, r21)
            long r4 = r12.c
            ayu r6 = new ayu
            r22 = r6
            long r4 = -r4
            r39 = r4
            ayo r4 = r10.a
            r41 = r4
            r23 = r3
            r25 = r8
            r36 = r1
            r38 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r39, r41)
            r5 = r6
        L_0x029a:
            r9.a = r5
            return
        L_0x029d:
            r9.b = r12
            return
        L_0x02a0:
            r12 = r6
            r9.b = r12
            return
        L_0x02a4:
            r18 = r12
            azu[] r1 = r0.g
            r1 = r1[r2]
            azr r5 = r1.c
            if (r5 != 0) goto L_0x02bc
            ayz r1 = defpackage.ayz.a
            r3[r2] = r1
            r22 = r2
            r23 = r3
            r24 = r6
            r25 = r7
            r0 = 0
            goto L_0x02f1
        L_0x02bc:
            bac r5 = r0.i
            int r12 = r0.j
            long r12 = r1.a(r5, r12, r7)
            bac r5 = r0.i
            int r4 = r0.j
            long r20 = r1.b(r5, r4, r7)
            r22 = r2
            r2 = r17
            r23 = r3
            r5 = 0
            r3 = r45
            r24 = r6
            r0 = 0
            r5 = r12
            r25 = r7
            r7 = r20
            long r1 = a(r1, r2, r3, r5, r7)
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ea
            ayz r1 = defpackage.ayz.a
            r23[r22] = r1
            goto L_0x02f1
        L_0x02ea:
            ayj r1 = new ayj
            r1.<init>(r0)
            r23[r22] = r1
        L_0x02f1:
            int r2 = r22 + 1
            r0 = r42
            r5 = r47
            r12 = r18
            r3 = r23
            r6 = r24
            r7 = r25
            goto L_0x00c8
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azv.a(long, long, java.util.List, ayp):void");
    }

    public final int a(long j2, List list) {
        if (this.k != null || this.h.f() < 2) {
            return list.size();
        }
        return this.h.a(j2, list);
    }

    private final ArrayList b() {
        List list = this.i.a(this.j).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.b) {
            arrayList.addAll(((bab) list.get(i2)).c);
        }
        return arrayList;
    }

    private static final long a(azu azu, ayx ayx, long j2, long j3, long j4) {
        if (ayx == null) {
            return blm.a(azu.c(j2), j3, j4);
        }
        return ayx.d();
    }

    public final void a() {
        IOException iOException = this.k;
        if (iOException == null) {
            this.a.a();
            return;
        }
        throw iOException;
    }

    public final void a(ayl ayl) {
        aos aos;
        if (ayl instanceof ayw) {
            int a2 = this.h.a(((ayw) ayl).g);
            azu[] azuArr = this.g;
            azu azu = azuArr[a2];
            if (azu.c == null && (aos = azu.a.b) != null) {
                azuArr[a2] = new azu(azu.d, azu.b, azu.a, azu.e, new azs((aod) aos, azu.b.c));
            }
        }
        azz azz = this.f;
        if (azz != null) {
            baa baa = azz.b;
            long j2 = baa.g;
            if (j2 != -9223372036854775807L || ayl.k > j2) {
                baa.g = ayl.k;
            }
        }
    }

    public final boolean a(ayl ayl, boolean z, Exception exc, long j2) {
        azu azu;
        int b2;
        if (!z) {
            return false;
        }
        azz azz = this.f;
        if (azz != null) {
            baa baa = azz.b;
            if (baa.f.c) {
                if (!baa.h) {
                    long j3 = baa.g;
                    if (j3 != -9223372036854775807L && j3 < ayl.j) {
                        baa.a();
                    }
                }
                return true;
            }
        }
        if (!this.i.c && (ayl instanceof ayx) && (exc instanceof bim) && ((bim) exc).a == 404 && (b2 = (azu = this.g[this.h.a(ayl.g)]).b()) != -1 && b2 != 0) {
            if (((ayx) ayl).d() > (azu.a() + ((long) b2)) - 1) {
                this.l = true;
                return true;
            }
        }
        if (j2 != -9223372036854775807L) {
            bgl bgl = this.h;
            if (bgl.a(bgl.a(ayl.g), j2)) {
                return true;
            }
        }
        return false;
    }

    public final void a(bac bac, int i2) {
        ArrayList arrayList;
        azu[] azuArr;
        int i3;
        azu azu;
        long j2;
        azv azv = this;
        try {
            azv.i = bac;
            azv.j = i2;
            long b2 = bac.b(i2);
            ArrayList b3 = b();
            int i4 = 0;
            while (i4 < azv.g.length) {
                bam bam = (bam) b3.get(azv.h.b(i4));
                azu[] azuArr2 = azv.g;
                azu azu2 = azuArr2[i4];
                azr d2 = azu2.b.d();
                azr d3 = bam.d();
                if (d2 == null) {
                    azu = new azu(b2, bam, azu2.a, azu2.e, null);
                    arrayList = b3;
                    i3 = i4;
                    azuArr = azuArr2;
                } else if (!d2.b()) {
                    azu = new azu(b2, bam, azu2.a, azu2.e, d3);
                    arrayList = b3;
                    i3 = i4;
                    azuArr = azuArr2;
                } else {
                    int c2 = d2.c(b2);
                    if (c2 == 0) {
                        azu = new azu(b2, bam, azu2.a, azu2.e, d3);
                        arrayList = b3;
                        i3 = i4;
                        azuArr = azuArr2;
                    } else {
                        long a2 = d2.a();
                        long a3 = d2.a(a2);
                        arrayList = b3;
                        long j3 = (((long) c2) + a2) - 1;
                        long a4 = d2.a(j3) + d2.b(j3, b2);
                        i3 = i4;
                        azuArr = azuArr2;
                        long a5 = d3.a();
                        bam bam2 = bam;
                        long a6 = d3.a(a5);
                        long j4 = a2;
                        long j5 = azu2.e;
                        if (a4 == a6) {
                            j2 = j5 + ((j3 + 1) - a5);
                        } else if (a4 < a6) {
                            throw new awd();
                        } else if (a6 >= a3) {
                            j2 = j5 + (d2.a(a6, b2) - a5);
                        } else {
                            j2 = j5 - (d3.a(a3, b2) - j4);
                        }
                        azu = new azu(b2, bam2, azu2.a, j2, d3);
                    }
                }
                azuArr[i3] = azu;
                i4 = i3 + 1;
                azv = this;
                b3 = arrayList;
            }
        } catch (awd e2) {
            this.k = e2;
        }
    }

    public final void a(bgl bgl) {
        this.h = bgl;
    }
}
