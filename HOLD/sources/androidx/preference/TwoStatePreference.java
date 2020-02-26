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
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        boolean z = !this.a;
        if (b(Boolean.valueOf(z))) {
            d(z);
        }
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ru.class)) {
            super.a(parcelable);
            return;
        }
        ru ruVar = (ru) parcelable;
        super.a(ruVar.getSuperState());
        d(ruVar.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d2 = super.d();
        if (this.v) {
            return d2;
        }
        ru ruVar = new ru(d2);
        ruVar.a = this.a;
        return ruVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj == null) {
            obj = false;
        }
        d(b(((Boolean) obj).booleanValue()));
    }

    public final void d(boolean z) {
        boolean z2 = this.a;
        if (z2 != z || !this.e) {
            this.a = z;
            this.e = true;
            if (k() && z != b(!z)) {
                SharedPreferences.Editor c2 = this.k.c();
                c2.putBoolean(this.s, z);
                Preference.a(c2);
            }
            if (z2 != z) {
                a(c());
                b();
            }
        }
    }

    public final void d(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.a) {
            b();
        }
    }

    public final void c(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            b();
        }
    }

    public final boolean c() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        return super.c();
    }

    /* access modifiers changed from: protected */
    public final void b(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence f = f();
                if (!TextUtils.isEmpty(f)) {
                    textView.setText(f);
                } else {
                    i = 8;
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(rl rlVar) {
        b(rlVar.c(16908304));
    }
}
