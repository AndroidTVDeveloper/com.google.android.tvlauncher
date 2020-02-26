package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bww  reason: default package */
/* compiled from: PG */
final class bww implements bxc {
    public final Object a = new Object();
    public final bwx b;
    private final Executor c;

    public bww(Executor executor, bwx bwx) {
        this.c = executor;
        this.b = bwx;
    }

    public final void a(bxb bxb) {
        synchronized (this.a) {
            if (this.b != null) {
                this.c.execute(new bwv(this));
            }
        }
    }
}
