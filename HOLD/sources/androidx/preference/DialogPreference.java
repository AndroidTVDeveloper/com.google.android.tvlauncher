package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bg.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.c, i, 0);
        String a2 = bg.a(obtainStyledAttributes, 9, 0);
        this.a = a2;
        if (a2 == null) {
            this.a = this.q;
        }
        this.b = bg.a(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = bg.a(obtainStyledAttributes, 11, 3);
        this.e = bg.a(obtainStyledAttributes, 10, 4);
        this.f = bg.a(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void a() {
        rf rfVar = this.k.d;
        if (rfVar != null) {
            rfVar.c(this);
        }
    }
}
