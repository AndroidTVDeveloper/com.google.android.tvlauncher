package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ch */
/* compiled from: PG */
final class C0063ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f5495a;

    /* renamed from: b */
    private final /* synthetic */ Callable f5496b;

    /* renamed from: c */
    private final /* synthetic */ ReentrantLock f5497c;

    /* renamed from: d */
    private final /* synthetic */ AtomicBoolean f5498d;

    /* renamed from: e */
    private final /* synthetic */ Condition f5499e;

    public C0063ch(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f5495a = atomicReference;
        this.f5496b = callable;
        this.f5497c = reentrantLock;
        this.f5498d = atomicBoolean;
        this.f5499e = condition;
    }

    public final void run() {
        try {
            this.f5495a.set(((C0051bw) this.f5496b).call());
        } catch (Exception e) {
        }
        this.f5497c.lock();
        try {
            this.f5498d.set(false);
            this.f5499e.signal();
        } finally {
            this.f5497c.unlock();
        }
    }
}
