package p000;

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

/* renamed from: dx */
/* compiled from: PG */
public final class C0107dx {

    /* renamed from: a */
    private static Field f9109a;

    /* renamed from: b */
    private static boolean f9110b = false;

    static {
        new AtomicInteger(1);
        new C0103dt();
    }

    /* renamed from: b */
    static boolean m7205b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C0106dw a = C0106dw.m7190a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = a.f9106b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!C0106dw.f9105a.isEmpty()) {
                synchronized (C0106dw.f9105a) {
                    if (a.f9106b == null) {
                        a.f9106b = new WeakHashMap();
                    }
                    for (int size = C0106dw.f9105a.size() - 1; size >= 0; size--) {
                        View view2 = (View) ((WeakReference) C0106dw.f9105a.get(size)).get();
                        if (view2 != null) {
                            a.f9106b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a.f9106b.put((View) parent, Boolean.TRUE);
                            }
                        } else {
                            C0106dw.f9105a.remove(size);
                        }
                    }
                }
            }
        }
        View a2 = a.mo4690a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                a.mo4689a().put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m7203a(android.view.View r5, android.view.KeyEvent r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 >= r2) goto L_0x0065
            dw r5 = p000.C0106dw.m7190a(r5)
            java.lang.ref.WeakReference r0 = r5.f9107c
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
            r5.f9107c = r0
            android.util.SparseArray r0 = r5.mo4689a()
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
            boolean r0 = m7218o(r6)
            if (r0 != 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            r5.mo4691b(r6)
            return r2
        L_0x0062:
        L_0x0063:
            r1 = 1
        L_0x0064:
            return r1
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0107dx.m7203a(android.view.View, android.view.KeyEvent):boolean");
    }

    /* renamed from: b */
    public static View.AccessibilityDelegate m7204b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f9110b) {
            return null;
        }
        if (f9109a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f9109a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f9110b = true;
                return null;
            }
        }
        try {
            Object obj = f9109a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th2) {
            f9110b = true;
            return null;
        }
    }

    /* renamed from: r */
    public static CharSequence m7221r(View view) {
        return (CharSequence) new C0101dr(CharSequence.class).mo4687b(view);
    }

    /* renamed from: k */
    public static ColorStateList m7214k(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    /* renamed from: l */
    public static PorterDuff.Mode m7215l(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    /* renamed from: p */
    public static Display m7219p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    /* renamed from: e */
    public static int m7208e(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    /* renamed from: a */
    public static int m7194a(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAutofill();
    }

    /* renamed from: f */
    public static int m7209f(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    /* renamed from: h */
    public static int m7211h(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    /* renamed from: g */
    public static int m7210g(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    /* renamed from: i */
    public static int m7212i(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: c */
    public static boolean m7206c(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    /* renamed from: o */
    public static boolean m7218o(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    /* renamed from: n */
    public static boolean m7217n(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    /* renamed from: q */
    public static boolean m7220q(View view) {
        Boolean bool = (Boolean) new C0100dq(Boolean.class).mo4687b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: s */
    static void m7222s(View view) {
        int i;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            CharSequence r = m7221r(view);
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

    /* renamed from: d */
    public static void m7207d(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m7201a(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m7202a(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: j */
    public static void m7213j(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    /* renamed from: a */
    public static void m7200a(View view, C0093dj djVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (djVar == null && (m7204b(view) instanceof C0092di)) {
            djVar = new C0093dj();
        }
        if (djVar != null) {
            accessibilityDelegate = djVar.f8670a;
        } else {
            accessibilityDelegate = null;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m7199a(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m7197a(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m7198a(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m7196a(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    /* renamed from: t */
    public static void m7223t(View view) {
        int i = Build.VERSION.SDK_INT;
        view.setImportantForAutofill(8);
    }

    /* renamed from: a */
    public static void m7195a(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setZ(f);
    }

    /* renamed from: m */
    public static void m7216m(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }
}
