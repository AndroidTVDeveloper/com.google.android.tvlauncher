package com.google.android.tvlauncher.util;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NowPlayingIndicatorView extends View {
    private static final int[][] b = {new int[]{5, 3, 5, 7, 9, 10, 11, 12, 11, 12, 10, 8, 7, 4, 2, 4, 6, 7, 9, 11, 9, 7, 5, 3, 5, 8, 5, 3, 4}, new int[]{12, 11, 10, 11, 12, 11, 9, 7, 9, 11, 12, 10, 8, 10, 12, 11, 9, 5, 3, 5, 8, 10, 12, 10, 9, 8}, new int[]{8, 9, 10, 12, 11, 9, 7, 5, 7, 8, 9, 12, 11, 12, 9, 7, 9, 11, 12, 10, 8, 9, 7, 5, 3}};
    public float a;
    private final int c;
    private final int d;
    private final ValueAnimator e;
    private final Rect f = new Rect();
    private final Paint g;

    /* JADX INFO: finally extract failed */
    public NowPlayingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cfh.a, 0, R.style.NowPlayingIndicatorViewStyle);
        try {
            this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            ValueAnimator valueAnimator = new ValueAnimator();
            this.e = valueAnimator;
            valueAnimator.setInterpolator(new LinearInterpolator());
            this.e.setRepeatCount(-1);
            this.e.setDuration(100000000L);
            ValueAnimator valueAnimator2 = this.e;
            valueAnimator2.setFloatValues(0.0f, (float) (valueAnimator2.getDuration() / 80));
            this.e.addUpdateListener(new dbw(this));
            Paint paint = new Paint();
            this.g = paint;
            paint.setColor(-1);
            setLayerType(1, null);
            setImportantForAccessibility(2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < 3; i++) {
            this.f.left = ((this.c + this.d) * i) + getPaddingStart();
            Rect rect = this.f;
            rect.right = rect.left + this.c;
            this.f.bottom = getHeight() - getPaddingBottom();
            float f2 = this.a;
            int[] iArr = b[i];
            int i2 = (int) f2;
            int length = iArr.length;
            int i3 = i2 % length;
            float f3 = f2 - ((float) i2);
            int i4 = (i3 + 1) % length;
            int i5 = iArr[i3];
            int i6 = iArr[i4];
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f.top = (int) (((float) getPaddingTop()) + (((float) ((height - paddingTop) - paddingBottom)) * (1.0f - (((((float) i5) * (1.0f - f3)) + (((float) i6) * f3)) / 15.0f))));
            canvas.drawRect(this.f, this.g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        int i4 = this.d;
        int paddingStart = (i3 * 3) + i4 + i4 + getPaddingStart() + getPaddingEnd();
        setMeasuredDimension(paddingStart, paddingStart);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            b();
        } else {
            a();
        }
    }

    private final void b() {
        if (getVisibility() == 0) {
            this.e.start();
            postInvalidate();
        }
    }

    private final void a() {
        this.e.cancel();
        postInvalidate();
    }
}
