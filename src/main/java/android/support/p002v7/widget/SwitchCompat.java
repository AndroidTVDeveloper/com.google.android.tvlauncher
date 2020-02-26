package android.support.p002v7.widget;

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

/* renamed from: android.support.v7.widget.SwitchCompat */
/* compiled from: PG */
public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    private static final int[] f1088O = {16842912};

    /* renamed from: d */
    private static final Property f1089d = new C0293ku(Float.class, "thumbPos");

    /* renamed from: A */
    private int f1090A;

    /* renamed from: B */
    private int f1091B;

    /* renamed from: C */
    private int f1092C;

    /* renamed from: D */
    private int f1093D;

    /* renamed from: E */
    private int f1094E;

    /* renamed from: F */
    private int f1095F;

    /* renamed from: G */
    private final TextPaint f1096G;

    /* renamed from: H */
    private ColorStateList f1097H;

    /* renamed from: I */
    private Layout f1098I;

    /* renamed from: J */
    private Layout f1099J;

    /* renamed from: K */
    private TransformationMethod f1100K;

    /* renamed from: L */
    private ObjectAnimator f1101L;

    /* renamed from: M */
    private final C0201hj f1102M;

    /* renamed from: N */
    private final Rect f1103N;

    /* renamed from: a */
    public CharSequence f1104a;

    /* renamed from: b */
    public CharSequence f1105b;

    /* renamed from: c */
    public float f1106c;

    /* renamed from: e */
    private Drawable f1107e;

    /* renamed from: f */
    private ColorStateList f1108f;

    /* renamed from: g */
    private PorterDuff.Mode f1109g;

    /* renamed from: h */
    private boolean f1110h;

    /* renamed from: i */
    private boolean f1111i;

    /* renamed from: j */
    private Drawable f1112j;

    /* renamed from: k */
    private ColorStateList f1113k;

    /* renamed from: l */
    private PorterDuff.Mode f1114l;

    /* renamed from: m */
    private boolean f1115m;

    /* renamed from: n */
    private boolean f1116n;

    /* renamed from: o */
    private int f1117o;

    /* renamed from: p */
    private int f1118p;

    /* renamed from: q */
    private int f1119q;

    /* renamed from: r */
    private boolean f1120r;

    /* renamed from: s */
    private boolean f1121s;

    /* renamed from: t */
    private int f1122t;

    /* renamed from: u */
    private int f1123u;

    /* renamed from: v */
    private float f1124v;

    /* renamed from: w */
    private float f1125w;

    /* renamed from: x */
    private VelocityTracker f1126x;

    /* renamed from: y */
    private int f1127y;

    /* renamed from: z */
    private int f1128z;

    /* renamed from: a */
    private final boolean m1364a() {
        return this.f1106c > 0.5f;
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
    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface typeface2;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        this.f1108f = null;
        this.f1109g = null;
        this.f1110h = false;
        this.f1111i = false;
        this.f1113k = null;
        this.f1114l = null;
        this.f1115m = false;
        this.f1116n = false;
        this.f1126x = VelocityTracker.obtain();
        this.f1103N = new Rect();
        boolean z = true;
        this.f1096G = new TextPaint(1);
        this.f1096G.density = getResources().getDisplayMetrics().density;
        C0298kz a = C0298kz.m7865a(context, attributeSet, C0128er.f9179q, i);
        Drawable a2 = a.mo5512a(2);
        this.f1107e = a2;
        if (a2 != null) {
            a2.setCallback(this);
        }
        Drawable a3 = a.mo5512a(11);
        this.f1112j = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        this.f1104a = a.mo5516b(0);
        this.f1105b = a.mo5516b(1);
        this.f1121s = a.mo5514a(3, true);
        this.f1117o = a.mo5519d(8, 0);
        this.f1118p = a.mo5519d(5, 0);
        this.f1119q = a.mo5519d(6, 0);
        this.f1120r = a.mo5514a(4, false);
        ColorStateList d = a.mo5520d(9);
        if (d != null) {
            this.f1108f = d;
            this.f1110h = true;
        }
        PorterDuff.Mode a4 = C0220ib.m7558a(a.mo5511a(10, -1), null);
        if (this.f1109g != a4) {
            this.f1109g = a4;
            this.f1111i = true;
        }
        boolean z2 = this.f1110h;
        if ((z2 || this.f1111i) && (drawable2 = this.f1107e) != null && (z2 || this.f1111i)) {
            int i3 = Build.VERSION.SDK_INT;
            Drawable mutate = drawable2.mutate();
            this.f1107e = mutate;
            if (this.f1110h) {
                C0045bq.m3945a(mutate, this.f1108f);
            }
            if (this.f1111i) {
                C0045bq.m3946a(this.f1107e, this.f1109g);
            }
            if (this.f1107e.isStateful()) {
                this.f1107e.setState(getDrawableState());
            }
        }
        ColorStateList d2 = a.mo5520d(12);
        if (d2 != null) {
            this.f1113k = d2;
            this.f1115m = true;
        }
        PorterDuff.Mode a5 = C0220ib.m7558a(a.mo5511a(13, -1), null);
        if (this.f1114l != a5) {
            this.f1114l = a5;
            this.f1116n = true;
        }
        boolean z3 = this.f1115m;
        if ((z3 || this.f1116n) && (drawable = this.f1112j) != null && (z3 || this.f1116n)) {
            int i4 = Build.VERSION.SDK_INT;
            Drawable mutate2 = drawable.mutate();
            this.f1112j = mutate2;
            if (this.f1115m) {
                C0045bq.m3945a(mutate2, this.f1113k);
            }
            if (this.f1116n) {
                C0045bq.m3946a(this.f1112j, this.f1114l);
            }
            if (this.f1112j.isStateful()) {
                this.f1112j.setState(getDrawableState());
            }
        }
        int e = a.mo5521e(7, 0);
        if (e != 0) {
            C0298kz a6 = C0298kz.m7863a(context, e, C0128er.f9180r);
            ColorStateList d3 = a6.mo5520d(3);
            if (d3 != null) {
                this.f1097H = d3;
            } else {
                this.f1097H = getTextColors();
            }
            int d4 = a6.mo5519d(0, 0);
            if (d4 != 0) {
                float f = (float) d4;
                if (f != this.f1096G.getTextSize()) {
                    this.f1096G.setTextSize(f);
                    requestLayout();
                }
            }
            int a7 = a6.mo5511a(1, -1);
            int a8 = a6.mo5511a(2, -1);
            if (a7 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (a7 != 2) {
                typeface = a7 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f2 = 0.0f;
            if (a8 <= 0) {
                this.f1096G.setFakeBoldText(false);
                this.f1096G.setTextSkewX(0.0f);
                m1363a(typeface);
            } else {
                if (typeface != null) {
                    typeface2 = Typeface.create(typeface, a8);
                } else {
                    typeface2 = Typeface.defaultFromStyle(a8);
                }
                m1363a(typeface2);
                if (typeface2 != null) {
                    i2 = typeface2.getStyle();
                } else {
                    i2 = 0;
                }
                int i5 = (i2 ^ -1) & a8;
                this.f1096G.setFakeBoldText((i5 & 1) == 0 ? false : z);
                this.f1096G.setTextSkewX((2 & i5) != 0 ? -0.25f : f2);
            }
            if (a6.mo5514a(14, false)) {
                this.f1100K = new C0132ev(getContext());
            } else {
                this.f1100K = null;
            }
            a6.mo5513a();
        }
        C0201hj hjVar = new C0201hj(this);
        this.f1102M = hjVar;
        hjVar.mo5139a(attributeSet, i);
        a.mo5513a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1123u = viewConfiguration.getScaledTouchSlop();
        this.f1127y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1103N;
        int i3 = this.f1092C;
        int i4 = this.f1093D;
        int i5 = this.f1094E;
        int i6 = this.f1095F;
        int b = m1365b() + i3;
        Drawable drawable = this.f1107e;
        if (drawable == null) {
            rect = C0220ib.f9549a;
        } else {
            rect = C0220ib.m7559a(drawable);
        }
        Drawable drawable2 = this.f1112j;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            b += rect2.left;
            if (rect == null) {
                i = i4;
            } else {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f1112j.setBounds(i3, i, i5, i2);
                }
            }
            i2 = i6;
            this.f1112j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1107e;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = b - rect2.left;
            int i8 = b + this.f1091B + rect2.right;
            this.f1107e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0045bq.m3944a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1107e;
        if (drawable != null) {
            C0045bq.m3942a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1112j;
        if (drawable2 != null) {
            C0045bq.m3942a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1107e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1112j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final int getCompoundPaddingLeft() {
        if (!C0313ln.m7906a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1128z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1119q : compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (C0313ln.m7906a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1128z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1119q : compoundPaddingRight;
    }

    /* renamed from: b */
    private final int m1365b() {
        float f;
        if (C0313ln.m7906a(this)) {
            f = 1.0f - this.f1106c;
        } else {
            f = this.f1106c;
        }
        return (int) ((f * ((float) m1366c())) + 0.5f);
    }

    /* renamed from: c */
    private final int m1366c() {
        Rect rect;
        Drawable drawable = this.f1112j;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1103N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1107e;
        if (drawable2 == null) {
            rect = C0220ib.f9549a;
        } else {
            rect = C0220ib.m7559a(drawable2);
        }
        return ((((this.f1128z - this.f1091B) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1107e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1112j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1101L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1101L.end();
            this.f1101L = null;
        }
    }

    /* renamed from: a */
    private final Layout m1362a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1100K;
        CharSequence transformation = transformationMethod == null ? charSequence : transformationMethod.getTransformation(charSequence, this);
        TextPaint textPaint = this.f1096G;
        return new StaticLayout(transformation, textPaint, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1088O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1103N;
        Drawable drawable = this.f1112j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1093D;
        int i3 = this.f1095F;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1107e;
        if (drawable != null) {
            if (this.f1120r && drawable2 != null) {
                Rect a = C0220ib.m7559a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
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
        Layout layout = !m1364a() ? this.f1099J : this.f1098I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1097H;
            if (colorStateList != null) {
                this.f1096G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1096G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
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
            charSequence = this.f1105b;
        } else {
            charSequence = this.f1104a;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1107e != null) {
            Rect rect = this.f1103N;
            Drawable drawable = this.f1112j;
            if (drawable == null) {
                rect.setEmpty();
            } else {
                drawable.getPadding(rect);
            }
            Rect a = C0220ib.m7559a(this.f1107e);
            i5 = Math.max(0, a.left - rect.left);
            i10 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0313ln.m7906a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1128z + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.f1128z) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i11 = this.f1090A;
            i9 = (((paddingTop + height) - paddingBottom) / 2) - (i11 / 2);
            i8 = i9 + i11;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1090A + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1090A;
        }
        this.f1092C = i7;
        this.f1093D = i9;
        this.f1095F = i8;
        this.f1094E = i6;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1121s) {
            if (this.f1098I == null) {
                this.f1098I = m1362a(this.f1104a);
            }
            if (this.f1099J == null) {
                this.f1099J = m1362a(this.f1105b);
            }
        }
        Rect rect = this.f1103N;
        Drawable drawable = this.f1107e;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1107e.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1107e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1121s) {
            int max = Math.max(this.f1098I.getWidth(), this.f1099J.getWidth());
            int i7 = this.f1117o;
            i5 = max + i7 + i7;
        } else {
            i5 = 0;
        }
        this.f1091B = Math.max(i5, i4);
        Drawable drawable2 = this.f1112j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f1112j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1107e;
        if (drawable3 != null) {
            Rect a = C0220ib.m7559a(drawable3);
            i8 = Math.max(i8, a.left);
            i9 = Math.max(i9, a.right);
        }
        int i10 = this.f1118p;
        int i11 = this.f1091B;
        int max2 = Math.max(i10, i11 + i11 + i8 + i9);
        int max3 = Math.max(i6, i3);
        this.f1128z = max2;
        this.f1090A = max3;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!isChecked()) {
            charSequence = this.f1105b;
        } else {
            charSequence = this.f1104a;
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
            android.view.VelocityTracker r0 = r9.f1126x
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
            int r0 = r9.f1122t
            if (r0 == r1) goto L_0x005f
            if (r0 == r3) goto L_0x001f
            goto L_0x015a
        L_0x001f:
            float r10 = r10.getX()
            int r0 = r9.m1366c()
            float r2 = r9.f1124v
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
            boolean r2 = p000.C0313ln.m7906a(r9)
            if (r2 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            float r0 = -r0
        L_0x0044:
            float r2 = r9.f1106c
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
            r9.f1124v = r10
            r9.mo932a(r0)
        L_0x005e:
            return r1
        L_0x005f:
            float r0 = r10.getX()
            float r2 = r10.getY()
            float r4 = r9.f1124v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.f1123u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0085
            float r4 = r9.f1125w
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r9.f1123u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x015a
        L_0x0085:
            r9.f1122t = r3
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r1)
            r9.f1124v = r0
            r9.f1125w = r2
            return r1
        L_0x0094:
            int r0 = r9.f1122t
            r5 = 0
            if (r0 == r3) goto L_0x00a2
            r9.f1122t = r5
            android.view.VelocityTracker r0 = r9.f1126x
            r0.clear()
            goto L_0x015a
        L_0x00a2:
            r9.f1122t = r5
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
            android.view.VelocityTracker r0 = r9.f1126x
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r9.f1126x
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r9.f1127y
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e8
            boolean r6 = p000.C0313ln.m7906a(r9)
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
            boolean r0 = r9.m1364a()
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
            android.graphics.drawable.Drawable r3 = r9.f1107e
            if (r3 == 0) goto L_0x015a
            int r3 = r9.m1365b()
            android.graphics.drawable.Drawable r4 = r9.f1107e
            android.graphics.Rect r5 = r9.f1103N
            r4.getPadding(r5)
            int r4 = r9.f1093D
            int r5 = r9.f1123u
            int r4 = r4 - r5
            int r6 = r9.f1092C
            int r6 = r6 + r3
            int r6 = r6 - r5
            int r3 = r9.f1091B
            android.graphics.Rect r5 = r9.f1103N
            int r5 = r5.left
            android.graphics.Rect r7 = r9.f1103N
            int r7 = r7.right
            int r8 = r9.f1123u
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r3 = r3 + r7
            int r3 = r3 + r8
            int r5 = r9.f1095F
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
            r9.f1122t = r1
            r9.f1124v = r0
            r9.f1125w = r2
        L_0x015a:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 0.0f;
        if (getWindowToken() != null && C0107dx.m7217n(this)) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1089d, f);
            this.f1101L = ofFloat;
            ofFloat.setDuration(250L);
            int i = Build.VERSION.SDK_INT;
            this.f1101L.setAutoCancel(true);
            this.f1101L.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f1101L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        mo932a(f);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0194hc.m7484a(this, callback));
    }

    /* renamed from: a */
    private final void m1363a(Typeface typeface) {
        if ((this.f1096G.getTypeface() != null && !this.f1096G.getTypeface().equals(typeface)) || (this.f1096G.getTypeface() == null && typeface != null)) {
            this.f1096G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo932a(float f) {
        this.f1106c = f;
        invalidate();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1107e || drawable == this.f1112j;
    }
}
