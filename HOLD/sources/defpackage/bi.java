package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bi  reason: default package */
/* compiled from: PG */
class bi extends bp {
    private static Class a;
    private static Constructor b;
    private static Method c;
    private static Method d;
    private static boolean e = false;

    public Typeface a(Context context, aw awVar, Resources resources, int i) {
        Object b2 = b();
        ax[] axVarArr = awVar.a;
        int length = axVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            ax axVar = axVarArr[i2];
            File a2 = bq.a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (bq.a(a2, resources, axVar.f)) {
                    String path = a2.getPath();
                    int i3 = axVar.b;
                    boolean z = axVar.c;
                    a();
                    if (((Boolean) c.invoke(b2, path, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue()) {
                        a2.delete();
                        i2++;
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
            } catch (Throwable th) {
                a2.delete();
                throw th;
            }
            a2.delete();
            return null;
        }
        a();
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, b2);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        defpackage.dhr.a(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0056, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r3, defpackage.cb[] r4, int r5) {
        /*
            r2 = this;
            int r0 = r4.length
            r1 = 0
            if (r0 <= 0) goto L_0x0059
            cb r4 = r2.a(r4, r5)
            android.content.ContentResolver r5 = r3.getContentResolver()
            android.net.Uri r4 = r4.a     // Catch:{ IOException -> 0x0058 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = r5.openFileDescriptor(r4, r0, r1)     // Catch:{ IOException -> 0x0058 }
            if (r4 == 0) goto L_0x0057
            java.io.File r5 = a(r4)     // Catch:{ all -> 0x004b }
            if (r5 != 0) goto L_0x001d
            goto L_0x002b
        L_0x001d:
            boolean r0 = r5.canRead()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002b
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch:{ all -> 0x004b }
            r4.close()     // Catch:{ IOException -> 0x0058 }
            return r3
        L_0x002b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ all -> 0x004b }
            r5.<init>(r0)     // Catch:{ all -> 0x004b }
            android.graphics.Typeface r3 = super.a(r3, r5)     // Catch:{ all -> 0x003f }
            r5.close()     // Catch:{ all -> 0x004b }
            r4.close()     // Catch:{ IOException -> 0x0058 }
            return r3
        L_0x003f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r5 = move-exception
            defpackage.dhr.a(r3, r5)     // Catch:{ all -> 0x004b }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004d }
        L_0x004d:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r4 = move-exception
            defpackage.dhr.a(r3, r4)     // Catch:{ IOException -> 0x0058 }
        L_0x0056:
            throw r5     // Catch:{ IOException -> 0x0058 }
        L_0x0057:
            return r1
        L_0x0058:
            r3 = move-exception
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.a(android.content.Context, cb[], int):android.graphics.Typeface");
    }

    private static final File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e2) {
            return null;
        }
    }

    private static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!e) {
            e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            b = constructor;
            a = cls;
            c = method;
            d = method2;
        }
    }

    private static Object b() {
        a();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
