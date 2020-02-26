package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cem  reason: default package */
/* compiled from: PG */
public final class cem extends cen {
    public cem(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, ceq ceq, ces ces) {
        super(context, uncaughtExceptionHandler, atomicReference, ceq, ces);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th, String str, Bundle bundle) {
        Throwable th2 = (Throwable) this.b.get();
        if (th2 == null || th2 != th) {
            cel.a(this.a, th, str, bundle);
        }
    }
}
