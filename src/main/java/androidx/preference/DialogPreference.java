package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public abstract class DialogPreference extends Preference {

    /* renamed from: a */
    public CharSequence f1315a;

    /* renamed from: b */
    public CharSequence f1316b;

    /* renamed from: c */
    public Drawable f1317c;

    /* renamed from: d */
    public CharSequence f1318d;

    /* renamed from: e */
    public CharSequence f1319e;

    /* renamed from: f */
    public int f1320f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0035bg.m3102a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10264c, i, 0);
        String a = C0035bg.m3109a(obtainStyledAttributes, 9, 0);
        this.f1315a = a;
        if (a == null) {
            this.f1315a = this.f1363q;
        }
        this.f1316b = C0035bg.m3109a(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f1317c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.f1318d = C0035bg.m3109a(obtainStyledAttributes, 11, 3);
        this.f1319e = C0035bg.m3109a(obtainStyledAttributes, 10, 4);
        this.f1320f = C0035bg.m3103a(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1070a() {
        C0467rf rfVar = this.f1357k.f10250d;
        if (rfVar != null) {
            rfVar.mo5795c(this);
        }
    }
}
