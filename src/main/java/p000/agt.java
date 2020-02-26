package p000;

/* renamed from: agt */
/* compiled from: PG */
public final class agt implements ago, agm {

    /* renamed from: a */
    public volatile agm f339a;

    /* renamed from: b */
    public volatile agm f340b;

    /* renamed from: c */
    private final ago f341c;

    /* renamed from: d */
    private final Object f342d;

    /* renamed from: e */
    private agn f343e = agn.CLEARED;

    /* renamed from: f */
    private agn f344f = agn.CLEARED;

    /* renamed from: g */
    private boolean f345g;

    public agt(Object obj, ago ago) {
        this.f342d = obj;
        this.f341c = ago;
    }

    /* renamed from: a */
    public final void mo215a() {
        synchronized (this.f342d) {
            this.f345g = true;
            try {
                if (!(this.f343e == agn.SUCCESS || this.f344f == agn.RUNNING)) {
                    this.f344f = agn.RUNNING;
                    this.f340b.mo215a();
                }
                if (this.f345g && this.f343e != agn.RUNNING) {
                    this.f343e = agn.RUNNING;
                    this.f339a.mo215a();
                }
            } finally {
                this.f345g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1.mo222d(r3) == false) goto L_0x000f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo222d(p000.agm r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f342d
            monitor-enter(r0)
            ago r1 = r3.f341c     // Catch:{ all -> 0x0021 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            boolean r1 = r1.mo222d(r3)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            goto L_0x001f
        L_0x0010:
            agm r1 = r3.f339a     // Catch:{ all -> 0x0021 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0021 }
            if (r4 == 0) goto L_0x000f
            agn r4 = r3.f343e     // Catch:{ all -> 0x0021 }
            agn r1 = p000.agn.PAUSED     // Catch:{ all -> 0x0021 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.agt.mo222d(agm):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1.mo220c(r3) == false) goto L_0x000f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo220c(p000.agm r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f342d
            monitor-enter(r0)
            ago r1 = r3.f341c     // Catch:{ all -> 0x0021 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            boolean r1 = r1.mo220c(r3)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            goto L_0x001f
        L_0x0010:
            agm r1 = r3.f339a     // Catch:{ all -> 0x0021 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0021 }
            if (r4 == 0) goto L_0x000f
            boolean r4 = r3.mo227g()     // Catch:{ all -> 0x0021 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.agt.mo220c(agm):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r4.f343e == p000.agn.SUCCESS) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1.mo218b(r4) == false) goto L_0x0010;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo218b(p000.agm r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f342d
            monitor-enter(r0)
            ago r1 = r4.f341c     // Catch:{ all -> 0x0022 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            boolean r1 = r1.mo218b(r4)     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0020
        L_0x0012:
            agm r1 = r4.f339a     // Catch:{ all -> 0x0022 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0022 }
            if (r5 != 0) goto L_0x0020
            agn r5 = r4.f343e     // Catch:{ all -> 0x0022 }
            agn r1 = p000.agn.SUCCESS     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.agt.mo218b(agm):boolean");
    }

    /* renamed from: b */
    public final void mo217b() {
        synchronized (this.f342d) {
            this.f345g = false;
            this.f343e = agn.CLEARED;
            this.f344f = agn.CLEARED;
            this.f340b.mo217b();
            this.f339a.mo217b();
        }
    }

    /* renamed from: h */
    public final ago mo228h() {
        ago h;
        synchronized (this.f342d) {
            ago ago = this.f341c;
            h = ago != null ? ago.mo228h() : this;
        }
        return h;
    }

    /* renamed from: g */
    public final boolean mo227g() {
        boolean z;
        synchronized (this.f342d) {
            z = true;
            if (!this.f340b.mo227g() && !this.f339a.mo227g()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo226f() {
        boolean z;
        synchronized (this.f342d) {
            z = this.f343e == agn.CLEARED;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo224e() {
        boolean z;
        synchronized (this.f342d) {
            z = this.f343e == agn.SUCCESS;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo216a(agm agm) {
        if (agm instanceof agt) {
            agt agt = (agt) agm;
            if (this.f339a == null ? agt.f339a == null : this.f339a.mo216a(agt.f339a)) {
                if (this.f340b != null) {
                    if (this.f340b.mo216a(agt.f340b)) {
                        return true;
                    }
                } else if (agt.f340b != null) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo221d() {
        boolean z;
        synchronized (this.f342d) {
            z = this.f343e == agn.RUNNING;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo225f(p000.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f342d
            monitor-enter(r0)
            agm r1 = r2.f339a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0018
            agn r3 = p000.agn.FAILED     // Catch:{ all -> 0x001e }
            r2.f343e = r3     // Catch:{ all -> 0x001e }
            ago r3 = r2.f341c     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0016
            r3.mo225f(r2)     // Catch:{ all -> 0x001e }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0018:
            agn r3 = p000.agn.FAILED     // Catch:{ all -> 0x001e }
            r2.f344f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.agt.mo225f(agm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo223e(p000.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f342d
            monitor-enter(r0)
            agm r1 = r2.f340b     // Catch:{ all -> 0x002a }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0024
            agn r3 = p000.agn.SUCCESS     // Catch:{ all -> 0x002a }
            r2.f343e = r3     // Catch:{ all -> 0x002a }
            ago r3 = r2.f341c     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            r3.mo223e(r2)     // Catch:{ all -> 0x002a }
        L_0x0017:
            agn r3 = r2.f344f     // Catch:{ all -> 0x002a }
            boolean r3 = r3.f304f     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0022
            agm r3 = r2.f340b     // Catch:{ all -> 0x002a }
            r3.mo217b()     // Catch:{ all -> 0x002a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0024:
            agn r3 = p000.agn.SUCCESS     // Catch:{ all -> 0x002a }
            r2.f344f = r3     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.agt.mo223e(agm):void");
    }

    /* renamed from: c */
    public final void mo219c() {
        synchronized (this.f342d) {
            if (!this.f344f.f304f) {
                this.f344f = agn.PAUSED;
                this.f340b.mo219c();
            }
            if (!this.f343e.f304f) {
                this.f343e = agn.PAUSED;
                this.f339a.mo219c();
            }
        }
    }
}
