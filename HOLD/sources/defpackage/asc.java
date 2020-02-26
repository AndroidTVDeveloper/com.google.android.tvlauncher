package defpackage;

import android.util.Pair;

/* renamed from: asc  reason: default package */
/* compiled from: PG */
public final class asc implements art {
    private final String a;
    private final bky b = new bky(1024);
    private final bkx c = new bkx(this.b.a);
    private aov d;
    private akh e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public asc(String str) {
        this.a = str;
    }

    public final void b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        if (r0.l == false) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bky r22) {
        /*
            r21 = this;
            r0 = r21
        L_0x0002:
            int r1 = r22.b()
            if (r1 <= 0) goto L_0x0209
            int r1 = r0.g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x01fd
            r4 = 2
            r5 = 0
            if (r1 == r3) goto L_0x01e5
            r2 = 3
            r6 = 8
            if (r1 == r4) goto L_0x01bd
            int r1 = r22.b()
            int r4 = r0.i
            int r7 = r0.h
            int r4 = r4 - r7
            int r1 = java.lang.Math.min(r1, r4)
            bkx r4 = r0.c
            byte[] r4 = r4.a
            int r7 = r0.h
            r8 = r22
            r8.a(r4, r7, r1)
            int r4 = r0.h
            int r4 = r4 + r1
            r0.h = r4
            int r1 = r0.i
            if (r4 != r1) goto L_0x0002
            bkx r1 = r0.c
            r1.a(r5)
            bkx r1 = r0.c
            boolean r4 = r1.e()
            if (r4 != 0) goto L_0x0147
            r0.l = r3
            int r4 = r1.c(r3)
            if (r4 != r3) goto L_0x0053
            int r7 = r1.c(r3)
            goto L_0x0055
        L_0x0053:
            r7 = 0
        L_0x0055:
            r0.m = r7
            if (r7 != 0) goto L_0x0141
            if (r4 != r3) goto L_0x005e
            b(r1)
        L_0x005e:
            boolean r7 = r1.e()
            if (r7 == 0) goto L_0x013b
            r7 = 6
            int r9 = r1.c(r7)
            r0.n = r9
            r9 = 4
            int r10 = r1.c(r9)
            int r11 = r1.c(r2)
            if (r10 != 0) goto L_0x0135
            if (r11 != 0) goto L_0x0135
            if (r4 != 0) goto L_0x00c5
            int r10 = r1.b()
            int r11 = r0.a(r1)
            r1.a(r10)
            int r10 = r11 + 7
            int r10 = r10 / r6
            byte[] r10 = new byte[r10]
            r1.b(r10, r11)
            java.lang.String r12 = r0.f
            r14 = -1
            r15 = -1
            int r11 = r0.t
            int r13 = r0.r
            java.util.List r18 = java.util.Collections.singletonList(r10)
            r19 = 0
            java.lang.String r10 = r0.a
            java.lang.String r16 = "audio/mp4a-latm"
            r17 = r13
            r13 = r16
            r16 = r11
            r20 = r10
            akh r10 = defpackage.akh.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            akh r11 = r0.e
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00d2
            r0.e = r10
            r11 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r13 = r10.w
            long r13 = (long) r13
            long r11 = r11 / r13
            r0.s = r11
            aov r11 = r0.d
            r11.a(r10)
            goto L_0x00d2
        L_0x00c5:
            long r10 = b(r1)
            int r11 = (int) r10
            int r10 = r0.a(r1)
            int r11 = r11 - r10
            r1.b(r11)
        L_0x00d2:
            int r10 = r1.c(r2)
            r0.o = r10
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
            r1.b(r3)
            goto L_0x0103
        L_0x00f4:
            r1.b(r7)
            goto L_0x0103
        L_0x00f9:
            r2 = 9
            r1.b(r2)
            goto L_0x0103
        L_0x00ff:
            r1.b(r6)
        L_0x0103:
            boolean r2 = r1.e()
            r0.p = r2
            r9 = 0
            r0.q = r9
            if (r2 == 0) goto L_0x0129
            if (r4 == r3) goto L_0x0123
        L_0x0111:
            boolean r2 = r1.e()
            long r3 = r0.q
            long r3 = r3 << r6
            int r7 = r1.c(r6)
            long r9 = (long) r7
            long r3 = r3 + r9
            r0.q = r3
            if (r2 != 0) goto L_0x0111
            goto L_0x0129
        L_0x0123:
            long r2 = b(r1)
            r0.q = r2
        L_0x0129:
            boolean r2 = r1.e()
            if (r2 != 0) goto L_0x0130
            goto L_0x014c
        L_0x0130:
            r1.b(r6)
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
            boolean r2 = r0.l
            if (r2 != 0) goto L_0x014c
            goto L_0x01a4
        L_0x014c:
            int r2 = r0.m
            if (r2 != 0) goto L_0x01b7
            int r2 = r0.n
            if (r2 != 0) goto L_0x01b1
            int r2 = r0.o
            if (r2 != 0) goto L_0x01ab
            r2 = 0
        L_0x0159:
            int r3 = r1.c(r6)
            int r13 = r2 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x01a9
            int r2 = r1.b()
            r3 = r2 & 7
            if (r3 != 0) goto L_0x0174
            bky r3 = r0.b
            int r2 = r2 >> 3
            r3.c(r2)
            goto L_0x0182
        L_0x0174:
            bky r2 = r0.b
            byte[] r2 = r2.a
            int r3 = r13 << 3
            r1.b(r2, r3)
            bky r2 = r0.b
            r2.c(r5)
        L_0x0182:
            aov r2 = r0.d
            bky r3 = r0.b
            r2.a(r3, r13)
            aov r9 = r0.d
            long r10 = r0.k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
            long r2 = r0.k
            long r6 = r0.s
            long r2 = r2 + r6
            r0.k = r2
            boolean r2 = r0.p
            if (r2 == 0) goto L_0x01a4
            long r2 = r0.q
            int r3 = (int) r2
            r1.b(r3)
        L_0x01a4:
            r0.g = r5
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
            int r1 = r0.j
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r3 = r22.d()
            r1 = r1 | r3
            r0.i = r1
            bky r3 = r0.b
            byte[] r4 = r3.a
            int r4 = r4.length
            if (r1 <= r4) goto L_0x01de
            r3.a(r1)
            bkx r1 = r0.c
            bky r3 = r0.b
            byte[] r3 = r3.a
            r1.a(r3)
        L_0x01de:
            r0.h = r5
            r0.g = r2
            goto L_0x0002
        L_0x01e5:
            r8 = r22
            int r1 = r22.d()
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x01f7
            r0.j = r1
            r0.g = r4
            goto L_0x0002
        L_0x01f7:
            if (r1 == r2) goto L_0x0002
            r0.g = r5
            goto L_0x0002
        L_0x01fd:
            r8 = r22
            int r1 = r22.d()
            if (r1 != r2) goto L_0x0002
            r0.g = r3
            goto L_0x0002
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asc.a(bky):void");
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.d = aok.a(asw.b(), 1);
        this.f = asw.c();
    }

    private static long b(bkx bkx) {
        return (long) bkx.c((bkx.c(2) + 1) << 3);
    }

    public final void a(long j2, int i2) {
        this.k = j2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkg.a(bkx, boolean):android.util.Pair
     arg types: [bkx, int]
     candidates:
      bkg.a(byte[], int):boolean
      bkg.a(int, int):byte[]
      bkg.a(bkx, boolean):android.util.Pair */
    private final int a(bkx bkx) {
        int a2 = bkx.a();
        Pair a3 = bkg.a(bkx, true);
        this.r = ((Integer) a3.first).intValue();
        this.t = ((Integer) a3.second).intValue();
        return a2 - bkx.a();
    }

    public final void a() {
        this.g = 0;
        this.l = false;
    }
}
