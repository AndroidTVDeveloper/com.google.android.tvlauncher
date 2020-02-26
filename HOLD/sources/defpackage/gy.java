package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: gy  reason: default package */
/* compiled from: PG */
final class gy {
    private final View a;
    private final ha b;
    private int c = -1;
    private kx d;
    private kx e;

    public gy(View view) {
        this.a = view;
        this.b = ha.a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.d != null) {
                if (this.e == null) {
                    this.e = new kx();
                }
                kx kxVar = this.e;
                kxVar.a = null;
                kxVar.d = false;
                kxVar.b = null;
                kxVar.c = false;
                ColorStateList k = dx.k(this.a);
                if (k != null) {
                    kxVar.d = true;
                    kxVar.a = k;
                }
                PorterDuff.Mode l = dx.l(this.a);
                if (l != null) {
                    kxVar.c = true;
                    kxVar.b = l;
                }
                if (kxVar.d || kxVar.c) {
                    ha.a(background, kxVar, this.a.getDrawableState());
                    return;
                }
            }
            kx kxVar2 = this.d;
            if (kxVar2 != null) {
                ha.a(background, kxVar2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i) {
        kz a2 = kz.a(this.a.getContext(), attributeSet, er.t, i);
        try {
            if (a2.e(0)) {
                this.c = a2.e(0, -1);
                ColorStateList b2 = this.b.b(this.a.getContext(), this.c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.e(1)) {
                dx.a(this.a, a2.d(1));
            }
            if (a2.e(2)) {
                dx.a(this.a, ib.a(a2.a(2, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        ColorStateList colorStateList;
        this.c = i;
        ha haVar = this.b;
        if (haVar != null) {
            colorStateList = haVar.b(this.a.getContext(), i);
        } else {
            colorStateList = null;
        }
        a(colorStateList);
        a();
    }

    private final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new kx();
            }
            kx kxVar = this.d;
            kxVar.a = colorStateList;
            kxVar.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
