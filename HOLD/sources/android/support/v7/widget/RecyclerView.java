package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.tvlauncher.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class RecyclerView extends ViewGroup {
    public static final Interpolator K = new jl();
    private static final int[] L = {16843830};
    private static final Class[] M = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public final kl A;
    public iq B;
    public io C;
    public final kk D;
    public List E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ko I;
    public final int[] J;
    private final ke N;
    private kg O;
    private boolean P;
    private final Rect Q;
    private int R;
    private boolean S;
    private int T;
    private final AccessibilityManager U;
    private boolean V;
    private int W;
    public final kc a;
    private int aa;
    private int ab;
    private VelocityTracker ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private final int ai;
    private final int aj;
    private float ak;
    private float al;
    private js am;
    private final int[] an;
    private dm ao;
    private final int[] ap;
    private final int[] aq;
    private final List ar;
    private Runnable as;
    private final ll at;
    public gw b;
    public ho c;
    public final lm d;
    public final Runnable e;
    public final Rect f;
    public jp g;
    public jx h;
    public kd i;
    public final ArrayList j;
    public final ArrayList k;
    public jz l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public EdgeEffect t;
    public EdgeEffect u;
    public EdgeEffect v;
    public EdgeEffect w;
    public ju x;
    public int y;
    public boolean z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = Build.VERSION.SDK_INT;
        int i9 = Build.VERSION.SDK_INT;
    }

    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public final boolean getClipToPadding() {
        return this.P;
    }

    public final boolean isAttachedToWindow() {
        return this.m;
    }

    public final boolean isLayoutSuppressed() {
        return this.q;
    }

    public final boolean l() {
        return this.W > 0;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dx.a(android.view.View, int):void
     arg types: [android.support.v7.widget.RecyclerView, int]
     candidates:
      dx.a(android.view.View, float):void
      dx.a(android.view.View, android.content.res.ColorStateList):void
      dx.a(android.view.View, android.graphics.PorterDuff$Mode):void
      dx.a(android.view.View, android.graphics.drawable.Drawable):void
      dx.a(android.view.View, dj):void
      dx.a(android.view.View, java.lang.Runnable):void
      dx.a(android.view.View, android.view.KeyEvent):boolean
      dx.a(android.view.View, int):void */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z2;
        String str;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        this.N = new ke(this);
        this.a = new kc(this);
        this.d = new lm();
        this.e = new jj(this);
        this.f = new Rect();
        this.Q = new Rect();
        new RectF();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.R = 0;
        this.s = false;
        this.V = false;
        this.W = 0;
        this.aa = 0;
        this.x = new ia();
        this.y = 0;
        this.ab = -1;
        this.ak = Float.MIN_VALUE;
        this.al = Float.MIN_VALUE;
        this.z = true;
        this.A = new kl(this);
        this.C = new io();
        this.D = new kk();
        this.F = false;
        this.G = false;
        this.am = new jv(this);
        this.H = false;
        this.an = new int[2];
        this.ap = new int[2];
        this.aq = new int[2];
        this.J = new int[2];
        this.ar = new ArrayList();
        this.as = new jk(this);
        this.at = new jm(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ah = viewConfiguration.getScaledTouchSlop();
        this.ak = dy.a(viewConfiguration);
        this.al = dy.b(viewConfiguration);
        this.ai = viewConfiguration.getScaledMinimumFlingVelocity();
        this.aj = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.x.h = this.am;
        this.b = new gw(new jo(this));
        this.c = new ho(new jn(this));
        if (dx.a(this) == 0) {
            dx.t(this);
        }
        if (dx.e(this) == 0) {
            dx.a((View) this, 1);
        }
        this.U = (AccessibilityManager) getContext().getSystemService("accessibility");
        a(new ko(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, eu.a, i3, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, eu.a, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.P = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + a());
            }
            Resources resources = getContext().getResources();
            str = string;
            new ij(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            str = string;
        }
        obtainStyledAttributes.recycle();
        a(context2, str, attributeSet2, i3);
        int i4 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, L, i3, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, L, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public final void a(km kmVar) {
        View view = kmVar.a;
        ViewParent parent = view.getParent();
        this.a.b(a(view));
        if (kmVar.n()) {
            this.c.a(view, -1, view.getLayoutParams(), true);
        } else if (parent == this) {
            ho hoVar = this.c;
            int a2 = hoVar.a.a(view);
            if (a2 >= 0) {
                hoVar.b.a(a2);
                hoVar.a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else {
            this.c.a(view, -1, true);
        }
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        jx jxVar = this.h;
        if (jxVar == null) {
            super.addFocusables(arrayList, i2, i3);
        } else {
            jxVar.a(this, arrayList, i2, i3);
        }
    }

    public final void a(akr akr) {
        jx jxVar = this.h;
        if (jxVar != null) {
            jxVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.j.isEmpty()) {
            setWillNotDraw(false);
        }
        this.j.add(akr);
        n();
        requestLayout();
    }

    public final void a(String str) {
        if (!l()) {
            if (this.aa > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + a()));
            }
        } else if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + a());
        } else {
            throw new IllegalStateException(str);
        }
    }

    private final void u() {
        t();
        b(0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof jy) && ((jy) layoutParams) != null;
    }

    public static void b(km kmVar) {
        WeakReference weakReference = kmVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != kmVar.a) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        view = null;
                    } else {
                        view = (View) parent;
                    }
                } else {
                    return;
                }
            }
            kmVar.b = null;
        }
    }

    private final void B() {
        int b2 = this.c.b();
        for (int i2 = 0; i2 < b2; i2++) {
            km c2 = c(this.c.c(i2));
            if (!c2.b()) {
                c2.U();
            }
        }
        kc kcVar = this.a;
        int size = kcVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((km) kcVar.c.get(i3)).U();
        }
        int size2 = kcVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((km) kcVar.a.get(i4)).U();
        }
        ArrayList arrayList = kcVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((km) kcVar.b.get(i5)).U();
            }
        }
    }

    public final int computeHorizontalScrollExtent() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean c2 = jxVar.c();
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean c2 = jxVar.c();
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean c2 = jxVar.c();
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean d2 = jxVar.d();
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean d2 = jxVar.d();
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        jx jxVar = this.h;
        if (jxVar != null) {
            boolean d2 = jxVar.d();
        }
        return 0;
    }

    public final void b(int i2, int i3) {
        EdgeEffect edgeEffect = this.t;
        boolean z2 = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i2 > 0) {
            this.t.onRelease();
            z2 = this.t.isFinished();
        }
        EdgeEffect edgeEffect2 = this.v;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.v.onRelease();
            z2 |= this.v.isFinished();
        }
        EdgeEffect edgeEffect3 = this.u;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.u.onRelease();
            z2 |= this.u.isFinished();
        }
        EdgeEffect edgeEffect4 = this.w;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.w.onRelease();
            z2 |= this.w.isFinished();
        }
        if (z2) {
            dx.d(this);
        }
    }

    public final void c() {
        if (!this.o || this.s) {
            bu.a("RV FullInvalidate");
            y();
            bu.a();
        } else if (!this.b.d()) {
        } else {
            if (this.b.a(4) && !this.b.a(11)) {
                bu.a("RV PartialInvalidate");
                d();
                j();
                this.b.b();
                if (!this.p) {
                    int a2 = this.c.a();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= a2) {
                            this.b.c();
                            break;
                        }
                        km c2 = c(this.c.b(i2));
                        if (c2 != null && !c2.b() && c2.t()) {
                            y();
                            break;
                        }
                        i2++;
                    }
                }
                a(true);
                v();
                bu.a();
            } else if (this.b.d()) {
                bu.a("RV FullInvalidate");
                y();
                bu.a();
            }
        }
    }

    private final void a(Context context, String str, AttributeSet attributeSet, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(jx.class);
                    try {
                        constructor = asSubclass.getConstructor(M);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), 0};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    a((jx) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ad, code lost:
        if (r0.c.c(getFocusedChild()) != false) goto L_0x04af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x055d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void y() {
        /*
            r17 = this;
            r0 = r17
            jp r1 = r0.g
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x000e:
            jx r1 = r0.h
            if (r1 == 0) goto L_0x057e
            kk r1 = r0.D
            r3 = 0
            r1.i = r3
            int r4 = r1.d
            r7 = 4
            r8 = -1
            r9 = 0
            r10 = 1
            if (r4 != r10) goto L_0x020d
            r1.a(r10)
            kk r1 = r0.D
            r0.a(r1)
            kk r1 = r0.D
            r1.i = r3
            r17.d()
            lm r1 = r0.d
            r1.a()
            r17.j()
            r17.x()
            boolean r1 = r0.z
            if (r1 == 0) goto L_0x004d
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x004d
            jp r1 = r0.g
            if (r1 == 0) goto L_0x004c
            android.view.View r1 = r17.getFocusedChild()
            goto L_0x004e
        L_0x004c:
        L_0x004d:
            r1 = r9
        L_0x004e:
            if (r1 == 0) goto L_0x005c
            android.view.View r1 = r0.b(r1)
            if (r1 == 0) goto L_0x005b
            km r1 = r0.a(r1)
            goto L_0x005d
        L_0x005b:
        L_0x005c:
            r1 = r9
        L_0x005d:
            if (r1 == 0) goto L_0x00b3
            kk r4 = r0.D
            jp r11 = r0.g
            boolean r11 = r11.a
            if (r11 == 0) goto L_0x006a
            long r11 = r1.e
            goto L_0x006d
        L_0x006a:
            r11 = -1
        L_0x006d:
            r4.m = r11
            boolean r11 = r0.s
            if (r11 != 0) goto L_0x0082
            boolean r11 = r1.m()
            if (r11 == 0) goto L_0x007c
            int r11 = r1.d
            goto L_0x0084
        L_0x007c:
            int r11 = r1.d()
            goto L_0x0084
        L_0x0082:
            r11 = -1
        L_0x0084:
            r4.l = r11
            kk r4 = r0.D
            android.view.View r1 = r1.a
            int r11 = r1.getId()
        L_0x008e:
            boolean r12 = r1.isFocused()
            if (r12 != 0) goto L_0x00b0
            boolean r12 = r1 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x00b0
            boolean r12 = r1.hasFocus()
            if (r12 == 0) goto L_0x00b0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getFocusedChild()
            int r12 = r1.getId()
            if (r12 == r8) goto L_0x008e
            int r11 = r1.getId()
            goto L_0x008e
        L_0x00b0:
            r4.n = r11
            goto L_0x00b6
        L_0x00b3:
            r17.z()
        L_0x00b6:
            kk r1 = r0.D
            boolean r4 = r1.j
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r0.G
            if (r4 == 0) goto L_0x00c2
            r4 = 1
            goto L_0x00c5
        L_0x00c2:
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            r1.h = r4
            r0.G = r3
            r0.F = r3
            boolean r4 = r1.k
            r1.g = r4
            jp r4 = r0.g
            int r4 = r4.a()
            r1.e = r4
            int[] r1 = r0.an
            r0.a(r1)
            kk r1 = r0.D
            boolean r1 = r1.j
            if (r1 == 0) goto L_0x0149
            ho r1 = r0.c
            int r1 = r1.a()
            r4 = 0
        L_0x00e9:
            if (r4 >= r1) goto L_0x0149
            ho r11 = r0.c
            android.view.View r11 = r11.b(r4)
            km r11 = c(r11)
            boolean r12 = r11.b()
            if (r12 == 0) goto L_0x00fc
            goto L_0x0146
        L_0x00fc:
            boolean r12 = r11.j()
            if (r12 != 0) goto L_0x0103
            goto L_0x010a
        L_0x0103:
            jp r12 = r0.g
            boolean r12 = r12.a
            if (r12 != 0) goto L_0x010a
            goto L_0x0146
        L_0x010a:
            ju r12 = r0.x
            kk r13 = r0.D
            int r14 = defpackage.ju.d(r11)
            java.util.List r15 = r11.q()
            jt r12 = r12.a(r13, r11, r14, r15)
            lm r13 = r0.d
            r13.a(r11, r12)
            kk r12 = r0.D
            boolean r12 = r12.h
            if (r12 == 0) goto L_0x0146
            boolean r12 = r11.t()
            if (r12 == 0) goto L_0x0146
            boolean r12 = r11.m()
            if (r12 != 0) goto L_0x0146
            boolean r12 = r11.b()
            if (r12 != 0) goto L_0x0146
            boolean r12 = r11.j()
            if (r12 != 0) goto L_0x0146
            long r12 = r0.d(r11)
            lm r14 = r0.d
            r14.a(r12, r11)
        L_0x0146:
            int r4 = r4 + 1
            goto L_0x00e9
        L_0x0149:
            kk r1 = r0.D
            boolean r1 = r1.k
            r4 = 2
            if (r1 != 0) goto L_0x0155
            r17.B()
            goto L_0x01dd
        L_0x0155:
            ho r1 = r0.c
            int r1 = r1.b()
            r11 = 0
        L_0x015c:
            if (r11 < r1) goto L_0x01f0
            kk r1 = r0.D
            boolean r11 = r1.f
            r1.f = r3
            jx r12 = r0.h
            kc r13 = r0.a
            r12.a(r13, r1)
            kk r1 = r0.D
            r1.f = r11
            r1 = 0
        L_0x0170:
            ho r11 = r0.c
            int r11 = r11.a()
            if (r1 >= r11) goto L_0x01da
            ho r11 = r0.c
            android.view.View r11 = r11.b(r1)
            km r11 = c(r11)
            boolean r12 = r11.b()
            if (r12 != 0) goto L_0x01d7
            lm r12 = r0.d
            dd r12 = r12.a
            java.lang.Object r12 = r12.get(r11)
            lk r12 = (defpackage.lk) r12
            if (r12 == 0) goto L_0x0199
            int r12 = r12.a
            r12 = r12 & r7
            if (r12 != 0) goto L_0x01d7
        L_0x0199:
            int r12 = defpackage.ju.d(r11)
            r13 = 8192(0x2000, float:1.14794E-41)
            boolean r13 = r11.o(r13)
            if (r13 != 0) goto L_0x01a7
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x01a7:
            ju r14 = r0.x
            kk r15 = r0.D
            java.util.List r5 = r11.q()
            jt r5 = r14.a(r15, r11, r12, r5)
            if (r13 != 0) goto L_0x01d4
            lm r6 = r0.d
            dd r12 = r6.a
            java.lang.Object r12 = r12.get(r11)
            lk r12 = (defpackage.lk) r12
            if (r12 != 0) goto L_0x01cb
            lk r12 = defpackage.lk.a()
            dd r6 = r6.a
            r6.put(r11, r12)
            goto L_0x01cc
        L_0x01cb:
        L_0x01cc:
            int r6 = r12.a
            r6 = r6 | r4
            r12.a = r6
            r12.b = r5
            goto L_0x01d7
        L_0x01d4:
            r0.a(r11, r5)
        L_0x01d7:
            int r1 = r1 + 1
            goto L_0x0170
        L_0x01da:
            r17.B()
        L_0x01dd:
            r17.v()
            r0.a(r3)
            kk r1 = r0.D
            r1.d = r4
            jx r1 = r0.h
            r1.b(r0)
            r17.A()
            goto L_0x0244
        L_0x01f0:
            ho r5 = r0.c
            android.view.View r5 = r5.c(r11)
            km r5 = c(r5)
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x0201
        L_0x0200:
            goto L_0x0209
        L_0x0201:
            int r6 = r5.d
            if (r6 != r8) goto L_0x0200
            int r6 = r5.c
            r5.d = r6
        L_0x0209:
            int r11 = r11 + 1
            goto L_0x015c
        L_0x020d:
            gw r1 = r0.b
            java.util.ArrayList r4 = r1.b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0218
        L_0x0217:
            goto L_0x0221
        L_0x0218:
            java.util.ArrayList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x023c
            goto L_0x0217
        L_0x0221:
            jx r1 = r0.h
            int r1 = r1.h
            int r4 = r17.getWidth()
            if (r1 != r4) goto L_0x023c
            jx r1 = r0.h
            int r1 = r1.i
            int r4 = r17.getHeight()
            if (r1 == r4) goto L_0x0236
            goto L_0x023c
        L_0x0236:
            jx r1 = r0.h
            r1.b(r0)
            goto L_0x0244
        L_0x023c:
            jx r1 = r0.h
            r1.b(r0)
            r17.A()
        L_0x0244:
            kk r1 = r0.D
            r1.a(r7)
            r17.d()
            r17.j()
            kk r1 = r0.D
            r1.d = r10
            boolean r1 = r1.j
            if (r1 == 0) goto L_0x0424
            ho r1 = r0.c
            int r1 = r1.a()
            int r1 = r1 + r8
        L_0x025e:
            if (r1 >= 0) goto L_0x02f8
            lm r4 = r0.d
            ll r5 = r0.at
            dd r1 = r4.a
            int r1 = r1.c
            int r1 = r1 + r8
        L_0x0269:
            if (r1 >= 0) goto L_0x026d
            goto L_0x0424
        L_0x026d:
            dd r2 = r4.a
            java.lang.Object r2 = r2.b(r1)
            km r2 = (defpackage.km) r2
            dd r6 = r4.a
            java.lang.Object r6 = r6.d(r1)
            lk r6 = (defpackage.lk) r6
            int r7 = r6.a
            r11 = r7 & 3
            r12 = 3
            if (r11 == r12) goto L_0x02ee
            r11 = r7 & 1
            if (r11 != 0) goto L_0x02e0
            r11 = r7 & 14
            r12 = 14
            if (r11 != r12) goto L_0x0296
            jt r7 = r6.b
            jt r11 = r6.c
            r5.b(r2, r7, r11)
            goto L_0x02f1
        L_0x0296:
            r11 = r7 & 12
            r12 = 12
            if (r11 != r12) goto L_0x02ca
            jt r7 = r6.b
            jt r11 = r6.c
            r2.a(r3)
            r12 = r5
            jm r12 = (defpackage.jm) r12
            android.support.v7.widget.RecyclerView r13 = r12.a
            boolean r14 = r13.s
            if (r14 == 0) goto L_0x02bb
            ju r13 = r13.x
            boolean r2 = r13.a(r2, r2, r7, r11)
            if (r2 == 0) goto L_0x02f1
            android.support.v7.widget.RecyclerView r2 = r12.a
            r2.m()
            goto L_0x02f1
        L_0x02bb:
            ju r13 = r13.x
            boolean r2 = r13.c(r2, r7, r11)
            if (r2 == 0) goto L_0x02f1
            android.support.v7.widget.RecyclerView r2 = r12.a
            r2.m()
            goto L_0x02f1
        L_0x02ca:
            r11 = r7 & 4
            if (r11 == 0) goto L_0x02d4
            jt r7 = r6.b
            r5.a(r2, r7, r9)
            goto L_0x02f1
        L_0x02d4:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x02f1
            jt r7 = r6.b
            jt r11 = r6.c
            r5.b(r2, r7, r11)
            goto L_0x02f1
        L_0x02e0:
            jt r7 = r6.b
            if (r7 != 0) goto L_0x02e8
            r5.a(r2)
            goto L_0x02f1
        L_0x02e8:
            jt r11 = r6.c
            r5.a(r2, r7, r11)
            goto L_0x02f1
        L_0x02ee:
            r5.a(r2)
        L_0x02f1:
            defpackage.lk.a(r6)
            int r1 = r1 + -1
            goto L_0x0269
        L_0x02f8:
            ho r4 = r0.c
            android.view.View r4 = r4.b(r1)
            km r4 = c(r4)
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x041f
            long r5 = r0.d(r4)
            ju r11 = r0.x
            kk r12 = r0.D
            jt r11 = r11.a(r12, r4)
            lm r12 = r0.d
            cr r12 = r12.b
            java.lang.Object r12 = r12.a(r5)
            km r12 = (defpackage.km) r12
            if (r12 == 0) goto L_0x041a
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x041a
            lm r13 = r0.d
            boolean r13 = r13.a(r12)
            lm r14 = r0.d
            boolean r14 = r14.a(r4)
            if (r13 != 0) goto L_0x0335
            goto L_0x033e
        L_0x0335:
            if (r12 != r4) goto L_0x033e
            lm r5 = r0.d
            r5.b(r4, r11)
            goto L_0x041f
        L_0x033e:
            lm r15 = r0.d
            jt r15 = r15.a(r12, r7)
            lm r7 = r0.d
            r7.b(r4, r11)
            lm r7 = r0.d
            r11 = 8
            jt r7 = r7.a(r4, r11)
            if (r15 != 0) goto L_0x03ed
            ho r7 = r0.c
            int r11 = r7.a()
            r7 = 0
        L_0x035a:
            if (r7 < r11) goto L_0x0381
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = " cannot be found but it is necessary for "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r17.a()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r2, r4)
            goto L_0x041f
        L_0x0381:
            ho r13 = r0.c
            android.view.View r13 = r13.b(r7)
            km r13 = c(r13)
            if (r13 != r4) goto L_0x038e
            goto L_0x03e8
        L_0x038e:
            long r14 = r0.d(r13)
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x03e8
            jp r1 = r0.g
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x03c4
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x03c4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.append(r5)
            r3.append(r13)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r17.a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x03c4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.append(r5)
            r3.append(r13)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r17.a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x03e8:
            int r7 = r7 + 1
            goto L_0x035a
        L_0x03ed:
            r12.a(r3)
            if (r13 == 0) goto L_0x03f6
            r0.a(r12)
        L_0x03f6:
            if (r12 != r4) goto L_0x03f9
            goto L_0x040e
        L_0x03f9:
            if (r14 != 0) goto L_0x03fc
            goto L_0x03ff
        L_0x03fc:
            r0.a(r4)
        L_0x03ff:
            r12.h = r4
            r0.a(r12)
            kc r5 = r0.a
            r5.b(r12)
            r4.a(r3)
            r4.i = r12
        L_0x040e:
            ju r5 = r0.x
            boolean r4 = r5.a(r12, r4, r15, r7)
            if (r4 == 0) goto L_0x041f
            r17.m()
            goto L_0x041f
        L_0x041a:
            lm r5 = r0.d
            r5.b(r4, r11)
        L_0x041f:
            int r1 = r1 + -1
            r7 = 4
            goto L_0x025e
        L_0x0424:
            jx r1 = r0.h
            kc r2 = r0.a
            r1.a(r2)
            kk r1 = r0.D
            int r2 = r1.e
            r1.b = r2
            r0.s = r3
            r0.V = r3
            r1.j = r3
            r1.k = r3
            jx r1 = r0.h
            r1.d = r3
            kc r1 = r0.a
            java.util.ArrayList r1 = r1.b
            if (r1 != 0) goto L_0x0444
            goto L_0x0447
        L_0x0444:
            r1.clear()
        L_0x0447:
            jx r1 = r0.h
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x0456
            r1.f = r3
            r1.g = r3
            kc r1 = r0.a
            r1.b()
        L_0x0456:
            r17.v()
            r0.a(r3)
            lm r1 = r0.d
            r1.a()
            int[] r1 = r0.an
            r2 = r1[r3]
            r4 = r1[r10]
            r0.a(r1)
            int[] r1 = r0.an
            r5 = r1[r3]
            if (r5 != r2) goto L_0x0475
            r1 = r1[r10]
            if (r1 != r4) goto L_0x0475
            goto L_0x0479
        L_0x0475:
            r0.c(r3, r3)
        L_0x0479:
            boolean r1 = r0.z
            if (r1 == 0) goto L_0x057a
            jp r1 = r0.g
            if (r1 == 0) goto L_0x057a
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x057a
            int r1 = r17.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L_0x057a
            int r1 = r17.getDescendantFocusability()
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r2) goto L_0x049d
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x057a
        L_0x049d:
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x04af
            android.view.View r1 = r17.getFocusedChild()
            ho r2 = r0.c
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L_0x057a
        L_0x04af:
            kk r1 = r0.D
            long r1 = r1.m
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x04f7
            jp r4 = r0.g
            boolean r5 = r4.a
            if (r5 != 0) goto L_0x04c0
            goto L_0x04f7
        L_0x04c0:
            if (r4 == 0) goto L_0x04f7
            ho r4 = r0.c
            int r4 = r4.b()
            r6 = r9
            r5 = 0
        L_0x04ca:
            if (r5 >= r4) goto L_0x04f8
            ho r7 = r0.c
            android.view.View r7 = r7.c(r5)
            km r7 = c(r7)
            if (r7 != 0) goto L_0x04d9
            goto L_0x04f3
        L_0x04d9:
            boolean r10 = r7.m()
            if (r10 != 0) goto L_0x04f3
            long r10 = r7.e
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x04f3
            ho r6 = r0.c
            android.view.View r10 = r7.a
            boolean r6 = r6.c(r10)
            if (r6 == 0) goto L_0x04f1
            r6 = r7
            goto L_0x04f3
        L_0x04f1:
            r6 = r7
            goto L_0x04f8
        L_0x04f3:
            int r5 = r5 + 1
            goto L_0x04ca
        L_0x04f7:
            r6 = r9
        L_0x04f8:
            if (r6 == 0) goto L_0x0510
            ho r1 = r0.c
            android.view.View r2 = r6.a
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L_0x0510
            android.view.View r1 = r6.a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x050d
            goto L_0x0510
        L_0x050d:
            android.view.View r9 = r6.a
            goto L_0x055b
        L_0x0510:
            ho r1 = r0.c
            int r1 = r1.a()
            if (r1 <= 0) goto L_0x0559
            kk r1 = r0.D
            int r2 = r1.l
            if (r2 == r8) goto L_0x051f
            goto L_0x0521
        L_0x051f:
            r2 = 0
        L_0x0521:
            int r1 = r1.a()
            r3 = r2
        L_0x0526:
            if (r3 >= r1) goto L_0x053e
            km r4 = r0.e(r3)
            if (r4 == 0) goto L_0x053e
            android.view.View r5 = r4.a
            boolean r5 = r5.hasFocusable()
            if (r5 == 0) goto L_0x0539
            android.view.View r9 = r4.a
            goto L_0x055b
        L_0x0539:
            int r3 = r3 + 1
            goto L_0x0526
        L_0x053e:
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = r1 + r8
        L_0x0543:
            if (r1 < 0) goto L_0x055a
            km r2 = r0.e(r1)
            if (r2 == 0) goto L_0x055a
            android.view.View r3 = r2.a
            boolean r3 = r3.hasFocusable()
            if (r3 == 0) goto L_0x0556
            android.view.View r9 = r2.a
            goto L_0x055b
        L_0x0556:
            int r1 = r1 + -1
            goto L_0x0543
        L_0x0559:
        L_0x055a:
        L_0x055b:
            if (r9 == 0) goto L_0x057a
            kk r1 = r0.D
            int r1 = r1.n
            long r2 = (long) r1
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0576
            android.view.View r1 = r9.findViewById(r1)
            if (r1 != 0) goto L_0x056f
            goto L_0x0576
        L_0x056f:
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x0576
            goto L_0x0577
        L_0x0576:
            r1 = r9
        L_0x0577:
            r1.requestFocus()
        L_0x057a:
            r17.z()
            return
        L_0x057e:
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.y():void");
    }

    private final void A() {
        boolean z2;
        d();
        j();
        this.D.a(6);
        this.b.e();
        this.D.e = this.g.a();
        kk kkVar = this.D;
        kkVar.c = 0;
        kkVar.g = false;
        this.h.a(this.a, kkVar);
        kk kkVar2 = this.D;
        kkVar2.f = false;
        this.O = null;
        if (!kkVar2.j || this.x == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        kkVar2.j = z2;
        kkVar2.d = 4;
        v();
        a(false);
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return C().a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return C().a(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return C().a(i2, i3, iArr, iArr2, 0);
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return C().a(i2, i3, iArr, iArr2, i4);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return C().a(i2, i3, i4, i5, iArr);
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        C().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void c(int i2, int i3) {
        this.aa++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        List list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((atc) this.E.get(size)).a(this);
            }
        }
        this.aa--;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        super.draw(canvas);
        int size = this.j.size();
        boolean z4 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((akr) this.j.get(i2)).a(canvas, this);
        }
        EdgeEffect edgeEffect = this.t;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.P ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.t;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.u;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.P) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.u;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.v;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.P ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.v;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.w;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.P) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.w;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save4);
        }
        if (z2 || (this.x != null && this.j.size() > 0 && this.x.b())) {
            dx.d(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void i() {
        if (this.w == null) {
            EdgeEffect a2 = aic.a(this);
            this.w = a2;
            if (this.P) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void f() {
        if (this.t == null) {
            EdgeEffect a2 = aic.a(this);
            this.t = a2;
            if (this.P) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void g() {
        if (this.v == null) {
            EdgeEffect a2 = aic.a(this);
            this.v = a2;
            if (this.P) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void h() {
        if (this.u == null) {
            EdgeEffect a2 = aic.a(this);
            this.u = a2;
            if (this.P) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String a() {
        return " " + super.toString() + ", adapter:" + this.g + ", layout:" + this.h + ", context:" + getContext();
    }

    private final void a(kk kkVar) {
        if (this.y == 2) {
            OverScroller overScroller = this.A.c;
            kkVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            kkVar.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        kkVar.o = 0;
        kkVar.p = 0;
    }

    public final View b(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    private final boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            jz jzVar = (jz) this.k.get(i2);
            if (jzVar.a(motionEvent) && action != 3) {
                this.l = jzVar;
                return true;
            }
        }
        return false;
    }

    private final void a(int[] iArr) {
        int a2 = this.c.a();
        if (a2 != 0) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 = 0; i4 < a2; i4++) {
                km c2 = c(this.c.b(i4));
                if (!c2.b()) {
                    int c3 = c2.c();
                    if (c3 < i2) {
                        i2 = c3;
                    }
                    if (c3 > i3) {
                        i3 = c3;
                    }
                }
            }
            iArr[0] = i2;
            iArr[1] = i3;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    public static RecyclerView e(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView e2 = e(viewGroup.getChildAt(i2));
                if (e2 != null) {
                    return e2;
                }
            }
        }
        return null;
    }

    public final km e(int i2) {
        km kmVar = null;
        if (!this.s) {
            int b2 = this.c.b();
            for (int i3 = 0; i3 < b2; i3++) {
                km c2 = c(this.c.c(i3));
                if (c2 != null && !c2.m() && c(c2) == i2) {
                    if (!this.c.c(c2.a)) {
                        return c2;
                    }
                    kmVar = c2;
                }
            }
        }
        return kmVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a0, code lost:
        if (r6 > 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c1, code lost:
        if (r5 > 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c4, code lost:
        if (r6 < 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        if (r5 < 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d0, code lost:
        if ((r5 * r3) < 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d9, code lost:
        if ((r5 * r3) > 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r6.findNextFocus(r0, r1, r2 == 2 ? 130 : 33) != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r6.findNextFocus(r0, r1, !((r0.h.f() == 1) ^ (r2 == 2)) ? 17 : 66) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (b(r18) == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        d();
        a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            jx r3 = r0.h
            android.view.View r3 = r3.c(r1, r2)
            if (r3 != 0) goto L_0x02e1
            jp r3 = r0.g
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0025
            jx r3 = r0.h
            if (r3 == 0) goto L_0x0025
            boolean r3 = r17.l()
            if (r3 != 0) goto L_0x0025
            boolean r3 = r0.q
            if (r3 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0026
        L_0x0024:
        L_0x0025:
            r3 = 0
        L_0x0026:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            r7 = 17
            r8 = 66
            r9 = 130(0x82, float:1.82E-43)
            r10 = 33
            r11 = 0
            r12 = 2
            if (r3 == 0) goto L_0x0091
            if (r2 != r12) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            if (r2 == r4) goto L_0x003d
            goto L_0x0091
        L_0x003d:
            jx r3 = r0.h
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0053
            if (r2 != r12) goto L_0x004a
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x004d
        L_0x004a:
            r3 = 33
        L_0x004d:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 == 0) goto L_0x007a
        L_0x0053:
            jx r3 = r0.h
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x008c
            jx r3 = r0.h
            int r3 = r3.f()
            if (r3 != r4) goto L_0x0065
            r3 = 1
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r2 != r12) goto L_0x006a
            r13 = 1
            goto L_0x006b
        L_0x006a:
            r13 = 0
        L_0x006b:
            r3 = r3 ^ r13
            if (r3 != 0) goto L_0x0071
            r3 = 17
            goto L_0x0074
        L_0x0071:
            r3 = 66
        L_0x0074:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x008c
        L_0x007a:
            r17.c()
            android.view.View r3 = r17.b(r18)
            if (r3 == 0) goto L_0x008a
            r17.d()
            r0.a(r5)
            goto L_0x008c
        L_0x008a:
            return r11
        L_0x008c:
            android.view.View r11 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00ad
        L_0x0091:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 == 0) goto L_0x0098
        L_0x0097:
            goto L_0x00ac
        L_0x0098:
            if (r3 == 0) goto L_0x0097
            r17.c()
            android.view.View r3 = r17.b(r18)
            if (r3 == 0) goto L_0x00ab
            r17.d()
            r0.a(r5)
            goto L_0x00ad
        L_0x00ab:
            return r11
        L_0x00ac:
            r11 = r6
        L_0x00ad:
            if (r11 == 0) goto L_0x01cb
            boolean r3 = r11.hasFocusable()
            if (r3 == 0) goto L_0x00b7
            goto L_0x01cb
        L_0x00b7:
            android.view.View r3 = r17.getFocusedChild()
            if (r3 == 0) goto L_0x01c6
            android.graphics.Rect r2 = r0.f
            int r3 = r11.getWidth()
            int r6 = r11.getHeight()
            r2.set(r5, r5, r3, r6)
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            boolean r3 = r2 instanceof defpackage.jy
            if (r3 == 0) goto L_0x00fe
            jy r2 = (defpackage.jy) r2
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00fe
            android.graphics.Rect r2 = r2.b
            android.graphics.Rect r3 = r0.f
            int r6 = r3.left
            int r7 = r2.left
            int r6 = r6 - r7
            r3.left = r6
            android.graphics.Rect r3 = r0.f
            int r6 = r3.right
            int r7 = r2.right
            int r6 = r6 + r7
            r3.right = r6
            android.graphics.Rect r3 = r0.f
            int r6 = r3.top
            int r7 = r2.top
            int r6 = r6 - r7
            r3.top = r6
            android.graphics.Rect r3 = r0.f
            int r6 = r3.bottom
            int r2 = r2.bottom
            int r6 = r6 + r2
            r3.bottom = r6
        L_0x00fe:
            jx r2 = r0.h
            android.graphics.Rect r3 = r0.f
            boolean r6 = r0.o
            r6 = r6 ^ r4
            int[] r7 = new int[r12]
            int r8 = r2.h()
            int r9 = r2.i()
            int r10 = r2.h
            int r12 = r2.j()
            int r13 = r2.i
            int r14 = r2.k()
            int r15 = r11.getLeft()
            int r4 = r3.left
            int r15 = r15 + r4
            int r4 = r11.getScrollX()
            int r15 = r15 - r4
            int r4 = r11.getTop()
            int r5 = r3.top
            int r4 = r4 + r5
            int r5 = r11.getScrollY()
            int r4 = r4 - r5
            int r5 = r3.width()
            int r3 = r3.height()
            int r8 = r15 - r8
            r11 = 0
            int r1 = java.lang.Math.min(r11, r8)
            int r9 = r4 - r9
            int r16 = java.lang.Math.min(r11, r9)
            int r15 = r15 + r5
            int r10 = r10 - r12
            int r15 = r15 - r10
            int r5 = java.lang.Math.max(r11, r15)
            int r4 = r4 + r3
            int r13 = r13 - r14
            int r4 = r4 - r13
            int r3 = java.lang.Math.max(r11, r4)
            int r4 = r2.f()
            r10 = 1
            if (r4 == r10) goto L_0x0165
            if (r1 != 0) goto L_0x0164
            int r1 = java.lang.Math.min(r8, r5)
            goto L_0x016d
        L_0x0164:
            goto L_0x016d
        L_0x0165:
            if (r5 != 0) goto L_0x016c
            int r1 = java.lang.Math.max(r1, r15)
            goto L_0x016d
        L_0x016c:
            r1 = r5
        L_0x016d:
            if (r16 != 0) goto L_0x0174
            int r16 = java.lang.Math.min(r9, r3)
            goto L_0x0175
        L_0x0174:
        L_0x0175:
            r3 = r16
            r4 = 0
            r7[r4] = r1
            r1 = 1
            r7[r1] = r3
            r1 = r7[r4]
            android.view.View r4 = r17.getFocusedChild()
            if (r4 == 0) goto L_0x01c3
            int r5 = r2.h()
            int r7 = r2.i()
            int r8 = r2.h
            int r9 = r2.j()
            int r10 = r2.i
            int r11 = r2.k()
            int r10 = r10 - r11
            android.support.v7.widget.RecyclerView r11 = r2.b
            android.graphics.Rect r11 = r11.f
            r2.a(r4, r11)
            int r2 = r11.left
            int r2 = r2 - r1
            int r8 = r8 - r9
            if (r2 >= r8) goto L_0x01c3
            int r2 = r11.right
            int r2 = r2 - r1
            if (r2 <= r5) goto L_0x01c3
            int r2 = r11.top
            int r2 = r2 - r3
            if (r2 >= r10) goto L_0x01c3
            int r2 = r11.bottom
            int r2 = r2 - r3
            if (r2 <= r7) goto L_0x01c3
            if (r1 != 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01c3
        L_0x01ba:
            if (r6 != 0) goto L_0x01c0
            r0.a(r1, r3)
            goto L_0x01c3
        L_0x01c0:
            r0.scrollBy(r1, r3)
        L_0x01c3:
            r1 = r18
            return r1
        L_0x01c6:
            android.view.View r1 = super.focusSearch(r18, r19)
            return r1
        L_0x01cb:
            if (r11 != 0) goto L_0x01cf
            goto L_0x02dc
        L_0x01cf:
            if (r11 == r0) goto L_0x02dc
            android.view.View r3 = r0.b(r11)
            if (r3 == 0) goto L_0x02dc
            if (r1 == 0) goto L_0x02db
            android.view.View r3 = r17.b(r18)
            if (r3 == 0) goto L_0x02db
            android.graphics.Rect r3 = r0.f
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            r6 = 0
            r3.set(r6, r6, r4, r5)
            android.graphics.Rect r3 = r0.Q
            int r4 = r11.getWidth()
            int r5 = r11.getHeight()
            r3.set(r6, r6, r4, r5)
            android.graphics.Rect r3 = r0.f
            r0.offsetDescendantRectToMyCoords(r1, r3)
            android.graphics.Rect r3 = r0.Q
            r0.offsetDescendantRectToMyCoords(r11, r3)
            jx r3 = r0.h
            int r3 = r3.f()
            r4 = -1
            r5 = 1
            if (r3 != r5) goto L_0x0210
            r3 = -1
            goto L_0x0212
        L_0x0210:
            r3 = 1
        L_0x0212:
            android.graphics.Rect r5 = r0.f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.left
            if (r5 < r13) goto L_0x0226
            android.graphics.Rect r5 = r0.f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.left
            if (r5 > r13) goto L_0x0230
        L_0x0226:
            android.graphics.Rect r5 = r0.f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.right
            if (r5 < r13) goto L_0x0253
        L_0x0230:
            android.graphics.Rect r5 = r0.f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.right
            if (r5 > r13) goto L_0x0244
            android.graphics.Rect r5 = r0.f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.right
            if (r5 < r13) goto L_0x0251
        L_0x0244:
            android.graphics.Rect r5 = r0.f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.Q
            int r13 = r13.left
            if (r5 <= r13) goto L_0x0250
            r5 = -1
            goto L_0x0254
        L_0x0250:
        L_0x0251:
            r5 = 0
            goto L_0x0254
        L_0x0253:
            r5 = 1
        L_0x0254:
            android.graphics.Rect r13 = r0.f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.top
            if (r13 < r14) goto L_0x0268
            android.graphics.Rect r13 = r0.f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.top
            if (r13 > r14) goto L_0x0272
        L_0x0268:
            android.graphics.Rect r13 = r0.f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.bottom
            if (r13 < r14) goto L_0x0292
        L_0x0272:
            android.graphics.Rect r13 = r0.f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.bottom
            if (r13 > r14) goto L_0x0286
            android.graphics.Rect r13 = r0.f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.bottom
            if (r13 < r14) goto L_0x0293
        L_0x0286:
            android.graphics.Rect r13 = r0.f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.Q
            int r14 = r14.top
            if (r13 <= r14) goto L_0x0293
            r6 = -1
            goto L_0x0293
        L_0x0292:
            r6 = 1
        L_0x0293:
            r4 = 1
            if (r2 == r4) goto L_0x02d3
            if (r2 == r12) goto L_0x02ca
            if (r2 == r7) goto L_0x02c7
            if (r2 == r10) goto L_0x02c4
            if (r2 == r8) goto L_0x02c1
            if (r2 != r9) goto L_0x02a3
            if (r6 <= 0) goto L_0x02dc
            goto L_0x02db
        L_0x02a3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid direction: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r17.a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x02c1:
            if (r5 <= 0) goto L_0x02dc
            goto L_0x02db
        L_0x02c4:
            if (r6 >= 0) goto L_0x02dc
            goto L_0x02db
        L_0x02c7:
            if (r5 >= 0) goto L_0x02dc
            goto L_0x02db
        L_0x02ca:
            if (r6 > 0) goto L_0x02db
            if (r6 != 0) goto L_0x02dc
            int r5 = r5 * r3
            if (r5 < 0) goto L_0x02dc
            goto L_0x02db
        L_0x02d3:
            if (r6 < 0) goto L_0x02db
            if (r6 != 0) goto L_0x02dc
            int r5 = r5 * r3
            if (r5 > 0) goto L_0x02dc
        L_0x02db:
            return r11
        L_0x02dc:
            android.view.View r1 = super.focusSearch(r18, r19)
            return r1
        L_0x02e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        jx jxVar = this.h;
        if (jxVar != null) {
            return jxVar.b();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        jx jxVar = this.h;
        if (jxVar != null) {
            return jxVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        jx jxVar = this.h;
        if (jxVar != null) {
            return jxVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public final int c(km kmVar) {
        if (kmVar.o(524) || !kmVar.l()) {
            return -1;
        }
        gw gwVar = this.b;
        int i2 = kmVar.c;
        int size = gwVar.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            gv gvVar = (gv) gwVar.a.get(i3);
            int i4 = gvVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = gvVar.b;
                    if (i5 <= i2) {
                        int i6 = gvVar.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = gvVar.b;
                    if (i7 == i2) {
                        i2 = gvVar.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (gvVar.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (gvVar.b <= i2) {
                i2 += gvVar.d;
            }
        }
        return i2;
    }

    public final int getBaseline() {
        if (this.h != null) {
            return -1;
        }
        return super.getBaseline();
    }

    private final long d(km kmVar) {
        return !this.g.a ? (long) kmVar.c : kmVar.e;
    }

    public final int d(View view) {
        km c2 = c(view);
        if (c2 == null) {
            return -1;
        }
        return c2.d();
    }

    public final km a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public static km c(View view) {
        if (view != null) {
            return ((jy) view.getLayoutParams()).a;
        }
        return null;
    }

    public static void a(View view, Rect rect) {
        jy jyVar = (jy) view.getLayoutParams();
        Rect rect2 = jyVar.b;
        rect.set((view.getLeft() - rect2.left) - jyVar.leftMargin, (view.getTop() - rect2.top) - jyVar.topMargin, view.getRight() + rect2.right + jyVar.rightMargin, view.getBottom() + rect2.bottom + jyVar.bottomMargin);
    }

    private final dm C() {
        if (this.ao == null) {
            this.ao = new dm(this);
        }
        return this.ao;
    }

    public final boolean hasNestedScrollingParent() {
        return C().a(0);
    }

    public final boolean q() {
        return !this.o || this.s || this.b.d();
    }

    private final void s() {
        this.w = null;
        this.u = null;
        this.v = null;
        this.t = null;
    }

    public final void p() {
        if (this.j.size() != 0) {
            jx jxVar = this.h;
            if (jxVar != null) {
                jxVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            n();
            requestLayout();
        }
    }

    public final boolean k() {
        AccessibilityManager accessibilityManager = this.U;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean o() {
        ju juVar = this.x;
        return juVar != null && juVar.b();
    }

    public final boolean isNestedScrollingEnabled() {
        return C().a;
    }

    public final void c(int i2) {
        if (this.h != null) {
            b(2);
            this.h.a(i2);
            awakenScrollBars();
        }
    }

    public final void n() {
        int b2 = this.c.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((jy) this.c.c(i2).getLayoutParams()).c = true;
        }
        kc kcVar = this.a;
        int size = kcVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            jy jyVar = (jy) ((km) kcVar.c.get(i3)).a.getLayoutParams();
            if (jyVar != null) {
                jyVar.c = true;
            }
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.c.b();
        for (int i5 = 0; i5 < b2; i5++) {
            km c2 = c(this.c.c(i5));
            if (c2 != null && !c2.b()) {
                int i6 = c2.c;
                if (i6 >= i4) {
                    c2.a(-i3, z2);
                    this.D.f = true;
                } else if (i6 >= i2) {
                    c2.b(8);
                    c2.a(-i3, z2);
                    c2.c = i2 - 1;
                    this.D.f = true;
                }
            }
        }
        kc kcVar = this.a;
        for (int size = kcVar.c.size() - 1; size >= 0; size--) {
            km kmVar = (km) kcVar.c.get(size);
            if (kmVar != null) {
                int i7 = kmVar.c;
                if (i7 >= i4) {
                    kmVar.a(-i3, z2);
                } else if (i7 >= i2) {
                    kmVar.b(8);
                    kcVar.b(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = 0;
        boolean z2 = true;
        this.m = true;
        if (!this.o || isLayoutRequested()) {
            z2 = false;
        }
        this.o = z2;
        this.H = false;
        iq iqVar = (iq) iq.a.get();
        this.B = iqVar;
        if (iqVar == null) {
            this.B = new iq();
            Display p2 = dx.p(this);
            float f2 = 60.0f;
            if (!isInEditMode() && p2 != null) {
                float refreshRate = p2.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            this.B.c = (long) (1.0E9f / f2);
            iq.a.set(this.B);
        }
        this.B.b.add(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ju juVar = this.x;
        if (juVar != null) {
            juVar.d();
        }
        e();
        this.m = false;
        this.ar.clear();
        removeCallbacks(this.as);
        lk.b();
        iq iqVar = this.B;
        if (iqVar != null) {
            iqVar.b.remove(this);
            this.B = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            akr akr = (akr) this.j.get(i2);
        }
    }

    public final void j() {
        this.W++;
    }

    private final void v() {
        b(true);
    }

    public final void b(boolean z2) {
        int i2;
        int i3 = this.W - 1;
        this.W = i3;
        if (i3 <= 0) {
            this.W = 0;
            if (z2) {
                int i4 = this.T;
                this.T = 0;
                if (i4 != 0 && k()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    int i5 = Build.VERSION.SDK_INT;
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.ar.size() - 1; size >= 0; size--) {
                    km kmVar = (km) this.ar.get(size);
                    if (kmVar.a.getParent() == this && !kmVar.b() && (i2 = kmVar.n) != -1) {
                        dx.a(kmVar.a, i2);
                        kmVar.n = -1;
                    }
                }
                this.ar.clear();
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.h != null && !this.q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.h.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.h.c()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        a((int) (f2 * this.ak), (int) (f3 * this.al), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.h.d()) {
                        f3 = -axisValue;
                        f2 = 0.0f;
                    } else if (this.h.c()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                    }
                    a((int) (f2 * this.ak), (int) (f3 * this.al), motionEvent);
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.ak), (int) (f3 * this.al), motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r0 != false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.q
            r1 = 0
            if (r0 != 0) goto L_0x0125
            r0 = 0
            r8.l = r0
            boolean r0 = r8.a(r9)
            r2 = 1
            if (r0 != 0) goto L_0x0121
            jx r0 = r8.h
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.c()
            jx r3 = r8.h
            boolean r3 = r3.d()
            android.view.VelocityTracker r4 = r8.ac
            if (r4 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.ac = r4
        L_0x0028:
            android.view.VelocityTracker r4 = r8.ac
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x00da
            if (r4 == r2) goto L_0x00d1
            if (r4 == r6) goto L_0x006f
            r0 = 3
            if (r4 == r0) goto L_0x006a
            r0 = 5
            if (r4 == r0) goto L_0x004e
            r0 = 6
            if (r4 == r0) goto L_0x0049
            goto L_0x0119
        L_0x0049:
            r8.b(r9)
            goto L_0x0119
        L_0x004e:
            int r0 = r9.getPointerId(r5)
            r8.ab = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.af = r0
            r8.ad = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.ag = r9
            r8.ae = r9
            goto L_0x0119
        L_0x006a:
            r8.u()
            goto L_0x0119
        L_0x006f:
            int r4 = r8.ab
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x0095
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.ab
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L_0x0095:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.y
            if (r4 == r2) goto L_0x0119
            int r4 = r8.ad
            int r4 = r5 - r4
            int r6 = r8.ae
            int r6 = r9 - r6
            if (r0 == 0) goto L_0x00bc
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.ah
            if (r0 <= r4) goto L_0x00bb
            r8.af = r5
            r0 = 1
            goto L_0x00bd
        L_0x00bb:
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r3 != 0) goto L_0x00c0
            goto L_0x00cb
        L_0x00c0:
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.ah
            if (r3 <= r4) goto L_0x00cb
            r8.ag = r9
            goto L_0x00cd
        L_0x00cb:
            if (r0 == 0) goto L_0x0119
        L_0x00cd:
            r8.b(r2)
            goto L_0x0119
        L_0x00d1:
            android.view.VelocityTracker r9 = r8.ac
            r9.clear()
            r8.f(r1)
            goto L_0x0119
        L_0x00da:
            boolean r4 = r8.S
            if (r4 == 0) goto L_0x00e0
            r8.S = r1
        L_0x00e0:
            int r4 = r9.getPointerId(r1)
            r8.ab = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.af = r4
            r8.ad = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.ag = r9
            r8.ae = r9
            int r9 = r8.y
            if (r9 != r6) goto L_0x010c
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.b(r2)
            r8.f(r2)
        L_0x010c:
            int[] r9 = r8.aq
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L_0x0116
            r0 = r0 | 2
        L_0x0116:
            r8.f(r0, r1)
        L_0x0119:
            int r9 = r8.y
            if (r9 == r2) goto L_0x011e
            return r1
        L_0x011e:
            return r2
        L_0x011f:
            return r1
        L_0x0121:
            r8.u()
            return r2
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        bu.a("RV OnLayout");
        y();
        bu.a();
        this.o = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        jx jxVar = this.h;
        if (jxVar == null) {
            setMeasuredDimension(jx.a(i2, getPaddingLeft() + getPaddingRight(), dx.g(this)), jx.a(i3, getPaddingTop() + getPaddingBottom(), dx.h(this)));
        } else if (this.n) {
            jxVar.a(this.a, this.D, i2, i3);
        } else {
            if (this.r) {
                d();
                j();
                x();
                v();
                kk kkVar = this.D;
                if (kkVar.k) {
                    kkVar.g = true;
                } else {
                    this.b.e();
                    this.D.g = false;
                }
                this.r = false;
                a(false);
            } else if (this.D.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            jp jpVar = this.g;
            if (jpVar != null) {
                this.D.e = jpVar.a();
            } else {
                this.D.e = 0;
            }
            d();
            this.h.a(this.a, this.D, i2, i3);
            a(false);
            this.D.g = false;
        }
    }

    private final void b(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ab) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.ab = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.af = x2;
            this.ad = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.ag = y2;
            this.ae = y2;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (!l()) {
            return super.onRequestFocusInDescendants(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof kg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kg kgVar = (kg) parcelable;
        this.O = kgVar;
        super.onRestoreInstanceState(kgVar.b);
        jx jxVar = this.h;
        if (jxVar != null && (parcelable2 = this.O.c) != null) {
            jxVar.a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        kg kgVar = new kg(super.onSaveInstanceState());
        kg kgVar2 = this.O;
        if (kgVar2 == null) {
            jx jxVar = this.h;
            if (jxVar != null) {
                kgVar.c = jxVar.n();
            } else {
                kgVar.c = null;
            }
        } else {
            kgVar.c = kgVar2.c;
        }
        return kgVar;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            s();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        MotionEvent motionEvent2 = motionEvent;
        int i6 = 0;
        if (this.q || this.S) {
            return false;
        }
        jz jzVar = this.l;
        if (jzVar != null) {
            jzVar.b(motionEvent2);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.l = null;
            }
        } else if (motionEvent.getAction() == 0 || !a(motionEvent)) {
            jx jxVar = this.h;
            if (jxVar == null) {
                return false;
            }
            boolean c2 = jxVar.c();
            boolean d2 = this.h.d();
            if (this.ac == null) {
                this.ac = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.aq;
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.aq;
            obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            if (actionMasked == 0) {
                this.ab = motionEvent2.getPointerId(0);
                int x2 = (int) (motionEvent.getX() + 0.5f);
                this.af = x2;
                this.ad = x2;
                int y2 = (int) (motionEvent.getY() + 0.5f);
                this.ag = y2;
                this.ae = y2;
                if (d2) {
                    c2 |= true;
                }
                f(c2 ? 1 : 0, 0);
            } else if (actionMasked == 1) {
                this.ac.addMovement(obtain);
                this.ac.computeCurrentVelocity(1000, (float) this.aj);
                float f2 = c2 ? -this.ac.getXVelocity(this.ab) : 0.0f;
                float f3 = d2 ? -this.ac.getYVelocity(this.ab) : 0.0f;
                if (!(f2 == 0.0f && f3 == 0.0f)) {
                    int i7 = (int) f2;
                    int i8 = (int) f3;
                    jx jxVar2 = this.h;
                    if (jxVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.q) {
                        boolean c3 = jxVar2.c();
                        boolean d3 = this.h.d();
                        if (!c3 || Math.abs(i7) < this.ai) {
                            i7 = 0;
                        }
                        if (!d3 || Math.abs(i8) < this.ai) {
                            i8 = 0;
                        }
                        if (!(i7 == 0 && i8 == 0)) {
                            float f4 = (float) i7;
                            float f5 = (float) i8;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                dispatchNestedFling(f4, f5, true);
                                if (d3) {
                                    c3 |= true;
                                }
                                f(c3 ? 1 : 0, 1);
                                int i9 = this.aj;
                                int max = Math.max(-i9, Math.min(i7, i9));
                                int i10 = this.aj;
                                int max2 = Math.max(-i10, Math.min(i8, i10));
                                kl klVar = this.A;
                                klVar.e.b(2);
                                klVar.b = 0;
                                klVar.a = 0;
                                Interpolator interpolator = klVar.d;
                                Interpolator interpolator2 = K;
                                if (interpolator != interpolator2) {
                                    klVar.d = interpolator2;
                                    klVar.c = new OverScroller(klVar.e.getContext(), K);
                                }
                                klVar.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                klVar.a();
                                t();
                                obtain.recycle();
                                return true;
                            }
                        }
                    }
                }
                b(0);
                t();
                obtain.recycle();
                return true;
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.ab);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ab + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x3 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                int y3 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                int i11 = this.af - x3;
                int i12 = this.ag - y3;
                if (this.y == 1) {
                    i3 = i11;
                    i2 = i12;
                } else {
                    if (!c2) {
                        i4 = i11;
                        z2 = false;
                    } else {
                        if (i11 <= 0) {
                            i5 = Math.min(0, i11 + this.ah);
                        } else {
                            i5 = Math.max(0, i11 - this.ah);
                        }
                        if (i5 != 0) {
                            i4 = i5;
                            z2 = true;
                        } else {
                            i4 = i5;
                            z2 = false;
                        }
                    }
                    if (d2) {
                        if (i12 <= 0) {
                            i12 = Math.min(0, i12 + this.ah);
                        } else {
                            i12 = Math.max(0, i12 - this.ah);
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        b(1);
                    }
                    i2 = i12;
                    i3 = i4;
                }
                if (this.y == 1) {
                    int[] iArr3 = this.J;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (a(!c2 ? 0 : i3, !d2 ? 0 : i2, iArr3, this.ap, 0)) {
                        int[] iArr4 = this.J;
                        i3 -= iArr4[0];
                        i2 -= iArr4[1];
                        int[] iArr5 = this.aq;
                        int i13 = iArr5[0];
                        int[] iArr6 = this.ap;
                        iArr5[0] = i13 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i14 = i2;
                    int[] iArr7 = this.ap;
                    this.af = x3 - iArr7[0];
                    this.ag = y3 - iArr7[1];
                    int i15 = !c2 ? 0 : i3;
                    if (d2) {
                        i6 = i14;
                    }
                    if (a(i15, i6, motionEvent2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    iq iqVar = this.B;
                    if (!(iqVar == null || (i3 == 0 && i14 == 0))) {
                        iqVar.a(this, i3, i14);
                    }
                }
            } else if (actionMasked == 3) {
                u();
            } else if (actionMasked == 5) {
                this.ab = motionEvent2.getPointerId(actionIndex);
                int x4 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                this.af = x4;
                this.ad = x4;
                int y4 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                this.ag = y4;
                this.ae = y4;
            } else if (actionMasked == 6) {
                b(motionEvent);
            }
            this.ac.addMovement(obtain);
            obtain.recycle();
            return true;
        }
        u();
        return true;
    }

    public final void m() {
        if (!this.H && this.m) {
            dx.a(this, this.as);
            this.H = true;
        }
    }

    private final boolean w() {
        if (this.x == null) {
            return false;
        }
        this.h.r();
        return true;
    }

    private final void x() {
        boolean z2;
        if (this.s) {
            this.b.a();
            if (this.V) {
                this.h.o();
            }
        }
        if (w()) {
            this.b.b();
        } else {
            this.b.e();
        }
        boolean z3 = false;
        boolean z4 = this.F || this.G;
        kk kkVar = this.D;
        boolean z5 = this.o && this.x != null && ((z2 = this.s) || z4) && (!z2 || this.g.a);
        kkVar.j = z5;
        if (z5 && z4 && !this.s && w()) {
            z3 = true;
        }
        kkVar.k = z3;
    }

    public final void c(boolean z2) {
        this.V = z2 | this.V;
        this.s = true;
        int b2 = this.c.b();
        for (int i2 = 0; i2 < b2; i2++) {
            km c2 = c(this.c.c(i2));
            if (c2 != null && !c2.b()) {
                c2.b(6);
            }
        }
        n();
        kc kcVar = this.a;
        int size = kcVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            km kmVar = (km) kcVar.c.get(i3);
            if (kmVar != null) {
                kmVar.b(6);
                kmVar.a((Object) null);
            }
        }
        jp jpVar = kcVar.f.g;
        if (jpVar == null || !jpVar.a) {
            kcVar.c();
        }
    }

    public final void a(km kmVar, jt jtVar) {
        kmVar.a(0, 8192);
        if (this.D.h && kmVar.t() && !kmVar.m() && !kmVar.b()) {
            this.d.a(d(kmVar), kmVar);
        }
        this.d.a(kmVar, jtVar);
    }

    public final void b() {
        ju juVar = this.x;
        if (juVar != null) {
            juVar.d();
        }
        jx jxVar = this.h;
        if (jxVar != null) {
            jxVar.b(this.a);
            this.h.a(this.a);
        }
        this.a.a();
    }

    public final void removeDetachedView(View view, boolean z2) {
        km c2 = c(view);
        if (c2 != null) {
            if (c2.n()) {
                c2.i();
            } else if (!c2.b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c2 + a());
            }
        }
        view.clearAnimation();
        c(view);
        super.removeDetachedView(view, z2);
    }

    public final void requestChildFocus(View view, View view2) {
        this.h.a(view, view2);
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.h.p();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jz) this.k.get(i2)).b();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        if (this.R == 0 && !this.q) {
            super.requestLayout();
        } else {
            this.p = true;
        }
    }

    private final void z() {
        kk kkVar = this.D;
        kkVar.m = -1;
        kkVar.l = -1;
        kkVar.n = -1;
    }

    private final void t() {
        VelocityTracker velocityTracker = this.ac;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        f(0);
        EdgeEffect edgeEffect = this.t;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.t.isFinished();
        }
        EdgeEffect edgeEffect2 = this.u;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.u.isFinished();
        }
        EdgeEffect edgeEffect3 = this.v;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.v.isFinished();
        }
        EdgeEffect edgeEffect4 = this.w;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.w.isFinished();
        }
        if (z2) {
            dx.d(this);
        }
    }

    public final void scrollBy(int i2, int i3) {
        jx jxVar = this.h;
        if (jxVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            boolean c2 = jxVar.c();
            boolean d2 = this.h.d();
            if (c2 || d2) {
                if (!c2) {
                    i2 = 0;
                }
                if (!d2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0116, code lost:
        if (r4 == 0.0f) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        if (r1 != 0) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int r20, int r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r19.c()
            jp r0 = r8.g
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0027
            int[] r0 = r8.J
            r0[r12] = r12
            r0[r11] = r12
            r8.a(r9, r10, r0)
            int[] r0 = r8.J
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r7 = r0
            r15 = r1
            r13 = r2
            r14 = r3
            goto L_0x002c
        L_0x0027:
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x002c:
            java.util.ArrayList r0 = r8.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r19.invalidate()
        L_0x0038:
            int[] r6 = r8.J
            r6[r12] = r12
            r6[r11] = r12
            int[] r5 = r8.ap
            r16 = 0
            r0 = r19
            r1 = r15
            r2 = r7
            r3 = r13
            r4 = r14
            r17 = r6
            r6 = r16
            r18 = r7
            r7 = r17
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.J
            r1 = r0[r12]
            int r13 = r13 - r1
            r0 = r0[r11]
            int r14 = r14 - r0
            if (r1 == 0) goto L_0x005f
        L_0x005d:
            r0 = 1
            goto L_0x0062
        L_0x005f:
            if (r0 != 0) goto L_0x005d
            r0 = 0
        L_0x0062:
            int r1 = r8.af
            int[] r2 = r8.ap
            r3 = r2[r12]
            int r1 = r1 - r3
            r8.af = r1
            int r1 = r8.ag
            r4 = r2[r11]
            int r1 = r1 - r4
            r8.ag = r1
            int[] r1 = r8.aq
            r4 = r1[r12]
            int r4 = r4 + r3
            r1[r12] = r4
            r3 = r1[r11]
            r2 = r2[r11]
            int r3 = r3 + r2
            r1[r11] = r3
            int r1 = r19.getOverScrollMode()
            r2 = 2
            if (r1 == r2) goto L_0x011e
            if (r22 == 0) goto L_0x011b
            int r1 = r22.getSource()
            r2 = 8194(0x2002, float:1.1482E-41)
            r1 = r1 & r2
            if (r1 == r2) goto L_0x011b
            float r1 = r22.getX()
            float r2 = (float) r13
            float r3 = r22.getY()
            float r4 = (float) r14
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bc
            r19.f()
            android.widget.EdgeEffect r7 = r8.t
            float r13 = -r2
            int r14 = r19.getWidth()
            float r14 = (float) r14
            float r13 = r13 / r14
            int r14 = r19.getHeight()
            float r14 = (float) r14
            float r3 = r3 / r14
            float r3 = r5 - r3
            defpackage.el.a(r7, r13, r3)
            r3 = 1
            goto L_0x00da
        L_0x00bc:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            r19.g()
            android.widget.EdgeEffect r7 = r8.v
            int r13 = r19.getWidth()
            float r13 = (float) r13
            float r13 = r2 / r13
            int r14 = r19.getHeight()
            float r14 = (float) r14
            float r3 = r3 / r14
            defpackage.el.a(r7, r13, r3)
            r3 = 1
            goto L_0x00da
        L_0x00d8:
            r3 = 0
        L_0x00da:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f4
            r19.h()
            android.widget.EdgeEffect r2 = r8.u
            float r3 = -r4
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r19.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            defpackage.el.a(r2, r3, r1)
            goto L_0x0118
        L_0x00f4:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x010e
            r19.i()
            android.widget.EdgeEffect r2 = r8.w
            int r3 = r19.getHeight()
            float r3 = (float) r3
            float r4 = r4 / r3
            int r3 = r19.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r5 = r5 - r1
            defpackage.el.a(r2, r4, r5)
            goto L_0x0118
        L_0x010e:
            if (r3 != 0) goto L_0x0118
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0118
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x011b
        L_0x0118:
            defpackage.dx.d(r19)
        L_0x011b:
            r19.b(r20, r21)
        L_0x011e:
            if (r15 == 0) goto L_0x0123
            r1 = r18
            goto L_0x0127
        L_0x0123:
            r1 = r18
            if (r1 == 0) goto L_0x012a
        L_0x0127:
            r8.c(r15, r1)
        L_0x012a:
            boolean r2 = r19.awakenScrollBars()
            if (r2 != 0) goto L_0x0133
            r19.invalidate()
        L_0x0133:
            if (r0 != 0) goto L_0x013a
            if (r15 != 0) goto L_0x013a
            if (r1 != 0) goto L_0x013a
            return r12
        L_0x013a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean");
    }

    public final void a(int i2, int i3, int[] iArr) {
        int i4;
        km kmVar;
        d();
        j();
        bu.a("RV Scroll");
        a(this.D);
        int a2 = i2 != 0 ? this.h.a(i2, this.a, this.D) : 0;
        if (i3 != 0) {
            i4 = this.h.b(i3, this.a, this.D);
        } else {
            i4 = 0;
        }
        bu.a();
        int a3 = this.c.a();
        for (int i5 = 0; i5 < a3; i5++) {
            View b2 = this.c.b(i5);
            km a4 = a(b2);
            if (!(a4 == null || (kmVar = a4.i) == null)) {
                View view = kmVar.a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        v();
        a(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = i4;
        }
    }

    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        if (l()) {
            if (accessibilityEvent == null) {
                i2 = 0;
            } else {
                int i3 = Build.VERSION.SDK_INT;
                i2 = accessibilityEvent.getContentChangeTypes();
            }
            if (i2 == 0) {
                i2 = 0;
            }
            this.T = i2 | this.T;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final void a(ko koVar) {
        this.I = koVar;
        dx.a(this, koVar);
    }

    public final void a(jp jpVar) {
        suppressLayout(false);
        jp jpVar2 = this.g;
        if (jpVar2 != null) {
            jpVar2.b(this.N);
            this.g.c();
        }
        b();
        this.b.a();
        jp jpVar3 = this.g;
        this.g = jpVar;
        if (jpVar != null) {
            jpVar.a(this.N);
            jpVar.a(this);
        }
        jx jxVar = this.h;
        if (jxVar != null) {
            jxVar.a(jpVar3, this.g);
        }
        kc kcVar = this.a;
        jp jpVar4 = this.g;
        kcVar.a();
        kb d2 = kcVar.d();
        if (jpVar3 != null) {
            d2.b--;
        }
        if (d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                ((ka) d2.a.valueAt(i2)).a.clear();
            }
        }
        if (jpVar4 != null) {
            d2.b++;
        }
        this.D.f = true;
        c(false);
        requestLayout();
    }

    public final void a(km kmVar, int i2) {
        if (l()) {
            kmVar.n = i2;
            this.ar.add(kmVar);
            return;
        }
        dx.a(kmVar.a, i2);
    }

    public final void setClipToPadding(boolean z2) {
        if (z2 != this.P) {
            s();
        }
        this.P = z2;
        super.setClipToPadding(z2);
        if (this.o) {
            requestLayout();
        }
    }

    public final void a(ju juVar) {
        ju juVar2 = this.x;
        if (juVar2 != null) {
            juVar2.d();
            this.x.h = null;
        }
        this.x = juVar;
        if (juVar != null) {
            juVar.h = this.am;
        }
    }

    public final void a(int i2) {
        kc kcVar = this.a;
        kcVar.e = i2;
        kcVar.b();
    }

    public final void a(jx jxVar) {
        if (jxVar != this.h) {
            e();
            if (this.h != null) {
                ju juVar = this.x;
                if (juVar != null) {
                    juVar.d();
                }
                this.h.b(this.a);
                this.h.a(this.a);
                this.a.a();
                this.h.a((RecyclerView) null);
                this.h = null;
            } else {
                this.a.a();
            }
            ho hoVar = this.c;
            hoVar.b.a();
            for (int size = hoVar.c.size() - 1; size >= 0; size--) {
                hoVar.a.b((View) hoVar.c.get(size));
                hoVar.c.remove(size);
            }
            jn jnVar = (jn) hoVar.a;
            int a2 = jnVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                View b2 = jnVar.b(i2);
                c(b2);
                b2.clearAnimation();
            }
            jnVar.a.removeAllViews();
            this.h = jxVar;
            if (jxVar != null) {
                if (jxVar.b == null) {
                    this.h.a(this);
                } else {
                    throw new IllegalArgumentException("LayoutManager " + jxVar + " is already attached to a RecyclerView:" + jxVar.b.a());
                }
            }
            this.a.b();
            requestLayout();
        }
    }

    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        int i2 = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void setNestedScrollingEnabled(boolean z2) {
        C().a(z2);
    }

    public final void b(int i2) {
        if (i2 != this.y) {
            this.y = i2;
            if (i2 != 2) {
                r();
            }
            List list = this.E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    atc atc = (atc) this.E.get(size);
                }
            }
        }
    }

    public void a(int i2, int i3) {
        d(i2, i3);
    }

    public void d(int i2, int i3) {
        e(i2, i3);
    }

    public final void e(int i2, int i3) {
        jx jxVar = this.h;
        if (jxVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.q) {
            if (!jxVar.c()) {
                i2 = 0;
            }
            if (!this.h.d()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                this.A.a(i2, i3, Integer.MIN_VALUE, null);
            }
        }
    }

    public void d(int i2) {
        if (!this.q) {
            jx jxVar = this.h;
            if (jxVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                jxVar.e(i2);
            }
        }
    }

    public final void d() {
        int i2 = this.R + 1;
        this.R = i2;
        if (i2 == 1 && !this.q) {
            this.p = false;
        }
    }

    public final boolean startNestedScroll(int i2) {
        return C().a(i2, 0);
    }

    private final void f(int i2, int i3) {
        C().a(i2, i3);
    }

    public final void a(boolean z2) {
        int i2 = this.R;
        if (i2 <= 0) {
            this.R = 1;
            i2 = 1;
        }
        if (!z2 && !this.q) {
            this.p = false;
        }
        if (i2 == 1) {
            if (z2 && this.p && !this.q && this.h != null && this.g != null) {
                y();
            }
            if (!this.q) {
                this.p = false;
            }
        }
        this.R--;
    }

    public final void stopNestedScroll() {
        C().b(0);
    }

    public final void f(int i2) {
        C().b(i2);
    }

    public final void e() {
        b(0);
        r();
    }

    private final void r() {
        kj kjVar;
        this.A.b();
        jx jxVar = this.h;
        if (jxVar != null && (kjVar = jxVar.c) != null) {
            kjVar.a();
        }
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.q) {
            a("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.q = false;
                if (!(!this.p || this.h == null || this.g == null)) {
                    requestLayout();
                }
                this.p = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.q = true;
            this.S = true;
            e();
        }
    }
}
