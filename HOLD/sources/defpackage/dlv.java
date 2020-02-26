package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: dlv  reason: default package */
/* compiled from: PG */
final class dlv {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    private static final Logger d = Logger.getLogger(dlv.class.getName());
    private static final Unsafe e = a();
    private static final Class f = dhx.a;
    private static final boolean g = c(Long.TYPE);
    private static final boolean h = c(Integer.TYPE);
    private static final dlu i;
    private static final long j = ((long) b(byte[].class));

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0166 A[SYNTHETIC, Splitter:B:37:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0312  */
    static {
        /*
            java.lang.String r0 = "copyMemory"
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<dlv> r6 = defpackage.dlv.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            defpackage.dlv.d = r6
            sun.misc.Unsafe r6 = a()
            defpackage.dlv.e = r6
            java.lang.Class r6 = defpackage.dhx.a
            defpackage.dlv.f = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = c(r6)
            defpackage.dlv.g = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = c(r6)
            defpackage.dlv.h = r6
            sun.misc.Unsafe r6 = defpackage.dlv.e
            r7 = 0
            if (r6 == 0) goto L_0x005e
            boolean r6 = defpackage.dhx.a()
            if (r6 != 0) goto L_0x0045
            dlt r7 = new dlt
            sun.misc.Unsafe r6 = defpackage.dlv.e
            r7.<init>(r6)
            goto L_0x005f
        L_0x0045:
            boolean r6 = defpackage.dlv.g
            if (r6 == 0) goto L_0x0051
            dls r7 = new dls
            sun.misc.Unsafe r6 = defpackage.dlv.e
            r7.<init>(r6)
            goto L_0x005f
        L_0x0051:
            boolean r6 = defpackage.dlv.h
            if (r6 == 0) goto L_0x005d
            dlr r7 = new dlr
            sun.misc.Unsafe r6 = defpackage.dlv.e
            r7.<init>(r6)
            goto L_0x005f
        L_0x005d:
        L_0x005e:
        L_0x005f:
            defpackage.dlv.i = r7
            sun.misc.Unsafe r6 = defpackage.dlv.e
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putByte"
            java.lang.String r9 = "putInt"
            java.lang.String r10 = "getByte"
            java.lang.String r11 = "getInt"
            java.lang.String r12 = "objectFieldOffset"
            java.lang.String r13 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r14 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r15 = "getLong"
            r16 = r1
            r1 = 1
            r17 = 0
            if (r6 == 0) goto L_0x015b
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x012d }
            r18 = r2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class<java.lang.reflect.Field> r19 = java.lang.reflect.Field.class
            r2[r17] = r19     // Catch:{ all -> 0x012b }
            r6.getMethod(r12, r2)     // Catch:{ all -> 0x012b }
            r2 = 2
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x012b }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x012b }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r19 = 1
            r1[r19] = r2     // Catch:{ all -> 0x012b }
            r6.getMethod(r15, r1)     // Catch:{ all -> 0x012b }
            java.lang.reflect.Field r1 = b()     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x015d
            boolean r1 = defpackage.dhx.a()     // Catch:{ all -> 0x012b }
            if (r1 != 0) goto L_0x0127
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r2[r17] = r1     // Catch:{ all -> 0x012b }
            r6.getMethod(r10, r2)     // Catch:{ all -> 0x012b }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r2[r17] = r1     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x012b }
            r20 = r3
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r8, r2)     // Catch:{ all -> 0x0125 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            r6.getMethod(r11, r1)     // Catch:{ all -> 0x0125 }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r9, r2)     // Catch:{ all -> 0x0125 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            r6.getMethod(r15, r1)     // Catch:{ all -> 0x0125 }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r7, r2)     // Catch:{ all -> 0x0125 }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r0, r2)     // Catch:{ all -> 0x0125 }
            r1 = 5
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            r2 = 4
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r2] = r3     // Catch:{ all -> 0x0125 }
            r6.getMethod(r0, r1)     // Catch:{ all -> 0x0125 }
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            goto L_0x0132
        L_0x0127:
            r20 = r3
        L_0x0129:
            r0 = 1
            goto L_0x0160
        L_0x012b:
            r0 = move-exception
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            r18 = r2
        L_0x0130:
            r20 = r3
        L_0x0132:
            java.util.logging.Logger r1 = defpackage.dlv.d
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 71
            r6.<init>(r3)
            r6.append(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeByteBufferOperations"
            r1.logp(r2, r13, r3, r0)
            r0 = 0
            goto L_0x0160
        L_0x015b:
            r18 = r2
        L_0x015d:
            r20 = r3
            r0 = 0
        L_0x0160:
            defpackage.dlv.a = r0
            sun.misc.Unsafe r0 = defpackage.dlv.e
            if (r0 == 0) goto L_0x02c6
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r12, r2)     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "arrayBaseOffset"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "arrayIndexScale"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r11, r2)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r9, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            r0.getMethod(r15, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r7, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getObject"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putObject"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            boolean r1 = defpackage.dhx.a()     // Catch:{ all -> 0x029a }
            if (r1 != 0) goto L_0x0296
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r10, r2)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r8, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getBoolean"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putBoolean"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getFloat"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putFloat"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getDouble"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r19 = 1
            r1[r19] = r2     // Catch:{ all -> 0x0294 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0294 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0294 }
            java.lang.String r2 = "putDouble"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x0294 }
            goto L_0x0298
        L_0x0294:
            r0 = move-exception
            goto L_0x029d
        L_0x0296:
            r19 = 1
        L_0x0298:
            r0 = 1
            goto L_0x02c9
        L_0x029a:
            r0 = move-exception
            r19 = 1
        L_0x029d:
            java.util.logging.Logger r1 = defpackage.dlv.d
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 71
            r6.<init>(r3)
            r6.append(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r13, r3, r0)
            r0 = 0
            goto L_0x02c9
        L_0x02c6:
            r19 = 1
            r0 = 0
        L_0x02c9:
            defpackage.dlv.b = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r0 = (long) r0
            defpackage.dlv.j = r0
            b(r5)
            d(r5)
            b(r4)
            d(r4)
            b(r20)
            d(r20)
            b(r18)
            d(r18)
            b(r16)
            d(r16)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            d(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 != 0) goto L_0x0303
            goto L_0x030a
        L_0x0303:
            dlu r1 = defpackage.dlv.i
            if (r1 == 0) goto L_0x030a
            r1.a(r0)
        L_0x030a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0314
            r17 = 1
        L_0x0314:
            defpackage.dlv.c = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlv.<clinit>():void");
    }

    private dlv() {
    }

    static Object a(Class cls) {
        try {
            return e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int b(Class cls) {
        if (b) {
            return i.a(cls);
        }
        return -1;
    }

    private static void d(Class cls) {
        if (b) {
            i.b(cls);
        }
    }

    private static Field b() {
        Field a2;
        if (dhx.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    private static boolean c(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (dhx.a()) {
            try {
                Class cls3 = f;
                cls3.getMethod("peekLong", cls, Boolean.TYPE);
                cls3.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls3.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls3.getMethod("peekInt", cls, Boolean.TYPE);
                cls3.getMethod("pokeByte", cls, Byte.TYPE);
                cls3.getMethod("peekByte", cls);
                cls3.getMethod("pokeByteArray", cls, cls2, Integer.TYPE, Integer.TYPE);
                cls3.getMethod("peekByteArray", cls, cls2, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean c(Object obj, long j2) {
        return i.b(obj, j2);
    }

    public static boolean i(Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    public static boolean j(Object obj, long j2) {
        return h(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return i.a(bArr, j + j2);
    }

    public static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    public static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static double e(Object obj, long j2) {
        return i.d(obj, j2);
    }

    static float d(Object obj, long j2) {
        return i.c(obj, j2);
    }

    static int a(Object obj, long j2) {
        return i.e(obj, j2);
    }

    static long b(Object obj, long j2) {
        return i.f(obj, j2);
    }

    static Object f(Object obj, long j2) {
        return i.g(obj, j2);
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dlq());
        } catch (Throwable th) {
            return null;
        }
    }

    static void a(Object obj, long j2, boolean z) {
        i.a(obj, j2, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dlu.a(java.lang.Object, long, byte):void
     arg types: [byte[], long, byte]
     candidates:
      dlu.a(java.lang.Object, long, double):void
      dlu.a(java.lang.Object, long, float):void
      dlu.a(java.lang.Object, long, int):void
      dlu.a(java.lang.Object, long, long):void
      dlu.a(java.lang.Object, long, java.lang.Object):void
      dlu.a(java.lang.Object, long, boolean):void
      dlu.a(java.lang.Object, long, byte):void */
    static void a(byte[] bArr, long j2, byte b2) {
        i.a((Object) bArr, j + j2, b2);
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j3, ((b2 & 255) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((b2 & 255) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static void a(Object obj, long j2, double d2) {
        i.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        i.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        i.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        i.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        i.a(obj, j2, obj2);
    }
}
