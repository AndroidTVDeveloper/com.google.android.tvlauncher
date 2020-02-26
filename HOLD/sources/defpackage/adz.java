package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: adz  reason: default package */
/* compiled from: PG */
final class adz extends ady {
    private adz(Drawable drawable) {
        super(drawable);
    }

    public final void d() {
    }

    public final Class a() {
        return this.a.getClass();
    }

    public final int c() {
        return Math.max(1, (this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight()) << 2);
    }

    static ww a(Drawable drawable) {
        if (drawable != null) {
            return new adz(drawable);
        }
        return null;
    }
}
