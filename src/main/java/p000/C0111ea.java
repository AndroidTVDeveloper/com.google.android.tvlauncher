package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ea */
/* compiled from: PG */
public final class C0111ea {

    /* renamed from: a */
    public static final C0111ea f9114a = new C0111ea(4096);

    /* renamed from: b */
    public static final C0111ea f9115b = new C0111ea(8192);

    /* renamed from: c */
    public static final C0111ea f9116c = new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344);

    /* renamed from: d */
    public static final C0111ea f9117d = new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345);

    /* renamed from: e */
    public static final C0111ea f9118e = new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346);

    /* renamed from: f */
    public static final C0111ea f9119f = new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347);

    /* renamed from: g */
    public final Object f9120g;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        new C0111ea(1);
        new C0111ea(2);
        new C0111ea(4);
        new C0111ea(8);
        new C0111ea(16);
        new C0111ea(32);
        new C0111ea(64);
        new C0111ea(128);
        new C0111ea(256, (byte) 0);
        new C0111ea(512, (byte) 0);
        new C0111ea(1024, (byte) 0);
        new C0111ea(2048, (byte) 0);
        new C0111ea(16384);
        new C0111ea(32768);
        new C0111ea(65536);
        new C0111ea(131072, (byte) 0);
        new C0111ea(262144);
        new C0111ea(524288);
        new C0111ea(1048576);
        new C0111ea(2097152, (byte) 0);
        int i = Build.VERSION.SDK_INT;
        new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342);
        int i2 = Build.VERSION.SDK_INT;
        new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
        new C0111ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358);
        new C0111ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359);
        new C0111ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360);
        new C0111ea(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361);
        int i7 = Build.VERSION.SDK_INT;
        new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348);
        int i8 = Build.VERSION.SDK_INT;
        new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349);
        int i9 = Build.VERSION.SDK_INT;
        new C0111ea(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction = null;
        }
        new C0111ea(accessibilityAction, 16908356);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        new C0111ea(accessibilityAction2, 16908357);
    }

    private C0111ea(int i) {
        this((Object) null, i);
    }

    private C0111ea(int i, byte b) {
        this((Object) null, i);
    }

    public C0111ea(Object obj) {
        this(obj, 0);
    }

    private C0111ea(Object obj, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (obj == null) {
            this.f9120g = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.f9120g = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0111ea)) {
            return false;
        }
        C0111ea eaVar = (C0111ea) obj;
        Object obj2 = this.f9120g;
        if (obj2 != null) {
            if (obj2.equals(eaVar.f9120g)) {
                return true;
            }
            return false;
        } else if (eaVar.f9120g != null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final int mo4693a() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f9120g).getId();
    }

    /* renamed from: b */
    public final CharSequence mo4694b() {
        int i = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f9120g).getLabel();
    }

    public final int hashCode() {
        Object obj = this.f9120g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
