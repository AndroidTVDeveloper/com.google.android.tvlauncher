package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dgq  reason: default package */
/* compiled from: PG */
public enum dgq implements Executor {
    INSTANCE;

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
