package defpackage;

import android.os.Handler;

/* renamed from: akw  reason: default package */
/* compiled from: PG */
public final class akw {
    public final akv a;
    public int b;
    public Object c;
    public final Handler d;
    private final aku e;
    private boolean f;
    private boolean g;
    private boolean h;

    public akw(aku aku, akv akv, Handler handler) {
        this.e = aku;
        this.a = akv;
        this.d = handler;
    }

    public final synchronized void a() {
        boolean z;
        bks.b(this.f);
        if (this.d.getLooper().getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        bks.b(z);
        while (!this.h) {
            wait();
        }
    }

    public final synchronized void a(boolean z) {
        this.g = z | this.g;
        this.h = true;
        notifyAll();
    }

    public final void b() {
        bks.b(!this.f);
        bks.a(true);
        this.f = true;
        this.e.a(this);
    }

    public final void a(Object obj) {
        bks.b(!this.f);
        this.c = obj;
    }

    public final void a(int i) {
        bks.b(!this.f);
        this.b = i;
    }
}
