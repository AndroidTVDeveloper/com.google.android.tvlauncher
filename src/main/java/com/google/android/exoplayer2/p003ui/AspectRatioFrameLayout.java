package com.google.android.exoplayer2.p003ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* compiled from: PG */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    public float f6227a;

    /* renamed from: b */
    private final bgs f6228b;

    /* renamed from: c */
    private int f6229c;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6229c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bhc.f3934a, 0, 0);
            try {
                this.f6229c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6228b = new bgs(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 > 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r3 > 0.0f) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            float r7 = r6.f6227a
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            int r7 = r6.getMeasuredWidth()
            int r0 = r6.getMeasuredHeight()
            float r1 = (float) r7
            float r2 = (float) r0
            float r3 = r6.f6227a
            float r4 = r1 / r2
            float r3 = r3 / r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 + r4
            float r4 = java.lang.Math.abs(r3)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x002d
            bgs r7 = r6.f6228b
            r7.mo1869a()
            return
        L_0x002d:
            int r4 = r6.f6229c
            if (r4 == 0) goto L_0x004a
            r5 = 1
            if (r4 == r5) goto L_0x0045
            r5 = 2
            if (r4 == r5) goto L_0x003f
            r5 = 4
            if (r4 == r5) goto L_0x003b
            goto L_0x004f
        L_0x003b:
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0045
        L_0x003f:
            float r7 = r6.f6227a
            float r2 = r2 * r7
            int r7 = (int) r2
            goto L_0x004f
        L_0x0045:
            float r8 = r6.f6227a
            float r1 = r1 / r8
            int r0 = (int) r1
            goto L_0x004f
        L_0x004a:
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x003f
            goto L_0x0045
        L_0x004f:
            bgs r8 = r6.f6228b
            r8.mo1869a()
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r7, r8)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p003ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    public final void mo3174a(int i) {
        if (this.f6229c != i) {
            this.f6229c = i;
            requestLayout();
        }
    }
}
