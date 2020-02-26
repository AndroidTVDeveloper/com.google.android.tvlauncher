package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ceo  reason: default package */
/* compiled from: PG */
public final class ceo extends cen {
    public ceo(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, ceq ceq, ces ces) {
        super(context, uncaughtExceptionHandler, atomicReference, ceq, ces);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th, String str, Bundle bundle) {
        cel.a(this.a, th, str, bundle);
        this.b.set(th);
    }
}
