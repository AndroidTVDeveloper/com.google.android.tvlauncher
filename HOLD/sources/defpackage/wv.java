package defpackage;

/* renamed from: wv  reason: default package */
/* compiled from: PG */
final class wv implements ww, aik {
    private static final cz a = aim.a(20, new wu());
    private final ain b = ain.a();
    private ww c;
    private boolean d;
    private boolean e;

    public final ain P() {
        return this.b;
    }

    public final Object b() {
        return this.c.b();
    }

    public final Class a() {
        return this.c.a();
    }

    public final int c() {
        return this.c.c();
    }

    static wv a(ww wwVar) {
        wv wvVar = (wv) aic.a((wv) a.a());
        wvVar.e = false;
        wvVar.d = true;
        wvVar.c = wwVar;
        return wvVar;
    }

    public final synchronized void d() {
        this.b.b();
        this.e = true;
        if (!this.d) {
            this.c.d();
            this.c = null;
            a.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e() {
        this.b.b();
        if (this.d) {
            this.d = false;
            if (this.e) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
