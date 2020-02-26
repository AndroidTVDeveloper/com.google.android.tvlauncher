package defpackage;

/* renamed from: aoy  reason: default package */
/* compiled from: PG */
public final class aoy implements aoi {
    private final bky a = new bky(4);
    private final bky b = new bky(9);
    private final bky c = new bky(11);
    private final bky d = new bky();
    private final aoz e = new aoz();
    private aok f;
    private int g = 1;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private aox o;
    private apc p;

    private final void a() {
        if (!this.n) {
            this.f.a(new aor(-9223372036854775807L));
            this.n = true;
        }
    }

    public final void a(aok aok) {
        this.f = aok;
    }

    private final bky b(aoj aoj) {
        if (this.l > this.d.c()) {
            bky bky = this.d;
            int c2 = bky.c();
            bky.a(new byte[Math.max(c2 + c2, this.l)], 0);
        } else {
            this.d.c(0);
        }
        this.d.b(this.l);
        aoj.b(this.d.a, 0, this.l);
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.aoj r17, defpackage.aop r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L_0x0004:
            int r2 = r0.g
            r3 = 8
            r4 = -1
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0110
            r10 = 3
            if (r2 == r6) goto L_0x0105
            if (r2 == r10) goto L_0x00bf
            if (r2 != r7) goto L_0x00b9
            boolean r2 = r0.h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0027
            long r14 = r0.i
            long r10 = r0.m
            long r10 = r10 + r14
            goto L_0x0035
        L_0x0027:
            aoz r2 = r0.e
            long r10 = r2.a
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            long r10 = r0.m
            goto L_0x0035
        L_0x0033:
            r10 = 0
        L_0x0035:
            int r2 = r0.k
            if (r2 != r3) goto L_0x004d
            aox r3 = r0.o
            if (r3 != 0) goto L_0x003e
            goto L_0x004d
        L_0x003e:
            r16.a()
            aox r2 = r0.o
            bky r3 = r16.b(r17)
            boolean r2 = r2.b(r3, r10)
        L_0x004b:
            r3 = 1
            goto L_0x0097
        L_0x004d:
            if (r2 != r5) goto L_0x0064
            apc r3 = r0.p
            if (r3 != 0) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r16.a()
            apc r2 = r0.p
            bky r3 = r16.b(r17)
            boolean r2 = r2.b(r3, r10)
            r3 = 1
            goto L_0x0097
        L_0x0064:
            r3 = 18
            if (r2 == r3) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            boolean r2 = r0.n
            if (r2 != 0) goto L_0x0090
            aoz r2 = r0.e
            bky r3 = r16.b(r17)
            boolean r2 = r2.b(r3, r10)
            aoz r3 = r0.e
            long r3 = r3.a
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            aok r5 = r0.f
            aor r10 = new aor
            r10.<init>(r3)
            r5.a(r10)
            r0.n = r9
            r3 = 1
            goto L_0x0097
        L_0x008e:
            goto L_0x004b
        L_0x0090:
            int r2 = r0.l
            r1.a(r2)
            r2 = 0
            r3 = 0
        L_0x0097:
            boolean r4 = r0.h
            if (r4 != 0) goto L_0x00b1
            if (r2 == 0) goto L_0x00b1
            r0.h = r9
            aoz r2 = r0.e
            long r4 = r2.a
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00ac
            long r4 = r0.m
            long r10 = -r4
            goto L_0x00af
        L_0x00ac:
            r10 = 0
        L_0x00af:
            r0.i = r10
        L_0x00b1:
            r0.j = r7
            r0.g = r6
            if (r3 == 0) goto L_0x0004
            return r8
        L_0x00b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00bf:
            bky r2 = r0.c
            byte[] r2 = r2.a
            r3 = 11
            boolean r2 = r1.a(r2, r8, r3, r9)
            if (r2 == 0) goto L_0x0104
            bky r2 = r0.c
            r2.c(r8)
            bky r2 = r0.c
            int r2 = r2.d()
            r0.k = r2
            bky r2 = r0.c
            int r2 = r2.g()
            r0.l = r2
            bky r2 = r0.c
            int r2 = r2.g()
            long r2 = (long) r2
            r0.m = r2
            bky r2 = r0.c
            int r2 = r2.d()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.m = r2
            bky r2 = r0.c
            r2.d(r10)
            r0.g = r7
            goto L_0x0004
        L_0x0104:
            return r4
        L_0x0105:
            int r2 = r0.j
            r1.a(r2)
            r0.j = r8
            r0.g = r10
            goto L_0x0004
        L_0x0110:
            bky r2 = r0.b
            byte[] r2 = r2.a
            boolean r2 = r1.a(r2, r8, r5, r9)
            if (r2 == 0) goto L_0x0167
            bky r2 = r0.b
            r2.c(r8)
            bky r2 = r0.b
            r2.d(r7)
            bky r2 = r0.b
            int r2 = r2.d()
            r4 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0140
            aox r2 = r0.o
            if (r2 != 0) goto L_0x0140
            aox r2 = new aox
            aok r7 = r0.f
            aov r3 = r7.a(r3, r9)
            r2.<init>(r3)
            r0.o = r2
        L_0x0140:
            if (r4 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            apc r2 = r0.p
            if (r2 != 0) goto L_0x0154
            apc r2 = new apc
            aok r3 = r0.f
            aov r3 = r3.a(r5, r6)
            r2.<init>(r3)
            r0.p = r2
        L_0x0154:
            aok r2 = r0.f
            r2.S()
            bky r2 = r0.b
            int r2 = r2.j()
            int r2 = r2 + -5
            r0.j = r2
            r0.g = r6
            goto L_0x0004
        L_0x0167:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoy.a(aoj, aop):int");
    }

    public final void a(long j2, long j3) {
        this.g = 1;
        this.h = false;
        this.j = 0;
    }

    public final boolean a(aoj aoj) {
        aoj.c(this.a.a, 0, 3);
        this.a.c(0);
        if (this.a.g() == 4607062) {
            aoj.c(this.a.a, 0, 2);
            this.a.c(0);
            if ((this.a.e() & 250) == 0) {
                aoj.c(this.a.a, 0, 4);
                this.a.c(0);
                int j2 = this.a.j();
                aoj.a();
                aoj.b(j2);
                aoj.c(this.a.a, 0, 4);
                this.a.c(0);
                if (this.a.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
