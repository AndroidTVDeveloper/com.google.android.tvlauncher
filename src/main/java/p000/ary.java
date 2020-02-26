package p000;

/* renamed from: ary */
/* compiled from: PG */
public final class ary implements art {

    /* renamed from: a */
    private final asm f2125a;

    /* renamed from: b */
    private final boolean f2126b;

    /* renamed from: c */
    private final boolean f2127c;

    /* renamed from: d */
    private final ase f2128d = new ase(7);

    /* renamed from: e */
    private final ase f2129e = new ase(8);

    /* renamed from: f */
    private final ase f2130f = new ase(6);

    /* renamed from: g */
    private long f2131g;

    /* renamed from: h */
    private final boolean[] f2132h = new boolean[3];

    /* renamed from: i */
    private String f2133i;

    /* renamed from: j */
    private aov f2134j;

    /* renamed from: k */
    private arx f2135k;

    /* renamed from: l */
    private boolean f2136l;

    /* renamed from: m */
    private long f2137m;

    /* renamed from: n */
    private boolean f2138n;

    /* renamed from: o */
    private final bky f2139o = new bky();

    public ary(asm asm, boolean z, boolean z2) {
        this.f2125a = asm;
        this.f2126b = z;
        this.f2127c = z2;
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e9, code lost:
        if (r4.f2102l == r6.f2102l) goto L_0x021b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0220  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1284a(p000.bky r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.f4259b
            int r3 = r1.f4260c
            byte[] r4 = r1.f4258a
            long r5 = r0.f2131g
            int r7 = r26.mo2070b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f2131g = r5
            aov r5 = r0.f2134j
            int r6 = r26.mo2070b()
            r5.mo1205a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.f2132h
            int r1 = p000.bkw.m3525a(r4, r2, r3, r1)
            if (r1 == r3) goto L_0x02a0
            int r5 = p000.bkw.m3530b(r4, r1)
            int r6 = r1 - r2
            if (r6 > 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r0.m1954a(r4, r2, r1)
        L_0x0031:
            int r2 = r3 - r1
            long r7 = r0.f2131g
            long r9 = (long) r2
            long r7 = r7 - r9
            if (r6 >= 0) goto L_0x003b
            int r6 = -r6
            goto L_0x003d
        L_0x003b:
            r6 = 0
        L_0x003d:
            long r10 = r0.f2137m
            boolean r12 = r0.f2136l
            if (r12 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            arx r12 = r0.f2135k
            boolean r12 = r12.f2109c
            if (r12 == 0) goto L_0x0131
        L_0x004a:
            ase r12 = r0.f2128d
            r12.mo1298b(r6)
            ase r12 = r0.f2129e
            r12.mo1298b(r6)
            boolean r12 = r0.f2136l
            r14 = 3
            if (r12 == 0) goto L_0x00a1
            ase r12 = r0.f2128d
            boolean r15 = r12.f2208a
            if (r15 == 0) goto L_0x0079
            byte[] r15 = r12.f2209b
            int r12 = r12.f2210c
            bkv r12 = p000.bkw.m3526a(r15, r14, r12)
            arx r14 = r0.f2135k
            r14.mo1293a(r12)
            ase r12 = r0.f2128d
            r12.mo1295a()
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0079:
            ase r12 = r0.f2129e
            boolean r14 = r12.f2208a
            if (r14 == 0) goto L_0x0099
            byte[] r14 = r12.f2209b
            int r12 = r12.f2210c
            bku r12 = p000.bkw.m3532d(r14, r12)
            arx r14 = r0.f2135k
            r14.mo1292a(r12)
            ase r12 = r0.f2129e
            r12.mo1295a()
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0099:
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x00a1:
            ase r12 = r0.f2128d
            boolean r12 = r12.f2208a
            if (r12 == 0) goto L_0x012a
            ase r12 = r0.f2129e
            boolean r12 = r12.f2208a
            if (r12 == 0) goto L_0x012a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            ase r15 = r0.f2128d
            byte[] r9 = r15.f2209b
            int r15 = r15.f2210c
            byte[] r9 = java.util.Arrays.copyOf(r9, r15)
            r12.add(r9)
            ase r9 = r0.f2129e
            byte[] r15 = r9.f2209b
            int r9 = r9.f2210c
            byte[] r9 = java.util.Arrays.copyOf(r15, r9)
            r12.add(r9)
            ase r9 = r0.f2128d
            byte[] r15 = r9.f2209b
            int r9 = r9.f2210c
            bkv r9 = p000.bkw.m3526a(r15, r14, r9)
            ase r14 = r0.f2129e
            byte[] r15 = r14.f2209b
            int r14 = r14.f2210c
            bku r14 = p000.bkw.m3532d(r15, r14)
            aov r15 = r0.f2134j
            java.lang.String r13 = r0.f2133i
            r16 = r15
            int r15 = r9.f4237a
            r22 = r3
            int r3 = r9.f4238b
            r23 = r4
            int r4 = r9.f4239c
            java.lang.String r17 = p000.bkg.m3481a(r15, r3, r4)
            int r3 = r9.f4241e
            int r4 = r9.f4242f
            float r15 = r9.f4243g
            java.lang.String r18 = "video/avc"
            r24 = r1
            r21 = r15
            r1 = r16
            r15 = r13
            r16 = r18
            r18 = r3
            r19 = r4
            r20 = r12
            akh r3 = p000.akh.m737a(r15, r16, r17, r18, r19, r20, r21)
            r1.mo1204a(r3)
            r1 = 1
            r0.f2136l = r1
            arx r1 = r0.f2135k
            r1.mo1293a(r9)
            arx r1 = r0.f2135k
            r1.mo1292a(r14)
            ase r1 = r0.f2128d
            r1.mo1295a()
            ase r1 = r0.f2129e
            r1.mo1295a()
            goto L_0x0137
        L_0x012a:
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0131:
            r24 = r1
            r22 = r3
            r23 = r4
        L_0x0137:
            ase r1 = r0.f2130f
            boolean r1 = r1.mo1298b(r6)
            if (r1 == 0) goto L_0x015f
            ase r1 = r0.f2130f
            byte[] r3 = r1.f2209b
            int r1 = r1.f2210c
            int r1 = p000.bkw.m3524a(r3, r1)
            bky r3 = r0.f2139o
            ase r4 = r0.f2130f
            byte[] r4 = r4.f2209b
            r3.mo2068a(r4, r1)
            bky r1 = r0.f2139o
            r3 = 4
            r1.mo2073c(r3)
            asm r1 = r0.f2125a
            bky r3 = r0.f2139o
            r1.mo1305a(r10, r3)
        L_0x015f:
            arx r1 = r0.f2135k
            boolean r3 = r0.f2136l
            boolean r9 = r0.f2138n
            int r4 = r1.f2115i
            r6 = 9
            if (r4 == r6) goto L_0x01eb
            boolean r4 = r1.f2109c
            if (r4 == 0) goto L_0x021b
            arw r4 = r1.f2120n
            arw r6 = r1.f2119m
            boolean r10 = r4.f2091a
            if (r10 != 0) goto L_0x0179
            goto L_0x021b
        L_0x0179:
            boolean r10 = r6.f2091a
            if (r10 == 0) goto L_0x01eb
            int r10 = r4.f2096f
            int r11 = r6.f2096f
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.f2097g
            int r11 = r6.f2097g
            if (r10 != r11) goto L_0x01eb
            boolean r10 = r4.f2098h
            boolean r11 = r6.f2098h
            if (r10 != r11) goto L_0x01eb
            boolean r10 = r4.f2099i
            if (r10 != 0) goto L_0x0194
        L_0x0193:
            goto L_0x019f
        L_0x0194:
            boolean r10 = r6.f2099i
            if (r10 == 0) goto L_0x0193
            boolean r10 = r4.f2100j
            boolean r11 = r6.f2100j
            if (r10 == r11) goto L_0x0193
            goto L_0x01eb
        L_0x019f:
            int r10 = r4.f2094d
            int r11 = r6.f2094d
            if (r10 != r11) goto L_0x01a6
        L_0x01a5:
            goto L_0x01ab
        L_0x01a6:
            if (r10 == 0) goto L_0x01eb
            if (r11 != 0) goto L_0x01a5
            goto L_0x01eb
        L_0x01ab:
            bkv r10 = r4.f2093c
            int r10 = r10.f4247k
            if (r10 != 0) goto L_0x01c5
            bkv r10 = r6.f2093c
            int r10 = r10.f4247k
            if (r10 == 0) goto L_0x01b8
            goto L_0x01db
        L_0x01b8:
            int r10 = r4.f2103m
            int r11 = r6.f2103m
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.f2104n
            int r11 = r6.f2104n
            if (r10 == r11) goto L_0x01db
            goto L_0x01eb
        L_0x01c5:
            r11 = 1
            if (r10 != r11) goto L_0x01db
            bkv r10 = r6.f2093c
            int r10 = r10.f4247k
            if (r10 != r11) goto L_0x01db
            int r10 = r4.f2105o
            int r11 = r6.f2105o
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.f2106p
            int r11 = r6.f2106p
            if (r10 == r11) goto L_0x01db
            goto L_0x01eb
        L_0x01db:
            boolean r10 = r4.f2101k
            boolean r11 = r6.f2101k
            if (r10 != r11) goto L_0x01eb
            if (r10 == 0) goto L_0x021b
            if (r11 == 0) goto L_0x021b
            int r4 = r4.f2102l
            int r6 = r6.f2102l
            if (r4 == r6) goto L_0x021b
        L_0x01eb:
            if (r3 != 0) goto L_0x01ee
            goto L_0x020d
        L_0x01ee:
            boolean r3 = r1.f2121o
            if (r3 == 0) goto L_0x020d
            long r3 = r1.f2116j
            boolean r13 = r1.f2124r
            long r10 = r1.f2122p
            aov r6 = r1.f2107a
            long r14 = r1.f2123q
            long r10 = r3 - r10
            int r11 = (int) r10
            long r3 = r7 - r3
            int r4 = (int) r3
            int r2 = r2 + r4
            r16 = 0
            r10 = r6
            r3 = r11
            r11 = r14
            r14 = r3
            r15 = r2
            r10.mo1203a(r11, r13, r14, r15, r16)
        L_0x020d:
            long r2 = r1.f2116j
            r1.f2122p = r2
            long r2 = r1.f2118l
            r1.f2123q = r2
            r2 = 0
            r1.f2124r = r2
            r2 = 1
            r1.f2121o = r2
        L_0x021b:
            boolean r2 = r1.f2108b
            r3 = 2
            if (r2 == 0) goto L_0x0232
            arw r2 = r1.f2120n
            boolean r4 = r2.f2092b
            if (r4 == 0) goto L_0x0230
            int r2 = r2.f2095e
            r4 = 7
            if (r2 != r4) goto L_0x022d
        L_0x022b:
            r9 = 1
            goto L_0x0233
        L_0x022d:
            if (r2 != r3) goto L_0x0230
            goto L_0x022b
        L_0x0230:
            r9 = 0
            goto L_0x0233
        L_0x0232:
        L_0x0233:
            boolean r2 = r1.f2124r
            int r4 = r1.f2115i
            r6 = 5
            if (r4 != r6) goto L_0x023c
        L_0x023a:
            r4 = 1
            goto L_0x0242
        L_0x023c:
            if (r9 == 0) goto L_0x0241
            r9 = 1
            if (r4 == r9) goto L_0x023a
        L_0x0241:
            r4 = 0
        L_0x0242:
            r2 = r2 | r4
            r1.f2124r = r2
            if (r2 != 0) goto L_0x0248
            goto L_0x024c
        L_0x0248:
            r1 = 0
            r0.f2138n = r1
        L_0x024c:
            long r1 = r0.f2137m
            boolean r4 = r0.f2136l
            if (r4 != 0) goto L_0x0253
            goto L_0x0259
        L_0x0253:
            arx r4 = r0.f2135k
            boolean r4 = r4.f2109c
            if (r4 == 0) goto L_0x0263
        L_0x0259:
            ase r4 = r0.f2128d
            r4.mo1296a(r5)
            ase r4 = r0.f2129e
            r4.mo1296a(r5)
        L_0x0263:
            ase r4 = r0.f2130f
            r4.mo1296a(r5)
            arx r4 = r0.f2135k
            r4.f2115i = r5
            r4.f2118l = r1
            r4.f2116j = r7
            boolean r1 = r4.f2108b
            if (r1 != 0) goto L_0x0275
            goto L_0x0278
        L_0x0275:
            r1 = 1
            if (r5 == r1) goto L_0x0285
        L_0x0278:
            boolean r1 = r4.f2109c
            if (r1 != 0) goto L_0x027d
            goto L_0x0298
        L_0x027d:
            if (r5 != r6) goto L_0x0280
            goto L_0x0285
        L_0x0280:
            r1 = 1
            if (r5 == r1) goto L_0x0285
            if (r5 != r3) goto L_0x0298
        L_0x0285:
            arw r1 = r4.f2119m
            arw r2 = r4.f2120n
            r4.f2119m = r2
            r4.f2120n = r1
            arw r1 = r4.f2120n
            r1.mo1290a()
            r1 = 0
            r4.f2114h = r1
            r1 = 1
            r4.f2117k = r1
        L_0x0298:
            int r2 = r24 + 3
            r3 = r22
            r4 = r23
            goto L_0x001d
        L_0x02a0:
            r22 = r3
            r23 = r4
            r1 = r22
            r3 = r23
            r0.m1954a(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ary.mo1284a(bky):void");
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2133i = asw.mo1310c();
        this.f2134j = aok.mo1211a(asw.mo1309b(), 2);
        this.f2135k = new arx(this.f2134j, this.f2126b, this.f2127c);
        this.f2125a.mo1306a(aok, asw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1954a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f2136l
            if (r4 == 0) goto L_0x0012
            arx r4 = r0.f2135k
            boolean r4 = r4.f2109c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            ase r4 = r0.f2128d
            r4.mo1297a(r1, r2, r3)
            ase r4 = r0.f2129e
            r4.mo1297a(r1, r2, r3)
        L_0x001c:
            ase r4 = r0.f2130f
            r4.mo1297a(r1, r2, r3)
            arx r4 = r0.f2135k
            boolean r5 = r4.f2117k
            if (r5 == 0) goto L_0x01b6
            int r3 = r3 - r2
            byte[] r5 = r4.f2113g
            int r6 = r5.length
            int r7 = r4.f2114h
            int r7 = r7 + r3
            if (r6 >= r7) goto L_0x0037
            int r7 = r7 + r7
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f2113g = r5
        L_0x0037:
            byte[] r5 = r4.f2113g
            int r6 = r4.f2114h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f2114h
            int r1 = r1 + r3
            r4.f2114h = r1
            bkz r2 = r4.f2112f
            byte[] r3 = r4.f2113g
            r5 = 0
            r2.mo2094a(r3, r5, r1)
            bkz r1 = r4.f2112f
            r2 = 8
            boolean r1 = r1.mo2096b(r2)
            if (r1 == 0) goto L_0x01b6
            bkz r1 = r4.f2112f
            r1.mo2092a()
            bkz r1 = r4.f2112f
            r2 = 2
            int r1 = r1.mo2097c(r2)
            bkz r3 = r4.f2112f
            r6 = 5
            r3.mo2093a(r6)
            bkz r3 = r4.f2112f
            boolean r3 = r3.mo2098c()
            if (r3 == 0) goto L_0x01b6
            bkz r3 = r4.f2112f
            r3.mo2100e()
            bkz r3 = r4.f2112f
            boolean r3 = r3.mo2098c()
            if (r3 == 0) goto L_0x01b6
            bkz r3 = r4.f2112f
            int r3 = r3.mo2100e()
            boolean r7 = r4.f2109c
            r8 = 1
            if (r7 != 0) goto L_0x0090
            r4.f2117k = r5
            arw r1 = r4.f2120n
            r1.f2095e = r3
            r1.f2092b = r8
            return
        L_0x0090:
            bkz r7 = r4.f2112f
            boolean r7 = r7.mo2098c()
            if (r7 == 0) goto L_0x01b6
            bkz r7 = r4.f2112f
            int r7 = r7.mo2100e()
            android.util.SparseArray r9 = r4.f2111e
            int r9 = r9.indexOfKey(r7)
            if (r9 < 0) goto L_0x01b2
            android.util.SparseArray r9 = r4.f2111e
            java.lang.Object r9 = r9.get(r7)
            bku r9 = (p000.bku) r9
            android.util.SparseArray r10 = r4.f2110d
            int r11 = r9.f4235b
            java.lang.Object r10 = r10.get(r11)
            bkv r10 = (p000.bkv) r10
            boolean r11 = r10.f4244h
            if (r11 == 0) goto L_0x00c9
            bkz r11 = r4.f2112f
            boolean r11 = r11.mo2096b(r2)
            if (r11 == 0) goto L_0x01b6
            bkz r11 = r4.f2112f
            r11.mo2093a(r2)
        L_0x00c9:
            bkz r2 = r4.f2112f
            int r11 = r10.f4246j
            boolean r2 = r2.mo2096b(r11)
            if (r2 == 0) goto L_0x01b6
            bkz r2 = r4.f2112f
            int r11 = r10.f4246j
            int r2 = r2.mo2097c(r11)
            boolean r11 = r10.f4245i
            if (r11 == 0) goto L_0x00e3
            r11 = 0
        L_0x00e0:
            r12 = 0
            r13 = 0
            goto L_0x0107
        L_0x00e3:
            bkz r11 = r4.f2112f
            boolean r11 = r11.mo2096b(r8)
            if (r11 == 0) goto L_0x01b6
            bkz r11 = r4.f2112f
            boolean r11 = r11.mo2095b()
            if (r11 == 0) goto L_0x0105
            bkz r12 = r4.f2112f
            boolean r12 = r12.mo2096b(r8)
            if (r12 == 0) goto L_0x01b6
            bkz r12 = r4.f2112f
            boolean r12 = r12.mo2095b()
            r13 = r12
            r12 = 1
            goto L_0x0107
        L_0x0105:
            goto L_0x00e0
        L_0x0107:
            int r14 = r4.f2115i
            if (r14 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010f
        L_0x010d:
            r6 = 0
        L_0x010f:
            if (r6 == 0) goto L_0x0120
            bkz r14 = r4.f2112f
            boolean r14 = r14.mo2098c()
            if (r14 == 0) goto L_0x01b6
            bkz r14 = r4.f2112f
            int r14 = r14.mo2100e()
            goto L_0x0122
        L_0x0120:
            r14 = 0
        L_0x0122:
            int r15 = r10.f4247k
            if (r15 != 0) goto L_0x0152
            bkz r15 = r4.f2112f
            int r5 = r10.f4248l
            boolean r5 = r15.mo2096b(r5)
            if (r5 == 0) goto L_0x01b6
            bkz r5 = r4.f2112f
            int r15 = r10.f4248l
            int r5 = r5.mo2097c(r15)
            boolean r9 = r9.f4236c
            if (r9 != 0) goto L_0x013d
        L_0x013c:
            goto L_0x0188
        L_0x013d:
            if (r11 != 0) goto L_0x0151
            bkz r9 = r4.f2112f
            boolean r9 = r9.mo2098c()
            if (r9 == 0) goto L_0x01b6
            bkz r9 = r4.f2112f
            int r9 = r9.mo2099d()
            r8 = 0
            r15 = 0
            goto L_0x018b
        L_0x0151:
            goto L_0x013c
        L_0x0152:
            if (r15 != r8) goto L_0x0187
            boolean r5 = r10.f4249m
            if (r5 != 0) goto L_0x0187
            bkz r5 = r4.f2112f
            boolean r5 = r5.mo2098c()
            if (r5 == 0) goto L_0x01b6
            bkz r5 = r4.f2112f
            int r5 = r5.mo2099d()
            boolean r9 = r9.f4236c
            if (r9 == 0) goto L_0x0182
            if (r11 != 0) goto L_0x0181
            bkz r9 = r4.f2112f
            boolean r9 = r9.mo2098c()
            if (r9 == 0) goto L_0x01b6
            bkz r9 = r4.f2112f
            int r9 = r9.mo2099d()
            r15 = r5
            r8 = r9
            r5 = 0
            r9 = 0
            goto L_0x018b
        L_0x0181:
        L_0x0182:
            r15 = r5
            r5 = 0
            r8 = 0
            r9 = 0
            goto L_0x018b
        L_0x0187:
            r5 = 0
        L_0x0188:
            r8 = 0
            r9 = 0
            r15 = 0
        L_0x018b:
            arw r0 = r4.f2120n
            r0.f2093c = r10
            r0.f2094d = r1
            r0.f2095e = r3
            r0.f2096f = r2
            r0.f2097g = r7
            r0.f2098h = r11
            r0.f2099i = r12
            r0.f2100j = r13
            r0.f2101k = r6
            r0.f2102l = r14
            r0.f2103m = r5
            r0.f2104n = r9
            r0.f2105o = r15
            r0.f2106p = r8
            r1 = 1
            r0.f2091a = r1
            r0.f2092b = r1
            r0 = 0
            r4.f2117k = r0
            return
        L_0x01b2:
            r0 = 0
            r4.f2117k = r0
            return
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ary.m1954a(byte[], int, int):void");
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        boolean z;
        this.f2137m = j;
        boolean z2 = this.f2138n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2138n = z2 | z;
    }

    /* renamed from: a */
    public final void mo1281a() {
        bkw.m3528a(this.f2132h);
        this.f2128d.mo1295a();
        this.f2129e.mo1295a();
        this.f2130f.mo1295a();
        this.f2135k.mo1291a();
        this.f2131g = 0;
        this.f2138n = false;
    }
}
