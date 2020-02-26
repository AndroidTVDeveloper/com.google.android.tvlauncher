package p000;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: au */
/* compiled from: PG */
public final class C0022au {

    /* renamed from: a */
    public final Shader f2414a;

    /* renamed from: b */
    public int f2415b;

    /* renamed from: c */
    private final ColorStateList f2416c;

    public C0022au(Shader shader, ColorStateList colorStateList, int i) {
        this.f2414a = shader;
        this.f2416c = colorStateList;
        this.f2415b = i;
    }

    /* renamed from: a */
    public final boolean mo1356a() {
        return this.f2414a != null;
    }

    /* renamed from: a */
    public static C0022au m2143a(int i) {
        return new C0022au(null, null, i);
    }

    /* renamed from: b */
    public final boolean mo1358b() {
        ColorStateList colorStateList;
        return this.f2414a == null && (colorStateList = this.f2416c) != null && colorStateList.isStateful();
    }

    /* renamed from: a */
    public final boolean mo1357a(int[] iArr) {
        if (!mo1358b()) {
            return false;
        }
        ColorStateList colorStateList = this.f2416c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f2415b) {
            return false;
        }
        this.f2415b = colorForState;
        return true;
    }

    /* renamed from: c */
    public final boolean mo1359c() {
        return mo1356a() || this.f2415b != 0;
    }
}
