package defpackage;

/* renamed from: axo  reason: default package */
/* compiled from: PG */
final class axo implements axx {
    public final int a;
    private final /* synthetic */ axq b;

    public axo(axq axq, int i) {
        this.b = axq;
        this.a = i;
    }

    public final boolean a() {
        axq axq = this.b;
        return !axq.i() && axq.n[this.a].b(axq.y);
    }

    public final void b() {
        axq axq = this.b;
        axq.n[this.a].c();
        axq.h();
    }

    public final int a(aki aki, anj anj, boolean z) {
        axq axq = this.b;
        int i = this.a;
        if (axq.i()) {
            return -3;
        }
        axq.a(i);
        int a2 = axq.n[i].a(aki, anj, z, axq.y, axq.x);
        if (a2 != -3) {
            return a2;
        }
        axq.b(i);
        return -3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    public final int a(long j) {
        int i;
        axq axq = this.b;
        int i2 = this.a;
        if (axq.i()) {
            return 0;
        }
        axq.a(i2);
        axw axw = axq.n[i2];
        if (!axq.y || j <= axw.h()) {
            i = axw.a(j, true);
            if (i == -1) {
                i = 0;
            }
        } else {
            i = axw.m();
        }
        if (i != 0) {
            return i;
        }
        axq.b(i2);
        return 0;
    }
}
