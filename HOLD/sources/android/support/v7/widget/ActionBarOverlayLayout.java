package android.support.v7.widget;

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

/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements dn, C0000do {
    private static final int[] s = {R.attr.actionBarSize, 16842841};
    public ActionBarContainer a;
    public boolean b;
    public ViewPropertyAnimator c;
    public final AnimatorListenerAdapter d;
    private int e;
    private ContentFrameLayout f;
    private Drawable g;
    private boolean h;
    private int i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final Rect p;
    private final Runnable q;
    private final Runnable r;
    private final dp t;

    public final void a(int i2) {
    }

    public final void a(int i2, int i3, int[] iArr, int i4) {
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
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
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.d = new gf(this);
        this.q = new gg(this);
        this.r = new gh(this);
        a(context);
        this.t = new dp();
    }

    private static final boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        gi giVar = (gi) view.getLayoutParams();
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
        return layoutParams instanceof gi;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g != null && !this.h) {
            int bottom = this.a.getVisibility() == 0 ? (int) (((float) this.a.getBottom()) + this.a.getTranslationY() + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
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
            r6.b()
            defpackage.dx.i(r6)
            android.support.v7.widget.ActionBarContainer r0 = r6.a
            r1 = 0
            boolean r0 = a(r0, r7, r1)
            android.graphics.Rect r2 = r6.m
            r2.set(r7)
            android.graphics.Rect r7 = r6.m
            android.graphics.Rect r2 = r6.j
            java.lang.reflect.Method r3 = defpackage.ln.a
            r4 = 1
            if (r3 != 0) goto L_0x001c
            goto L_0x002a
        L_0x001c:
            java.lang.reflect.Method r3 = defpackage.ln.a     // Catch:{ Exception -> 0x0029 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0029 }
            r5[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r5[r4] = r2     // Catch:{ Exception -> 0x0029 }
            r3.invoke(r6, r5)     // Catch:{ Exception -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            android.graphics.Rect r7 = r6.n
            android.graphics.Rect r1 = r6.m
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x003d
            android.graphics.Rect r7 = r6.n
            android.graphics.Rect r0 = r6.m
            r7.set(r0)
            r0 = 1
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            android.graphics.Rect r7 = r6.k
            android.graphics.Rect r1 = r6.j
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0050
            android.graphics.Rect r7 = r6.k
            android.graphics.Rect r0 = r6.j
            r7.set(r0)
            goto L_0x0052
        L_0x0050:
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            r6.requestLayout()
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gi();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gi(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gi(layoutParams);
    }

    public final int getNestedScrollAxes() {
        return this.t.a();
    }

    public final void a() {
        removeCallbacks(this.q);
        removeCallbacks(this.r);
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private final void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(s);
        boolean z = false;
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.h = z;
        new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        dx.j(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                gi giVar = (gi) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = giVar.leftMargin + paddingLeft;
                int i8 = giVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        b();
        measureChildWithMargins(this.a, i2, 0, i3, 0);
        gi giVar = (gi) this.a.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.a.getMeasuredWidth() + giVar.leftMargin + giVar.rightMargin);
        int max2 = Math.max(0, this.a.getMeasuredHeight() + giVar.topMargin + giVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.a.getMeasuredState());
        int i5 = dx.i(this) & 256;
        if (i5 != 0) {
            i4 = this.e;
        } else if (this.a.getVisibility() != 8) {
            i4 = this.a.getMeasuredHeight();
        }
        this.l.set(this.j);
        this.o.set(this.m);
        if (i5 == 0) {
            this.l.top += i4;
            Rect rect = this.l;
            rect.bottom = rect.bottom;
        } else {
            this.o.top += i4;
            Rect rect2 = this.o;
            rect2.bottom = rect2.bottom;
        }
        a(this.f, this.l, true);
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            this.f.fitSystemWindows(this.o);
        }
        measureChildWithMargins(this.f, i2, 0, i3, 0);
        gi giVar2 = (gi) this.f.getLayoutParams();
        int max3 = Math.max(max, this.f.getMeasuredWidth() + giVar2.leftMargin + giVar2.rightMargin);
        int max4 = Math.max(max2, this.f.getMeasuredHeight() + giVar2.topMargin + giVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.i + i3;
        this.i = i6;
        a();
        this.a.setTranslationY((float) (-Math.max(0, Math.min(i6, this.a.getHeight()))));
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        int i3 = 0;
        this.t.a(i2, 0);
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer != null) {
            i3 = -((int) actionBarContainer.getTranslationY());
        }
        this.i = i3;
        a();
    }

    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.a.getVisibility() == 0) {
        }
        return false;
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public final void onWindowSystemUiVisibilityChanged(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i2);
        b();
    }

    private final void b() {
        if (this.f == null) {
            this.f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof hp) {
                hp hpVar = (hp) findViewById;
            } else if (findViewById instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.p == null) {
                    toolbar.p = new li(toolbar);
                }
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
        }
    }
}
