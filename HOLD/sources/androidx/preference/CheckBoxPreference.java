package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* compiled from: PG */
public class CheckBoxPreference extends TwoStatePreference {
    private final pr c = new pr(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968676(0x7f040064, float:1.7546012E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.bg.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            pr r1 = new pr
            r1.<init>(r3)
            r3.c = r1
            int[] r1 = defpackage.rm.b
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = defpackage.bg.a(r4, r5, r2)
            r3.c(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = defpackage.bg.a(r4, r5, r0)
            r3.d(r5)
            r5 = 3
            r0 = 2
            boolean r5 = defpackage.bg.a(r4, r5, r0, r2)
            r3.b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        c(rlVar.c(16908289));
        b(rlVar);
    }

    public final void a(View view) {
        l();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(16908289));
            b(view.findViewById(16908304));
        }
    }

    private final void c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }
}
