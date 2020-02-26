package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dge  reason: default package */
/* compiled from: PG */
final class dge {
    public static final dge a = new dge(null, null);
    public final Runnable b;
    public final Executor c;
    public dge next;

    public dge(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
