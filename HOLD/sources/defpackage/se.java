package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: se  reason: default package */
/* compiled from: PG */
final class se extends Drawable.ConstantState {
    public int a;
    public sd b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public se() {
        this.c = null;
        this.d = sg.b;
        this.b = new sd();
    }

    public int getChangingConfigurations() {
        return this.a;
    }

    public se(se seVar) {
        this.c = null;
        this.d = sg.b;
        if (seVar != null) {
            this.a = seVar.a;
            this.b = new sd(seVar.b);
            Paint paint = seVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = seVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = seVar.c;
            this.d = seVar.d;
            this.e = seVar.e;
        }
    }

    public final boolean a() {
        sd sdVar = this.b;
        if (sdVar.j == null) {
            sdVar.j = Boolean.valueOf(sdVar.d.b());
        }
        return sdVar.j.booleanValue();
    }

    public final Drawable newDrawable() {
        return new sg(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new sg(this);
    }

    public final void a(int i2, int i3) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        sd sdVar = this.b;
        sdVar.a(sdVar.d, sd.a, canvas, i2, i3);
    }
}
