package defpackage;

/* renamed from: bki  reason: default package */
/* compiled from: PG */
public final class bki {
    private boolean a;

    public final synchronized boolean c() {
        return this.a;
    }

    public final synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void d() {
        this.a = false;
    }

    public final synchronized boolean a() {
        boolean z;
        if (!this.a) {
            z = true;
            this.a = true;
            notifyAll();
        } else {
            z = false;
        }
        return z;
    }
}
