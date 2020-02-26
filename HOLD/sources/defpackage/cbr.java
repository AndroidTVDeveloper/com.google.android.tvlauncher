package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cbr  reason: default package */
/* compiled from: PG */
final class cbr implements Callable {
    private final /* synthetic */ Callable a;
    private final /* synthetic */ cbt b;

    public cbr(cbt cbt, Callable callable) {
        this.b = cbt;
        this.a = callable;
    }

    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
            throw th;
        }
    }
}
