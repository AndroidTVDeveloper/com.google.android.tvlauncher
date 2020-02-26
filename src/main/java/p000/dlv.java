package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: dlv */
/* compiled from: PG */
final class dlv {

    /* renamed from: a */
    public static final boolean f8779a;

    /* renamed from: b */
    public static final boolean f8780b;

    /* renamed from: c */
    public static final boolean f8781c;

    /* renamed from: d */
    private static final Logger f8782d = Logger.getLogger(dlv.class.getName());

    /* renamed from: e */
    private static final Unsafe f8783e = m7027a();

    /* renamed from: f */
    private static final Class f8784f = dhx.f8565a;

    /* renamed from: g */
    private static final boolean f8785g = m7040c(Long.TYPE);

    /* renamed from: h */
    private static final boolean f8786h = m7040c(Integer.TYPE);

    /* renamed from: i */
    private static final dlu f8787i;

    /* renamed from: j */
    private static final long f8788j = ((long) m7036b(byte[].class));

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
            java.lang.Class<dlv> r6 = p000.dlv.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            p000.dlv.f8782d = r6
            sun.misc.Unsafe r6 = m7027a()
            p000.dlv.f8783e = r6
            java.lang.Class r6 = p000.dhx.f8565a
            p000.dlv.f8784f = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = m7040c(r6)
            p000.dlv.f8785g = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = m7040c(r6)
            p000.dlv.f8786h = r6
            sun.misc.Unsafe r6 = p000.dlv.f8783e
            r7 = 0
            if (r6 == 0) goto L_0x005e
            boolean r6 = p000.dhx.m6468a()
            if (r6 != 0) goto L_0x0045
            dlt r7 = new dlt
            sun.misc.Unsafe r6 = p000.dlv.f8783e
            r7.<init>(r6)
            goto L_0x005f
        L_0x0045:
            boolean r6 = p000.dlv.f8785g
            if (r6 == 0) goto L_0x0051
            dls r7 = new dls
            sun.misc.Unsafe r6 = p000.dlv.f8783e
            r7.<init>(r6)
            goto L_0x005f
        L_0x0051:
            boolean r6 = p000.dlv.f8786h
            if (r6 == 0) goto L_0x005d
            dlr r7 = new dlr
            sun.misc.Unsafe r6 = p000.dlv.f8783e
            r7.<init>(r6)
            goto L_0x005f
        L_0x005d:
        L_0x005e:
        L_0x005f:
            p000.dlv.f8787i = r7
            sun.misc.Unsafe r6 = p000.dlv.f8783e
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
            java.lang.reflect.Field r1 = m7038b()     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x015d
            boolean r1 = p000.dhx.m6468a()     // Catch:{ all -> 0x012b }
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
            java.util.logging.Logger r1 = p000.dlv.f8782d
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
            p000.dlv.f8779a = r0
            sun.misc.Unsafe r0 = p000.dlv.f8783e
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
            boolean r1 = p000.dhx.m6468a()     // Catch:{ all -> 0x029a }
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
            java.util.logging.Logger r1 = p000.dlv.f8782d
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
            p000.dlv.f8780b = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m7036b(r0)
            long r0 = (long) r0
            p000.dlv.f8788j = r0
            m7036b(r5)
            m7043d(r5)
            m7036b(r4)
            m7043d(r4)
            m7036b(r20)
            m7043d(r20)
            m7036b(r18)
            m7043d(r18)
            m7036b(r16)
            m7043d(r16)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m7036b(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m7043d(r0)
            java.lang.reflect.Field r0 = m7038b()
            if (r0 != 0) goto L_0x0303
            goto L_0x030a
        L_0x0303:
            dlu r1 = p000.dlv.f8787i
            if (r1 == 0) goto L_0x030a
            r1.mo4661a(r0)
        L_0x030a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0314
            r17 = 1
        L_0x0314:
            p000.dlv.f8781c = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dlv.<clinit>():void");
    }

    private dlv() {
    }

    /* renamed from: a */
    static Object m7025a(Class cls) {
        try {
            return f8783e.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m7036b(Class cls) {
        if (f8780b) {
            return f8787i.mo4657a(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static void m7043d(Class cls) {
        if (f8780b) {
            f8787i.mo4662b(cls);
        }
    }

    /* renamed from: b */
    private static Field m7038b() {
        Field a;
        if (dhx.m6468a() && (a = m7026a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m7026a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: c */
    private static boolean m7040c(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (dhx.m6468a()) {
            try {
                Class cls3 = f8784f;
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

    /* renamed from: a */
    private static Field m7026a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: c */
    static boolean m7041c(Object obj, long j) {
        return f8787i.mo4654b(obj, j);
    }

    /* renamed from: i */
    public static boolean m7048i(Object obj, long j) {
        return m7046g(obj, j) != 0;
    }

    /* renamed from: j */
    public static boolean m7049j(Object obj, long j) {
        return m7047h(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m7023a(byte[] bArr, long j) {
        return f8787i.mo4649a(bArr, f8788j + j);
    }

    /* renamed from: g */
    public static byte m7046g(Object obj, long j) {
        return (byte) (m7024a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: h */
    public static byte m7047h(Object obj, long j) {
        return (byte) (m7024a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: e */
    static double m7044e(Object obj, long j) {
        return f8787i.mo4656d(obj, j);
    }

    /* renamed from: d */
    static float m7042d(Object obj, long j) {
        return f8787i.mo4655c(obj, j);
    }

    /* renamed from: a */
    static int m7024a(Object obj, long j) {
        return f8787i.mo4663e(obj, j);
    }

    /* renamed from: b */
    static long m7037b(Object obj, long j) {
        return f8787i.mo4664f(obj, j);
    }

    /* renamed from: f */
    static Object m7045f(Object obj, long j) {
        return f8787i.mo4665g(obj, j);
    }

    /* renamed from: a */
    static Unsafe m7027a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dlq());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m7034a(Object obj, long j, boolean z) {
        f8787i.mo4653a(obj, j, z);
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
    /* renamed from: a */
    static void m7035a(byte[] bArr, long j, byte b) {
        f8787i.mo4650a((Object) bArr, f8788j + j, b);
    }

    /* renamed from: a */
    public static void m7028a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m7031a(obj, j2, ((b & 255) << i) | (m7024a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: b */
    public static void m7039b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m7031a(obj, j2, ((b & 255) << i) | (m7024a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: a */
    static void m7029a(Object obj, long j, double d) {
        f8787i.mo4651a(obj, j, d);
    }

    /* renamed from: a */
    static void m7030a(Object obj, long j, float f) {
        f8787i.mo4652a(obj, j, f);
    }

    /* renamed from: a */
    static void m7031a(Object obj, long j, int i) {
        f8787i.mo4658a(obj, j, i);
    }

    /* renamed from: a */
    static void m7032a(Object obj, long j, long j2) {
        f8787i.mo4659a(obj, j, j2);
    }

    /* renamed from: a */
    static void m7033a(Object obj, long j, Object obj2) {
        f8787i.mo4660a(obj, j, obj2);
    }
}
