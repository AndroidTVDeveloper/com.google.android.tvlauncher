package defpackage;

/* renamed from: dhr  reason: default package */
/* compiled from: PG */
public final class dhr {
    public static final dhl a;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0017 }
            r0 = r1
            goto L_0x0026
        L_0x0015:
            r1 = move-exception
            goto L_0x0050
        L_0x0017:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0015 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0015 }
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            int r1 = r0.intValue()     // Catch:{ all -> 0x004d }
            r2 = 19
            if (r1 < r2) goto L_0x0037
            dhq r1 = new dhq     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0037:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x004d }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0047
            dho r1 = new dho     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
        L_0x0046:
            goto L_0x0086
        L_0x0047:
            dhp r1 = new dhp     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x004d:
            r1 = move-exception
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<dhp> r3 = defpackage.dhp.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            dhp r1 = new dhp
            r1.<init>()
        L_0x0086:
            defpackage.dhr.a = r1
            if (r0 == 0) goto L_0x008d
            r0.intValue()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhr.<clinit>():void");
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th) {
        a.a(th);
    }
}
