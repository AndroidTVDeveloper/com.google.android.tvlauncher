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

    /* renamed from: a */
    private static final TimeInterpolator f1212a = new DecelerateInterpolator();

    /* renamed from: b */
    private static final Property f1213b = new C0382ob(Float.class, "alpha");

    /* renamed from: c */
    private static final Property f1214c = new C0383oc(Float.class, "diameter");

    /* renamed from: d */
    private static final Property f1215d = new C0384od(Float.class, "translation_x");

    /* renamed from: e */
    private boolean f1216e;

    /* renamed from: f */
    private final int f1217f;

    /* renamed from: g */
    private final int f1218g;

    /* renamed from: h */
    private final int f1219h;

    /* renamed from: i */
    private final int f1220i;

    /* renamed from: j */
    private final int f1221j;

    /* renamed from: k */
    private final int f1222k;

    /* renamed from: l */
    private int[] f1223l;

    /* renamed from: m */
    private int[] f1224m;

    /* renamed from: n */
    private int[] f1225n;

    /* renamed from: o */
    private final Paint f1226o;

    /* renamed from: p */
    private final Paint f1227p;

    /* renamed from: q */
    private final AnimatorSet f1228q;

    /* renamed from: r */
    private final AnimatorSet f1229r;

    /* renamed from: s */
    private final AnimatorSet f1230s;

    /* renamed from: t */
    private Bitmap f1231t;

    /* renamed from: u */
    private Paint f1232u;

    /* renamed from: d */
    private final int m1419d() {
        int i = this.f1217f;
        int i2 = this.f1221j;
        return i + i + i2 + i2 + (this.f1218g * -3);
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

    public PagingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        this.f1230s = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9932b, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9932b, attributeSet, obtainStyledAttributes, i, 0);
        }
        this.f1217f = m1412a(obtainStyledAttributes, 6, R.dimen.lb_page_indicator_dot_radius);
        int a = m1412a(obtainStyledAttributes, 2, R.dimen.lb_page_indicator_arrow_radius);
        this.f1220i = a;
        this.f1219h = a + a;
        this.f1218g = m1412a(obtainStyledAttributes, 5, R.dimen.lb_page_indicator_dot_gap);
        this.f1221j = m1412a(obtainStyledAttributes, 4, R.dimen.lb_page_indicator_arrow_gap);
        int b = m1415b(obtainStyledAttributes, 3, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.f1226o = paint;
        paint.setColor(b);
        m1415b(obtainStyledAttributes, 0, R.color.lb_page_indicator_arrow_background);
        if (this.f1232u == null && obtainStyledAttributes.hasValue(1)) {
            int color = obtainStyledAttributes.getColor(1, 0);
            if (this.f1232u == null) {
                this.f1232u = new Paint();
            }
            this.f1232u.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        obtainStyledAttributes.recycle();
        if (resources.getConfiguration().getLayoutDirection() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1216e = z;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        this.f1222k = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.f1227p = new Paint(1);
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        this.f1227p.setShadowLayer((float) this.f1222k, dimensionPixelSize, dimensionPixelSize, color2);
        this.f1231t = m1414a();
        new Rect(0, 0, this.f1231t.getWidth(), this.f1231t.getHeight());
        this.f1231t.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1228q = animatorSet;
        int i2 = this.f1217f;
        int i3 = this.f1220i;
        animatorSet.playTogether(m1413a(0.0f, 1.0f), m1417b((float) (i2 + i2), (float) (i3 + i3)), m1416b());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f1229r = animatorSet2;
        int i4 = this.f1220i;
        int i5 = this.f1217f;
        animatorSet2.playTogether(m1413a(1.0f, 0.0f), m1417b((float) (i4 + i4), (float) (i5 + i5)), m1416b());
        this.f1230s.playTogether(this.f1228q, this.f1229r);
        setLayerType(1, null);
    }

    /* renamed from: c */
    private final void m1418c() {
        int paddingLeft = getPaddingLeft();
        getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int d = m1419d();
        int i = (paddingLeft + (width - paddingRight)) / 2;
        int[] iArr = new int[0];
        this.f1223l = iArr;
        int[] iArr2 = new int[0];
        this.f1224m = iArr2;
        int[] iArr3 = new int[0];
        this.f1225n = iArr3;
        if (this.f1216e) {
            int i2 = (i - (d / 2)) + this.f1217f;
            int i3 = this.f1218g;
            int i4 = this.f1221j;
            iArr[0] = (i2 - i3) + i4;
            iArr2[0] = i2;
            iArr3[0] = (i2 - (i3 + i3)) + i4 + i4;
        } else {
            int i5 = (i + (d / 2)) - this.f1217f;
            int i6 = this.f1218g;
            int i7 = this.f1221j;
            iArr[0] = (i5 + i6) - i7;
            iArr2[0] = i5;
            iArr3[0] = (i5 + (i6 + i6)) - (i7 + i7);
        }
        throw null;
    }

    /* renamed from: a */
    private static final Animator m1413a(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f1213b, f, f2);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(f1212a);
        return ofFloat;
    }

    /* renamed from: b */
    private static final Animator m1417b(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f1214c, f, f2);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f1212a);
        return ofFloat;
    }

    /* renamed from: b */
    private final Animator m1416b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f1215d, (float) ((-this.f1221j) + this.f1218g), 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f1212a);
        return ofFloat;
    }

    /* renamed from: b */
    private final int m1415b(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, getResources().getColor(i2));
    }

    /* renamed from: a */
    private final int m1412a(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, getResources().getDimensionPixelOffset(i2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    private final Bitmap m1414a() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.f1216e) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int paddingTop = getPaddingTop() + this.f1219h + getPaddingBottom() + this.f1222k;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            paddingTop = View.MeasureSpec.getSize(i2);
        }
        int paddingLeft = getPaddingLeft() + m1419d() + getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        super.onRtlPropertiesChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1216e != z) {
            this.f1216e = z;
            this.f1231t = m1414a();
            m1418c();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        m1418c();
    }
}
