package defpackage;

import android.os.SystemClock;

/* renamed from: ajh  reason: default package */
/* compiled from: PG */
public final class ajh extends Exception {
    public ajh(Throwable th) {
        super(th);
        SystemClock.elapsedRealtime();
    }

    public static ajh a(Exception exc) {
        return new ajh(exc);
    }

    public static ajh a(RuntimeException runtimeException) {
        return new ajh(runtimeException);
    }
}
