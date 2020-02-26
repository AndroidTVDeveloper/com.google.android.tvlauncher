package androidx.preference;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;

/* compiled from: PG */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: c */
    private final C0479rr f1394c;

    /* renamed from: d */
    private CharSequence f1395d;

    /* renamed from: e */
    private CharSequence f1396e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

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
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969092(0x7f040204, float:1.7546856E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = p000.C0035bg.m3102a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            rr r1 = new rr
            r1.<init>(r3)
            r3.f1394c = r1
            int[] r1 = p000.C0474rm.f10273l
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r2)
            r3.mo1129c(r5)
            r5 = 6
            r0 = 1
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r0)
            r3.mo1130d(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r0)
            r3.f1395d = r5
            r3.mo1071b()
            r5 = 8
            r0 = 4
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r0)
            r3.f1396e = r5
            r3.mo1071b()
            r5 = 5
            r0 = 2
            boolean r5 = p000.C0035bg.m3111a(r4, r5, r0, r2)
            r3.f1401b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        m1548c(rlVar.mo5812c(16908352));
        mo1128b(rlVar);
    }

    /* renamed from: a */
    public final void mo1068a(View view) {
        mo1109l();
        if (((AccessibilityManager) this.f1356j.getSystemService("accessibility")).isEnabled()) {
            m1548c(view.findViewById(16908352));
            mo1127b(view.findViewById(16908304));
        }
    }

    /* renamed from: c */
    private final void m1548c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1400a);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f1395d);
            switchR.setTextOff(this.f1396e);
            switchR.setOnCheckedChangeListener(this.f1394c);
        }
    }
}
