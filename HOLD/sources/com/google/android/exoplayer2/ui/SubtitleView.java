package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class SubtitleView extends View implements bds {
    public float a;
    public bdi b;
    private final List c;
    private List d;
    private boolean e;
    private boolean f;
    private float g;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private static final float a(int i, float f2, int i2, int i3) {
        float f3;
        if (i == 0) {
            f3 = (float) i3;
        } else if (i != 1) {
            return -3.4028235E38f;
        } else {
            f3 = (float) i2;
        }
        return f2 * f3;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.a = 0.0533f;
        this.e = true;
        this.f = true;
        this.b = bdi.a;
        this.g = 0.08f;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.util.List r2 = r0.d
            if (r2 == 0) goto L_0x0497
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0010
            goto L_0x0497
        L_0x0010:
            int r3 = r36.getHeight()
            int r4 = r36.getPaddingLeft()
            int r5 = r36.getPaddingTop()
            int r6 = r36.getWidth()
            int r7 = r36.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r36.getPaddingBottom()
            int r7 = r3 - r7
            if (r7 <= r5) goto L_0x0497
            if (r6 <= r4) goto L_0x0497
            int r8 = r7 - r5
            float r9 = r0.a
            r10 = 0
            float r9 = a(r10, r9, r3, r8)
            r11 = 0
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0497
            int r12 = r2.size()
            r13 = 0
        L_0x0042:
            if (r13 >= r12) goto L_0x0497
            java.lang.Object r14 = r2.get(r13)
            bdj r14 = (defpackage.bdj) r14
            int r15 = r14.n
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r15 == r10) goto L_0x0063
            float r10 = r14.o
            int r17 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r17 == 0) goto L_0x0062
            float r10 = a(r15, r10, r3, r8)
            float r10 = java.lang.Math.max(r10, r11)
            goto L_0x0064
        L_0x0062:
        L_0x0063:
            r10 = 0
        L_0x0064:
            java.util.List r15 = r0.c
            java.lang.Object r15 = r15.get(r13)
            bhe r15 = (defpackage.bhe) r15
            boolean r11 = r0.e
            r18 = r2
            boolean r2 = r0.f
            r19 = r3
            bdi r3 = r0.b
            r20 = r12
            float r12 = r0.g
            android.graphics.Bitmap r0 = r14.d
            r21 = r13
            if (r0 != 0) goto L_0x0082
            r0 = 1
            goto L_0x0084
        L_0x0082:
            r0 = 0
        L_0x0084:
            if (r0 == 0) goto L_0x00a5
            java.lang.CharSequence r13 = r14.b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0099
            r2 = r4
            r31 = r7
            r32 = r9
            r9 = 0
            r11 = 0
            r7 = r5
            r5 = r8
            goto L_0x0483
        L_0x0099:
            boolean r13 = r14.l
            if (r13 == 0) goto L_0x00a2
            if (r11 == 0) goto L_0x00a2
            int r13 = r14.m
            goto L_0x00a7
        L_0x00a2:
            int r13 = r3.d
            goto L_0x00a7
        L_0x00a5:
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x00a7:
            r22 = r8
            java.lang.CharSequence r8 = r15.d
            r23 = r0
            java.lang.CharSequence r0 = r14.b
            if (r8 != r0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            if (r8 == 0) goto L_0x018e
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018b
        L_0x00ba:
            android.text.Layout$Alignment r0 = r15.e
            android.text.Layout$Alignment r8 = r14.c
            boolean r0 = defpackage.blm.a(r0, r8)
            if (r0 == 0) goto L_0x0188
            android.graphics.Bitmap r0 = r15.f
            android.graphics.Bitmap r8 = r14.d
            if (r0 != r8) goto L_0x0188
            float r0 = r15.g
            float r8 = r14.e
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0188
            int r0 = r15.h
            int r8 = r14.f
            if (r0 != r8) goto L_0x0188
            int r0 = r15.i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r8 = r14.g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r0 = defpackage.blm.a(r0, r8)
            if (r0 == 0) goto L_0x0185
            float r0 = r15.j
            float r8 = r14.h
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0185
            int r0 = r15.k
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r8 = r14.i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r0 = defpackage.blm.a(r0, r8)
            if (r0 == 0) goto L_0x0182
            float r0 = r15.l
            float r8 = r14.j
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0182
            float r0 = r15.m
            float r8 = r14.k
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0182
            boolean r0 = r15.n
            if (r0 != r11) goto L_0x017f
            boolean r0 = r15.o
            if (r0 != r2) goto L_0x017f
            int r0 = r15.p
            int r8 = r3.b
            if (r0 != r8) goto L_0x0182
            int r0 = r15.q
            int r8 = r3.c
            if (r0 != r8) goto L_0x0182
            int r0 = r15.r
            if (r0 != r13) goto L_0x0182
            int r0 = r15.t
            int r8 = r3.e
            if (r0 != r8) goto L_0x0182
            int r0 = r15.s
            int r8 = r3.f
            if (r0 != r8) goto L_0x0182
            android.text.TextPaint r0 = r15.c
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r8 = r3.g
            boolean r0 = defpackage.blm.a(r0, r8)
            if (r0 == 0) goto L_0x017c
            float r0 = r15.u
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
            float r0 = r15.v
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
            float r0 = r15.w
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
            int r0 = r15.x
            if (r0 != r4) goto L_0x017c
            int r0 = r15.y
            if (r0 != r5) goto L_0x017c
            int r0 = r15.z
            if (r0 != r6) goto L_0x017c
            int r0 = r15.A
            if (r0 == r7) goto L_0x016b
            r0 = r23
            goto L_0x0190
        L_0x016b:
            r0 = r23
            r15.a(r1, r0)
            r2 = r4
            r31 = r7
            r32 = r9
            r9 = 0
            r11 = 0
            r7 = r5
            r5 = r22
            goto L_0x0483
        L_0x017c:
            r0 = r23
            goto L_0x0190
        L_0x017f:
            r0 = r23
            goto L_0x0190
        L_0x0182:
            r0 = r23
            goto L_0x0190
        L_0x0185:
            r0 = r23
            goto L_0x0190
        L_0x0188:
            r0 = r23
            goto L_0x0190
        L_0x018b:
            r0 = r23
            goto L_0x0190
        L_0x018e:
            r0 = r23
        L_0x0190:
            java.lang.CharSequence r8 = r14.b
            r15.d = r8
            android.text.Layout$Alignment r8 = r14.c
            r15.e = r8
            android.graphics.Bitmap r8 = r14.d
            r15.f = r8
            float r8 = r14.e
            r15.g = r8
            int r8 = r14.f
            r15.h = r8
            int r8 = r14.g
            r15.i = r8
            float r8 = r14.h
            r15.j = r8
            int r8 = r14.i
            r15.k = r8
            float r8 = r14.j
            r15.l = r8
            float r8 = r14.k
            r15.m = r8
            r15.n = r11
            r15.o = r2
            int r2 = r3.b
            r15.p = r2
            int r2 = r3.c
            r15.q = r2
            r15.r = r13
            int r2 = r3.e
            r15.t = r2
            int r2 = r3.f
            r15.s = r2
            android.text.TextPaint r2 = r15.c
            android.graphics.Typeface r3 = r3.g
            r2.setTypeface(r3)
            r15.u = r9
            r15.v = r10
            r15.w = r12
            r15.x = r4
            r15.y = r5
            r15.z = r6
            r15.A = r7
            if (r0 == 0) goto L_0x03ff
            int r3 = r6 - r4
            android.text.TextPaint r8 = r15.c
            r8.setTextSize(r9)
            float r8 = r15.u
            r10 = 1040187392(0x3e000000, float:0.125)
            float r8 = r8 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r10
            int r8 = (int) r8
            int r10 = r8 + r8
            int r11 = r3 - r10
            float r12 = r15.l
            int r13 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x0204
            float r11 = (float) r11
            float r11 = r11 * r12
            int r11 = (int) r11
        L_0x0204:
            java.lang.String r12 = "SubtitlePainter"
            if (r11 <= 0) goto L_0x03e6
            java.lang.CharSequence r13 = r15.d
            boolean r14 = r15.n
            if (r14 != 0) goto L_0x0218
            java.lang.String r13 = r13.toString()
            r31 = r7
            r32 = r9
            goto L_0x0282
        L_0x0218:
            boolean r14 = r15.o
            if (r14 == 0) goto L_0x0247
            float r14 = r15.v
            r17 = 0
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0242
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r13)
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            float r2 = r15.v
            int r2 = (int) r2
            r13.<init>(r2)
            int r2 = r14.length()
            r31 = r7
            r32 = r9
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            r14.setSpan(r13, r9, r2, r7)
            r13 = r14
            goto L_0x0282
        L_0x0242:
            r31 = r7
            r32 = r9
            goto L_0x0282
        L_0x0247:
            r31 = r7
            r32 = r9
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r13)
            int r7 = r2.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r9 = android.text.style.AbsoluteSizeSpan.class
            r13 = 0
            java.lang.Object[] r9 = r2.getSpans(r13, r7, r9)
            android.text.style.AbsoluteSizeSpan[] r9 = (android.text.style.AbsoluteSizeSpan[]) r9
            java.lang.Class<android.text.style.RelativeSizeSpan> r14 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r7 = r2.getSpans(r13, r7, r14)
            android.text.style.RelativeSizeSpan[] r7 = (android.text.style.RelativeSizeSpan[]) r7
            int r13 = r9.length
            r14 = 0
        L_0x0267:
            if (r14 >= r13) goto L_0x0275
            r24 = r13
            r13 = r9[r14]
            r2.removeSpan(r13)
            int r14 = r14 + 1
            r13 = r24
            goto L_0x0267
        L_0x0275:
            int r9 = r7.length
            r13 = 0
        L_0x0277:
            if (r13 >= r9) goto L_0x0281
            r14 = r7[r13]
            r2.removeSpan(r14)
            int r13 = r13 + 1
            goto L_0x0277
        L_0x0281:
            r13 = r2
        L_0x0282:
            int r2 = r15.q
            int r2 = android.graphics.Color.alpha(r2)
            if (r2 <= 0) goto L_0x02a1
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r13)
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            int r9 = r15.q
            r7.<init>(r9)
            int r9 = r2.length()
            r13 = 16711680(0xff0000, float:2.3418052E-38)
            r14 = 0
            r2.setSpan(r7, r14, r9, r13)
            goto L_0x02a2
        L_0x02a1:
            r2 = r13
        L_0x02a2:
            android.text.Layout$Alignment r7 = r15.e
            if (r7 == 0) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            android.text.Layout$Alignment r7 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x02a9:
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r13 = r15.c
            float r14 = r15.a
            r33 = r0
            float r0 = r15.b
            r30 = 1
            r23 = r9
            r24 = r2
            r25 = r13
            r26 = r11
            r27 = r7
            r28 = r14
            r29 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r15.B = r9
            android.text.StaticLayout r0 = r15.B
            int r0 = r0.getHeight()
            android.text.StaticLayout r9 = r15.B
            int r9 = r9.getLineCount()
            r13 = 0
            r14 = 0
        L_0x02d6:
            if (r13 >= r9) goto L_0x02f7
            r23 = r9
            android.text.StaticLayout r9 = r15.B
            float r9 = r9.getLineWidth(r13)
            r34 = r4
            r35 = r5
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r14 = java.lang.Math.max(r4, r14)
            int r13 = r13 + 1
            r9 = r23
            r4 = r34
            r5 = r35
            goto L_0x02d6
        L_0x02f7:
            r34 = r4
            r35 = r5
            float r4 = r15.l
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0302
            goto L_0x0307
        L_0x0302:
            if (r14 < r11) goto L_0x0306
            goto L_0x0307
        L_0x0306:
            r14 = r11
        L_0x0307:
            int r14 = r14 + r10
            float r4 = r15.j
            int r5 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0333
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r4 = r15.x
            int r3 = r3 + r4
            int r5 = r15.k
            r9 = 1
            if (r5 == r9) goto L_0x0323
            r9 = 2
            if (r5 == r9) goto L_0x0321
            goto L_0x0327
        L_0x0321:
            int r3 = r3 - r14
            goto L_0x0327
        L_0x0323:
            r9 = 2
            int r3 = r3 + r3
            int r3 = r3 - r14
            int r3 = r3 / r9
        L_0x0327:
            int r3 = java.lang.Math.max(r3, r4)
            int r14 = r14 + r3
            int r4 = r15.z
            int r4 = java.lang.Math.min(r14, r4)
            goto L_0x033b
        L_0x0333:
            r9 = 2
            int r3 = r3 - r14
            int r3 = r3 / r9
            int r4 = r15.x
            int r3 = r3 + r4
            int r4 = r3 + r14
        L_0x033b:
            int r26 = r4 - r3
            if (r26 > 0) goto L_0x034e
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r12, r0)
            r5 = r22
            r2 = r34
            r7 = r35
            r9 = 0
            r11 = 0
            goto L_0x047e
        L_0x034e:
            float r4 = r15.g
            int r5 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x0363
            int r4 = r15.A
            int r4 = r4 - r0
            r5 = r22
            float r0 = (float) r5
            float r9 = r15.w
            float r0 = r0 * r9
            int r0 = (int) r0
            int r4 = r4 - r0
            r9 = 0
            r11 = 0
            goto L_0x03bf
        L_0x0363:
            r5 = r22
            int r9 = r15.h
            if (r9 == 0) goto L_0x0397
            android.text.StaticLayout r4 = r15.B
            r9 = 0
            int r4 = r4.getLineBottom(r9)
            android.text.StaticLayout r10 = r15.B
            int r10 = r10.getLineTop(r9)
            int r4 = r4 - r10
            float r10 = r15.g
            r11 = 0
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x0389
            float r4 = (float) r4
            float r10 = r10 * r4
            int r4 = java.lang.Math.round(r10)
            int r10 = r15.y
            int r4 = r4 + r10
            goto L_0x03a3
        L_0x0389:
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 + r12
            float r4 = (float) r4
            float r10 = r10 * r4
            int r4 = java.lang.Math.round(r10)
            int r10 = r15.A
            int r4 = r4 + r10
            goto L_0x03a3
        L_0x0397:
            r9 = 0
            r11 = 0
            float r10 = (float) r5
            float r10 = r10 * r4
            int r4 = java.lang.Math.round(r10)
            int r10 = r15.y
            int r4 = r4 + r10
        L_0x03a3:
            int r10 = r15.i
            r12 = 2
            if (r10 != r12) goto L_0x03aa
            int r4 = r4 - r0
            goto L_0x03b1
        L_0x03aa:
            r13 = 1
            if (r10 != r13) goto L_0x03b1
            int r4 = r4 + r4
            int r4 = r4 - r0
            int r4 = r4 / r12
        L_0x03b1:
            int r10 = r15.A
            int r12 = r4 + r0
            if (r12 <= r10) goto L_0x03ba
            int r4 = r10 - r0
            goto L_0x03bf
        L_0x03ba:
            int r0 = r15.y
            if (r4 >= r0) goto L_0x03bf
            r4 = r0
        L_0x03bf:
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r10 = r15.c
            float r12 = r15.a
            float r13 = r15.b
            r30 = 1
            r23 = r0
            r24 = r2
            r25 = r10
            r27 = r7
            r28 = r12
            r29 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r15.B = r0
            r15.C = r3
            r15.D = r4
            r15.E = r8
            r2 = r34
            r7 = r35
            goto L_0x047e
        L_0x03e6:
            r33 = r0
            r34 = r4
            r35 = r5
            r31 = r7
            r32 = r9
            r5 = r22
            r9 = 0
            r11 = 0
            java.lang.String r0 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r12, r0)
            r2 = r34
            r7 = r35
            goto L_0x047e
        L_0x03ff:
            r33 = r0
            r34 = r4
            r35 = r5
            r31 = r7
            r32 = r9
            r5 = r22
            r9 = 0
            r11 = 0
            int r0 = r6 - r34
            float r0 = (float) r0
            r2 = r34
            float r3 = (float) r2
            float r4 = r15.j
            float r4 = r4 * r0
            float r3 = r3 + r4
            float r4 = (float) r5
            r7 = r35
            float r8 = (float) r7
            float r10 = r15.g
            float r10 = r10 * r4
            float r8 = r8 + r10
            float r10 = r15.l
            float r0 = r0 * r10
            int r0 = java.lang.Math.round(r0)
            float r10 = r15.m
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x0436
            float r4 = r4 * r10
            int r4 = java.lang.Math.round(r4)
            goto L_0x044c
        L_0x0436:
            float r4 = (float) r0
            android.graphics.Bitmap r10 = r15.f
            int r10 = r10.getHeight()
            float r10 = (float) r10
            android.graphics.Bitmap r12 = r15.f
            int r12 = r12.getWidth()
            float r12 = (float) r12
            float r10 = r10 / r12
            float r4 = r4 * r10
            int r4 = java.lang.Math.round(r4)
        L_0x044c:
            int r10 = r15.k
            r12 = 2
            if (r10 != r12) goto L_0x0454
            float r10 = (float) r0
            float r3 = r3 - r10
            goto L_0x045c
        L_0x0454:
            r12 = 1
            if (r10 != r12) goto L_0x045c
            int r10 = r0 / 2
            float r10 = (float) r10
            float r3 = r3 - r10
        L_0x045c:
            int r3 = java.lang.Math.round(r3)
            int r10 = r15.i
            r12 = 2
            if (r10 != r12) goto L_0x0468
            float r10 = (float) r4
            float r8 = r8 - r10
            goto L_0x0471
        L_0x0468:
            r12 = 1
            if (r10 != r12) goto L_0x0470
            int r10 = r4 / 2
            float r10 = (float) r10
            float r8 = r8 - r10
            goto L_0x0471
        L_0x0470:
        L_0x0471:
            int r8 = java.lang.Math.round(r8)
            android.graphics.Rect r10 = new android.graphics.Rect
            int r0 = r0 + r3
            int r4 = r4 + r8
            r10.<init>(r3, r8, r0, r4)
            r15.F = r10
        L_0x047e:
            r13 = r33
            r15.a(r1, r13)
        L_0x0483:
            int r13 = r21 + 1
            r0 = r36
            r4 = r2
            r8 = r5
            r5 = r7
            r2 = r18
            r3 = r19
            r12 = r20
            r7 = r31
            r9 = r32
            r10 = 0
            goto L_0x0042
        L_0x0497:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void a(List list) {
        b(list);
    }

    public final void b(List list) {
        int i;
        if (this.d != list) {
            this.d = list;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            while (this.c.size() < i) {
                this.c.add(new bhe(getContext()));
            }
            invalidate();
        }
    }
}
