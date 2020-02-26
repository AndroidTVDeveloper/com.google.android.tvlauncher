package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: au  reason: default package */
/* compiled from: PG */
public final class au {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public au(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public final boolean a() {
        return this.a != null;
    }

    public static au a(int i) {
        return new au(null, null, i);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.c) != null && colorStateList.isStateful();
    }

    public final boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }

    public final boolean c() {
        return a() || this.b != 0;
    }
}
