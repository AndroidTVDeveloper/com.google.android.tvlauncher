package p000;

import android.os.Handler;

/* renamed from: akw */
/* compiled from: PG */
public final class akw {

    /* renamed from: a */
    public final akv f629a;

    /* renamed from: b */
    public int f630b;

    /* renamed from: c */
    public Object f631c;

    /* renamed from: d */
    public final Handler f632d;

    /* renamed from: e */
    private final aku f633e;

    /* renamed from: f */
    private boolean f634f;

    /* renamed from: g */
    private boolean f635g;

    /* renamed from: h */
    private boolean f636h;

    public akw(aku aku, akv akv, Handler handler) {
        this.f633e = aku;
        this.f629a = akv;
        this.f632d = handler;
    }

    /* renamed from: a */
    public final synchronized void mo479a() {
        boolean z;
        bks.m3512b(this.f634f);
        if (this.f632d.getLooper().getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        while (!this.f636h) {
            wait();
        }
    }

    /* renamed from: a */
    public final synchronized void mo482a(boolean z) {
        this.f635g = z | this.f635g;
        this.f636h = true;
        notifyAll();
    }

    /* renamed from: b */
    public final void mo483b() {
        bks.m3512b(!this.f634f);
        bks.m3510a(true);
        this.f634f = true;
        this.f633e.mo411a(this);
    }

    /* renamed from: a */
    public final void mo481a(Object obj) {
        bks.m3512b(!this.f634f);
        this.f631c = obj;
    }

    /* renamed from: a */
    public final void mo480a(int i) {
        bks.m3512b(!this.f634f);
        this.f630b = i;
    }
}
