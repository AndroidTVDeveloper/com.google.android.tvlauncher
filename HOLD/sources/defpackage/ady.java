package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: ady  reason: default package */
/* compiled from: PG */
public abstract class ady implements ww, wr {
    public final Drawable a;

    public ady(Drawable drawable) {
        this.a = (Drawable) aic.a(drawable);
    }

    public final /* bridge */ /* synthetic */ Object b() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }

    public void e() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof aeh) {
            ((aeh) drawable).a().prepareToDraw();
        }
    }
}
