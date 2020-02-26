package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: ahy  reason: default package */
/* compiled from: PG */
public final class ahy {
    public static final double a = (1.0d / Math.pow(10.0d, 6.0d));

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static long a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
