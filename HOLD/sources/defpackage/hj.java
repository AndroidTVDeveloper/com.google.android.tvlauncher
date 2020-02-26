package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: hj  reason: default package */
/* compiled from: PG */
public final class hj {
    public final TextView a;
    public final hl b;
    public Typeface c;
    public boolean d;
    private kx e;
    private kx f;
    private kx g;
    private kx h;
    private kx i;
    private kx j;
    private int k = 0;
    private int l = -1;

    public hj(TextView textView) {
        this.a = textView;
        this.b = new hl(this.a);
    }

    private final void a(Drawable drawable, kx kxVar) {
        if (drawable != null && kxVar != null) {
            ha.a(drawable, kxVar, this.a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!(this.e == null && this.f == null && this.g == null && this.h == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.e);
            a(compoundDrawables[1], this.f);
            a(compoundDrawables[2], this.g);
            a(compoundDrawables[3], this.h);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (this.i != null || this.j != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.i);
            a(compoundDrawablesRelative[2], this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.b.f();
    }

    private static kx a(Context context, ha haVar, int i2) {
        ColorStateList b2 = haVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        kx kxVar = new kx();
        kxVar.d = true;
        kxVar.a = b2;
        return kxVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.b.g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public final void a(AttributeSet attributeSet, int i2) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str3;
        Drawable drawable;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        Context context = this.a.getContext();
        ha a2 = ha.a();
        kz a3 = kz.a(context, attributeSet2, er.f, i3);
        int e2 = a3.e(0, -1);
        if (a3.e(3)) {
            this.e = a(context, a2, a3.e(3, 0));
        }
        if (a3.e(1)) {
            this.f = a(context, a2, a3.e(1, 0));
        }
        if (a3.e(4)) {
            this.g = a(context, a2, a3.e(4, 0));
        }
        if (a3.e(2)) {
            this.h = a(context, a2, a3.e(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (a3.e(5)) {
            this.i = a(context, a2, a3.e(5, 0));
        }
        if (a3.e(6)) {
            this.j = a(context, a2, a3.e(6, 0));
        }
        a3.a();
        boolean z5 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (e2 == -1) {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        } else {
            kz a4 = kz.a(context, e2, er.r);
            if (!z5 && a4.e(14)) {
                z = a4.a(14, false);
                z2 = true;
            } else {
                z2 = false;
                z = false;
            }
            a(context, a4);
            int i5 = Build.VERSION.SDK_INT;
            if (a4.e(15)) {
                str2 = a4.c(15);
            } else {
                str2 = null;
            }
            int i6 = Build.VERSION.SDK_INT;
            str = a4.e(13) ? a4.c(13) : null;
            a4.a();
        }
        kz a5 = kz.a(context, attributeSet2, er.r, i3);
        if (z5 || !a5.e(14)) {
            boolean z6 = z;
            z3 = z2;
            z4 = z6;
        } else {
            z4 = a5.a(14, false);
            z3 = true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (a5.e(15)) {
            str2 = a5.c(15);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (a5.e(13)) {
            str3 = a5.c(13);
        } else {
            str3 = str;
        }
        if (Build.VERSION.SDK_INT >= 28 && a5.e(0) && a5.d(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a5);
        a5.a();
        if (!z5 && z3) {
            a(z4);
        }
        Typeface typeface = this.c;
        if (typeface != null) {
            if (this.l == -1) {
                this.a.setTypeface(typeface, this.k);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            this.a.setFontVariationSettings(str3);
        }
        if (str2 != null) {
            int i9 = Build.VERSION.SDK_INT;
            this.a.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        hl hlVar = this.b;
        TypedArray obtainStyledAttributes = hlVar.h.obtainStyledAttributes(attributeSet2, er.g, i3, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            hlVar.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr[i10] = obtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                hlVar.f = hl.a(iArr);
                hlVar.d();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!hlVar.h()) {
            hlVar.a = 0;
        } else if (hlVar.a == 1) {
            if (!hlVar.g) {
                DisplayMetrics displayMetrics = hlVar.h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                hlVar.a(dimension2, dimension3, dimension);
            }
            hlVar.e();
        }
        if (ek.a) {
            hl hlVar2 = this.b;
            if (hlVar2.a != 0) {
                int[] iArr2 = hlVar2.f;
                if (iArr2.length > 0) {
                    if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.a.setAutoSizeTextTypeUniformWithConfiguration(this.b.b(), this.b.c(), this.b.a(), 0);
                    } else {
                        this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        kz a6 = kz.a(context, attributeSet2, er.g);
        int e3 = a6.e(8, -1);
        Drawable a7 = e3 != -1 ? a2.a(context, e3) : null;
        int e4 = a6.e(13, -1);
        Drawable a8 = e4 != -1 ? a2.a(context, e4) : null;
        int e5 = a6.e(9, -1);
        Drawable a9 = e5 != -1 ? a2.a(context, e5) : null;
        int e6 = a6.e(6, -1);
        Drawable a10 = e6 != -1 ? a2.a(context, e6) : null;
        int e7 = a6.e(10, -1);
        Drawable a11 = e7 != -1 ? a2.a(context, e7) : null;
        int e8 = a6.e(7, -1);
        if (e8 != -1) {
            drawable = a2.a(context, e8);
        } else {
            drawable = null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (a11 != null || drawable != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (a11 == null) {
                a11 = compoundDrawablesRelative[0];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[1];
            }
            if (drawable == null) {
                drawable = compoundDrawablesRelative[2];
            }
            if (a10 == null) {
                a10 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a11, a8, drawable, a10);
        } else if (!(a7 == null && a8 == null && a9 == null && a10 == null)) {
            int i12 = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            Drawable drawable2 = compoundDrawablesRelative2[0];
            if (drawable2 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                TextView textView2 = this.a;
                if (a7 == null) {
                    a7 = compoundDrawables[0];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[1];
                }
                if (a9 == null) {
                    a9 = compoundDrawables[2];
                }
                if (a10 == null) {
                    a10 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(a7, a8, a9, a10);
            } else {
                TextView textView3 = this.a;
                if (a8 == null) {
                    a8 = compoundDrawablesRelative2[1];
                }
                Drawable drawable3 = compoundDrawablesRelative2[2];
                if (a10 == null) {
                    a10 = compoundDrawablesRelative2[3];
                }
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, a8, drawable3, a10);
            }
        }
        if (a6.e(11)) {
            ColorStateList d2 = a6.d(11);
            TextView textView4 = this.a;
            dc.a(textView4);
            int i13 = Build.VERSION.SDK_INT;
            textView4.setCompoundDrawableTintList(d2);
        }
        if (a6.e(12)) {
            PorterDuff.Mode a12 = ib.a(a6.a(12, -1), null);
            TextView textView5 = this.a;
            dc.a(textView5);
            int i14 = Build.VERSION.SDK_INT;
            textView5.setCompoundDrawableTintMode(a12);
        }
        int d3 = a6.d(14, -1);
        int d4 = a6.d(17, -1);
        int d5 = a6.d(18, -1);
        a6.a();
        if (d3 != -1) {
            hc.a(this.a, d3);
        }
        if (d4 != -1) {
            hc.b(this.a, d4);
        }
        if (d5 != -1) {
            hc.c(this.a, d5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    /* access modifiers changed from: package-private */
    public final void a(Context context, int i2) {
        String c2;
        kz a2 = kz.a(context, i2, er.r);
        if (a2.e(14)) {
            a(a2.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (a2.e(0) && a2.d(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a2);
        int i4 = Build.VERSION.SDK_INT;
        if (a2.e(13) && (c2 = a2.c(13)) != null) {
            this.a.setFontVariationSettings(c2);
        }
        a2.a();
        Typeface typeface = this.c;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.k);
        }
    }

    private final void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    private final void a(Context context, kz kzVar) {
        String c2;
        boolean z;
        kz kzVar2 = kzVar;
        int[] iArr = er.a;
        this.k = kzVar2.a(2, this.k);
        if (Build.VERSION.SDK_INT >= 28) {
            int a2 = kzVar2.a(11, -1);
            this.l = a2;
            if (a2 != -1) {
                this.k &= 2;
            }
        }
        int i2 = 12;
        boolean z2 = false;
        if (kzVar2.e(10) || kzVar2.e(12)) {
            Typeface typeface = null;
            this.c = null;
            if (!kzVar2.e(12)) {
                i2 = 10;
            }
            int i3 = this.l;
            int i4 = this.k;
            if (!context.isRestricted()) {
                bc bcVar = new bc(this, i3, i4);
                try {
                    int i5 = this.k;
                    int resourceId = kzVar2.b.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (kzVar2.c == null) {
                            kzVar2.c = new TypedValue();
                        }
                        Context context2 = kzVar2.a;
                        TypedValue typedValue = kzVar2.c;
                        if (!context2.isRestricted()) {
                            Resources resources = context2.getResources();
                            resources.getValue(resourceId, typedValue, true);
                            typeface = hc.a(context2, resources, typedValue, resourceId, i5, bcVar);
                        }
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                            this.c = typeface;
                        } else {
                            Typeface create = Typeface.create(typeface, 0);
                            int i6 = this.l;
                            if ((this.k & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.c = Typeface.create(create, i6, z);
                        }
                    }
                    this.d = this.c == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
                }
            }
            if (this.c == null && (c2 = kzVar2.c(i2)) != null) {
                if (Build.VERSION.SDK_INT >= 28 && this.l != -1) {
                    Typeface create2 = Typeface.create(c2, 0);
                    int i7 = this.l;
                    if ((2 & this.k) != 0) {
                        z2 = true;
                    }
                    this.c = Typeface.create(create2, i7, z2);
                    return;
                }
                this.c = Typeface.create(c2, this.k);
            }
        } else if (kzVar2.e(1)) {
            this.d = false;
            int a3 = kzVar2.a(1, 1);
            if (a3 == 1) {
                this.c = Typeface.SANS_SERIF;
            } else if (a3 == 2) {
                this.c = Typeface.SERIF;
            } else if (a3 == 3) {
                this.c = Typeface.MONOSPACE;
            }
        }
    }
}
