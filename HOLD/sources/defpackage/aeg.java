package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: aeg  reason: default package */
/* compiled from: PG */
final class aeg extends Drawable.ConstantState {
    public final aeo a;

    public aeg(aeo aeo) {
        this.a = aeo;
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
