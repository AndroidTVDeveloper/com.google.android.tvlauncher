package android.support.p001v4.widget;

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

/* renamed from: android.support.v4.widget.NestedScrollView */
/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements C0098do {

    /* renamed from: w */
    private static final C0123em f924w = new C0123em();

    /* renamed from: x */
    private static final int[] f925x = {16843130};

    /* renamed from: A */
    private float f926A;

    /* renamed from: a */
    private long f927a;

    /* renamed from: b */
    private final Rect f928b;

    /* renamed from: c */
    private OverScroller f929c;

    /* renamed from: d */
    private EdgeEffect f930d;

    /* renamed from: e */
    private EdgeEffect f931e;

    /* renamed from: f */
    private int f932f;

    /* renamed from: g */
    private boolean f933g;

    /* renamed from: h */
    private boolean f934h;

    /* renamed from: i */
    private View f935i;

    /* renamed from: j */
    private boolean f936j;

    /* renamed from: k */
    private VelocityTracker f937k;

    /* renamed from: l */
    private boolean f938l;

    /* renamed from: m */
    private boolean f939m;

    /* renamed from: n */
    private int f940n;

    /* renamed from: o */
    private int f941o;

    /* renamed from: p */
    private int f942p;

    /* renamed from: q */
    private int f943q;

    /* renamed from: r */
    private final int[] f944r;

    /* renamed from: s */
    private final int[] f945s;

    /* renamed from: t */
    private int f946t;

    /* renamed from: u */
    private int f947u;

    /* renamed from: v */
    private C0125eo f948v;

    /* renamed from: y */
    private final C0099dp f949y;

    /* renamed from: z */
    private final C0096dm f950z;

    /* renamed from: b */
    private static int m1225b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    public final boolean mo693a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f950z.f8789a;
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

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f928b = new Rect();
        this.f933g = true;
        this.f934h = false;
        this.f935i = null;
        this.f936j = false;
        this.f939m = true;
        this.f943q = -1;
        this.f944r = new int[2];
        this.f945s = new int[2];
        this.f929c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f940n = viewConfiguration.getScaledTouchSlop();
        this.f941o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f942p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f925x, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f938l) {
            this.f938l = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f949y = new C0099dp();
        this.f950z = new C0096dm(this);
        setNestedScrollingEnabled(true);
        C0107dx.m7200a(this, f924w);
    }

    /* renamed from: d */
    private final void m1230d() {
        this.f929c.abortAnimation();
        m1229c(1);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
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

    /* renamed from: f */
    private final boolean m1235f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !m1223a(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m1236g(height);
        } else {
            findNextFocus.getDrawingRect(this.f928b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f928b);
            m1236g(m1212a(this.f928b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1222a(findFocus)) {
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
        if (!this.f929c.isFinished()) {
            this.f929c.computeScrollOffset();
            int currY = this.f929c.getCurrY();
            int i = currY - this.f947u;
            this.f947u = currY;
            int[] iArr = this.f945s;
            iArr[1] = 0;
            m1221a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f945s[1];
            int a = mo688a();
            if (i2 != 0) {
                int scrollY = getScrollY();
                m1220a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f945s;
                iArr2[1] = 0;
                m1215a(scrollY2, i3, this.f944r, 1, iArr2);
                i2 = i3 - this.f945s[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && a > 0)) {
                    m1234f();
                    if (i2 < 0) {
                        if (this.f930d.isFinished()) {
                            this.f930d.onAbsorb((int) this.f929c.getCurrVelocity());
                        }
                    } else if (this.f931e.isFinished()) {
                        this.f931e.onAbsorb((int) this.f929c.getCurrVelocity());
                    }
                }
                m1230d();
            }
            if (!this.f929c.isFinished()) {
                C0107dx.m7207d(this);
            } else {
                m1229c(1);
            }
        }
    }

    /* renamed from: a */
    private final int m1212a(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = -(i4 - rect.bottom);
            } else {
                i = -(scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
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
        boolean z;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f928b.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    int i = 33;
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (!keyEvent.isShiftPressed()) {
                                    i = 130;
                                }
                                int height = getHeight();
                                if (i == 130) {
                                    this.f928b.top = getScrollY() + height;
                                    int childCount = getChildCount();
                                    if (childCount > 0) {
                                        View childAt2 = getChildAt(childCount - 1);
                                        int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                        if (this.f928b.top + height > bottom) {
                                            this.f928b.top = bottom - height;
                                        }
                                    }
                                } else {
                                    this.f928b.top = getScrollY() - height;
                                    if (this.f928b.top < 0) {
                                        this.f928b.top = 0;
                                    }
                                }
                                Rect rect = this.f928b;
                                rect.bottom = rect.top + height;
                                m1219a(i, this.f928b.top, this.f928b.bottom);
                            }
                        } else if (!keyEvent.isAltPressed()) {
                            z = m1235f(130);
                        } else {
                            z = m1233e(130);
                        }
                    } else if (!keyEvent.isAltPressed()) {
                        z = m1235f(33);
                    } else {
                        z = m1233e(33);
                    }
                    if (z) {
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

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f950z.mo4672a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f950z.mo4671a(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1221a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    private final boolean m1221a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f950z.mo4677a(i, i2, iArr, iArr2, i3);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f950z.mo4675a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    private final void m1215a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f950z.mo4676a(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* renamed from: g */
    private final void m1236g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f939m) {
            m1238i(i);
        } else {
            scrollBy(0, i);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f930d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f930d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f930d.setSize(width, height);
                if (this.f930d.draw(canvas)) {
                    C0107dx.m7207d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f931e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(mo688a(), scrollY) + height2;
                int i5 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft();
                }
                int i6 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f931e.setSize(width2, height2);
                if (this.f931e.draw(canvas)) {
                    C0107dx.m7207d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    private final void m1232e() {
        this.f936j = false;
        m1228c();
        m1229c(0);
        EdgeEffect edgeEffect = this.f930d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f931e.onRelease();
        }
    }

    /* renamed from: f */
    private final void m1234f() {
        if (getOverScrollMode() == 2) {
            this.f930d = null;
            this.f931e = null;
        } else if (this.f930d == null) {
            Context context = getContext();
            this.f930d = new EdgeEffect(context);
            this.f931e = new EdgeEffect(context);
        }
    }

    /* renamed from: h */
    private final void m1237h(int i) {
        if (getChildCount() > 0) {
            this.f929c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1217a(true);
        }
    }

    /* renamed from: e */
    private final boolean m1233e(int i) {
        int childCount;
        int height = getHeight();
        this.f928b.top = 0;
        this.f928b.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f928b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f928b;
            rect.top = rect.bottom - height;
        }
        return m1219a(i, this.f928b.top, this.f928b.bottom);
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
        return this.f949y.mo4681a();
    }

    /* renamed from: a */
    public final int mo688a() {
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
        return m1231d(0);
    }

    /* renamed from: d */
    private final boolean m1231d(int i) {
        return this.f950z.mo4673a(i);
    }

    /* renamed from: b */
    private final void m1226b() {
        if (this.f937k == null) {
            this.f937k = VelocityTracker.obtain();
        }
    }

    /* renamed from: a */
    private final boolean m1222a(View view) {
        return !m1223a(view, 0, getHeight());
    }

    /* renamed from: a */
    private static boolean m1224a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m1224a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m1223a(View view, int i, int i2) {
        view.getDrawingRect(this.f928b);
        offsetDescendantRectToMyCoords(view, this.f928b);
        return this.f928b.bottom + i >= getScrollY() && this.f928b.top - i <= getScrollY() + i2;
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f934h = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f936j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f = this.f926A;
                if (f == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.f926A = f;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int a = mo688a();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * f));
                if (i < 0) {
                    i = 0;
                } else if (i > a) {
                    i = a;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f936j) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f943q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f932f) > this.f940n && (2 & getNestedScrollAxes()) == 0) {
                                this.f936j = true;
                                this.f932f = y;
                                m1226b();
                                this.f937k.addMovement(motionEvent);
                                this.f946t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1216a(motionEvent);
                    }
                }
            }
            this.f936j = false;
            this.f943q = -1;
            m1228c();
            if (this.f929c.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo688a())) {
                C0107dx.m7207d(this);
            }
            m1229c(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f932f = y2;
                    this.f943q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f937k;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    } else {
                        this.f937k = VelocityTracker.obtain();
                    }
                    this.f937k.addMovement(motionEvent);
                    this.f929c.computeScrollOffset();
                    this.f936j = !this.f929c.isFinished();
                    m1218a(2, 0);
                }
            }
            this.f936j = false;
            m1228c();
        }
        return this.f936j;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f933g = false;
        View view = this.f935i;
        if (view != null && m1224a(view, this)) {
            m1227b(this.f935i);
        }
        this.f935i = null;
        if (!this.f934h) {
            if (this.f948v != null) {
                scrollTo(getScrollX(), this.f948v.f9155a);
                this.f948v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int b = m1225b(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f934h = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f938l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1237h((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo690a(i, i2, iArr, 0);
    }

    /* renamed from: a */
    public final void mo690a(int i, int i2, int[] iArr, int i3) {
        m1221a(i, i2, iArr, (int[]) null, i3);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1214a(i4, 0, (int[]) null);
    }

    /* renamed from: a */
    public final void mo691a(View view, int i, int i2, int i3, int i4, int i5) {
        m1214a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public final void mo692a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1214a(i4, i5, iArr);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo699b(view, view2, i, 0);
    }

    /* renamed from: b */
    public final void mo699b(View view, View view2, int i, int i2) {
        this.f949y.mo4682a(i, i2);
        m1218a(2, i2);
    }

    /* renamed from: a */
    private final void m1214a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f950z.mo4676a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view == null || m1222a(view)) {
            return false;
        }
        return view.requestFocus(i, rect);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0125eo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0125eo eoVar = (C0125eo) parcelable;
        super.onRestoreInstanceState(eoVar.getSuperState());
        this.f948v = eoVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C0125eo eoVar = new C0125eo(super.onSaveInstanceState());
        eoVar.f9155a = getScrollY();
        return eoVar;
    }

    /* renamed from: a */
    private final void m1216a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f943q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f932f = (int) motionEvent.getY(i);
            this.f943q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f937k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1223a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f928b);
            offsetDescendantRectToMyCoords(findFocus, this.f928b);
            m1236g(m1212a(this.f928b));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo693a(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo689a(0);
    }

    /* renamed from: a */
    public final void mo689a(int i) {
        C0099dp dpVar = this.f949y;
        if (i == 1) {
            dpVar.f9100b = 0;
        } else {
            dpVar.f9099a = 0;
        }
        m1229c(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r18.m1226b()
            int r0 = r19.getActionMasked()
            r8 = 0
            if (r0 != 0) goto L_0x0010
            r6.f946t = r8
        L_0x0010:
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r19)
            int r1 = r6.f946t
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
            r18.m1216a(r19)
            int r0 = r6.f943q
            int r0 = r7.findPointerIndex(r0)
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            r6.f932f = r0
            goto L_0x023a
        L_0x0041:
            int r0 = r19.getActionIndex()
            float r1 = r7.getY(r0)
            int r1 = (int) r1
            r6.f932f = r1
            int r0 = r7.getPointerId(r0)
            r6.f943q = r0
            goto L_0x023a
        L_0x0054:
            boolean r0 = r6.f936j
            if (r0 == 0) goto L_0x0079
            int r0 = r18.getChildCount()
            if (r0 <= 0) goto L_0x0079
            android.widget.OverScroller r11 = r6.f929c
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.mo688a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0079
            p000.C0107dx.m7207d(r18)
        L_0x0079:
            r6.f943q = r3
            r18.m1232e()
            goto L_0x023a
        L_0x0081:
            int r0 = r6.f943q
            int r11 = r7.findPointerIndex(r0)
            if (r11 != r3) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r6.f943q
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
            int r0 = r6.f932f
            int r0 = r0 - r12
            boolean r1 = r6.f936j
            if (r1 != 0) goto L_0x00d3
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.f940n
            if (r1 <= r2) goto L_0x00d3
            android.view.ViewParent r1 = r18.getParent()
            if (r1 == 0) goto L_0x00c5
            r1.requestDisallowInterceptTouchEvent(r10)
        L_0x00c5:
            r6.f936j = r10
            if (r0 > 0) goto L_0x00ce
            int r1 = r6.f940n
            int r0 = r0 + r1
            goto L_0x00d3
        L_0x00ce:
            int r1 = r6.f940n
            int r0 = r0 - r1
            r13 = r0
            goto L_0x00d4
        L_0x00d3:
            r13 = r0
        L_0x00d4:
            boolean r0 = r6.f936j
            if (r0 == 0) goto L_0x023a
            r1 = 0
            int[] r3 = r6.f945s
            int[] r4 = r6.f944r
            r5 = 0
            r0 = r18
            r2 = r13
            boolean r0 = r0.m1221a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f5
            int[] r0 = r6.f945s
            r0 = r0[r10]
            int r13 = r13 - r0
            int r0 = r6.f946t
            int[] r1 = r6.f944r
            r1 = r1[r10]
            int r0 = r0 + r1
            r6.f946t = r0
        L_0x00f5:
            int[] r0 = r6.f944r
            r0 = r0[r10]
            int r12 = r12 - r0
            r6.f932f = r12
            int r12 = r18.getScrollY()
            int r14 = r18.mo688a()
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
            boolean r0 = r6.m1220a(r13, r8, r0, r14)
            if (r0 == 0) goto L_0x0126
            boolean r0 = r6.m1231d(r8)
            if (r0 != 0) goto L_0x0126
            android.view.VelocityTracker r0 = r6.f937k
            r0.clear()
        L_0x0126:
            int r0 = r18.getScrollY()
            int r1 = r0 - r12
            int[] r5 = r6.f945s
            r5[r10] = r8
            int r2 = r13 - r1
            int[] r3 = r6.f944r
            r4 = 0
            r0 = r18
            r0.m1215a(r1, r2, r3, r4, r5)
            int r0 = r6.f932f
            int[] r1 = r6.f944r
            r1 = r1[r10]
            int r0 = r0 - r1
            r6.f932f = r0
            int r0 = r6.f946t
            int r0 = r0 + r1
            r6.f946t = r0
            if (r15 == 0) goto L_0x023a
            int[] r0 = r6.f945s
            r0 = r0[r10]
            int r13 = r13 - r0
            r18.m1234f()
            int r12 = r12 + r13
            if (r12 >= 0) goto L_0x017a
            android.widget.EdgeEffect r0 = r6.f930d
            float r1 = (float) r13
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r11)
            int r3 = r18.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            p000.C0122el.m7251a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.f931e
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0174
            goto L_0x01a2
        L_0x0174:
            android.widget.EdgeEffect r0 = r6.f931e
            r0.onRelease()
            goto L_0x01a2
        L_0x017a:
            if (r12 <= r14) goto L_0x01a2
            android.widget.EdgeEffect r0 = r6.f931e
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
            p000.C0122el.m7251a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.f930d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01a2
            android.widget.EdgeEffect r0 = r6.f930d
            r0.onRelease()
        L_0x01a2:
            android.widget.EdgeEffect r0 = r6.f930d
            if (r0 == 0) goto L_0x023a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01b4
            android.widget.EdgeEffect r0 = r6.f931e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
        L_0x01b4:
            p000.C0107dx.m7207d(r18)
            goto L_0x023a
        L_0x01b9:
            android.view.VelocityTracker r0 = r6.f937k
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r6.f942p
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r6.f943q
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r6.f941o
            if (r1 < r4) goto L_0x01e1
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r6.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x01fc
            r6.dispatchNestedFling(r2, r1, r10)
            r6.m1237h(r0)
            goto L_0x01fc
        L_0x01e1:
            android.widget.OverScroller r11 = r6.f929c
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.mo688a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x01fc
            p000.C0107dx.m7207d(r18)
        L_0x01fc:
            r6.f943q = r3
            r18.m1232e()
            goto L_0x023a
        L_0x0203:
            int r0 = r18.getChildCount()
            if (r0 == 0) goto L_0x0245
            android.widget.OverScroller r0 = r6.f929c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r10
            r6.f936j = r0
            if (r0 == 0) goto L_0x021f
            android.view.ViewParent r0 = r18.getParent()
            if (r0 != 0) goto L_0x021b
            goto L_0x021f
        L_0x021b:
            r0.requestDisallowInterceptTouchEvent(r10)
        L_0x021f:
            android.widget.OverScroller r0 = r6.f929c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x022a
            r18.m1230d()
        L_0x022a:
            float r0 = r19.getY()
            int r0 = (int) r0
            r6.f932f = r0
            int r0 = r7.getPointerId(r8)
            r6.f943q = r0
            r6.m1218a(r1, r8)
        L_0x023a:
            android.view.VelocityTracker r0 = r6.f937k
            if (r0 == 0) goto L_0x0241
            r0.addMovement(r9)
        L_0x0241:
            r9.recycle()
            return r10
        L_0x0245:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private final boolean m1220a(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i + i3;
        boolean z2 = i2 > 0 || i2 < 0;
        if (i5 > i4) {
            z = true;
        } else if (i5 >= 0) {
            i4 = i5;
            z = false;
        } else {
            z = true;
            i4 = 0;
        }
        if (z && !m1231d(1)) {
            this.f929c.springBack(0, i4, 0, 0, 0, mo688a());
        }
        super.scrollTo(0, i4);
        return z2 || z;
    }

    /* renamed from: c */
    private final void m1228c() {
        VelocityTracker velocityTracker = this.f937k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f937k = null;
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f933g) {
            m1227b(view2);
        } else {
            this.f935i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m1212a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m1238i(a);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1228c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f933g = true;
        super.requestLayout();
    }

    /* renamed from: a */
    private final void m1217a(boolean z) {
        if (z) {
            m1218a(2, 1);
        } else {
            m1229c(1);
        }
        this.f947u = getScrollY();
        C0107dx.m7207d(this);
    }

    /* renamed from: a */
    private final boolean m1219a(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i9 = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i9 >= size) {
                break;
            }
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                if (i6 < top && bottom < i7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view == null) {
                    view = view2;
                    z3 = z2;
                } else {
                    boolean z4 = i5 == 33 ? top < view.getTop() : bottom > view.getBottom();
                    if (z3) {
                        if (z2) {
                            if (!z4) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z3 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
            i9++;
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            if (i5 != 33) {
                i4 = i7 - i8;
            } else {
                i4 = i6 - scrollY;
            }
            m1236g(i4);
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z;
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = m1225b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = m1225b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    /* renamed from: b */
    private final void m1227b(View view) {
        view.getDrawingRect(this.f928b);
        offsetDescendantRectToMyCoords(view, this.f928b);
        int a = m1212a(this.f928b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f950z.mo4670a(z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v4.widget.NestedScrollView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v4.widget.NestedScrollView.a(int, int, int[]):void
      android.support.v4.widget.NestedScrollView.a(int, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(android.view.View, int, int):boolean
      android.support.v4.widget.NestedScrollView.a(int, int, boolean):void */
    /* renamed from: i */
    private final void m1238i(int i) {
        m1213a(0, i, false);
    }

    /* renamed from: a */
    private final void m1213a(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f927a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.f929c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom)))) - scrollY);
                m1217a(z);
            } else {
                if (!this.f929c.isFinished()) {
                    m1230d();
                }
                scrollBy(i, i2);
            }
            this.f927a = AnimationUtils.currentAnimationTimeMillis();
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
    /* renamed from: b */
    public final void mo698b(int i) {
        m1213a(-getScrollX(), i - getScrollY(), true);
    }

    public final boolean startNestedScroll(int i) {
        return m1218a(i, 0);
    }

    /* renamed from: a */
    private final boolean m1218a(int i, int i2) {
        return this.f950z.mo4674a(i, i2);
    }

    public final void stopNestedScroll() {
        m1229c(0);
    }

    /* renamed from: c */
    private final void m1229c(int i) {
        this.f950z.mo4678b(i);
    }
}
