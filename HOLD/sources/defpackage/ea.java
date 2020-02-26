package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ea  reason: default package */
/* compiled from: PG */
public final class ea {
    public static final ea a = new ea(4096);
    public static final ea b = new ea(8192);
    public static final ea c = new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344);
    public static final ea d = new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345);
    public static final ea e = new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346);
    public static final ea f = new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347);
    public final Object g;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        new ea(1);
        new ea(2);
        new ea(4);
        new ea(8);
        new ea(16);
        new ea(32);
        new ea(64);
        new ea(128);
        new ea(256, (byte) 0);
        new ea(512, (byte) 0);
        new ea(1024, (byte) 0);
        new ea(2048, (byte) 0);
        new ea(16384);
        new ea(32768);
        new ea(65536);
        new ea(131072, (byte) 0);
        new ea(262144);
        new ea(524288);
        new ea(1048576);
        new ea(2097152, (byte) 0);
        int i = Build.VERSION.SDK_INT;
        new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342);
        int i2 = Build.VERSION.SDK_INT;
        new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
        new ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358);
        new ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359);
        new ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360);
        new ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361);
        int i7 = Build.VERSION.SDK_INT;
        new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348);
        int i8 = Build.VERSION.SDK_INT;
        new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349);
        int i9 = Build.VERSION.SDK_INT;
        new ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction = null;
        }
        new ea(accessibilityAction, 16908356);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        new ea(accessibilityAction2, 16908357);
    }

    private ea(int i) {
        this((Object) null, i);
    }

    private ea(int i, byte b2) {
        this((Object) null, i);
    }

    public ea(Object obj) {
        this(obj, 0);
    }

    private ea(Object obj, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (obj == null) {
            this.g = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.g = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        Object obj2 = this.g;
        if (obj2 != null) {
            if (obj2.equals(eaVar.g)) {
                return true;
            }
            return false;
        } else if (eaVar.g != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int a() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.g).getId();
    }

    public final CharSequence b() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.g).getLabel();
    }

    public final int hashCode() {
        Object obj = this.g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
