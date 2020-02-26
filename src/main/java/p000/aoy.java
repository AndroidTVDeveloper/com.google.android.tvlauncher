package p000;

/* renamed from: aoy */
/* compiled from: PG */
public final class aoy implements aoi {

    /* renamed from: a */
    private final bky f1547a = new bky(4);

    /* renamed from: b */
    private final bky f1548b = new bky(9);

    /* renamed from: c */
    private final bky f1549c = new bky(11);

    /* renamed from: d */
    private final bky f1550d = new bky();

    /* renamed from: e */
    private final aoz f1551e = new aoz();

    /* renamed from: f */
    private aok f1552f;

    /* renamed from: g */
    private int f1553g = 1;

    /* renamed from: h */
    private boolean f1554h;

    /* renamed from: i */
    private long f1555i;

    /* renamed from: j */
    private int f1556j;

    /* renamed from: k */
    private int f1557k;

    /* renamed from: l */
    private int f1558l;

    /* renamed from: m */
    private long f1559m;

    /* renamed from: n */
    private boolean f1560n;

    /* renamed from: o */
    private aox f1561o;

    /* renamed from: p */
    private apc f1562p;

    /* renamed from: a */
    private final void m1695a() {
        if (!this.f1560n) {
            this.f1552f.mo1212a(new aor(-9223372036854775807L));
            this.f1560n = true;
        }
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1552f = aok;
    }

    /* renamed from: b */
    private final bky m1696b(aoj aoj) {
        if (this.f1558l > this.f1550d.mo2072c()) {
            bky bky = this.f1550d;
            int c = bky.mo2072c();
            bky.mo2068a(new byte[Math.max(c + c, this.f1558l)], 0);
        } else {
            this.f1550d.mo2073c(0);
        }
        this.f1550d.mo2071b(this.f1558l);
        aoj.mo1196b(this.f1550d.f4258a, 0, this.f1558l);
        return this.f1550d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1206a(p000.aoj r17, p000.aop r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L_0x0004:
            int r2 = r0.f1553g
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
            boolean r2 = r0.f1554h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0027
            long r14 = r0.f1555i
            long r10 = r0.f1559m
            long r10 = r10 + r14
            goto L_0x0035
        L_0x0027:
            aoz r2 = r0.f1551e
            long r10 = r2.f1563a
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            long r10 = r0.f1559m
            goto L_0x0035
        L_0x0033:
            r10 = 0
        L_0x0035:
            int r2 = r0.f1557k
            if (r2 != r3) goto L_0x004d
            aox r3 = r0.f1561o
            if (r3 != 0) goto L_0x003e
            goto L_0x004d
        L_0x003e:
            r16.m1695a()
            aox r2 = r0.f1561o
            bky r3 = r16.m1696b(r17)
            boolean r2 = r2.mo1227b(r3, r10)
        L_0x004b:
            r3 = 1
            goto L_0x0097
        L_0x004d:
            if (r2 != r5) goto L_0x0064
            apc r3 = r0.f1562p
            if (r3 != 0) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r16.m1695a()
            apc r2 = r0.f1562p
            bky r3 = r16.m1696b(r17)
            boolean r2 = r2.mo1227b(r3, r10)
            r3 = 1
            goto L_0x0097
        L_0x0064:
            r3 = 18
            if (r2 == r3) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            boolean r2 = r0.f1560n
            if (r2 != 0) goto L_0x0090
            aoz r2 = r0.f1551e
            bky r3 = r16.m1696b(r17)
            boolean r2 = r2.mo1227b(r3, r10)
            aoz r3 = r0.f1551e
            long r3 = r3.f1563a
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            aok r5 = r0.f1552f
            aor r10 = new aor
            r10.<init>(r3)
            r5.mo1212a(r10)
            r0.f1560n = r9
            r3 = 1
            goto L_0x0097
        L_0x008e:
            goto L_0x004b
        L_0x0090:
            int r2 = r0.f1558l
            r1.mo1192a(r2)
            r2 = 0
            r3 = 0
        L_0x0097:
            boolean r4 = r0.f1554h
            if (r4 != 0) goto L_0x00b1
            if (r2 == 0) goto L_0x00b1
            r0.f1554h = r9
            aoz r2 = r0.f1551e
            long r4 = r2.f1563a
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00ac
            long r4 = r0.f1559m
            long r10 = -r4
            goto L_0x00af
        L_0x00ac:
            r10 = 0
        L_0x00af:
            r0.f1555i = r10
        L_0x00b1:
            r0.f1556j = r7
            r0.f1553g = r6
            if (r3 == 0) goto L_0x0004
            return r8
        L_0x00b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00bf:
            bky r2 = r0.f1549c
            byte[] r2 = r2.f4258a
            r3 = 11
            boolean r2 = r1.mo1193a(r2, r8, r3, r9)
            if (r2 == 0) goto L_0x0104
            bky r2 = r0.f1549c
            r2.mo2073c(r8)
            bky r2 = r0.f1549c
            int r2 = r2.mo2074d()
            r0.f1557k = r2
            bky r2 = r0.f1549c
            int r2 = r2.mo2080g()
            r0.f1558l = r2
            bky r2 = r0.f1549c
            int r2 = r2.mo2080g()
            long r2 = (long) r2
            r0.f1559m = r2
            bky r2 = r0.f1549c
            int r2 = r2.mo2074d()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f1559m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f1559m = r2
            bky r2 = r0.f1549c
            r2.mo2075d(r10)
            r0.f1553g = r7
            goto L_0x0004
        L_0x0104:
            return r4
        L_0x0105:
            int r2 = r0.f1556j
            r1.mo1192a(r2)
            r0.f1556j = r8
            r0.f1553g = r10
            goto L_0x0004
        L_0x0110:
            bky r2 = r0.f1548b
            byte[] r2 = r2.f4258a
            boolean r2 = r1.mo1193a(r2, r8, r5, r9)
            if (r2 == 0) goto L_0x0167
            bky r2 = r0.f1548b
            r2.mo2073c(r8)
            bky r2 = r0.f1548b
            r2.mo2075d(r7)
            bky r2 = r0.f1548b
            int r2 = r2.mo2074d()
            r4 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0140
            aox r2 = r0.f1561o
            if (r2 != 0) goto L_0x0140
            aox r2 = new aox
            aok r7 = r0.f1552f
            aov r3 = r7.mo1211a(r3, r9)
            r2.<init>(r3)
            r0.f1561o = r2
        L_0x0140:
            if (r4 != 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            apc r2 = r0.f1562p
            if (r2 != 0) goto L_0x0154
            apc r2 = new apc
            aok r3 = r0.f1552f
            aov r3 = r3.mo1211a(r5, r6)
            r2.<init>(r3)
            r0.f1562p = r2
        L_0x0154:
            aok r2 = r0.f1552f
            r2.mo1210S()
            bky r2 = r0.f1548b
            int r2 = r2.mo2083j()
            int r2 = r2 + -5
            r0.f1556j = r2
            r0.f1553g = r6
            goto L_0x0004
        L_0x0167:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aoy.mo1206a(aoj, aop):int");
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1553g = 1;
        this.f1554h = false;
        this.f1556j = 0;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        aoj.mo1199c(this.f1547a.f4258a, 0, 3);
        this.f1547a.mo2073c(0);
        if (this.f1547a.mo2080g() == 4607062) {
            aoj.mo1199c(this.f1547a.f4258a, 0, 2);
            this.f1547a.mo2073c(0);
            if ((this.f1547a.mo2076e() & 250) == 0) {
                aoj.mo1199c(this.f1547a.f4258a, 0, 4);
                this.f1547a.mo2073c(0);
                int j = this.f1547a.mo2083j();
                aoj.mo1191a();
                aoj.mo1195b(j);
                aoj.mo1199c(this.f1547a.f4258a, 0, 4);
                this.f1547a.mo2073c(0);
                if (this.f1547a.mo2083j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
