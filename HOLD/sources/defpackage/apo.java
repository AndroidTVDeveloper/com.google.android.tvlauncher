package defpackage;

import java.io.EOFException;

/* renamed from: apo  reason: default package */
/* compiled from: PG */
public final class apo implements aoi {
    public boolean a;
    private final long b;
    private final bky c;
    private final aoo d;
    private final aom e;
    private final aon f;
    private aok g;
    private aov h;
    private int i;
    private atw j;
    private app k;
    private long l;
    private long m;
    private long n;
    private int o;

    public apo() {
        this((byte) 0);
    }

    private static boolean a(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    public apo(byte b2) {
        this(-9223372036854775807L);
    }

    public apo(long j2) {
        this.b = j2;
        this.c = new bky(10);
        this.d = new aoo();
        this.e = new aom();
        this.l = -9223372036854775807L;
        this.f = new aon();
    }

    private final app c(aoj aoj) {
        aoj.c(this.c.a, 0, 4);
        this.c.c(0);
        aoo.a(this.c.j(), this.d);
        aof aof = (aof) aoj;
        return new aoe(aof.b, aof.c, this.d);
    }

    public final void a(aok aok) {
        this.g = aok;
        this.h = aok.a(0, 1);
        this.g.S();
    }

    private final boolean b(aoj aoj) {
        app app = this.k;
        if (app != null) {
            long c2 = app.c();
            if (c2 != -1 && aoj.b() > c2 - 4) {
                return true;
            }
        }
        try {
            return !aoj.b(this.c.a, 0, 4, true);
        } catch (EOFException e2) {
            return true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: apo.a(aoj, boolean):boolean
     arg types: [aoj, int]
     candidates:
      apo.a(int, long):boolean
      apo.a(aoj, aop):int
      apo.a(long, long):void
      aoi.a(aoj, aop):int
      aoi.a(long, long):void
      apo.a(aoj, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r10 == 1231971951) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.aoj r41, defpackage.aop r42) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            int r2 = r1.i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x0010
            r1.a(r0, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            return r3
        L_0x0010:
            app r2 = r1.k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r9 = 1
            if (r2 != 0) goto L_0x0306
            bky r2 = new bky
            aoo r10 = r1.d
            int r10 = r10.c
            r2.<init>(r10)
            byte[] r10 = r2.a
            aoo r11 = r1.d
            int r11 = r11.c
            r0.c(r10, r4, r11)
            aoo r10 = r1.d
            int r11 = r10.a
            r11 = r11 & r9
            r12 = 36
            r13 = 21
            if (r11 == 0) goto L_0x003d
            int r10 = r10.e
            if (r10 == r9) goto L_0x003c
            r13 = 36
            goto L_0x0046
        L_0x003c:
            goto L_0x0041
        L_0x003d:
            int r10 = r10.e
            if (r10 == r9) goto L_0x0042
        L_0x0041:
            goto L_0x0046
        L_0x0042:
            r10 = 13
            r13 = 13
        L_0x0046:
            int r10 = r2.c
            int r11 = r13 + 4
            r14 = 1483304551(0x58696e67, float:1.02664153E15)
            r15 = 1231971951(0x496e666f, float:976486.94)
            r3 = 1447187017(0x56425249, float:5.3414667E13)
            if (r10 < r11) goto L_0x0061
            r2.c(r13)
            int r10 = r2.j()
            if (r10 != r14) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            if (r10 == r15) goto L_0x0076
        L_0x0061:
            int r10 = r2.c
            r11 = 40
            if (r10 < r11) goto L_0x0075
            r2.c(r12)
            int r10 = r2.j()
            if (r10 == r3) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r10 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0076
        L_0x0075:
            r10 = 0
        L_0x0076:
            java.lang.String r11 = ", "
            r16 = -1
            if (r10 != r14) goto L_0x007f
            r7 = r11
            goto L_0x015e
        L_0x007f:
            if (r10 == r15) goto L_0x015d
            if (r10 != r3) goto L_0x0156
            r3 = r0
            aof r3 = (defpackage.aof) r3
            long r13 = r3.b
            r18 = r13
            long r12 = r3.c
            aoo r3 = r1.d
            r10 = 10
            r2.d(r10)
            int r10 = r2.j()
            if (r10 <= 0) goto L_0x014b
            int r14 = r3.d
            long r7 = (long) r10
            r10 = 32000(0x7d00, float:4.4842E-41)
            if (r14 < r10) goto L_0x00a4
            r10 = 1152(0x480, float:1.614E-42)
            goto L_0x00a7
        L_0x00a4:
            r10 = 576(0x240, float:8.07E-43)
        L_0x00a7:
            long r9 = (long) r10
            long r22 = r9 * r5
            long r9 = (long) r14
            r20 = r7
            r24 = r9
            long r29 = defpackage.blm.b(r20, r22, r24)
            int r7 = r2.e()
            int r8 = r2.e()
            int r9 = r2.e()
            r10 = 2
            r2.d(r10)
            int r3 = r3.c
            long r14 = (long) r3
            long r14 = r14 + r12
            long[] r3 = new long[r7]
            long[] r4 = new long[r7]
            r5 = r12
            r12 = 0
        L_0x00cd:
            if (r12 >= r7) goto L_0x010f
            r23 = r11
            long r10 = (long) r12
            long r10 = r10 * r29
            r24 = r14
            long r13 = (long) r7
            long r10 = r10 / r13
            r3[r12] = r10
            r10 = r24
            long r13 = java.lang.Math.max(r5, r10)
            r4[r12] = r13
            r13 = 1
            if (r9 == r13) goto L_0x00fe
            r13 = 2
            if (r9 == r13) goto L_0x00f9
            r14 = 3
            if (r9 == r14) goto L_0x00f4
            r14 = 4
            if (r9 == r14) goto L_0x00ef
            goto L_0x014c
        L_0x00ef:
            int r14 = r2.n()
            goto L_0x0103
        L_0x00f4:
            int r14 = r2.g()
            goto L_0x0103
        L_0x00f9:
            int r14 = r2.e()
            goto L_0x0103
        L_0x00fe:
            r13 = 2
            int r14 = r2.d()
        L_0x0103:
            int r14 = r14 * r8
            long r14 = (long) r14
            long r5 = r5 + r14
            int r12 = r12 + 1
            r14 = r10
            r11 = r23
            r10 = 2
            goto L_0x00cd
        L_0x010f:
            r23 = r11
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0116
            goto L_0x013c
        L_0x0116:
            int r2 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x013c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r7 = 67
            r2.<init>(r7)
            java.lang.String r7 = "VBRI data size mismatch: "
            r2.append(r7)
            r7 = r18
            r2.append(r7)
            r7 = r23
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "VbriSeeker"
            android.util.Log.w(r7, r2)
        L_0x013c:
            apq r2 = new apq
            r26 = r2
            r27 = r3
            r28 = r4
            r31 = r5
            r26.<init>(r27, r28, r29, r31)
            r8 = r2
            goto L_0x014d
        L_0x014b:
        L_0x014c:
            r8 = 0
        L_0x014d:
            aoo r2 = r1.d
            int r2 = r2.c
            r0.a(r2)
            goto L_0x024f
        L_0x0156:
            r41.a()
            r8 = 0
            goto L_0x024f
        L_0x015d:
            r7 = r11
        L_0x015e:
            r3 = r0
            aof r3 = (defpackage.aof) r3
            long r4 = r3.b
            long r8 = r3.c
            aoo r3 = r1.d
            int r6 = r3.g
            int r11 = r3.d
            int r12 = r2.j()
            r14 = r12 & 1
            r15 = 1
            if (r14 != r15) goto L_0x01f1
            int r14 = r2.n()
            if (r14 == 0) goto L_0x01f0
            long r14 = (long) r14
            long r0 = (long) r6
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r28 = r0 * r21
            long r0 = (long) r11
            r26 = r14
            r30 = r0
            long r30 = defpackage.blm.b(r26, r28, r30)
            r0 = 6
            r1 = r12 & 6
            if (r1 == r0) goto L_0x019e
            apr r0 = new apr
            int r1 = r3.c
            r26 = r0
            r27 = r8
            r29 = r1
            r26.<init>(r27, r29, r30)
            r8 = r0
            goto L_0x01f2
        L_0x019e:
            int r0 = r2.n()
            long r0 = (long) r0
            r6 = 100
            long[] r11 = new long[r6]
            r12 = 0
        L_0x01a8:
            if (r12 >= r6) goto L_0x01b4
            int r14 = r2.d()
            long r14 = (long) r14
            r11[r12] = r14
            int r12 = r12 + 1
            goto L_0x01a8
        L_0x01b4:
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x01b9
            goto L_0x01dd
        L_0x01b9:
            long r14 = r8 + r0
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x01dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r6 = 67
            r2.<init>(r6)
            java.lang.String r6 = "XING data size mismatch: "
            r2.append(r6)
            r2.append(r4)
            r2.append(r7)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "XingSeeker"
            android.util.Log.w(r4, r2)
        L_0x01dd:
            apr r2 = new apr
            int r3 = r3.c
            r26 = r2
            r27 = r8
            r29 = r3
            r32 = r0
            r34 = r11
            r26.<init>(r27, r29, r30, r32, r34)
            r8 = r2
            goto L_0x01f2
        L_0x01f0:
        L_0x01f1:
            r8 = 0
        L_0x01f2:
            if (r8 != 0) goto L_0x01f9
            r1 = r40
            r0 = r41
            goto L_0x0232
        L_0x01f9:
            r1 = r40
            aom r0 = r1.e
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0230
            r41.a()
            int r13 = r13 + 141
            r0 = r41
            r0.b(r13)
            bky r2 = r1.c
            byte[] r2 = r2.a
            r3 = 3
            r4 = 0
            r0.c(r2, r4, r3)
            bky r2 = r1.c
            r2.c(r4)
            aom r2 = r1.e
            bky r3 = r1.c
            int r3 = r3.g()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x022b
            if (r3 <= 0) goto L_0x0232
        L_0x022b:
            r2.a = r4
            r2.b = r3
            goto L_0x0232
        L_0x0230:
            r0 = r41
        L_0x0232:
            aoo r2 = r1.d
            int r2 = r2.c
            r0.a(r2)
            if (r8 == 0) goto L_0x024e
            boolean r2 = r8.d()
            if (r2 == 0) goto L_0x0242
            goto L_0x024e
        L_0x0242:
            r2 = 1231971951(0x496e666f, float:976486.94)
            if (r10 == r2) goto L_0x0249
            goto L_0x024e
        L_0x0249:
            app r8 = r40.c(r41)
            goto L_0x024f
        L_0x024e:
        L_0x024f:
            atw r2 = r1.j
            r3 = r0
            aof r3 = (defpackage.aof) r3
            long r4 = r3.c
            if (r2 == 0) goto L_0x02a5
            int r6 = r2.a()
            r7 = 0
        L_0x025d:
            if (r7 >= r6) goto L_0x02a4
            atv r9 = r2.a(r7)
            boolean r10 = r9 instanceof defpackage.avg
            if (r10 == 0) goto L_0x02a1
            avg r9 = (defpackage.avg) r9
            int[] r2 = r9.d
            int r2 = r2.length
            int r6 = r2 + 1
            long[] r7 = new long[r6]
            long[] r6 = new long[r6]
            r10 = 0
            r7[r10] = r4
            r11 = 0
            r6[r10] = r11
            r10 = r4
            r4 = 1
            r12 = 0
        L_0x027d:
            if (r4 > r2) goto L_0x029b
            int r5 = r4 + -1
            int r14 = r9.a
            int[] r15 = r9.d
            r15 = r15[r5]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r10 = r10 + r14
            int r14 = r9.b
            int[] r15 = r9.e
            r5 = r15[r5]
            int r14 = r14 + r5
            long r14 = (long) r14
            long r12 = r12 + r14
            r7[r4] = r10
            r6[r4] = r12
            int r4 = r4 + 1
            goto L_0x027d
        L_0x029b:
            apn r2 = new apn
            r2.<init>(r7, r6)
            goto L_0x02a6
        L_0x02a1:
            int r7 = r7 + 1
            goto L_0x025d
        L_0x02a4:
        L_0x02a5:
            r2 = 0
        L_0x02a6:
            boolean r4 = r1.a
            if (r4 == 0) goto L_0x02b2
            aor r2 = new aor
            r2.<init>()
            r1.k = r2
            goto L_0x02c5
        L_0x02b2:
            if (r2 == 0) goto L_0x02b7
            r1.k = r2
            goto L_0x02bb
        L_0x02b7:
            if (r8 == 0) goto L_0x02bb
            r1.k = r8
        L_0x02bb:
            app r2 = r1.k
            if (r2 != 0) goto L_0x02c5
            app r2 = r40.c(r41)
            r1.k = r2
        L_0x02c5:
            aok r2 = r1.g
            app r4 = r1.k
            r2.a(r4)
            aov r2 = r1.h
            aoo r4 = r1.d
            java.lang.String r5 = r4.b
            int r6 = r4.e
            int r4 = r4.d
            aom r7 = r1.e
            r26 = 0
            r28 = -1
            r29 = 4096(0x1000, float:5.74E-42)
            r32 = -1
            int r8 = r7.a
            int r7 = r7.b
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            atw r9 = r1.j
            r27 = r5
            r30 = r6
            r31 = r4
            r33 = r8
            r34 = r7
            r39 = r9
            akh r4 = defpackage.akh.a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2.a(r4)
            long r2 = r3.c
            r1.n = r2
            goto L_0x031c
        L_0x0306:
            long r2 = r1.n
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x031c
            r4 = r0
            aof r4 = (defpackage.aof) r4
            long r4 = r4.c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x031c
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.a(r3)
        L_0x031c:
            int r2 = r1.o
            if (r2 == 0) goto L_0x0321
            goto L_0x0382
        L_0x0321:
            r41.a()
            boolean r2 = r40.b(r41)
            if (r2 != 0) goto L_0x03cb
            bky r2 = r1.c
            r3 = 0
            r2.c(r3)
            bky r2 = r1.c
            int r2 = r2.j()
            int r3 = r1.i
            long r3 = (long) r3
            boolean r3 = a(r2, r3)
            if (r3 == 0) goto L_0x03c0
            int r3 = defpackage.aoo.a(r2)
            r4 = -1
            if (r3 != r4) goto L_0x0349
            r4 = 0
            goto L_0x03c1
        L_0x0349:
            aoo r3 = r1.d
            defpackage.aoo.a(r2, r3)
            long r2 = r1.l
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x037c
            app r2 = r1.k
            r3 = r0
            aof r3 = (defpackage.aof) r3
            long r6 = r3.c
            long r2 = r2.b(r6)
            r1.l = r2
            long r2 = r1.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x037c
            app r2 = r1.k
            r3 = 0
            long r2 = r2.b(r3)
            long r4 = r1.l
            long r6 = r1.b
            long r6 = r6 - r2
            long r4 = r4 + r6
            r1.l = r4
        L_0x037c:
            aoo r2 = r1.d
            int r2 = r2.c
            r1.o = r2
        L_0x0382:
            aov r3 = r1.h
            r4 = 1
            int r0 = r3.a(r0, r2, r4)
            r2 = -1
            if (r0 == r2) goto L_0x03be
            int r2 = r1.o
            int r2 = r2 - r0
            r1.o = r2
            if (r2 <= 0) goto L_0x0395
            r2 = 0
            goto L_0x03cd
        L_0x0395:
            long r2 = r1.l
            long r4 = r1.m
            aoo r0 = r1.d
            int r6 = r0.d
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r7
            long r6 = (long) r6
            long r4 = r4 / r6
            aov r6 = r1.h
            long r7 = r2 + r4
            r9 = 1
            int r10 = r0.c
            r11 = 0
            r12 = 0
            r6.a(r7, r9, r10, r11, r12)
            long r2 = r1.m
            aoo r0 = r1.d
            int r0 = r0.g
            long r4 = (long) r0
            long r2 = r2 + r4
            r1.m = r2
            r4 = 0
            r1.o = r4
            return r4
        L_0x03be:
        L_0x03bf:
            goto L_0x03cd
        L_0x03c0:
            r4 = 0
        L_0x03c1:
            r2 = 1
            r0.a(r2)
            r1.i = r4
            r2 = 0
            goto L_0x03cd
        L_0x03cb:
            r2 = -1
            goto L_0x03bf
        L_0x03cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apo.a(aoj, aop):int");
    }

    public final void a(long j2, long j3) {
        this.i = 0;
        this.l = -9223372036854775807L;
        this.m = 0;
        this.o = 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: apo.a(aoj, boolean):boolean
     arg types: [aoj, int]
     candidates:
      apo.a(int, long):boolean
      apo.a(aoj, aop):int
      apo.a(long, long):void
      aoi.a(aoj, aop):int
      aoi.a(long, long):void
      apo.a(aoj, boolean):boolean */
    public final boolean a(aoj aoj) {
        return a(aoj, true);
    }

    private final boolean a(aoj aoj, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int a2;
        int i7 = !z ? 131072 : 16384;
        aoj.a();
        if (((aof) aoj).c == 0) {
            atw a3 = this.f.a(aoj);
            this.j = a3;
            if (a3 != null) {
                this.e.a(a3);
            }
            int b2 = (int) aoj.b();
            if (!z) {
                aoj.a(b2);
            }
            i2 = b2;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        while (true) {
            if (!b(aoj)) {
                this.c.c(0);
                int j2 = this.c.j();
                if ((i4 == 0 || a(j2, (long) i4)) && (a2 = aoo.a(j2)) != -1) {
                    i6 = i5 + 1;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        aoo.a(j2, this.d);
                        i4 = j2;
                    }
                    aoj.b(a2 - 4);
                } else {
                    int i8 = i3 + 1;
                    if (i3 != i7) {
                        if (z) {
                            aoj.a();
                            aoj.b(i2 + i8);
                            i3 = i8;
                            i6 = 0;
                            i4 = 0;
                        } else {
                            aoj.a(1);
                            i3 = i8;
                            i6 = 0;
                            i4 = 0;
                        }
                    } else if (z) {
                        return false;
                    } else {
                        throw new ako("Searched too many bytes.");
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            aoj.a(i2 + i3);
        } else {
            aoj.a();
        }
        this.i = i4;
        return true;
    }
}
