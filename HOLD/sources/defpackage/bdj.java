package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: bdj  reason: default package */
/* compiled from: PG */
public class bdj {
    public static final bdj a = new bdj("");
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;

    public bdj(Bitmap bitmap, float f2, float f3, int i2, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i2, f2, 0, Integer.MIN_VALUE, -3.4028235E38f, f4, f5, false, -16777216);
    }

    public bdj(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    public bdj(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public bdj(CharSequence charSequence, float f2, int i2, int i3, float f3, float f4, int i4, float f5) {
        this(charSequence, null, null, f2, i2, i3, f3, Integer.MIN_VALUE, i4, f5, f4, -3.4028235E38f, false, -16777216);
    }

    public bdj(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, f4, -3.4028235E38f, z, i5);
    }

    private bdj(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.b = charSequence;
        this.c = alignment;
        this.d = bitmap;
        this.e = f2;
        this.f = i2;
        this.g = i3;
        this.h = f3;
        this.i = i4;
        this.j = f5;
        this.k = f6;
        this.l = z;
        this.m = i6;
        this.n = i5;
        this.o = f4;
    }
}
