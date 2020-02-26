package defpackage;

/* renamed from: awf  reason: default package */
/* compiled from: PG */
public final class awf implements aws, awr {
    public final aws a;
    public final long b;
    private awr c;
    private awe[] d = new awe[0];
    private long e = 0;

    public awf(aws aws, long j) {
        this.a = aws;
        this.b = j;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.e != -9223372036854775807L;
    }

    public final boolean c(long j) {
        return this.a.c(j);
    }

    public final void d(long j) {
        this.a.d(j);
    }

    public final long a(long j, alb alb) {
        long j2;
        if (j == 0) {
            return 0;
        }
        long a2 = blm.a(alb.c, 0, j);
        long j3 = alb.d;
        long j4 = this.b;
        if (j4 != Long.MIN_VALUE) {
            j2 = j4 - j;
        } else {
            j2 = Long.MAX_VALUE;
        }
        long a3 = blm.a(j3, 0, j2);
        if (!(a2 == alb.c && a3 == alb.d)) {
            alb = new alb(a2, a3);
        }
        return this.a.a(j, alb);
    }

    public final long d() {
        long d2 = this.a.d();
        if (d2 != Long.MIN_VALUE) {
            long j = this.b;
            if (j == Long.MIN_VALUE || d2 < j) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long e() {
        long e2 = this.a.e();
        if (e2 != Long.MIN_VALUE) {
            long j = this.b;
            if (j == Long.MIN_VALUE || e2 < j) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final aye b() {
        return this.a.b();
    }

    public final boolean f() {
        return this.a.f();
    }

    public final void a() {
        this.a.a();
    }

    public final /* bridge */ /* synthetic */ void a(axz axz) {
        aws aws = (aws) axz;
        ((awr) bks.a(this.c)).a((axz) this);
    }

    public final void a(aws aws) {
        ((awr) bks.a(this.c)).a((aws) this);
    }

    public final void a(awr awr, long j) {
        this.c = awr;
        this.a.a(this, j);
    }

    public final long c() {
        if (g()) {
            long j = this.e;
            this.e = -9223372036854775807L;
            long c2 = c();
            return c2 == -9223372036854775807L ? j : c2;
        }
        long c3 = this.a.c();
        if (c3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        bks.b(c3 >= 0);
        long j2 = this.b;
        if (j2 != Long.MIN_VALUE && c3 > j2) {
            z = false;
        }
        bks.b(z);
        return c3;
    }

    public final void g(long j) {
        this.a.g(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0 > r8) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.e = r0
            awe[] r0 = r7.d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 < r1) goto L_0x0034
            aws r0 = r7.a
            long r0 = r0.b(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            long r8 = r7.b
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002f
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            goto L_0x002f
        L_0x002d:
            r3 = 0
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            defpackage.bks.b(r3)
            return r0
        L_0x0034:
            r4 = r0[r3]
            if (r4 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r4.b = r2
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awf.b(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r4 > r7) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bgl[] r14, boolean[] r15, defpackage.axx[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            int r2 = r1.length
            awe[] r3 = new defpackage.awe[r2]
            r0.d = r3
            axx[] r2 = new defpackage.axx[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 < r5) goto L_0x006b
            aws r4 = r0.a
            r5 = r14
            r6 = r15
            r7 = r2
            r8 = r17
            r9 = r18
            long r4 = r4.a(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.e = r6
            r6 = 1
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x003f
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x003d
            long r7 = r0.b
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x003f
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            defpackage.bks.b(r6)
        L_0x0043:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x006a
            r6 = r2[r3]
            if (r6 != 0) goto L_0x004f
            awe[] r6 = r0.d
            r6[r3] = r11
            goto L_0x0061
        L_0x004f:
            awe[] r7 = r0.d
            r8 = r7[r3]
            if (r8 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            axx r8 = r8.a
            if (r8 == r6) goto L_0x0061
        L_0x005a:
            awe r8 = new awe
            r8.<init>(r13, r6)
            r7[r3] = r8
        L_0x0061:
            awe[] r6 = r0.d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0043
        L_0x006a:
            return r4
        L_0x006b:
            awe[] r5 = r0.d
            r6 = r1[r4]
            awe r6 = (defpackage.awe) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x0078
            axx r11 = r6.a
            goto L_0x007a
        L_0x0078:
        L_0x007a:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awf.a(bgl[], boolean[], axx[], boolean[], long):long");
    }
}
