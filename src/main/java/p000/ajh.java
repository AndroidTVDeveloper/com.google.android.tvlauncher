package p000;

import android.os.SystemClock;

/* renamed from: ajh */
/* compiled from: PG */
public final class ajh extends Exception {
    public ajh(Throwable th) {
        super(th);
        SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static ajh m642a(Exception exc) {
        return new ajh(exc);
    }

    /* renamed from: a */
    public static ajh m643a(RuntimeException runtimeException) {
        return new ajh(runtimeException);
    }
}
