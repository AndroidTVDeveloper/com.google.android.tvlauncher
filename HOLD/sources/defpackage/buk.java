package defpackage;

import android.os.Build;
import android.util.Log;

/* renamed from: buk  reason: default package */
/* compiled from: PG */
public final class buk {
    public static int a(int i) {
        if (i != -1) {
            return i / 1000;
        }
        return -1;
    }

    public static void a(long j, bky bky, aov[] aovArr) {
        boolean z;
        while (true) {
            boolean z2 = true;
            if (bky.b() > 1) {
                int a = a(bky);
                int a2 = a(bky);
                int i = bky.b + a2;
                if (a2 == -1 || a2 > bky.b()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i = bky.c;
                } else if (a == 4 && a2 >= 8) {
                    int d = bky.d();
                    int e = bky.e();
                    int j2 = e == 49 ? bky.j() : 0;
                    int d2 = bky.d();
                    if (e == 47) {
                        bky.d(1);
                    }
                    if (d == 181 && ((e == 49 || e == 47) && d2 == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (e == 49) {
                        if (j2 != 1195456820) {
                            z2 = false;
                        }
                        z &= z2;
                    }
                    if (z) {
                        b(j, bky, aovArr);
                    }
                }
                bky.c(i);
            } else {
                return;
            }
        }
    }

    public static void b(long j, bky bky, aov[] aovArr) {
        int d = bky.d();
        if ((d & 64) != 0) {
            bky.d(1);
            int i = (d & 31) * 3;
            int i2 = bky.b;
            for (aov aov : aovArr) {
                bky.c(i2);
                aov.a(bky, i);
                aov.a(j, 1, i, 0, null);
            }
        }
    }

    private static int a(bky bky) {
        int i = 0;
        while (bky.b() != 0) {
            int d = bky.d();
            i += d;
            if (d != 255) {
                return i;
            }
        }
        return -1;
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public static boolean b() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }
}
