package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: dgs  reason: default package */
/* compiled from: PG */
public abstract class dgs extends dfk implements Future, dhb {
    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract dhb b();

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    public final Object get() {
        return c().get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return c().isCancelled();
    }

    public final boolean isDone() {
        return c().isDone();
    }

    protected dgs() {
    }

    public final void a(Runnable runnable, Executor executor) {
        b().a(runnable, executor);
    }
}
