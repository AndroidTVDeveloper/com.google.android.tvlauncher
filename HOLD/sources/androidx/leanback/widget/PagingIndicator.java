package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class PagingIndicator extends View {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private static final Property b = new ob(Float.class, "alpha");
    private static final Property c = new oc(Float.class, "diameter");
    private static final Property d = new od(Float.class, "translation_x");
    private boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int[] l;
    private int[] m;
    private int[] n;
    private final Paint o;
    private final Paint p;
    private final AnimatorSet q;
    private final AnimatorSet r;
    private final AnimatorSet s;
    private Bitmap t;
    private Paint u;

    private final int d() {
        int i2 = this.f;
        int i3 = this.j;
        return i2 + i2 + i3 + i3 + (this.g * -3);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
    }

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z;
        this.s = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.b, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ly.b, attributeSet, obtainStyledAttributes, i2, 0);
        }
        this.f = a(obtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        int a2 = a(obtainStyledAttributes, 2, R.dimen.lb_page_indicator_arrow_radius);
        this.i = a2;
        this.h = a2 + a2;
        this.g = a(obtainStyledAttributes, 5, R.dimen.lb_page_indicator_dot_gap);
        this.j = a(obtainStyledAttributes, 4, R.dimen.lb_page_indicator_arrow_gap);
        int b2 = b(obtainStyledAttributes, 3, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.o = paint;
        paint.setColor(b2);
        b(obtainStyledAttributes, 0, R.color.lb_page_indicator_arrow_background);
        if (this.u == null && obtainStyledAttributes.hasValue(1)) {
            int color = obtainStyledAttributes.getColor(1, 0);
            if (this.u == null) {
                this.u = new Paint();
            }
            this.u.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        obtainStyledAttributes.recycle();
        if (resources.getConfiguration().getLayoutDirection() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        this.k = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.p = new Paint(1);
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        this.p.setShadowLayer((float) this.k, dimensionPixelSize, dimensionPixelSize, color2);
        this.t = a();
        new Rect(0, 0, this.t.getWidth(), this.t.getHeight());
        this.t.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        this.q = animatorSet;
        int i3 = this.f;
        int i4 = this.i;
        animatorSet.playTogether(a(0.0f, 1.0f), b((float) (i3 + i3), (float) (i4 + i4)), b());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        int i5 = this.i;
        int i6 = this.f;
        animatorSet2.playTogether(a(1.0f, 0.0f), b((float) (i5 + i5), (float) (i6 + i6)), b());
        this.s.playTogether(this.q, this.r);
        setLayerType(1, null);
    }

    private final void c() {
        int paddingLeft = getPaddingLeft();
        getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int d2 = d();
        int i2 = (paddingLeft + (width - paddingRight)) / 2;
        int[] iArr = new int[0];
        this.l = iArr;
        int[] iArr2 = new int[0];
        this.m = iArr2;
        int[] iArr3 = new int[0];
        this.n = iArr3;
        if (this.e) {
            int i3 = (i2 - (d2 / 2)) + this.f;
            int i4 = this.g;
            int i5 = this.j;
            iArr[0] = (i3 - i4) + i5;
            iArr2[0] = i3;
            iArr3[0] = (i3 - (i4 + i4)) + i5 + i5;
        } else {
            int i6 = (i2 + (d2 / 2)) - this.f;
            int i7 = this.g;
            int i8 = this.j;
            iArr[0] = (i6 + i7) - i8;
            iArr2[0] = i6;
            iArr3[0] = (i6 + (i7 + i7)) - (i8 + i8);
        }
        throw null;
    }

    private static final Animator a(float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, b, f2, f3);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(a);
        return ofFloat;
    }

    private static final Animator b(float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, c, f2, f3);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(a);
        return ofFloat;
    }

    private final Animator b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, d, (float) ((-this.j) + this.g), 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(a);
        return ofFloat;
    }

    private final int b(TypedArray typedArray, int i2, int i3) {
        return typedArray.getColor(i2, getResources().getColor(i3));
    }

    private final int a(TypedArray typedArray, int i2, int i3) {
        return typedArray.getDimensionPixelOffset(i2, getResources().getDimensionPixelOffset(i3));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    private final Bitmap a() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.e) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int paddingTop = getPaddingTop() + this.h + getPaddingBottom() + this.k;
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, View.MeasureSpec.getSize(i3));
        } else if (mode == 1073741824) {
            paddingTop = View.MeasureSpec.getSize(i3);
        }
        int paddingLeft = getPaddingLeft() + d() + getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, View.MeasureSpec.getSize(i2));
        } else if (mode2 == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public final void onRtlPropertiesChanged(int i2) {
        boolean z;
        super.onRtlPropertiesChanged(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.e != z) {
            this.e = z;
            this.t = a();
            c();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        setMeasuredDimension(i2, i3);
        c();
    }
}
