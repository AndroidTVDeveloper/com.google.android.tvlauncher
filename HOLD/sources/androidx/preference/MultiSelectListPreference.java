package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] g;
    public CharSequence[] h;
    public Set i = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968732(0x7f04009c, float:1.7546126E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.bg.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.i = r1
            int[] r1 = defpackage.rm.f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = defpackage.bg.c(r4, r5, r2)
            r3.g = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = defpackage.bg.c(r4, r5, r0)
            r3.h = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(qf.class)) {
            super.a(parcelable);
            return;
        }
        qf qfVar = (qf) parcelable;
        super.a(qfVar.getSuperState());
        a(qfVar.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d = super.d();
        if (this.v) {
            return d;
        }
        qf qfVar = new qf(d);
        qfVar.a = this.i;
        return qfVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        a(b((Set) obj));
    }

    public final void a(Set set) {
        this.i.clear();
        this.i.addAll(set);
        if (k() && !set.equals(b((Set) null))) {
            SharedPreferences.Editor c = this.k.c();
            c.putStringSet(this.s, set);
            Preference.a(c);
        }
        b();
    }
}
