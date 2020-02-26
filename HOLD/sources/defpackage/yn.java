package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: yn  reason: default package */
/* compiled from: PG */
public final class yn {
    public final int a;
    public final int b;
    public final int c;

    public yn(yk ykVar) {
        int i;
        float f;
        if (!a(ykVar.a)) {
            i = 4194304;
        } else {
            i = 2097152;
        }
        this.c = i;
        ActivityManager activityManager = ykVar.a;
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (!a(activityManager)) {
            f = 0.4f;
        } else {
            f = 0.33f;
        }
        int round = Math.round(memoryClass * f);
        float f2 = (float) ((((yl) ykVar.b).a.widthPixels * ((yl) ykVar.b).a.heightPixels) << 2);
        int round2 = Math.round(ykVar.c * f2);
        int round3 = Math.round(f2 + f2);
        int i2 = round - this.c;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
            return;
        }
        float f3 = ((float) i2) / (ykVar.c + 2.0f);
        this.b = Math.round(f3 + f3);
        this.a = Math.round(f3 * ykVar.c);
    }

    static boolean a(ActivityManager activityManager) {
        int i = Build.VERSION.SDK_INT;
        return activityManager.isLowRamDevice();
    }
}
