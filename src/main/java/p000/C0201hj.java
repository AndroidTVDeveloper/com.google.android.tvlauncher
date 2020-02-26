package p000;

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

/* renamed from: hj */
/* compiled from: PG */
public final class C0201hj {

    /* renamed from: a */
    public final TextView f9462a;

    /* renamed from: b */
    public final C0203hl f9463b;

    /* renamed from: c */
    public Typeface f9464c;

    /* renamed from: d */
    public boolean f9465d;

    /* renamed from: e */
    private C0296kx f9466e;

    /* renamed from: f */
    private C0296kx f9467f;

    /* renamed from: g */
    private C0296kx f9468g;

    /* renamed from: h */
    private C0296kx f9469h;

    /* renamed from: i */
    private C0296kx f9470i;

    /* renamed from: j */
    private C0296kx f9471j;

    /* renamed from: k */
    private int f9472k = 0;

    /* renamed from: l */
    private int f9473l = -1;

    public C0201hj(TextView textView) {
        this.f9462a = textView;
        this.f9463b = new C0203hl(this.f9462a);
    }

    /* renamed from: a */
    private final void m7497a(Drawable drawable, C0296kx kxVar) {
        if (drawable != null && kxVar != null) {
            C0192ha.m7479a(drawable, kxVar, this.f9462a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5137a() {
        if (!(this.f9466e == null && this.f9467f == null && this.f9468g == null && this.f9469h == null)) {
            Drawable[] compoundDrawables = this.f9462a.getCompoundDrawables();
            m7497a(compoundDrawables[0], this.f9466e);
            m7497a(compoundDrawables[1], this.f9467f);
            m7497a(compoundDrawables[2], this.f9468g);
            m7497a(compoundDrawables[3], this.f9469h);
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f9470i != null || this.f9471j != null) {
            Drawable[] compoundDrawablesRelative = this.f9462a.getCompoundDrawablesRelative();
            m7497a(compoundDrawablesRelative[0], this.f9470i);
            m7497a(compoundDrawablesRelative[2], this.f9471j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5140b() {
        this.f9463b.mo5180f();
    }

    /* renamed from: a */
    private static C0296kx m7495a(Context context, C0192ha haVar, int i) {
        ColorStateList b = haVar.mo5106b(context, i);
        if (b == null) {
            return null;
        }
        C0296kx kxVar = new C0296kx();
        kxVar.f9832d = true;
        kxVar.f9829a = b;
        return kxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5141c() {
        return this.f9463b.mo5181g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    /* renamed from: a */
    public final void mo5139a(AttributeSet attributeSet, int i) {
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
        int i2 = i;
        Context context = this.f9462a.getContext();
        C0192ha a = C0192ha.m7478a();
        C0298kz a2 = C0298kz.m7865a(context, attributeSet2, C0128er.f9168f, i2);
        int e = a2.mo5521e(0, -1);
        if (a2.mo5522e(3)) {
            this.f9466e = m7495a(context, a, a2.mo5521e(3, 0));
        }
        if (a2.mo5522e(1)) {
            this.f9467f = m7495a(context, a, a2.mo5521e(1, 0));
        }
        if (a2.mo5522e(4)) {
            this.f9468g = m7495a(context, a, a2.mo5521e(4, 0));
        }
        if (a2.mo5522e(2)) {
            this.f9469h = m7495a(context, a, a2.mo5521e(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (a2.mo5522e(5)) {
            this.f9470i = m7495a(context, a, a2.mo5521e(5, 0));
        }
        if (a2.mo5522e(6)) {
            this.f9471j = m7495a(context, a, a2.mo5521e(6, 0));
        }
        a2.mo5513a();
        boolean z5 = this.f9462a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (e == -1) {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        } else {
            C0298kz a3 = C0298kz.m7863a(context, e, C0128er.f9180r);
            if (!z5 && a3.mo5522e(14)) {
                z = a3.mo5514a(14, false);
                z2 = true;
            } else {
                z2 = false;
                z = false;
            }
            m7496a(context, a3);
            int i4 = Build.VERSION.SDK_INT;
            if (a3.mo5522e(15)) {
                str2 = a3.mo5518c(15);
            } else {
                str2 = null;
            }
            int i5 = Build.VERSION.SDK_INT;
            str = a3.mo5522e(13) ? a3.mo5518c(13) : null;
            a3.mo5513a();
        }
        C0298kz a4 = C0298kz.m7865a(context, attributeSet2, C0128er.f9180r, i2);
        if (z5 || !a4.mo5522e(14)) {
            boolean z6 = z;
            z3 = z2;
            z4 = z6;
        } else {
            z4 = a4.mo5514a(14, false);
            z3 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (a4.mo5522e(15)) {
            str2 = a4.mo5518c(15);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (a4.mo5522e(13)) {
            str3 = a4.mo5518c(13);
        } else {
            str3 = str;
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.mo5522e(0) && a4.mo5519d(0, -1) == 0) {
            this.f9462a.setTextSize(0, 0.0f);
        }
        m7496a(context, a4);
        a4.mo5513a();
        if (!z5 && z3) {
            m7498a(z4);
        }
        Typeface typeface = this.f9464c;
        if (typeface != null) {
            if (this.f9473l == -1) {
                this.f9462a.setTypeface(typeface, this.f9472k);
            } else {
                this.f9462a.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            this.f9462a.setFontVariationSettings(str3);
        }
        if (str2 != null) {
            int i8 = Build.VERSION.SDK_INT;
            this.f9462a.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        C0203hl hlVar = this.f9463b;
        TypedArray obtainStyledAttributes = hlVar.f9486h.obtainStyledAttributes(attributeSet2, C0128er.f9169g, i2, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            hlVar.f9479a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr[i9] = obtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                hlVar.f9484f = C0203hl.m7506a(iArr);
                hlVar.mo5178d();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!hlVar.mo5182h()) {
            hlVar.f9479a = 0;
        } else if (hlVar.f9479a == 1) {
            if (!hlVar.f9485g) {
                DisplayMetrics displayMetrics = hlVar.f9486h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                hlVar.mo5174a(dimension2, dimension3, dimension);
            }
            hlVar.mo5179e();
        }
        if (C0121ek.f9154a) {
            C0203hl hlVar2 = this.f9463b;
            if (hlVar2.f9479a != 0) {
                int[] iArr2 = hlVar2.f9484f;
                if (iArr2.length > 0) {
                    if (((float) this.f9462a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f9462a.setAutoSizeTextTypeUniformWithConfiguration(this.f9463b.mo5176b(), this.f9463b.mo5177c(), this.f9463b.mo5173a(), 0);
                    } else {
                        this.f9462a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        C0298kz a5 = C0298kz.m7864a(context, attributeSet2, C0128er.f9169g);
        int e2 = a5.mo5521e(8, -1);
        Drawable a6 = e2 != -1 ? a.mo5105a(context, e2) : null;
        int e3 = a5.mo5521e(13, -1);
        Drawable a7 = e3 != -1 ? a.mo5105a(context, e3) : null;
        int e4 = a5.mo5521e(9, -1);
        Drawable a8 = e4 != -1 ? a.mo5105a(context, e4) : null;
        int e5 = a5.mo5521e(6, -1);
        Drawable a9 = e5 != -1 ? a.mo5105a(context, e5) : null;
        int e6 = a5.mo5521e(10, -1);
        Drawable a10 = e6 != -1 ? a.mo5105a(context, e6) : null;
        int e7 = a5.mo5521e(7, -1);
        if (e7 != -1) {
            drawable = a.mo5105a(context, e7);
        } else {
            drawable = null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (a10 != null || drawable != null) {
            Drawable[] compoundDrawablesRelative = this.f9462a.getCompoundDrawablesRelative();
            TextView textView = this.f9462a;
            if (a10 == null) {
                a10 = compoundDrawablesRelative[0];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[1];
            }
            if (drawable == null) {
                drawable = compoundDrawablesRelative[2];
            }
            if (a9 == null) {
                a9 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a7, drawable, a9);
        } else if (!(a6 == null && a7 == null && a8 == null && a9 == null)) {
            int i11 = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative2 = this.f9462a.getCompoundDrawablesRelative();
            Drawable drawable2 = compoundDrawablesRelative2[0];
            if (drawable2 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f9462a.getCompoundDrawables();
                TextView textView2 = this.f9462a;
                if (a6 == null) {
                    a6 = compoundDrawables[0];
                }
                if (a7 == null) {
                    a7 = compoundDrawables[1];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[2];
                }
                if (a9 == null) {
                    a9 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(a6, a7, a8, a9);
            } else {
                TextView textView3 = this.f9462a;
                if (a7 == null) {
                    a7 = compoundDrawablesRelative2[1];
                }
                Drawable drawable3 = compoundDrawablesRelative2[2];
                if (a9 == null) {
                    a9 = compoundDrawablesRelative2[3];
                }
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, a7, drawable3, a9);
            }
        }
        if (a5.mo5522e(11)) {
            ColorStateList d = a5.mo5520d(11);
            TextView textView4 = this.f9462a;
            C0086dc.m6103a(textView4);
            int i12 = Build.VERSION.SDK_INT;
            textView4.setCompoundDrawableTintList(d);
        }
        if (a5.mo5522e(12)) {
            PorterDuff.Mode a11 = C0220ib.m7558a(a5.mo5511a(12, -1), null);
            TextView textView5 = this.f9462a;
            C0086dc.m6103a(textView5);
            int i13 = Build.VERSION.SDK_INT;
            textView5.setCompoundDrawableTintMode(a11);
        }
        int d2 = a5.mo5519d(14, -1);
        int d3 = a5.mo5519d(17, -1);
        int d4 = a5.mo5519d(18, -1);
        a5.mo5513a();
        if (d2 != -1) {
            C0194hc.m7487a(this.f9462a, d2);
        }
        if (d3 != -1) {
            C0194hc.m7488b(this.f9462a, d3);
        }
        if (d4 != -1) {
            C0194hc.m7490c(this.f9462a, d4);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5138a(Context context, int i) {
        String c;
        C0298kz a = C0298kz.m7863a(context, i, C0128er.f9180r);
        if (a.mo5522e(14)) {
            m7498a(a.mo5514a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (a.mo5522e(0) && a.mo5519d(0, -1) == 0) {
            this.f9462a.setTextSize(0, 0.0f);
        }
        m7496a(context, a);
        int i3 = Build.VERSION.SDK_INT;
        if (a.mo5522e(13) && (c = a.mo5518c(13)) != null) {
            this.f9462a.setFontVariationSettings(c);
        }
        a.mo5513a();
        Typeface typeface = this.f9464c;
        if (typeface != null) {
            this.f9462a.setTypeface(typeface, this.f9472k);
        }
    }

    /* renamed from: a */
    private final void m7498a(boolean z) {
        this.f9462a.setAllCaps(z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    private final void m7496a(Context context, C0298kz kzVar) {
        String c;
        boolean z;
        C0298kz kzVar2 = kzVar;
        int[] iArr = C0128er.f9163a;
        this.f9472k = kzVar2.mo5511a(2, this.f9472k);
        if (Build.VERSION.SDK_INT >= 28) {
            int a = kzVar2.mo5511a(11, -1);
            this.f9473l = a;
            if (a != -1) {
                this.f9472k &= 2;
            }
        }
        int i = 12;
        boolean z2 = false;
        if (kzVar2.mo5522e(10) || kzVar2.mo5522e(12)) {
            Typeface typeface = null;
            this.f9464c = null;
            if (!kzVar2.mo5522e(12)) {
                i = 10;
            }
            int i2 = this.f9473l;
            int i3 = this.f9472k;
            if (!context.isRestricted()) {
                C0031bc bcVar = new C0031bc(this, i2, i3);
                try {
                    int i4 = this.f9472k;
                    int resourceId = kzVar2.f9834b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (kzVar2.f9835c == null) {
                            kzVar2.f9835c = new TypedValue();
                        }
                        Context context2 = kzVar2.f9833a;
                        TypedValue typedValue = kzVar2.f9835c;
                        if (!context2.isRestricted()) {
                            Resources resources = context2.getResources();
                            resources.getValue(resourceId, typedValue, true);
                            typeface = C0194hc.m7483a(context2, resources, typedValue, resourceId, i4, bcVar);
                        }
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.f9473l == -1) {
                            this.f9464c = typeface;
                        } else {
                            Typeface create = Typeface.create(typeface, 0);
                            int i5 = this.f9473l;
                            if ((this.f9472k & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f9464c = Typeface.create(create, i5, z);
                        }
                    }
                    this.f9465d = this.f9464c == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f9464c == null && (c = kzVar2.mo5518c(i)) != null) {
                if (Build.VERSION.SDK_INT >= 28 && this.f9473l != -1) {
                    Typeface create2 = Typeface.create(c, 0);
                    int i6 = this.f9473l;
                    if ((2 & this.f9472k) != 0) {
                        z2 = true;
                    }
                    this.f9464c = Typeface.create(create2, i6, z2);
                    return;
                }
                this.f9464c = Typeface.create(c, this.f9472k);
            }
        } else if (kzVar2.mo5522e(1)) {
            this.f9465d = false;
            int a2 = kzVar2.mo5511a(1, 1);
            if (a2 == 1) {
                this.f9464c = Typeface.SANS_SERIF;
            } else if (a2 == 2) {
                this.f9464c = Typeface.SERIF;
            } else if (a2 == 3) {
                this.f9464c = Typeface.MONOSPACE;
            }
        }
    }
}
