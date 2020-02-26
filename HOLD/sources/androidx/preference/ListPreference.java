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
    private String D;
    private boolean E;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bg.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.e, i2, 0);
        this.g = bg.c(obtainStyledAttributes, 2, 0);
        this.h = bg.c(obtainStyledAttributes, 3, 1);
        if (bg.a(obtainStyledAttributes, 4, 4, false)) {
            if (qb.a == null) {
                qb.a = new qb();
            }
            a((qp) qb.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, rm.g, i2, 0);
        this.D = bg.a(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public final int b(String str) {
        CharSequence[] charSequenceArr;
        if (!(str == null || (charSequenceArr = this.h) == null)) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (this.h[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence g() {
        CharSequence[] charSequenceArr;
        int b = b(this.i);
        if (b < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[b];
    }

    public final CharSequence f() {
        qp qpVar = this.C;
        if (qpVar != null) {
            return qpVar.a(this);
        }
        Object g2 = g();
        CharSequence f = super.f();
        String str = this.D;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (g2 == null) {
                g2 = "";
            }
            objArr[0] = g2;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(qa.class)) {
            super.a(parcelable);
            return;
        }
        qa qaVar = (qa) parcelable;
        super.a(qaVar.getSuperState());
        a(qaVar.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d = super.d();
        if (this.v) {
            return d;
        }
        qa qaVar = new qa(d);
        qaVar.a = this.i;
        return qaVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        a(d((String) obj));
    }

    public final void a(CharSequence charSequence) {
        super.a(charSequence);
        if (charSequence == null && this.D != null) {
            this.D = null;
        } else if (charSequence != null && !charSequence.equals(this.D)) {
            this.D = charSequence.toString();
        }
    }

    public final void a(String str) {
        boolean z = !TextUtils.equals(this.i, str);
        if (z || !this.E) {
            this.i = str;
            this.E = true;
            e(str);
            if (z) {
                b();
            }
        }
    }
}
