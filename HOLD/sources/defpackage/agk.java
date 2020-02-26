package defpackage;

/* renamed from: agk  reason: default package */
/* compiled from: PG */
public final class agk implements ago, agm {
    public volatile agm a;
    public volatile agm b;
    private final Object c;
    private final ago d;
    private agn e = agn.CLEARED;
    private agn f = agn.CLEARED;

    public agk(Object obj, ago ago) {
        this.c = obj;
        this.d = ago;
    }

    public final void a() {
        synchronized (this.c) {
            if (this.e != agn.RUNNING) {
                this.e = agn.RUNNING;
                this.a.a();
            }
        }
    }

    public final boolean d(agm agm) {
        boolean z;
        synchronized (this.c) {
            ago ago = this.d;
            z = false;
            if (ago != null) {
                if (!ago.d(this)) {
                }
            }
            if (g(agm)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean c(agm agm) {
        boolean z;
        synchronized (this.c) {
            ago ago = this.d;
            z = false;
            if (ago != null) {
                if (!ago.c(this)) {
                }
            }
            if (g(agm)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b(agm agm) {
        boolean z;
        synchronized (this.c) {
            ago ago = this.d;
            z = false;
            if (ago != null) {
                if (!ago.b(this)) {
                }
            }
            if (g(agm)) {
                z = true;
            }
        }
        return z;
    }

    public final void b() {
        synchronized (this.c) {
            this.e = agn.CLEARED;
            this.a.b();
            if (this.f != agn.CLEARED) {
                this.f = agn.CLEARED;
                this.b.b();
            }
        }
    }

    public final ago h() {
        ago h;
        synchronized (this.c) {
            ago ago = this.d;
            h = ago != null ? ago.h() : this;
        }
        return h;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.g() && !this.b.g()) {
                z = false;
            }
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == agn.CLEARED && this.f == agn.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!(this.e == agn.SUCCESS || this.f == agn.SUCCESS)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean a(agm agm) {
        if (agm instanceof agk) {
            agk agk = (agk) agm;
            if (!this.a.a(agk.a) || !this.b.a(agk.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!(this.e == agn.RUNNING || this.f == agn.RUNNING)) {
                z = false;
            }
        }
        return z;
    }

    private final boolean g(agm agm) {
        if (!agm.equals(this.a)) {
            return this.e == agn.FAILED && agm.equals(this.b);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            agm r1 = r2.b     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0020
            agn r3 = defpackage.agn.FAILED     // Catch:{ all -> 0x002d }
            r2.e = r3     // Catch:{ all -> 0x002d }
            agn r3 = r2.f     // Catch:{ all -> 0x002d }
            agn r1 = defpackage.agn.RUNNING     // Catch:{ all -> 0x002d }
            if (r3 == r1) goto L_0x001e
            agn r3 = defpackage.agn.RUNNING     // Catch:{ all -> 0x002d }
            r2.f = r3     // Catch:{ all -> 0x002d }
            agm r3 = r2.b     // Catch:{ all -> 0x002d }
            r3.a()     // Catch:{ all -> 0x002d }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0020:
            agn r3 = defpackage.agn.FAILED     // Catch:{ all -> 0x002d }
            r2.f = r3     // Catch:{ all -> 0x002d }
            ago r3 = r2.d     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x002b
            r3.f(r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agk.f(agm):void");
    }

    public final void e(agm agm) {
        synchronized (this.c) {
            if (agm.equals(this.a)) {
                this.e = agn.SUCCESS;
            } else if (agm.equals(this.b)) {
                this.f = agn.SUCCESS;
            }
            ago ago = this.d;
            if (ago != null) {
                ago.e(this);
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.e == agn.RUNNING) {
                this.e = agn.PAUSED;
                this.a.c();
            }
            if (this.f == agn.RUNNING) {
                this.f = agn.PAUSED;
                this.b.c();
            }
        }
    }
}
