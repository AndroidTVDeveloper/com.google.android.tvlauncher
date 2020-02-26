package p000;

import android.content.Context;
import android.os.Bundle;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ceo */
/* compiled from: PG */
public final class ceo extends cen {
    public ceo(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, ceq ceq, ces ces) {
        super(context, uncaughtExceptionHandler, atomicReference, ceq, ces);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo2700a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2699a(Throwable th, String str, Bundle bundle) {
        cel.m4619a(this.f5377a, th, str, bundle);
        this.f5378b.set(th);
    }
}
