package p000;

/* renamed from: agk */
/* compiled from: PG */
public final class agk implements ago, agm {

    /* renamed from: a */
    public volatile agm f292a;

    /* renamed from: b */
    public volatile agm f293b;

    /* renamed from: c */
    private final Object f294c;

    /* renamed from: d */
    private final ago f295d;

    /* renamed from: e */
    private agn f296e = agn.CLEARED;

    /* renamed from: f */
    private agn f297f = agn.CLEARED;

    public agk(Object obj, ago ago) {
        this.f294c = obj;
        this.f295d = ago;
    }

    /* renamed from: a */
    public final void mo215a() {
        synchronized (this.f294c) {
            if (this.f296e != agn.RUNNING) {
                this.f296e = agn.RUNNING;
                this.f292a.mo215a();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo222d(agm agm) {
        boolean z;
        synchronized (this.f294c) {
            ago ago = this.f295d;
            z = false;
            if (ago != null) {
                if (!ago.mo222d(this)) {
                }
            }
            if (m368g(agm)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo220c(agm agm) {
        boolean z;
        synchronized (this.f294c) {
            ago ago = this.f295d;
            z = false;
            if (ago != null) {
                if (!ago.mo220c(this)) {
                }
            }
            if (m368g(agm)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo218b(agm agm) {
        boolean z;
        synchronized (this.f294c) {
            ago ago = this.f295d;
            z = false;
            if (ago != null) {
                if (!ago.mo218b(this)) {
                }
            }
            if (m368g(agm)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo217b() {
        synchronized (this.f294c) {
            this.f296e = agn.CLEARED;
            this.f292a.mo217b();
            if (this.f297f != agn.CLEARED) {
                this.f297f = agn.CLEARED;
                this.f293b.mo217b();
            }
        }
    }

    /* renamed from: h */
    public final ago mo228h() {
        ago h;
        synchronized (this.f294c) {
            ago ago = this.f295d;
            h = ago != null ? ago.mo228h() : this;
        }
        return h;
    }

    /* renamed from: g */
    public final boolean mo227g() {
        boolean z;
        synchronized (this.f294c) {
            z = true;
            if (!this.f292a.mo227g() && !this.f293b.mo227g()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo226f() {
        boolean z;
        synchronized (this.f294c) {
            z = false;
            if (this.f296e == agn.CLEARED && this.f297f == agn.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo224e() {
        boolean z;
        synchronized (this.f294c) {
            z = true;
            if (!(this.f296e == agn.SUCCESS || this.f297f == agn.SUCCESS)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo216a(agm agm) {
        if (agm instanceof agk) {
            agk agk = (agk) agm;
            if (!this.f292a.mo216a(agk.f292a) || !this.f293b.mo216a(agk.f293b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo221d() {
        boolean z;
        synchronized (this.f294c) {
            z = true;
            if (!(this.f296e == agn.RUNNING || this.f297f == agn.RUNNING)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    private final boolean m368g(agm agm) {
        if (!agm.equals(this.f292a)) {
            return this.f296e == agn.FAILED && agm.equals(this.f293b);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo225f(p000.agm r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f294c
            monitor-enter(r0)
            agm r1 = r2.f293b     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0020
            agn r3 = p000.agn.FAILED     // Catch:{ all -> 0x002d }
            r2.f296e = r3     // Catch:{ all -> 0x002d }
            agn r3 = r2.f297f     // Catch:{ all -> 0x002d }
            agn r1 = p000.agn.RUNNING     // Catch:{ all -> 0x002d }
            if (r3 == r1) goto L_0x001e
            agn r3 = p000.agn.RUNNING     // Catch:{ all -> 0x002d }
            r2.f297f = r3     // Catch:{ all -> 0x002d }
            agm r3 = r2.f293b     // Catch:{ all -> 0x002d }
            r3.mo215a()     // Catch:{ all -> 0x002d }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0020:
            agn r3 = p000.agn.FAILED     // Catch:{ all -> 0x002d }
            r2.f297f = r3     // Catch:{ all -> 0x002d }
            ago r3 = r2.f295d     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x002b
            r3.mo225f(r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.agk.mo225f(agm):void");
    }

    /* renamed from: e */
    public final void mo223e(agm agm) {
        synchronized (this.f294c) {
            if (agm.equals(this.f292a)) {
                this.f296e = agn.SUCCESS;
            } else if (agm.equals(this.f293b)) {
                this.f297f = agn.SUCCESS;
            }
            ago ago = this.f295d;
            if (ago != null) {
                ago.mo223e(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo219c() {
        synchronized (this.f294c) {
            if (this.f296e == agn.RUNNING) {
                this.f296e = agn.PAUSED;
                this.f292a.mo219c();
            }
            if (this.f297f == agn.RUNNING) {
                this.f297f = agn.PAUSED;
                this.f293b.mo219c();
            }
        }
    }
}
