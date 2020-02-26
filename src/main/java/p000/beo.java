package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: beo */
/* compiled from: PG */
final class beo {

    /* renamed from: h */
    private static final byte[] f3567h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f3568i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f3569j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f3570a;

    /* renamed from: b */
    public final Paint f3571b;

    /* renamed from: c */
    public final Canvas f3572c = new Canvas();

    /* renamed from: d */
    public final beh f3573d = new beh(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final beg f3574e = new beg(0, m2988a(), m2989b(), m2990c());

    /* renamed from: f */
    public final ben f3575f;

    /* renamed from: g */
    public Bitmap f3576g;

    /* renamed from: a */
    private static int m2983a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public beo(int i, int i2) {
        Paint paint = new Paint();
        this.f3570a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3570a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f3570a.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f3571b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3571b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f3571b.setPathEffect(null);
        this.f3575f = new ben(i, i2);
    }

    /* renamed from: a */
    private static byte[] m2987a(int i, int i2, bkx bkx) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) bkx.mo2057c(i2);
        }
        return bArr;
    }

    /* renamed from: a */
    private static int[] m2988a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: b */
    private static int[] m2989b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i >= 8) {
                int i2 = 127;
                int i3 = (i & 1) == 0 ? 0 : 127;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m2983a(255, i3, i4, i2);
            } else {
                iArr[i] = m2983a(255, (i & 1) == 0 ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int[] m2990c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i >= 8) {
                int i3 = i & 136;
                int i4 = 170;
                int i5 = 85;
                if (i3 == 0) {
                    int i6 = ((i & 1) == 0 ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    int i7 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = m2983a(255, i6, i7, i5 + i4);
                } else if (i3 != 8) {
                    int i8 = 43;
                    if (i3 == 128) {
                        int i9 = ((i & 1) == 0 ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i10 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i8 = 0;
                        }
                        int i11 = i8 + 127;
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = m2983a(255, i9, i10, i11 + i5);
                    } else if (i3 == 136) {
                        int i12 = ((i & 1) == 0 ? 0 : 43) + ((i & 16) != 0 ? 85 : 0);
                        int i13 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i8 = 0;
                        }
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = m2983a(255, i12, i13, i8 + i5);
                    }
                } else {
                    int i14 = ((i & 1) == 0 ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    int i15 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = m2983a(127, i14, i15, i5 + i4);
                }
            } else {
                int i16 = (i & 1) == 0 ? 0 : 255;
                int i17 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m2983a(63, i16, i17, i2);
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2986a(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
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
            int r2 = r8.mo2049a()
            if (r2 == 0) goto L_0x025a
            r13 = 8
            int r2 = r8.mo2057c(r13)
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
            byte[] r2 = m2987a(r2, r13, r8)
            r10 = r2
            goto L_0x0257
        L_0x0039:
            byte[] r2 = m2987a(r15, r13, r8)
            r10 = r2
            goto L_0x0257
        L_0x0042:
            byte[] r2 = m2987a(r15, r15, r8)
            r12 = r2
            goto L_0x0257
        L_0x004b:
            r14 = r1
            r1 = 0
        L_0x004d:
            int r2 = r8.mo2057c(r13)
            if (r2 == 0) goto L_0x0057
            r17 = r1
            r15 = 1
            goto L_0x007c
        L_0x0057:
            boolean r2 = r8.mo2060e()
            r3 = 7
            if (r2 != 0) goto L_0x006e
            int r2 = r8.mo2057c(r3)
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
            int r2 = r8.mo2057c(r3)
            int r3 = r8.mo2057c(r13)
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
            byte[] r2 = p000.beo.f3569j
            r17 = r2
            goto L_0x00ae
        L_0x00ab:
            r17 = 0
        L_0x00ae:
            r4 = r1
            r6 = 0
        L_0x00b0:
            int r1 = r8.mo2057c(r15)
            if (r1 == 0) goto L_0x00bd
            r2 = r1
            r19 = r6
            r18 = 1
            goto L_0x0139
        L_0x00bd:
            boolean r1 = r8.mo2060e()
            if (r1 != 0) goto L_0x00dc
            int r1 = r8.mo2057c(r14)
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
            boolean r1 = r8.mo2060e()
            if (r1 != 0) goto L_0x00f1
            int r1 = r8.mo2057c(r5)
            int r1 = r1 + r15
            int r2 = r8.mo2057c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0139
        L_0x00f1:
            int r1 = r8.mo2057c(r5)
            if (r1 == 0) goto L_0x0131
            if (r1 == r9) goto L_0x0128
            if (r1 == r5) goto L_0x0117
            if (r1 == r14) goto L_0x0106
            r19 = r6
            r2 = 0
            r18 = 0
            goto L_0x0139
        L_0x0106:
            int r1 = r8.mo2057c(r13)
            int r1 = r1 + 25
            int r2 = r8.mo2057c(r15)
            r18 = r1
            r19 = r6
            goto L_0x0139
        L_0x0117:
            int r1 = r8.mo2057c(r15)
            int r1 = r1 + 9
            int r2 = r8.mo2057c(r15)
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
            r8.mo2061f()
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
            byte[] r2 = p000.beo.f3567h
            goto L_0x018e
        L_0x0187:
            r17 = r12
            goto L_0x0193
        L_0x018a:
            if (r10 != 0) goto L_0x0191
            byte[] r2 = p000.beo.f3568i
        L_0x018e:
            r17 = r2
            goto L_0x0193
        L_0x0191:
            r17 = r10
        L_0x0193:
            r5 = r1
            r6 = 0
        L_0x0195:
            int r1 = r8.mo2057c(r15)
            if (r1 == 0) goto L_0x01a3
            r2 = r1
            r19 = r6
            r4 = 4
            r18 = 1
            goto L_0x0212
        L_0x01a3:
            boolean r1 = r8.mo2060e()
            if (r1 == 0) goto L_0x01b9
            int r1 = r8.mo2057c(r14)
            int r1 = r1 + r14
            int r2 = r8.mo2057c(r15)
            r18 = r1
            r19 = r6
            r4 = 4
            goto L_0x0212
        L_0x01b9:
            boolean r1 = r8.mo2060e()
            if (r1 != 0) goto L_0x020a
            int r1 = r8.mo2057c(r15)
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
            int r1 = r8.mo2057c(r13)
            int r1 = r1 + 29
            int r2 = r8.mo2057c(r15)
            r18 = r1
            r19 = r6
            r4 = 4
            goto L_0x0212
        L_0x01e6:
            r4 = 4
            int r1 = r8.mo2057c(r4)
            int r1 = r1 + 12
            int r2 = r8.mo2057c(r15)
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
            r8.mo2061f()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.beo.m2986a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public static beg m2984a(bkx bkx, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        bkx bkx2 = bkx;
        int i6 = 8;
        int c = bkx2.mo2057c(8);
        bkx2.mo2054b(8);
        int i7 = i - 2;
        int[] a = m2988a();
        int[] b = m2989b();
        int[] c2 = m2990c();
        while (i7 > 0) {
            int c3 = bkx2.mo2057c(i6);
            int c4 = bkx2.mo2057c(i6);
            int i8 = i7 - 2;
            int[] iArr = (c4 & 128) == 0 ? (c4 & 64) != 0 ? b : c2 : a;
            if ((c4 & 1) == 0) {
                i4 = bkx2.mo2057c(6) << 2;
                i2 = bkx2.mo2057c(4) << 4;
                i3 = bkx2.mo2057c(4) << 4;
                i5 = bkx2.mo2057c(2) << 6;
                i7 = i8 - 2;
            } else {
                i4 = bkx2.mo2057c(i6);
                i2 = bkx2.mo2057c(i6);
                i3 = bkx2.mo2057c(i6);
                i5 = bkx2.mo2057c(i6);
                i7 = i8 - 4;
            }
            if (i4 == 0) {
                i5 = 255;
            }
            if (i4 == 0) {
                i3 = 0;
            }
            if (i4 == 0) {
                i2 = 0;
            }
            double d = (double) i4;
            double d2 = (double) (i2 - 128);
            double d3 = (double) (i3 - 128);
            Double.isNaN(d2);
            Double.isNaN(d);
            int a2 = blm.m3624a((int) (d + (1.402d * d2)), 0, 255);
            Double.isNaN(d3);
            Double.isNaN(d);
            Double.isNaN(d2);
            int a3 = blm.m3624a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255);
            Double.isNaN(d3);
            Double.isNaN(d);
            iArr[c3] = m2983a((byte) (255 - (i5 & 255)), a2, a3, blm.m3624a((int) (d + (d3 * 1.772d)), 0, 255));
            bkx2 = bkx;
            c = c;
            i6 = 8;
        }
        return new beg(c, a, b, c2);
    }

    /* renamed from: a */
    public static bei m2985a(bkx bkx) {
        byte[] bArr;
        int c = bkx.mo2057c(16);
        bkx.mo2054b(4);
        int c2 = bkx.mo2057c(2);
        boolean e = bkx.mo2060e();
        bkx.mo2054b(1);
        byte[] bArr2 = null;
        if (c2 == 1) {
            bkx.mo2054b(bkx.mo2057c(8) << 4);
        } else if (c2 == 0) {
            int c3 = bkx.mo2057c(16);
            int c4 = bkx.mo2057c(16);
            if (c3 > 0) {
                byte[] bArr3 = new byte[c3];
                bkx.mo2058c(bArr3, c3);
                bArr2 = bArr3;
            }
            if (c4 > 0) {
                bArr = new byte[c4];
                bkx.mo2058c(bArr, c4);
                return new bei(c, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new bei(c, e, bArr2, bArr);
    }
}
