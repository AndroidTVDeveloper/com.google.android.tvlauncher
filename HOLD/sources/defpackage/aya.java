package defpackage;

/* renamed from: aya  reason: default package */
/* compiled from: PG */
public final class aya extends alh {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final Object l;

    public final int a() {
        return 1;
    }

    public final int b() {
        return 1;
    }

    public aya(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj) {
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = obj;
    }

    public aya(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, z3, obj);
    }

    public aya(long j2, boolean z, boolean z2) {
        this(j2, j2, 0, 0, z, false, z2, null);
    }

    public final int a(Object obj) {
        return !b.equals(obj) ? -1 : 0;
    }

    public final alf a(int i2, alf alf, boolean z) {
        Object obj;
        bks.a(i2, 1);
        if (z) {
            obj = b;
        } else {
            obj = null;
        }
        alf.a(null, obj, this.e, -this.g);
        return alf;
    }

    public final Object a(int i2) {
        bks.a(i2, 1);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 > r6) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.alg a(int r24, defpackage.alg r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            defpackage.bks.a(r2, r1)
            long r1 = r0.h
            boolean r3 = r0.j
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x002b
            r6 = 0
            int r3 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x002b
            long r6 = r0.f
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            long r1 = r1 + r26
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x002b
            goto L_0x0028
        L_0x0026:
        L_0x0028:
            r16 = r4
            goto L_0x002d
        L_0x002b:
            r16 = r1
        L_0x002d:
            java.lang.Object r7 = defpackage.alg.a
            java.lang.Object r8 = r0.l
            long r9 = r0.c
            long r11 = r0.d
            boolean r13 = r0.i
            boolean r14 = r0.j
            boolean r15 = r0.k
            long r1 = r0.f
            r18 = r1
            r20 = 0
            long r1 = r0.g
            r21 = r1
            r6 = r25
            r6.a(r7, r8, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aya.a(int, alg, long):alg");
    }
}
