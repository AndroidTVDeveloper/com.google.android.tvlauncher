package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: beo  reason: default package */
/* compiled from: PG */
final class beo {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c = new Canvas();
    public final beh d = new beh(719, 575, 0, 719, 0, 575);
    public final beg e = new beg(0, a(), b(), c());
    public final ben f;
    public Bitmap g;

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public beo(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.a.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.b.setPathEffect(null);
        this.f = new ben(i2, i3);
    }

    private static byte[] a(int i2, int i3, bkx bkx) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) bkx.c(i3);
        }
        return bArr;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 >= 8) {
                int i3 = 127;
                int i4 = (i2 & 1) == 0 ? 0 : 127;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(255, i4, i5, i3);
            } else {
                iArr[i2] = a(255, (i2 & 1) == 0 ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 >= 8) {
                int i4 = i2 & 136;
                int i5 = 170;
                int i6 = 85;
                if (i4 == 0) {
                    int i7 = ((i2 & 1) == 0 ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i6 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i2] = a(255, i7, i8, i6 + i5);
                } else if (i4 != 8) {
                    int i9 = 43;
                    if (i4 == 128) {
                        int i10 = ((i2 & 1) == 0 ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i11 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i9 = 0;
                        }
                        int i12 = i9 + 127;
                        if ((i2 & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i2] = a(255, i10, i11, i12 + i6);
                    } else if (i4 == 136) {
                        int i13 = ((i2 & 1) == 0 ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0);
                        int i14 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i9 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i2] = a(255, i13, i14, i9 + i6);
                    }
                } else {
                    int i15 = ((i2 & 1) == 0 ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0);
                    int i16 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i6 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i2] = a(127, i15, i16, i6 + i5);
                }
            } else {
                int i17 = (i2 & 1) == 0 ? 0 : 255;
                int i18 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(63, i17, i18, i3);
            }
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v20, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v5, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0247 A[LOOP:3: B:81:0x0195->B:109:0x0247, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x024b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r25
            r7 = r28
            bkx r8 = new bkx
            r1 = r23
            r8.<init>(r1)
            r1 = r26
            r11 = r27
            r10 = 0
            r12 = 0
        L_0x0011:
            int r2 = r8.a()
            if (r2 == 0) goto L_0x025a
            r13 = 8
            int r2 = r8.c(r13)
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 == r3) goto L_0x0251
            r14 = 3
            r15 = 4
            r6 = 1
            r5 = 2
            r16 = 0
            switch(r2) {
                case 16: goto L_0x0179;
                case 17: goto L_0x00a3;
                case 18: goto L_0x004b;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r2) {
                case 32: goto L_0x0042;
                case 33: goto L_0x0039;
                case 34: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0257
        L_0x002f:
            r2 = 16
            byte[] r2 = a(r2, r13, r8)
            r10 = r2
            goto L_0x0257
        L_0x0039:
            byte[] r2 = a(r15, r13, r8)
            r10 = r2
            goto L_0x0257
        L_0x0042:
            byte[] r2 = a(r15, r15, r8)
            r12 = r2
            goto L_0x0257
        L_0x004b:
            r14 = r1
            r1 = 0
        L_0x004d:
            int r2 = r8.c(r13)
            if (r2 == 0) goto L_0x0057
            r17 = r1
            r15 = 1
            goto L_0x007c
        L_0x0057:
            boolean r2 = r8.e()
            r3 = 7
            if (r2 != 0) goto L_0x006e
            int r2 = r8.c(r3)
            if (r2 == 0) goto L_0x0069
            r17 = r1
            r15 = r2
            r2 = 0
            goto L_0x007c
        L_0x0069:
            r2 = 0
            r15 = 0
            r17 = 1
            goto L_0x007c
        L_0x006e:
            int r2 = r8.c(r3)
            int r3 = r8.c(r13)
            r17 = r1
            r15 = r2
            r2 = r3
        L_0x007c:
            if (r15 != 0) goto L_0x0080
            r9 = 1
            goto L_0x0099
        L_0x0080:
            if (r7 == 0) goto L_0x0098
            r1 = r24[r2]
            r7.setColor(r1)
            float r2 = (float) r14
            float r3 = (float) r11
            int r1 = r14 + r15
            float r4 = (float) r1
            int r1 = r11 + 1
            float r5 = (float) r1
            r1 = r29
            r9 = 1
            r6 = r28
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0099
        L_0x0098:
            r9 = 1
        L_0x0099:
            int r14 = r14 + r15
            if (r17 == 0) goto L_0x009f
            r1 = r14
            goto L_0x0257
        L_0x009f:
            r1 = r17
            r6 = 1
            goto L_0x004d
        L_0x00a3:
            r9 = 1
            if (r0 != r14) goto L_0x00ab
            byte[] r2 = defpackage.beo.j
            r17 = r2
            goto L_0x00ae
        L_0x00ab:
            r17 = 0
        L_0x00ae:
            r4 = r1
            r6 = 0
        L_0x00b0:
            int r1 = r8.c(r15)
            if (r1 == 0) goto L_0x00bd
            r2 = r1
            r19 = r6
            r18 = 1
            goto L_0x0139
        L_0x00bd:
            boolean r1 = r8.e()
            if (r1 != 0) goto L_0x00dc
            int r1 = r8.c(r14)
            if (r1 == 0) goto L_0x00d4
            int r1 = r1 + 2
            r18 = r1
            r19 = r6
            r2 = 0
            goto L_0x0139
        L_0x00d4:
            r2 = 0
            r18 = 0
            r19 = 1
            goto L_0x0139
        L_0x00dc:
            boolean r1 = r8.e()
            if (r1 != 0) goto L_0x00f1
            int r1 = r8.c(r5)
            int r1 = r1 + r15
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0139
        L_0x00f1:
            int r1 = r8.c(r5)
            if (r1 == 0) goto L_0x0131
            if (r1 == r9) goto L_0x0128
            if (r1 == r5) goto L_0x0117
            if (r1 == r14) goto L_0x0106
            r19 = r6
            r2 = 0
            r18 = 0
            goto L_0x0139
        L_0x0106:
            int r1 = r8.c(r13)
            int r1 = r1 + 25
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0139
        L_0x0117:
            int r1 = r8.c(r15)
            int r1 = r1 + 9
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0139
        L_0x0128:
            r19 = r6
            r2 = 0
            r18 = 2
            goto L_0x0139
        L_0x0131:
            r19 = r6
            r2 = 0
            r18 = 1
        L_0x0139:
            if (r18 != 0) goto L_0x013f
            r21 = r4
            r15 = 2
            goto L_0x0168
        L_0x013f:
            if (r7 == 0) goto L_0x0165
            if (r17 == 0) goto L_0x0146
            byte r2 = r17[r2]
            goto L_0x0147
        L_0x0146:
        L_0x0147:
            r1 = r24[r2]
            r7.setColor(r1)
            float r2 = (float) r4
            float r3 = (float) r11
            int r1 = r4 + r18
            float r6 = (float) r1
            int r1 = r11 + 1
            float r1 = (float) r1
            r20 = r1
            r1 = r29
            r21 = r4
            r4 = r6
            r6 = 2
            r5 = r20
            r15 = 2
            r6 = r28
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0168
        L_0x0165:
            r21 = r4
            r15 = 2
        L_0x0168:
            int r4 = r21 + r18
            if (r19 == 0) goto L_0x0173
            r8.f()
            r1 = r4
            goto L_0x0257
        L_0x0173:
            r6 = r19
            r5 = 2
            r15 = 4
            goto L_0x00b0
        L_0x0179:
            r9 = 1
            r15 = 2
            if (r0 == r14) goto L_0x018a
            if (r0 == r15) goto L_0x0182
            r17 = 0
            goto L_0x0193
        L_0x0182:
            if (r12 != 0) goto L_0x0187
            byte[] r2 = defpackage.beo.h
            goto L_0x018e
        L_0x0187:
            r17 = r12
            goto L_0x0193
        L_0x018a:
            if (r10 != 0) goto L_0x0191
            byte[] r2 = defpackage.beo.i
        L_0x018e:
            r17 = r2
            goto L_0x0193
        L_0x0191:
            r17 = r10
        L_0x0193:
            r5 = r1
            r6 = 0
        L_0x0195:
            int r1 = r8.c(r15)
            if (r1 == 0) goto L_0x01a3
            r2 = r1
            r19 = r6
            r4 = 4
            r18 = 1
            goto L_0x0212
        L_0x01a3:
            boolean r1 = r8.e()
            if (r1 == 0) goto L_0x01b9
            int r1 = r8.c(r14)
            int r1 = r1 + r14
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            r4 = 4
            goto L_0x0212
        L_0x01b9:
            boolean r1 = r8.e()
            if (r1 != 0) goto L_0x020a
            int r1 = r8.c(r15)
            if (r1 == 0) goto L_0x0201
            if (r1 == r9) goto L_0x01f8
            if (r1 == r15) goto L_0x01e6
            if (r1 == r14) goto L_0x01d4
            r19 = r6
            r2 = 0
            r4 = 4
            r18 = 0
            goto L_0x0212
        L_0x01d4:
            int r1 = r8.c(r13)
            int r1 = r1 + 29
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            r4 = 4
            goto L_0x0212
        L_0x01e6:
            r4 = 4
            int r1 = r8.c(r4)
            int r1 = r1 + 12
            int r2 = r8.c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0212
        L_0x01f8:
            r4 = 4
            r19 = r6
            r2 = 0
            r18 = 2
            goto L_0x0212
        L_0x0201:
            r4 = 4
            r2 = 0
            r18 = 0
            r19 = 1
            goto L_0x0212
        L_0x020a:
            r4 = 4
            r19 = r6
            r2 = 0
            r18 = 1
        L_0x0212:
            if (r18 != 0) goto L_0x0219
            r22 = r5
            r21 = 4
            goto L_0x0243
        L_0x0219:
            if (r7 == 0) goto L_0x023f
            if (r17 == 0) goto L_0x0220
            byte r2 = r17[r2]
            goto L_0x0221
        L_0x0220:
        L_0x0221:
            r1 = r24[r2]
            r7.setColor(r1)
            float r2 = (float) r5
            float r3 = (float) r11
            int r1 = r5 + r18
            float r6 = (float) r1
            int r1 = r11 + 1
            float r1 = (float) r1
            r20 = r1
            r1 = r29
            r21 = 4
            r4 = r6
            r22 = r5
            r5 = r20
            r6 = r28
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0243
        L_0x023f:
            r22 = r5
            r21 = 4
        L_0x0243:
            int r5 = r22 + r18
            if (r19 != 0) goto L_0x024b
            r6 = r19
            goto L_0x0195
        L_0x024b:
            r8.f()
            r1 = r5
            goto L_0x0257
        L_0x0251:
            int r11 = r11 + 2
            r1 = r26
        L_0x0257:
            goto L_0x0011
        L_0x025a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beo.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static beg a(bkx bkx, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        bkx bkx2 = bkx;
        int i7 = 8;
        int c2 = bkx2.c(8);
        bkx2.b(8);
        int i8 = i2 - 2;
        int[] a2 = a();
        int[] b2 = b();
        int[] c3 = c();
        while (i8 > 0) {
            int c4 = bkx2.c(i7);
            int c5 = bkx2.c(i7);
            int i9 = i8 - 2;
            int[] iArr = (c5 & 128) == 0 ? (c5 & 64) != 0 ? b2 : c3 : a2;
            if ((c5 & 1) == 0) {
                i5 = bkx2.c(6) << 2;
                i3 = bkx2.c(4) << 4;
                i4 = bkx2.c(4) << 4;
                i6 = bkx2.c(2) << 6;
                i8 = i9 - 2;
            } else {
                i5 = bkx2.c(i7);
                i3 = bkx2.c(i7);
                i4 = bkx2.c(i7);
                i6 = bkx2.c(i7);
                i8 = i9 - 4;
            }
            if (i5 == 0) {
                i6 = 255;
            }
            if (i5 == 0) {
                i4 = 0;
            }
            if (i5 == 0) {
                i3 = 0;
            }
            double d2 = (double) i5;
            double d3 = (double) (i3 - 128);
            double d4 = (double) (i4 - 128);
            Double.isNaN(d3);
            Double.isNaN(d2);
            int a3 = blm.a((int) (d2 + (1.402d * d3)), 0, 255);
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            int a4 = blm.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[c4] = a((byte) (255 - (i6 & 255)), a3, a4, blm.a((int) (d2 + (d4 * 1.772d)), 0, 255));
            bkx2 = bkx;
            c2 = c2;
            i7 = 8;
        }
        return new beg(c2, a2, b2, c3);
    }

    public static bei a(bkx bkx) {
        byte[] bArr;
        int c2 = bkx.c(16);
        bkx.b(4);
        int c3 = bkx.c(2);
        boolean e2 = bkx.e();
        bkx.b(1);
        byte[] bArr2 = null;
        if (c3 == 1) {
            bkx.b(bkx.c(8) << 4);
        } else if (c3 == 0) {
            int c4 = bkx.c(16);
            int c5 = bkx.c(16);
            if (c4 > 0) {
                byte[] bArr3 = new byte[c4];
                bkx.c(bArr3, c4);
                bArr2 = bArr3;
            }
            if (c5 > 0) {
                bArr = new byte[c5];
                bkx.c(bArr, c5);
                return new bei(c2, e2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new bei(c2, e2, bArr2, bArr);
    }
}
