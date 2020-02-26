package p000;

import android.graphics.Paint;

/* renamed from: sa */
/* compiled from: PG */
final class C0489sa extends C0491sc {

    /* renamed from: a */
    public C0022au f10297a;

    /* renamed from: b */
    public float f10298b = 0.0f;

    /* renamed from: c */
    public C0022au f10299c;

    /* renamed from: d */
    public float f10300d = 1.0f;

    /* renamed from: e */
    public float f10301e = 1.0f;

    /* renamed from: f */
    public float f10302f = 0.0f;

    /* renamed from: g */
    public float f10303g = 1.0f;

    /* renamed from: h */
    public float f10304h = 0.0f;

    /* renamed from: i */
    public Paint.Cap f10305i = Paint.Cap.BUTT;

    /* renamed from: j */
    public Paint.Join f10306j = Paint.Join.MITER;

    /* renamed from: k */
    public float f10307k = 4.0f;

    public C0489sa() {
    }

    /* access modifiers changed from: package-private */
    public float getFillAlpha() {
        return this.f10301e;
    }

    /* access modifiers changed from: package-private */
    public int getFillColor() {
        return this.f10299c.f2415b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeAlpha() {
        return this.f10300d;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeColor() {
        return this.f10297a.f2415b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeWidth() {
        return this.f10298b;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathEnd() {
        return this.f10303g;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathOffset() {
        return this.f10304h;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathStart() {
        return this.f10302f;
    }

    public C0489sa(C0489sa saVar) {
        super(saVar);
        this.f10297a = saVar.f10297a;
        this.f10298b = saVar.f10298b;
        this.f10300d = saVar.f10300d;
        this.f10299c = saVar.f10299c;
        this.f10321n = saVar.f10321n;
        this.f10301e = saVar.f10301e;
        this.f10302f = saVar.f10302f;
        this.f10303g = saVar.f10303g;
        this.f10304h = saVar.f10304h;
        this.f10305i = saVar.f10305i;
        this.f10306j = saVar.f10306j;
        this.f10307k = saVar.f10307k;
    }

    /* renamed from: b */
    public final boolean mo2363b() {
        return this.f10299c.mo1358b() || this.f10297a.mo1358b();
    }

    /* renamed from: a */
    public final boolean mo2362a(int[] iArr) {
        return this.f10297a.mo1357a(iArr) | this.f10299c.mo1357a(iArr);
    }

    /* access modifiers changed from: package-private */
    public void setFillAlpha(float f) {
        this.f10301e = f;
    }

    /* access modifiers changed from: package-private */
    public void setFillColor(int i) {
        this.f10299c.f2415b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeAlpha(float f) {
        this.f10300d = f;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(int i) {
        this.f10297a.f2415b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(float f) {
        this.f10298b = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathEnd(float f) {
        this.f10303g = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathOffset(float f) {
        this.f10304h = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathStart(float f) {
        this.f10302f = f;
    }
}
