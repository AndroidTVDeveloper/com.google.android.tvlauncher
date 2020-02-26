package android.support.p002v7.widget;

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

/* renamed from: android.support.v7.widget.RecyclerView */
/* compiled from: PG */
public class RecyclerView extends ViewGroup {

    /* renamed from: K */
    public static final Interpolator f1018K = new C0257jl();

    /* renamed from: L */
    private static final int[] f1019L = {16843830};

    /* renamed from: M */
    private static final Class[] f1020M = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: A */
    public final C0284kl f1021A;

    /* renamed from: B */
    public C0235iq f1022B;

    /* renamed from: C */
    public C0233io f1023C;

    /* renamed from: D */
    public final C0283kk f1024D;

    /* renamed from: E */
    public List f1025E;

    /* renamed from: F */
    public boolean f1026F;

    /* renamed from: G */
    public boolean f1027G;

    /* renamed from: H */
    public boolean f1028H;

    /* renamed from: I */
    public C0287ko f1029I;

    /* renamed from: J */
    public final int[] f1030J;

    /* renamed from: N */
    private final C0277ke f1031N;

    /* renamed from: O */
    private C0279kg f1032O;

    /* renamed from: P */
    private boolean f1033P;

    /* renamed from: Q */
    private final Rect f1034Q;

    /* renamed from: R */
    private int f1035R;

    /* renamed from: S */
    private boolean f1036S;

    /* renamed from: T */
    private int f1037T;

    /* renamed from: U */
    private final AccessibilityManager f1038U;

    /* renamed from: V */
    private boolean f1039V;

    /* renamed from: W */
    private int f1040W;

    /* renamed from: a */
    public final C0275kc f1041a;

    /* renamed from: aa */
    private int f1042aa;

    /* renamed from: ab */
    private int f1043ab;

    /* renamed from: ac */
    private VelocityTracker f1044ac;

    /* renamed from: ad */
    private int f1045ad;

    /* renamed from: ae */
    private int f1046ae;

    /* renamed from: af */
    private int f1047af;

    /* renamed from: ag */
    private int f1048ag;

    /* renamed from: ah */
    private int f1049ah;

    /* renamed from: ai */
    private final int f1050ai;

    /* renamed from: aj */
    private final int f1051aj;

    /* renamed from: ak */
    private float f1052ak;

    /* renamed from: al */
    private float f1053al;

    /* renamed from: am */
    private C0264js f1054am;

    /* renamed from: an */
    private final int[] f1055an;

    /* renamed from: ao */
    private C0096dm f1056ao;

    /* renamed from: ap */
    private final int[] f1057ap;

    /* renamed from: aq */
    private final int[] f1058aq;

    /* renamed from: ar */
    private final List f1059ar;

    /* renamed from: as */
    private Runnable f1060as;

    /* renamed from: at */
    private final C0311ll f1061at;

    /* renamed from: b */
    public C0187gw f1062b;

    /* renamed from: c */
    public C0206ho f1063c;

    /* renamed from: d */
    public final C0312lm f1064d;

    /* renamed from: e */
    public final Runnable f1065e;

    /* renamed from: f */
    public final Rect f1066f;

    /* renamed from: g */
    public C0261jp f1067g;

    /* renamed from: h */
    public C0269jx f1068h;

    /* renamed from: i */
    public C0276kd f1069i;

    /* renamed from: j */
    public final ArrayList f1070j;

    /* renamed from: k */
    public final ArrayList f1071k;

    /* renamed from: l */
    public C0271jz f1072l;

    /* renamed from: m */
    public boolean f1073m;

    /* renamed from: n */
    public boolean f1074n;

    /* renamed from: o */
    public boolean f1075o;

    /* renamed from: p */
    public boolean f1076p;

    /* renamed from: q */
    public boolean f1077q;

    /* renamed from: r */
    public boolean f1078r;

    /* renamed from: s */
    public boolean f1079s;

    /* renamed from: t */
    public EdgeEffect f1080t;

    /* renamed from: u */
    public EdgeEffect f1081u;

    /* renamed from: v */
    public EdgeEffect f1082v;

    /* renamed from: w */
    public EdgeEffect f1083w;

    /* renamed from: x */
    public C0266ju f1084x;

    /* renamed from: y */
    public int f1085y;

    /* renamed from: z */
    public boolean f1086z;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = Build.VERSION.SDK_INT;
    }

    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public final boolean getClipToPadding() {
        return this.f1033P;
    }

    public final boolean isAttachedToWindow() {
        return this.f1073m;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1077q;
    }

    /* renamed from: l */
    public final boolean mo892l() {
        return this.f1040W > 0;
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
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        String str;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f1031N = new C0277ke(this);
        this.f1041a = new C0275kc(this);
        this.f1064d = new C0312lm();
        this.f1065e = new C0255jj(this);
        this.f1066f = new Rect();
        this.f1034Q = new Rect();
        new RectF();
        this.f1070j = new ArrayList();
        this.f1071k = new ArrayList();
        this.f1035R = 0;
        this.f1079s = false;
        this.f1039V = false;
        this.f1040W = 0;
        this.f1042aa = 0;
        this.f1084x = new C0219ia();
        this.f1085y = 0;
        this.f1043ab = -1;
        this.f1052ak = Float.MIN_VALUE;
        this.f1053al = Float.MIN_VALUE;
        this.f1086z = true;
        this.f1021A = new C0284kl(this);
        this.f1023C = new C0233io();
        this.f1024D = new C0283kk();
        this.f1026F = false;
        this.f1027G = false;
        this.f1054am = new C0267jv(this);
        this.f1028H = false;
        this.f1055an = new int[2];
        this.f1057ap = new int[2];
        this.f1058aq = new int[2];
        this.f1030J = new int[2];
        this.f1059ar = new ArrayList();
        this.f1060as = new C0256jk(this);
        this.f1061at = new C0258jm(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1049ah = viewConfiguration.getScaledTouchSlop();
        this.f1052ak = C0108dy.m7224a(viewConfiguration);
        this.f1053al = C0108dy.m7226b(viewConfiguration);
        this.f1050ai = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1051aj = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f1084x.f9704h = this.f1054am;
        this.f1062b = new C0187gw(new C0260jo(this));
        this.f1063c = new C0206ho(new C0259jn(this));
        if (C0107dx.m7194a(this) == 0) {
            C0107dx.m7223t(this);
        }
        if (C0107dx.m7208e(this) == 0) {
            C0107dx.m7196a((View) this, 1);
        }
        this.f1038U = (AccessibilityManager) getContext().getSystemService("accessibility");
        mo837a(new C0287ko(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0131eu.f9185a, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0131eu.f9185a, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1033P = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo822a());
            }
            Resources resources = getContext().getResources();
            str = string;
            new C0228ij(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            str = string;
        }
        obtainStyledAttributes.recycle();
        m1289a(context2, str, attributeSet2, i2);
        int i3 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, f1019L, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, f1019L, attributeSet, obtainStyledAttributes2, i, 0);
        }
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: a */
    public final void mo834a(C0285km kmVar) {
        View view = kmVar.f9783a;
        ViewParent parent = view.getParent();
        this.f1041a.mo5400b(mo823a(view));
        if (kmVar.mo5446n()) {
            this.f1063c.mo5199a(view, -1, view.getLayoutParams(), true);
        } else if (parent == this) {
            C0206ho hoVar = this.f1063c;
            int a = hoVar.f9491a.mo5192a(view);
            if (a >= 0) {
                hoVar.f9492b.mo5184a(a);
                hoVar.mo5198a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else {
            this.f1063c.mo5200a(view, -1, true);
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C0269jx jxVar = this.f1068h;
        if (jxVar == null) {
            super.addFocusables(arrayList, i, i2);
        } else {
            jxVar.mo5338a(this, arrayList, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo829a(akr akr) {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            jxVar.mo5344a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1070j.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1070j.add(akr);
        mo894n();
        requestLayout();
    }

    /* renamed from: a */
    public final void mo830a(String str) {
        if (!mo892l()) {
            if (this.f1042aa > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo822a()));
            }
        } else if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo822a());
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: u */
    private final void mo3237u() {
        mo5626t();
        mo843b(0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0270jy) && ((C0270jy) layoutParams) != null;
    }

    /* renamed from: b */
    public static void m1300b(C0285km kmVar) {
        WeakReference weakReference = kmVar.f9784b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != kmVar.f9783a) {
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
            kmVar.f9784b = null;
        }
    }

    /* renamed from: B */
    private final void m1287B() {
        int b = this.f1063c.mo5201b();
        for (int i = 0; i < b; i++) {
            C0285km c = m1301c(this.f1063c.mo5204c(i));
            if (!c.mo5434b()) {
                c.mo5427U();
            }
        }
        C0275kc kcVar = this.f1041a;
        int size = kcVar.f9728c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0285km) kcVar.f9728c.get(i2)).mo5427U();
        }
        int size2 = kcVar.f9726a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C0285km) kcVar.f9726a.get(i3)).mo5427U();
        }
        ArrayList arrayList = kcVar.f9727b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C0285km) kcVar.f9727b.get(i4)).mo5427U();
            }
        }
    }

    public final int computeHorizontalScrollExtent() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean c = jxVar.mo5366c();
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean c = jxVar.mo5366c();
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean c = jxVar.mo5366c();
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean d = jxVar.mo5370d();
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean d = jxVar.mo5370d();
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            boolean d = jxVar.mo5370d();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo844b(int i, int i2) {
        EdgeEffect edgeEffect = this.f1080t;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f1080t.onRelease();
            z = this.f1080t.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1082v;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1082v.onRelease();
            z |= this.f1082v.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1081u;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1081u.onRelease();
            z |= this.f1081u.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1083w;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1083w.onRelease();
            z |= this.f1083w.isFinished();
        }
        if (z) {
            C0107dx.m7207d(this);
        }
    }

    /* renamed from: c */
    public final void mo847c() {
        if (!this.f1075o || this.f1079s) {
            C0049bu.m4189a("RV FullInvalidate");
            m1312y();
            C0049bu.m4188a();
        } else if (!this.f1062b.mo5090d()) {
        } else {
            if (this.f1062b.mo5086a(4) && !this.f1062b.mo5086a(11)) {
                C0049bu.m4189a("RV PartialInvalidate");
                mo859d();
                mo890j();
                this.f1062b.mo5088b();
                if (!this.f1076p) {
                    int a = this.f1063c.mo5196a();
                    int i = 0;
                    while (true) {
                        if (i >= a) {
                            this.f1062b.mo5089c();
                            break;
                        }
                        C0285km c = m1301c(this.f1063c.mo5203b(i));
                        if (c != null && !c.mo5434b() && c.mo5453t()) {
                            m1312y();
                            break;
                        }
                        i++;
                    }
                }
                mo838a(true);
                mo3238v();
                C0049bu.m4188a();
            } else if (this.f1062b.mo5090d()) {
                C0049bu.m4189a("RV FullInvalidate");
                m1312y();
                C0049bu.m4188a();
            }
        }
    }

    /* renamed from: a */
    private final void m1289a(Context context, String str, AttributeSet attributeSet, int i) {
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
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(C0269jx.class);
                    try {
                        constructor = asSubclass.getConstructor(f1020M);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    mo833a((C0269jx) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e7);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ad, code lost:
        if (r0.f1063c.mo5205c(getFocusedChild()) != false) goto L_0x04af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x055d  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1312y() {
        /*
            r17 = this;
            r0 = r17
            jp r1 = r0.f1067g
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x000e:
            jx r1 = r0.f1068h
            if (r1 == 0) goto L_0x057e
            kk r1 = r0.f1024D
            r3 = 0
            r1.f9767i = r3
            int r4 = r1.f9762d
            r7 = 4
            r8 = -1
            r9 = 0
            r10 = 1
            if (r4 != r10) goto L_0x020d
            r1.mo5421a(r10)
            kk r1 = r0.f1024D
            r0.m1294a(r1)
            kk r1 = r0.f1024D
            r1.f9767i = r3
            r17.mo859d()
            lm r1 = r0.f1064d
            r1.mo5532a()
            r17.mo890j()
            r17.m1311x()
            boolean r1 = r0.f1086z
            if (r1 == 0) goto L_0x004d
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x004d
            jp r1 = r0.f1067g
            if (r1 == 0) goto L_0x004c
            android.view.View r1 = r17.getFocusedChild()
            goto L_0x004e
        L_0x004c:
        L_0x004d:
            r1 = r9
        L_0x004e:
            if (r1 == 0) goto L_0x005c
            android.view.View r1 = r0.mo841b(r1)
            if (r1 == 0) goto L_0x005b
            km r1 = r0.mo823a(r1)
            goto L_0x005d
        L_0x005b:
        L_0x005c:
            r1 = r9
        L_0x005d:
            if (r1 == 0) goto L_0x00b3
            kk r4 = r0.f1024D
            jp r11 = r0.f1067g
            boolean r11 = r11.f9698a
            if (r11 == 0) goto L_0x006a
            long r11 = r1.f9787e
            goto L_0x006d
        L_0x006a:
            r11 = -1
        L_0x006d:
            r4.f9771m = r11
            boolean r11 = r0.f1079s
            if (r11 != 0) goto L_0x0082
            boolean r11 = r1.mo5445m()
            if (r11 == 0) goto L_0x007c
            int r11 = r1.f9786d
            goto L_0x0084
        L_0x007c:
            int r11 = r1.mo5436d()
            goto L_0x0084
        L_0x0082:
            r11 = -1
        L_0x0084:
            r4.f9770l = r11
            kk r4 = r0.f1024D
            android.view.View r1 = r1.f9783a
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
            r4.f9772n = r11
            goto L_0x00b6
        L_0x00b3:
            r17.m1313z()
        L_0x00b6:
            kk r1 = r0.f1024D
            boolean r4 = r1.f9768j
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r0.f1027G
            if (r4 == 0) goto L_0x00c2
            r4 = 1
            goto L_0x00c5
        L_0x00c2:
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            r1.f9766h = r4
            r0.f1027G = r3
            r0.f1026F = r3
            boolean r4 = r1.f9769k
            r1.f9765g = r4
            jp r4 = r0.f1067g
            int r4 = r4.mo2794a()
            r1.f9763e = r4
            int[] r1 = r0.f1055an
            r0.m1295a(r1)
            kk r1 = r0.f1024D
            boolean r1 = r1.f9768j
            if (r1 == 0) goto L_0x0149
            ho r1 = r0.f1063c
            int r1 = r1.mo5196a()
            r4 = 0
        L_0x00e9:
            if (r4 >= r1) goto L_0x0149
            ho r11 = r0.f1063c
            android.view.View r11 = r11.mo5203b(r4)
            km r11 = m1301c(r11)
            boolean r12 = r11.mo5434b()
            if (r12 == 0) goto L_0x00fc
            goto L_0x0146
        L_0x00fc:
            boolean r12 = r11.mo5442j()
            if (r12 != 0) goto L_0x0103
            goto L_0x010a
        L_0x0103:
            jp r12 = r0.f1067g
            boolean r12 = r12.f9698a
            if (r12 != 0) goto L_0x010a
            goto L_0x0146
        L_0x010a:
            ju r12 = r0.f1084x
            kk r13 = r0.f1024D
            int r14 = p000.C0266ju.m7667d(r11)
            java.util.List r15 = r11.mo5450q()
            jt r12 = r12.mo3744a(r13, r11, r14, r15)
            lm r13 = r0.f1064d
            r13.mo5534a(r11, r12)
            kk r12 = r0.f1024D
            boolean r12 = r12.f9766h
            if (r12 == 0) goto L_0x0146
            boolean r12 = r11.mo5453t()
            if (r12 == 0) goto L_0x0146
            boolean r12 = r11.mo5445m()
            if (r12 != 0) goto L_0x0146
            boolean r12 = r11.mo5434b()
            if (r12 != 0) goto L_0x0146
            boolean r12 = r11.mo5442j()
            if (r12 != 0) goto L_0x0146
            long r12 = r0.m1302d(r11)
            lm r14 = r0.f1064d
            r14.mo5533a(r12, r11)
        L_0x0146:
            int r4 = r4 + 1
            goto L_0x00e9
        L_0x0149:
            kk r1 = r0.f1024D
            boolean r1 = r1.f9769k
            r4 = 2
            if (r1 != 0) goto L_0x0155
            r17.m1287B()
            goto L_0x01dd
        L_0x0155:
            ho r1 = r0.f1063c
            int r1 = r1.mo5201b()
            r11 = 0
        L_0x015c:
            if (r11 < r1) goto L_0x01f0
            kk r1 = r0.f1024D
            boolean r11 = r1.f9764f
            r1.f9764f = r3
            jx r12 = r0.f1068h
            kc r13 = r0.f1041a
            r12.mo5348a(r13, r1)
            kk r1 = r0.f1024D
            r1.f9764f = r11
            r1 = 0
        L_0x0170:
            ho r11 = r0.f1063c
            int r11 = r11.mo5196a()
            if (r1 >= r11) goto L_0x01da
            ho r11 = r0.f1063c
            android.view.View r11 = r11.mo5203b(r1)
            km r11 = m1301c(r11)
            boolean r12 = r11.mo5434b()
            if (r12 != 0) goto L_0x01d7
            lm r12 = r0.f1064d
            dd r12 = r12.f9860a
            java.lang.Object r12 = r12.get(r11)
            lk r12 = (p000.C0310lk) r12
            if (r12 == 0) goto L_0x0199
            int r12 = r12.f9857a
            r12 = r12 & r7
            if (r12 != 0) goto L_0x01d7
        L_0x0199:
            int r12 = p000.C0266ju.m7667d(r11)
            r13 = 8192(0x2000, float:1.14794E-41)
            boolean r13 = r11.mo5448o(r13)
            if (r13 != 0) goto L_0x01a7
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x01a7:
            ju r14 = r0.f1084x
            kk r15 = r0.f1024D
            java.util.List r5 = r11.mo5450q()
            jt r5 = r14.mo3744a(r15, r11, r12, r5)
            if (r13 != 0) goto L_0x01d4
            lm r6 = r0.f1064d
            dd r12 = r6.f9860a
            java.lang.Object r12 = r12.get(r11)
            lk r12 = (p000.C0310lk) r12
            if (r12 != 0) goto L_0x01cb
            lk r12 = p000.C0310lk.m7891a()
            dd r6 = r6.f9860a
            r6.put(r11, r12)
            goto L_0x01cc
        L_0x01cb:
        L_0x01cc:
            int r6 = r12.f9857a
            r6 = r6 | r4
            r12.f9857a = r6
            r12.f9858b = r5
            goto L_0x01d7
        L_0x01d4:
            r0.mo836a(r11, r5)
        L_0x01d7:
            int r1 = r1 + 1
            goto L_0x0170
        L_0x01da:
            r17.m1287B()
        L_0x01dd:
            r17.mo3238v()
            r0.mo838a(r3)
            kk r1 = r0.f1024D
            r1.f9762d = r4
            jx r1 = r0.f1068h
            r1.mo5357b(r0)
            r17.m1286A()
            goto L_0x0244
        L_0x01f0:
            ho r5 = r0.f1063c
            android.view.View r5 = r5.mo5204c(r11)
            km r5 = m1301c(r5)
            boolean r6 = r5.mo5434b()
            if (r6 == 0) goto L_0x0201
        L_0x0200:
            goto L_0x0209
        L_0x0201:
            int r6 = r5.f9786d
            if (r6 != r8) goto L_0x0200
            int r6 = r5.f9785c
            r5.f9786d = r6
        L_0x0209:
            int r11 = r11 + 1
            goto L_0x015c
        L_0x020d:
            gw r1 = r0.f1062b
            java.util.ArrayList r4 = r1.f9429b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0218
        L_0x0217:
            goto L_0x0221
        L_0x0218:
            java.util.ArrayList r1 = r1.f9428a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x023c
            goto L_0x0217
        L_0x0221:
            jx r1 = r0.f1068h
            int r1 = r1.f9715h
            int r4 = r17.getWidth()
            if (r1 != r4) goto L_0x023c
            jx r1 = r0.f1068h
            int r1 = r1.f9716i
            int r4 = r17.getHeight()
            if (r1 == r4) goto L_0x0236
            goto L_0x023c
        L_0x0236:
            jx r1 = r0.f1068h
            r1.mo5357b(r0)
            goto L_0x0244
        L_0x023c:
            jx r1 = r0.f1068h
            r1.mo5357b(r0)
            r17.m1286A()
        L_0x0244:
            kk r1 = r0.f1024D
            r1.mo5421a(r7)
            r17.mo859d()
            r17.mo890j()
            kk r1 = r0.f1024D
            r1.f9762d = r10
            boolean r1 = r1.f9768j
            if (r1 == 0) goto L_0x0424
            ho r1 = r0.f1063c
            int r1 = r1.mo5196a()
            int r1 = r1 + r8
        L_0x025e:
            if (r1 >= 0) goto L_0x02f8
            lm r4 = r0.f1064d
            ll r5 = r0.f1061at
            dd r1 = r4.f9860a
            int r1 = r1.f8324c
            int r1 = r1 + r8
        L_0x0269:
            if (r1 >= 0) goto L_0x026d
            goto L_0x0424
        L_0x026d:
            dd r2 = r4.f9860a
            java.lang.Object r2 = r2.mo4138b(r1)
            km r2 = (p000.C0285km) r2
            dd r6 = r4.f9860a
            java.lang.Object r6 = r6.mo273d(r1)
            lk r6 = (p000.C0310lk) r6
            int r7 = r6.f9857a
            r11 = r7 & 3
            r12 = 3
            if (r11 == r12) goto L_0x02ee
            r11 = r7 & 1
            if (r11 != 0) goto L_0x02e0
            r11 = r7 & 14
            r12 = 14
            if (r11 != r12) goto L_0x0296
            jt r7 = r6.f9858b
            jt r11 = r6.f9859c
            r5.mo5301b(r2, r7, r11)
            goto L_0x02f1
        L_0x0296:
            r11 = r7 & 12
            r12 = 12
            if (r11 != r12) goto L_0x02ca
            jt r7 = r6.f9858b
            jt r11 = r6.f9859c
            r2.mo5432a(r3)
            r12 = r5
            jm r12 = (p000.C0258jm) r12
            android.support.v7.widget.RecyclerView r13 = r12.f9695a
            boolean r14 = r13.f1079s
            if (r14 == 0) goto L_0x02bb
            ju r13 = r13.f1084x
            boolean r2 = r13.mo4190a(r2, r2, r7, r11)
            if (r2 == 0) goto L_0x02f1
            android.support.v7.widget.RecyclerView r2 = r12.f9695a
            r2.mo893m()
            goto L_0x02f1
        L_0x02bb:
            ju r13 = r13.f1084x
            boolean r2 = r13.mo4195c(r2, r7, r11)
            if (r2 == 0) goto L_0x02f1
            android.support.v7.widget.RecyclerView r2 = r12.f9695a
            r2.mo893m()
            goto L_0x02f1
        L_0x02ca:
            r11 = r7 & 4
            if (r11 == 0) goto L_0x02d4
            jt r7 = r6.f9858b
            r5.mo5300a(r2, r7, r9)
            goto L_0x02f1
        L_0x02d4:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x02f1
            jt r7 = r6.f9858b
            jt r11 = r6.f9859c
            r5.mo5301b(r2, r7, r11)
            goto L_0x02f1
        L_0x02e0:
            jt r7 = r6.f9858b
            if (r7 != 0) goto L_0x02e8
            r5.mo5299a(r2)
            goto L_0x02f1
        L_0x02e8:
            jt r11 = r6.f9859c
            r5.mo5300a(r2, r7, r11)
            goto L_0x02f1
        L_0x02ee:
            r5.mo5299a(r2)
        L_0x02f1:
            p000.C0310lk.m7892a(r6)
            int r1 = r1 + -1
            goto L_0x0269
        L_0x02f8:
            ho r4 = r0.f1063c
            android.view.View r4 = r4.mo5203b(r1)
            km r4 = m1301c(r4)
            boolean r5 = r4.mo5434b()
            if (r5 != 0) goto L_0x041f
            long r5 = r0.m1302d(r4)
            ju r11 = r0.f1084x
            kk r12 = r0.f1024D
            jt r11 = r11.mo4187a(r12, r4)
            lm r12 = r0.f1064d
            cr r12 = r12.f9861b
            java.lang.Object r12 = r12.mo3642a(r5)
            km r12 = (p000.C0285km) r12
            if (r12 == 0) goto L_0x041a
            boolean r13 = r12.mo5434b()
            if (r13 != 0) goto L_0x041a
            lm r13 = r0.f1064d
            boolean r13 = r13.mo5535a(r12)
            lm r14 = r0.f1064d
            boolean r14 = r14.mo5535a(r4)
            if (r13 != 0) goto L_0x0335
            goto L_0x033e
        L_0x0335:
            if (r12 != r4) goto L_0x033e
            lm r5 = r0.f1064d
            r5.mo5537b(r4, r11)
            goto L_0x041f
        L_0x033e:
            lm r15 = r0.f1064d
            jt r15 = r15.mo5531a(r12, r7)
            lm r7 = r0.f1064d
            r7.mo5537b(r4, r11)
            lm r7 = r0.f1064d
            r11 = 8
            jt r7 = r7.mo5531a(r4, r11)
            if (r15 != 0) goto L_0x03ed
            ho r7 = r0.f1063c
            int r11 = r7.mo5196a()
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
            java.lang.String r4 = r17.mo822a()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r2, r4)
            goto L_0x041f
        L_0x0381:
            ho r13 = r0.f1063c
            android.view.View r13 = r13.mo5203b(r7)
            km r13 = m1301c(r13)
            if (r13 != r4) goto L_0x038e
            goto L_0x03e8
        L_0x038e:
            long r14 = r0.m1302d(r13)
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x03e8
            jp r1 = r0.f1067g
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x03c4
            boolean r1 = r1.f9698a
            if (r1 == 0) goto L_0x03c4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.append(r5)
            r3.append(r13)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r17.mo822a()
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
            java.lang.String r2 = r17.mo822a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x03e8:
            int r7 = r7 + 1
            goto L_0x035a
        L_0x03ed:
            r12.mo5432a(r3)
            if (r13 == 0) goto L_0x03f6
            r0.mo834a(r12)
        L_0x03f6:
            if (r12 != r4) goto L_0x03f9
            goto L_0x040e
        L_0x03f9:
            if (r14 != 0) goto L_0x03fc
            goto L_0x03ff
        L_0x03fc:
            r0.mo834a(r4)
        L_0x03ff:
            r12.f9790h = r4
            r0.mo834a(r12)
            kc r5 = r0.f1041a
            r5.mo5400b(r12)
            r4.mo5432a(r3)
            r4.f9791i = r12
        L_0x040e:
            ju r5 = r0.f1084x
            boolean r4 = r5.mo4190a(r12, r4, r15, r7)
            if (r4 == 0) goto L_0x041f
            r17.mo893m()
            goto L_0x041f
        L_0x041a:
            lm r5 = r0.f1064d
            r5.mo5537b(r4, r11)
        L_0x041f:
            int r1 = r1 + -1
            r7 = 4
            goto L_0x025e
        L_0x0424:
            jx r1 = r0.f1068h
            kc r2 = r0.f1041a
            r1.mo5346a(r2)
            kk r1 = r0.f1024D
            int r2 = r1.f9763e
            r1.f9760b = r2
            r0.f1079s = r3
            r0.f1039V = r3
            r1.f9768j = r3
            r1.f9769k = r3
            jx r1 = r0.f1068h
            r1.f9711d = r3
            kc r1 = r0.f1041a
            java.util.ArrayList r1 = r1.f9727b
            if (r1 != 0) goto L_0x0444
            goto L_0x0447
        L_0x0444:
            r1.clear()
        L_0x0447:
            jx r1 = r0.f1068h
            boolean r2 = r1.f9714g
            if (r2 == 0) goto L_0x0456
            r1.f9713f = r3
            r1.f9714g = r3
            kc r1 = r0.f1041a
            r1.mo5397b()
        L_0x0456:
            r17.mo3238v()
            r0.mo838a(r3)
            lm r1 = r0.f1064d
            r1.mo5532a()
            int[] r1 = r0.f1055an
            r2 = r1[r3]
            r4 = r1[r10]
            r0.m1295a(r1)
            int[] r1 = r0.f1055an
            r5 = r1[r3]
            if (r5 != r2) goto L_0x0475
            r1 = r1[r10]
            if (r1 != r4) goto L_0x0475
            goto L_0x0479
        L_0x0475:
            r0.mo849c(r3, r3)
        L_0x0479:
            boolean r1 = r0.f1086z
            if (r1 == 0) goto L_0x057a
            jp r1 = r0.f1067g
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
            ho r2 = r0.f1063c
            boolean r1 = r2.mo5205c(r1)
            if (r1 == 0) goto L_0x057a
        L_0x04af:
            kk r1 = r0.f1024D
            long r1 = r1.f9771m
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x04f7
            jp r4 = r0.f1067g
            boolean r5 = r4.f9698a
            if (r5 != 0) goto L_0x04c0
            goto L_0x04f7
        L_0x04c0:
            if (r4 == 0) goto L_0x04f7
            ho r4 = r0.f1063c
            int r4 = r4.mo5201b()
            r6 = r9
            r5 = 0
        L_0x04ca:
            if (r5 >= r4) goto L_0x04f8
            ho r7 = r0.f1063c
            android.view.View r7 = r7.mo5204c(r5)
            km r7 = m1301c(r7)
            if (r7 != 0) goto L_0x04d9
            goto L_0x04f3
        L_0x04d9:
            boolean r10 = r7.mo5445m()
            if (r10 != 0) goto L_0x04f3
            long r10 = r7.f9787e
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x04f3
            ho r6 = r0.f1063c
            android.view.View r10 = r7.f9783a
            boolean r6 = r6.mo5205c(r10)
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
            ho r1 = r0.f1063c
            android.view.View r2 = r6.f9783a
            boolean r1 = r1.mo5205c(r2)
            if (r1 != 0) goto L_0x0510
            android.view.View r1 = r6.f9783a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x050d
            goto L_0x0510
        L_0x050d:
            android.view.View r9 = r6.f9783a
            goto L_0x055b
        L_0x0510:
            ho r1 = r0.f1063c
            int r1 = r1.mo5196a()
            if (r1 <= 0) goto L_0x0559
            kk r1 = r0.f1024D
            int r2 = r1.f9770l
            if (r2 == r8) goto L_0x051f
            goto L_0x0521
        L_0x051f:
            r2 = 0
        L_0x0521:
            int r1 = r1.mo5420a()
            r3 = r2
        L_0x0526:
            if (r3 >= r1) goto L_0x053e
            km r4 = r0.mo871e(r3)
            if (r4 == 0) goto L_0x053e
            android.view.View r5 = r4.f9783a
            boolean r5 = r5.hasFocusable()
            if (r5 == 0) goto L_0x0539
            android.view.View r9 = r4.f9783a
            goto L_0x055b
        L_0x0539:
            int r3 = r3 + 1
            goto L_0x0526
        L_0x053e:
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = r1 + r8
        L_0x0543:
            if (r1 < 0) goto L_0x055a
            km r2 = r0.mo871e(r1)
            if (r2 == 0) goto L_0x055a
            android.view.View r3 = r2.f9783a
            boolean r3 = r3.hasFocusable()
            if (r3 == 0) goto L_0x0556
            android.view.View r9 = r2.f9783a
            goto L_0x055b
        L_0x0556:
            int r1 = r1 + -1
            goto L_0x0543
        L_0x0559:
        L_0x055a:
        L_0x055b:
            if (r9 == 0) goto L_0x057a
            kk r1 = r0.f1024D
            int r1 = r1.f9772n
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
            r17.m1313z()
            return
        L_0x057e:
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.RecyclerView.m1312y():void");
    }

    /* renamed from: A */
    private final void m1286A() {
        boolean z;
        mo859d();
        mo890j();
        this.f1024D.mo5421a(6);
        this.f1062b.mo5091e();
        this.f1024D.f9763e = this.f1067g.mo2794a();
        C0283kk kkVar = this.f1024D;
        kkVar.f9761c = 0;
        kkVar.f9765g = false;
        this.f1068h.mo5348a(this.f1041a, kkVar);
        C0283kk kkVar2 = this.f1024D;
        kkVar2.f9764f = false;
        this.f1032O = null;
        if (!kkVar2.f9768j || this.f1084x == null) {
            z = false;
        } else {
            z = true;
        }
        kkVar2.f9768j = z;
        kkVar2.f9762d = 4;
        mo3238v();
        mo838a(false);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m1288C().mo4672a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return m1288C().mo4671a(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1288C().mo4677a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo839a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m1288C().mo4677a(i, i2, iArr, iArr2, i3);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m1288C().mo4675a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public final void mo826a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m1288C().mo4676a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: c */
    public final void mo849c(int i, int i2) {
        this.f1042aa++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.f1025E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((atc) this.f1025E.get(size)).mo1315a(this);
            }
        }
        this.f1042aa--;
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
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.f1070j.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((akr) this.f1070j.get(i)).mo464a(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1080t;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1033P ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f1080t;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1081u;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1033P) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1081u;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1082v;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1033P ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f1082v;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1083w;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1033P) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f1083w;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save4);
        }
        if (z || (this.f1084x != null && this.f1070j.size() > 0 && this.f1084x.mo4191b())) {
            C0107dx.m7207d(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: i */
    public final void mo886i() {
        if (this.f1083w == null) {
            EdgeEffect a = aic.m541a(this);
            this.f1083w = a;
            if (this.f1033P) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: f */
    public final void mo874f() {
        if (this.f1080t == null) {
            EdgeEffect a = aic.m541a(this);
            this.f1080t = a;
            if (this.f1033P) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: g */
    public final void mo877g() {
        if (this.f1082v == null) {
            EdgeEffect a = aic.m541a(this);
            this.f1082v = a;
            if (this.f1033P) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: h */
    public final void mo884h() {
        if (this.f1081u == null) {
            EdgeEffect a = aic.m541a(this);
            this.f1081u = a;
            if (this.f1033P) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: a */
    public final String mo822a() {
        return " " + super.toString() + ", adapter:" + this.f1067g + ", layout:" + this.f1068h + ", context:" + getContext();
    }

    /* renamed from: a */
    private final void m1294a(C0283kk kkVar) {
        if (this.f1085y == 2) {
            OverScroller overScroller = this.f1021A.f9777c;
            kkVar.f9773o = overScroller.getFinalX() - overScroller.getCurrX();
            kkVar.f9774p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        kkVar.f9773o = 0;
        kkVar.f9774p = 0;
    }

    /* renamed from: b */
    public final View mo841b(View view) {
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

    /* renamed from: a */
    private final boolean m1298a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1071k.size();
        for (int i = 0; i < size; i++) {
            C0271jz jzVar = (C0271jz) this.f1071k.get(i);
            if (jzVar.mo5250a(motionEvent) && action != 3) {
                this.f1072l = jzVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m1295a(int[] iArr) {
        int a = this.f1063c.mo5196a();
        if (a != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < a; i3++) {
                C0285km c = m1301c(this.f1063c.mo5203b(i3));
                if (!c.mo5434b()) {
                    int c2 = c.mo5435c();
                    if (c2 < i) {
                        i = c2;
                    }
                    if (c2 > i2) {
                        i2 = c2;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    /* renamed from: e */
    public static RecyclerView m1303e(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView e = m1303e(viewGroup.getChildAt(i));
                if (e != null) {
                    return e;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C0285km mo871e(int i) {
        C0285km kmVar = null;
        if (!this.f1079s) {
            int b = this.f1063c.mo5201b();
            for (int i2 = 0; i2 < b; i2++) {
                C0285km c = m1301c(this.f1063c.mo5204c(i2));
                if (c != null && !c.mo5445m() && mo846c(c) == i) {
                    if (!this.f1063c.mo5205c(c.f9783a)) {
                        return c;
                    }
                    kmVar = c;
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
        if (r6.findNextFocus(r0, r1, !((r0.f1068h.mo5373f() == 1) ^ (r2 == 2)) ? 17 : 66) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        mo847c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (mo841b(r18) == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        mo859d();
        mo838a(false);
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
            jx r3 = r0.f1068h
            android.view.View r3 = r3.mo5364c(r1, r2)
            if (r3 != 0) goto L_0x02e1
            jp r3 = r0.f1067g
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0025
            jx r3 = r0.f1068h
            if (r3 == 0) goto L_0x0025
            boolean r3 = r17.mo892l()
            if (r3 != 0) goto L_0x0025
            boolean r3 = r0.f1077q
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
            jx r3 = r0.f1068h
            boolean r3 = r3.mo5370d()
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
            jx r3 = r0.f1068h
            boolean r3 = r3.mo5366c()
            if (r3 == 0) goto L_0x008c
            jx r3 = r0.f1068h
            int r3 = r3.mo5373f()
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
            r17.mo847c()
            android.view.View r3 = r17.mo841b(r18)
            if (r3 == 0) goto L_0x008a
            r17.mo859d()
            r0.mo838a(r5)
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
            r17.mo847c()
            android.view.View r3 = r17.mo841b(r18)
            if (r3 == 0) goto L_0x00ab
            r17.mo859d()
            r0.mo838a(r5)
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
            android.graphics.Rect r2 = r0.f1066f
            int r3 = r11.getWidth()
            int r6 = r11.getHeight()
            r2.set(r5, r5, r3, r6)
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            boolean r3 = r2 instanceof p000.C0270jy
            if (r3 == 0) goto L_0x00fe
            jy r2 = (p000.C0270jy) r2
            boolean r3 = r2.f9719c
            if (r3 != 0) goto L_0x00fe
            android.graphics.Rect r2 = r2.f9718b
            android.graphics.Rect r3 = r0.f1066f
            int r6 = r3.left
            int r7 = r2.left
            int r6 = r6 - r7
            r3.left = r6
            android.graphics.Rect r3 = r0.f1066f
            int r6 = r3.right
            int r7 = r2.right
            int r6 = r6 + r7
            r3.right = r6
            android.graphics.Rect r3 = r0.f1066f
            int r6 = r3.top
            int r7 = r2.top
            int r6 = r6 - r7
            r3.top = r6
            android.graphics.Rect r3 = r0.f1066f
            int r6 = r3.bottom
            int r2 = r2.bottom
            int r6 = r6 + r2
            r3.bottom = r6
        L_0x00fe:
            jx r2 = r0.f1068h
            android.graphics.Rect r3 = r0.f1066f
            boolean r6 = r0.f1075o
            r6 = r6 ^ r4
            int[] r7 = new int[r12]
            int r8 = r2.mo5375h()
            int r9 = r2.mo5376i()
            int r10 = r2.f9715h
            int r12 = r2.mo5377j()
            int r13 = r2.f9716i
            int r14 = r2.mo5378k()
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
            int r4 = r2.mo5373f()
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
            int r5 = r2.mo5375h()
            int r7 = r2.mo5376i()
            int r8 = r2.f9715h
            int r9 = r2.mo5377j()
            int r10 = r2.f9716i
            int r11 = r2.mo5378k()
            int r10 = r10 - r11
            android.support.v7.widget.RecyclerView r11 = r2.f9709b
            android.graphics.Rect r11 = r11.f1066f
            r2.mo5340a(r4, r11)
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
            r0.mo825a(r1, r3)
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
            android.view.View r3 = r0.mo841b(r11)
            if (r3 == 0) goto L_0x02dc
            if (r1 == 0) goto L_0x02db
            android.view.View r3 = r17.mo841b(r18)
            if (r3 == 0) goto L_0x02db
            android.graphics.Rect r3 = r0.f1066f
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            r6 = 0
            r3.set(r6, r6, r4, r5)
            android.graphics.Rect r3 = r0.f1034Q
            int r4 = r11.getWidth()
            int r5 = r11.getHeight()
            r3.set(r6, r6, r4, r5)
            android.graphics.Rect r3 = r0.f1066f
            r0.offsetDescendantRectToMyCoords(r1, r3)
            android.graphics.Rect r3 = r0.f1034Q
            r0.offsetDescendantRectToMyCoords(r11, r3)
            jx r3 = r0.f1068h
            int r3 = r3.mo5373f()
            r4 = -1
            r5 = 1
            if (r3 != r5) goto L_0x0210
            r3 = -1
            goto L_0x0212
        L_0x0210:
            r3 = 1
        L_0x0212:
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.f1034Q
            int r13 = r13.left
            if (r5 < r13) goto L_0x0226
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.f1034Q
            int r13 = r13.left
            if (r5 > r13) goto L_0x0230
        L_0x0226:
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.f1034Q
            int r13 = r13.right
            if (r5 < r13) goto L_0x0253
        L_0x0230:
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.right
            android.graphics.Rect r13 = r0.f1034Q
            int r13 = r13.right
            if (r5 > r13) goto L_0x0244
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.f1034Q
            int r13 = r13.right
            if (r5 < r13) goto L_0x0251
        L_0x0244:
            android.graphics.Rect r5 = r0.f1066f
            int r5 = r5.left
            android.graphics.Rect r13 = r0.f1034Q
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
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.f1034Q
            int r14 = r14.top
            if (r13 < r14) goto L_0x0268
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.f1034Q
            int r14 = r14.top
            if (r13 > r14) goto L_0x0272
        L_0x0268:
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.f1034Q
            int r14 = r14.bottom
            if (r13 < r14) goto L_0x0292
        L_0x0272:
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.bottom
            android.graphics.Rect r14 = r0.f1034Q
            int r14 = r14.bottom
            if (r13 > r14) goto L_0x0286
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.f1034Q
            int r14 = r14.bottom
            if (r13 < r14) goto L_0x0293
        L_0x0286:
            android.graphics.Rect r13 = r0.f1066f
            int r13 = r13.top
            android.graphics.Rect r14 = r0.f1034Q
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
            java.lang.String r2 = r17.mo822a()
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            return jxVar.mo5354b();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo822a());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            return jxVar.mo5329a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo822a());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            return jxVar.mo5330a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo822a());
    }

    /* renamed from: c */
    public final int mo846c(C0285km kmVar) {
        if (kmVar.mo5448o(524) || !kmVar.mo5444l()) {
            return -1;
        }
        C0187gw gwVar = this.f1062b;
        int i = kmVar.f9785c;
        int size = gwVar.f9428a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0186gv gvVar = (C0186gv) gwVar.f9428a.get(i2);
            int i3 = gvVar.f9424a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = gvVar.f9425b;
                    if (i4 <= i) {
                        int i5 = gvVar.f9427d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = gvVar.f9425b;
                    if (i6 == i) {
                        i = gvVar.f9427d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (gvVar.f9427d <= i) {
                            i++;
                        }
                    }
                }
            } else if (gvVar.f9425b <= i) {
                i += gvVar.f9427d;
            }
        }
        return i;
    }

    public final int getBaseline() {
        if (this.f1068h != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* renamed from: d */
    private final long m1302d(C0285km kmVar) {
        return !this.f1067g.f9698a ? (long) kmVar.f9785c : kmVar.f9787e;
    }

    /* renamed from: d */
    public final int mo858d(View view) {
        C0285km c = m1301c(view);
        if (c == null) {
            return -1;
        }
        return c.mo5436d();
    }

    /* renamed from: a */
    public final C0285km mo823a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1301c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: c */
    public static C0285km m1301c(View view) {
        if (view != null) {
            return ((C0270jy) view.getLayoutParams()).f9717a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m1293a(View view, Rect rect) {
        C0270jy jyVar = (C0270jy) view.getLayoutParams();
        Rect rect2 = jyVar.f9718b;
        rect.set((view.getLeft() - rect2.left) - jyVar.leftMargin, (view.getTop() - rect2.top) - jyVar.topMargin, view.getRight() + rect2.right + jyVar.rightMargin, view.getBottom() + rect2.bottom + jyVar.bottomMargin);
    }

    /* renamed from: C */
    private final C0096dm m1288C() {
        if (this.f1056ao == null) {
            this.f1056ao = new C0096dm(this);
        }
        return this.f1056ao;
    }

    public final boolean hasNestedScrollingParent() {
        return m1288C().mo4673a(0);
    }

    /* renamed from: q */
    public final boolean mo909q() {
        return !this.f1075o || this.f1079s || this.f1062b.mo5090d();
    }

    /* renamed from: s */
    private final void mo5625s() {
        this.f1083w = null;
        this.f1081u = null;
        this.f1082v = null;
        this.f1080t = null;
    }

    /* renamed from: p */
    public final void mo908p() {
        if (this.f1070j.size() != 0) {
            C0269jx jxVar = this.f1068h;
            if (jxVar != null) {
                jxVar.mo5344a("Cannot invalidate item decorations during a scroll or layout");
            }
            mo894n();
            requestLayout();
        }
    }

    /* renamed from: k */
    public final boolean mo891k() {
        AccessibilityManager accessibilityManager = this.f1038U;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: o */
    public final boolean mo895o() {
        C0266ju juVar = this.f1084x;
        return juVar != null && juVar.mo4191b();
    }

    public final boolean isNestedScrollingEnabled() {
        return m1288C().f8789a;
    }

    /* renamed from: c */
    public final void mo848c(int i) {
        if (this.f1068h != null) {
            mo843b(2);
            this.f1068h.mo5332a(i);
            awakenScrollBars();
        }
    }

    /* renamed from: n */
    public final void mo894n() {
        int b = this.f1063c.mo5201b();
        for (int i = 0; i < b; i++) {
            ((C0270jy) this.f1063c.mo5204c(i).getLayoutParams()).f9719c = true;
        }
        C0275kc kcVar = this.f1041a;
        int size = kcVar.f9728c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0270jy jyVar = (C0270jy) ((C0285km) kcVar.f9728c.get(i2)).f9783a.getLayoutParams();
            if (jyVar != null) {
                jyVar.f9719c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo827a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f1063c.mo5201b();
        for (int i4 = 0; i4 < b; i4++) {
            C0285km c = m1301c(this.f1063c.mo5204c(i4));
            if (c != null && !c.mo5434b()) {
                int i5 = c.f9785c;
                if (i5 >= i3) {
                    c.mo5429a(-i2, z);
                    this.f1024D.f9764f = true;
                } else if (i5 >= i) {
                    c.mo5433b(8);
                    c.mo5429a(-i2, z);
                    c.f9785c = i - 1;
                    this.f1024D.f9764f = true;
                }
            }
        }
        C0275kc kcVar = this.f1041a;
        for (int size = kcVar.f9728c.size() - 1; size >= 0; size--) {
            C0285km kmVar = (C0285km) kcVar.f9728c.get(size);
            if (kmVar != null) {
                int i6 = kmVar.f9785c;
                if (i6 >= i3) {
                    kmVar.mo5429a(-i2, z);
                } else if (i6 >= i) {
                    kmVar.mo5433b(8);
                    kcVar.mo5398b(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1040W = 0;
        boolean z = true;
        this.f1073m = true;
        if (!this.f1075o || isLayoutRequested()) {
            z = false;
        }
        this.f1075o = z;
        this.f1028H = false;
        C0235iq iqVar = (C0235iq) C0235iq.f9622a.get();
        this.f1022B = iqVar;
        if (iqVar == null) {
            this.f1022B = new C0235iq();
            Display p = C0107dx.m7219p(this);
            float f = 60.0f;
            if (!isInEditMode() && p != null) {
                float refreshRate = p.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            this.f1022B.f9625c = (long) (1.0E9f / f);
            C0235iq.f9622a.set(this.f1022B);
        }
        this.f1022B.f9624b.add(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0266ju juVar = this.f1084x;
        if (juVar != null) {
            juVar.mo4196d();
        }
        mo872e();
        this.f1073m = false;
        this.f1059ar.clear();
        removeCallbacks(this.f1060as);
        C0310lk.m7893b();
        C0235iq iqVar = this.f1022B;
        if (iqVar != null) {
            iqVar.f9624b.remove(this);
            this.f1022B = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1070j.size();
        for (int i = 0; i < size; i++) {
            akr akr = (akr) this.f1070j.get(i);
        }
    }

    /* renamed from: j */
    public final void mo890j() {
        this.f1040W++;
    }

    /* renamed from: v */
    private final void mo3238v() {
        mo845b(true);
    }

    /* renamed from: b */
    public final void mo845b(boolean z) {
        int i;
        int i2 = this.f1040W - 1;
        this.f1040W = i2;
        if (i2 <= 0) {
            this.f1040W = 0;
            if (z) {
                int i3 = this.f1037T;
                this.f1037T = 0;
                if (i3 != 0 && mo891k()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    int i4 = Build.VERSION.SDK_INT;
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.f1059ar.size() - 1; size >= 0; size--) {
                    C0285km kmVar = (C0285km) this.f1059ar.get(size);
                    if (kmVar.f9783a.getParent() == this && !kmVar.mo5434b() && (i = kmVar.f9796n) != -1) {
                        C0107dx.m7196a(kmVar.f9783a, i);
                        kmVar.f9796n = -1;
                    }
                }
                this.f1059ar.clear();
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f1068h != null && !this.f1077q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1068h.mo5370d() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1068h.mo5366c()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m1296a((int) (f * this.f1052ak), (int) (f2 * this.f1053al), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1068h.mo5370d()) {
                        f2 = -axisValue;
                        f = 0.0f;
                    } else if (this.f1068h.mo5366c()) {
                        f = axisValue;
                        f2 = 0.0f;
                    }
                    m1296a((int) (f * this.f1052ak), (int) (f2 * this.f1053al), motionEvent);
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            m1296a((int) (f * this.f1052ak), (int) (f2 * this.f1053al), motionEvent);
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
            boolean r0 = r8.f1077q
            r1 = 0
            if (r0 != 0) goto L_0x0125
            r0 = 0
            r8.f1072l = r0
            boolean r0 = r8.m1298a(r9)
            r2 = 1
            if (r0 != 0) goto L_0x0121
            jx r0 = r8.f1068h
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.mo5366c()
            jx r3 = r8.f1068h
            boolean r3 = r3.mo5370d()
            android.view.VelocityTracker r4 = r8.f1044ac
            if (r4 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.f1044ac = r4
        L_0x0028:
            android.view.VelocityTracker r4 = r8.f1044ac
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
            r8.m1299b(r9)
            goto L_0x0119
        L_0x004e:
            int r0 = r9.getPointerId(r5)
            r8.f1043ab = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.f1047af = r0
            r8.f1045ad = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f1048ag = r9
            r8.f1046ae = r9
            goto L_0x0119
        L_0x006a:
            r8.mo3237u()
            goto L_0x0119
        L_0x006f:
            int r4 = r8.f1043ab
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x0095
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.f1043ab
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
            int r4 = r8.f1085y
            if (r4 == r2) goto L_0x0119
            int r4 = r8.f1045ad
            int r4 = r5 - r4
            int r6 = r8.f1046ae
            int r6 = r9 - r6
            if (r0 == 0) goto L_0x00bc
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.f1049ah
            if (r0 <= r4) goto L_0x00bb
            r8.f1047af = r5
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
            int r4 = r8.f1049ah
            if (r3 <= r4) goto L_0x00cb
            r8.f1048ag = r9
            goto L_0x00cd
        L_0x00cb:
            if (r0 == 0) goto L_0x0119
        L_0x00cd:
            r8.mo843b(r2)
            goto L_0x0119
        L_0x00d1:
            android.view.VelocityTracker r9 = r8.f1044ac
            r9.clear()
            r8.mo875f(r1)
            goto L_0x0119
        L_0x00da:
            boolean r4 = r8.f1036S
            if (r4 == 0) goto L_0x00e0
            r8.f1036S = r1
        L_0x00e0:
            int r4 = r9.getPointerId(r1)
            r8.f1043ab = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.f1047af = r4
            r8.f1045ad = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.f1048ag = r9
            r8.f1046ae = r9
            int r9 = r8.f1085y
            if (r9 != r6) goto L_0x010c
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.mo843b(r2)
            r8.mo875f(r2)
        L_0x010c:
            int[] r9 = r8.f1058aq
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L_0x0116
            r0 = r0 | 2
        L_0x0116:
            r8.m1304f(r0, r1)
        L_0x0119:
            int r9 = r8.f1085y
            if (r9 == r2) goto L_0x011e
            return r1
        L_0x011e:
            return r2
        L_0x011f:
            return r1
        L_0x0121:
            r8.mo3237u()
            return r2
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0049bu.m4189a("RV OnLayout");
        m1312y();
        C0049bu.m4188a();
        this.f1075o = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C0269jx jxVar = this.f1068h;
        if (jxVar == null) {
            setMeasuredDimension(C0269jx.m7686a(i, getPaddingLeft() + getPaddingRight(), C0107dx.m7210g(this)), C0269jx.m7686a(i2, getPaddingTop() + getPaddingBottom(), C0107dx.m7211h(this)));
        } else if (this.f1074n) {
            jxVar.mo5349a(this.f1041a, this.f1024D, i, i2);
        } else {
            if (this.f1078r) {
                mo859d();
                mo890j();
                m1311x();
                mo3238v();
                C0283kk kkVar = this.f1024D;
                if (kkVar.f9769k) {
                    kkVar.f9765g = true;
                } else {
                    this.f1062b.mo5091e();
                    this.f1024D.f9765g = false;
                }
                this.f1078r = false;
                mo838a(false);
            } else if (this.f1024D.f9769k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0261jp jpVar = this.f1067g;
            if (jpVar != null) {
                this.f1024D.f9763e = jpVar.mo2794a();
            } else {
                this.f1024D.f9763e = 0;
            }
            mo859d();
            this.f1068h.mo5349a(this.f1041a, this.f1024D, i, i2);
            mo838a(false);
            this.f1024D.f9765g = false;
        }
    }

    /* renamed from: b */
    private final void m1299b(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1043ab) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1043ab = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1047af = x;
            this.f1045ad = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1048ag = y;
            this.f1046ae = y;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (!mo892l()) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0279kg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0279kg kgVar = (C0279kg) parcelable;
        this.f1032O = kgVar;
        super.onRestoreInstanceState(kgVar.f8521b);
        C0269jx jxVar = this.f1068h;
        if (jxVar != null && (parcelable2 = this.f1032O.f9735c) != null) {
            jxVar.mo5336a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C0279kg kgVar = new C0279kg(super.onSaveInstanceState());
        C0279kg kgVar2 = this.f1032O;
        if (kgVar2 == null) {
            C0269jx jxVar = this.f1068h;
            if (jxVar != null) {
                kgVar.f9735c = jxVar.mo5381n();
            } else {
                kgVar.f9735c = null;
            }
        } else {
            kgVar.f9735c = kgVar2.f9735c;
        }
        return kgVar;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo5625s();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = 0;
        if (this.f1077q || this.f1036S) {
            return false;
        }
        C0271jz jzVar = this.f1072l;
        if (jzVar != null) {
            jzVar.mo5252b(motionEvent2);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1072l = null;
            }
        } else if (motionEvent.getAction() == 0 || !m1298a(motionEvent)) {
            C0269jx jxVar = this.f1068h;
            if (jxVar == null) {
                return false;
            }
            boolean c = jxVar.mo5366c();
            boolean d = this.f1068h.mo5370d();
            if (this.f1044ac == null) {
                this.f1044ac = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.f1058aq;
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.f1058aq;
            obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            if (actionMasked == 0) {
                this.f1043ab = motionEvent2.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f1047af = x;
                this.f1045ad = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f1048ag = y;
                this.f1046ae = y;
                if (d) {
                    c |= true;
                }
                m1304f(c ? 1 : 0, 0);
            } else if (actionMasked == 1) {
                this.f1044ac.addMovement(obtain);
                this.f1044ac.computeCurrentVelocity(1000, (float) this.f1051aj);
                float f = c ? -this.f1044ac.getXVelocity(this.f1043ab) : 0.0f;
                float f2 = d ? -this.f1044ac.getYVelocity(this.f1043ab) : 0.0f;
                if (!(f == 0.0f && f2 == 0.0f)) {
                    int i6 = (int) f;
                    int i7 = (int) f2;
                    C0269jx jxVar2 = this.f1068h;
                    if (jxVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1077q) {
                        boolean c2 = jxVar2.mo5366c();
                        boolean d2 = this.f1068h.mo5370d();
                        if (!c2 || Math.abs(i6) < this.f1050ai) {
                            i6 = 0;
                        }
                        if (!d2 || Math.abs(i7) < this.f1050ai) {
                            i7 = 0;
                        }
                        if (!(i6 == 0 && i7 == 0)) {
                            float f3 = (float) i6;
                            float f4 = (float) i7;
                            if (!dispatchNestedPreFling(f3, f4)) {
                                dispatchNestedFling(f3, f4, true);
                                if (d2) {
                                    c2 |= true;
                                }
                                m1304f(c2 ? 1 : 0, 1);
                                int i8 = this.f1051aj;
                                int max = Math.max(-i8, Math.min(i6, i8));
                                int i9 = this.f1051aj;
                                int max2 = Math.max(-i9, Math.min(i7, i9));
                                C0284kl klVar = this.f1021A;
                                klVar.f9779e.mo843b(2);
                                klVar.f9776b = 0;
                                klVar.f9775a = 0;
                                Interpolator interpolator = klVar.f9778d;
                                Interpolator interpolator2 = f1018K;
                                if (interpolator != interpolator2) {
                                    klVar.f9778d = interpolator2;
                                    klVar.f9777c = new OverScroller(klVar.f9779e.getContext(), f1018K);
                                }
                                klVar.f9777c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                klVar.mo5423a();
                                mo5626t();
                                obtain.recycle();
                                return true;
                            }
                        }
                    }
                }
                mo843b(0);
                mo5626t();
                obtain.recycle();
                return true;
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1043ab);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1043ab + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                int i10 = this.f1047af - x2;
                int i11 = this.f1048ag - y2;
                if (this.f1085y == 1) {
                    i2 = i10;
                    i = i11;
                } else {
                    if (!c) {
                        i3 = i10;
                        z = false;
                    } else {
                        if (i10 <= 0) {
                            i4 = Math.min(0, i10 + this.f1049ah);
                        } else {
                            i4 = Math.max(0, i10 - this.f1049ah);
                        }
                        if (i4 != 0) {
                            i3 = i4;
                            z = true;
                        } else {
                            i3 = i4;
                            z = false;
                        }
                    }
                    if (d) {
                        if (i11 <= 0) {
                            i11 = Math.min(0, i11 + this.f1049ah);
                        } else {
                            i11 = Math.max(0, i11 - this.f1049ah);
                        }
                        if (i11 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        mo843b(1);
                    }
                    i = i11;
                    i2 = i3;
                }
                if (this.f1085y == 1) {
                    int[] iArr3 = this.f1030J;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (mo839a(!c ? 0 : i2, !d ? 0 : i, iArr3, this.f1057ap, 0)) {
                        int[] iArr4 = this.f1030J;
                        i2 -= iArr4[0];
                        i -= iArr4[1];
                        int[] iArr5 = this.f1058aq;
                        int i12 = iArr5[0];
                        int[] iArr6 = this.f1057ap;
                        iArr5[0] = i12 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i13 = i;
                    int[] iArr7 = this.f1057ap;
                    this.f1047af = x2 - iArr7[0];
                    this.f1048ag = y2 - iArr7[1];
                    int i14 = !c ? 0 : i2;
                    if (d) {
                        i5 = i13;
                    }
                    if (m1296a(i14, i5, motionEvent2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    C0235iq iqVar = this.f1022B;
                    if (!(iqVar == null || (i2 == 0 && i13 == 0))) {
                        iqVar.mo5264a(this, i2, i13);
                    }
                }
            } else if (actionMasked == 3) {
                mo3237u();
            } else if (actionMasked == 5) {
                this.f1043ab = motionEvent2.getPointerId(actionIndex);
                int x3 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                this.f1047af = x3;
                this.f1045ad = x3;
                int y3 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                this.f1048ag = y3;
                this.f1046ae = y3;
            } else if (actionMasked == 6) {
                m1299b(motionEvent);
            }
            this.f1044ac.addMovement(obtain);
            obtain.recycle();
            return true;
        }
        mo3237u();
        return true;
    }

    /* renamed from: m */
    public final void mo893m() {
        if (!this.f1028H && this.f1073m) {
            C0107dx.m7201a(this, this.f1060as);
            this.f1028H = true;
        }
    }

    /* renamed from: w */
    private final boolean m1310w() {
        if (this.f1084x == null) {
            return false;
        }
        this.f1068h.mo5385r();
        return true;
    }

    /* renamed from: x */
    private final void m1311x() {
        boolean z;
        if (this.f1079s) {
            this.f1062b.mo5084a();
            if (this.f1039V) {
                this.f1068h.mo5382o();
            }
        }
        if (m1310w()) {
            this.f1062b.mo5088b();
        } else {
            this.f1062b.mo5091e();
        }
        boolean z2 = false;
        boolean z3 = this.f1026F || this.f1027G;
        C0283kk kkVar = this.f1024D;
        boolean z4 = this.f1075o && this.f1084x != null && ((z = this.f1079s) || z3) && (!z || this.f1067g.f9698a);
        kkVar.f9768j = z4;
        if (z4 && z3 && !this.f1079s && m1310w()) {
            z2 = true;
        }
        kkVar.f9769k = z2;
    }

    /* renamed from: c */
    public final void mo850c(boolean z) {
        this.f1039V = z | this.f1039V;
        this.f1079s = true;
        int b = this.f1063c.mo5201b();
        for (int i = 0; i < b; i++) {
            C0285km c = m1301c(this.f1063c.mo5204c(i));
            if (c != null && !c.mo5434b()) {
                c.mo5433b(6);
            }
        }
        mo894n();
        C0275kc kcVar = this.f1041a;
        int size = kcVar.f9728c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0285km kmVar = (C0285km) kcVar.f9728c.get(i2);
            if (kmVar != null) {
                kmVar.mo5433b(6);
                kmVar.mo5430a((Object) null);
            }
        }
        C0261jp jpVar = kcVar.f9731f.f1067g;
        if (jpVar == null || !jpVar.f9698a) {
            kcVar.mo5401c();
        }
    }

    /* renamed from: a */
    public final void mo836a(C0285km kmVar, C0265jt jtVar) {
        kmVar.mo5428a(0, 8192);
        if (this.f1024D.f9766h && kmVar.mo5453t() && !kmVar.mo5445m() && !kmVar.mo5434b()) {
            this.f1064d.mo5533a(m1302d(kmVar), kmVar);
        }
        this.f1064d.mo5534a(kmVar, jtVar);
    }

    /* renamed from: b */
    public final void mo842b() {
        C0266ju juVar = this.f1084x;
        if (juVar != null) {
            juVar.mo4196d();
        }
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            jxVar.mo5361b(this.f1041a);
            this.f1068h.mo5346a(this.f1041a);
        }
        this.f1041a.mo5393a();
    }

    public final void removeDetachedView(View view, boolean z) {
        C0285km c = m1301c(view);
        if (c != null) {
            if (c.mo5446n()) {
                c.mo5441i();
            } else if (!c.mo5434b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c + mo822a());
            }
        }
        view.clearAnimation();
        m1301c(view);
        super.removeDetachedView(view, z);
    }

    public final void requestChildFocus(View view, View view2) {
        this.f1068h.mo5341a(view, view2);
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1068h.mo5383p();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1071k.size();
        for (int i = 0; i < size; i++) {
            ((C0271jz) this.f1071k.get(i)).mo5251b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.f1035R == 0 && !this.f1077q) {
            super.requestLayout();
        } else {
            this.f1076p = true;
        }
    }

    /* renamed from: z */
    private final void m1313z() {
        C0283kk kkVar = this.f1024D;
        kkVar.f9771m = -1;
        kkVar.f9770l = -1;
        kkVar.f9772n = -1;
    }

    /* renamed from: t */
    private final void mo5626t() {
        VelocityTracker velocityTracker = this.f1044ac;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo875f(0);
        EdgeEffect edgeEffect = this.f1080t;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f1080t.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1081u;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f1081u.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1082v;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f1082v.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1083w;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f1083w.isFinished();
        }
        if (z) {
            C0107dx.m7207d(this);
        }
    }

    public final void scrollBy(int i, int i2) {
        C0269jx jxVar = this.f1068h;
        if (jxVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1077q) {
            boolean c = jxVar.mo5366c();
            boolean d = this.f1068h.mo5370d();
            if (c || d) {
                if (!c) {
                    i = 0;
                }
                if (!d) {
                    i2 = 0;
                }
                m1296a(i, i2, (MotionEvent) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0116, code lost:
        if (r4 == 0.0f) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        if (r1 != 0) goto L_0x0127;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m1296a(int r20, int r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r19.mo847c()
            jp r0 = r8.f1067g
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0027
            int[] r0 = r8.f1030J
            r0[r12] = r12
            r0[r11] = r12
            r8.mo828a(r9, r10, r0)
            int[] r0 = r8.f1030J
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
            java.util.ArrayList r0 = r8.f1070j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r19.invalidate()
        L_0x0038:
            int[] r6 = r8.f1030J
            r6[r12] = r12
            r6[r11] = r12
            int[] r5 = r8.f1057ap
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
            r0.mo826a(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f1030J
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
            int r1 = r8.f1047af
            int[] r2 = r8.f1057ap
            r3 = r2[r12]
            int r1 = r1 - r3
            r8.f1047af = r1
            int r1 = r8.f1048ag
            r4 = r2[r11]
            int r1 = r1 - r4
            r8.f1048ag = r1
            int[] r1 = r8.f1058aq
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
            r19.mo874f()
            android.widget.EdgeEffect r7 = r8.f1080t
            float r13 = -r2
            int r14 = r19.getWidth()
            float r14 = (float) r14
            float r13 = r13 / r14
            int r14 = r19.getHeight()
            float r14 = (float) r14
            float r3 = r3 / r14
            float r3 = r5 - r3
            p000.C0122el.m7251a(r7, r13, r3)
            r3 = 1
            goto L_0x00da
        L_0x00bc:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            r19.mo877g()
            android.widget.EdgeEffect r7 = r8.f1082v
            int r13 = r19.getWidth()
            float r13 = (float) r13
            float r13 = r2 / r13
            int r14 = r19.getHeight()
            float r14 = (float) r14
            float r3 = r3 / r14
            p000.C0122el.m7251a(r7, r13, r3)
            r3 = 1
            goto L_0x00da
        L_0x00d8:
            r3 = 0
        L_0x00da:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f4
            r19.mo884h()
            android.widget.EdgeEffect r2 = r8.f1081u
            float r3 = -r4
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r19.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            p000.C0122el.m7251a(r2, r3, r1)
            goto L_0x0118
        L_0x00f4:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x010e
            r19.mo886i()
            android.widget.EdgeEffect r2 = r8.f1083w
            int r3 = r19.getHeight()
            float r3 = (float) r3
            float r4 = r4 / r3
            int r3 = r19.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r5 = r5 - r1
            p000.C0122el.m7251a(r2, r4, r5)
            goto L_0x0118
        L_0x010e:
            if (r3 != 0) goto L_0x0118
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0118
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x011b
        L_0x0118:
            p000.C0107dx.m7207d(r19)
        L_0x011b:
            r19.mo844b(r20, r21)
        L_0x011e:
            if (r15 == 0) goto L_0x0123
            r1 = r18
            goto L_0x0127
        L_0x0123:
            r1 = r18
            if (r1 == 0) goto L_0x012a
        L_0x0127:
            r8.mo849c(r15, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.RecyclerView.m1296a(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo828a(int i, int i2, int[] iArr) {
        int i3;
        C0285km kmVar;
        mo859d();
        mo890j();
        C0049bu.m4189a("RV Scroll");
        m1294a(this.f1024D);
        int a = i != 0 ? this.f1068h.mo5327a(i, this.f1041a, this.f1024D) : 0;
        if (i2 != 0) {
            i3 = this.f1068h.mo5352b(i2, this.f1041a, this.f1024D);
        } else {
            i3 = 0;
        }
        C0049bu.m4188a();
        int a2 = this.f1063c.mo5196a();
        for (int i4 = 0; i4 < a2; i4++) {
            View b = this.f1063c.mo5203b(i4);
            C0285km a3 = mo823a(b);
            if (!(a3 == null || (kmVar = a3.f9791i) == null)) {
                View view = kmVar.f9783a;
                int left = b.getLeft();
                int top = b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo3238v();
        mo838a(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = i3;
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (mo892l()) {
            if (accessibilityEvent == null) {
                i = 0;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                i = accessibilityEvent.getContentChangeTypes();
            }
            if (i == 0) {
                i = 0;
            }
            this.f1037T = i | this.f1037T;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    /* renamed from: a */
    public final void mo837a(C0287ko koVar) {
        this.f1029I = koVar;
        C0107dx.m7200a(this, koVar);
    }

    /* renamed from: a */
    public final void mo831a(C0261jp jpVar) {
        suppressLayout(false);
        C0261jp jpVar2 = this.f1067g;
        if (jpVar2 != null) {
            jpVar2.mo5310b(this.f1031N);
            this.f1067g.mo3511c();
        }
        mo842b();
        this.f1062b.mo5084a();
        C0261jp jpVar3 = this.f1067g;
        this.f1067g = jpVar;
        if (jpVar != null) {
            jpVar.mo5307a(this.f1031N);
            jpVar.mo3510a(this);
        }
        C0269jx jxVar = this.f1068h;
        if (jxVar != null) {
            jxVar.mo5345a(jpVar3, this.f1067g);
        }
        C0275kc kcVar = this.f1041a;
        C0261jp jpVar4 = this.f1067g;
        kcVar.mo5393a();
        C0274kb d = kcVar.mo5403d();
        if (jpVar3 != null) {
            d.f9725b--;
        }
        if (d.f9725b == 0) {
            for (int i = 0; i < d.f9724a.size(); i++) {
                ((C0273ka) d.f9724a.valueAt(i)).f9721a.clear();
            }
        }
        if (jpVar4 != null) {
            d.f9725b++;
        }
        this.f1024D.f9764f = true;
        mo850c(false);
        requestLayout();
    }

    /* renamed from: a */
    public final void mo835a(C0285km kmVar, int i) {
        if (mo892l()) {
            kmVar.f9796n = i;
            this.f1059ar.add(kmVar);
            return;
        }
        C0107dx.m7196a(kmVar.f9783a, i);
    }

    public final void setClipToPadding(boolean z) {
        if (z != this.f1033P) {
            mo5625s();
        }
        this.f1033P = z;
        super.setClipToPadding(z);
        if (this.f1075o) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo832a(C0266ju juVar) {
        C0266ju juVar2 = this.f1084x;
        if (juVar2 != null) {
            juVar2.mo4196d();
            this.f1084x.f9704h = null;
        }
        this.f1084x = juVar;
        if (juVar != null) {
            juVar.f9704h = this.f1054am;
        }
    }

    /* renamed from: a */
    public final void mo824a(int i) {
        C0275kc kcVar = this.f1041a;
        kcVar.f9730e = i;
        kcVar.mo5397b();
    }

    /* renamed from: a */
    public final void mo833a(C0269jx jxVar) {
        if (jxVar != this.f1068h) {
            mo872e();
            if (this.f1068h != null) {
                C0266ju juVar = this.f1084x;
                if (juVar != null) {
                    juVar.mo4196d();
                }
                this.f1068h.mo5361b(this.f1041a);
                this.f1068h.mo5346a(this.f1041a);
                this.f1041a.mo5393a();
                this.f1068h.mo5337a((RecyclerView) null);
                this.f1068h = null;
            } else {
                this.f1041a.mo5393a();
            }
            C0206ho hoVar = this.f1063c;
            hoVar.f9492b.mo5183a();
            for (int size = hoVar.f9493c.size() - 1; size >= 0; size--) {
                hoVar.f9491a.mo5195b((View) hoVar.f9493c.get(size));
                hoVar.f9493c.remove(size);
            }
            C0259jn jnVar = (C0259jn) hoVar.f9491a;
            int a = jnVar.mo5191a();
            for (int i = 0; i < a; i++) {
                View b = jnVar.mo5194b(i);
                m1301c(b);
                b.clearAnimation();
            }
            jnVar.f9696a.removeAllViews();
            this.f1068h = jxVar;
            if (jxVar != null) {
                if (jxVar.f9709b == null) {
                    this.f1068h.mo5337a(this);
                } else {
                    throw new IllegalArgumentException("LayoutManager " + jxVar + " is already attached to a RecyclerView:" + jxVar.f9709b.mo822a());
                }
            }
            this.f1041a.mo5397b();
            requestLayout();
        }
    }

    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void setNestedScrollingEnabled(boolean z) {
        m1288C().mo4670a(z);
    }

    /* renamed from: b */
    public final void mo843b(int i) {
        if (i != this.f1085y) {
            this.f1085y = i;
            if (i != 2) {
                mo5622r();
            }
            List list = this.f1025E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    atc atc = (atc) this.f1025E.get(size);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo825a(int i, int i2) {
        mo861d(i, i2);
    }

    /* renamed from: d */
    public void mo861d(int i, int i2) {
        mo873e(i, i2);
    }

    /* renamed from: e */
    public final void mo873e(int i, int i2) {
        C0269jx jxVar = this.f1068h;
        if (jxVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1077q) {
            if (!jxVar.mo5366c()) {
                i = 0;
            }
            if (!this.f1068h.mo5370d()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f1021A.mo5424a(i, i2, Integer.MIN_VALUE, null);
            }
        }
    }

    /* renamed from: d */
    public void mo860d(int i) {
        if (!this.f1077q) {
            C0269jx jxVar = this.f1068h;
            if (jxVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                jxVar.mo5371e(i);
            }
        }
    }

    /* renamed from: d */
    public final void mo859d() {
        int i = this.f1035R + 1;
        this.f1035R = i;
        if (i == 1 && !this.f1077q) {
            this.f1076p = false;
        }
    }

    public final boolean startNestedScroll(int i) {
        return m1288C().mo4674a(i, 0);
    }

    /* renamed from: f */
    private final void m1304f(int i, int i2) {
        m1288C().mo4674a(i, i2);
    }

    /* renamed from: a */
    public final void mo838a(boolean z) {
        int i = this.f1035R;
        if (i <= 0) {
            this.f1035R = 1;
            i = 1;
        }
        if (!z && !this.f1077q) {
            this.f1076p = false;
        }
        if (i == 1) {
            if (z && this.f1076p && !this.f1077q && this.f1068h != null && this.f1067g != null) {
                m1312y();
            }
            if (!this.f1077q) {
                this.f1076p = false;
            }
        }
        this.f1035R--;
    }

    public final void stopNestedScroll() {
        m1288C().mo4678b(0);
    }

    /* renamed from: f */
    public final void mo875f(int i) {
        m1288C().mo4678b(i);
    }

    /* renamed from: e */
    public final void mo872e() {
        mo843b(0);
        mo5622r();
    }

    /* renamed from: r */
    private final void mo5622r() {
        C0282kj kjVar;
        this.f1021A.mo5425b();
        C0269jx jxVar = this.f1068h;
        if (jxVar != null && (kjVar = jxVar.f9710c) != null) {
            kjVar.mo5411a();
        }
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f1077q) {
            mo830a("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f1077q = false;
                if (!(!this.f1076p || this.f1068h == null || this.f1067g == null)) {
                    requestLayout();
                }
                this.f1076p = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1077q = true;
            this.f1036S = true;
            mo872e();
        }
    }
}
