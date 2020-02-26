package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ch  reason: default package */
/* compiled from: PG */
final class ch implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ ReentrantLock c;
    private final /* synthetic */ AtomicBoolean d;
    private final /* synthetic */ Condition e;

    public ch(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.a = atomicReference;
        this.b = callable;
        this.c = reentrantLock;
        this.d = atomicBoolean;
        this.e = condition;
    }

    public final void run() {
        try {
            this.a.set(((bw) this.b).call());
        } catch (Exception e2) {
        }
        this.c.lock();
        try {
            this.d.set(false);
            this.e.signal();
        } finally {
            this.c.unlock();
        }
    }
}
