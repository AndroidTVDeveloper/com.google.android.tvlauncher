package p000;

import android.util.Pair;

/* renamed from: asc */
/* compiled from: PG */
public final class asc implements art {

    /* renamed from: a */
    private final String f2176a;

    /* renamed from: b */
    private final bky f2177b = new bky(1024);

    /* renamed from: c */
    private final bkx f2178c = new bkx(this.f2177b.f4258a);

    /* renamed from: d */
    private aov f2179d;

    /* renamed from: e */
    private akh f2180e;

    /* renamed from: f */
    private String f2181f;

    /* renamed from: g */
    private int f2182g;

    /* renamed from: h */
    private int f2183h;

    /* renamed from: i */
    private int f2184i;

    /* renamed from: j */
    private int f2185j;

    /* renamed from: k */
    private long f2186k;

    /* renamed from: l */
    private boolean f2187l;

    /* renamed from: m */
    private int f2188m;

    /* renamed from: n */
    private int f2189n;

    /* renamed from: o */
    private int f2190o;

    /* renamed from: p */
    private boolean f2191p;

    /* renamed from: q */
    private long f2192q;

    /* renamed from: r */
    private int f2193r;

    /* renamed from: s */
    private long f2194s;

    /* renamed from: t */
    private int f2195t;

    public asc(String str) {
        this.f2176a = str;
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        if (r0.f2187l == false) goto L_0x01a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1284a(p000.bky r22) {
        /*
            r21 = this;
            r0 = r21
        L_0x0002:
            int r1 = r22.mo2070b()
            if (r1 <= 0) goto L_0x0209
            int r1 = r0.f2182g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x01fd
            r4 = 2
            r5 = 0
            if (r1 == r3) goto L_0x01e5
            r2 = 3
            r6 = 8
            if (r1 == r4) goto L_0x01bd
            int r1 = r22.mo2070b()
            int r4 = r0.f2184i
            int r7 = r0.f2183h
            int r4 = r4 - r7
            int r1 = java.lang.Math.min(r1, r4)
            bkx r4 = r0.f2178c
            byte[] r4 = r4.f4254a
            int r7 = r0.f2183h
            r8 = r22
            r8.mo2069a(r4, r7, r1)
            int r4 = r0.f2183h
            int r4 = r4 + r1
            r0.f2183h = r4
            int r1 = r0.f2184i
            if (r4 != r1) goto L_0x0002
            bkx r1 = r0.f2178c
            r1.mo2050a(r5)
            bkx r1 = r0.f2178c
            boolean r4 = r1.mo2060e()
            if (r4 != 0) goto L_0x0147
            r0.f2187l = r3
            int r4 = r1.mo2057c(r3)
            if (r4 != r3) goto L_0x0053
            int r7 = r1.mo2057c(r3)
            goto L_0x0055
        L_0x0053:
            r7 = 0
        L_0x0055:
            r0.f2188m = r7
            if (r7 != 0) goto L_0x0141
            if (r4 != r3) goto L_0x005e
            m1973b(r1)
        L_0x005e:
            boolean r7 = r1.mo2060e()
            if (r7 == 0) goto L_0x013b
            r7 = 6
            int r9 = r1.mo2057c(r7)
            r0.f2189n = r9
            r9 = 4
            int r10 = r1.mo2057c(r9)
            int r11 = r1.mo2057c(r2)
            if (r10 != 0) goto L_0x0135
            if (r11 != 0) goto L_0x0135
            if (r4 != 0) goto L_0x00c5
            int r10 = r1.mo2053b()
            int r11 = r0.m1972a(r1)
            r1.mo2050a(r10)
            int r10 = r11 + 7
            int r10 = r10 / r6
            byte[] r10 = new byte[r10]
            r1.mo2055b(r10, r11)
            java.lang.String r12 = r0.f2181f
            r14 = -1
            r15 = -1
            int r11 = r0.f2195t
            int r13 = r0.f2193r
            java.util.List r18 = java.util.Collections.singletonList(r10)
            r19 = 0
            java.lang.String r10 = r0.f2176a
            java.lang.String r16 = "audio/mp4a-latm"
            r17 = r13
            r13 = r16
            r16 = r11
            r20 = r10
            akh r10 = p000.akh.m731a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            akh r11 = r0.f2180e
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00d2
            r0.f2180e = r10
            r11 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r13 = r10.f570w
            long r13 = (long) r13
            long r11 = r11 / r13
            r0.f2194s = r11
            aov r11 = r0.f2179d
            r11.mo1204a(r10)
            goto L_0x00d2
        L_0x00c5:
            long r10 = m1973b(r1)
            int r11 = (int) r10
            int r10 = r0.m1972a(r1)
            int r11 = r11 - r10
            r1.mo2054b(r11)
        L_0x00d2:
            int r10 = r1.mo2057c(r2)
            r0.f2190o = r10
            if (r10 == 0) goto L_0x00ff
            if (r10 == r3) goto L_0x00f9
            if (r10 == r2) goto L_0x00f4
            if (r10 == r9) goto L_0x00f4
            r2 = 5
            if (r10 == r2) goto L_0x00f4
            if (r10 == r7) goto L_0x00f0
            r2 = 7
            if (r10 != r2) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00f0:
            r1.mo2054b(r3)
            goto L_0x0103
        L_0x00f4:
            r1.mo2054b(r7)
            goto L_0x0103
        L_0x00f9:
            r2 = 9
            r1.mo2054b(r2)
            goto L_0x0103
        L_0x00ff:
            r1.mo2054b(r6)
        L_0x0103:
            boolean r2 = r1.mo2060e()
            r0.f2191p = r2
            r9 = 0
            r0.f2192q = r9
            if (r2 == 0) goto L_0x0129
            if (r4 == r3) goto L_0x0123
        L_0x0111:
            boolean r2 = r1.mo2060e()
            long r3 = r0.f2192q
            long r3 = r3 << r6
            int r7 = r1.mo2057c(r6)
            long r9 = (long) r7
            long r3 = r3 + r9
            r0.f2192q = r3
            if (r2 != 0) goto L_0x0111
            goto L_0x0129
        L_0x0123:
            long r2 = m1973b(r1)
            r0.f2192q = r2
        L_0x0129:
            boolean r2 = r1.mo2060e()
            if (r2 != 0) goto L_0x0130
            goto L_0x014c
        L_0x0130:
            r1.mo2054b(r6)
            goto L_0x014c
        L_0x0135:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x013b:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x0141:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x0147:
            boolean r2 = r0.f2187l
            if (r2 != 0) goto L_0x014c
            goto L_0x01a4
        L_0x014c:
            int r2 = r0.f2188m
            if (r2 != 0) goto L_0x01b7
            int r2 = r0.f2189n
            if (r2 != 0) goto L_0x01b1
            int r2 = r0.f2190o
            if (r2 != 0) goto L_0x01ab
            r2 = 0
        L_0x0159:
            int r3 = r1.mo2057c(r6)
            int r13 = r2 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x01a9
            int r2 = r1.mo2053b()
            r3 = r2 & 7
            if (r3 != 0) goto L_0x0174
            bky r3 = r0.f2177b
            int r2 = r2 >> 3
            r3.mo2073c(r2)
            goto L_0x0182
        L_0x0174:
            bky r2 = r0.f2177b
            byte[] r2 = r2.f4258a
            int r3 = r13 << 3
            r1.mo2055b(r2, r3)
            bky r2 = r0.f2177b
            r2.mo2073c(r5)
        L_0x0182:
            aov r2 = r0.f2179d
            bky r3 = r0.f2177b
            r2.mo1205a(r3, r13)
            aov r9 = r0.f2179d
            long r10 = r0.f2186k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo1203a(r10, r12, r13, r14, r15)
            long r2 = r0.f2186k
            long r6 = r0.f2194s
            long r2 = r2 + r6
            r0.f2186k = r2
            boolean r2 = r0.f2191p
            if (r2 == 0) goto L_0x01a4
            long r2 = r0.f2192q
            int r3 = (int) r2
            r1.mo2054b(r3)
        L_0x01a4:
            r0.f2182g = r5
            goto L_0x0002
        L_0x01a9:
            r2 = r13
            goto L_0x0159
        L_0x01ab:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x01b1:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x01b7:
            ako r1 = new ako
            r1.<init>()
            throw r1
        L_0x01bd:
            r8 = r22
            int r1 = r0.f2185j
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r3 = r22.mo2074d()
            r1 = r1 | r3
            r0.f2184i = r1
            bky r3 = r0.f2177b
            byte[] r4 = r3.f4258a
            int r4 = r4.length
            if (r1 <= r4) goto L_0x01de
            r3.mo2065a(r1)
            bkx r1 = r0.f2178c
            bky r3 = r0.f2177b
            byte[] r3 = r3.f4258a
            r1.mo2051a(r3)
        L_0x01de:
            r0.f2183h = r5
            r0.f2182g = r2
            goto L_0x0002
        L_0x01e5:
            r8 = r22
            int r1 = r22.mo2074d()
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x01f7
            r0.f2185j = r1
            r0.f2182g = r4
            goto L_0x0002
        L_0x01f7:
            if (r1 == r2) goto L_0x0002
            r0.f2182g = r5
            goto L_0x0002
        L_0x01fd:
            r8 = r22
            int r1 = r22.mo2074d()
            if (r1 != r2) goto L_0x0002
            r0.f2182g = r3
            goto L_0x0002
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.asc.mo1284a(bky):void");
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2179d = aok.mo1211a(asw.mo1309b(), 1);
        this.f2181f = asw.mo1310c();
    }

    /* renamed from: b */
    private static long m1973b(bkx bkx) {
        return (long) bkx.mo2057c((bkx.mo2057c(2) + 1) << 3);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2186k = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkg.a(bkx, boolean):android.util.Pair
     arg types: [bkx, int]
     candidates:
      bkg.a(byte[], int):boolean
      bkg.a(int, int):byte[]
      bkg.a(bkx, boolean):android.util.Pair */
    /* renamed from: a */
    private final int m1972a(bkx bkx) {
        int a = bkx.mo2049a();
        Pair a2 = bkg.m3479a(bkx, true);
        this.f2193r = ((Integer) a2.first).intValue();
        this.f2195t = ((Integer) a2.second).intValue();
        return a - bkx.mo2049a();
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2182g = 0;
        this.f2187l = false;
    }
}
