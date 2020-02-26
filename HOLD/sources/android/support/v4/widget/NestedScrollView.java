package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements C0000do {
    private static final em w = new em();
    private static final int[] x = {16843130};
    private float A;
    private long a;
    private final Rect b;
    private OverScroller c;
    private EdgeEffect d;
    private EdgeEffect e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private boolean j;
    private VelocityTracker k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int[] r;
    private final int[] s;
    private int t;
    private int u;
    private eo v;
    private final dp y;
    private final dm z;

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.z.a;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new Rect();
        this.g = true;
        this.h = false;
        this.i = null;
        this.j = false;
        this.m = true;
        this.q = -1;
        this.r = new int[2];
        this.s = new int[2];
        this.c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x, i2, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        if (z2 != this.l) {
            this.l = z2;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.y = new dp();
        this.z = new dm(this);
        setNestedScrollingEnabled(true);
        dx.a(this, w);
    }

    private final void d() {
        this.c.abortAnimation();
        c(1);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    private final boolean f(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !a(findNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            g(height);
        } else {
            findNextFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findNextFocus, this.b);
            g(a(this.b));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        if (!this.c.isFinished()) {
            this.c.computeScrollOffset();
            int currY = this.c.getCurrY();
            int i2 = currY - this.u;
            this.u = currY;
            int[] iArr = this.s;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.s[1];
            int a2 = a();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(i3, getScrollX(), scrollY, a2);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.s;
                iArr2[1] = 0;
                a(scrollY2, i4, this.r, 1, iArr2);
                i3 = i4 - this.s[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && a2 > 0)) {
                    f();
                    if (i3 < 0) {
                        if (this.d.isFinished()) {
                            this.d.onAbsorb((int) this.c.getCurrVelocity());
                        }
                    } else if (this.e.isFinished()) {
                        this.e.onAbsorb((int) this.c.getCurrVelocity());
                    }
                }
                d();
            }
            if (!this.c.isFinished()) {
                dx.d(this);
            } else {
                c(1);
            }
        }
    }

    private final int a(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = -(i5 - rect.bottom);
            } else {
                i2 = -(scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.b.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    int i2 = 33;
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (!keyEvent.isShiftPressed()) {
                                    i2 = 130;
                                }
                                int height = getHeight();
                                if (i2 == 130) {
                                    this.b.top = getScrollY() + height;
                                    int childCount = getChildCount();
                                    if (childCount > 0) {
                                        View childAt2 = getChildAt(childCount - 1);
                                        int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                        if (this.b.top + height > bottom) {
                                            this.b.top = bottom - height;
                                        }
                                    }
                                } else {
                                    this.b.top = getScrollY() - height;
                                    if (this.b.top < 0) {
                                        this.b.top = 0;
                                    }
                                }
                                Rect rect = this.b;
                                rect.bottom = rect.top + height;
                                a(i2, this.b.top, this.b.bottom);
                            }
                        } else if (!keyEvent.isAltPressed()) {
                            z2 = f(130);
                        } else {
                            z2 = e(130);
                        }
                    } else if (!keyEvent.isAltPressed()) {
                        z2 = f(33);
                    } else {
                        z2 = e(33);
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.z.a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.z.a(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    private final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.z.a(i2, i3, iArr, iArr2, i4);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.z.a(i2, i3, i4, i5, iArr);
    }

    private final void a(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.z.a(0, i2, 0, i3, iArr, i4, iArr2);
    }

    private final void g(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.m) {
            i(i2);
        } else {
            scrollBy(0, i2);
        }
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.d != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i4 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft();
                } else {
                    i2 = 0;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.d.setSize(width, height);
                if (this.d.draw(canvas)) {
                    dx.d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(a(), scrollY) + height2;
                int i6 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = getPaddingLeft();
                }
                int i7 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.e.setSize(width2, height2);
                if (this.e.draw(canvas)) {
                    dx.d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    private final void e() {
        this.j = false;
        c();
        c(0);
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.e.onRelease();
        }
    }

    private final void f() {
        if (getOverScrollMode() == 2) {
            this.d = null;
            this.e = null;
        } else if (this.d == null) {
            Context context = getContext();
            this.d = new EdgeEffect(context);
            this.e = new EdgeEffect(context);
        }
    }

    private final void h(int i2) {
        if (getChildCount() > 0) {
            this.c.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    private final boolean e(int i2) {
        int childCount;
        int height = getHeight();
        this.b.top = 0;
        this.b.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.b;
            rect.top = rect.bottom - height;
        }
        return a(i2, this.b.top, this.b.bottom);
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    public final int a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean hasNestedScrollingParent() {
        return d(0);
    }

    private final boolean d(int i2) {
        return this.z.a(i2);
    }

    private final void b() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    private final boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private final boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        return this.b.bottom + i2 >= getScrollY() && this.b.top - i2 <= getScrollY() + i3;
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f2 = this.A;
                if (f2 == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f2 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.A = f2;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int a2 = a();
                int scrollY = getScrollY();
                int i2 = scrollY - ((int) (axisValue * f2));
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > a2) {
                    i2 = a2;
                }
                if (i2 != scrollY) {
                    super.scrollTo(getScrollX(), i2);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.j) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.q;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f) > this.n && (2 & getNestedScrollAxes()) == 0) {
                                this.j = true;
                                this.f = y2;
                                b();
                                this.k.addMovement(motionEvent);
                                this.t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.j = false;
            this.q = -1;
            c();
            if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                dx.d(this);
            }
            c(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f = y3;
                    this.q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.k;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    } else {
                        this.k = VelocityTracker.obtain();
                    }
                    this.k.addMovement(motionEvent);
                    this.c.computeScrollOffset();
                    this.j = !this.c.isFinished();
                    a(2, 0);
                }
            }
            this.j = false;
            c();
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.g = false;
        View view = this.i;
        if (view != null && a(view, this)) {
            b(this.i);
        }
        this.i = null;
        if (!this.h) {
            if (this.v != null) {
                scrollTo(getScrollX(), this.v.a);
                this.v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, ((i5 - i3) - paddingTop) - paddingBottom, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.h = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.l && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        h((int) f3);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(i2, i3, iArr, 0);
    }

    public final void a(int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    public final void b(View view, View view2, int i2, int i3) {
        this.y.a(i2, i3);
        a(2, i3);
    }

    private final void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.a(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view == null || a(view)) {
            return false;
        }
        return view.requestFocus(i2, rect);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eo eoVar = (eo) parcelable;
        super.onRestoreInstanceState(eoVar.getSuperState());
        this.v = eoVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        eo eoVar = new eo(super.onSaveInstanceState());
        eoVar.a = getScrollY();
        return eoVar;
    }

    private final void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f = (int) motionEvent.getY(i2);
            this.q = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findFocus, this.b);
            g(a(this.b));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        a(0);
    }

    public final void a(int i2) {
        dp dpVar = this.y;
        if (i2 == 1) {
            dpVar.b = 0;
        } else {
            dpVar.a = 0;
        }
        c(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r18.b()
            int r0 = r19.getActionMasked()
            r8 = 0
            if (r0 != 0) goto L_0x0010
            r6.t = r8
        L_0x0010:
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r19)
            int r1 = r6.t
            float r1 = (float) r1
            r2 = 0
            r9.offsetLocation(r2, r1)
            r1 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0203
            r3 = -1
            if (r0 == r10) goto L_0x01b9
            if (r0 == r1) goto L_0x0081
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x023a
        L_0x002f:
            r18.a(r19)
            int r0 = r6.q
            int r0 = r7.findPointerIndex(r0)
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            r6.f = r0
            goto L_0x023a
        L_0x0041:
            int r0 = r19.getActionIndex()
            float r1 = r7.getY(r0)
            int r1 = (int) r1
            r6.f = r1
            int r0 = r7.getPointerId(r0)
            r6.q = r0
            goto L_0x023a
        L_0x0054:
            boolean r0 = r6.j
            if (r0 == 0) goto L_0x0079
            int r0 = r18.getChildCount()
            if (r0 <= 0) goto L_0x0079
            android.widget.OverScroller r11 = r6.c
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0079
            defpackage.dx.d(r18)
        L_0x0079:
            r6.q = r3
            r18.e()
            goto L_0x023a
        L_0x0081:
            int r0 = r6.q
            int r11 = r7.findPointerIndex(r0)
            if (r11 != r3) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r6.q
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x023a
        L_0x00a8:
            float r0 = r7.getY(r11)
            int r12 = (int) r0
            int r0 = r6.f
            int r0 = r0 - r12
            boolean r1 = r6.j
            if (r1 != 0) goto L_0x00d3
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.n
            if (r1 <= r2) goto L_0x00d3
            android.view.ViewParent r1 = r18.getParent()
            if (r1 == 0) goto L_0x00c5
            r1.requestDisallowInterceptTouchEvent(r10)
        L_0x00c5:
            r6.j = r10
            if (r0 > 0) goto L_0x00ce
            int r1 = r6.n
            int r0 = r0 + r1
            goto L_0x00d3
        L_0x00ce:
            int r1 = r6.n
            int r0 = r0 - r1
            r13 = r0
            goto L_0x00d4
        L_0x00d3:
            r13 = r0
        L_0x00d4:
            boolean r0 = r6.j
            if (r0 == 0) goto L_0x023a
            r1 = 0
            int[] r3 = r6.s
            int[] r4 = r6.r
            r5 = 0
            r0 = r18
            r2 = r13
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f5
            int[] r0 = r6.s
            r0 = r0[r10]
            int r13 = r13 - r0
            int r0 = r6.t
            int[] r1 = r6.r
            r1 = r1[r10]
            int r0 = r0 + r1
            r6.t = r0
        L_0x00f5:
            int[] r0 = r6.r
            r0 = r0[r10]
            int r12 = r12 - r0
            r6.f = r12
            int r12 = r18.getScrollY()
            int r14 = r18.a()
            int r0 = r18.getOverScrollMode()
            if (r0 != 0) goto L_0x010c
        L_0x010a:
            r15 = 1
            goto L_0x0111
        L_0x010c:
            if (r0 != r10) goto L_0x0110
            if (r14 > 0) goto L_0x010a
        L_0x0110:
            r15 = 0
        L_0x0111:
            int r0 = r18.getScrollY()
            boolean r0 = r6.a(r13, r8, r0, r14)
            if (r0 == 0) goto L_0x0126
            boolean r0 = r6.d(r8)
            if (r0 != 0) goto L_0x0126
            android.view.VelocityTracker r0 = r6.k
            r0.clear()
        L_0x0126:
            int r0 = r18.getScrollY()
            int r1 = r0 - r12
            int[] r5 = r6.s
            r5[r10] = r8
            int r2 = r13 - r1
            int[] r3 = r6.r
            r4 = 0
            r0 = r18
            r0.a(r1, r2, r3, r4, r5)
            int r0 = r6.f
            int[] r1 = r6.r
            r1 = r1[r10]
            int r0 = r0 - r1
            r6.f = r0
            int r0 = r6.t
            int r0 = r0 + r1
            r6.t = r0
            if (r15 == 0) goto L_0x023a
            int[] r0 = r6.s
            r0 = r0[r10]
            int r13 = r13 - r0
            r18.f()
            int r12 = r12 + r13
            if (r12 >= 0) goto L_0x017a
            android.widget.EdgeEffect r0 = r6.d
            float r1 = (float) r13
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r11)
            int r3 = r18.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            defpackage.el.a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.e
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0174
            goto L_0x01a2
        L_0x0174:
            android.widget.EdgeEffect r0 = r6.e
            r0.onRelease()
            goto L_0x01a2
        L_0x017a:
            if (r12 <= r14) goto L_0x01a2
            android.widget.EdgeEffect r0 = r6.e
            float r1 = (float) r13
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7.getX(r11)
            int r4 = r18.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            defpackage.el.a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01a2
            android.widget.EdgeEffect r0 = r6.d
            r0.onRelease()
        L_0x01a2:
            android.widget.EdgeEffect r0 = r6.d
            if (r0 == 0) goto L_0x023a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01b4
            android.widget.EdgeEffect r0 = r6.e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
        L_0x01b4:
            defpackage.dx.d(r18)
            goto L_0x023a
        L_0x01b9:
            android.view.VelocityTracker r0 = r6.k
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r6.p
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r6.q
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r6.o
            if (r1 < r4) goto L_0x01e1
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r6.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x01fc
            r6.dispatchNestedFling(r2, r1, r10)
            r6.h(r0)
            goto L_0x01fc
        L_0x01e1:
            android.widget.OverScroller r11 = r6.c
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x01fc
            defpackage.dx.d(r18)
        L_0x01fc:
            r6.q = r3
            r18.e()
            goto L_0x023a
        L_0x0203:
            int r0 = r18.getChildCount()
            if (r0 == 0) goto L_0x0245
            android.widget.OverScroller r0 = r6.c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r10
            r6.j = r0
            if (r0 == 0) goto L_0x021f
            android.view.ViewParent r0 = r18.getParent()
            if (r0 != 0) goto L_0x021b
            goto L_0x021f
        L_0x021b:
            r0.requestDisallowInterceptTouchEvent(r10)
        L_0x021f:
            android.widget.OverScroller r0 = r6.c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x022a
            r18.d()
        L_0x022a:
            float r0 = r19.getY()
            int r0 = (int) r0
            r6.f = r0
            int r0 = r7.getPointerId(r8)
            r6.q = r0
            r6.a(r1, r8)
        L_0x023a:
            android.view.VelocityTracker r0 = r6.k
            if (r0 == 0) goto L_0x0241
            r0.addMovement(r9)
        L_0x0241:
            r9.recycle()
            return r10
        L_0x0245:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final boolean a(int i2, int i3, int i4, int i5) {
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i2 + i4;
        boolean z3 = i3 > 0 || i3 < 0;
        if (i6 > i5) {
            z2 = true;
        } else if (i6 >= 0) {
            i5 = i6;
            z2 = false;
        } else {
            z2 = true;
            i5 = 0;
        }
        if (z2 && !d(1)) {
            this.c.springBack(0, i5, 0, 0, 0, a());
        }
        super.scrollTo(0, i5);
        return z3 || z2;
    }

    private final void c() {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k = null;
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.g) {
            b(view2);
        } else {
            this.i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                i(a2);
            }
        }
        return z3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        this.g = true;
        super.requestLayout();
    }

    private final void a(boolean z2) {
        if (z2) {
            a(2, 1);
        } else {
            c(1);
        }
        this.u = getScrollY();
        dx.d(this);
    }

    private final boolean a(int i2, int i3, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            z2 = true;
            if (i10 >= size) {
                break;
            }
            View view2 = (View) focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                if (i7 < top && bottom < i8) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z4 = z3;
                } else {
                    boolean z5 = i6 == 33 ? top < view.getTop() : bottom > view.getBottom();
                    if (z4) {
                        if (z3) {
                            if (!z5) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z4 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
            i10++;
        }
        if (view == null) {
            view = this;
        }
        if (i7 < scrollY || i8 > i9) {
            if (i6 != 33) {
                i5 = i8 - i9;
            } else {
                i5 = i7 - scrollY;
            }
            g(i5);
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i6);
        }
        return z2;
    }

    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b3 = b(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    private final void b(View view) {
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        int a2 = a(this.b);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    public final void setNestedScrollingEnabled(boolean z2) {
        this.z.a(z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v4.widget.NestedScrollView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v4.widget.NestedScrollView.a(int, int, int[]):void
      android.support.v4.widget.NestedScrollView.a(int, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(android.view.View, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(int, int, boolean):void */
    private final void i(int i2) {
        a(0, i2, false);
    }

    private final void a(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i4 = layoutParams.topMargin;
                int i5 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY);
                a(z2);
            } else {
                if (!this.c.isFinished()) {
                    d();
                }
                scrollBy(i2, i3);
            }
            this.a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v4.widget.NestedScrollView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v4.widget.NestedScrollView.a(int, int, int[]):void
      android.support.v4.widget.NestedScrollView.a(int, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(android.view.View, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(int, int, boolean):void */
    public final void b(int i2) {
        a(-getScrollX(), i2 - getScrollY(), true);
    }

    public final boolean startNestedScroll(int i2) {
        return a(i2, 0);
    }

    private final boolean a(int i2, int i3) {
        return this.z.a(i2, i3);
    }

    public final void stopNestedScroll() {
        c(0);
    }

    private final void c(int i2) {
        this.z.b(i2);
    }
}
