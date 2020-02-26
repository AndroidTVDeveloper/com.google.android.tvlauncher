package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dx  reason: default package */
/* compiled from: PG */
public final class dx {
    private static Field a;
    private static boolean b = false;

    static {
        new AtomicInteger(1);
        new dt();
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        dw a2 = dw.a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = a2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!dw.a.isEmpty()) {
                synchronized (dw.a) {
                    if (a2.b == null) {
                        a2.b = new WeakHashMap();
                    }
                    for (int size = dw.a.size() - 1; size >= 0; size--) {
                        View view2 = (View) ((WeakReference) dw.a.get(size)).get();
                        if (view2 != null) {
                            a2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a2.b.put((View) parent, Boolean.TRUE);
                            }
                        } else {
                            dw.a.remove(size);
                        }
                    }
                }
            }
        }
        View a3 = a2.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                a2.a().put(keyCode, new WeakReference(a3));
            }
        }
        if (a3 != null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.view.View r5, android.view.KeyEvent r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 >= r2) goto L_0x0065
            dw r5 = defpackage.dw.a(r5)
            java.lang.ref.WeakReference r0 = r5.c
            r2 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x0018
        L_0x0011:
            java.lang.Object r0 = r0.get()
            if (r0 != r6) goto L_0x0018
        L_0x0017:
            goto L_0x0064
        L_0x0018:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r5.c = r0
            android.util.SparseArray r0 = r5.a()
            int r3 = r6.getAction()
            r4 = 0
            if (r3 != r2) goto L_0x003f
            int r3 = r6.getKeyCode()
            int r3 = r0.indexOfKey(r3)
            if (r3 < 0) goto L_0x003e
            java.lang.Object r4 = r0.valueAt(r3)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r0.removeAt(r3)
            goto L_0x0040
        L_0x003e:
        L_0x003f:
        L_0x0040:
            if (r4 != 0) goto L_0x004d
            int r6 = r6.getKeyCode()
            java.lang.Object r6 = r0.get(r6)
            r4 = r6
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
        L_0x004d:
            if (r4 == 0) goto L_0x0017
            java.lang.Object r6 = r4.get()
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0062
            boolean r0 = o(r6)
            if (r0 != 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            r5.b(r6)
            return r2
        L_0x0062:
        L_0x0063:
            r1 = 1
        L_0x0064:
            return r1
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx.a(android.view.View, android.view.KeyEvent):boolean");
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th2) {
            b = true;
            return null;
        }
    }

    public static CharSequence r(View view) {
        return (CharSequence) new dr(CharSequence.class).b(view);
    }

    public static ColorStateList k(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode l(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    public static Display p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    public static int e(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    public static int a(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAutofill();
    }

    public static int f(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    public static int h(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    public static int g(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    public static int i(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    public static boolean c(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    public static boolean o(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    public static boolean n(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    public static boolean q(View view) {
        Boolean bool = (Boolean) new dq(Boolean.class).b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    static void s(View view) {
        int i;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            CharSequence r = r(view);
            int i2 = Build.VERSION.SDK_INT;
            if (view.getAccessibilityLiveRegion() != 0 || (r != null && view.getVisibility() == 0)) {
                if (r == null) {
                    i = 2048;
                } else {
                    i = 32;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i);
                obtain.setContentChangeTypes(16);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 16);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void d(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void j(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    public static void a(View view, dj djVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (djVar == null && (b(view) instanceof di)) {
            djVar = new dj();
        }
        if (djVar != null) {
            accessibilityDelegate = djVar.a;
        } else {
            accessibilityDelegate = null;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void a(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    public static void a(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    public static void t(View view) {
        int i = Build.VERSION.SDK_INT;
        view.setImportantForAutofill(8);
    }

    public static void a(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setZ(f);
    }

    public static void m(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }
}
