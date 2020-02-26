package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: sd  reason: default package */
/* compiled from: PG */
final class sd {
    public static final Matrix a = new Matrix();
    public Paint b;
    public Paint c;
    public final sb d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public Boolean j;
    public final cl k;
    private final Path l;
    private final Path m;
    private final Matrix n;
    private PathMeasure o;
    private int p;

    public int getRootAlpha() {
        return this.p;
    }

    public sd() {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = null;
        this.k = new cl();
        this.d = new sb();
        this.l = new Path();
        this.m = new Path();
    }

    public sd(sd sdVar) {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = null;
        this.k = new cl();
        this.d = new sb(sdVar.d, this.k);
        this.l = new Path(sdVar.l);
        this.m = new Path(sdVar.m);
        this.e = sdVar.e;
        this.f = sdVar.f;
        this.g = sdVar.g;
        this.h = sdVar.h;
        this.p = sdVar.p;
        this.i = sdVar.i;
        String str = sdVar.i;
        if (str != null) {
            this.k.put(str, this);
        }
        this.j = sdVar.j;
    }

    /* JADX WARN: Type inference failed for: r37v16 */
    /* JADX WARN: Type inference failed for: r37v17 */
    /* JADX WARN: Type inference failed for: r37v18 */
    /* JADX WARN: Type inference failed for: r37v19 */
    /* JADX WARN: Type inference failed for: r37v20 */
    /* JADX WARN: Type inference failed for: r37v21 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.sb r40, android.graphics.Matrix r41, android.graphics.Canvas r42, int r43, int r44) {
        /*
            r39 = this;
            r6 = r39
            r7 = r40
            r8 = r42
            android.graphics.Matrix r0 = r7.a
            r1 = r41
            r0.set(r1)
            android.graphics.Matrix r0 = r7.a
            android.graphics.Matrix r1 = r7.j
            r0.preConcat(r1)
            r42.save()
            r9 = 0
            r10 = 0
        L_0x0019:
            java.util.ArrayList r0 = r7.b
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x065d
            java.util.ArrayList r0 = r7.b
            java.lang.Object r0 = r0.get(r10)
            bru r0 = (defpackage.bru) r0
            boolean r1 = r0 instanceof defpackage.sb
            if (r1 == 0) goto L_0x0041
            r1 = r0
            sb r1 = (defpackage.sb) r1
            android.graphics.Matrix r2 = r7.a
            r0 = r39
            r3 = r42
            r4 = r43
            r5 = r44
            r0.a(r1, r2, r3, r4, r5)
            r32 = r10
            goto L_0x0657
        L_0x0041:
            boolean r1 = r0 instanceof defpackage.sc
            if (r1 == 0) goto L_0x0655
            sc r0 = (defpackage.sc) r0
            r1 = r43
            float r2 = (float) r1
            float r3 = r6.g
            float r2 = r2 / r3
            r3 = r44
            float r4 = (float) r3
            float r5 = r6.h
            float r4 = r4 / r5
            float r5 = java.lang.Math.min(r2, r4)
            android.graphics.Matrix r11 = r7.a
            android.graphics.Matrix r12 = r6.n
            r12.set(r11)
            android.graphics.Matrix r12 = r6.n
            r12.postScale(r2, r4)
            r2 = 4
            float[] r4 = new float[r2]
            r4 = {0, 1065353216, 1065353216, 0} // fill-array
            r11.mapVectors(r4)
            r11 = r4[r9]
            r12 = 1
            r13 = r4[r12]
            double r14 = (double) r11
            double r2 = (double) r13
            double r2 = java.lang.Math.hypot(r14, r2)
            r11 = 2
            r13 = r4[r11]
            r14 = 3
            r15 = r4[r14]
            double r11 = (double) r13
            double r14 = (double) r15
            double r11 = java.lang.Math.hypot(r11, r14)
            r14 = r4[r9]
            r15 = 1
            r18 = r4[r15]
            r15 = 2
            r19 = r4[r15]
            r13 = 3
            r4 = r4[r13]
            float r14 = r14 * r4
            float r18 = r18 * r19
            float r14 = r14 - r18
            float r2 = (float) r2
            float r3 = (float) r11
            float r2 = java.lang.Math.max(r2, r3)
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            float r4 = java.lang.Math.abs(r14)
            float r2 = r4 / r2
            goto L_0x00a8
        L_0x00a6:
            r2 = 0
        L_0x00a8:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0652
            android.graphics.Path r4 = r6.l
            r4.reset()
            bf[] r11 = r0.l
            if (r11 != 0) goto L_0x00bb
            r38 = r2
            r32 = r10
            goto L_0x04f1
        L_0x00bb:
            r12 = 6
            float[] r14 = new float[r12]
            r12 = 0
            r18 = 109(0x6d, float:1.53E-43)
        L_0x00c2:
            int r13 = r11.length
            if (r12 >= r13) goto L_0x04ed
            r13 = r11[r12]
            char r3 = r13.a
            float[] r13 = r13.b
            r20 = r14[r9]
            r16 = 1
            r21 = r14[r16]
            r17 = 2
            r22 = r14[r17]
            r19 = 3
            r23 = r14[r19]
            r19 = 4
            r15 = r14[r19]
            r28 = 5
            r9 = r14[r28]
            switch(r3) {
                case 65: goto L_0x0104;
                case 67: goto L_0x0101;
                case 72: goto L_0x00fe;
                case 76: goto L_0x00fa;
                case 77: goto L_0x00fa;
                case 81: goto L_0x00f7;
                case 83: goto L_0x00f7;
                case 84: goto L_0x00fa;
                case 86: goto L_0x00fe;
                case 90: goto L_0x00e7;
                case 97: goto L_0x0104;
                case 99: goto L_0x0101;
                case 104: goto L_0x00fe;
                case 108: goto L_0x00fa;
                case 109: goto L_0x00fa;
                case 113: goto L_0x00f7;
                case 115: goto L_0x00f7;
                case 116: goto L_0x00fa;
                case 118: goto L_0x00fe;
                case 122: goto L_0x00e7;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r29 = 2
            goto L_0x0108
        L_0x00e7:
            r4.close()
            r4.moveTo(r15, r9)
            r21 = r9
            r23 = r21
            r20 = r15
            r22 = r20
            goto L_0x00fb
        L_0x00f7:
            r29 = 4
            goto L_0x0108
        L_0x00fa:
        L_0x00fb:
            r29 = 2
            goto L_0x0108
        L_0x00fe:
            r29 = 1
            goto L_0x0108
        L_0x0101:
            r29 = 6
            goto L_0x0108
        L_0x0104:
            r19 = 7
            r29 = 7
        L_0x0108:
            r31 = r9
            r30 = r15
            r7 = r18
            r15 = r20
            r1 = r21
            r9 = 0
        L_0x0113:
            r32 = r10
            int r10 = r13.length
            if (r9 < r10) goto L_0x013c
            r3 = 0
            r14[r3] = r15
            r3 = 1
            r14[r3] = r1
            r10 = 2
            r14[r10] = r22
            r17 = 3
            r14[r17] = r23
            r33 = 4
            r14[r33] = r30
            r14[r28] = r31
            r1 = r11[r12]
            char r1 = r1.a
            int r12 = r12 + 1
            r7 = r40
            r18 = r1
            r10 = r32
            r3 = 0
            r9 = 0
            r1 = r43
            goto L_0x00c2
        L_0x013c:
            r10 = 2
            r17 = 3
            r33 = 4
            r10 = 65
            if (r3 == r10) goto L_0x0491
            r10 = 67
            if (r3 == r10) goto L_0x045d
            r10 = 72
            if (r3 == r10) goto L_0x0449
            r10 = 81
            if (r3 == r10) goto L_0x041e
            r10 = 86
            if (r3 == r10) goto L_0x040a
            r10 = 97
            if (r3 == r10) goto L_0x03b8
            r10 = 99
            if (r3 == r10) goto L_0x0380
            r10 = 104(0x68, float:1.46E-43)
            if (r3 == r10) goto L_0x036a
            r10 = 113(0x71, float:1.58E-43)
            if (r3 == r10) goto L_0x033c
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x0326
            r10 = 76
            if (r3 == r10) goto L_0x030c
            r10 = 77
            if (r3 == r10) goto L_0x02e4
            r10 = 83
            if (r3 == r10) goto L_0x029b
            r10 = 84
            if (r3 == r10) goto L_0x0263
            r10 = 108(0x6c, float:1.51E-43)
            if (r3 == r10) goto L_0x0247
            r10 = 109(0x6d, float:1.53E-43)
            if (r3 == r10) goto L_0x021d
            r10 = 115(0x73, float:1.61E-43)
            if (r3 == r10) goto L_0x01cf
            r10 = 116(0x74, float:1.63E-43)
            if (r3 == r10) goto L_0x0195
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x0195:
            r10 = 113(0x71, float:1.58E-43)
            if (r7 != r10) goto L_0x019a
            goto L_0x01a9
        L_0x019a:
            r10 = 116(0x74, float:1.63E-43)
            if (r7 == r10) goto L_0x01a9
            r10 = 81
            if (r7 == r10) goto L_0x01a9
            r10 = 84
            if (r7 == r10) goto L_0x01a9
            r7 = 0
            r10 = 0
            goto L_0x01ad
        L_0x01a9:
            float r7 = r15 - r22
            float r10 = r1 - r23
        L_0x01ad:
            int r18 = r9 + 1
            r34 = r3
            r3 = r13[r9]
            r35 = r11
            r11 = r13[r18]
            r4.rQuadTo(r7, r10, r3, r11)
            float r7 = r7 + r15
            float r10 = r10 + r1
            r3 = r13[r9]
            float r15 = r15 + r3
            r3 = r13[r18]
            float r1 = r1 + r3
            r38 = r2
            r22 = r7
            r23 = r10
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x01cf:
            r34 = r3
            r35 = r11
            r3 = 99
            if (r7 != r3) goto L_0x01d8
            goto L_0x01e9
        L_0x01d8:
            r3 = 115(0x73, float:1.61E-43)
            if (r7 == r3) goto L_0x01e9
            r3 = 67
            if (r7 == r3) goto L_0x01e9
            r3 = 83
            if (r7 == r3) goto L_0x01e9
            r19 = 0
            r20 = 0
            goto L_0x01f1
        L_0x01e9:
            float r3 = r15 - r22
            float r7 = r1 - r23
            r19 = r3
            r20 = r7
        L_0x01f1:
            int r3 = r9 + 1
            int r7 = r9 + 2
            int r10 = r9 + 3
            r21 = r13[r9]
            r22 = r13[r3]
            r23 = r13[r7]
            r24 = r13[r10]
            r18 = r4
            r18.rCubicTo(r19, r20, r21, r22, r23, r24)
            r11 = r13[r9]
            float r11 = r11 + r15
            r3 = r13[r3]
            float r3 = r3 + r1
            r7 = r13[r7]
            float r15 = r15 + r7
            r7 = r13[r10]
            float r1 = r1 + r7
            r38 = r2
            r23 = r3
            r22 = r11
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x021d:
            r34 = r3
            r35 = r11
            r3 = r13[r9]
            float r15 = r15 + r3
            int r7 = r9 + 1
            r7 = r13[r7]
            float r1 = r1 + r7
            if (r9 <= 0) goto L_0x0237
            r4.rLineTo(r3, r7)
            r38 = r2
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x0237:
            r4.rMoveTo(r3, r7)
            r31 = r1
            r38 = r2
            r36 = r12
            r37 = r14
            r30 = r15
            goto L_0x04db
        L_0x0247:
            r34 = r3
            r35 = r11
            int r3 = r9 + 1
            r7 = r13[r9]
            r10 = r13[r3]
            r4.rLineTo(r7, r10)
            r7 = r13[r9]
            float r15 = r15 + r7
            r3 = r13[r3]
            float r1 = r1 + r3
            r38 = r2
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x0263:
            r34 = r3
            r35 = r11
            r3 = 113(0x71, float:1.58E-43)
            if (r7 != r3) goto L_0x026c
            goto L_0x0279
        L_0x026c:
            r3 = 116(0x74, float:1.63E-43)
            if (r7 == r3) goto L_0x0279
            r3 = 81
            if (r7 == r3) goto L_0x0279
            r3 = 84
            if (r7 == r3) goto L_0x0279
            goto L_0x027f
        L_0x0279:
            float r15 = r15 + r15
            float r15 = r15 - r22
            float r1 = r1 + r1
            float r1 = r1 - r23
        L_0x027f:
            int r3 = r9 + 1
            r7 = r13[r9]
            r10 = r13[r3]
            r4.quadTo(r15, r1, r7, r10)
            r7 = r13[r9]
            r3 = r13[r3]
            r23 = r1
            r38 = r2
            r1 = r3
            r36 = r12
            r37 = r14
            r22 = r15
            r15 = r7
            goto L_0x04db
        L_0x029b:
            r34 = r3
            r35 = r11
            r3 = 99
            if (r7 != r3) goto L_0x02a4
            goto L_0x02b1
        L_0x02a4:
            r3 = 115(0x73, float:1.61E-43)
            if (r7 == r3) goto L_0x02b1
            r3 = 67
            if (r7 == r3) goto L_0x02b1
            r3 = 83
            if (r7 == r3) goto L_0x02b1
            goto L_0x02b7
        L_0x02b1:
            float r15 = r15 + r15
            float r15 = r15 - r22
            float r1 = r1 + r1
            float r1 = r1 - r23
        L_0x02b7:
            r20 = r1
            r19 = r15
            int r1 = r9 + 1
            int r3 = r9 + 2
            int r7 = r9 + 3
            r21 = r13[r9]
            r22 = r13[r1]
            r23 = r13[r3]
            r24 = r13[r7]
            r18 = r4
            r18.cubicTo(r19, r20, r21, r22, r23, r24)
            r10 = r13[r9]
            r1 = r13[r1]
            r15 = r13[r3]
            r3 = r13[r7]
            r23 = r1
            r38 = r2
            r1 = r3
            r22 = r10
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x02e4:
            r34 = r3
            r35 = r11
            r15 = r13[r9]
            int r1 = r9 + 1
            r1 = r13[r1]
            if (r9 <= 0) goto L_0x02fc
            r4.lineTo(r15, r1)
            r38 = r2
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x02fc:
            r4.moveTo(r15, r1)
            r31 = r1
            r38 = r2
            r36 = r12
            r37 = r14
            r30 = r15
            goto L_0x04db
        L_0x030c:
            r34 = r3
            r35 = r11
            int r1 = r9 + 1
            r3 = r13[r9]
            r7 = r13[r1]
            r4.lineTo(r3, r7)
            r15 = r13[r9]
            r1 = r13[r1]
            r38 = r2
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x0326:
            r34 = r3
            r35 = r11
            r3 = r13[r9]
            r7 = 0
            r4.rLineTo(r7, r3)
            r3 = r13[r9]
            float r1 = r1 + r3
            r38 = r2
            r36 = r12
            r37 = r14
            goto L_0x04db
        L_0x033c:
            r34 = r3
            r35 = r11
            int r3 = r9 + 1
            int r7 = r9 + 2
            int r10 = r9 + 3
            r11 = r13[r9]
            r36 = r12
            r12 = r13[r3]
            r37 = r14
            r14 = r13[r7]
            r38 = r2
            r2 = r13[r10]
            r4.rQuadTo(r11, r12, r14, r2)
            r2 = r13[r9]
            float r2 = r2 + r15
            r3 = r13[r3]
            float r3 = r3 + r1
            r7 = r13[r7]
            float r15 = r15 + r7
            r7 = r13[r10]
            float r1 = r1 + r7
            r22 = r2
            r23 = r3
            goto L_0x04db
        L_0x036a:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            r2 = r13[r9]
            r3 = 0
            r4.rLineTo(r2, r3)
            r2 = r13[r9]
            float r15 = r15 + r2
            goto L_0x04db
        L_0x0380:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            int r2 = r9 + 2
            int r3 = r9 + 3
            int r7 = r9 + 4
            int r10 = r9 + 5
            r19 = r13[r9]
            int r11 = r9 + 1
            r20 = r13[r11]
            r21 = r13[r2]
            r22 = r13[r3]
            r23 = r13[r7]
            r24 = r13[r10]
            r18 = r4
            r18.rCubicTo(r19, r20, r21, r22, r23, r24)
            r2 = r13[r2]
            float r2 = r2 + r15
            r3 = r13[r3]
            float r3 = r3 + r1
            r7 = r13[r7]
            float r15 = r15 + r7
            r7 = r13[r10]
            float r1 = r1 + r7
            r22 = r2
            r23 = r3
            goto L_0x04db
        L_0x03b8:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            int r2 = r9 + 5
            r3 = r13[r2]
            float r21 = r3 + r15
            int r3 = r9 + 6
            r7 = r13[r3]
            float r22 = r7 + r1
            r23 = r13[r9]
            int r7 = r9 + 1
            r24 = r13[r7]
            int r7 = r9 + 2
            r25 = r13[r7]
            int r7 = r9 + 3
            r7 = r13[r7]
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x03e4
            r26 = 1
            goto L_0x03e6
        L_0x03e4:
            r26 = 0
        L_0x03e6:
            int r7 = r9 + 4
            r7 = r13[r7]
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x03f1
            r27 = 1
            goto L_0x03f4
        L_0x03f1:
            r27 = 0
        L_0x03f4:
            r18 = r4
            r19 = r15
            r20 = r1
            defpackage.bf.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = r13[r2]
            float r15 = r15 + r2
            r2 = r13[r3]
            float r1 = r1 + r2
            r23 = r1
            r22 = r15
            goto L_0x04db
        L_0x040a:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            r1 = r13[r9]
            r4.lineTo(r15, r1)
            r1 = r13[r9]
            goto L_0x04db
        L_0x041e:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            int r1 = r9 + 1
            int r2 = r9 + 2
            int r3 = r9 + 3
            r7 = r13[r9]
            r10 = r13[r1]
            r11 = r13[r2]
            r12 = r13[r3]
            r4.quadTo(r7, r10, r11, r12)
            r7 = r13[r9]
            r1 = r13[r1]
            r15 = r13[r2]
            r2 = r13[r3]
            r23 = r1
            r1 = r2
            r22 = r7
            goto L_0x04db
        L_0x0449:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            r2 = r13[r9]
            r4.lineTo(r2, r1)
            r15 = r13[r9]
            goto L_0x04db
        L_0x045d:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            int r1 = r9 + 2
            int r2 = r9 + 3
            int r3 = r9 + 4
            int r7 = r9 + 5
            r19 = r13[r9]
            int r10 = r9 + 1
            r20 = r13[r10]
            r21 = r13[r1]
            r22 = r13[r2]
            r23 = r13[r3]
            r24 = r13[r7]
            r18 = r4
            r18.cubicTo(r19, r20, r21, r22, r23, r24)
            r15 = r13[r3]
            r3 = r13[r7]
            r1 = r13[r1]
            r2 = r13[r2]
            r22 = r1
            r23 = r2
            r1 = r3
            goto L_0x04db
        L_0x0491:
            r38 = r2
            r34 = r3
            r35 = r11
            r36 = r12
            r37 = r14
            int r2 = r9 + 5
            r21 = r13[r2]
            int r3 = r9 + 6
            r22 = r13[r3]
            r23 = r13[r9]
            int r7 = r9 + 1
            r24 = r13[r7]
            int r7 = r9 + 2
            r25 = r13[r7]
            int r7 = r9 + 3
            r7 = r13[r7]
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x04b9
            r26 = 1
            goto L_0x04bb
        L_0x04b9:
            r26 = 0
        L_0x04bb:
            int r7 = r9 + 4
            r7 = r13[r7]
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x04c6
            r27 = 1
            goto L_0x04c9
        L_0x04c6:
            r27 = 0
        L_0x04c9:
            r18 = r4
            r19 = r15
            r20 = r1
            defpackage.bf.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15 = r13[r2]
            r1 = r13[r3]
            r23 = r1
            r22 = r15
        L_0x04db:
            int r9 = r9 + r29
            r10 = r32
            r3 = r34
            r7 = r3
            r11 = r35
            r12 = r36
            r14 = r37
            r2 = r38
            goto L_0x0113
        L_0x04ed:
            r38 = r2
            r32 = r10
        L_0x04f1:
            android.graphics.Path r1 = r6.l
            android.graphics.Path r2 = r6.m
            r2.reset()
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x051b
            android.graphics.Path r2 = r6.m
            int r0 = r0.n
            if (r0 != 0) goto L_0x0507
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0509
        L_0x0507:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0509:
            r2.setFillType(r0)
            android.graphics.Path r0 = r6.m
            android.graphics.Matrix r2 = r6.n
            r0.addPath(r1, r2)
            android.graphics.Path r0 = r6.m
            r8.clipPath(r0)
            r9 = 0
            goto L_0x0657
        L_0x051b:
            sa r0 = (defpackage.sa) r0
            float r2 = r0.f
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x052f
            float r4 = r0.g
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x052d
            goto L_0x052f
        L_0x052d:
            r9 = 0
            goto L_0x0573
        L_0x052f:
            float r4 = r0.h
            float r2 = r2 + r4
            float r2 = r2 % r3
            float r7 = r0.g
            float r7 = r7 + r4
            float r7 = r7 % r3
            android.graphics.PathMeasure r3 = r6.o
            if (r3 != 0) goto L_0x0542
            android.graphics.PathMeasure r3 = new android.graphics.PathMeasure
            r3.<init>()
            r6.o = r3
        L_0x0542:
            android.graphics.PathMeasure r3 = r6.o
            android.graphics.Path r4 = r6.l
            r9 = 0
            r3.setPath(r4, r9)
            android.graphics.PathMeasure r3 = r6.o
            float r3 = r3.getLength()
            float r2 = r2 * r3
            float r7 = r7 * r3
            r1.reset()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0568
            android.graphics.PathMeasure r4 = r6.o
            r10 = 1
            r4.getSegment(r2, r3, r1, r10)
            android.graphics.PathMeasure r2 = r6.o
            r3 = 0
            r2.getSegment(r3, r7, r1, r10)
            goto L_0x056f
        L_0x0568:
            r3 = 0
            r10 = 1
            android.graphics.PathMeasure r4 = r6.o
            r4.getSegment(r2, r7, r1, r10)
        L_0x056f:
            r1.rLineTo(r3, r3)
        L_0x0573:
            android.graphics.Path r2 = r6.m
            android.graphics.Matrix r3 = r6.n
            r2.addPath(r1, r3)
            au r1 = r0.c
            boolean r1 = r1.c()
            r2 = 1132396544(0x437f0000, float:255.0)
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            if (r1 == 0) goto L_0x05e1
            au r1 = r0.c
            android.graphics.Paint r7 = r6.c
            if (r7 != 0) goto L_0x059a
            android.graphics.Paint r7 = new android.graphics.Paint
            r10 = 1
            r7.<init>(r10)
            r6.c = r7
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r7.setStyle(r10)
        L_0x059a:
            android.graphics.Paint r7 = r6.c
            boolean r10 = r1.a()
            if (r10 == 0) goto L_0x05b8
            android.graphics.Shader r1 = r1.a
            android.graphics.Matrix r10 = r6.n
            r1.setLocalMatrix(r10)
            r7.setShader(r1)
            float r1 = r0.e
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r7.setAlpha(r1)
            goto L_0x05ca
        L_0x05b8:
            r7.setShader(r4)
            r7.setAlpha(r3)
            int r1 = r1.b
            float r10 = r0.e
            int r1 = defpackage.sg.a(r1, r10)
            r7.setColor(r1)
        L_0x05ca:
            r7.setColorFilter(r4)
            android.graphics.Path r1 = r6.m
            int r10 = r0.n
            if (r10 != 0) goto L_0x05d7
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.WINDING
            goto L_0x05d9
        L_0x05d7:
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
        L_0x05d9:
            r1.setFillType(r10)
            android.graphics.Path r1 = r6.m
            r8.drawPath(r1, r7)
        L_0x05e1:
            au r1 = r0.a
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0657
            au r1 = r0.a
            android.graphics.Paint r7 = r6.b
            if (r7 != 0) goto L_0x05fc
            android.graphics.Paint r7 = new android.graphics.Paint
            r10 = 1
            r7.<init>(r10)
            r6.b = r7
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r10)
        L_0x05fc:
            android.graphics.Paint r7 = r6.b
            android.graphics.Paint$Join r10 = r0.j
            if (r10 == 0) goto L_0x0605
            r7.setStrokeJoin(r10)
        L_0x0605:
            android.graphics.Paint$Cap r10 = r0.i
            if (r10 == 0) goto L_0x060c
            r7.setStrokeCap(r10)
        L_0x060c:
            float r10 = r0.k
            r7.setStrokeMiter(r10)
            boolean r10 = r1.a()
            if (r10 == 0) goto L_0x062d
            android.graphics.Shader r1 = r1.a
            android.graphics.Matrix r3 = r6.n
            r1.setLocalMatrix(r3)
            r7.setShader(r1)
            float r1 = r0.d
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r7.setAlpha(r1)
            goto L_0x063f
        L_0x062d:
            r7.setShader(r4)
            r7.setAlpha(r3)
            int r1 = r1.b
            float r2 = r0.d
            int r1 = defpackage.sg.a(r1, r2)
            r7.setColor(r1)
        L_0x063f:
            r7.setColorFilter(r4)
            float r0 = r0.b
            float r5 = r5 * r38
            float r0 = r0 * r5
            r7.setStrokeWidth(r0)
            android.graphics.Path r0 = r6.m
            r8.drawPath(r0, r7)
            goto L_0x0657
        L_0x0652:
            r32 = r10
            goto L_0x0657
        L_0x0655:
            r32 = r10
        L_0x0657:
            int r10 = r32 + 1
            r7 = r40
            goto L_0x0019
        L_0x065d:
            r42.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.a(sb, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.p = i2;
    }
}
