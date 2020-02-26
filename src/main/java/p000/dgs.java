package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: dgs */
/* compiled from: PG */
public abstract class dgs extends dfk implements Future, dhb {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo4233a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract dhb mo4330b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Future mo4331c() {
        throw null;
    }

    public boolean cancel(boolean z) {
        return mo4331c().cancel(z);
    }

    public final Object get() {
        return mo4331c().get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return mo4331c().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return mo4331c().isCancelled();
    }

    public final boolean isDone() {
        return mo4331c().isDone();
    }

    protected dgs() {
    }

    /* renamed from: a */
    public final void mo4303a(Runnable runnable, Executor executor) {
        mo4330b().mo4303a(runnable, executor);
    }
}
