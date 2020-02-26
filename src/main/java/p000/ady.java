package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: ady */
/* compiled from: PG */
public abstract class ady implements C0619ww, C0614wr {

    /* renamed from: a */
    public final Drawable f164a;

    public ady(Drawable drawable) {
        this.f164a = (Drawable) aic.m542a(drawable);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo33b() {
        Drawable.ConstantState constantState = this.f164a.getConstantState();
        return constantState == null ? this.f164a : constantState.newDrawable();
    }

    /* renamed from: e */
    public void mo41e() {
        Drawable drawable = this.f164a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof aeh) {
            ((aeh) drawable).mo98a().prepareToDraw();
        }
    }
}
