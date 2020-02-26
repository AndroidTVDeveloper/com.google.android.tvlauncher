package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: aeg */
/* compiled from: PG */
final class aeg extends Drawable.ConstantState {

    /* renamed from: a */
    public final aeo f174a;

    public aeg(aeo aeo) {
        this.f174a = aeo;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new aeh(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }
}
