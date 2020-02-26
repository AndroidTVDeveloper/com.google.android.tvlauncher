package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cjf  reason: default package */
/* compiled from: PG */
final class cjf extends ady {
    public cjf(Drawable drawable) {
        super(drawable);
    }

    public final Class a() {
        return Drawable.class;
    }

    public final void d() {
    }

    public final int c() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            return aie.a(((BitmapDrawable) drawable).getBitmap());
        }
        return 102400;
    }
}
