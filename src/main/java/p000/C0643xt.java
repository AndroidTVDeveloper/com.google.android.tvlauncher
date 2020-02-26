package p000;

import android.graphics.Bitmap;

/* renamed from: xt */
/* compiled from: PG */
final class C0643xt implements C0641xr {

    /* renamed from: a */
    public int f10793a;

    /* renamed from: b */
    public Bitmap.Config f10794b;

    /* renamed from: c */
    private final C0644xu f10795c;

    public C0643xt(C0644xu xuVar) {
        this.f10795c = xuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0643xt) {
            C0643xt xtVar = (C0643xt) obj;
            if (this.f10793a != xtVar.f10793a || !aie.m561a(this.f10794b, xtVar.f10794b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10793a * 31;
        Bitmap.Config config = this.f10794b;
        return i + (config != null ? config.hashCode() : 0);
    }

    /* renamed from: a */
    public final void mo6116a() {
        this.f10795c.mo6104a(this);
    }

    public final String toString() {
        return C0645xv.m8662a(this.f10793a, this.f10794b);
    }
}
