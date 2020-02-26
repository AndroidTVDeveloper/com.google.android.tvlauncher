package defpackage;

/* renamed from: arv  reason: default package */
/* compiled from: PG */
public final class arv implements art {
    private static final double[] c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private aov b;
    private boolean d;
    private long e;
    private final asy f;
    private final bky g;
    private final boolean[] h;
    private final aru i;
    private final ase j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    public final void b() {
    }

    public arv() {
        this(null);
    }

    public arv(asy asy) {
        this.f = asy;
        this.h = new boolean[4];
        this.i = new aru();
        if (asy != null) {
            this.j = new ase(178);
            this.g = new bky();
            return;
        }
        this.j = null;
        this.g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bky r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.b
            int r3 = r1.c
            byte[] r4 = r1.a
            long r5 = r0.k
            int r7 = r26.b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.k = r5
            aov r5 = r0.b
            int r6 = r26.b()
            r5.a(r1, r6)
        L_0x001d:
            boolean[] r5 = r0.h
            int r5 = defpackage.bkw.a(r4, r2, r3, r5)
            if (r5 == r3) goto L_0x0206
            int r6 = r5 + 3
            byte[] r7 = r1.a
            byte r7 = r7[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.d
            r14 = 3
            r15 = 0
            if (r9 == 0) goto L_0x0037
            goto L_0x0122
        L_0x0037:
            if (r8 <= 0) goto L_0x003e
            aru r9 = r0.i
            r9.a(r4, r2, r5)
        L_0x003e:
            if (r8 >= 0) goto L_0x0042
            int r9 = -r8
            goto L_0x0044
        L_0x0042:
            r9 = 0
        L_0x0044:
            aru r12 = r0.i
            boolean r10 = r12.b
            if (r10 == 0) goto L_0x0112
            int r10 = r12.c
            int r10 = r10 - r9
            r12.c = r10
            int r9 = r12.d
            if (r9 == 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            r9 = 181(0xb5, float:2.54E-43)
            if (r7 != r9) goto L_0x005c
            r12.d = r10
            goto L_0x0119
        L_0x005c:
            r12.b = r15
            java.lang.String r9 = r0.a
            byte[] r15 = r12.e
            byte[] r10 = java.util.Arrays.copyOf(r15, r10)
            r15 = 4
            byte r11 = r10[r15]
            r24 = 5
            byte r13 = r10[r24]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r15
            int r17 = r13 >> 4
            r20 = r11 | r17
            r11 = r13 & 15
            int r11 = r11 << 8
            r13 = 6
            byte r13 = r10[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r21 = r11 | r13
            r11 = 7
            byte r13 = r10[r11]
            r13 = r13 & 240(0xf0, float:3.36E-43)
            int r13 = r13 >> r15
            r11 = 2
            if (r13 == r11) goto L_0x00a1
            if (r13 == r14) goto L_0x009b
            if (r13 == r15) goto L_0x0094
            r11 = 1065353216(0x3f800000, float:1.0)
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00aa
        L_0x0094:
            int r11 = r21 * 121
            float r11 = (float) r11
            int r13 = r20 * 100
            goto L_0x00a6
        L_0x009b:
            int r11 = r21 << 4
            float r11 = (float) r11
            int r13 = r20 * 9
            goto L_0x00a6
        L_0x00a1:
            int r11 = r21 << 2
            float r11 = (float) r11
            int r13 = r20 * 3
        L_0x00a6:
            float r13 = (float) r13
            float r11 = r11 / r13
            r23 = r11
        L_0x00aa:
            r19 = 0
            java.util.List r22 = java.util.Collections.singletonList(r10)
            java.lang.String r18 = "video/mpeg2"
            r17 = r9
            akh r9 = defpackage.akh.a(r17, r18, r19, r20, r21, r22, r23)
            r11 = 7
            byte r11 = r10[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x00f1
            double[] r13 = defpackage.arv.c
            int r15 = r13.length
            if (r11 >= r15) goto L_0x00f1
            r17 = r13[r11]
            int r11 = r12.d
            r12 = 9
            int r11 = r11 + r12
            byte r10 = r10[r11]
            r11 = r10 & 96
            int r11 = r11 >> 5
            r10 = r10 & 31
            if (r11 == r10) goto L_0x00e8
            double r11 = (double) r11
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r11)
            double r11 = r11 + r19
            int r10 = r10 + 1
            double r14 = (double) r10
            java.lang.Double.isNaN(r14)
            double r11 = r11 / r14
            double r17 = r17 * r11
        L_0x00e8:
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r10 = r10 / r17
            long r11 = (long) r10
            goto L_0x00f3
        L_0x00f1:
            r11 = 0
        L_0x00f3:
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            android.util.Pair r9 = android.util.Pair.create(r9, r10)
            aov r10 = r0.b
            java.lang.Object r11 = r9.first
            akh r11 = (defpackage.akh) r11
            r10.a(r11)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r0.e = r9
            r9 = 1
            r0.d = r9
            goto L_0x0122
        L_0x0112:
            r9 = 1
            r10 = 179(0xb3, float:2.51E-43)
            if (r7 != r10) goto L_0x0119
            r12.b = r9
        L_0x0119:
            byte[] r9 = defpackage.aru.a
            byte[] r10 = defpackage.aru.a
            int r10 = r10.length
            r11 = 0
            r12.a(r9, r11, r10)
        L_0x0122:
            asy r9 = r0.f
            if (r9 == 0) goto L_0x018b
            if (r8 > 0) goto L_0x012a
            int r15 = -r8
            goto L_0x0131
        L_0x012a:
            ase r8 = r0.j
            r8.a(r4, r2, r5)
            r15 = 0
        L_0x0131:
            ase r2 = r0.j
            boolean r2 = r2.b(r15)
            if (r2 == 0) goto L_0x0179
            ase r2 = r0.j
            byte[] r8 = r2.b
            int r2 = r2.c
            int r2 = defpackage.bkw.a(r8, r2)
            bky r8 = r0.g
            ase r9 = r0.j
            byte[] r9 = r9.b
            r8.a(r9, r2)
            asy r2 = r0.f
            long r8 = r0.o
            bky r10 = r0.g
            int r11 = r10.b()
            r12 = 9
            if (r11 < r12) goto L_0x0179
            int r11 = r10.j()
            int r12 = r10.j()
            int r14 = r10.d()
            r15 = 434(0x1b2, float:6.08E-43)
            if (r11 != r15) goto L_0x0179
            r11 = 1195456820(0x47413934, float:49465.203)
            if (r12 == r11) goto L_0x0170
            goto L_0x0179
        L_0x0170:
            r11 = 3
            if (r14 != r11) goto L_0x0179
            aov[] r2 = r2.b
            defpackage.buk.b(r8, r10, r2)
        L_0x0179:
            r2 = 178(0xb2, float:2.5E-43)
            if (r7 != r2) goto L_0x018b
            byte[] r8 = r1.a
            int r9 = r5 + 2
            byte r8 = r8[r9]
            r9 = 1
            if (r8 != r9) goto L_0x018b
            ase r8 = r0.j
            r8.a(r2)
        L_0x018b:
            if (r7 != 0) goto L_0x018e
            goto L_0x019e
        L_0x018e:
            r2 = 179(0xb3, float:2.51E-43)
            if (r7 == r2) goto L_0x019e
            r2 = 184(0xb8, float:2.58E-43)
            if (r7 != r2) goto L_0x019c
            r2 = 1
            r0.p = r2
            goto L_0x0203
        L_0x019c:
            goto L_0x0203
        L_0x019e:
            int r2 = r3 - r5
            boolean r5 = r0.l
            if (r5 != 0) goto L_0x01a5
            goto L_0x01c5
        L_0x01a5:
            boolean r5 = r0.q
            if (r5 == 0) goto L_0x01c5
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x01c5
            boolean r11 = r0.p
            long r8 = r0.k
            long r12 = r0.n
            aov r5 = r0.b
            long r14 = r0.o
            long r8 = r8 - r12
            int r9 = (int) r8
            int r12 = r9 - r2
            r16 = 0
            r8 = r5
            r9 = r14
            r13 = r2
            r14 = r16
            r8.a(r9, r11, r12, r13, r14)
        L_0x01c5:
            boolean r5 = r0.l
            if (r5 != 0) goto L_0x01ca
            goto L_0x01ce
        L_0x01ca:
            boolean r8 = r0.q
            if (r8 == 0) goto L_0x01f7
        L_0x01ce:
            long r8 = r0.k
            long r10 = (long) r2
            long r8 = r8 - r10
            r0.n = r8
            long r11 = r0.m
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x01e1
            r10 = r11
            goto L_0x01ec
        L_0x01e1:
            if (r5 == 0) goto L_0x01ea
            long r10 = r0.o
            long r12 = r0.e
            long r10 = r10 + r12
            goto L_0x01ec
        L_0x01ea:
            r10 = 0
        L_0x01ec:
            r0.o = r10
            r2 = 0
            r0.p = r2
            r0.m = r8
            r9 = 1
            r0.l = r9
            goto L_0x01f9
        L_0x01f7:
            r2 = 0
            r9 = 1
        L_0x01f9:
            if (r7 != 0) goto L_0x01fd
            r2 = 1
            goto L_0x01ff
        L_0x01fd:
        L_0x01ff:
            r0.q = r2
        L_0x0203:
            r2 = r6
            goto L_0x001d
        L_0x0206:
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x020f
            aru r1 = r0.i
            r1.a(r4, r2, r3)
        L_0x020f:
            asy r1 = r0.f
            if (r1 == 0) goto L_0x0218
            ase r1 = r0.j
            r1.a(r4, r2, r3)
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arv.a(bky):void");
    }

    public final void a(aok aok, asw asw) {
        aok aok2 = aok;
        asw.a();
        this.a = asw.c();
        this.b = aok2.a(asw.b(), 2);
        asy asy = this.f;
        if (asy != null) {
            for (int i2 = 0; i2 < asy.b.length; i2++) {
                asw.a();
                aov a2 = aok2.a(asw.b(), 3);
                akh akh = (akh) asy.a.get(i2);
                String str = akh.i;
                boolean z = true;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z = false;
                }
                String valueOf = String.valueOf(str);
                bks.a(z, valueOf.length() == 0 ? new String("Invalid closed caption mime type provided: ") : "Invalid closed caption mime type provided: ".concat(valueOf));
                a2.a(akh.a(asw.c(), str, akh.c, akh.A, akh.B, (anq) null, Long.MAX_VALUE, akh.k));
                asy.b[i2] = a2;
            }
        }
    }

    public final void a(long j2, int i2) {
        this.m = j2;
    }

    public final void a() {
        bkw.a(this.h);
        aru aru = this.i;
        aru.b = false;
        aru.c = 0;
        aru.d = 0;
        if (this.f != null) {
            this.j.a();
        }
        this.k = 0;
        this.l = false;
    }
}
