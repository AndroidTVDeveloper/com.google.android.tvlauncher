package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* compiled from: PG */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: c */
    private final C0425pr f1314c = new C0425pr(this);

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
            int r0 = p000.C0035bg.m3102a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            pr r1 = new pr
            r1.<init>(r3)
            r3.f1314c = r1
            int[] r1 = p000.C0474rm.f10263b
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r2)
            r3.mo1129c(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = p000.C0035bg.m3109a(r4, r5, r0)
            r3.mo1130d(r5)
            r5 = 3
            r0 = 2
            boolean r5 = p000.C0035bg.m3111a(r4, r5, r0, r2)
            r3.f1401b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        m1445c(rlVar.mo5812c(16908289));
        mo1128b(rlVar);
    }

    /* renamed from: a */
    public final void mo1068a(View view) {
        mo1109l();
        if (((AccessibilityManager) this.f1356j.getSystemService("accessibility")).isEnabled()) {
            m1445c(view.findViewById(16908289));
            mo1127b(view.findViewById(16908304));
        }
    }

    /* renamed from: c */
    private final void m1445c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1400a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1314c);
        }
    }
}
