package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cjf */
/* compiled from: PG */
final class cjf extends ady {
    public cjf(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public final Class mo32a() {
        return Drawable.class;
    }

    /* renamed from: d */
    public final void mo35d() {
    }

    /* renamed from: c */
    public final int mo34c() {
        Drawable drawable = this.f164a;
        if (drawable instanceof BitmapDrawable) {
            return aie.m555a(((BitmapDrawable) drawable).getBitmap());
        }
        return 102400;
    }
}
