package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final rs c = new rs(this);
    private CharSequence d;
    private CharSequence e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rm.m, R.attr.switchPreferenceCompatStyle, 0);
        c((CharSequence) bg.a(obtainStyledAttributes, 7, 0));
        d((CharSequence) bg.a(obtainStyledAttributes, 6, 1));
        this.d = bg.a(obtainStyledAttributes, 9, 3);
        b();
        this.e = bg.a(obtainStyledAttributes, 8, 4);
        b();
        this.b = bg.a(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        c(rlVar.c(R.id.switchWidget));
        b(rlVar);
    }

    public final void a(View view) {
        l();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(R.id.switchWidget));
            b(view.findViewById(16908304));
        }
    }

    private final void c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.a = this.d;
            switchCompat.requestLayout();
            switchCompat.b = this.e;
            switchCompat.requestLayout();
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }
}
