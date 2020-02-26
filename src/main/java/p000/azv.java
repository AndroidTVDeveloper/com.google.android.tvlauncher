package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azv */
/* compiled from: PG */
public final class azv implements azc {

    /* renamed from: a */
    private final biy f2925a;

    /* renamed from: b */
    private final int[] f2926b;

    /* renamed from: c */
    private final int f2927c;

    /* renamed from: d */
    private final bhv f2928d;

    /* renamed from: e */
    private final long f2929e;

    /* renamed from: f */
    private final azz f2930f;

    /* renamed from: g */
    private final azu[] f2931g;

    /* renamed from: h */
    private bgl f2932h;

    /* renamed from: i */
    private bac f2933i;

    /* renamed from: j */
    private int f2934j;

    /* renamed from: k */
    private IOException f2935k;

    /* renamed from: l */
    private boolean f2936l;

    /* renamed from: m */
    private long f2937m = -9223372036854775807L;

    public azv(biy biy, bac bac, int i, int[] iArr, bgl bgl, int i2, bhv bhv, long j, boolean z, List list, azz azz) {
        bgl bgl2 = bgl;
        this.f2925a = biy;
        this.f2933i = bac;
        this.f2926b = iArr;
        this.f2932h = bgl2;
        this.f2927c = i2;
        this.f2928d = bhv;
        this.f2934j = i;
        this.f2929e = j;
        this.f2930f = azz;
        long b = bac.mo1680b(i);
        ArrayList b2 = m2586b();
        this.f2931g = new azu[bgl.mo1835f()];
        for (int i3 = 0; i3 < this.f2931g.length; i3++) {
            this.f2931g[i3] = new azu(b, i2, (bam) b2.get(bgl2.mo1830b(i3)), z, list, azz);
        }
    }

    /* renamed from: a */
    public final long mo1636a(long j, alb alb) {
        long j2;
        azu[] azuArr = this.f2931g;
        int length = azuArr.length;
        int i = 0;
        while (i < length) {
            azu azu = azuArr[i];
            if (azu.f2922c == null) {
                i++;
            } else {
                long c = azu.mo1670c(j);
                long a = azu.mo1665a(c);
                if (a >= j || c >= ((long) (azu.mo1667b() - 1))) {
                    j2 = a;
                } else {
                    j2 = azu.mo1665a(c + 1);
                }
                return blm.m3633a(j, alb, a, j2);
            }
        }
        return j;
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1638a(long r43, long r45, java.util.List r47, p000.ayp r48) {
        /*
            r42 = this;
            r0 = r42
            r9 = r48
            java.io.IOException r1 = r0.f2935k
            if (r1 != 0) goto L_0x0301
            long r10 = r45 - r43
            bac r1 = r0.f2933i
            boolean r2 = r1.f2972c
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0021
            long r2 = r0.f2937m
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            long r2 = r2 - r43
            r14 = r2
            goto L_0x0022
        L_0x001f:
        L_0x0021:
            r14 = r12
        L_0x0022:
            long r1 = r1.f2970a
            long r1 = p000.aja.m633b(r1)
            bac r3 = r0.f2933i
            int r4 = r0.f2934j
            bah r3 = r3.mo1679a(r4)
            long r3 = r3.f2998b
            long r3 = p000.aja.m633b(r3)
            long r1 = r1 + r3
            long r1 = r1 + r45
            azz r3 = r0.f2930f
            if (r3 == 0) goto L_0x0086
            baa r3 = r3.f2949b
            bac r4 = r3.f2960f
            boolean r5 = r4.f2972c
            if (r5 != 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            boolean r5 = r3.f2962h
            if (r5 != 0) goto L_0x0085
            long r4 = r4.f2976g
            java.util.TreeMap r6 = r3.f2959e
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
            azy r4 = r3.f2956b
            azj r4 = (p000.azj) r4
            azq r4 = r4.f2879a
            long r5 = r4.f2906p
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0080
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0082
        L_0x0080:
            r4.f2906p = r1
        L_0x0082:
            r3.mo1676a()
        L_0x0085:
            return
        L_0x0086:
            long r1 = r0.f2929e
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 * r5
            goto L_0x00a0
        L_0x0097:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.f2929e
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
            ayx r1 = (p000.ayx) r1
            r17 = r1
            goto L_0x00bf
        L_0x00bb:
            r5 = r47
            r17 = r16
        L_0x00bf:
            bgl r1 = r0.f2932h
            int r6 = r1.mo1835f()
            ayz[] r3 = new p000.ayz[r6]
            r2 = 0
        L_0x00c8:
            if (r2 < r6) goto L_0x02a4
            bgl r1 = r0.f2932h
            r1.mo1710a(r10, r14)
            azu[] r1 = r0.f2931g
            bgl r2 = r0.f2932h
            int r2 = r2.mo1709a()
            r10 = r1[r2]
            ayo r1 = r10.f2920a
            if (r1 == 0) goto L_0x0146
            bam r2 = r10.f2921b
            akh[] r1 = r1.f2783c
            if (r1 != 0) goto L_0x00e6
            baj r1 = r2.f3017e
            goto L_0x00e9
        L_0x00e6:
            r1 = r16
        L_0x00e9:
            azr r3 = r10.f2922c
            if (r3 != 0) goto L_0x00f2
            baj r16 = r2.mo1691c()
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
            bhv r3 = r0.f2928d
            bgl r4 = r0.f2932h
            akh r21 = r4.mo1836g()
            bgl r4 = r0.f2932h
            int r22 = r4.mo1711b()
            bgl r4 = r0.f2932h
            java.lang.Object r23 = r4.mo1712c()
            bam r4 = r10.f2921b
            java.lang.String r4 = r4.f3014b
            if (r1 == 0) goto L_0x011e
            baj r2 = r1.mo1687a(r2, r4)
            if (r2 != 0) goto L_0x011e
            r2 = r1
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            bhy r1 = new bhy
            android.net.Uri r12 = r2.mo1686a(r4)
            long r13 = r2.f3006a
            long r4 = r2.f3007b
            bam r2 = r10.f2921b
            java.lang.String r17 = r2.mo1693e()
            r11 = r1
            r15 = r4
            r11.<init>(r12, r13, r15, r17)
            ayw r2 = new ayw
            ayo r4 = r10.f2920a
            r18 = r2
            r19 = r3
            r20 = r1
            r24 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r9.f2790a = r2
            return
        L_0x0146:
            long r14 = r10.f2923d
            r11 = 1
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x014f
            r6 = 1
            goto L_0x0151
        L_0x014f:
            r6 = 0
        L_0x0151:
            int r1 = r10.mo1667b()
            if (r1 == 0) goto L_0x02a0
            bac r1 = r0.f2933i
            int r2 = r0.f2934j
            long r18 = r10.mo1666a(r1, r2, r7)
            bac r1 = r0.f2933i
            int r2 = r0.f2934j
            long r7 = r10.mo1669b(r1, r2, r7)
            bac r1 = r0.f2933i
            boolean r1 = r1.f2972c
            if (r1 == 0) goto L_0x0172
            long r1 = r10.mo1668b(r7)
            goto L_0x0174
        L_0x0172:
            r1 = r12
        L_0x0174:
            r0.f2937m = r1
            r1 = r10
            r2 = r17
            r3 = r45
            r12 = r6
            r5 = r18
            r16 = r7
            long r1 = m2585a(r1, r2, r3, r5, r7)
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x0190
            awd r1 = new awd
            r1.<init>()
            r0.f2935k = r1
            return
        L_0x0190:
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 > 0) goto L_0x029d
            boolean r3 = r0.f2936l
            if (r3 == 0) goto L_0x019c
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x029d
        L_0x019c:
            if (r12 != 0) goto L_0x019f
            goto L_0x01aa
        L_0x019f:
            long r3 = r10.mo1665a(r1)
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x01aa
            r9.f2791b = r11
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
            long r7 = r10.mo1665a(r7)
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
            bhv r3 = r0.f2928d
            int r7 = r0.f2927c
            bgl r8 = r0.f2932h
            akh r8 = r8.mo1836g()
            bgl r12 = r0.f2932h
            int r26 = r12.mo1711b()
            bgl r12 = r0.f2932h
            java.lang.Object r27 = r12.mo1712c()
            bam r12 = r10.f2921b
            long r28 = r10.mo1665a(r1)
            baj r13 = r10.mo1671d(r1)
            java.lang.String r14 = r12.f3014b
            ayo r15 = r10.f2920a
            if (r15 != 0) goto L_0x0234
            long r30 = r10.mo1668b(r1)
            bhy r4 = new bhy
            android.net.Uri r16 = r13.mo1686a(r14)
            long r5 = r13.f3006a
            long r10 = r13.f3007b
            java.lang.String r21 = r12.mo1693e()
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
            baj r5 = r10.mo1671d(r5)
            baj r5 = r13.mo1687a(r5, r14)
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
            long r30 = r10.mo1668b(r4)
            long r4 = r10.f2923d
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
            android.net.Uri r16 = r13.mo1686a(r14)
            long r4 = r13.f3006a
            long r13 = r13.f3007b
            java.lang.String r21 = r12.mo1693e()
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r19, r21)
            long r4 = r12.f3015c
            ayu r6 = new ayu
            r22 = r6
            long r4 = -r4
            r39 = r4
            ayo r4 = r10.f2920a
            r41 = r4
            r23 = r3
            r25 = r8
            r36 = r1
            r38 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r39, r41)
            r5 = r6
        L_0x029a:
            r9.f2790a = r5
            return
        L_0x029d:
            r9.f2791b = r12
            return
        L_0x02a0:
            r12 = r6
            r9.f2791b = r12
            return
        L_0x02a4:
            r18 = r12
            azu[] r1 = r0.f2931g
            r1 = r1[r2]
            azr r5 = r1.f2922c
            if (r5 != 0) goto L_0x02bc
            ayz r1 = p000.ayz.f2833a
            r3[r2] = r1
            r22 = r2
            r23 = r3
            r24 = r6
            r25 = r7
            r0 = 0
            goto L_0x02f1
        L_0x02bc:
            bac r5 = r0.f2933i
            int r12 = r0.f2934j
            long r12 = r1.mo1666a(r5, r12, r7)
            bac r5 = r0.f2933i
            int r4 = r0.f2934j
            long r20 = r1.mo1669b(r5, r4, r7)
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
            long r1 = m2585a(r1, r2, r3, r5, r7)
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ea
            ayz r1 = p000.ayz.f2833a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.azv.mo1638a(long, long, java.util.List, ayp):void");
    }

    /* renamed from: a */
    public final int mo1635a(long j, List list) {
        if (this.f2935k != null || this.f2932h.mo1835f() < 2) {
            return list.size();
        }
        return this.f2932h.mo1823a(j, list);
    }

    /* renamed from: b */
    private final ArrayList m2586b() {
        List list = this.f2933i.mo1679a(this.f2934j).f2999c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f2926b) {
            arrayList.addAll(((bab) list.get(i)).f2967c);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final long m2585a(azu azu, ayx ayx, long j, long j2, long j3) {
        if (ayx == null) {
            return blm.m3632a(azu.mo1670c(j), j2, j3);
        }
        return ayx.mo1641d();
    }

    /* renamed from: a */
    public final void mo1637a() {
        IOException iOException = this.f2935k;
        if (iOException == null) {
            this.f2925a.mo1649a();
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public final void mo1639a(ayl ayl) {
        aos aos;
        if (ayl instanceof ayw) {
            int a = this.f2932h.mo1827a(((ayw) ayl).f2769g);
            azu[] azuArr = this.f2931g;
            azu azu = azuArr[a];
            if (azu.f2922c == null && (aos = azu.f2920a.f2782b) != null) {
                azuArr[a] = new azu(azu.f2923d, azu.f2921b, azu.f2920a, azu.f2924e, new azs((aod) aos, azu.f2921b.f3015c));
            }
        }
        azz azz = this.f2930f;
        if (azz != null) {
            baa baa = azz.f2949b;
            long j = baa.f2961g;
            if (j != -9223372036854775807L || ayl.f2773k > j) {
                baa.f2961g = ayl.f2773k;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1640a(ayl ayl, boolean z, Exception exc, long j) {
        azu azu;
        int b;
        if (!z) {
            return false;
        }
        azz azz = this.f2930f;
        if (azz != null) {
            baa baa = azz.f2949b;
            if (baa.f2960f.f2972c) {
                if (!baa.f2962h) {
                    long j2 = baa.f2961g;
                    if (j2 != -9223372036854775807L && j2 < ayl.f2772j) {
                        baa.mo1676a();
                    }
                }
                return true;
            }
        }
        if (!this.f2933i.f2972c && (ayl instanceof ayx) && (exc instanceof bim) && ((bim) exc).f4076a == 404 && (b = (azu = this.f2931g[this.f2932h.mo1827a(ayl.f2769g)]).mo1667b()) != -1 && b != 0) {
            if (((ayx) ayl).mo1641d() > (azu.mo1664a() + ((long) b)) - 1) {
                this.f2936l = true;
                return true;
            }
        }
        if (j != -9223372036854775807L) {
            bgl bgl = this.f2932h;
            if (bgl.mo1829a(bgl.mo1827a(ayl.f2769g), j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1644a(bac bac, int i) {
        ArrayList arrayList;
        azu[] azuArr;
        int i2;
        azu azu;
        long j;
        azv azv = this;
        try {
            azv.f2933i = bac;
            azv.f2934j = i;
            long b = bac.mo1680b(i);
            ArrayList b2 = m2586b();
            int i3 = 0;
            while (i3 < azv.f2931g.length) {
                bam bam = (bam) b2.get(azv.f2932h.mo1830b(i3));
                azu[] azuArr2 = azv.f2931g;
                azu azu2 = azuArr2[i3];
                azr d = azu2.f2921b.mo1692d();
                azr d2 = bam.mo1692d();
                if (d == null) {
                    azu = new azu(b, bam, azu2.f2920a, azu2.f2924e, null);
                    arrayList = b2;
                    i2 = i3;
                    azuArr = azuArr2;
                } else if (!d.mo1662b()) {
                    azu = new azu(b, bam, azu2.f2920a, azu2.f2924e, d2);
                    arrayList = b2;
                    i2 = i3;
                    azuArr = azuArr2;
                } else {
                    int c = d.mo1663c(b);
                    if (c == 0) {
                        azu = new azu(b, bam, azu2.f2920a, azu2.f2924e, d2);
                        arrayList = b2;
                        i2 = i3;
                        azuArr = azuArr2;
                    } else {
                        long a = d.mo1657a();
                        long a2 = d.mo1658a(a);
                        arrayList = b2;
                        long j2 = (((long) c) + a) - 1;
                        long a3 = d.mo1658a(j2) + d.mo1660b(j2, b);
                        i2 = i3;
                        azuArr = azuArr2;
                        long a4 = d2.mo1657a();
                        bam bam2 = bam;
                        long a5 = d2.mo1658a(a4);
                        long j3 = a;
                        long j4 = azu2.f2924e;
                        if (a3 == a5) {
                            j = j4 + ((j2 + 1) - a4);
                        } else if (a3 < a5) {
                            throw new awd();
                        } else if (a5 >= a2) {
                            j = j4 + (d.mo1659a(a5, b) - a4);
                        } else {
                            j = j4 - (d2.mo1659a(a2, b) - j3);
                        }
                        azu = new azu(b, bam2, azu2.f2920a, j, d2);
                    }
                }
                azuArr[i2] = azu;
                i3 = i2 + 1;
                azv = this;
                b2 = arrayList;
            }
        } catch (awd e) {
            this.f2935k = e;
        }
    }

    /* renamed from: a */
    public final void mo1645a(bgl bgl) {
        this.f2932h = bgl;
    }
}
