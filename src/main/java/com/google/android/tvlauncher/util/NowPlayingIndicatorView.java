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

    /* renamed from: b */
    private static final int[][] f6690b = {new int[]{5, 3, 5, 7, 9, 10, 11, 12, 11, 12, 10, 8, 7, 4, 2, 4, 6, 7, 9, 11, 9, 7, 5, 3, 5, 8, 5, 3, 4}, new int[]{12, 11, 10, 11, 12, 11, 9, 7, 9, 11, 12, 10, 8, 10, 12, 11, 9, 5, 3, 5, 8, 10, 12, 10, 9, 8}, new int[]{8, 9, 10, 12, 11, 9, 7, 5, 7, 8, 9, 12, 11, 12, 9, 7, 9, 11, 12, 10, 8, 9, 7, 5, 3}};

    /* renamed from: a */
    public float f6691a;

    /* renamed from: c */
    private final int f6692c;

    /* renamed from: d */
    private final int f6693d;

    /* renamed from: e */
    private final ValueAnimator f6694e;

    /* renamed from: f */
    private final Rect f6695f = new Rect();

    /* renamed from: g */
    private final Paint f6696g;

    /* JADX INFO: finally extract failed */
    public NowPlayingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cfh.f5402a, 0, R.style.NowPlayingIndicatorViewStyle);
        try {
            this.f6692c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f6693d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6694e = valueAnimator;
            valueAnimator.setInterpolator(new LinearInterpolator());
            this.f6694e.setRepeatCount(-1);
            this.f6694e.setDuration(100000000L);
            ValueAnimator valueAnimator2 = this.f6694e;
            valueAnimator2.setFloatValues(0.0f, (float) (valueAnimator2.getDuration() / 80));
            this.f6694e.addUpdateListener(new dbw(this));
            Paint paint = new Paint();
            this.f6696g = paint;
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
        m5351b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5350a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < 3; i++) {
            this.f6695f.left = ((this.f6692c + this.f6693d) * i) + getPaddingStart();
            Rect rect = this.f6695f;
            rect.right = rect.left + this.f6692c;
            this.f6695f.bottom = getHeight() - getPaddingBottom();
            float f = this.f6691a;
            int[] iArr = f6690b[i];
            int i2 = (int) f;
            int length = iArr.length;
            int i3 = i2 % length;
            float f2 = f - ((float) i2);
            int i4 = (i3 + 1) % length;
            int i5 = iArr[i3];
            int i6 = iArr[i4];
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f6695f.top = (int) (((float) getPaddingTop()) + (((float) ((height - paddingTop) - paddingBottom)) * (1.0f - (((((float) i5) * (1.0f - f2)) + (((float) i6) * f2)) / 15.0f))));
            canvas.drawRect(this.f6695f, this.f6696g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = this.f6692c;
        int i4 = this.f6693d;
        int paddingStart = (i3 * 3) + i4 + i4 + getPaddingStart() + getPaddingEnd();
        setMeasuredDimension(paddingStart, paddingStart);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m5351b();
        } else {
            m5350a();
        }
    }

    /* renamed from: b */
    private final void m5351b() {
        if (getVisibility() == 0) {
            this.f6694e.start();
            postInvalidate();
        }
    }

    /* renamed from: a */
    private final void m5350a() {
        this.f6694e.cancel();
        postInvalidate();
    }
}
