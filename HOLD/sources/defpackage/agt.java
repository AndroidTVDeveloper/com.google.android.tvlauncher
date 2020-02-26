package defpackage;

/* renamed from: agt  reason: default package */
/* compiled from: PG */
public final class agt implements ago, agm {
    public volatile agm a;
    public volatile agm b;
    private final ago c;
    private final Object d;
    private agn e = agn.CLEARED;
    private agn f = agn.CLEARED;
    private boolean g;

    public agt(Object obj, ago ago) {
        this.d = obj;
        this.c = ago;
    }

    public final void a() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (!(this.e == agn.SUCCESS || this.f == agn.RUNNING)) {
                    this.f = agn.RUNNING;
                    this.b.a();
                }
                if (this.g && this.e != agn.RUNNING) {
                    this.e = agn.RUNNING;
                    this.a.a();
                }
            } finally {
                this.g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1.d(r3) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(defpackage.agm r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            ago r1 = r3.c     // Catch:{ all -> 0x0021 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            boolean r1 = r1.d(r3)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            goto L_0x001f
        L_0x0010:
            agm r1 = r3.a     // Catch:{ all -> 0x0021 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0021 }
            if (r4 == 0) goto L_0x000f
            agn r4 = r3.e     // Catch:{ all -> 0x0021 }
            agn r1 = defpackage.agn.PAUSED     // Catch:{ all -> 0x0021 }
            if (r4 == r1) goto L_0x000f
            r2 = 1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r2
        L_0x0021:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0024:
            throw r4
        L_0x0025:
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agt.d(agm):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1.c(r3) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.agm r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            ago r1 = r3.c     // Catch:{ all -> 0x0021 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            boolean r1 = r1.c(r3)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            goto L_0x001f
        L_0x0010:
            agm r1 = r3.a     // Catch:{ all -> 0x0021 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0021 }
            if (r4 == 0) goto L_0x000f
            boolean r4 = r3.g()     // Catch:{ all -> 0x0021 }
            if (r4 != 0) goto L_0x000f
            r2 = 1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r2
        L_0x0021:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0024:
            throw r4
        L_0x0025:
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agt.c(agm):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r4.e == defpackage.agn.SUCCESS) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1.b(r4) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.agm r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            ago r1 = r4.c     // Catch:{ all -> 0x0022 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            boolean r1 = r1.b(r4)     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0020
        L_0x0012:
            agm r1 = r4.a     // Catch:{ all -> 0x0022 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0022 }
            if (r5 != 0) goto L_0x0020
            agn r5 = r4.e     // Catch:{ all -> 0x0022 }
            agn r1 = defpackage.agn.SUCCESS     // Catch:{ all -> 0x0022 }
            if (r5 == r1) goto L_0x0010
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x0022:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0026
        L_0x0025:
            throw r5
        L_0x0026:
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agt.b(agm):boolean");
    }

    public final void b() {
        synchronized (this.d) {
            this.g = false;
            this.e = agn.CLEARED;
            this.f = agn.CLEARED;
            this.b.b();
            this.a.b();
        }
    }

    public final ago h() {
        ago h;
        synchronized (this.d) {
            ago ago = this.c;
            h = ago != null ? ago.h() : this;
        }
        return h;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.g() && !this.a.g()) {
                z = false;
            }
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.d) {
            z = this.e == agn.CLEARED;
        }
        return z;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.e == agn.SUCCESS;
        }
        return z;
    }

    public final boolean a(agm agm) {
        if (agm instanceof agt) {
            agt agt = (agt) agm;
            if (this.a == null ? agt.a == null : this.a.a(agt.a)) {
                if (this.b != null) {
                    if (this.b.a(agt.b)) {
                        return true;
                    }
                } else if (agt.b != null) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.e == agn.RUNNING;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            agm r1 = r2.a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0018
            agn r3 = defpackage.agn.FAILED     // Catch:{ all -> 0x001e }
            r2.e = r3     // Catch:{ all -> 0x001e }
            ago r3 = r2.c     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0016
            r3.f(r2)     // Catch:{ all -> 0x001e }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0018:
            agn r3 = defpackage.agn.FAILED     // Catch:{ all -> 0x001e }
            r2.f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agt.f(agm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            agm r1 = r2.b     // Catch:{ all -> 0x002a }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0024
            agn r3 = defpackage.agn.SUCCESS     // Catch:{ all -> 0x002a }
            r2.e = r3     // Catch:{ all -> 0x002a }
            ago r3 = r2.c     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            r3.e(r2)     // Catch:{ all -> 0x002a }
        L_0x0017:
            agn r3 = r2.f     // Catch:{ all -> 0x002a }
            boolean r3 = r3.f     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0022
            agm r3 = r2.b     // Catch:{ all -> 0x002a }
            r3.b()     // Catch:{ all -> 0x002a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0024:
            agn r3 = defpackage.agn.SUCCESS     // Catch:{ all -> 0x002a }
            r2.f = r3     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agt.e(agm):void");
    }

    public final void c() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = agn.PAUSED;
                this.b.c();
            }
            if (!this.e.f) {
                this.e = agn.PAUSED;
                this.a.c();
            }
        }
    }
}
