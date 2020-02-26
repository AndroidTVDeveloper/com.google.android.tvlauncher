package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Locale;

/* renamed from: bog */
/* compiled from: PG */
public final class bog {

    /* renamed from: a */
    public static bog f4506a;

    public bog(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public static final boolean m3833a(PackageInfo packageInfo) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            bnw[] bnwArr = bob.f4501a;
            bnw bnw = null;
            if (packageInfo.signatures != null) {
                if (packageInfo.signatures.length == 1) {
                    bnx bnx = new bnx(packageInfo.signatures[0].toByteArray());
                    int i = 0;
                    while (true) {
                        if (i < 2) {
                            if (bnwArr[i].equals(bnx)) {
                                bnw = bnwArr[i];
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                } else {
                    Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                }
            }
            if (bnw != null) {
                return true;
            }
        }
        return false;
    }

    public bog() {
    }

    public bog(byte b) {
    }

    /* renamed from: a */
    public static void m3831a(String str, String str2, Throwable th, Object... objArr) {
        m3830a(3, str, th, str2, objArr);
    }

    /* renamed from: a */
    public static void m3832a(String str, String str2, Object... objArr) {
        m3829a(3, str, str2, objArr);
    }

    /* renamed from: c */
    public static void m3836c(String str, String str2, Throwable th, Object... objArr) {
        m3830a(6, str, th, str2, objArr);
    }

    /* renamed from: d */
    public static void m3838d(String str, String str2, Object... objArr) {
        m3829a(6, str, str2, objArr);
    }

    /* renamed from: b */
    public static void m3835b(String str, String str2, Object... objArr) {
        m3829a(4, str, str2, objArr);
    }

    /* renamed from: a */
    public static void m3829a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, m3828a(str2, objArr));
        }
    }

    /* renamed from: a */
    private static void m3830a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (!Log.isLoggable(str, i)) {
            return;
        }
        if (i == 3) {
            m3828a(str2, objArr);
        } else if (i == 4) {
            m3828a(str2, objArr);
        } else if (i != 5) {
            Log.e(str, m3828a(str2, objArr), th);
        } else {
            Log.w(str, m3828a(str2, objArr), th);
        }
    }

    /* renamed from: a */
    private static String m3828a(String str, Object... objArr) {
        cev.m4629a(objArr);
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    /* renamed from: b */
    public static void m3834b(String str, String str2, Throwable th, Object... objArr) {
        m3830a(5, str, th, str2, objArr);
    }

    /* renamed from: c */
    public static void m3837c(String str, String str2, Object... objArr) {
        m3829a(5, str, str2, objArr);
    }

    /* renamed from: a */
    public static dbk m3827a() {
        return new dbk();
    }
}
