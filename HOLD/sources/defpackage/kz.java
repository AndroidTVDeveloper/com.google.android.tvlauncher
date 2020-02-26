package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: kz  reason: default package */
/* compiled from: PG */
public final class kz {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private kz(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final ColorStateList d(int i) {
        int resourceId;
        ColorStateList a2;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a2 = es.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a2;
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final Drawable a(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return this.b.getDrawable(i);
        }
        return es.b(this.a, resourceId);
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int b(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int f(int i) {
        return this.b.getLayoutDimension(i, 0);
    }

    public final int e(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final String c(int i) {
        return this.b.getString(i);
    }

    public final CharSequence b(int i) {
        return this.b.getText(i);
    }

    public final boolean e(int i) {
        return this.b.hasValue(i);
    }

    public static kz a(Context context, int i, int[] iArr) {
        return new kz(context, context.obtainStyledAttributes(i, iArr));
    }

    public static kz a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new kz(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static kz a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new kz(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final void a() {
        this.b.recycle();
    }
}
