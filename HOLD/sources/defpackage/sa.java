package defpackage;

import android.graphics.Paint;

/* renamed from: sa  reason: default package */
/* compiled from: PG */
final class sa extends sc {
    public au a;
    public float b = 0.0f;
    public au c;
    public float d = 1.0f;
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public Paint.Cap i = Paint.Cap.BUTT;
    public Paint.Join j = Paint.Join.MITER;
    public float k = 4.0f;

    public sa() {
    }

    /* access modifiers changed from: package-private */
    public float getFillAlpha() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public int getFillColor() {
        return this.c.b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeAlpha() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeColor() {
        return this.a.b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeWidth() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathEnd() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathOffset() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathStart() {
        return this.f;
    }

    public sa(sa saVar) {
        super(saVar);
        this.a = saVar.a;
        this.b = saVar.b;
        this.d = saVar.d;
        this.c = saVar.c;
        this.n = saVar.n;
        this.e = saVar.e;
        this.f = saVar.f;
        this.g = saVar.g;
        this.h = saVar.h;
        this.i = saVar.i;
        this.j = saVar.j;
        this.k = saVar.k;
    }

    public final boolean b() {
        return this.c.b() || this.a.b();
    }

    public final boolean a(int[] iArr) {
        return this.a.a(iArr) | this.c.a(iArr);
    }

    /* access modifiers changed from: package-private */
    public void setFillAlpha(float f2) {
        this.e = f2;
    }

    /* access modifiers changed from: package-private */
    public void setFillColor(int i2) {
        this.c.b = i2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeAlpha(float f2) {
        this.d = f2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(int i2) {
        this.a.b = i2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(float f2) {
        this.b = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathEnd(float f2) {
        this.g = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathOffset(float f2) {
        this.h = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathStart(float f2) {
        this.f = f2;
    }
}
