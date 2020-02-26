package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: jy  reason: default package */
/* compiled from: PG */
public class jy extends ViewGroup.MarginLayoutParams {
    public km a;
    public final Rect b = new Rect();
    public boolean c = true;
    public boolean d = false;

    public jy() {
        super(-2, -2);
    }

    public jy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jy(jy jyVar) {
        super((ViewGroup.LayoutParams) jyVar);
    }

    public jy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public jy(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public final int d() {
        return this.a.d();
    }

    public final int c() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.t();
    }

    public final boolean a() {
        return this.a.m();
    }
}
