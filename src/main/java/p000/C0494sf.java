package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: sf */
/* compiled from: PG */
final class C0494sf extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f10350a;

    public C0494sf(Drawable.ConstantState constantState) {
        this.f10350a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f10350a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f10350a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C0495sg sgVar = new C0495sg();
        sgVar.f10288a = (VectorDrawable) this.f10350a.newDrawable();
        return sgVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C0495sg sgVar = new C0495sg();
        sgVar.f10288a = (VectorDrawable) this.f10350a.newDrawable(resources);
        return sgVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0495sg sgVar = new C0495sg();
        sgVar.f10288a = (VectorDrawable) this.f10350a.newDrawable(resources, theme);
        return sgVar;
    }
}
