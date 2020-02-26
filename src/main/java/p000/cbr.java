package p000;

import java.util.concurrent.Callable;

/* renamed from: cbr */
/* compiled from: PG */
final class cbr implements Callable {

    /* renamed from: a */
    private final /* synthetic */ Callable f5223a;

    /* renamed from: b */
    private final /* synthetic */ cbt f5224b;

    public cbr(cbt cbt, Callable callable) {
        this.f5224b = cbt;
        this.f5223a = callable;
    }

    public final Object call() {
        try {
            return this.f5223a.call();
        } catch (Throwable th) {
            this.f5224b.f5225a.mo2623a(th);
            throw th;
        }
    }
}
