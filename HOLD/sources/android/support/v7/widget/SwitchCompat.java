package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SwitchCompat extends CompoundButton {
    private static final int[] O = {16842912};
    private static final Property d = new ku(Float.class, "thumbPos");
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    private ObjectAnimator L;
    private final hj M;
    private final Rect N;
    public CharSequence a;
    public CharSequence b;
    public float c;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    private int z;

    private final boolean a() {
        return this.c > 0.5f;
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Typeface typeface;
        Typeface typeface2;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.x = VelocityTracker.obtain();
        this.N = new Rect();
        boolean z2 = true;
        this.G = new TextPaint(1);
        this.G.density = getResources().getDisplayMetrics().density;
        kz a2 = kz.a(context, attributeSet, er.q, i2);
        Drawable a3 = a2.a(2);
        this.e = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        Drawable a4 = a2.a(11);
        this.j = a4;
        if (a4 != null) {
            a4.setCallback(this);
        }
        this.a = a2.b(0);
        this.b = a2.b(1);
        this.s = a2.a(3, true);
        this.o = a2.d(8, 0);
        this.p = a2.d(5, 0);
        this.q = a2.d(6, 0);
        this.r = a2.a(4, false);
        ColorStateList d2 = a2.d(9);
        if (d2 != null) {
            this.f = d2;
            this.h = true;
        }
        PorterDuff.Mode a5 = ib.a(a2.a(10, -1), null);
        if (this.g != a5) {
            this.g = a5;
            this.i = true;
        }
        boolean z3 = this.h;
        if ((z3 || this.i) && (drawable2 = this.e) != null && (z3 || this.i)) {
            int i4 = Build.VERSION.SDK_INT;
            Drawable mutate = drawable2.mutate();
            this.e = mutate;
            if (this.h) {
                bq.a(mutate, this.f);
            }
            if (this.i) {
                bq.a(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList d3 = a2.d(12);
        if (d3 != null) {
            this.k = d3;
            this.m = true;
        }
        PorterDuff.Mode a6 = ib.a(a2.a(13, -1), null);
        if (this.l != a6) {
            this.l = a6;
            this.n = true;
        }
        boolean z4 = this.m;
        if ((z4 || this.n) && (drawable = this.j) != null && (z4 || this.n)) {
            int i5 = Build.VERSION.SDK_INT;
            Drawable mutate2 = drawable.mutate();
            this.j = mutate2;
            if (this.m) {
                bq.a(mutate2, this.k);
            }
            if (this.n) {
                bq.a(this.j, this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int e2 = a2.e(7, 0);
        if (e2 != 0) {
            kz a7 = kz.a(context, e2, er.r);
            ColorStateList d4 = a7.d(3);
            if (d4 != null) {
                this.H = d4;
            } else {
                this.H = getTextColors();
            }
            int d5 = a7.d(0, 0);
            if (d5 != 0) {
                float f2 = (float) d5;
                if (f2 != this.G.getTextSize()) {
                    this.G.setTextSize(f2);
                    requestLayout();
                }
            }
            int a8 = a7.a(1, -1);
            int a9 = a7.a(2, -1);
            if (a8 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (a8 != 2) {
                typeface = a8 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f3 = 0.0f;
            if (a9 <= 0) {
                this.G.setFakeBoldText(false);
                this.G.setTextSkewX(0.0f);
                a(typeface);
            } else {
                if (typeface != null) {
                    typeface2 = Typeface.create(typeface, a9);
                } else {
                    typeface2 = Typeface.defaultFromStyle(a9);
                }
                a(typeface2);
                if (typeface2 != null) {
                    i3 = typeface2.getStyle();
                } else {
                    i3 = 0;
                }
                int i6 = (i3 ^ -1) & a9;
                this.G.setFakeBoldText((i6 & 1) == 0 ? false : z2);
                this.G.setTextSkewX((2 & i6) != 0 ? -0.25f : f3);
            }
            if (a7.a(14, false)) {
                this.K = new ev(getContext());
            } else {
                this.K = null;
            }
            a7.a();
        }
        hj hjVar = new hj(this);
        this.M = hjVar;
        hjVar.a(attributeSet, i2);
        a2.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.N;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        int b2 = b() + i4;
        Drawable drawable = this.e;
        if (drawable == null) {
            rect = ib.a;
        } else {
            rect = ib.a(drawable);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            b2 += rect2.left;
            if (rect == null) {
                i2 = i5;
            } else {
                if (rect.left > rect2.left) {
                    i4 += rect.left - rect2.left;
                }
                i2 = rect.top > rect2.top ? (rect.top - rect2.top) + i5 : i5;
                if (rect.right > rect2.right) {
                    i6 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i3 = i7 - (rect.bottom - rect2.bottom);
                    this.j.setBounds(i4, i2, i6, i3);
                }
            }
            i3 = i7;
            this.j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i8 = b2 - rect2.left;
            int i9 = b2 + this.B + rect2.right;
            this.e.setBounds(i8, i5, i9, i7);
            Drawable background = getBackground();
            if (background != null) {
                bq.a(background, i8, i5, i9, i7);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        int i2 = Build.VERSION.SDK_INT;
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.e;
        if (drawable != null) {
            bq.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            bq.a(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final int getCompoundPaddingLeft() {
        if (!ln.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (ln.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    private final int b() {
        float f2;
        if (ln.a(this)) {
            f2 = 1.0f - this.c;
        } else {
            f2 = this.c;
        }
        return (int) ((f2 * ((float) c())) + 0.5f);
    }

    private final int c() {
        Rect rect;
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.e;
        if (drawable2 == null) {
            rect = ib.a;
        } else {
            rect = ib.a(drawable2);
        }
        return ((((this.z - this.B) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    private final Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        CharSequence transformation = transformationMethod == null ? charSequence : transformationMethod.getTransformation(charSequence, this);
        TextPaint textPaint = this.G;
        return new StaticLayout(transformation, textPaint, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.D;
        int i4 = this.F;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (this.r && drawable2 != null) {
                Rect a2 = ib.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = !a() ? this.J : this.I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (!isChecked()) {
            charSequence = this.b;
        } else {
            charSequence = this.a;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (!TextUtils.isEmpty(text)) {
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
                return;
            }
            accessibilityNodeInfo.setText(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z2, i2, i3, i4, i5);
        int i11 = 0;
        if (this.e != null) {
            Rect rect = this.N;
            Drawable drawable = this.j;
            if (drawable == null) {
                rect.setEmpty();
            } else {
                drawable.getPadding(rect);
            }
            Rect a2 = ib.a(this.e);
            i6 = Math.max(0, a2.left - rect.left);
            i11 = Math.max(0, a2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (ln.a(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.z + i8) - i6) - i11;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i11;
            i8 = (i7 - this.z) + i6 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i12 = this.A;
            i10 = (((paddingTop + height) - paddingBottom) / 2) - (i12 / 2);
            i9 = i10 + i12;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.A + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.A;
        }
        this.C = i8;
        this.D = i10;
        this.F = i9;
        this.E = i7;
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.s) {
            if (this.I == null) {
                this.I = a(this.a);
            }
            if (this.J == null) {
                this.J = a(this.b);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.e;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.e.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (this.s) {
            int max = Math.max(this.I.getWidth(), this.J.getWidth());
            int i8 = this.o;
            i6 = max + i8 + i8;
        } else {
            i6 = 0;
        }
        this.B = Math.max(i6, i5);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect a2 = ib.a(drawable3);
            i9 = Math.max(i9, a2.left);
            i10 = Math.max(i10, a2.right);
        }
        int i11 = this.p;
        int i12 = this.B;
        int max2 = Math.max(i11, i12 + i12 + i9 + i10);
        int max3 = Math.max(i7, i4);
        this.z = max2;
        this.A = max3;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!isChecked()) {
            charSequence = this.b;
        } else {
            charSequence = this.a;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 != 3) goto L_0x015a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.x
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0107
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r1) goto L_0x0094
            if (r0 == r3) goto L_0x0017
            if (r0 == r2) goto L_0x0094
            goto L_0x015a
        L_0x0017:
            int r0 = r9.t
            if (r0 == r1) goto L_0x005f
            if (r0 == r3) goto L_0x001f
            goto L_0x015a
        L_0x001f:
            float r10 = r10.getX()
            int r0 = r9.c()
            float r2 = r9.v
            float r2 = r10 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r0 = r2 / r0
            goto L_0x003c
        L_0x0033:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x003a
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003c
        L_0x003a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x003c:
            boolean r2 = defpackage.ln.a(r9)
            if (r2 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            float r0 = -r0
        L_0x0044:
            float r2 = r9.c
            float r0 = r0 + r2
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x0054
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005e
            r9.v = r10
            r9.a(r0)
        L_0x005e:
            return r1
        L_0x005f:
            float r0 = r10.getX()
            float r2 = r10.getY()
            float r4 = r9.v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0085
            float r4 = r9.w
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x015a
        L_0x0085:
            r9.t = r3
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r1)
            r9.v = r0
            r9.w = r2
            return r1
        L_0x0094:
            int r0 = r9.t
            r5 = 0
            if (r0 == r3) goto L_0x00a2
            r9.t = r5
            android.view.VelocityTracker r0 = r9.x
            r0.clear()
            goto L_0x015a
        L_0x00a2:
            r9.t = r5
            int r0 = r10.getAction()
            if (r0 != r1) goto L_0x00b5
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00b3
            r0 = 1
            goto L_0x00b6
        L_0x00b3:
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            boolean r3 = r9.isChecked()
            if (r0 == 0) goto L_0x00ed
            android.view.VelocityTracker r0 = r9.x
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r9.x
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r9.y
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e8
            boolean r6 = defpackage.ln.a(r9)
            if (r6 != 0) goto L_0x00e0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00df
            goto L_0x00e4
        L_0x00df:
            goto L_0x00e6
        L_0x00e0:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
        L_0x00e4:
            r0 = 1
            goto L_0x00ee
        L_0x00e6:
            r0 = 0
            goto L_0x00ee
        L_0x00e8:
            boolean r0 = r9.a()
            goto L_0x00ee
        L_0x00ed:
            r0 = r3
        L_0x00ee:
            if (r0 == r3) goto L_0x00f3
            r9.playSoundEffect(r5)
        L_0x00f3:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r2)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r1
        L_0x0107:
            float r0 = r10.getX()
            float r2 = r10.getY()
            boolean r3 = r9.isEnabled()
            if (r3 == 0) goto L_0x015a
            android.graphics.drawable.Drawable r3 = r9.e
            if (r3 == 0) goto L_0x015a
            int r3 = r9.b()
            android.graphics.drawable.Drawable r4 = r9.e
            android.graphics.Rect r5 = r9.N
            r4.getPadding(r5)
            int r4 = r9.D
            int r5 = r9.u
            int r4 = r4 - r5
            int r6 = r9.C
            int r6 = r6 + r3
            int r6 = r6 - r5
            int r3 = r9.B
            android.graphics.Rect r5 = r9.N
            int r5 = r5.left
            android.graphics.Rect r7 = r9.N
            int r7 = r7.right
            int r8 = r9.u
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r3 = r3 + r7
            int r3 = r3 + r8
            int r5 = r9.F
            int r5 = r5 + r8
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x015a
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x015a
            float r3 = (float) r4
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x015a
            float r3 = (float) r5
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x015a
            r9.t = r1
            r9.v = r0
            r9.w = r2
        L_0x015a:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        float f2 = 0.0f;
        if (getWindowToken() != null && dx.n(this)) {
            if (isChecked) {
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, d, f2);
            this.L = ofFloat;
            ofFloat.setDuration(250L);
            int i2 = Build.VERSION.SDK_INT;
            this.L.setAutoCancel(true);
            this.L.start();
            return;
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        a(f2);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }

    private final void a(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public final void a(float f2) {
        this.c = f2;
        invalidate();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }
}
