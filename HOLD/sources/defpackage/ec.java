package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ec  reason: default package */
/* compiled from: PG */
public final class ec {
    public final Object a;

    public ec(Object obj) {
        this.a = obj;
    }

    public static ec a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        return new ec(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }
}
