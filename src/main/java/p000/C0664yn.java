package p000;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: yn */
/* compiled from: PG */
public final class C0664yn {

    /* renamed from: a */
    public final int f10822a;

    /* renamed from: b */
    public final int f10823b;

    /* renamed from: c */
    public final int f10824c;

    public C0664yn(C0661yk ykVar) {
        int i;
        float f;
        if (!m8680a(ykVar.f10818a)) {
            i = 4194304;
        } else {
            i = 2097152;
        }
        this.f10824c = i;
        ActivityManager activityManager = ykVar.f10818a;
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (!m8680a(activityManager)) {
            f = 0.4f;
        } else {
            f = 0.33f;
        }
        int round = Math.round(memoryClass * f);
        float f2 = (float) ((((C0662yl) ykVar.f10819b).f10821a.widthPixels * ((C0662yl) ykVar.f10819b).f10821a.heightPixels) << 2);
        int round2 = Math.round(ykVar.f10820c * f2);
        int round3 = Math.round(f2 + f2);
        int i2 = round - this.f10824c;
        if (round3 + round2 <= i2) {
            this.f10823b = round3;
            this.f10822a = round2;
            return;
        }
        float f3 = ((float) i2) / (ykVar.f10820c + 2.0f);
        this.f10823b = Math.round(f3 + f3);
        this.f10822a = Math.round(f3 * ykVar.f10820c);
    }

    /* renamed from: a */
    static boolean m8680a(ActivityManager activityManager) {
        int i = Build.VERSION.SDK_INT;
        return activityManager.isLowRamDevice();
    }
}
