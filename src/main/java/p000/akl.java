package p000;

import android.util.Log;

/* renamed from: akl */
/* compiled from: PG */
final class akl {

    /* renamed from: a */
    public final aws f577a;

    /* renamed from: b */
    public final Object f578b;

    /* renamed from: c */
    public final axx[] f579c;

    /* renamed from: d */
    public boolean f580d;

    /* renamed from: e */
    public boolean f581e;

    /* renamed from: f */
    public akm f582f;

    /* renamed from: g */
    public akl f583g;

    /* renamed from: h */
    public aye f584h = aye.f2750a;

    /* renamed from: i */
    public bgr f585i;

    /* renamed from: j */
    public long f586j;

    /* renamed from: k */
    private final boolean[] f587k;

    /* renamed from: l */
    private final aky[] f588l;

    /* renamed from: m */
    private final bgq f589m;

    /* renamed from: n */
    private final awv f590n;

    public akl(aky[] akyArr, long j, bgq bgq, bhk bhk, awv awv, akm akm, bgr bgr) {
        this.f588l = akyArr;
        this.f586j = j;
        this.f589m = bgq;
        this.f590n = awv;
        this.f578b = akm.f591a.f2566a;
        this.f582f = akm;
        this.f585i = bgr;
        int length = akyArr.length;
        this.f579c = new axx[length];
        this.f587k = new boolean[length];
        awt awt = akm.f591a;
        long j2 = akm.f592b;
        long j3 = akm.f594d;
        aws a = awv.mo1496a(awt, bhk, j2);
        if (!(j3 == -9223372036854775807L || j3 == Long.MIN_VALUE)) {
            a = new awf(a, j3);
        }
        this.f577a = a;
    }

    /* renamed from: a */
    public final long mo435a(long j) {
        return j + this.f586j;
    }

    /* renamed from: b */
    public final long mo440b(long j) {
        return j - this.f586j;
    }

    /* renamed from: f */
    public final boolean mo445f() {
        return this.f583g == null;
    }

    /* renamed from: a */
    public final long mo436a(bgr bgr, long j) {
        return mo437a(bgr, j, false, new boolean[this.f588l.length]);
    }

    /* renamed from: a */
    public final long mo437a(bgr bgr, long j, boolean z, boolean[] zArr) {
        bgr bgr2 = bgr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= bgr2.f3833a) {
                break;
            }
            boolean[] zArr2 = this.f587k;
            if (z || !bgr2.mo1868a(this.f585i, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        axx[] axxArr = this.f579c;
        int i2 = 0;
        while (true) {
            aky[] akyArr = this.f588l;
            if (i2 >= akyArr.length) {
                break;
            }
            if (akyArr[i2].mo344a() == 6) {
                axxArr[i2] = null;
            }
            i2++;
        }
        this.f585i = bgr2;
        m755g();
        bgm bgm = bgr2.f3835c;
        long a = this.f577a.mo1481a(bgm.mo1862a(), this.f587k, this.f579c, zArr, j);
        axx[] axxArr2 = this.f579c;
        int i3 = 0;
        while (true) {
            aky[] akyArr2 = this.f588l;
            if (i3 >= akyArr2.length) {
                break;
            }
            if (akyArr2[i3].mo344a() == 6 && this.f585i.mo1867a(i3)) {
                axxArr2[i3] = new awn();
            }
            i3++;
        }
        this.f581e = false;
        int i4 = 0;
        while (true) {
            axx[] axxArr3 = this.f579c;
            if (i4 >= axxArr3.length) {
                return a;
            }
            if (axxArr3[i4] != null) {
                bks.m3512b(bgr2.mo1867a(i4));
                if (this.f588l[i4].mo344a() != 6) {
                    this.f581e = true;
                }
            } else {
                bks.m3512b(bgm.mo1861a(i4) == null);
            }
            i4++;
        }
    }

    /* renamed from: g */
    private final void m755g() {
        if (mo445f()) {
            int i = 0;
            while (true) {
                bgr bgr = this.f585i;
                if (i < bgr.f3833a) {
                    boolean a = bgr.mo1867a(i);
                    bgl a2 = this.f585i.f3835c.mo1861a(i);
                    if (a && a2 != null) {
                        a2.mo1825d();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final long mo442c() {
        if (!this.f580d) {
            return this.f582f.f592b;
        }
        long d = this.f581e ? this.f577a.mo1488d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.f582f.f595e : d;
    }

    /* renamed from: d */
    public final long mo443d() {
        if (this.f580d) {
            return this.f577a.mo1490e();
        }
        return 0;
    }

    /* renamed from: a */
    public final long mo434a() {
        return this.f582f.f592b + this.f586j;
    }

    /* renamed from: b */
    public final boolean mo441b() {
        if (this.f580d) {
            return !this.f581e || this.f577a.mo1488d() == Long.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo444e() {
        long j = this.f582f.f594d;
        awv awv = this.f590n;
        aws aws = this.f577a;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            awv.mo1497a(aws);
            return;
        }
        try {
            awv.mo1497a(((awf) aws).f2545a);
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: bge} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0908 A[LOOP:37: B:359:0x0800->B:400:0x0908, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x09c4  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x09c6  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x09d3  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x09d7  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0a03  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0902 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bgr mo438a(float r43) {
        /*
            r42 = this;
            r0 = r42
            bgq r1 = r0.f589m
            aky[] r2 = r0.f588l
            aye r3 = r0.f584h
            int r4 = r2.length
            r5 = 1
            int r4 = r4 + r5
            int[] r6 = new int[r4]
            ayc[][] r7 = new p000.ayc[r4][]
            int[][][] r8 = new int[r4][][]
            r10 = 0
        L_0x0012:
            if (r10 >= r4) goto L_0x0021
            int r11 = r3.f2751b
            ayc[] r12 = new p000.ayc[r11]
            r7[r10] = r12
            int[][] r11 = new int[r11][]
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0012
        L_0x0021:
            int r4 = r2.length
            int[] r10 = new int[r4]
            r11 = 0
        L_0x0025:
            if (r11 >= r4) goto L_0x0032
            r12 = r2[r11]
            int r12 = r12.mo367o()
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0025
        L_0x0032:
            r4 = 0
        L_0x0033:
            int r11 = r3.f2751b
            if (r4 >= r11) goto L_0x009c
            ayc r11 = r3.mo1612a(r4)
            int r12 = r2.length
            r14 = r12
            r12 = 0
            r13 = 0
        L_0x003f:
            int r15 = r2.length
            if (r12 >= r15) goto L_0x006c
            r15 = r2[r12]
            r16 = r14
            r14 = r13
            r13 = 0
        L_0x0049:
            int r9 = r11.f2747a
            if (r13 < r9) goto L_0x0054
            int r12 = r12 + 1
            r13 = r14
            r14 = r16
            goto L_0x003f
        L_0x0054:
            akh r9 = r11.mo1604a(r13)
            int r9 = r15.mo487a(r9)
            r9 = r9 & 7
            if (r9 > r14) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r14 = 4
            if (r9 == r14) goto L_0x006b
            r14 = r9
            r16 = r12
        L_0x0067:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x006b:
            r14 = r12
        L_0x006c:
            int r9 = r2.length
            if (r14 == r9) goto L_0x0088
            r9 = r2[r14]
            int r12 = r11.f2747a
            int[] r12 = new int[r12]
            r13 = 0
        L_0x0076:
            int r15 = r11.f2747a
            if (r13 >= r15) goto L_0x0087
            akh r15 = r11.mo1604a(r13)
            int r15 = r9.mo487a(r15)
            r12[r13] = r15
            int r13 = r13 + 1
            goto L_0x0076
        L_0x0087:
            goto L_0x008c
        L_0x0088:
            int r9 = r11.f2747a
            int[] r12 = new int[r9]
        L_0x008c:
            r9 = r6[r14]
            r13 = r7[r14]
            r13[r9] = r11
            r11 = r8[r14]
            r11[r9] = r12
            int r9 = r9 + r5
            r6[r14] = r9
            int r4 = r4 + 1
            goto L_0x0033
        L_0x009c:
            int r3 = r2.length
            aye[] r4 = new p000.aye[r3]
            int[] r3 = new int[r3]
            r9 = 0
        L_0x00a2:
            int r11 = r2.length
            if (r9 >= r11) goto L_0x00cb
            r11 = r6[r9]
            aye r12 = new aye
            r13 = r7[r9]
            java.lang.Object[] r13 = p000.blm.m3657a(r13, r11)
            ayc[] r13 = (p000.ayc[]) r13
            r12.<init>(r13)
            r4[r9] = r12
            r12 = r8[r9]
            java.lang.Object[] r11 = p000.blm.m3657a(r12, r11)
            int[][] r11 = (int[][]) r11
            r8[r9] = r11
            r11 = r2[r9]
            int r11 = r11.mo344a()
            r3[r9] = r11
            int r9 = r9 + 1
            goto L_0x00a2
        L_0x00cb:
            r2 = r6[r11]
            aye r6 = new aye
            r7 = r7[r11]
            java.lang.Object[] r2 = p000.blm.m3657a(r7, r2)
            ayc[] r2 = (p000.ayc[]) r2
            r6.<init>(r2)
            bgi r2 = new bgi
            r2.<init>(r3, r4)
            r3 = r1
            bgg r3 = (p000.bgg) r3
            java.util.concurrent.atomic.AtomicReference r4 = r3.f3799c
            java.lang.Object r4 = r4.get()
            bgc r4 = (p000.bgc) r4
            int r6 = r2.f3802a
            bgj[] r7 = new p000.bgj[r6]
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x00f1:
            r13 = 2
            if (r9 < r6) goto L_0x07ae
            r9 = 0
            r10 = 0
            r11 = -1
            r18 = 0
        L_0x00f9:
            if (r9 < r6) goto L_0x05cf
            r9 = 0
            r11 = -1
            r12 = 0
        L_0x00fe:
            r15 = 3
            if (r9 >= r6) goto L_0x0248
            int r14 = r2.mo1859a(r9)
            if (r14 == r5) goto L_0x023a
            if (r14 == r13) goto L_0x023a
            if (r14 == r15) goto L_0x0192
            aye r14 = r2.mo1860b(r9)
            r15 = r8[r9]
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0118:
            int r5 = r14.f2751b
            if (r13 >= r5) goto L_0x017a
            ayc r5 = r14.mo1612a(r13)
            r22 = r15[r13]
            r0 = 0
            r41 = r20
            r20 = r14
            r14 = r41
        L_0x0129:
            r23 = r15
            int r15 = r5.f2747a
            if (r0 < r15) goto L_0x013e
            int r13 = r13 + 1
            r0 = r42
            r15 = r23
            r5 = 1
            r41 = r20
            r20 = r14
            r14 = r41
            goto L_0x0118
        L_0x013e:
            r15 = r22[r0]
            r24 = r13
            boolean r13 = r4.f3782t
            boolean r13 = p000.bgg.m3127a(r15, r13)
            if (r13 == 0) goto L_0x016e
            akh r13 = r5.mo1604a(r0)
            int r13 = r13.f550c
            r15 = 1
            r13 = r13 & r15
            if (r13 != 0) goto L_0x0156
            r13 = 1
            goto L_0x0158
        L_0x0156:
            r13 = 2
        L_0x0158:
            r15 = r22[r0]
            r25 = r5
            r5 = 0
            boolean r15 = p000.bgg.m3127a(r15, r5)
            if (r15 == 0) goto L_0x0165
            int r13 = r13 + 1000
        L_0x0165:
            if (r13 > r14) goto L_0x0168
            goto L_0x0170
        L_0x0168:
            r18 = r0
            r14 = r13
            r19 = r25
            goto L_0x0170
        L_0x016e:
            r25 = r5
        L_0x0170:
            int r0 = r0 + 1
            r15 = r23
            r13 = r24
            r5 = r25
            goto L_0x0129
        L_0x017a:
            r0 = r19
            if (r0 == 0) goto L_0x018a
            bgj r15 = new bgj
            r5 = 1
            int[] r13 = new int[r5]
            r5 = 0
            r13[r5] = r18
            r15.<init>(r0, r13)
            goto L_0x018c
        L_0x018a:
            r15 = 0
        L_0x018c:
            r7[r9] = r15
            r19 = r8
            goto L_0x023d
        L_0x0192:
            aye r0 = r2.mo1860b(r9)
            r5 = r8[r9]
            r13 = 0
            r14 = 0
            r15 = -1
            r18 = 0
        L_0x019d:
            r19 = r8
            int r8 = r0.f2751b
            if (r13 >= r8) goto L_0x01fe
            ayc r8 = r0.mo1612a(r13)
            r20 = r5[r13]
            r22 = r0
            r0 = r18
            r18 = r14
            r14 = 0
        L_0x01b0:
            r23 = r5
            int r5 = r8.f2747a
            if (r14 < r5) goto L_0x01c4
            int r13 = r13 + 1
            r14 = r18
            r8 = r19
            r5 = r23
            r18 = r0
            r0 = r22
            goto L_0x019d
        L_0x01c4:
            r5 = r20[r14]
            r24 = r13
            boolean r13 = r4.f3782t
            boolean r5 = p000.bgg.m3127a(r5, r13)
            if (r5 == 0) goto L_0x01f1
            akh r5 = r8.mo1604a(r14)
            bgf r13 = new bgf
            r25 = r8
            r8 = r20[r14]
            r13.<init>(r5, r4, r8, r10)
            boolean r5 = r13.f3789a
            if (r5 != 0) goto L_0x01e2
            goto L_0x01f3
        L_0x01e2:
            if (r0 != 0) goto L_0x01e5
        L_0x01e4:
            goto L_0x01ec
        L_0x01e5:
            int r5 = r13.compareTo(r0)
            if (r5 <= 0) goto L_0x01f3
            goto L_0x01e4
        L_0x01ec:
            r0 = r13
            r15 = r14
            r18 = r25
            goto L_0x01f4
        L_0x01f1:
            r25 = r8
        L_0x01f3:
        L_0x01f4:
            int r14 = r14 + 1
            r5 = r23
            r13 = r24
            r8 = r25
            goto L_0x01b0
        L_0x01fe:
            if (r14 == 0) goto L_0x0216
            bgj r0 = new bgj
            r5 = 1
            int[] r8 = new int[r5]
            r5 = 0
            r8[r5] = r15
            r0.<init>(r14, r8)
            java.lang.Object r5 = p000.bks.m3507a(r18)
            bgf r5 = (p000.bgf) r5
            android.util.Pair r15 = android.util.Pair.create(r0, r5)
            goto L_0x0218
        L_0x0216:
            r15 = 0
        L_0x0218:
            if (r15 == 0) goto L_0x023c
            if (r12 == 0) goto L_0x0226
            java.lang.Object r0 = r15.second
            bgf r0 = (p000.bgf) r0
            int r0 = r0.compareTo(r12)
            if (r0 <= 0) goto L_0x023c
        L_0x0226:
            r0 = -1
            if (r11 == r0) goto L_0x022c
            r0 = 0
            r7[r11] = r0
        L_0x022c:
            java.lang.Object r0 = r15.first
            bgj r0 = (p000.bgj) r0
            r7[r9] = r0
            java.lang.Object r0 = r15.second
            bgf r0 = (p000.bgf) r0
            r12 = r0
            r11 = r9
            goto L_0x023d
        L_0x023a:
            r19 = r8
        L_0x023c:
        L_0x023d:
            int r9 = r9 + 1
            r0 = r42
            r8 = r19
            r5 = 1
            r13 = 2
            goto L_0x00fe
        L_0x0248:
            r19 = r8
            r0 = 0
        L_0x024b:
            if (r0 < r6) goto L_0x056c
            bgk r0 = r3.f3798b
            bhn r1 = r1.f3832d
            java.lang.Object r1 = p000.bks.m3507a(r1)
            bhn r1 = (p000.bhn) r1
            r5 = r0
            bfv r5 = (p000.bfv) r5
            bhn r0 = r5.f3725a
            if (r0 != 0) goto L_0x0260
            r8 = r1
            goto L_0x0261
        L_0x0260:
            r8 = r0
        L_0x0261:
            bgl[] r9 = new p000.bgl[r6]
            r0 = 0
            r1 = 0
        L_0x0265:
            if (r0 < r6) goto L_0x0521
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
        L_0x026d:
            if (r3 >= r6) goto L_0x02ef
            r10 = r7[r3]
            if (r10 == 0) goto L_0x02d0
            int[] r11 = r10.f3806b
            int r12 = r11.length
            r13 = 1
            if (r12 <= r13) goto L_0x02c1
            ayc r10 = r10.f3805a
            bfw r12 = new bfw
            bfu r13 = new bfu
            float r14 = r5.f3729e
            r20 = r6
            r35 = r7
            long r6 = (long) r1
            r13.<init>(r8, r14, r6)
            int r6 = r5.f3726b
            long r6 = (long) r6
            int r14 = r5.f3727c
            r18 = r1
            r36 = r2
            long r1 = (long) r14
            int r14 = r5.f3728d
            long r14 = (long) r14
            r38 = r8
            float r8 = r5.f3730f
            r40 = r3
            r39 = r4
            long r3 = r5.f3731g
            r22 = r12
            r23 = r10
            r24 = r11
            r25 = r13
            r26 = r6
            r28 = r1
            r30 = r14
            r32 = r8
            r33 = r3
            r22.<init>(r23, r24, r25, r26, r28, r30, r32, r33)
            r0.add(r12)
            r9[r40] = r12
            goto L_0x02de
        L_0x02c1:
            r18 = r1
            r36 = r2
            r40 = r3
            r39 = r4
            r20 = r6
            r35 = r7
            r38 = r8
            goto L_0x02de
        L_0x02d0:
            r18 = r1
            r36 = r2
            r40 = r3
            r39 = r4
            r20 = r6
            r35 = r7
            r38 = r8
        L_0x02de:
            int r3 = r40 + 1
            r1 = r18
            r6 = r20
            r7 = r35
            r2 = r36
            r8 = r38
            r4 = r39
            r15 = 3
            goto L_0x026d
        L_0x02ef:
            r36 = r2
            r39 = r4
            r20 = r6
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0454
            int r1 = r0.size()
            long[][] r2 = new long[r1][]
            r3 = 0
        L_0x0303:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x0336
            java.lang.Object r4 = r0.get(r3)
            bfw r4 = (p000.bfw) r4
            int r5 = r4.mo1835f()
            long[] r5 = new long[r5]
            r2[r3] = r5
            r5 = 0
        L_0x0318:
            int r6 = r4.mo1835f()
            if (r5 >= r6) goto L_0x0333
            r6 = r2[r3]
            int r7 = r4.mo1835f()
            int r7 = r7 - r5
            r8 = -1
            int r7 = r7 + r8
            akh r7 = r4.mo1828a(r7)
            int r7 = r7.f552e
            long r7 = (long) r7
            r6[r5] = r7
            int r5 = r5 + 1
            goto L_0x0318
        L_0x0333:
            int r3 = r3 + 1
            goto L_0x0303
        L_0x0336:
            double[][] r3 = new double[r1][]
            r4 = 0
        L_0x033a:
            r5 = 0
            if (r4 < r1) goto L_0x0428
            double[][] r7 = new double[r1][]
            r4 = 0
        L_0x0342:
            if (r4 >= r1) goto L_0x0381
            r8 = r3[r4]
            int r10 = r8.length
            r11 = -1
            int r10 = r10 + r11
            double[] r11 = new double[r10]
            r7[r4] = r11
            if (r10 == 0) goto L_0x037e
            r10 = r8[r10]
            r12 = 0
            r13 = r8[r12]
            double r10 = r10 - r13
            r8 = 0
        L_0x0356:
            r12 = r3[r4]
            int r13 = r12.length
            r14 = -1
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x037e
            int r13 = r8 + 1
            r14 = r12[r8]
            r22 = r12[r13]
            double r14 = r14 + r22
            r22 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r22
            r18 = r7[r4]
            int r22 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r22 == 0) goto L_0x0377
            r17 = 0
            r22 = r12[r17]
            double r14 = r14 - r22
            double r14 = r14 / r10
            goto L_0x0379
        L_0x0377:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0379:
            r18[r8] = r14
            r8 = r13
            goto L_0x0356
        L_0x037e:
            int r4 = r4 + 1
            goto L_0x0342
        L_0x0381:
            r4 = 0
            r5 = 0
        L_0x0383:
            if (r4 < r1) goto L_0x041b
            r8 = 3
            int r15 = r5 + 3
            int[] r4 = new int[r8]
            r5 = 2
            r4[r5] = r5
            r5 = 1
            r4[r5] = r15
            r6 = 0
            r4[r6] = r1
            java.lang.Class<long> r6 = long.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r6, r4)
            r6 = r4
            long[][][] r6 = (long[][][]) r6
            int[] r10 = new int[r1]
            p000.bfw.m3078a(r6, r5, r2, r10)
            r4 = 2
        L_0x03a2:
            int r5 = r15 + -1
            if (r4 < r5) goto L_0x03e4
            int r1 = r6.length
            r2 = 0
        L_0x03a8:
            if (r2 >= r1) goto L_0x03c1
            r3 = r6[r2]
            r4 = r3[r5]
            int r7 = r15 + -2
            r3 = r3[r7]
            r7 = 0
            r10 = r3[r7]
            long r10 = r10 + r10
            r4[r7] = r10
            r7 = 1
            r10 = r3[r7]
            long r10 = r10 + r10
            r4[r7] = r10
            int r2 = r2 + 1
            goto L_0x03a8
        L_0x03c1:
            r1 = 0
        L_0x03c2:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0454
            java.lang.Object r2 = r0.get(r1)
            bfw r2 = (p000.bfw) r2
            r3 = r6[r1]
            bft r2 = r2.f3732a
            int r4 = r3.length
            r5 = 2
            if (r4 < r5) goto L_0x03d8
            r4 = 1
            goto L_0x03da
        L_0x03d8:
            r4 = 0
        L_0x03da:
            p000.bks.m3510a(r4)
            bfu r2 = (p000.bfu) r2
            r2.f3724d = r3
            int r1 = r1 + 1
            goto L_0x03c2
        L_0x03e4:
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r5 = 0
            r8 = 0
        L_0x03ec:
            if (r5 >= r1) goto L_0x040b
            r13 = r10[r5]
            int r14 = r13 + 1
            r22 = r0
            r0 = r3[r5]
            int r0 = r0.length
            if (r14 == r0) goto L_0x0404
            r0 = r7[r5]
            r13 = r0[r13]
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0404
            r8 = r5
            r11 = r13
            goto L_0x0405
        L_0x0404:
        L_0x0405:
            int r5 = r5 + 1
            r0 = r22
            goto L_0x03ec
        L_0x040b:
            r22 = r0
            r0 = r10[r8]
            r5 = 1
            int r0 = r0 + r5
            r10[r8] = r0
            p000.bfw.m3078a(r6, r4, r2, r10)
            int r4 = r4 + 1
            r0 = r22
            goto L_0x03a2
        L_0x041b:
            r22 = r0
            r8 = 3
            r0 = r7[r4]
            int r0 = r0.length
            int r5 = r5 + r0
            int r4 = r4 + 1
            r0 = r22
            goto L_0x0383
        L_0x0428:
            r22 = r0
            r8 = 3
            r0 = r2[r4]
            int r0 = r0.length
            double[] r0 = new double[r0]
            r3[r4] = r0
            r0 = 0
        L_0x0433:
            r7 = r2[r4]
            int r10 = r7.length
            if (r0 >= r10) goto L_0x044e
            r10 = r3[r4]
            r11 = r7[r0]
            r13 = -1
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0448
            double r11 = (double) r11
            double r11 = java.lang.Math.log(r11)
            goto L_0x0449
        L_0x0448:
            r11 = r5
        L_0x0449:
            r10[r0] = r11
            int r0 = r0 + 1
            goto L_0x0433
        L_0x044e:
            int r4 = r4 + 1
            r0 = r22
            goto L_0x033a
        L_0x0454:
            r2 = r20
            akz[] r0 = new p000.akz[r2]
            r1 = 0
        L_0x0459:
            if (r1 >= r2) goto L_0x0481
            r4 = r39
            boolean r3 = r4.mo1846a(r1)
            if (r3 != 0) goto L_0x0475
            r6 = r36
            int r3 = r6.mo1859a(r1)
            r5 = 6
            if (r3 != r5) goto L_0x046d
        L_0x046c:
            goto L_0x0472
        L_0x046d:
            r3 = r9[r1]
            if (r3 != 0) goto L_0x046c
            goto L_0x0477
        L_0x0472:
            akz r15 = p000.akz.f637a
            goto L_0x0478
        L_0x0475:
            r6 = r36
        L_0x0477:
            r15 = 0
        L_0x0478:
            r0[r1] = r15
            int r1 = r1 + 1
            r39 = r4
            r36 = r6
            goto L_0x0459
        L_0x0481:
            r6 = r36
            r4 = r39
            int r1 = r4.f3783u
            if (r1 != 0) goto L_0x048b
            goto L_0x04f6
        L_0x048b:
            r2 = 0
            r3 = -1
            r4 = -1
        L_0x048e:
            int r5 = r6.f3802a
            if (r2 >= r5) goto L_0x04dd
            int r5 = r6.mo1859a(r2)
            r7 = r9[r2]
            r8 = 1
            if (r5 == r8) goto L_0x049f
            r8 = 2
            if (r5 == r8) goto L_0x049f
            goto L_0x04a1
        L_0x049f:
            if (r7 != 0) goto L_0x04a2
        L_0x04a1:
            goto L_0x04d9
        L_0x04a2:
            r8 = r19[r2]
            aye r10 = r6.mo1860b(r2)
            if (r7 == 0) goto L_0x04a1
            ayc r11 = r7.mo1833e()
            int r10 = r10.mo1611a(r11)
            r11 = 0
        L_0x04b3:
            int r12 = r7.mo1835f()
            if (r11 >= r12) goto L_0x04c9
            r12 = r8[r10]
            int r13 = r7.mo1830b(r11)
            r12 = r12[r13]
            r13 = 32
            r12 = r12 & r13
            if (r12 != r13) goto L_0x04a1
            int r11 = r11 + 1
            goto L_0x04b3
        L_0x04c9:
            r7 = 1
            if (r5 == r7) goto L_0x04d3
            r5 = -1
            if (r3 == r5) goto L_0x04d1
            goto L_0x04d6
        L_0x04d1:
            r3 = r2
            goto L_0x04d9
        L_0x04d3:
            r5 = -1
            if (r4 == r5) goto L_0x04d8
        L_0x04d6:
            r2 = 0
            goto L_0x04df
        L_0x04d8:
            r4 = r2
        L_0x04d9:
            int r2 = r2 + 1
            goto L_0x048e
        L_0x04dd:
            r2 = 1
        L_0x04df:
            r5 = -1
            if (r4 != r5) goto L_0x04e5
        L_0x04e2:
            r21 = 0
            goto L_0x04e9
        L_0x04e5:
            if (r3 == r5) goto L_0x04e2
            r21 = 1
        L_0x04e9:
            r2 = r2 & r21
            if (r2 == 0) goto L_0x04f6
            akz r2 = new akz
            r2.<init>(r1)
            r0[r4] = r2
            r0[r3] = r2
        L_0x04f6:
            android.util.Pair r0 = android.util.Pair.create(r0, r9)
            bgr r1 = new bgr
            java.lang.Object r2 = r0.first
            akz[] r2 = (p000.akz[]) r2
            java.lang.Object r0 = r0.second
            bgl[] r0 = (p000.bgl[]) r0
            r1.<init>(r2, r0)
            bgm r0 = r1.f3835c
            bgl[] r0 = r0.mo1862a()
            int r2 = r0.length
            r3 = 0
        L_0x050f:
            if (r3 >= r2) goto L_0x0520
            r4 = r0[r3]
            if (r4 != 0) goto L_0x0518
            r7 = r43
            goto L_0x051d
        L_0x0518:
            r7 = r43
            r4.mo1824a(r7)
        L_0x051d:
            int r3 = r3 + 1
            goto L_0x050f
        L_0x0520:
            return r1
        L_0x0521:
            r18 = r1
            r35 = r7
            r38 = r8
            r8 = 3
            r7 = r43
            r41 = r6
            r6 = r2
            r2 = r41
            r1 = r35[r0]
            if (r1 != 0) goto L_0x0534
            goto L_0x055c
        L_0x0534:
            int[] r3 = r1.f3806b
            int r10 = r3.length
            r11 = 1
            if (r10 != r11) goto L_0x055c
            bgh r10 = new bgh
            ayc r11 = r1.f3805a
            r12 = 0
            r3 = r3[r12]
            int r13 = r1.f3807c
            java.lang.Object r14 = r1.f3808d
            r10.<init>(r11, r3, r13, r14)
            r9[r0] = r10
            ayc r3 = r1.f3805a
            int[] r1 = r1.f3806b
            r1 = r1[r12]
            akh r1 = r3.mo1604a(r1)
            int r1 = r1.f552e
            r3 = -1
            if (r1 == r3) goto L_0x055c
            int r1 = r18 + r1
            goto L_0x055e
        L_0x055c:
            r1 = r18
        L_0x055e:
            int r0 = r0 + 1
            r7 = r35
            r8 = r38
            r15 = 3
            r41 = r6
            r6 = r2
            r2 = r41
            goto L_0x0265
        L_0x056c:
            r35 = r7
            r8 = 3
            r7 = r43
            r41 = r6
            r6 = r2
            r2 = r41
            boolean r5 = r4.mo1846a(r0)
            if (r5 == 0) goto L_0x0580
            r5 = 0
            r35[r0] = r5
            goto L_0x05c3
        L_0x0580:
            aye r5 = r6.mo1860b(r0)
            android.util.SparseArray r9 = r4.f3784v
            java.lang.Object r9 = r9.get(r0)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x05c3
            boolean r9 = r9.containsKey(r5)
            if (r9 == 0) goto L_0x05c3
            android.util.SparseArray r9 = r4.f3784v
            java.lang.Object r9 = r9.get(r0)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x05a6
            java.lang.Object r9 = r9.get(r5)
            r15 = r9
            bge r15 = (p000.bge) r15
            goto L_0x05a8
        L_0x05a6:
            r15 = 0
        L_0x05a8:
            if (r15 == 0) goto L_0x05c0
            bgj r9 = new bgj
            int r10 = r15.f3785a
            ayc r5 = r5.mo1612a(r10)
            int[] r10 = r15.f3786b
            int r11 = r15.f3787c
            int r12 = r15.f3788d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.<init>(r5, r10, r11, r12)
            goto L_0x05c1
        L_0x05c0:
            r9 = 0
        L_0x05c1:
            r35[r0] = r9
        L_0x05c3:
            int r0 = r0 + 1
            r7 = r35
            r15 = 3
            r41 = r6
            r6 = r2
            r2 = r41
            goto L_0x024b
        L_0x05cf:
            r35 = r7
            r19 = r8
            r7 = r43
            r41 = r6
            r6 = r2
            r2 = r41
            int r0 = r6.mo1859a(r9)
            r5 = 1
            if (r0 != r5) goto L_0x0780
            r0 = r12 ^ 1
            aye r5 = r6.mo1860b(r9)
            r8 = r19[r9]
            r13 = 0
            r14 = -1
            r15 = 0
            r20 = -1
        L_0x05ee:
            r22 = r1
            int r1 = r5.f2751b
            if (r13 >= r1) goto L_0x064d
            ayc r1 = r5.mo1612a(r13)
            r23 = r8[r13]
            r24 = r2
            r2 = r15
            r15 = r14
            r14 = 0
        L_0x05ff:
            r25 = r3
            int r3 = r1.f2747a
            if (r14 < r3) goto L_0x0611
            int r13 = r13 + 1
            r14 = r15
            r1 = r22
            r3 = r25
            r15 = r2
            r2 = r24
            goto L_0x05ee
        L_0x0611:
            r3 = r23[r14]
            boolean r7 = r4.f3782t
            boolean r3 = p000.bgg.m3127a(r3, r7)
            if (r3 == 0) goto L_0x0640
            akh r3 = r1.mo1604a(r14)
            bga r7 = new bga
            r26 = r1
            r1 = r23[r14]
            r7.<init>(r3, r4, r1)
            boolean r1 = r7.f3751a
            if (r1 != 0) goto L_0x0631
            boolean r1 = r4.f3776n
            if (r1 != 0) goto L_0x0631
            goto L_0x0642
        L_0x0631:
            if (r2 != 0) goto L_0x0634
        L_0x0633:
            goto L_0x063b
        L_0x0634:
            int r1 = r7.compareTo(r2)
            if (r1 <= 0) goto L_0x0642
            goto L_0x0633
        L_0x063b:
            r2 = r7
            r15 = r13
            r20 = r14
            goto L_0x0643
        L_0x0640:
            r26 = r1
        L_0x0642:
        L_0x0643:
            int r14 = r14 + 1
            r7 = r43
            r3 = r25
            r1 = r26
            goto L_0x05ff
        L_0x064d:
            r24 = r2
            r25 = r3
            r1 = -1
            if (r14 == r1) goto L_0x073d
            ayc r1 = r5.mo1612a(r14)
            boolean r2 = r4.f3781s
            if (r2 != 0) goto L_0x0718
            boolean r2 = r4.f3780r
            if (r2 == 0) goto L_0x066a
        L_0x0660:
            r39 = r4
            r36 = r6
            r33 = r10
            r34 = r12
            goto L_0x0722
        L_0x066a:
            if (r0 != 0) goto L_0x066d
            goto L_0x0660
        L_0x066d:
            r0 = r8[r14]
            int r2 = r4.f3775m
            boolean r3 = r4.f3777o
            boolean r5 = r4.f3778p
            boolean r7 = r4.f3779q
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r13 = 0
            r14 = 0
            r23 = 0
        L_0x0680:
            r33 = r10
            int r10 = r1.f2747a
            if (r13 >= r10) goto L_0x06d7
            akh r10 = r1.mo1604a(r13)
            r34 = r12
            bfz r12 = new bfz
            r39 = r4
            int r4 = r10.f569v
            r36 = r6
            int r6 = r10.f570w
            java.lang.String r10 = r10.f556i
            r12.<init>(r4, r6, r10)
            boolean r4 = r8.add(r12)
            if (r4 == 0) goto L_0x06ca
            r4 = 0
            r6 = 0
        L_0x06a3:
            int r10 = r1.f2747a
            if (r4 >= r10) goto L_0x06c3
            akh r26 = r1.mo1604a(r4)
            r27 = r0[r4]
            r28 = r12
            r29 = r2
            r30 = r3
            r31 = r5
            r32 = r7
            boolean r10 = p000.bgg.m3128a(r26, r27, r28, r29, r30, r31, r32)
            if (r10 != 0) goto L_0x06be
            goto L_0x06c0
        L_0x06be:
            int r6 = r6 + 1
        L_0x06c0:
            int r4 = r4 + 1
            goto L_0x06a3
        L_0x06c3:
            if (r6 > r14) goto L_0x06c6
            goto L_0x06ca
        L_0x06c6:
            r14 = r6
            r23 = r12
            goto L_0x06cb
        L_0x06ca:
        L_0x06cb:
            int r13 = r13 + 1
            r10 = r33
            r12 = r34
            r6 = r36
            r4 = r39
            goto L_0x0680
        L_0x06d7:
            r39 = r4
            r36 = r6
            r34 = r12
            r4 = 1
            if (r14 <= r4) goto L_0x070c
            p000.bks.m3507a(r23)
            int[] r4 = new int[r14]
            r6 = 0
            r8 = 0
        L_0x06e7:
            int r10 = r1.f2747a
            if (r6 >= r10) goto L_0x070b
            akh r26 = r1.mo1604a(r6)
            r27 = r0[r6]
            r28 = r23
            r29 = r2
            r30 = r3
            r31 = r5
            r32 = r7
            boolean r10 = p000.bgg.m3128a(r26, r27, r28, r29, r30, r31, r32)
            if (r10 != 0) goto L_0x0702
            goto L_0x0708
        L_0x0702:
            int r10 = r8 + 1
            r4[r8] = r6
            r8 = r10
        L_0x0708:
            int r6 = r6 + 1
            goto L_0x06e7
        L_0x070b:
            goto L_0x070e
        L_0x070c:
            int[] r4 = p000.bgg.f3797a
        L_0x070e:
            int r0 = r4.length
            if (r0 <= 0) goto L_0x0720
            bgj r0 = new bgj
            r0.<init>(r1, r4)
            goto L_0x0723
        L_0x0718:
            r39 = r4
            r36 = r6
            r33 = r10
            r34 = r12
        L_0x0720:
        L_0x0722:
            r0 = 0
        L_0x0723:
            if (r0 != 0) goto L_0x0731
            bgj r0 = new bgj
            r2 = 1
            int[] r3 = new int[r2]
            r2 = 0
            r3[r2] = r20
            r0.<init>(r1, r3)
            goto L_0x0732
        L_0x0731:
        L_0x0732:
            java.lang.Object r1 = p000.bks.m3507a(r15)
            bga r1 = (p000.bga) r1
            android.util.Pair r15 = android.util.Pair.create(r0, r1)
            goto L_0x0746
        L_0x073d:
            r39 = r4
            r36 = r6
            r33 = r10
            r34 = r12
            r15 = 0
        L_0x0746:
            r0 = r18
            if (r15 != 0) goto L_0x074c
        L_0x074a:
            r1 = 0
            goto L_0x0791
        L_0x074c:
            if (r0 == 0) goto L_0x075a
            java.lang.Object r1 = r15.second
            bga r1 = (p000.bga) r1
            int r1 = r1.compareTo(r0)
            if (r1 <= 0) goto L_0x0759
            goto L_0x075a
        L_0x0759:
            goto L_0x074a
        L_0x075a:
            r0 = -1
            if (r11 != r0) goto L_0x075f
            r1 = 0
            goto L_0x0763
        L_0x075f:
            r1 = 0
            r35[r11] = r1
        L_0x0763:
            java.lang.Object r0 = r15.first
            bgj r0 = (p000.bgj) r0
            r35[r9] = r0
            ayc r2 = r0.f3805a
            int[] r0 = r0.f3806b
            r3 = 0
            r0 = r0[r3]
            akh r0 = r2.mo1604a(r0)
            java.lang.String r0 = r0.f544A
            java.lang.Object r2 = r15.second
            bga r2 = (p000.bga) r2
            r10 = r0
            r18 = r2
            r11 = r9
            goto L_0x0795
        L_0x0780:
            r22 = r1
            r24 = r2
            r25 = r3
            r39 = r4
            r36 = r6
            r33 = r10
            r34 = r12
            r0 = r18
            r1 = 0
        L_0x0791:
            r18 = r0
            r10 = r33
        L_0x0795:
            int r9 = r9 + 1
            r0 = r42
            r8 = r19
            r1 = r22
            r6 = r24
            r3 = r25
            r12 = r34
            r7 = r35
            r2 = r36
            r4 = r39
            r5 = 1
            r13 = 2
            goto L_0x00f9
        L_0x07ae:
            r22 = r1
            r36 = r2
            r25 = r3
            r39 = r4
            r24 = r6
            r35 = r7
            r19 = r8
            r34 = r12
            r1 = 0
            r0 = r36
            int r2 = r0.mo1859a(r9)
            r3 = 2
            if (r2 == r3) goto L_0x07d5
            r1 = r0
            r2 = r9
            r18 = r10
            r12 = r34
            r9 = r39
            r0 = 1
            r21 = 0
            goto L_0x0a5d
        L_0x07d5:
            if (r11 != 0) goto L_0x0a40
            aye r2 = r0.mo1860b(r9)
            r3 = r19[r9]
            r4 = r10[r9]
            r5 = r39
            boolean r6 = r5.f3781s
            if (r6 != 0) goto L_0x0931
            boolean r6 = r5.f3780r
            if (r6 != 0) goto L_0x0925
            boolean r6 = r5.f3770h
            if (r6 != 0) goto L_0x07f0
            r6 = 16
            goto L_0x07f3
        L_0x07f0:
            r6 = 24
        L_0x07f3:
            boolean r7 = r5.f3769g
            if (r7 == 0) goto L_0x07fe
            r4 = r4 & r6
            if (r4 == 0) goto L_0x07fc
            r4 = 1
            goto L_0x07ff
        L_0x07fc:
        L_0x07fe:
            r4 = 0
        L_0x07ff:
            r7 = 0
        L_0x0800:
            int r8 = r2.f2751b
            if (r7 >= r8) goto L_0x0919
            ayc r8 = r2.mo1612a(r7)
            r11 = r3[r7]
            int r12 = r5.f3764b
            int r13 = r5.f3765c
            int r14 = r5.f3766d
            int r15 = r5.f3767e
            int r1 = r5.f3771i
            r18 = r10
            int r10 = r5.f3772j
            r36 = r0
            boolean r0 = r5.f3773k
            r20 = r9
            int r9 = r8.f2747a
            r23 = r3
            r3 = 2
            if (r9 < r3) goto L_0x08f9
            java.util.List r0 = p000.bgg.m3126a(r8, r1, r10, r0)
            int r1 = r0.size()
            if (r1 >= r3) goto L_0x0838
            int[] r0 = p000.bgg.f3797a
            r37 = r4
            r40 = r5
            r3 = 2
            goto L_0x08ff
        L_0x0838:
            if (r4 != 0) goto L_0x08b5
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3 = 0
            r9 = 0
            r10 = 0
        L_0x0842:
            r37 = r4
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x08b0
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            akh r4 = r8.mo1604a(r4)
            java.lang.String r4 = r4.f556i
            boolean r26 = r1.add(r4)
            if (r26 == 0) goto L_0x089e
            r38 = r1
            r39 = r10
            r1 = 0
            r10 = 0
        L_0x0866:
            r40 = r5
            int r5 = r0.size()
            if (r1 >= r5) goto L_0x0898
            java.lang.Object r5 = r0.get(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            akh r26 = r8.mo1604a(r5)
            r28 = r11[r5]
            r27 = r4
            r29 = r6
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            boolean r5 = p000.bgg.m3129a(r26, r27, r28, r29, r30, r31, r32, r33)
            if (r5 != 0) goto L_0x0891
            goto L_0x0893
        L_0x0891:
            int r10 = r10 + 1
        L_0x0893:
            int r1 = r1 + 1
            r5 = r40
            goto L_0x0866
        L_0x0898:
            if (r10 > r9) goto L_0x089b
            goto L_0x08a4
        L_0x089b:
            r9 = r10
            r10 = r4
            goto L_0x08a6
        L_0x089e:
            r38 = r1
            r40 = r5
            r39 = r10
        L_0x08a4:
            r10 = r39
        L_0x08a6:
            int r3 = r3 + 1
            r4 = r37
            r1 = r38
            r5 = r40
            goto L_0x0842
        L_0x08b0:
            r40 = r5
            r39 = r10
            goto L_0x08bb
        L_0x08b5:
            r37 = r4
            r40 = r5
            r39 = 0
        L_0x08bb:
            int r1 = r0.size()
            r3 = -1
            int r1 = r1 + r3
        L_0x08c1:
            if (r1 < 0) goto L_0x08ec
            java.lang.Object r3 = r0.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            akh r26 = r8.mo1604a(r3)
            r28 = r11[r3]
            r27 = r39
            r29 = r6
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            boolean r3 = p000.bgg.m3129a(r26, r27, r28, r29, r30, r31, r32, r33)
            if (r3 == 0) goto L_0x08e6
            goto L_0x08e9
        L_0x08e6:
            r0.remove(r1)
        L_0x08e9:
            int r1 = r1 + -1
            goto L_0x08c1
        L_0x08ec:
            int r1 = r0.size()
            r3 = 2
            if (r1 >= r3) goto L_0x08f4
            goto L_0x08fd
        L_0x08f4:
            int[] r0 = p000.blm.m3654a(r0)
            goto L_0x08ff
        L_0x08f9:
            r37 = r4
            r40 = r5
        L_0x08fd:
            int[] r0 = p000.bgg.f3797a
        L_0x08ff:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0908
            bgj r15 = new bgj
            r15.<init>(r8, r0)
            goto L_0x093d
        L_0x0908:
            int r7 = r7 + 1
            r10 = r18
            r9 = r20
            r3 = r23
            r0 = r36
            r4 = r37
            r5 = r40
            r1 = 0
            goto L_0x0800
        L_0x0919:
            r36 = r0
            r23 = r3
            r40 = r5
            r20 = r9
            r18 = r10
            r3 = 2
            goto L_0x093c
        L_0x0925:
            r36 = r0
            r23 = r3
            r40 = r5
            r20 = r9
            r18 = r10
            r3 = 2
            goto L_0x093c
        L_0x0931:
            r36 = r0
            r23 = r3
            r40 = r5
            r20 = r9
            r18 = r10
            r3 = 2
        L_0x093c:
            r15 = 0
        L_0x093d:
            if (r15 != 0) goto L_0x0a32
            r0 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = -1
            r7 = -1
        L_0x0945:
            int r8 = r2.f2751b
            if (r0 >= r8) goto L_0x0a1c
            ayc r8 = r2.mo1612a(r0)
            r9 = r40
            int r10 = r9.f3771i
            int r11 = r9.f3772j
            boolean r12 = r9.f3773k
            java.util.List r10 = p000.bgg.m3126a(r8, r10, r11, r12)
            r11 = r23[r0]
            r12 = r1
            r1 = 0
        L_0x095d:
            int r13 = r8.f2747a
            if (r1 < r13) goto L_0x0968
            int r0 = r0 + 1
            r40 = r9
            r1 = r12
            goto L_0x0945
        L_0x0968:
            r13 = r11[r1]
            boolean r14 = r9.f3782t
            boolean r13 = p000.bgg.m3127a(r13, r14)
            if (r13 != 0) goto L_0x0978
        L_0x0972:
            r26 = r0
            r27 = r2
            goto L_0x0a12
        L_0x0978:
            akh r13 = r8.mo1604a(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            boolean r14 = r10.contains(r14)
            if (r14 == 0) goto L_0x09ba
            int r14 = r13.f561n
            r15 = -1
            if (r14 != r15) goto L_0x098c
        L_0x098b:
            goto L_0x0993
        L_0x098c:
            int r15 = r9.f3764b
            if (r14 <= r15) goto L_0x098b
        L_0x0990:
            r3 = 0
            r15 = -1
            goto L_0x09bc
        L_0x0993:
            int r14 = r13.f562o
            r15 = -1
            if (r14 != r15) goto L_0x0999
        L_0x0998:
            goto L_0x099e
        L_0x0999:
            int r15 = r9.f3765c
            if (r14 <= r15) goto L_0x0998
            goto L_0x0990
        L_0x099e:
            float r14 = r13.f563p
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x09ad
            int r15 = r9.f3766d
            float r15 = (float) r15
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 > 0) goto L_0x0990
        L_0x09ad:
            int r14 = r13.f552e
            r15 = -1
            if (r14 == r15) goto L_0x09b8
            int r3 = r9.f3767e
            if (r14 > r3) goto L_0x09b7
            goto L_0x09b8
        L_0x09b7:
            goto L_0x09bb
        L_0x09b8:
            r3 = 1
            goto L_0x09bc
        L_0x09ba:
            r15 = -1
        L_0x09bb:
            r3 = 0
        L_0x09bc:
            if (r3 != 0) goto L_0x09c2
            boolean r14 = r9.f3768f
            if (r14 == 0) goto L_0x0972
        L_0x09c2:
            if (r3 != 0) goto L_0x09c6
            r14 = 1
            goto L_0x09c8
        L_0x09c6:
            r14 = 2
        L_0x09c8:
            r15 = r11[r1]
            r26 = r0
            r0 = 0
            boolean r15 = p000.bgg.m3127a(r15, r0)
            if (r15 == 0) goto L_0x09d5
            int r14 = r14 + 1000
        L_0x09d5:
            if (r14 != r5) goto L_0x0a03
            int r0 = r13.f552e
            int r0 = p000.bgg.m3123a(r0, r6)
            r27 = r2
            boolean r2 = r9.f3780r
            if (r2 == 0) goto L_0x09e8
            if (r0 == 0) goto L_0x09e8
            if (r0 >= 0) goto L_0x0a07
            goto L_0x0a08
        L_0x09e8:
            int r0 = r13.mo418a()
            if (r0 != r7) goto L_0x09f5
            int r0 = r13.f552e
            int r0 = p000.bgg.m3123a(r0, r6)
            goto L_0x09f9
        L_0x09f5:
            int r0 = p000.bgg.m3123a(r0, r7)
        L_0x09f9:
            if (r15 == 0) goto L_0x0a00
            if (r3 == 0) goto L_0x0a00
            if (r0 > 0) goto L_0x0a08
            goto L_0x0a07
        L_0x0a00:
            if (r0 < 0) goto L_0x0a08
            goto L_0x0a07
        L_0x0a03:
            r27 = r2
            if (r14 > r5) goto L_0x0a08
        L_0x0a07:
            goto L_0x0a12
        L_0x0a08:
            int r6 = r13.f552e
            int r7 = r13.mo418a()
            r4 = r1
            r12 = r8
            r5 = r14
        L_0x0a12:
            int r1 = r1 + 1
            r0 = r26
            r2 = r27
            r3 = 2
            goto L_0x095d
        L_0x0a1c:
            r9 = r40
            if (r1 == 0) goto L_0x0a2d
            bgj r15 = new bgj
            r0 = 1
            int[] r2 = new int[r0]
            r21 = 0
            r2[r21] = r4
            r15.<init>(r1, r2)
            goto L_0x0a37
        L_0x0a2d:
            r0 = 1
            r21 = 0
            r15 = 0
            goto L_0x0a37
        L_0x0a32:
            r9 = r40
            r0 = 1
            r21 = 0
        L_0x0a37:
            r35[r20] = r15
            if (r15 == 0) goto L_0x0a3d
            r11 = 1
            goto L_0x0a4b
        L_0x0a3d:
            r11 = 0
            goto L_0x0a4b
        L_0x0a40:
            r36 = r0
            r20 = r9
            r18 = r10
            r9 = r39
            r0 = 1
            r21 = 0
        L_0x0a4b:
            r2 = r20
            r1 = r36
            aye r3 = r1.mo1860b(r2)
            int r3 = r3.f2751b
            if (r3 <= 0) goto L_0x0a59
            r3 = 1
            goto L_0x0a5a
        L_0x0a59:
            r3 = 0
        L_0x0a5a:
            r3 = r34 | r3
            r12 = r3
        L_0x0a5d:
            int r2 = r2 + 1
            r0 = r42
            r4 = r9
            r10 = r18
            r8 = r19
            r6 = r24
            r3 = r25
            r7 = r35
            r5 = 1
            r9 = r2
            r2 = r1
            r1 = r22
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.akl.mo438a(float):bgr");
    }

    /* renamed from: a */
    public final void mo439a(akl akl) {
        if (akl != this.f583g) {
            this.f583g = akl;
            m755g();
        }
    }
}
