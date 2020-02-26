package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
public class EditTextPreference extends DialogPreference {

    /* renamed from: g */
    public String f1325g;

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
            int r0 = p000.C0035bg.m3102a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = p000.C0474rm.f10265d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = p000.C0035bg.m3111a(r4, r2, r2, r2)
            if (r5 == 0) goto L_0x002a
            pw r5 = p000.C0430pw.f10191a
            if (r5 != 0) goto L_0x0025
            pw r5 = new pw
            r5.<init>()
            p000.C0430pw.f10191a = r5
        L_0x0025:
            pw r5 = p000.C0430pw.f10191a
            r3.mo1088a(r5)
        L_0x002a:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1072a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0429pv.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0429pv pvVar = (C0429pv) parcelable;
        super.mo1073a(pvVar.getSuperState());
        mo1075a(pvVar.f10190a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        Parcelable d = super.mo1077d();
        if (this.f1368v) {
            return d;
        }
        C0429pv pvVar = new C0429pv(d);
        pvVar.f10190a = this.f1325g;
        return pvVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1074a(Object obj) {
        mo1075a(mo1102d((String) obj));
    }

    /* renamed from: a */
    public final void mo1075a(String str) {
        boolean c = mo1076c();
        this.f1325g = str;
        mo1104e(str);
        boolean c2 = mo1076c();
        if (c2 != c) {
            mo1090a(c2);
        }
        mo1071b();
    }

    /* renamed from: c */
    public final boolean mo1076c() {
        return TextUtils.isEmpty(this.f1325g) || super.mo1076c();
    }
}
