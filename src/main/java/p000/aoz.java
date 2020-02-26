package p000;

import java.util.HashMap;

/* renamed from: aoz */
/* compiled from: PG */
final class aoz extends apb {

    /* renamed from: a */
    public long f1563a = -9223372036854775807L;

    public aoz() {
        super(new aoh());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1224a(bky bky) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1225a(bky bky, long j) {
        if (bky.mo2074d() == 2) {
            if ("onMetaData".equals(m1703c(bky)) && bky.mo2074d() == 8) {
                HashMap d = m1704d(bky);
                if (d.containsKey("duration")) {
                    double doubleValue = ((Double) d.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.f1563a = (long) (doubleValue * 1000000.0d);
                    }
                }
            }
            return false;
        }
        throw new ako();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m1701a(p000.bky r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007b
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006f
            r1 = 2
            if (r5 == r1) goto L_0x006a
            r2 = 3
            if (r5 == r2) goto L_0x004e
            r2 = 8
            if (r5 == r2) goto L_0x0049
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m1702b(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo2075d(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo2087n()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0048
            int r2 = r4.mo2074d()
            java.lang.Object r2 = m1701a(r4, r2)
            if (r2 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r1.add(r2)
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0048:
            return r1
        L_0x0049:
            java.util.HashMap r4 = m1704d(r4)
            return r4
        L_0x004e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0053:
            java.lang.String r0 = m1703c(r4)
            int r1 = r4.mo2074d()
            r2 = 9
            if (r1 == r2) goto L_0x0069
            java.lang.Object r1 = m1701a(r4, r1)
            if (r1 == 0) goto L_0x0053
            r5.put(r0, r1)
            goto L_0x0053
        L_0x0069:
            return r5
        L_0x006a:
            java.lang.String r4 = m1703c(r4)
            return r4
        L_0x006f:
            int r4 = r4.mo2074d()
            if (r4 != r1) goto L_0x0076
            r0 = 1
        L_0x0076:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007b:
            java.lang.Double r4 = m1702b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aoz.m1701a(bky, int):java.lang.Object");
    }

    /* renamed from: b */
    private static Double m1702b(bky bky) {
        return Double.valueOf(Double.longBitsToDouble(bky.mo2085l()));
    }

    /* renamed from: d */
    private static HashMap m1704d(bky bky) {
        int n = bky.mo2087n();
        HashMap hashMap = new HashMap(n);
        for (int i = 0; i < n; i++) {
            String c = m1703c(bky);
            Object a = m1701a(bky, bky.mo2074d());
            if (a != null) {
                hashMap.put(c, a);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static String m1703c(bky bky) {
        int e = bky.mo2076e();
        int i = bky.f4259b;
        bky.mo2075d(e);
        return new String(bky.f4258a, i, e);
    }
}
