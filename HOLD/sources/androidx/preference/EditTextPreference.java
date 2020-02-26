package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.bg.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.rm.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = defpackage.bg.a(r4, r2, r2, r2)
            if (r5 == 0) goto L_0x002a
            pw r5 = defpackage.pw.a
            if (r5 != 0) goto L_0x0025
            pw r5 = new pw
            r5.<init>()
            defpackage.pw.a = r5
        L_0x0025:
            pw r5 = defpackage.pw.a
            r3.a(r5)
        L_0x002a:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(pv.class)) {
            super.a(parcelable);
            return;
        }
        pv pvVar = (pv) parcelable;
        super.a(pvVar.getSuperState());
        a(pvVar.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d = super.d();
        if (this.v) {
            return d;
        }
        pv pvVar = new pv(d);
        pvVar.a = this.g;
        return pvVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        a(d((String) obj));
    }

    public final void a(String str) {
        boolean c = c();
        this.g = str;
        e(str);
        boolean c2 = c();
        if (c2 != c) {
            a(c2);
        }
        b();
    }

    public final boolean c() {
        return TextUtils.isEmpty(this.g) || super.c();
    }
}
