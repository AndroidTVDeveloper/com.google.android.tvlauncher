package p000;

/* renamed from: bml */
/* compiled from: PG */
public final class bml extends aiz {

    /* renamed from: f */
    private final anj f4412f = new anj(1);

    /* renamed from: g */
    private final bky f4413g = new bky();

    /* renamed from: h */
    private long f4414h;

    public bml() {
        super(5);
    }

    /* renamed from: a */
    public final void mo347a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo352a(akh[] akhArr, long j) {
    }

    /* renamed from: v */
    public final boolean mo485v() {
        return true;
    }

    /* renamed from: w */
    public final boolean mo486w() {
        return mo359g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo370r() {
        m3750x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo349a(long j, boolean z) {
        m3750x();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, anj, int]
     candidates:
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    /* renamed from: a */
    public final void mo484a(long j, long j2) {
        while (!mo359g() && this.f4414h < 100000 + j) {
            this.f4412f.mo1139a();
            if (mo345a(mo372t(), this.f4412f, false) == -4 && !this.f4412f.mo1141c()) {
                this.f4412f.mo1152g();
                this.f4414h = this.f4412f.f1426d;
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private final void m3750x() {
        this.f4414h = 0;
    }

    /* renamed from: a */
    public final int mo487a(akh akh) {
        return "application/x-camera-motion".equals(akh.f556i) ? 4 : 0;
    }
}
