package defpackage;

import java.util.HashMap;

/* renamed from: aoz  reason: default package */
/* compiled from: PG */
final class aoz extends apb {
    public long a = -9223372036854775807L;

    public aoz() {
        super(new aoh());
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky, long j) {
        if (bky.d() == 2) {
            if ("onMetaData".equals(c(bky)) && bky.d() == 8) {
                HashMap d = d(bky);
                if (d.containsKey("duration")) {
                    double doubleValue = ((Double) d.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.a = (long) (doubleValue * 1000000.0d);
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(defpackage.bky r4, int r5) {
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
            java.lang.Double r0 = b(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.d(r1)
            return r5
        L_0x002c:
            int r5 = r4.n()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0048
            int r2 = r4.d()
            java.lang.Object r2 = a(r4, r2)
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
            java.util.HashMap r4 = d(r4)
            return r4
        L_0x004e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0053:
            java.lang.String r0 = c(r4)
            int r1 = r4.d()
            r2 = 9
            if (r1 == r2) goto L_0x0069
            java.lang.Object r1 = a(r4, r1)
            if (r1 == 0) goto L_0x0053
            r5.put(r0, r1)
            goto L_0x0053
        L_0x0069:
            return r5
        L_0x006a:
            java.lang.String r4 = c(r4)
            return r4
        L_0x006f:
            int r4 = r4.d()
            if (r4 != r1) goto L_0x0076
            r0 = 1
        L_0x0076:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007b:
            java.lang.Double r4 = b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoz.a(bky, int):java.lang.Object");
    }

    private static Double b(bky bky) {
        return Double.valueOf(Double.longBitsToDouble(bky.l()));
    }

    private static HashMap d(bky bky) {
        int n = bky.n();
        HashMap hashMap = new HashMap(n);
        for (int i = 0; i < n; i++) {
            String c = c(bky);
            Object a2 = a(bky, bky.d());
            if (a2 != null) {
                hashMap.put(c, a2);
            }
        }
        return hashMap;
    }

    private static String c(bky bky) {
        int e = bky.e();
        int i = bky.b;
        bky.d(e);
        return new String(bky.a, i, e);
    }
}
