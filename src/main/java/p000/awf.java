package p000;

/* renamed from: awf */
/* compiled from: PG */
public final class awf implements aws, awr {

    /* renamed from: a */
    public final aws f2545a;

    /* renamed from: b */
    public final long f2546b;

    /* renamed from: c */
    private awr f2547c;

    /* renamed from: d */
    private awe[] f2548d = new awe[0];

    /* renamed from: e */
    private long f2549e = 0;

    public awf(aws aws, long j) {
        this.f2545a = aws;
        this.f2546b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo1493g() {
        return this.f2549e != -9223372036854775807L;
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        return this.f2545a.mo1487c(j);
    }

    /* renamed from: d */
    public final void mo1489d(long j) {
        this.f2545a.mo1489d(j);
    }

    /* renamed from: a */
    public final long mo1480a(long j, alb alb) {
        long j2;
        if (j == 0) {
            return 0;
        }
        long a = blm.m3632a(alb.f641c, 0, j);
        long j3 = alb.f642d;
        long j4 = this.f2546b;
        if (j4 != Long.MIN_VALUE) {
            j2 = j4 - j;
        } else {
            j2 = Long.MAX_VALUE;
        }
        long a2 = blm.m3632a(j3, 0, j2);
        if (!(a == alb.f641c && a2 == alb.f642d)) {
            alb = new alb(a, a2);
        }
        return this.f2545a.mo1480a(j, alb);
    }

    /* renamed from: d */
    public final long mo1488d() {
        long d = this.f2545a.mo1488d();
        if (d != Long.MIN_VALUE) {
            long j = this.f2546b;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public final long mo1490e() {
        long e = this.f2545a.mo1490e();
        if (e != Long.MIN_VALUE) {
            long j = this.f2546b;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final aye mo1485b() {
        return this.f2545a.mo1485b();
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f2545a.mo1491f();
    }

    /* renamed from: a */
    public final void mo1482a() {
        this.f2545a.mo1482a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo414a(axz axz) {
        aws aws = (aws) axz;
        ((awr) bks.m3507a(this.f2547c)).mo414a((axz) this);
    }

    /* renamed from: a */
    public final void mo412a(aws aws) {
        ((awr) bks.m3507a(this.f2547c)).mo412a((aws) this);
    }

    /* renamed from: a */
    public final void mo1483a(awr awr, long j) {
        this.f2547c = awr;
        this.f2545a.mo1483a(this, j);
    }

    /* renamed from: c */
    public final long mo1486c() {
        if (mo1493g()) {
            long j = this.f2549e;
            this.f2549e = -9223372036854775807L;
            long c = mo1486c();
            return c == -9223372036854775807L ? j : c;
        }
        long c2 = this.f2545a.mo1486c();
        if (c2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        bks.m3512b(c2 >= 0);
        long j2 = this.f2546b;
        if (j2 != Long.MIN_VALUE && c2 > j2) {
            z = false;
        }
        bks.m3512b(z);
        return c2;
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
        this.f2545a.mo1492g(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0 > r8) goto L_0x002d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo1484b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f2549e = r0
            awe[] r0 = r7.f2548d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 < r1) goto L_0x0034
            aws r0 = r7.f2545a
            long r0 = r0.mo1484b(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            long r8 = r7.f2546b
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
            p000.bks.m3512b(r3)
            return r0
        L_0x0034:
            r4 = r0[r3]
            if (r4 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r4.f2543b = r2
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.awf.mo1484b(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r4 > r7) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo1481a(p000.bgl[] r14, boolean[] r15, p000.axx[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            int r2 = r1.length
            awe[] r3 = new p000.awe[r2]
            r0.f2548d = r3
            axx[] r2 = new p000.axx[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 < r5) goto L_0x006b
            aws r4 = r0.f2545a
            r5 = r14
            r6 = r15
            r7 = r2
            r8 = r17
            r9 = r18
            long r4 = r4.mo1481a(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f2549e = r6
            r6 = 1
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x003f
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x003d
            long r7 = r0.f2546b
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
            p000.bks.m3512b(r6)
        L_0x0043:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x006a
            r6 = r2[r3]
            if (r6 != 0) goto L_0x004f
            awe[] r6 = r0.f2548d
            r6[r3] = r11
            goto L_0x0061
        L_0x004f:
            awe[] r7 = r0.f2548d
            r8 = r7[r3]
            if (r8 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            axx r8 = r8.f2542a
            if (r8 == r6) goto L_0x0061
        L_0x005a:
            awe r8 = new awe
            r8.<init>(r13, r6)
            r7[r3] = r8
        L_0x0061:
            awe[] r6 = r0.f2548d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0043
        L_0x006a:
            return r4
        L_0x006b:
            awe[] r5 = r0.f2548d
            r6 = r1[r4]
            awe r6 = (p000.awe) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x0078
            axx r11 = r6.f2542a
            goto L_0x007a
        L_0x0078:
        L_0x007a:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.awf.mo1481a(bgl[], boolean[], axx[], boolean[], long):long");
    }
}
