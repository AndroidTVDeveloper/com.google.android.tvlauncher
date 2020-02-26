package p000;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: aqb */
/* compiled from: PG */
final class aqb {

    /* renamed from: a */
    private static final byte[] f1773a = blm.m3674c("OpusHead");

    /* renamed from: a */
    private static Pair m1785a(bky bky, int i) {
        bky.mo2073c(i + 12);
        bky.mo2075d(1);
        m1791b(bky);
        bky.mo2075d(2);
        int d = bky.mo2074d();
        if ((d & 128) != 0) {
            bky.mo2075d(2);
        }
        if ((d & 64) != 0) {
            bky.mo2075d(bky.mo2076e());
        }
        if ((d & 32) != 0) {
            bky.mo2075d(2);
        }
        bky.mo2075d(1);
        m1791b(bky);
        String a = bkt.m3514a(bky.mo2074d());
        if ("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a) || "audio/vnd.dts.hd".equals(a)) {
            return Pair.create(a, null);
        }
        bky.mo2075d(12);
        bky.mo2075d(1);
        int b = m1791b(bky);
        byte[] bArr = new byte[b];
        bky.mo2069a(bArr, 0, b);
        return Pair.create(a, bArr);
    }

    /* renamed from: b */
    private static int m1791b(bky bky) {
        int d = bky.mo2074d();
        int i = d & 127;
        while ((d & 128) == 128) {
            d = bky.mo2074d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }

    /* renamed from: a */
    private static int m1784a(bky bky) {
        bky.mo2073c(16);
        return bky.mo2083j();
    }

    /* renamed from: a */
    public static atw m1789a(aps aps) {
        apt a = aps.mo1235a(1751411826);
        apt a2 = aps.mo1235a(1801812339);
        apt a3 = aps.mo1235a(1768715124);
        if (!(a == null || a2 == null || a3 == null || m1784a(a.f1734a) != 1835299937)) {
            bky bky = a2.f1734a;
            bky.mo2073c(12);
            int j = bky.mo2083j();
            String[] strArr = new String[j];
            for (int i = 0; i < j; i++) {
                int j2 = bky.mo2083j();
                bky.mo2075d(4);
                strArr[i] = bky.mo2077e(j2 - 8);
            }
            bky bky2 = a3.f1734a;
            bky2.mo2073c(8);
            ArrayList arrayList = new ArrayList();
            while (bky2.mo2070b() > 8) {
                int i2 = bky2.f4259b;
                int j3 = bky2.mo2083j();
                int j4 = bky2.mo2083j() - 1;
                if (j4 >= 0 && j4 < j) {
                    aqi a4 = aqj.m1809a(bky2, i2 + j3, strArr[j4]);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(j4);
                    Log.w("AtomParsers", sb.toString());
                }
                bky2.mo2073c(i2 + j3);
            }
            if (!arrayList.isEmpty()) {
                return new atw(arrayList);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Pair m1786a(bky bky, int i, int i2) {
        Pair pair;
        boolean z;
        Integer num;
        aqp aqp;
        int i3;
        int i4;
        byte[] bArr;
        bky bky2 = bky;
        int i5 = bky2.f4259b;
        while (i5 - i < i2) {
            bky2.mo2073c(i5);
            int j = bky.mo2083j();
            boolean z2 = true;
            bks.m3511a(j > 0, "childAtomSize should be positive");
            if (bky.mo2083j() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < j) {
                    bky2.mo2073c(i6);
                    int j2 = bky.mo2083j();
                    int j3 = bky.mo2083j();
                    if (j3 == 1718775137) {
                        num2 = Integer.valueOf(bky.mo2083j());
                    } else if (j3 == 1935894637) {
                        bky2.mo2075d(4);
                        str = bky2.mo2077e(4);
                    } else if (j3 == 1935894633) {
                        i7 = i6;
                        i8 = j2;
                    }
                    i6 += j2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    bks.m3511a(num2 != null, "frma atom is mandatory");
                    if (i7 != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bks.m3511a(z, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            aqp = null;
                            break;
                        }
                        bky2.mo2073c(i9);
                        int j4 = bky.mo2083j();
                        if (bky.mo2083j() != 1952804451) {
                            i9 += j4;
                        } else {
                            int j5 = bky.mo2083j();
                            bky2.mo2075d(1);
                            if (apu.m1767c(j5) == 0) {
                                bky2.mo2075d(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int d = bky.mo2074d();
                                i4 = d & 15;
                                i3 = (d & 240) >> 4;
                            }
                            boolean z3 = bky.mo2074d() == 1;
                            int d2 = bky.mo2074d();
                            byte[] bArr2 = new byte[16];
                            bky2.mo2069a(bArr2, 0, 16);
                            if (z3 && d2 == 0) {
                                int d3 = bky.mo2074d();
                                byte[] bArr3 = new byte[d3];
                                bky2.mo2069a(bArr3, 0, d3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            aqp = new aqp(z3, str, d2, bArr2, i3, i4, bArr);
                        }
                    }
                    if (aqp == null) {
                        z2 = false;
                    }
                    bks.m3511a(z2, "tenc atom is mandatory");
                    pair = Pair.create(num, aqp);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += j;
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, boolean, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x01bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0210 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.aqr m1788a(p000.aqo r36, p000.aps r37, p000.aom r38) {
        /*
            r1 = r36
            r0 = r37
            r2 = r38
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            apt r3 = r0.mo1235a(r3)
            if (r3 == 0) goto L_0x0015
            apy r4 = new apy
            r4.<init>(r3)
            goto L_0x0025
        L_0x0015:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            apt r3 = r0.mo1235a(r3)
            if (r3 == 0) goto L_0x0563
            apz r4 = new apz
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.mo1241a()
            r5 = 0
            if (r3 != 0) goto L_0x0046
            aqr r9 = new aqr
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r9
            r1 = r36
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0046:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            apt r6 = r0.mo1235a(r6)
            if (r6 != 0) goto L_0x0058
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            apt r6 = r0.mo1235a(r6)
            r8 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
        L_0x005a:
            bky r6 = r6.f1734a
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            apt r9 = r0.mo1235a(r9)
            bky r9 = r9.f1734a
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            apt r10 = r0.mo1235a(r10)
            bky r10 = r10.f1734a
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            apt r11 = r0.mo1235a(r11)
            r12 = 0
            if (r11 == 0) goto L_0x007b
            bky r11 = r11.f1734a
            goto L_0x007d
        L_0x007b:
            r11 = r12
        L_0x007d:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            apt r0 = r0.mo1235a(r13)
            if (r0 == 0) goto L_0x0089
            bky r0 = r0.f1734a
            goto L_0x008b
        L_0x0089:
            r0 = r12
        L_0x008b:
            apv r13 = new apv
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo2073c(r6)
            int r8 = r10.mo2087n()
            r9 = -1
            int r8 = r8 + r9
            int r14 = r10.mo2087n()
            int r15 = r10.mo2087n()
            if (r0 == 0) goto L_0x00ad
            r0.mo2073c(r6)
            int r16 = r0.mo2087n()
            goto L_0x00b0
        L_0x00ad:
            r16 = 0
        L_0x00b0:
            if (r11 == 0) goto L_0x00c4
            r11.mo2073c(r6)
            int r6 = r11.mo2087n()
            if (r6 <= 0) goto L_0x00c1
            int r12 = r11.mo2087n()
            int r12 = r12 + r9
            goto L_0x00c6
        L_0x00c1:
            r11 = r12
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            r12 = -1
        L_0x00c6:
            boolean r17 = r4.mo1243c()
            r18 = 0
            if (r17 == 0) goto L_0x0192
            akh r9 = r1.f1870f
            java.lang.String r9 = r9.f556i
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0192
            if (r8 != 0) goto L_0x0192
            if (r16 != 0) goto L_0x0192
            if (r6 != 0) goto L_0x0192
            int r5 = r13.f1736a
            long[] r9 = new long[r5]
            int[] r0 = new int[r5]
        L_0x00e6:
            boolean r4 = r13.mo1240a()
            if (r4 == 0) goto L_0x00f7
            int r4 = r13.f1737b
            long r10 = r13.f1739d
            r9[r4] = r10
            int r6 = r13.f1738c
            r0[r4] = r6
            goto L_0x00e6
        L_0x00f7:
            akh r4 = r1.f1870f
            int r6 = r4.f571x
            int r4 = r4.f569v
            int r20 = p000.blm.m3660b(r6, r4)
            long r10 = (long) r15
            r4 = 8192(0x2000, float:1.14794E-41)
            int r4 = r4 / r20
            r6 = 0
            r8 = 0
        L_0x0108:
            if (r6 >= r5) goto L_0x0114
            r12 = r0[r6]
            int r12 = p000.blm.m3623a(r12, r4)
            int r8 = r8 + r12
            int r6 = r6 + 1
            goto L_0x0108
        L_0x0114:
            long[] r6 = new long[r8]
            int[] r12 = new int[r8]
            long[] r13 = new long[r8]
            int[] r8 = new int[r8]
            r14 = 0
            r15 = 0
            r16 = 0
            r24 = 0
        L_0x0122:
            if (r14 < r5) goto L_0x014a
            aqd r0 = new aqd
            long r4 = (long) r15
            long r27 = r10 * r4
            r21 = r0
            r22 = r6
            r23 = r12
            r25 = r13
            r26 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27)
            long[] r4 = r0.f1778a
            int[] r5 = r0.f1779b
            int r6 = r0.f1780c
            long[] r8 = r0.f1781d
            int[] r9 = r0.f1782e
            long r10 = r0.f1783f
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r9
            goto L_0x0280
        L_0x014a:
            r21 = r0[r14]
            r22 = r9[r14]
            r7 = r15
            r15 = r21
            r34 = r22
            r22 = r0
            r0 = r24
            r23 = r34
        L_0x0159:
            if (r15 <= 0) goto L_0x0185
            int r25 = java.lang.Math.min(r4, r15)
            r6[r16] = r23
            r37 = r4
            int r4 = r20 * r25
            r12[r16] = r4
            int r0 = java.lang.Math.max(r0, r4)
            r26 = r5
            long r4 = (long) r7
            long r4 = r4 * r10
            r13[r16] = r4
            r4 = 1
            r8[r16] = r4
            r4 = r12[r16]
            long r4 = (long) r4
            long r23 = r23 + r4
            int r7 = r7 + r25
            int r15 = r15 - r25
            int r16 = r16 + 1
            r4 = r37
            r5 = r26
            goto L_0x0159
        L_0x0185:
            r37 = r4
            r26 = r5
            int r14 = r14 + 1
            r24 = r0
            r15 = r7
            r0 = r22
            goto L_0x0122
        L_0x0192:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r9 = new long[r3]
            r20 = r6
            int[] r6 = new int[r3]
            r26 = r10
            r27 = r11
            r29 = r12
            r10 = r14
            r30 = r15
            r22 = r18
            r24 = r22
            r15 = r20
            r12 = 0
            r14 = 0
            r28 = 0
            r11 = r8
            r20 = r16
            r8 = 0
            r16 = 0
        L_0x01b5:
            r31 = r4
            java.lang.String r4 = "AtomParsers"
            if (r8 < r3) goto L_0x01be
            r2 = r16
            goto L_0x01fd
        L_0x01be:
            r32 = r24
            r24 = 1
        L_0x01c5:
            if (r16 != 0) goto L_0x01e0
            boolean r24 = r13.mo1240a()
            if (r24 == 0) goto L_0x01dd
            r25 = r3
            long r2 = r13.f1739d
            r32 = r2
            int r2 = r13.f1738c
            r16 = r2
            r3 = r25
            r2 = r38
            goto L_0x01c5
        L_0x01dd:
            r25 = r3
            goto L_0x01e2
        L_0x01e0:
            r25 = r3
        L_0x01e2:
            if (r24 != 0) goto L_0x04da
            java.lang.String r2 = "Unexpected end of chunk data"
            android.util.Log.w(r4, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r8)
            int[] r7 = java.util.Arrays.copyOf(r7, r8)
            long[] r9 = java.util.Arrays.copyOf(r9, r8)
            int[] r6 = java.util.Arrays.copyOf(r6, r8)
            r3 = r8
            r2 = r16
        L_0x01fd:
            long r12 = (long) r12
            long r12 = r22 + r12
        L_0x0200:
            if (r20 <= 0) goto L_0x0210
            int r8 = r0.mo2087n()
            if (r8 != 0) goto L_0x020e
            r0.mo2083j()
            int r20 = r20 + -1
            goto L_0x0200
        L_0x020e:
            r0 = 0
            goto L_0x0212
        L_0x0210:
            r0 = 1
        L_0x0212:
            if (r15 == 0) goto L_0x0215
            goto L_0x0224
        L_0x0215:
            if (r10 != 0) goto L_0x0224
            if (r2 != 0) goto L_0x0224
            if (r11 != 0) goto L_0x0224
            if (r14 != 0) goto L_0x0224
            if (r0 == 0) goto L_0x0224
            r37 = r3
            r16 = r5
            goto L_0x0277
        L_0x0224:
            int r8 = r1.f1865a
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = ""
            goto L_0x022e
        L_0x022b:
            java.lang.String r0 = ", ctts invalid"
        L_0x022e:
            r37 = r3
            int r3 = r0.length()
            r16 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 262
            r5.<init>(r3)
            java.lang.String r3 = "Inconsistent stbl box for track "
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = ": remainingSynchronizationSamples "
            r5.append(r3)
            r5.append(r15)
            java.lang.String r3 = ", remainingSamplesAtTimestampDelta "
            r5.append(r3)
            r5.append(r10)
            java.lang.String r3 = ", remainingSamplesInChunk "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r5.append(r2)
            r5.append(r14)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r4, r0)
        L_0x0277:
            r0 = r37
            r3 = r7
            r5 = r9
            r10 = r12
            r2 = r16
            r4 = r28
        L_0x0280:
            r24 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1.f1867c
            r22 = r10
            r26 = r7
            long r7 = p000.blm.m3663b(r22, r24, r26)
            long[] r9 = r1.f1872h
            if (r9 != 0) goto L_0x029f
            long r9 = r1.f1867c
            p000.blm.m3647a(r5, r9)
            aqr r9 = new aqr
            r0 = r9
            r1 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x029f:
            int r7 = r9.length
            r8 = 1
            if (r7 == r8) goto L_0x02a8
            r37 = r3
            r12 = r4
            goto L_0x0351
        L_0x02a8:
            int r7 = r1.f1866b
            if (r7 != r8) goto L_0x034e
            int r7 = r5.length
            r8 = 2
            if (r7 < r8) goto L_0x034a
            long[] r8 = r1.f1873i
            r12 = 0
            r13 = r8[r12]
            r22 = r9[r12]
            long r8 = r1.f1867c
            r37 = r3
            r12 = r4
            long r3 = r1.f1868d
            r24 = r8
            r26 = r3
            long r3 = p000.blm.m3663b(r22, r24, r26)
            long r3 = r3 + r13
            int r8 = r7 + -1
            r9 = 4
            r15 = 0
            int r9 = p000.blm.m3624a(r9, r15, r8)
            int r7 = r7 + -4
            int r7 = p000.blm.m3624a(r7, r15, r8)
            r22 = r5[r15]
            int r8 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0351
            r8 = r5[r9]
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x0351
            r7 = r5[r7]
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0351
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x0351
            long r24 = r13 - r22
            akh r7 = r1.f1870f
            int r7 = r7.f570w
            long r7 = (long) r7
            long r13 = r1.f1867c
            r26 = r7
            r28 = r13
            long r7 = p000.blm.m3663b(r24, r26, r28)
            long r22 = r10 - r3
            akh r3 = r1.f1870f
            int r3 = r3.f570w
            long r3 = (long) r3
            long r13 = r1.f1867c
            r24 = r3
            r26 = r13
            long r3 = p000.blm.m3663b(r22, r24, r26)
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x0312
            goto L_0x0316
        L_0x0312:
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x0351
        L_0x0316:
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0351
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0351
            int r0 = (int) r7
            r7 = r38
            r7.f1497a = r0
            int r0 = (int) r3
            r7.f1498b = r0
            long r3 = r1.f1867c
            p000.blm.m3647a(r5, r3)
            long[] r0 = r1.f1872h
            r3 = 0
            r13 = r0[r3]
            long r3 = r1.f1868d
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r3
            long r7 = p000.blm.m3663b(r13, r15, r17)
            aqr r9 = new aqr
            r0 = r9
            r1 = r36
            r3 = r37
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x034a:
            r37 = r3
            r12 = r4
            goto L_0x0351
        L_0x034e:
            r37 = r3
            r12 = r4
        L_0x0351:
            long[] r3 = r1.f1872h
            int r4 = r3.length
            r7 = 1
            if (r4 != r7) goto L_0x0393
            r7 = 0
            r8 = r3[r7]
            int r3 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x0393
            long[] r0 = r1.f1873i
            r3 = r0[r7]
            r0 = 0
        L_0x0363:
            int r7 = r5.length
            if (r0 >= r7) goto L_0x037a
            r7 = r5[r0]
            long r13 = r7 - r3
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1.f1867c
            r17 = r7
            long r7 = p000.blm.m3663b(r13, r15, r17)
            r5[r0] = r7
            int r0 = r0 + 1
            goto L_0x0363
        L_0x037a:
            long r7 = r1.f1867c
            long r13 = r10 - r3
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r7
            long r7 = p000.blm.m3663b(r13, r15, r17)
            aqr r9 = new aqr
            r0 = r9
            r1 = r36
            r3 = r37
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0393:
            int r3 = r1.f1866b
            r7 = 1
            if (r3 != r7) goto L_0x039a
            r3 = 1
            goto L_0x039c
        L_0x039a:
            r3 = 0
        L_0x039c:
            int[] r7 = new int[r4]
            int[] r4 = new int[r4]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x03a4:
            long[] r13 = r1.f1872h
            int r14 = r13.length
            if (r8 >= r14) goto L_0x040b
            long[] r14 = r1.f1873i
            r38 = r11
            r15 = r12
            r11 = r14[r8]
            r22 = -1
            int r14 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r14 == 0) goto L_0x03fe
            r22 = r13[r8]
            long r13 = r1.f1867c
            r16 = r9
            r20 = r10
            long r9 = r1.f1868d
            r24 = r13
            r26 = r9
            long r9 = p000.blm.m3663b(r22, r24, r26)
            r13 = 1
            int r14 = p000.blm.m3629a(r5, r11, r13, r13)
            r7[r8] = r14
            long r11 = r11 + r9
            r9 = 0
            int r10 = p000.blm.m3629a(r5, r11, r3, r9)
            r4[r8] = r10
        L_0x03d7:
            r10 = r7[r8]
            r11 = r4[r8]
            if (r10 < r11) goto L_0x03de
        L_0x03dd:
            goto L_0x03e9
        L_0x03de:
            r12 = r6[r10]
            r13 = 1
            r12 = r12 & r13
            if (r12 != 0) goto L_0x03dd
            int r10 = r10 + 1
            r7[r8] = r10
            goto L_0x03d7
        L_0x03e9:
            int r12 = r11 - r10
            int r12 = r16 + r12
            r13 = r20
            if (r13 == r10) goto L_0x03f3
            r10 = 1
            goto L_0x03f4
        L_0x03f3:
            r10 = 0
        L_0x03f4:
            r10 = r38 | r10
            r16 = r12
            r34 = r11
            r11 = r10
            r10 = r34
            goto L_0x0404
        L_0x03fe:
            r16 = r9
            r13 = r10
            r9 = 0
            r11 = r38
        L_0x0404:
            int r8 = r8 + 1
            r12 = r15
            r9 = r16
            goto L_0x03a4
        L_0x040b:
            r16 = r9
            r38 = r11
            r15 = r12
            r9 = 0
            r3 = r16
            if (r3 == r0) goto L_0x0418
            r21 = 1
            goto L_0x041b
        L_0x0418:
            r21 = 0
        L_0x041b:
            r0 = r38 | r21
            if (r0 == 0) goto L_0x0422
            long[] r8 = new long[r3]
            goto L_0x0423
        L_0x0422:
            r8 = r2
        L_0x0423:
            if (r0 == 0) goto L_0x0428
            int[] r10 = new int[r3]
            goto L_0x042a
        L_0x0428:
            r10 = r37
        L_0x042a:
            if (r0 != 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r15 = 0
        L_0x042f:
            if (r0 == 0) goto L_0x0434
            int[] r11 = new int[r3]
            goto L_0x0435
        L_0x0434:
            r11 = r6
        L_0x0435:
            long[] r12 = new long[r3]
            r21 = r15
            r19 = r18
            r3 = 0
        L_0x043c:
            long[] r13 = r1.f1872h
            int r13 = r13.length
            if (r9 >= r13) goto L_0x04bd
            long[] r13 = r1.f1873i
            r22 = r13[r9]
            r13 = r7[r9]
            r15 = r4[r9]
            if (r0 == 0) goto L_0x045b
            int r14 = r15 - r13
            java.lang.System.arraycopy(r2, r13, r8, r3, r14)
            r24 = r2
            r2 = r37
            java.lang.System.arraycopy(r2, r13, r10, r3, r14)
            java.lang.System.arraycopy(r6, r13, r11, r3, r14)
            goto L_0x045f
        L_0x045b:
            r24 = r2
            r2 = r37
        L_0x045f:
            r34 = r21
            r21 = r3
            r3 = r13
            r13 = r34
        L_0x0466:
            if (r3 < r15) goto L_0x047a
            long[] r3 = r1.f1872h
            r14 = r3[r9]
            long r19 = r19 + r14
            int r9 = r9 + 1
            r37 = r2
            r3 = r21
            r2 = r24
            r21 = r13
            goto L_0x043c
        L_0x047a:
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r37 = r6
            r25 = r7
            long r6 = r1.f1868d
            r26 = r4
            r4 = r13
            r13 = r19
            r27 = r15
            r15 = r16
            r17 = r6
            long r6 = p000.blm.m3663b(r13, r15, r17)
            r13 = r5[r3]
            long r28 = r13 - r22
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r1.f1867c
            r32 = r13
            long r13 = p000.blm.m3663b(r28, r30, r32)
            long r6 = r6 + r13
            r12[r21] = r6
            if (r0 != 0) goto L_0x04a7
            goto L_0x04af
        L_0x04a7:
            r6 = r10[r21]
            if (r6 <= r4) goto L_0x04af
            r4 = r2[r3]
            r13 = r4
            goto L_0x04b0
        L_0x04af:
            r13 = r4
        L_0x04b0:
            int r21 = r21 + 1
            int r3 = r3 + 1
            r6 = r37
            r7 = r25
            r4 = r26
            r15 = r27
            goto L_0x0466
        L_0x04bd:
            long r2 = r1.f1868d
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r13 = r19
            r17 = r2
            long r13 = p000.blm.m3663b(r13, r15, r17)
            aqr r9 = new aqr
            r0 = r9
            r1 = r36
            r2 = r8
            r3 = r10
            r4 = r21
            r5 = r12
            r6 = r11
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x04da:
            r2 = 0
            if (r0 == 0) goto L_0x04ef
        L_0x04dd:
            if (r14 == 0) goto L_0x04e0
            goto L_0x04ed
        L_0x04e0:
            if (r20 <= 0) goto L_0x04ed
            int r14 = r0.mo2087n()
            int r12 = r0.mo2083j()
            int r20 = r20 + -1
            goto L_0x04dd
        L_0x04ed:
            int r14 = r14 + -1
        L_0x04ef:
            r5[r8] = r32
            int r3 = r31.mo1242b()
            r7[r8] = r3
            r4 = r28
            if (r3 > r4) goto L_0x04fe
            r28 = r4
            goto L_0x0500
        L_0x04fe:
            r28 = r3
        L_0x0500:
            long r3 = (long) r12
            long r3 = r22 + r3
            r9[r8] = r3
            if (r27 != 0) goto L_0x0509
            r3 = 1
            goto L_0x050b
        L_0x0509:
            r3 = 0
        L_0x050b:
            r6[r8] = r3
            r3 = r29
            if (r8 != r3) goto L_0x0528
            r4 = 1
            r6[r8] = r4
            int r15 = r15 + -1
            if (r15 > 0) goto L_0x051d
            r29 = r3
            r17 = -1
            goto L_0x052d
        L_0x051d:
            int r3 = r27.mo2087n()
            r17 = -1
            int r3 = r3 + -1
            r29 = r3
            goto L_0x052d
        L_0x0528:
            r4 = 1
            r17 = -1
            r29 = r3
        L_0x052d:
            r21 = r5
            r3 = r30
            long r4 = (long) r3
            long r22 = r22 + r4
            int r10 = r10 + -1
            if (r10 == 0) goto L_0x0539
        L_0x0538:
            goto L_0x0549
        L_0x0539:
            if (r11 <= 0) goto L_0x0538
            int r3 = r26.mo2087n()
            int r4 = r26.mo2083j()
            int r11 = r11 + -1
            r10 = r3
            r30 = r4
            goto L_0x054b
        L_0x0549:
            r30 = r3
        L_0x054b:
            r3 = r7[r8]
            long r3 = (long) r3
            long r3 = r32 + r3
            int r16 = r16 + -1
            int r8 = r8 + 1
            r2 = r38
            r5 = r21
            r34 = r3
            r3 = r25
            r24 = r34
            r4 = r31
            goto L_0x01b5
        L_0x0563:
            ako r0 = new ako
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            goto L_0x056c
        L_0x056b:
            throw r0
        L_0x056c:
            goto L_0x056b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aqb.m1788a(aqo, aps, aom):aqr");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08b7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.aqo m1787a(p000.aps r45, p000.apt r46, long r47, p000.anq r49, boolean r50) {
        /*
            r0 = r45
            r1 = r49
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            aps r2 = r0.mo1238b(r2)
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            apt r3 = r2.mo1235a(r3)
            bky r3 = r3.f1734a
            int r3 = m1784a(r3)
            r4 = -1
            r5 = 4
            r9 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r3 == r9) goto L_0x0046
            r9 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 == r9) goto L_0x0044
            r9 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r9) goto L_0x0042
            r9 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r9) goto L_0x0042
            r9 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r9) goto L_0x0042
            r9 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 == r9) goto L_0x0042
            r9 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r9) goto L_0x003f
            r12 = -1
            goto L_0x0047
        L_0x003f:
            r12 = 4
            goto L_0x0047
        L_0x0042:
            r12 = 3
            goto L_0x0047
        L_0x0044:
            r12 = 2
            goto L_0x0047
        L_0x0046:
            r12 = 1
        L_0x0047:
            if (r12 == r4) goto L_0x09b9
            r9 = 1953196132(0x746b6864, float:7.46037E31)
            apt r9 = r0.mo1235a(r9)
            bky r9 = r9.f1734a
            r10 = 8
            r9.mo2073c(r10)
            int r11 = r9.mo2083j()
            int r11 = p000.apu.m1767c(r11)
            r13 = 16
            if (r11 != 0) goto L_0x0066
            r14 = 8
            goto L_0x0069
        L_0x0066:
            r14 = 16
        L_0x0069:
            r9.mo2075d(r14)
            int r14 = r9.mo2083j()
            r9.mo2075d(r5)
            int r15 = r9.f4259b
            if (r11 != 0) goto L_0x0079
            r3 = 4
            goto L_0x007c
        L_0x0079:
            r3 = 8
        L_0x007c:
            r8 = 0
        L_0x007d:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r3) goto L_0x00a6
            byte[] r6 = r9.f4258a
            int r24 = r15 + r8
            byte r6 = r6[r24]
            if (r6 != r4) goto L_0x0091
            int r8 = r8 + 1
            goto L_0x007d
        L_0x0091:
            if (r11 != 0) goto L_0x0098
            long r24 = r9.mo2081h()
            goto L_0x009c
        L_0x0098:
            long r24 = r9.mo2089p()
        L_0x009c:
            int r3 = (r24 > r19 ? 1 : (r24 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00a3
            r7 = r21
            goto L_0x00ac
        L_0x00a3:
            r7 = r24
            goto L_0x00ac
        L_0x00a6:
            r9.mo2075d(r3)
            r7 = r21
        L_0x00ac:
            r9.mo2075d(r13)
            int r6 = r9.mo2083j()
            int r11 = r9.mo2083j()
            r9.mo2075d(r5)
            int r15 = r9.mo2083j()
            int r9 = r9.mo2083j()
            r3 = 65536(0x10000, float:9.18355E-41)
            r5 = -65536(0xffffffffffff0000, float:NaN)
            if (r6 != 0) goto L_0x00d2
            if (r11 != r3) goto L_0x00d2
            if (r15 != r5) goto L_0x00d2
            if (r9 != 0) goto L_0x00d2
            r6 = 90
            goto L_0x00ea
        L_0x00d2:
            if (r6 != 0) goto L_0x00de
            if (r11 != r5) goto L_0x00de
            if (r15 != r3) goto L_0x00de
            if (r9 == 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            r6 = 270(0x10e, float:3.78E-43)
            goto L_0x00ea
        L_0x00de:
            if (r6 != r5) goto L_0x00e9
            if (r11 != 0) goto L_0x00e9
            if (r15 != 0) goto L_0x00e9
            if (r9 != r5) goto L_0x00e9
            r6 = 180(0xb4, float:2.52E-43)
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            aqa r5 = new aqa
            r5.<init>(r14, r7, r6)
            int r3 = (r47 > r21 ? 1 : (r47 == r21 ? 0 : -1))
            if (r3 != 0) goto L_0x00f8
            long r6 = r5.f1771b
            r26 = r6
            goto L_0x00fa
        L_0x00f8:
            r26 = r47
        L_0x00fa:
            r3 = r46
            bky r3 = r3.f1734a
            r3.mo2073c(r10)
            int r6 = r3.mo2083j()
            int r6 = p000.apu.m1767c(r6)
            if (r6 != 0) goto L_0x010e
            r6 = 8
            goto L_0x0111
        L_0x010e:
            r6 = 16
        L_0x0111:
            r3.mo2075d(r6)
            long r6 = r3.mo2081h()
            int r3 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x0128
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r6
            long r8 = p000.blm.m3663b(r26, r28, r30)
            r21 = r8
            goto L_0x012a
        L_0x0128:
        L_0x012a:
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            aps r3 = r2.mo1238b(r3)
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            aps r8 = r3.mo1238b(r8)
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            apt r2 = r2.mo1235a(r3)
            bky r2 = r2.f1734a
            r2.mo2073c(r10)
            int r3 = r2.mo2083j()
            int r3 = p000.apu.m1767c(r3)
            if (r3 != 0) goto L_0x0151
            r9 = 8
            goto L_0x0154
        L_0x0151:
            r9 = 16
        L_0x0154:
            r2.mo2075d(r9)
            long r14 = r2.mo2081h()
            if (r3 != 0) goto L_0x015f
            r3 = 4
            goto L_0x0162
        L_0x015f:
            r3 = 8
        L_0x0162:
            r2.mo2075d(r3)
            int r2 = r2.mo2076e()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r3 = 3
            r9.<init>(r3)
            int r11 = r2 >> 10
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r9.append(r11)
            int r11 = r2 >> 5
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r9.append(r11)
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            android.util.Pair r2 = android.util.Pair.create(r9, r2)
            r9 = 1937011556(0x73747364, float:1.9367383E31)
            apt r8 = r8.mo1235a(r9)
            bky r8 = r8.f1734a
            int r9 = r5.f1770a
            int r11 = r5.f1772c
            java.lang.Object r14 = r2.second
            java.lang.String r14 = (java.lang.String) r14
            r15 = 12
            r8.mo2073c(r15)
            int r15 = r8.mo2083j()
            apx r3 = new apx
            r3.<init>(r15)
            r4 = 0
        L_0x01b7:
            if (r4 >= r15) goto L_0x08f1
            int r13 = r8.f4259b
            int r10 = r8.mo2083j()
            if (r10 <= 0) goto L_0x01c5
            r46 = r15
            r15 = 1
            goto L_0x01c9
        L_0x01c5:
            r46 = r15
            r15 = 0
        L_0x01c9:
            r47 = r6
            java.lang.String r6 = "childAtomSize should be positive"
            p000.bks.m3511a(r15, r6)
            int r7 = r8.mo2083j()
            r15 = 1635148593(0x61766331, float:2.840654E20)
            r39 = r12
            if (r7 != r15) goto L_0x01ea
            r41 = r2
            r43 = r4
            r42 = r5
            r37 = r6
            r44 = r10
            r40 = r11
            r10 = 0
            goto L_0x0667
        L_0x01ea:
            r15 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r15) goto L_0x065a
            r15 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r15) goto L_0x065a
            r15 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r15) goto L_0x065a
            r15 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r15) goto L_0x065a
            r15 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r15) goto L_0x065a
            r15 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r15) goto L_0x065a
            r15 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r15) goto L_0x065a
            r15 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r15) goto L_0x065a
            r15 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r15) goto L_0x065a
            r15 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r15) goto L_0x065a
            r15 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r15) goto L_0x065a
            r15 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r15) goto L_0x065a
            r15 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 == r15) goto L_0x065a
            r15 = 1836069985(0x6d703461, float:4.6462328E27)
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r15) goto L_0x0235
            goto L_0x0348
        L_0x0235:
            r15 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 == r15) goto L_0x0348
            r15 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r15) goto L_0x0348
            r15 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r15) goto L_0x0348
            r15 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r15) goto L_0x0348
            r15 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r15) goto L_0x0348
            r15 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r15) goto L_0x0348
            r15 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r15) goto L_0x0348
            r15 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r15) goto L_0x0348
            if (r7 == r12) goto L_0x0348
            r15 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r15) goto L_0x0348
            r15 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r15) goto L_0x0348
            r15 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r15) goto L_0x0348
            r15 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 == r15) goto L_0x0348
            r6 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 != r6) goto L_0x0292
            goto L_0x02cd
        L_0x0292:
            r6 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 == r6) goto L_0x02cd
            r6 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 == r6) goto L_0x02cd
            r6 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r6) goto L_0x02cd
            r6 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 == r6) goto L_0x02cd
            r6 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r6) goto L_0x02c2
            java.lang.String r6 = java.lang.Integer.toString(r9)
            java.lang.String r7 = "application/x-camera-motion"
            akh r6 = p000.akh.m728a(r6, r7)
            r3.f1746b = r6
            r41 = r2
            r43 = r4
            r42 = r5
            r2 = r10
            r40 = r11
            goto L_0x08d5
        L_0x02c2:
            r41 = r2
            r43 = r4
            r42 = r5
            r2 = r10
            r40 = r11
            goto L_0x08d5
        L_0x02cd:
            int r6 = r13 + 16
            r8.mo2073c(r6)
            r6 = 1414810956(0x54544d4c, float:3.64731957E12)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 != r6) goto L_0x02e5
            java.lang.String r6 = "application/ttml+xml"
            r32 = r26
            r34 = 0
            r27 = r6
            goto L_0x032b
        L_0x02e5:
            r6 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 != r6) goto L_0x0300
            int r6 = r10 + -16
            byte[] r7 = new byte[r6]
            r12 = 0
            r8.mo2069a(r7, r12, r6)
            java.util.List r6 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r34 = r6
            r32 = r26
            r27 = r7
            goto L_0x032b
        L_0x0300:
            r6 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 != r6) goto L_0x030f
            java.lang.String r6 = "application/x-mp4-vtt"
            r32 = r26
            r34 = 0
            r27 = r6
            goto L_0x032b
        L_0x030f:
            r6 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r6) goto L_0x0321
            r6 = 1
            r3.f1748d = r6
            java.lang.String r6 = "application/x-mp4-cea-608"
            r32 = r26
            r34 = 0
            r27 = r6
            goto L_0x032b
        L_0x0321:
            java.lang.String r6 = "application/ttml+xml"
            r27 = r6
            r32 = r19
            r34 = 0
        L_0x032b:
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = 0
            r30 = -1
            r31 = 0
            r29 = r14
            akh r6 = p000.akh.m732a(r26, r27, r28, r29, r30, r31, r32, r34)
            r3.f1746b = r6
            r41 = r2
            r43 = r4
            r42 = r5
            r2 = r10
            r40 = r11
            goto L_0x08d5
        L_0x0348:
            int r15 = r13 + 16
            r8.mo2073c(r15)
            if (r50 != 0) goto L_0x0356
            r15 = 8
            r8.mo2075d(r15)
            r15 = 0
            goto L_0x035e
        L_0x0356:
            int r15 = r8.mo2076e()
            r12 = 6
            r8.mo2075d(r12)
        L_0x035e:
            if (r15 == 0) goto L_0x0399
            r12 = 1
            if (r15 == r12) goto L_0x0396
            r12 = 2
            if (r15 != r12) goto L_0x038b
            r12 = 16
            r8.mo2075d(r12)
            long r26 = r8.mo2085l()
            double r26 = java.lang.Double.longBitsToDouble(r26)
            r40 = r11
            long r11 = java.lang.Math.round(r26)
            int r12 = (int) r11
            int r11 = r8.mo2087n()
            r15 = 20
            r8.mo2075d(r15)
            r41 = r2
            r42 = r5
            r26 = r11
            goto L_0x03d1
        L_0x038b:
            r40 = r11
            r41 = r2
            r43 = r4
            r42 = r5
            r2 = r10
            goto L_0x08d5
        L_0x0396:
            r40 = r11
            goto L_0x039b
        L_0x0399:
            r40 = r11
        L_0x039b:
            int r11 = r8.mo2076e()
            r12 = 6
            r8.mo2075d(r12)
            byte[] r12 = r8.f4258a
            r26 = r11
            int r11 = r8.f4259b
            r41 = r2
            int r2 = r11 + 1
            r8.f4259b = r2
            byte r11 = r12[r11]
            r42 = r5
            int r5 = r2 + 1
            r8.f4259b = r5
            r11 = r11 & 255(0xff, float:3.57E-43)
            r27 = 8
            int r11 = r11 << 8
            byte r2 = r12[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r12 = r11 | r2
            r2 = 2
            int r5 = r5 + r2
            r8.f4259b = r5
            r2 = 1
            if (r15 != r2) goto L_0x03d0
            r2 = 16
            r8.mo2075d(r2)
            goto L_0x03d1
        L_0x03d0:
        L_0x03d1:
            int r2 = r8.f4259b
            r5 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r5) goto L_0x0403
            android.util.Pair r5 = m1786a(r8, r13, r10)
            if (r5 == 0) goto L_0x03fe
            java.lang.Object r7 = r5.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r1 == 0) goto L_0x03f3
            java.lang.Object r11 = r5.second
            aqp r11 = (p000.aqp) r11
            java.lang.String r11 = r11.f1877b
            anq r11 = r1.mo1168a(r11)
            goto L_0x03f5
        L_0x03f3:
            r11 = 0
        L_0x03f5:
            aqp[] r15 = r3.f1745a
            java.lang.Object r5 = r5.second
            aqp r5 = (p000.aqp) r5
            r15[r4] = r5
            goto L_0x03ff
        L_0x03fe:
            r11 = r1
        L_0x03ff:
            r8.mo2073c(r2)
            goto L_0x0404
        L_0x0403:
            r11 = r1
        L_0x0404:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 != r5) goto L_0x040d
            java.lang.String r5 = "audio/ac3"
            goto L_0x048e
        L_0x040d:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r5) goto L_0x0416
            java.lang.String r5 = "audio/eac3"
            goto L_0x048e
        L_0x0416:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r5) goto L_0x041f
            java.lang.String r5 = "audio/ac4"
            goto L_0x048e
        L_0x041f:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r5) goto L_0x0428
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x048e
        L_0x0428:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 != r5) goto L_0x042f
        L_0x042d:
            goto L_0x048c
        L_0x042f:
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r5) goto L_0x042d
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r5) goto L_0x043c
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x048e
        L_0x043c:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r5) goto L_0x0444
            java.lang.String r5 = "audio/3gpp"
            goto L_0x048e
        L_0x0444:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r5) goto L_0x044c
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x048e
        L_0x044c:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 != r5) goto L_0x0452
        L_0x0451:
            goto L_0x0489
        L_0x0452:
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r5) goto L_0x0451
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 != r5) goto L_0x045f
            java.lang.String r5 = "audio/mpeg"
            goto L_0x048e
        L_0x045f:
            r5 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r5) goto L_0x0467
            java.lang.String r5 = "audio/alac"
            goto L_0x048e
        L_0x0467:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r5) goto L_0x046f
            java.lang.String r5 = "audio/g711-alaw"
            goto L_0x048e
        L_0x046f:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r5) goto L_0x0477
            java.lang.String r5 = "audio/g711-mlaw"
            goto L_0x048e
        L_0x0477:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r5) goto L_0x047f
            java.lang.String r5 = "audio/opus"
            goto L_0x048e
        L_0x047f:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r5) goto L_0x0487
            java.lang.String r5 = "audio/flac"
            goto L_0x048e
        L_0x0487:
            r5 = 0
            goto L_0x048e
        L_0x0489:
            java.lang.String r5 = "audio/raw"
            goto L_0x048e
        L_0x048c:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L_0x048e:
            r15 = r26
            r7 = 0
        L_0x0491:
            int r0 = r2 - r13
            if (r0 >= r10) goto L_0x0614
            r8.mo2073c(r2)
            int r0 = r8.mo2083j()
            if (r0 <= 0) goto L_0x04a2
            r43 = r4
            r4 = 1
            goto L_0x04a6
        L_0x04a2:
            r43 = r4
            r4 = 0
        L_0x04a6:
            p000.bks.m3511a(r4, r6)
            int r4 = r8.mo2083j()
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r4 != r1) goto L_0x04b8
            r4 = r2
            r37 = r6
            r44 = r10
            goto L_0x04f1
        L_0x04b8:
            if (r50 == 0) goto L_0x0524
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            if (r4 != r1) goto L_0x0524
            int r1 = r8.f4259b
            r4 = r1
        L_0x04c2:
            int r1 = r4 - r2
            if (r1 < r0) goto L_0x04cc
            r37 = r6
            r44 = r10
            r4 = -1
            goto L_0x04f1
        L_0x04cc:
            r8.mo2073c(r4)
            int r1 = r8.mo2083j()
            if (r1 <= 0) goto L_0x04d9
            r44 = r10
            r10 = 1
            goto L_0x04dd
        L_0x04d9:
            r44 = r10
            r10 = 0
        L_0x04dd:
            p000.bks.m3511a(r10, r6)
            int r10 = r8.mo2083j()
            r37 = r6
            r6 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r6) goto L_0x04f1
            int r4 = r4 + r1
            r6 = r37
            r10 = r44
            goto L_0x04c2
        L_0x04f1:
            r1 = -1
            if (r4 != r1) goto L_0x04f5
        L_0x04f4:
            goto L_0x051e
        L_0x04f5:
            android.util.Pair r4 = m1785a(r8, r4)
            java.lang.Object r5 = r4.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.second
            r7 = r4
            byte[] r7 = (byte[]) r7
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x04f4
            android.util.Pair r4 = p000.bkg.m3480a(r7)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r12 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r15 = r4.intValue()
        L_0x051e:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x0524:
            r37 = r6
            r44 = r10
            r1 = -1
            r6 = 1684103987(0x64616333, float:1.6630662E22)
            if (r4 != r6) goto L_0x0544
            int r4 = r2 + 8
            r8.mo2073c(r4)
            java.lang.String r4 = java.lang.Integer.toString(r9)
            akh r4 = p000.aln.m1031a(r8, r4, r14, r11)
            r3.f1746b = r4
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x0544:
            r6 = 1684366131(0x64656333, float:1.692581E22)
            if (r4 != r6) goto L_0x055f
            int r4 = r2 + 8
            r8.mo2073c(r4)
            java.lang.String r4 = java.lang.Integer.toString(r9)
            akh r4 = p000.aln.m1035b(r8, r4, r14, r11)
            r3.f1746b = r4
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x055f:
            r6 = 1684103988(0x64616334, float:1.6630663E22)
            if (r4 != r6) goto L_0x057a
            int r4 = r2 + 8
            r8.mo2073c(r4)
            java.lang.String r4 = java.lang.Integer.toString(r9)
            akh r4 = p000.alp.m1038a(r8, r4, r14, r11)
            r3.f1746b = r4
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x057a:
            r6 = 1684305011(0x64647473, float:1.6856995E22)
            if (r4 != r6) goto L_0x059f
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = -1
            r29 = -1
            r32 = 0
            r27 = r5
            r30 = r15
            r31 = r12
            r33 = r11
            r34 = r14
            akh r4 = p000.akh.m731a(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.f1746b = r4
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x059f:
            r6 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r4 != r6) goto L_0x05c2
            int r4 = r0 + -8
            byte[] r6 = p000.aqb.f1773a
            int r7 = r6.length
            int r7 = r7 + r4
            byte[] r7 = new byte[r7]
            int r10 = r6.length
            r1 = 0
            java.lang.System.arraycopy(r6, r1, r7, r1, r10)
            int r1 = r2 + 8
            r8.mo2073c(r1)
            byte[] r1 = p000.aqb.f1773a
            int r1 = r1.length
            r8.mo2069a(r7, r1, r4)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x05c2:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r4 != r1) goto L_0x05f1
            int r1 = r0 + -12
            int r4 = r1 + 4
            byte[] r4 = new byte[r4]
            r6 = 102(0x66, float:1.43E-43)
            r7 = 0
            r4[r7] = r6
            r6 = 76
            r7 = 1
            r4[r7] = r6
            r6 = 97
            r7 = 2
            r4[r7] = r6
            r6 = 67
            r7 = 3
            r4[r7] = r6
            int r7 = r2 + 12
            r8.mo2073c(r7)
            r7 = 4
            r8.mo2069a(r4, r7, r1)
            r7 = r4
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 0
            goto L_0x0606
        L_0x05f1:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 != r1) goto L_0x0605
            int r4 = r0 + -12
            byte[] r7 = new byte[r4]
            int r10 = r2 + 12
            r8.mo2073c(r10)
            r10 = 0
            r8.mo2069a(r7, r10, r4)
            goto L_0x0606
        L_0x0605:
            r10 = 0
        L_0x0606:
            int r2 = r2 + r0
            r0 = r45
            r1 = r49
            r6 = r37
            r4 = r43
            r10 = r44
            goto L_0x0491
        L_0x0614:
            r43 = r4
            r44 = r10
            r10 = 0
            akh r0 = r3.f1746b
            if (r0 != 0) goto L_0x0656
            if (r5 == 0) goto L_0x0656
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x062a
            r32 = -1
            goto L_0x062d
        L_0x062a:
            r32 = 2
        L_0x062d:
            java.lang.String r26 = java.lang.Integer.toString(r9)
            if (r7 == 0) goto L_0x063a
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r33 = r0
            goto L_0x063c
        L_0x063a:
            r33 = 0
        L_0x063c:
            r28 = -1
            r29 = -1
            r35 = 0
            r27 = r5
            r30 = r15
            r31 = r12
            r34 = r11
            r36 = r14
            akh r0 = p000.akh.m730a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r3.f1746b = r0
            r2 = r44
            goto L_0x08d5
        L_0x0656:
            r2 = r44
            goto L_0x08d5
        L_0x065a:
            r41 = r2
            r43 = r4
            r42 = r5
            r37 = r6
            r44 = r10
            r40 = r11
            r10 = 0
        L_0x0667:
            int r0 = r13 + 16
            r8.mo2073c(r0)
            r0 = 16
            r8.mo2075d(r0)
            int r30 = r8.mo2076e()
            int r31 = r8.mo2076e()
            r1 = 50
            r8.mo2075d(r1)
            int r1 = r8.f4259b
            r2 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 != r2) goto L_0x06b8
            r2 = r44
            android.util.Pair r4 = m1786a(r8, r13, r2)
            if (r4 == 0) goto L_0x06af
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r7 = r5.intValue()
            r5 = r49
            if (r5 == 0) goto L_0x06a4
            java.lang.Object r11 = r4.second
            aqp r11 = (p000.aqp) r11
            java.lang.String r11 = r11.f1877b
            anq r11 = r5.mo1168a(r11)
            goto L_0x06a6
        L_0x06a4:
            r11 = 0
        L_0x06a6:
            aqp[] r12 = r3.f1745a
            java.lang.Object r4 = r4.second
            aqp r4 = (p000.aqp) r4
            r12[r43] = r4
            goto L_0x06b2
        L_0x06af:
            r5 = r49
            r11 = r5
        L_0x06b2:
            r8.mo2073c(r1)
            r38 = r11
            goto L_0x06be
        L_0x06b8:
            r5 = r49
            r2 = r44
            r38 = r5
        L_0x06be:
            r4 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r11 = 0
            r27 = 0
            r28 = 0
            r32 = 0
            r34 = 1065353216(0x3f800000, float:1.0)
            r36 = -1
        L_0x06cf:
            int r12 = r1 - r13
            if (r12 >= r2) goto L_0x08c0
            r8.mo2073c(r1)
            int r12 = r8.f4259b
            int r15 = r8.mo2083j()
            if (r15 != 0) goto L_0x06e3
            int r0 = r8.f4259b
            int r0 = r0 - r13
            if (r0 == r2) goto L_0x08c0
        L_0x06e3:
            if (r15 <= 0) goto L_0x06e7
            r0 = 1
            goto L_0x06e9
        L_0x06e7:
            r0 = 0
        L_0x06e9:
            r6 = r37
            p000.bks.m3511a(r0, r6)
            int r0 = r8.mo2083j()
            r10 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 == r10) goto L_0x088e
            r10 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 == r10) goto L_0x086c
            r10 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 != r10) goto L_0x0703
            goto L_0x0804
        L_0x0703:
            r10 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 == r10) goto L_0x0804
            r10 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 == r10) goto L_0x07ea
            r10 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 == r10) goto L_0x07d8
            r10 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 == r10) goto L_0x07c6
            r10 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r10) goto L_0x07a4
            r10 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r10) goto L_0x0738
            int r12 = r12 + 8
            r8.mo2073c(r12)
            int r0 = r8.mo2087n()
            float r0 = (float) r0
            int r10 = r8.mo2087n()
            float r10 = (float) r10
            float r34 = r0 / r10
            r37 = r6
            r11 = 1
            goto L_0x08b7
        L_0x0738:
            r10 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r10) goto L_0x0766
            int r0 = r12 + 8
        L_0x073f:
            int r4 = r0 - r12
            if (r4 >= r15) goto L_0x075f
            r8.mo2073c(r0)
            int r4 = r8.mo2083j()
            int r10 = r8.mo2083j()
            r5 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r10 != r5) goto L_0x075b
            byte[] r5 = r8.f4258a
            int r4 = r4 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r5, r0, r4)
            goto L_0x0760
        L_0x075b:
            int r0 = r0 + r4
            r5 = r49
            goto L_0x073f
        L_0x075f:
            r0 = 0
        L_0x0760:
            r4 = r0
            r37 = r6
            goto L_0x08b7
        L_0x0766:
            r5 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r5) goto L_0x07a0
            int r0 = r8.mo2074d()
            r5 = 3
            r8.mo2075d(r5)
            if (r0 != 0) goto L_0x07a0
            int r0 = r8.mo2074d()
            if (r0 == 0) goto L_0x0799
            r10 = 1
            if (r0 == r10) goto L_0x0792
            r10 = 2
            if (r0 == r10) goto L_0x078b
            if (r0 == r5) goto L_0x0784
            goto L_0x07a0
        L_0x0784:
            r37 = r6
            r36 = 3
            goto L_0x08b7
        L_0x078b:
            r37 = r6
            r36 = 2
            goto L_0x08b7
        L_0x0792:
            r37 = r6
            r36 = 1
            goto L_0x08b7
        L_0x0799:
            r37 = r6
            r36 = 0
            goto L_0x08b7
        L_0x07a0:
            r37 = r6
            goto L_0x08b7
        L_0x07a4:
            if (r27 != 0) goto L_0x07a8
            r5 = 1
            goto L_0x07aa
        L_0x07a8:
            r5 = 0
        L_0x07aa:
            p000.bks.m3512b(r5)
            android.util.Pair r5 = m1785a(r8, r12)
            java.lang.Object r10 = r5.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r5.second
            byte[] r5 = (byte[]) r5
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r32 = r5
            r37 = r6
            r27 = r10
            goto L_0x08b7
        L_0x07c6:
            if (r27 != 0) goto L_0x07ca
            r5 = 1
            goto L_0x07cc
        L_0x07ca:
            r5 = 0
        L_0x07cc:
            p000.bks.m3512b(r5)
            java.lang.String r5 = "video/3gpp"
            r27 = r5
            r37 = r6
            goto L_0x08b7
        L_0x07d8:
            if (r27 != 0) goto L_0x07dc
            r5 = 1
            goto L_0x07de
        L_0x07dc:
            r5 = 0
        L_0x07de:
            p000.bks.m3512b(r5)
            java.lang.String r5 = "video/av01"
            r27 = r5
            r37 = r6
            goto L_0x08b7
        L_0x07ea:
            if (r27 != 0) goto L_0x07ee
            r5 = 1
            goto L_0x07f0
        L_0x07ee:
            r5 = 0
        L_0x07f0:
            p000.bks.m3512b(r5)
            r5 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r5) goto L_0x07fb
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            goto L_0x07fd
        L_0x07fb:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
        L_0x07fd:
            r27 = r5
            r37 = r6
            goto L_0x08b7
        L_0x0804:
            r5 = 2
            r8.mo2075d(r5)
            int r5 = r8.mo2074d()
            int r10 = r5 >> 1
            r12 = 1
            r5 = r5 & r12
            r12 = 5
            int r5 = r5 << r12
            int r24 = r8.mo2074d()
            r0 = 3
            int r24 = r24 >> 3
            r24 = r24 & 31
            r5 = r5 | r24
            r0 = 4
            if (r10 != r0) goto L_0x0822
            goto L_0x0838
        L_0x0822:
            if (r10 == r12) goto L_0x0838
            r12 = 8
            if (r10 != r12) goto L_0x082c
            java.lang.String r12 = "hev1"
            goto L_0x083a
        L_0x082c:
            r12 = 9
            if (r10 != r12) goto L_0x0834
            java.lang.String r12 = "avc3"
            goto L_0x083a
        L_0x0834:
            r37 = r6
            r5 = 0
            goto L_0x0863
        L_0x0838:
            java.lang.String r12 = "dvhe"
        L_0x083a:
            int r25 = r12.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r37 = r6
            int r6 = r25 + 26
            r0.<init>(r6)
            r0.append(r12)
            java.lang.String r6 = ".0"
            r0.append(r6)
            r0.append(r10)
            java.lang.String r6 = ".0"
            r0.append(r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            blq r5 = new blq
            r5.<init>(r0)
        L_0x0863:
            if (r5 == 0) goto L_0x08b7
            java.lang.String r0 = r5.f4315a
            java.lang.String r27 = "video/dolby-vision"
            r28 = r0
            goto L_0x08b7
        L_0x086c:
            r37 = r6
            if (r27 != 0) goto L_0x0872
            r0 = 1
            goto L_0x0874
        L_0x0872:
            r0 = 0
        L_0x0874:
            p000.bks.m3512b(r0)
            int r12 = r12 + 8
            r8.mo2073c(r12)
            blt r0 = p000.blt.m3687a(r8)
            java.util.List r5 = r0.f4325a
            int r0 = r0.f4326b
            r3.f1747c = r0
            java.lang.String r0 = "video/hevc"
            r27 = r0
            r32 = r5
            goto L_0x08b7
        L_0x088e:
            r37 = r6
            if (r27 != 0) goto L_0x0894
            r0 = 1
            goto L_0x0896
        L_0x0894:
            r0 = 0
        L_0x0896:
            p000.bks.m3512b(r0)
            int r12 = r12 + 8
            r8.mo2073c(r12)
            bln r0 = p000.bln.m3683a(r8)
            java.util.List r5 = r0.f4305a
            int r6 = r0.f4306b
            r3.f1747c = r6
            if (r11 != 0) goto L_0x08af
            float r0 = r0.f4309e
            r34 = r0
            goto L_0x08b0
        L_0x08af:
        L_0x08b0:
            java.lang.String r0 = "video/avc"
            r27 = r0
            r32 = r5
        L_0x08b7:
            int r1 = r1 + r15
            r5 = r49
            r0 = 16
            r10 = 0
            goto L_0x06cf
        L_0x08c0:
            if (r27 != 0) goto L_0x08c3
            goto L_0x08d5
        L_0x08c3:
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r29 = -1
            r37 = 0
            r33 = r40
            r35 = r4
            akh r0 = p000.akh.m736a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r3.f1746b = r0
        L_0x08d5:
            int r13 = r13 + r2
            r8.mo2073c(r13)
            int r4 = r43 + 1
            r0 = r45
            r15 = r46
            r6 = r47
            r1 = r49
            r12 = r39
            r11 = r40
            r2 = r41
            r5 = r42
            r10 = 8
            r13 = 16
            goto L_0x01b7
        L_0x08f1:
            r41 = r2
            r42 = r5
            r47 = r6
            r39 = r12
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r45
            aps r0 = r1.mo1238b(r0)
            if (r0 == 0) goto L_0x0975
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            apt r0 = r0.mo1235a(r1)
            if (r0 != 0) goto L_0x090e
            goto L_0x0975
        L_0x090e:
            bky r0 = r0.f1734a
            r1 = 8
            r0.mo2073c(r1)
            int r1 = r0.mo2083j()
            int r1 = p000.apu.m1767c(r1)
            int r2 = r0.mo2087n()
            long[] r4 = new long[r2]
            long[] r5 = new long[r2]
            r6 = 0
        L_0x0926:
            if (r6 < r2) goto L_0x092d
            android.util.Pair r0 = android.util.Pair.create(r4, r5)
            goto L_0x097c
        L_0x092d:
            r7 = 1
            if (r1 != r7) goto L_0x0935
            long r8 = r0.mo2089p()
            goto L_0x0939
        L_0x0935:
            long r8 = r0.mo2081h()
        L_0x0939:
            r4[r6] = r8
            if (r1 == r7) goto L_0x0943
            int r7 = r0.mo2083j()
            long r7 = (long) r7
            goto L_0x0947
        L_0x0943:
            long r7 = r0.mo2085l()
        L_0x0947:
            r5[r6] = r7
            byte[] r7 = r0.f4258a
            int r8 = r0.f4259b
            int r9 = r8 + 1
            r0.f4259b = r9
            byte r8 = r7[r8]
            int r10 = r9 + 1
            r0.f4259b = r10
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r8 = r8 << r10
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            short r7 = (short) r7
            r8 = 1
            if (r7 != r8) goto L_0x096d
            r7 = 2
            r0.mo2075d(r7)
            int r6 = r6 + 1
            goto L_0x0926
        L_0x096d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0975:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
            r0 = r1
        L_0x097c:
            java.lang.Object r1 = r0.first
            r23 = r1
            long[] r23 = (long[]) r23
            java.lang.Object r0 = r0.second
            r24 = r0
            long[] r24 = (long[]) r24
            akh r0 = r3.f1746b
            if (r0 == 0) goto L_0x09b7
            aqo r0 = new aqo
            r1 = r42
            int r11 = r1.f1770a
            r1 = r41
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            akh r1 = r3.f1746b
            int r2 = r3.f1748d
            aqp[] r4 = r3.f1745a
            int r3 = r3.f1747c
            r10 = r0
            r12 = r39
            r15 = r47
            r17 = r21
            r19 = r1
            r20 = r2
            r21 = r4
            r22 = r3
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x09b7:
            r0 = 0
            return r0
        L_0x09b9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aqb.m1787a(aps, apt, long, anq, boolean):aqo");
    }

    /* renamed from: a */
    public static atw m1790a(apt apt, boolean z) {
        if (!z) {
            bky bky = apt.f1734a;
            bky.mo2073c(8);
            while (bky.mo2070b() >= 8) {
                int i = bky.f4259b;
                int j = bky.mo2083j();
                if (bky.mo2083j() != 1835365473) {
                    bky.mo2073c(i + j);
                } else {
                    bky.mo2073c(i);
                    int i2 = i + j;
                    bky.mo2075d(12);
                    while (true) {
                        int i3 = bky.f4259b;
                        if (i3 >= i2) {
                            break;
                        }
                        int j2 = bky.mo2083j();
                        if (bky.mo2083j() != 1768715124) {
                            bky.mo2073c(i3 + j2);
                        } else {
                            bky.mo2073c(i3);
                            int i4 = i3 + j2;
                            bky.mo2075d(8);
                            ArrayList arrayList = new ArrayList();
                            while (bky.f4259b < i4) {
                                atv a = aqj.m1810a(bky);
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                return new atw(arrayList);
                            }
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
