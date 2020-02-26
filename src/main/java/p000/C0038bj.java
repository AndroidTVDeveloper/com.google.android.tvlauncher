package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: bj */
/* compiled from: PG */
public class C0038bj extends C0037bi {

    /* renamed from: a */
    public final Class f4097a;

    /* renamed from: b */
    public final Method f4098b;

    /* renamed from: c */
    private final Constructor f4099c;

    /* renamed from: d */
    private final Method f4100d;

    /* renamed from: e */
    private final Method f4101e;

    /* renamed from: f */
    private final Method f4102f;

    /* renamed from: g */
    private final Method f4103g;

    public C0038bj() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo1994a((Class) cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4097a = cls;
        this.f4099c = constructor;
        this.f4100d = method3;
        this.f4101e = method2;
        this.f4102f = method;
        this.f4103g = method4;
        this.f4098b = method5;
    }

    /* renamed from: c */
    private final void m3376c(Object obj) {
        try {
            this.f4103g.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }

    /* renamed from: a */
    private final boolean m3373a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4100d.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1993a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4097a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4098b.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final Typeface mo1962a(Context context, C0024aw awVar, Resources resources, int i) {
        if (!m3372a()) {
            return super.mo1962a(context, awVar, resources, i);
        }
        Object b = m3374b();
        if (b != null) {
            C0025ax[] axVarArr = awVar.f2534a;
            int length = axVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0025ax axVar = axVarArr[i2];
                String str = axVar.f2583a;
                int i3 = axVar.f2587e;
                int i4 = axVar.f2584b;
                boolean z = axVar.f2585c;
                if (m3373a(context, b, str, i3, i4, z ? 1 : 0, FontVariationAxis.fromFontVariationSettings(axVar.f2586d))) {
                    i2++;
                } else {
                    m3376c(b);
                    return null;
                }
            }
            if (m3375b(b)) {
                return mo1993a(b);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        throw r15;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo1963a(android.content.Context r13, p000.C0057cb[] r14, int r15) {
        /*
            r12 = this;
            int r0 = r14.length
            r1 = 0
            if (r0 <= 0) goto L_0x00b7
            boolean r2 = r12.m3372a()
            if (r2 != 0) goto L_0x0048
            cb r14 = r12.mo2102a(r14, r15)
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r15 = r14.f5168a     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r13 = r13.openFileDescriptor(r15, r0, r1)     // Catch:{ IOException -> 0x0046 }
            if (r13 == 0) goto L_0x0045
            android.graphics.Typeface$Builder r15 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0039 }
            java.io.FileDescriptor r0 = r13.getFileDescriptor()     // Catch:{ all -> 0x0039 }
            r15.<init>(r0)     // Catch:{ all -> 0x0039 }
            int r0 = r14.f5170c     // Catch:{ all -> 0x0039 }
            android.graphics.Typeface$Builder r15 = r15.setWeight(r0)     // Catch:{ all -> 0x0039 }
            boolean r14 = r14.f5171d     // Catch:{ all -> 0x0039 }
            android.graphics.Typeface$Builder r14 = r15.setItalic(r14)     // Catch:{ all -> 0x0039 }
            android.graphics.Typeface r14 = r14.build()     // Catch:{ all -> 0x0039 }
            r13.close()     // Catch:{ IOException -> 0x0046 }
            return r14
        L_0x0039:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x003b }
        L_0x003b:
            r15 = move-exception
            r13.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r13 = move-exception
            p000.dhr.m6455a(r14, r13)     // Catch:{ IOException -> 0x0046 }
        L_0x0044:
            throw r15     // Catch:{ IOException -> 0x0046 }
        L_0x0045:
            return r1
        L_0x0046:
            r13 = move-exception
            return r1
        L_0x0048:
            java.util.Map r13 = p000.C0059cd.m4557a(r13, r14)
            java.lang.Object r2 = r12.m3374b()
            if (r2 == 0) goto L_0x00b7
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0055:
            if (r4 >= r0) goto L_0x00a0
            r6 = r14[r4]
            android.net.Uri r7 = r6.f5168a
            java.lang.Object r7 = r13.get(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            r8 = 1
            if (r7 == 0) goto L_0x009d
            int r5 = r6.f5169b
            int r9 = r6.f5170c
            boolean r6 = r6.f5171d
            java.lang.reflect.Method r10 = r12.f4101e     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r11[r3] = r7     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r11[r8] = r5     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r5 = 2
            r11[r5] = r1     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r11[r5] = r7     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            r11[r5] = r6     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            java.lang.Object r5 = r10.invoke(r2, r11)     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            boolean r5 = r5.booleanValue()     // Catch:{ IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0096 }
            if (r5 == 0) goto L_0x0099
            r5 = 1
            goto L_0x009d
        L_0x0096:
            r13 = move-exception
            goto L_0x0099
        L_0x0098:
            r13 = move-exception
        L_0x0099:
            r12.m3376c(r2)
            return r1
        L_0x009d:
            int r4 = r4 + 1
            goto L_0x0055
        L_0x00a0:
            if (r5 == 0) goto L_0x00b4
            boolean r13 = r12.m3375b(r2)
            if (r13 == 0) goto L_0x00b3
            android.graphics.Typeface r13 = r12.mo1993a(r2)
            if (r13 == 0) goto L_0x00b3
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r15)
            return r13
        L_0x00b3:
            return r1
        L_0x00b4:
            r12.m3376c(r2)
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0038bj.mo1963a(android.content.Context, cb[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public final Typeface mo1992a(Context context, Resources resources, int i, String str, int i2) {
        if (!m3372a()) {
            return super.mo1992a(context, resources, i, str, i2);
        }
        Object b = m3374b();
        if (b != null) {
            if (!m3373a(context, b, str, 0, -1, -1, null)) {
                m3376c(b);
                return null;
            } else if (m3375b(b)) {
                return mo1993a(b);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m3375b(Object obj) {
        try {
            return ((Boolean) this.f4102f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m3372a() {
        if (this.f4100d == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4100d != null;
    }

    /* renamed from: b */
    private final Object m3374b() {
        try {
            return this.f4099c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo1994a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
