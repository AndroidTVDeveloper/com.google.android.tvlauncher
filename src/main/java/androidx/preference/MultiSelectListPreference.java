package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: g */
    public CharSequence[] f1331g;

    /* renamed from: h */
    public CharSequence[] f1332h;

    /* renamed from: i */
    public Set f1333i = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968732(0x7f04009c, float:1.7546126E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p000.C0035bg.m3102a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.f1333i = r1
            int[] r1 = p000.C0474rm.f10267f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = p000.C0035bg.m3118c(r4, r5, r2)
            r3.f1331g = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = p000.C0035bg.m3118c(r4, r5, r0)
            r3.f1332h = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1072a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0440qf.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0440qf qfVar = (C0440qf) parcelable;
        super.mo1073a(qfVar.getSuperState());
        mo1082a(qfVar.f10201a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        Parcelable d = super.mo1077d();
        if (this.f1368v) {
            return d;
        }
        C0440qf qfVar = new C0440qf(d);
        qfVar.f10201a = this.f1333i;
        return qfVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1074a(Object obj) {
        mo1082a(mo1091b((Set) obj));
    }

    /* renamed from: a */
    public final void mo1082a(Set set) {
        this.f1333i.clear();
        this.f1333i.addAll(set);
        if (mo1108k() && !set.equals(mo1091b((Set) null))) {
            SharedPreferences.Editor c = this.f1357k.mo5811c();
            c.putStringSet(this.f1365s, set);
            Preference.m1473a(c);
        }
        mo1071b();
    }
}
