package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;

@Deprecated
/* renamed from: bwa  reason: default package */
/* compiled from: PG */
public class bwa {
    public static Context a = null;
    public static volatile Boolean b = null;
    private static final Object h = new Object();
    private static volatile Boolean i = null;
    public final bvz c;
    public final String d;
    public final String e;
    public final Object f;
    public volatile SharedPreferences g = null;
    private volatile bvn j = null;

    public /* synthetic */ bwa(bvz bvz, String str, Object obj) {
        if (bvz.a != null) {
            this.c = bvz;
            String valueOf = String.valueOf(bvz.b);
            this.e = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
            String valueOf2 = String.valueOf(bvz.c);
            this.d = str.length() == 0 ? new String(valueOf2) : valueOf2.concat(str);
            this.f = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static boolean a() {
        if (i == null) {
            Context context = a;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (bq.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            i = Boolean.valueOf(z);
        }
        return i.booleanValue();
    }

    public static Object a(bvy bvy) {
        long clearCallingIdentity;
        try {
            return bvy.a();
        } catch (SecurityException e2) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a2 = bvy.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static void a(Context context) {
        ceh.a(context);
        synchronized (h) {
            int i2 = Build.VERSION.SDK_INT;
            if (!context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (a != context) {
                i = null;
            }
            a = context;
        }
    }
}
