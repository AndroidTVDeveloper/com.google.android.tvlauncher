package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;

@Deprecated
/* renamed from: bwa */
/* compiled from: PG */
public class bwa {

    /* renamed from: a */
    public static Context f4934a = null;

    /* renamed from: b */
    public static volatile Boolean f4935b = null;

    /* renamed from: h */
    private static final Object f4936h = new Object();

    /* renamed from: i */
    private static volatile Boolean f4937i = null;

    /* renamed from: c */
    public final bvz f4938c;

    /* renamed from: d */
    public final String f4939d;

    /* renamed from: e */
    public final String f4940e;

    /* renamed from: f */
    public final Object f4941f;

    /* renamed from: g */
    public volatile SharedPreferences f4942g = null;

    /* renamed from: j */
    private volatile bvn f4943j = null;

    public /* synthetic */ bwa(bvz bvz, String str, Object obj) {
        if (bvz.f4927a != null) {
            this.f4938c = bvz;
            String valueOf = String.valueOf(bvz.f4928b);
            this.f4940e = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
            String valueOf2 = String.valueOf(bvz.f4929c);
            this.f4939d = str.length() == 0 ? new String(valueOf2) : valueOf2.concat(str);
            this.f4941f = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public static boolean m4293a() {
        if (f4937i == null) {
            Context context = f4934a;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C0045bq.m3940a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f4937i = Boolean.valueOf(z);
        }
        return f4937i.booleanValue();
    }

    /* renamed from: a */
    public static Object m4291a(bvy bvy) {
        long clearCallingIdentity;
        try {
            return bvy.mo2484a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = bvy.mo2484a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m4292a(Context context) {
        ceh.m4608a(context);
        synchronized (f4936h) {
            int i = Build.VERSION.SDK_INT;
            if (!context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (f4934a != context) {
                f4937i = null;
            }
            f4934a = context;
        }
    }
}
