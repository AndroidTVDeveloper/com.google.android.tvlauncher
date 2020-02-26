package p000;

import android.os.Build;
import android.util.Log;

/* renamed from: buk */
/* compiled from: PG */
public final class buk {
    /* renamed from: a */
    public static int m4253a(int i) {
        if (i != -1) {
            return i / 1000;
        }
        return -1;
    }

    /* renamed from: a */
    public static void m4255a(long j, bky bky, aov[] aovArr) {
        boolean z;
        while (true) {
            boolean z2 = true;
            if (bky.mo2070b() > 1) {
                int a = m4254a(bky);
                int a2 = m4254a(bky);
                int i = bky.f4259b + a2;
                if (a2 == -1 || a2 > bky.mo2070b()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i = bky.f4260c;
                } else if (a == 4 && a2 >= 8) {
                    int d = bky.mo2074d();
                    int e = bky.mo2076e();
                    int j2 = e == 49 ? bky.mo2083j() : 0;
                    int d2 = bky.mo2074d();
                    if (e == 47) {
                        bky.mo2075d(1);
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
                        m4257b(j, bky, aovArr);
                    }
                }
                bky.mo2073c(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m4257b(long j, bky bky, aov[] aovArr) {
        int d = bky.mo2074d();
        if ((d & 64) != 0) {
            bky.mo2075d(1);
            int i = (d & 31) * 3;
            int i2 = bky.f4259b;
            for (aov aov : aovArr) {
                bky.mo2073c(i2);
                aov.mo1205a(bky, i);
                aov.mo1203a(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: a */
    private static int m4254a(bky bky) {
        int i = 0;
        while (bky.mo2070b() != 0) {
            int d = bky.mo2074d();
            i += d;
            if (d != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m4256a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static boolean m4258b() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }
}
