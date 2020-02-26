package android.support.p002v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import com.google.android.tvlauncher.R;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements C0097dn, C0098do {

    /* renamed from: s */
    private static final int[] f986s = {R.attr.actionBarSize, 16842841};

    /* renamed from: a */
    public ActionBarContainer f987a;

    /* renamed from: b */
    public boolean f988b;

    /* renamed from: c */
    public ViewPropertyAnimator f989c;

    /* renamed from: d */
    public final AnimatorListenerAdapter f990d;

    /* renamed from: e */
    private int f991e;

    /* renamed from: f */
    private ContentFrameLayout f992f;

    /* renamed from: g */
    private Drawable f993g;

    /* renamed from: h */
    private boolean f994h;

    /* renamed from: i */
    private int f995i;

    /* renamed from: j */
    private final Rect f996j;

    /* renamed from: k */
    private final Rect f997k;

    /* renamed from: l */
    private final Rect f998l;

    /* renamed from: m */
    private final Rect f999m;

    /* renamed from: n */
    private final Rect f1000n;

    /* renamed from: o */
    private final Rect f1001o;

    /* renamed from: p */
    private final Rect f1002p;

    /* renamed from: q */
    private final Runnable f1003q;

    /* renamed from: r */
    private final Runnable f1004r;

    /* renamed from: t */
    private final C0099dp f1005t;

    /* renamed from: a */
    public final void mo689a(int i) {
    }

    /* renamed from: a */
    public final void mo690a(int i, int i2, int[] iArr, int i3) {
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onStopNestedScroll(View view) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f996j = new Rect();
        this.f997k = new Rect();
        this.f998l = new Rect();
        this.f999m = new Rect();
        this.f1000n = new Rect();
        this.f1001o = new Rect();
        this.f1002p = new Rect();
        this.f990d = new C0170gf(this);
        this.f1003q = new C0171gg(this);
        this.f1004r = new C0172gh(this);
        m1263a(context);
        this.f1005t = new C0099dp();
    }

    /* renamed from: a */
    private static final boolean m1264a(View view, Rect rect, boolean z) {
        boolean z2;
        C0173gi giVar = (C0173gi) view.getLayoutParams();
        if (giVar.leftMargin != rect.left) {
            giVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (giVar.topMargin != rect.top) {
            giVar.topMargin = rect.top;
            z2 = true;
        }
        if (giVar.rightMargin != rect.right) {
            giVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || giVar.bottomMargin == rect.bottom) {
            return z2;
        }
        giVar.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0173gi;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f993g != null && !this.f994h) {
            int bottom = this.f987a.getVisibility() == 0 ? (int) (((float) this.f987a.getBottom()) + this.f987a.getTranslationY() + 0.5f) : 0;
            this.f993g.setBounds(0, bottom, getWidth(), this.f993g.getIntrinsicHeight() + bottom);
            this.f993g.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean fitSystemWindows(android.graphics.Rect r7) {
        /*
            r6 = this;
            r6.m1265b()
            p000.C0107dx.m7212i(r6)
            android.support.v7.widget.ActionBarContainer r0 = r6.f987a
            r1 = 0
            boolean r0 = m1264a(r0, r7, r1)
            android.graphics.Rect r2 = r6.f999m
            r2.set(r7)
            android.graphics.Rect r7 = r6.f999m
            android.graphics.Rect r2 = r6.f996j
            java.lang.reflect.Method r3 = p000.C0313ln.f9862a
            r4 = 1
            if (r3 != 0) goto L_0x001c
            goto L_0x002a
        L_0x001c:
            java.lang.reflect.Method r3 = p000.C0313ln.f9862a     // Catch:{ Exception -> 0x0029 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0029 }
            r5[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r5[r4] = r2     // Catch:{ Exception -> 0x0029 }
            r3.invoke(r6, r5)     // Catch:{ Exception -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            android.graphics.Rect r7 = r6.f1000n
            android.graphics.Rect r1 = r6.f999m
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x003d
            android.graphics.Rect r7 = r6.f1000n
            android.graphics.Rect r0 = r6.f999m
            r7.set(r0)
            r0 = 1
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            android.graphics.Rect r7 = r6.f997k
            android.graphics.Rect r1 = r6.f996j
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0050
            android.graphics.Rect r7 = r6.f997k
            android.graphics.Rect r0 = r6.f996j
            r7.set(r0)
            goto L_0x0052
        L_0x0050:
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            r6.requestLayout()
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0173gi();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0173gi(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0173gi(layoutParams);
    }

    public final int getNestedScrollAxes() {
        return this.f1005t.mo4681a();
    }

    /* renamed from: a */
    public final void mo785a() {
        removeCallbacks(this.f1003q);
        removeCallbacks(this.f1004r);
        ViewPropertyAnimator viewPropertyAnimator = this.f989c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: a */
    private final void m1263a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f986s);
        boolean z = false;
        this.f991e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f993g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f994h = z;
        new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1263a(getContext());
        C0107dx.m7213j(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo785a();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0173gi giVar = (C0173gi) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = giVar.leftMargin + paddingLeft;
                int i7 = giVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m1265b();
        measureChildWithMargins(this.f987a, i, 0, i2, 0);
        C0173gi giVar = (C0173gi) this.f987a.getLayoutParams();
        int i3 = 0;
        int max = Math.max(0, this.f987a.getMeasuredWidth() + giVar.leftMargin + giVar.rightMargin);
        int max2 = Math.max(0, this.f987a.getMeasuredHeight() + giVar.topMargin + giVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f987a.getMeasuredState());
        int i4 = C0107dx.m7212i(this) & 256;
        if (i4 != 0) {
            i3 = this.f991e;
        } else if (this.f987a.getVisibility() != 8) {
            i3 = this.f987a.getMeasuredHeight();
        }
        this.f998l.set(this.f996j);
        this.f1001o.set(this.f999m);
        if (i4 == 0) {
            this.f998l.top += i3;
            Rect rect = this.f998l;
            rect.bottom = rect.bottom;
        } else {
            this.f1001o.top += i3;
            Rect rect2 = this.f1001o;
            rect2.bottom = rect2.bottom;
        }
        m1264a(this.f992f, this.f998l, true);
        if (!this.f1002p.equals(this.f1001o)) {
            this.f1002p.set(this.f1001o);
            this.f992f.fitSystemWindows(this.f1001o);
        }
        measureChildWithMargins(this.f992f, i, 0, i2, 0);
        C0173gi giVar2 = (C0173gi) this.f992f.getLayoutParams();
        int max3 = Math.max(max, this.f992f.getMeasuredWidth() + giVar2.leftMargin + giVar2.rightMargin);
        int max4 = Math.max(max2, this.f992f.getMeasuredHeight() + giVar2.topMargin + giVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f992f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f995i + i2;
        this.f995i = i5;
        mo785a();
        this.f987a.setTranslationY((float) (-Math.max(0, Math.min(i5, this.f987a.getHeight()))));
    }

    /* renamed from: a */
    public final void mo691a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo692a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo691a(view, i, i2, i3, i4, i5);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        int i2 = 0;
        this.f1005t.mo4682a(i, 0);
        ActionBarContainer actionBarContainer = this.f987a;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        }
        this.f995i = i2;
        mo785a();
    }

    /* renamed from: b */
    public final void mo699b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f987a.getVisibility() == 0) {
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo693a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        m1265b();
    }

    /* renamed from: b */
    private final void m1265b() {
        if (this.f992f == null) {
            this.f992f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f987a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0207hp) {
                C0207hp hpVar = (C0207hp) findViewById;
            } else if (findViewById instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.f1154p == null) {
                    toolbar.f1154p = new C0308li(toolbar);
                }
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
        }
    }
}
