package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahw  reason: default package */
/* compiled from: PG */
final class ahw implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
