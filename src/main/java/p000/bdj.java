package p000;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: bdj */
/* compiled from: PG */
public class bdj {

    /* renamed from: a */
    public static final bdj f3406a = new bdj("");

    /* renamed from: b */
    public final CharSequence f3407b;

    /* renamed from: c */
    public final Layout.Alignment f3408c;

    /* renamed from: d */
    public final Bitmap f3409d;

    /* renamed from: e */
    public final float f3410e;

    /* renamed from: f */
    public final int f3411f;

    /* renamed from: g */
    public final int f3412g;

    /* renamed from: h */
    public final float f3413h;

    /* renamed from: i */
    public final int f3414i;

    /* renamed from: j */
    public final float f3415j;

    /* renamed from: k */
    public final float f3416k;

    /* renamed from: l */
    public final boolean f3417l;

    /* renamed from: m */
    public final int f3418m;

    /* renamed from: n */
    public final int f3419n;

    /* renamed from: o */
    public final float f3420o;

    public bdj(Bitmap bitmap, float f, float f2, int i, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i, f, 0, Integer.MIN_VALUE, -3.4028235E38f, f3, f4, false, -16777216);
    }

    public bdj(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    public bdj(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public bdj(CharSequence charSequence, float f, int i, int i2, float f2, float f3, int i3, float f4) {
        this(charSequence, null, null, f, i, i2, f2, Integer.MIN_VALUE, i3, f4, f3, -3.4028235E38f, false, -16777216);
    }

    public bdj(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, f3, -3.4028235E38f, z, i4);
    }

    private bdj(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f3407b = charSequence;
        this.f3408c = alignment;
        this.f3409d = bitmap;
        this.f3410e = f;
        this.f3411f = i;
        this.f3412g = i2;
        this.f3413h = f2;
        this.f3414i = i3;
        this.f3415j = f4;
        this.f3416k = f5;
        this.f3417l = z;
        this.f3418m = i5;
        this.f3419n = i4;
        this.f3420o = f3;
    }
}
