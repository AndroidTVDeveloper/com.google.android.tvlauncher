package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: kz */
/* compiled from: PG */
public final class C0298kz {

    /* renamed from: a */
    public final Context f9833a;

    /* renamed from: b */
    public final TypedArray f9834b;

    /* renamed from: c */
    public TypedValue f9835c;

    private C0298kz(Context context, TypedArray typedArray) {
        this.f9833a = context;
        this.f9834b = typedArray;
    }

    /* renamed from: a */
    public final boolean mo5514a(int i, boolean z) {
        return this.f9834b.getBoolean(i, z);
    }

    /* renamed from: d */
    public final ColorStateList mo5520d(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.f9834b.hasValue(i) || (resourceId = this.f9834b.getResourceId(i, 0)) == 0 || (a = C0129es.m7261a(this.f9833a, resourceId)) == null) ? this.f9834b.getColorStateList(i) : a;
    }

    /* renamed from: c */
    public final int mo5517c(int i, int i2) {
        return this.f9834b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final int mo5519d(int i, int i2) {
        return this.f9834b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: a */
    public final Drawable mo5512a(int i) {
        int resourceId;
        if (!this.f9834b.hasValue(i) || (resourceId = this.f9834b.getResourceId(i, 0)) == 0) {
            return this.f9834b.getDrawable(i);
        }
        return C0129es.m7262b(this.f9833a, resourceId);
    }

    /* renamed from: a */
    public final int mo5511a(int i, int i2) {
        return this.f9834b.getInt(i, i2);
    }

    /* renamed from: b */
    public final int mo5515b(int i, int i2) {
        return this.f9834b.getInteger(i, i2);
    }

    /* renamed from: f */
    public final int mo5523f(int i) {
        return this.f9834b.getLayoutDimension(i, 0);
    }

    /* renamed from: e */
    public final int mo5521e(int i, int i2) {
        return this.f9834b.getResourceId(i, i2);
    }

    /* renamed from: c */
    public final String mo5518c(int i) {
        return this.f9834b.getString(i);
    }

    /* renamed from: b */
    public final CharSequence mo5516b(int i) {
        return this.f9834b.getText(i);
    }

    /* renamed from: e */
    public final boolean mo5522e(int i) {
        return this.f9834b.hasValue(i);
    }

    /* renamed from: a */
    public static C0298kz m7863a(Context context, int i, int[] iArr) {
        return new C0298kz(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0298kz m7864a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0298kz(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0298kz m7865a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0298kz(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: a */
    public final void mo5513a() {
        this.f9834b.recycle();
    }
}
