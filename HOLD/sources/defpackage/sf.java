package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: sf  reason: default package */
/* compiled from: PG */
final class sf extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public sf(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        sg sgVar = new sg();
        sgVar.a = (VectorDrawable) this.a.newDrawable();
        return sgVar;
    }

    public final Drawable newDrawable(Resources resources) {
        sg sgVar = new sg();
        sgVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return sgVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        sg sgVar = new sg();
        sgVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return sgVar;
    }
}
