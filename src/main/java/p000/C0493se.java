package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: se */
/* compiled from: PG */
final class C0493se extends Drawable.ConstantState {

    /* renamed from: a */
    public int f10338a;

    /* renamed from: b */
    public C0492sd f10339b;

    /* renamed from: c */
    public ColorStateList f10340c;

    /* renamed from: d */
    public PorterDuff.Mode f10341d;

    /* renamed from: e */
    public boolean f10342e;

    /* renamed from: f */
    public Bitmap f10343f;

    /* renamed from: g */
    public ColorStateList f10344g;

    /* renamed from: h */
    public PorterDuff.Mode f10345h;

    /* renamed from: i */
    public int f10346i;

    /* renamed from: j */
    public boolean f10347j;

    /* renamed from: k */
    public boolean f10348k;

    /* renamed from: l */
    public Paint f10349l;

    public C0493se() {
        this.f10340c = null;
        this.f10341d = C0495sg.f10351b;
        this.f10339b = new C0492sd();
    }

    public int getChangingConfigurations() {
        return this.f10338a;
    }

    public C0493se(C0493se seVar) {
        this.f10340c = null;
        this.f10341d = C0495sg.f10351b;
        if (seVar != null) {
            this.f10338a = seVar.f10338a;
            this.f10339b = new C0492sd(seVar.f10339b);
            Paint paint = seVar.f10339b.f10324c;
            if (paint != null) {
                this.f10339b.f10324c = new Paint(paint);
            }
            Paint paint2 = seVar.f10339b.f10323b;
            if (paint2 != null) {
                this.f10339b.f10323b = new Paint(paint2);
            }
            this.f10340c = seVar.f10340c;
            this.f10341d = seVar.f10341d;
            this.f10342e = seVar.f10342e;
        }
    }

    /* renamed from: a */
    public final boolean mo5885a() {
        C0492sd sdVar = this.f10339b;
        if (sdVar.f10331j == null) {
            sdVar.f10331j = Boolean.valueOf(sdVar.f10325d.mo2363b());
        }
        return sdVar.f10331j.booleanValue();
    }

    public final Drawable newDrawable() {
        return new C0495sg(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0495sg(this);
    }

    /* renamed from: a */
    public final void mo5884a(int i, int i2) {
        this.f10343f.eraseColor(0);
        Canvas canvas = new Canvas(this.f10343f);
        C0492sd sdVar = this.f10339b;
        sdVar.mo5879a(sdVar.f10325d, C0492sd.f10322a, canvas, i, i2);
    }
}
