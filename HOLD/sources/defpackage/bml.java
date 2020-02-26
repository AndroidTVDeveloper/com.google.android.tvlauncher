package defpackage;

/* renamed from: bml  reason: default package */
/* compiled from: PG */
public final class bml extends aiz {
    private final anj f = new anj(1);
    private final bky g = new bky();
    private long h;

    public bml() {
        super(5);
    }

    public final void a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void a(akh[] akhArr, long j) {
    }

    public final boolean v() {
        return true;
    }

    public final boolean w() {
        return g();
    }

    /* access modifiers changed from: protected */
    public final void r() {
        x();
    }

    /* access modifiers changed from: protected */
    public final void a(long j, boolean z) {
        x();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, anj, int]
     candidates:
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    public final void a(long j, long j2) {
        while (!g() && this.h < 100000 + j) {
            this.f.a();
            if (a(t(), this.f, false) == -4 && !this.f.c()) {
                this.f.g();
                this.h = this.f.d;
            } else {
                return;
            }
        }
    }

    private final void x() {
        this.h = 0;
    }

    public final int a(akh akh) {
        return "application/x-camera-motion".equals(akh.i) ? 4 : 0;
    }
}
