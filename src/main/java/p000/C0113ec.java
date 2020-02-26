package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ec */
/* compiled from: PG */
public final class C0113ec {

    /* renamed from: a */
    public final Object f9122a;

    public C0113ec(Object obj) {
        this.f9122a = obj;
    }

    /* renamed from: a */
    public static C0113ec m7230a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        return new C0113ec(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }
}
