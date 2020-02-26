package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: a */
    public boolean f1400a;

    /* renamed from: b */
    public boolean f1401b;

    /* renamed from: c */
    private CharSequence f1402c;

    /* renamed from: d */
    private CharSequence f1403d;

    /* renamed from: e */
    private boolean f1404e;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1070a() {
        boolean z = !this.f1400a;
        if (mo1095b(Boolean.valueOf(z))) {
            mo1131d(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1072a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1073a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0482ru.class)) {
            super.mo1073a(parcelable);
            return;
        }
        C0482ru ruVar = (C0482ru) parcelable;
        super.mo1073a(ruVar.getSuperState());
        mo1131d(ruVar.f10282a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1077d() {
        Parcelable d = super.mo1077d();
        if (this.f1368v) {
            return d;
        }
        C0482ru ruVar = new C0482ru(d);
        ruVar.f10282a = this.f1400a;
        return ruVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1074a(Object obj) {
        if (obj == null) {
            obj = false;
        }
        mo1131d(mo1096b(((Boolean) obj).booleanValue()));
    }

    /* renamed from: d */
    public final void mo1131d(boolean z) {
        boolean z2 = this.f1400a;
        if (z2 != z || !this.f1404e) {
            this.f1400a = z;
            this.f1404e = true;
            if (mo1108k() && z != mo1096b(!z)) {
                SharedPreferences.Editor c = this.f1357k.mo5811c();
                c.putBoolean(this.f1365s, z);
                Preference.m1473a(c);
            }
            if (z2 != z) {
                mo1090a(mo1076c());
                mo1071b();
            }
        }
    }

    /* renamed from: d */
    public final void mo1130d(CharSequence charSequence) {
        this.f1403d = charSequence;
        if (!this.f1400a) {
            mo1071b();
        }
    }

    /* renamed from: c */
    public final void mo1129c(CharSequence charSequence) {
        this.f1402c = charSequence;
        if (this.f1400a) {
            mo1071b();
        }
    }

    /* renamed from: c */
    public final boolean mo1076c() {
        if (this.f1401b) {
            if (this.f1400a) {
                return true;
            }
        } else if (!this.f1400a) {
            return true;
        }
        return super.mo1076c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1127b(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.f1400a && !TextUtils.isEmpty(this.f1402c)) {
                textView.setText(this.f1402c);
            } else if (this.f1400a || TextUtils.isEmpty(this.f1403d)) {
                CharSequence f = mo1080f();
                if (!TextUtils.isEmpty(f)) {
                    textView.setText(f);
                } else {
                    i = 8;
                }
            } else {
                textView.setText(this.f1403d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1128b(C0473rl rlVar) {
        mo1127b(rlVar.mo5812c(16908304));
    }
}
