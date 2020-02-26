package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ListPreference extends DialogPreference {

    /* renamed from: D */
    private String f1326D;

    /* renamed from: E */
    private boolean f1327E;

    /* renamed from: g */
    public CharSequence[] f1328g;

    /* renamed from: h */
    public CharSequence[] f1329h;

    /* renamed from: i */
    public String f1330i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0035bg.m3102a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10266e, i, 0);
        this.f1328g = C0035bg.m3118c(obtainStyledAttributes, 2, 0);
        this.f1329h = C0035bg.m3118c(obtainStyledAttributes, 3, 1);
        if (C0035bg.m3111a(obtainStyledAttributes, 4, 4, false)) {
            if (C0436qb.f10196a == null) {
                C0436qb.f10196a = new C0436qb();
            }
            mo1088a((C0450qp) C0436qb.f10196a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0474rm.f10268g, i, 0);
        this.f1326D = C0035bg.m3109a(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: b */
    public final int mo1079b(String str) {
        CharSequence[] charSequenceArr;
        if (!(str == null || (charSequenceArr = this.f1329h) == null)) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (this.f1329h[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* renamed from: g */
    public final CharSequence mo1081g() {
        CharSequence[] charSequenceArr;
        int b = mo1079b(this.f1330i);
        if (b < 0 || (charSequenceArr = this.f1328g) == null) {
            return null;
        }
        return charSequenceArr[b];
    }

    /* renamed from: f */
    public final CharSequence mo1080f() {
        C0450qp qpVar = this.f1336C;
        if (qpVar != null) {
            return qpVar.mo5764a(this);
        }
        Object g = mo1081g();
        CharSequence f = super.mo1080f();
        String str = this.f1326D;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (g == null) {
                g = "";
            }
            objArr[0] = g;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1072a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0435qa.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0435qa qaVar = (C0435qa) parcelable;
        super.mo1073a(qaVar.getSuperState());
        mo1075a(qaVar.f10195a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        Parcelable d = super.mo1077d();
        if (this.f1368v) {
            return d;
        }
        C0435qa qaVar = new C0435qa(d);
        qaVar.f10195a = this.f1330i;
        return qaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1074a(Object obj) {
        mo1075a(mo1102d((String) obj));
    }

    /* renamed from: a */
    public final void mo1078a(CharSequence charSequence) {
        super.mo1078a(charSequence);
        if (charSequence == null && this.f1326D != null) {
            this.f1326D = null;
        } else if (charSequence != null && !charSequence.equals(this.f1326D)) {
            this.f1326D = charSequence.toString();
        }
    }

    /* renamed from: a */
    public final void mo1075a(String str) {
        boolean z = !TextUtils.equals(this.f1330i, str);
        if (z || !this.f1327E) {
            this.f1330i = str;
            this.f1327E = true;
            mo1104e(str);
            if (z) {
                mo1071b();
            }
        }
    }
}
