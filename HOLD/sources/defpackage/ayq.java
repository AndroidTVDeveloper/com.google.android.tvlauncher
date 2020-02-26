package defpackage;

/* renamed from: ayq  reason: default package */
/* compiled from: PG */
public final class ayq implements axx {
    public final ays a;
    private final axw b;
    private final int c;
    private boolean d;
    private final /* synthetic */ ays e;

    public ayq(ays ays, ays ays2, axw axw, int i) {
        this.e = ays;
        this.a = ays2;
        this.b = axw;
        this.c = i;
    }

    public final void b() {
    }

    public final boolean a() {
        return !this.e.h() && this.b.b(this.e.j);
    }

    private final void d() {
        if (!this.d) {
            ays ays = this.e;
            ays.f.b(ays.h);
            this.d = true;
        }
    }

    public final int a(aki aki, anj anj, boolean z) {
        if (this.e.h()) {
            return -3;
        }
        d();
        axw axw = this.b;
        ays ays = this.e;
        return axw.a(aki, anj, z, ays.j, ays.i);
    }

    public final void c() {
        bks.b(this.e.d[this.c]);
        this.e.d[this.c] = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final int a(long j) {
        if (this.e.h()) {
            return 0;
        }
        d();
        if (this.e.j && j > this.b.h()) {
            return this.b.m();
        }
        int a2 = this.b.a(j, true);
        if (a2 == -1) {
            return 0;
        }
        return a2;
    }
}
