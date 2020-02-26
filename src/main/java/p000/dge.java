package p000;

import java.util.concurrent.Executor;

/* renamed from: dge */
/* compiled from: PG */
final class dge {

    /* renamed from: a */
    public static final dge f8490a = new dge(null, null);

    /* renamed from: b */
    public final Runnable f8491b;

    /* renamed from: c */
    public final Executor f8492c;
    public dge next;

    public dge(Runnable runnable, Executor executor) {
        this.f8491b = runnable;
        this.f8492c = executor;
    }
}
