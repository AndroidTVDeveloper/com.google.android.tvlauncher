package p000;

import java.io.EOFException;

/* renamed from: apo */
/* compiled from: PG */
public final class apo implements aoi {

    /* renamed from: a */
    public boolean f1706a;

    /* renamed from: b */
    private final long f1707b;

    /* renamed from: c */
    private final bky f1708c;

    /* renamed from: d */
    private final aoo f1709d;

    /* renamed from: e */
    private final aom f1710e;

    /* renamed from: f */
    private final aon f1711f;

    /* renamed from: g */
    private aok f1712g;

    /* renamed from: h */
    private aov f1713h;

    /* renamed from: i */
    private int f1714i;

    /* renamed from: j */
    private atw f1715j;

    /* renamed from: k */
    private C0017app f1716k;

    /* renamed from: l */
    private long f1717l;

    /* renamed from: m */
    private long f1718m;

    /* renamed from: n */
    private long f1719n;

    /* renamed from: o */
    private int f1720o;

    public apo() {
        this((byte) 0);
    }

    /* renamed from: a */
    private static boolean m1742a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    public apo(byte b) {
        this(-9223372036854775807L);
    }

    public apo(long j) {
        this.f1707b = j;
        this.f1708c = new bky(10);
        this.f1709d = new aoo();
        this.f1710e = new aom();
        this.f1717l = -9223372036854775807L;
        this.f1711f = new aon();
    }

    /* renamed from: c */
    private final C0017app m1745c(aoj aoj) {
        aoj.mo1199c(this.f1708c.f4258a, 0, 4);
        this.f1708c.mo2073c(0);
        aoo.m1673a(this.f1708c.mo2083j(), this.f1709d);
        aof aof = (aof) aoj;
        return new aoe(aof.f1489b, aof.f1490c, this.f1709d);
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1712g = aok;
        this.f1713h = aok.mo1211a(0, 1);
        this.f1712g.mo1210S();
    }

    /* renamed from: b */
    private final boolean m1744b(aoj aoj) {
        C0017app app = this.f1716k;
        if (app != null) {
            long c = app.mo1188c();
            if (c != -1 && aoj.mo1194b() > c - 4) {
                return true;
            }
        }
        try {
            return !aoj.mo1197b(this.f1708c.f4258a, 0, 4, true);
        } catch (EOFException e) {
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1206a(p000.aoj r41, p000.aop r42) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            int r2 = r1.f1714i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x0010
            r1.m1743a(r0, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            return r3
        L_0x0010:
            app r2 = r1.f1716k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r9 = 1
            if (r2 != 0) goto L_0x0306
            bky r2 = new bky
            aoo r10 = r1.f1709d
            int r10 = r10.f1509c
            r2.<init>(r10)
            byte[] r10 = r2.f4258a
            aoo r11 = r1.f1709d
            int r11 = r11.f1509c
            r0.mo1199c(r10, r4, r11)
            aoo r10 = r1.f1709d
            int r11 = r10.f1507a
            r11 = r11 & r9
            r12 = 36
            r13 = 21
            if (r11 == 0) goto L_0x003d
            int r10 = r10.f1511e
            if (r10 == r9) goto L_0x003c
            r13 = 36
            goto L_0x0046
        L_0x003c:
            goto L_0x0041
        L_0x003d:
            int r10 = r10.f1511e
            if (r10 == r9) goto L_0x0042
        L_0x0041:
            goto L_0x0046
        L_0x0042:
            r10 = 13
            r13 = 13
        L_0x0046:
            int r10 = r2.f4260c
            int r11 = r13 + 4
            r14 = 1483304551(0x58696e67, float:1.02664153E15)
            r15 = 1231971951(0x496e666f, float:976486.94)
            r3 = 1447187017(0x56425249, float:5.3414667E13)
            if (r10 < r11) goto L_0x0061
            r2.mo2073c(r13)
            int r10 = r2.mo2083j()
            if (r10 != r14) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            if (r10 == r15) goto L_0x0076
        L_0x0061:
            int r10 = r2.f4260c
            r11 = 40
            if (r10 < r11) goto L_0x0075
            r2.mo2073c(r12)
            int r10 = r2.mo2083j()
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
            aof r3 = (p000.aof) r3
            long r13 = r3.f1489b
            r18 = r13
            long r12 = r3.f1490c
            aoo r3 = r1.f1709d
            r10 = 10
            r2.mo2075d(r10)
            int r10 = r2.mo2083j()
            if (r10 <= 0) goto L_0x014b
            int r14 = r3.f1510d
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
            long r29 = p000.blm.m3663b(r20, r22, r24)
            int r7 = r2.mo2076e()
            int r8 = r2.mo2076e()
            int r9 = r2.mo2076e()
            r10 = 2
            r2.mo2075d(r10)
            int r3 = r3.f1509c
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
            int r14 = r2.mo2087n()
            goto L_0x0103
        L_0x00f4:
            int r14 = r2.mo2080g()
            goto L_0x0103
        L_0x00f9:
            int r14 = r2.mo2076e()
            goto L_0x0103
        L_0x00fe:
            r13 = 2
            int r14 = r2.mo2074d()
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
            aoo r2 = r1.f1709d
            int r2 = r2.f1509c
            r0.mo1192a(r2)
            goto L_0x024f
        L_0x0156:
            r41.mo1191a()
            r8 = 0
            goto L_0x024f
        L_0x015d:
            r7 = r11
        L_0x015e:
            r3 = r0
            aof r3 = (p000.aof) r3
            long r4 = r3.f1489b
            long r8 = r3.f1490c
            aoo r3 = r1.f1709d
            int r6 = r3.f1513g
            int r11 = r3.f1510d
            int r12 = r2.mo2083j()
            r14 = r12 & 1
            r15 = 1
            if (r14 != r15) goto L_0x01f1
            int r14 = r2.mo2087n()
            if (r14 == 0) goto L_0x01f0
            long r14 = (long) r14
            long r0 = (long) r6
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r28 = r0 * r21
            long r0 = (long) r11
            r26 = r14
            r30 = r0
            long r30 = p000.blm.m3663b(r26, r28, r30)
            r0 = 6
            r1 = r12 & 6
            if (r1 == r0) goto L_0x019e
            apr r0 = new apr
            int r1 = r3.f1509c
            r26 = r0
            r27 = r8
            r29 = r1
            r26.<init>(r27, r29, r30)
            r8 = r0
            goto L_0x01f2
        L_0x019e:
            int r0 = r2.mo2087n()
            long r0 = (long) r0
            r6 = 100
            long[] r11 = new long[r6]
            r12 = 0
        L_0x01a8:
            if (r12 >= r6) goto L_0x01b4
            int r14 = r2.mo2074d()
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
            int r3 = r3.f1509c
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
            aom r0 = r1.f1710e
            boolean r0 = r0.mo1214a()
            if (r0 != 0) goto L_0x0230
            r41.mo1191a()
            int r13 = r13 + 141
            r0 = r41
            r0.mo1195b(r13)
            bky r2 = r1.f1708c
            byte[] r2 = r2.f4258a
            r3 = 3
            r4 = 0
            r0.mo1199c(r2, r4, r3)
            bky r2 = r1.f1708c
            r2.mo2073c(r4)
            aom r2 = r1.f1710e
            bky r3 = r1.f1708c
            int r3 = r3.mo2080g()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x022b
            if (r3 <= 0) goto L_0x0232
        L_0x022b:
            r2.f1497a = r4
            r2.f1498b = r3
            goto L_0x0232
        L_0x0230:
            r0 = r41
        L_0x0232:
            aoo r2 = r1.f1709d
            int r2 = r2.f1509c
            r0.mo1192a(r2)
            if (r8 == 0) goto L_0x024e
            boolean r2 = r8.mo1177d()
            if (r2 == 0) goto L_0x0242
            goto L_0x024e
        L_0x0242:
            r2 = 1231971951(0x496e666f, float:976486.94)
            if (r10 == r2) goto L_0x0249
            goto L_0x024e
        L_0x0249:
            app r8 = r40.m1745c(r41)
            goto L_0x024f
        L_0x024e:
        L_0x024f:
            atw r2 = r1.f1715j
            r3 = r0
            aof r3 = (p000.aof) r3
            long r4 = r3.f1490c
            if (r2 == 0) goto L_0x02a5
            int r6 = r2.mo1344a()
            r7 = 0
        L_0x025d:
            if (r7 >= r6) goto L_0x02a4
            atv r9 = r2.mo1345a(r7)
            boolean r10 = r9 instanceof p000.avg
            if (r10 == 0) goto L_0x02a1
            avg r9 = (p000.avg) r9
            int[] r2 = r9.f2489d
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
            int r14 = r9.f2487a
            int[] r15 = r9.f2489d
            r15 = r15[r5]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r10 = r10 + r14
            int r14 = r9.f2488b
            int[] r15 = r9.f2490e
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
            boolean r4 = r1.f1706a
            if (r4 == 0) goto L_0x02b2
            aor r2 = new aor
            r2.<init>()
            r1.f1716k = r2
            goto L_0x02c5
        L_0x02b2:
            if (r2 == 0) goto L_0x02b7
            r1.f1716k = r2
            goto L_0x02bb
        L_0x02b7:
            if (r8 == 0) goto L_0x02bb
            r1.f1716k = r8
        L_0x02bb:
            app r2 = r1.f1716k
            if (r2 != 0) goto L_0x02c5
            app r2 = r40.m1745c(r41)
            r1.f1716k = r2
        L_0x02c5:
            aok r2 = r1.f1712g
            app r4 = r1.f1716k
            r2.mo1212a(r4)
            aov r2 = r1.f1713h
            aoo r4 = r1.f1709d
            java.lang.String r5 = r4.f1508b
            int r6 = r4.f1511e
            int r4 = r4.f1510d
            aom r7 = r1.f1710e
            r26 = 0
            r28 = -1
            r29 = 4096(0x1000, float:5.74E-42)
            r32 = -1
            int r8 = r7.f1497a
            int r7 = r7.f1498b
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            atw r9 = r1.f1715j
            r27 = r5
            r30 = r6
            r31 = r4
            r33 = r8
            r34 = r7
            r39 = r9
            akh r4 = p000.akh.m729a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2.mo1204a(r4)
            long r2 = r3.f1490c
            r1.f1719n = r2
            goto L_0x031c
        L_0x0306:
            long r2 = r1.f1719n
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x031c
            r4 = r0
            aof r4 = (p000.aof) r4
            long r4 = r4.f1490c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x031c
            long r2 = r2 - r4
            int r3 = (int) r2
            r0.mo1192a(r3)
        L_0x031c:
            int r2 = r1.f1720o
            if (r2 == 0) goto L_0x0321
            goto L_0x0382
        L_0x0321:
            r41.mo1191a()
            boolean r2 = r40.m1744b(r41)
            if (r2 != 0) goto L_0x03cb
            bky r2 = r1.f1708c
            r3 = 0
            r2.mo2073c(r3)
            bky r2 = r1.f1708c
            int r2 = r2.mo2083j()
            int r3 = r1.f1714i
            long r3 = (long) r3
            boolean r3 = m1742a(r2, r3)
            if (r3 == 0) goto L_0x03c0
            int r3 = p000.aoo.m1672a(r2)
            r4 = -1
            if (r3 != r4) goto L_0x0349
            r4 = 0
            goto L_0x03c1
        L_0x0349:
            aoo r3 = r1.f1709d
            p000.aoo.m1673a(r2, r3)
            long r2 = r1.f1717l
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x037c
            app r2 = r1.f1716k
            r3 = r0
            aof r3 = (p000.aof) r3
            long r6 = r3.f1490c
            long r2 = r2.mo1187b(r6)
            r1.f1717l = r2
            long r2 = r1.f1707b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x037c
            app r2 = r1.f1716k
            r3 = 0
            long r2 = r2.mo1187b(r3)
            long r4 = r1.f1717l
            long r6 = r1.f1707b
            long r6 = r6 - r2
            long r4 = r4 + r6
            r1.f1717l = r4
        L_0x037c:
            aoo r2 = r1.f1709d
            int r2 = r2.f1509c
            r1.f1720o = r2
        L_0x0382:
            aov r3 = r1.f1713h
            r4 = 1
            int r0 = r3.mo1202a(r0, r2, r4)
            r2 = -1
            if (r0 == r2) goto L_0x03be
            int r2 = r1.f1720o
            int r2 = r2 - r0
            r1.f1720o = r2
            if (r2 <= 0) goto L_0x0395
            r2 = 0
            goto L_0x03cd
        L_0x0395:
            long r2 = r1.f1717l
            long r4 = r1.f1718m
            aoo r0 = r1.f1709d
            int r6 = r0.f1510d
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r7
            long r6 = (long) r6
            long r4 = r4 / r6
            aov r6 = r1.f1713h
            long r7 = r2 + r4
            r9 = 1
            int r10 = r0.f1509c
            r11 = 0
            r12 = 0
            r6.mo1203a(r7, r9, r10, r11, r12)
            long r2 = r1.f1718m
            aoo r0 = r1.f1709d
            int r0 = r0.f1513g
            long r4 = (long) r0
            long r2 = r2 + r4
            r1.f1718m = r2
            r4 = 0
            r1.f1720o = r4
            return r4
        L_0x03be:
        L_0x03bf:
            goto L_0x03cd
        L_0x03c0:
            r4 = 0
        L_0x03c1:
            r2 = 1
            r0.mo1192a(r2)
            r1.f1714i = r4
            r2 = 0
            goto L_0x03cd
        L_0x03cb:
            r2 = -1
            goto L_0x03bf
        L_0x03cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.apo.mo1206a(aoj, aop):int");
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1714i = 0;
        this.f1717l = -9223372036854775807L;
        this.f1718m = 0;
        this.f1720o = 0;
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
    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        return m1743a(aoj, true);
    }

    /* renamed from: a */
    private final boolean m1743a(aoj aoj, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int a;
        int i6 = !z ? 131072 : 16384;
        aoj.mo1191a();
        if (((aof) aoj).f1490c == 0) {
            atw a2 = this.f1711f.mo1215a(aoj);
            this.f1715j = a2;
            if (a2 != null) {
                this.f1710e.mo1213a(a2);
            }
            int b = (int) aoj.mo1194b();
            if (!z) {
                aoj.mo1192a(b);
            }
            i = b;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        while (true) {
            if (!m1744b(aoj)) {
                this.f1708c.mo2073c(0);
                int j = this.f1708c.mo2083j();
                if ((i3 == 0 || m1742a(j, (long) i3)) && (a = aoo.m1672a(j)) != -1) {
                    i5 = i4 + 1;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        aoo.m1673a(j, this.f1709d);
                        i3 = j;
                    }
                    aoj.mo1195b(a - 4);
                } else {
                    int i7 = i2 + 1;
                    if (i2 != i6) {
                        if (z) {
                            aoj.mo1191a();
                            aoj.mo1195b(i + i7);
                            i2 = i7;
                            i5 = 0;
                            i3 = 0;
                        } else {
                            aoj.mo1192a(1);
                            i2 = i7;
                            i5 = 0;
                            i3 = 0;
                        }
                    } else if (z) {
                        return false;
                    } else {
                        throw new ako("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            aoj.mo1192a(i + i2);
        } else {
            aoj.mo1191a();
        }
        this.f1714i = i3;
        return true;
    }
}
