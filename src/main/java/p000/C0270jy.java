package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: jy */
/* compiled from: PG */
public class C0270jy extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public C0285km f9717a;

    /* renamed from: b */
    public final Rect f9718b = new Rect();

    /* renamed from: c */
    public boolean f9719c = true;

    /* renamed from: d */
    public boolean f9720d = false;

    public C0270jy() {
        super(-2, -2);
    }

    public C0270jy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0270jy(C0270jy jyVar) {
        super((ViewGroup.LayoutParams) jyVar);
    }

    public C0270jy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0270jy(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    /* renamed from: d */
    public final int mo5389d() {
        return this.f9717a.mo5436d();
    }

    /* renamed from: c */
    public final int mo5388c() {
        return this.f9717a.mo5435c();
    }

    /* renamed from: b */
    public final boolean mo5387b() {
        return this.f9717a.mo5453t();
    }

    /* renamed from: a */
    public final boolean mo5386a() {
        return this.f9717a.mo5445m();
    }
}
