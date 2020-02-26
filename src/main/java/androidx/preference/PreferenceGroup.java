package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: a */
    public final C0087dd f1373a;

    /* renamed from: b */
    public List f1374b;

    /* renamed from: c */
    public boolean f1375c;

    /* renamed from: d */
    public int f1376d;

    /* renamed from: e */
    private final Handler f1377e;

    /* renamed from: f */
    private int f1378f;

    /* renamed from: g */
    private boolean f1379g;

    /* renamed from: h */
    private final Runnable f1380h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: t */
    public boolean mo1124t() {
        return true;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f1373a = new C0087dd();
        this.f1377e = new Handler();
        this.f1375c = true;
        this.f1378f = 0;
        this.f1379g = false;
        this.f1376d = Integer.MAX_VALUE;
        this.f1380h = new C0459qy(this);
        this.f1374b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10270i, i, 0);
        this.f1375c = C0035bg.m3111a(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            mo1120e(C0035bg.m3119d(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo1117a(Preference preference) {
        long j;
        if (!this.f1374b.contains(preference)) {
            if (preference.f1365s != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.f1335B;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.f1365s;
                if (preferenceGroup.mo1119c((CharSequence) str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.f1362p == Integer.MAX_VALUE) {
                if (this.f1375c) {
                    int i = this.f1378f;
                    this.f1378f = i + 1;
                    preference.mo1083a(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).f1375c = this.f1375c;
                }
            }
            int binarySearch = Collections.binarySearch(this.f1374b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.mo1099c(mo1076c());
            synchronized (this) {
                this.f1374b.add(binarySearch, preference);
            }
            C0470ri riVar = this.f1357k;
            String str2 = preference.f1365s;
            if (str2 == null || !this.f1373a.containsKey(str2)) {
                j = riVar.mo5807a();
            } else {
                j = ((Long) this.f1373a.get(str2)).longValue();
                this.f1373a.remove(str2);
            }
            preference.f1358l = j;
            preference.f1359m = true;
            try {
                preference.mo1089a(riVar);
                preference.f1359m = false;
                preference.mo1086a(this);
                if (this.f1379g) {
                    preference.mo1111n();
                }
                mo1110m();
            } catch (Throwable th) {
                preference.f1359m = false;
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo1093b(Bundle bundle) {
        super.mo1093b(bundle);
        int g = mo1122g();
        for (int i = 0; i < g; i++) {
            mo1121f(i).mo1093b(bundle);
        }
    }

    /* renamed from: a */
    public final void mo1085a(Bundle bundle) {
        super.mo1085a(bundle);
        int g = mo1122g();
        for (int i = 0; i < g; i++) {
            mo1121f(i).mo1085a(bundle);
        }
    }

    /* renamed from: c */
    public final Preference mo1119c(CharSequence charSequence) {
        Preference c;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f1365s, charSequence)) {
            return this;
        } else {
            int g = mo1122g();
            for (int i = 0; i < g; i++) {
                Preference f = mo1121f(i);
                if (TextUtils.equals(f.f1365s, charSequence)) {
                    return f;
                }
                if ((f instanceof PreferenceGroup) && (c = ((PreferenceGroup) f).mo1119c(charSequence)) != null) {
                    return c;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    public final Preference mo1121f(int i) {
        return (Preference) this.f1374b.get(i);
    }

    /* renamed from: g */
    public final int mo1122g() {
        return this.f1374b.size();
    }

    /* renamed from: a */
    public final void mo1090a(boolean z) {
        super.mo1090a(z);
        int g = mo1122g();
        for (int i = 0; i < g; i++) {
            mo1121f(i).mo1099c(z);
        }
    }

    /* renamed from: n */
    public final void mo1111n() {
        mo1113p();
        this.f1379g = true;
        int g = mo1122g();
        for (int i = 0; i < g; i++) {
            mo1121f(i).mo1111n();
        }
    }

    /* renamed from: o */
    public final void mo1112o() {
        mo1114q();
        this.f1379g = false;
        int g = mo1122g();
        for (int i = 0; i < g; i++) {
            mo1121f(i).mo1112o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0462ra.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0462ra raVar = (C0462ra) parcelable;
        this.f1376d = raVar.f10234a;
        super.mo1073a(raVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        return new C0462ra(super.mo1077d(), this.f1376d);
    }

    /* renamed from: s */
    public final void mo1123s() {
        synchronized (this) {
            List list = this.f1374b;
            for (int size = list.size() - 1; size >= 0; size--) {
                mo1118b((Preference) list.get(0));
            }
        }
        mo1110m();
    }

    /* renamed from: b */
    public final void mo1118b(Preference preference) {
        synchronized (this) {
            preference.mo1114q();
            if (preference.f1335B == this) {
                preference.mo1086a((PreferenceGroup) null);
            }
            if (this.f1374b.remove(preference)) {
                String str = preference.f1365s;
                if (str != null) {
                    this.f1373a.put(str, Long.valueOf(preference.mo1103e()));
                    this.f1377e.removeCallbacks(this.f1380h);
                    this.f1377e.post(this.f1380h);
                }
                if (this.f1379g) {
                    preference.mo1112o();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo1120e(int i) {
        if (i != Integer.MAX_VALUE && !mo1107j()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f1376d = i;
    }
}
