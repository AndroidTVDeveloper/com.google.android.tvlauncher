package p000;

import android.graphics.drawable.Drawable;

/* renamed from: adz */
/* compiled from: PG */
final class adz extends ady {
    private adz(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: d */
    public final void mo35d() {
    }

    /* renamed from: a */
    public final Class mo32a() {
        return this.f164a.getClass();
    }

    /* renamed from: c */
    public final int mo34c() {
        return Math.max(1, (this.f164a.getIntrinsicWidth() * this.f164a.getIntrinsicHeight()) << 2);
    }

    /* renamed from: a */
    static C0619ww m226a(Drawable drawable) {
        if (drawable != null) {
            return new adz(drawable);
        }
        return null;
    }
}
