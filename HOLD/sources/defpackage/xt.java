package defpackage;

import android.graphics.Bitmap;

/* renamed from: xt  reason: default package */
/* compiled from: PG */
final class xt implements xr {
    public int a;
    public Bitmap.Config b;
    private final xu c;

    public xt(xu xuVar) {
        this.c = xuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xt) {
            xt xtVar = (xt) obj;
            if (this.a != xtVar.a || !aie.a(this.b, xtVar.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final void a() {
        this.c.a(this);
    }

    public final String toString() {
        return xv.a(this.a, this.b);
    }
}
