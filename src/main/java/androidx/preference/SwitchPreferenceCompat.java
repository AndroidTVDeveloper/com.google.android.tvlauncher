package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: c */
    private final C0480rs f1397c = new C0480rs(this);

    /* renamed from: d */
    private CharSequence f1398d;

    /* renamed from: e */
    private CharSequence f1399e;

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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10274m, R.attr.switchPreferenceCompatStyle, 0);
        mo1129c((CharSequence) C0035bg.m3109a(obtainStyledAttributes, 7, 0));
        mo1130d((CharSequence) C0035bg.m3109a(obtainStyledAttributes, 6, 1));
        this.f1398d = C0035bg.m3109a(obtainStyledAttributes, 9, 3);
        mo1071b();
        this.f1399e = C0035bg.m3109a(obtainStyledAttributes, 8, 4);
        mo1071b();
        this.f1401b = C0035bg.m3111a(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        m1551c(rlVar.mo5812c(R.id.switchWidget));
        mo1128b(rlVar);
    }

    /* renamed from: a */
    public final void mo1068a(View view) {
        mo1109l();
        if (((AccessibilityManager) this.f1356j.getSystemService("accessibility")).isEnabled()) {
            m1551c(view.findViewById(R.id.switchWidget));
            mo1127b(view.findViewById(16908304));
        }
    }

    /* renamed from: c */
    private final void m1551c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1400a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.f1104a = this.f1398d;
            switchCompat.requestLayout();
            switchCompat.f1105b = this.f1399e;
            switchCompat.requestLayout();
            switchCompat.setOnCheckedChangeListener(this.f1397c);
        }
    }
}
