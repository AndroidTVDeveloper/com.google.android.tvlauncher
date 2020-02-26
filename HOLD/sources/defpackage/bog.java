package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Locale;

/* renamed from: bog  reason: default package */
/* compiled from: PG */
public final class bog {
    public static bog a;

    public bog(Context context) {
        context.getApplicationContext();
    }

    public static final boolean a(PackageInfo packageInfo) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            bnw[] bnwArr = bob.a;
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

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        a(3, str, th, str2, objArr);
    }

    public static void a(String str, String str2, Object... objArr) {
        a(3, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th, Object... objArr) {
        a(6, str, th, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        a(4, str, str2, objArr);
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, a(str2, objArr));
        }
    }

    private static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (!Log.isLoggable(str, i)) {
            return;
        }
        if (i == 3) {
            a(str2, objArr);
        } else if (i == 4) {
            a(str2, objArr);
        } else if (i != 5) {
            Log.e(str, a(str2, objArr), th);
        } else {
            Log.w(str, a(str2, objArr), th);
        }
    }

    private static String a(String str, Object... objArr) {
        cev.a(objArr);
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        a(5, str, str2, objArr);
    }

    public static dbk a() {
        return new dbk();
    }
}
