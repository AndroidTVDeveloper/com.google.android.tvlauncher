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
    public final dd a;
    public List b;
    public boolean c;
    public int d;
    private final Handler e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean t() {
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
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte b2) {
        super(context, attributeSet, i);
        this.a = new dd();
        this.e = new Handler();
        this.c = true;
        this.f = 0;
        this.g = false;
        this.d = Integer.MAX_VALUE;
        this.h = new qy(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.i, i, 0);
        this.c = bg.a(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            e(bg.d(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: finally extract failed */
    public final void a(Preference preference) {
        long j;
        if (!this.b.contains(preference)) {
            if (preference.s != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.B;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.s;
                if (preferenceGroup.c((CharSequence) str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.p == Integer.MAX_VALUE) {
                if (this.c) {
                    int i = this.f;
                    this.f = i + 1;
                    preference.a(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).c = this.c;
                }
            }
            int binarySearch = Collections.binarySearch(this.b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.c(c());
            synchronized (this) {
                this.b.add(binarySearch, preference);
            }
            ri riVar = this.k;
            String str2 = preference.s;
            if (str2 == null || !this.a.containsKey(str2)) {
                j = riVar.a();
            } else {
                j = ((Long) this.a.get(str2)).longValue();
                this.a.remove(str2);
            }
            preference.l = j;
            preference.m = true;
            try {
                preference.a(riVar);
                preference.m = false;
                preference.a(this);
                if (this.g) {
                    preference.n();
                }
                m();
            } catch (Throwable th) {
                preference.m = false;
                throw th;
            }
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).b(bundle);
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).a(bundle);
        }
    }

    public final Preference c(CharSequence charSequence) {
        Preference c2;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.s, charSequence)) {
            return this;
        } else {
            int g2 = g();
            for (int i = 0; i < g2; i++) {
                Preference f2 = f(i);
                if (TextUtils.equals(f2.s, charSequence)) {
                    return f2;
                }
                if ((f2 instanceof PreferenceGroup) && (c2 = ((PreferenceGroup) f2).c(charSequence)) != null) {
                    return c2;
                }
            }
            return null;
        }
    }

    public final Preference f(int i) {
        return (Preference) this.b.get(i);
    }

    public final int g() {
        return this.b.size();
    }

    public final void a(boolean z) {
        super.a(z);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).c(z);
        }
    }

    public final void n() {
        p();
        this.g = true;
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).n();
        }
    }

    public final void o() {
        q();
        this.g = false;
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).o();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ra.class)) {
            super.a(parcelable);
            return;
        }
        ra raVar = (ra) parcelable;
        this.d = raVar.a;
        super.a(raVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        return new ra(super.d(), this.d);
    }

    public final void s() {
        synchronized (this) {
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                b((Preference) list.get(0));
            }
        }
        m();
    }

    public final void b(Preference preference) {
        synchronized (this) {
            preference.q();
            if (preference.B == this) {
                preference.a((PreferenceGroup) null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.e()));
                    this.e.removeCallbacks(this.h);
                    this.e.post(this.h);
                }
                if (this.g) {
                    preference.o();
                }
            }
        }
    }

    public final void e(int i) {
        if (i != Integer.MAX_VALUE && !j()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.d = i;
    }
}
