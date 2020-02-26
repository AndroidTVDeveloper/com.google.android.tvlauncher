package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: bkw */
/* compiled from: PG */
public final class bkw {

    /* renamed from: a */
    public static final byte[] f4250a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f4251b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f4252c = new Object();

    /* renamed from: d */
    private static int[] f4253d = new int[10];

    /* renamed from: a */
    public static void m3528a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    public static void m3527a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008b, code lost:
        r9 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3525a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            p000.bks.m3512b(r3)
            if (r0 == 0) goto L_0x00c3
            r3 = 2
            if (r11 != 0) goto L_0x0012
            goto L_0x0044
        L_0x0012:
            boolean r4 = r11[r1]
            if (r4 == 0) goto L_0x001d
            m3528a(r11)
            int r9 = r9 + -3
            return r9
        L_0x001d:
            if (r0 <= r2) goto L_0x002e
            boolean r4 = r11[r2]
            if (r4 == 0) goto L_0x002e
            byte r4 = r8[r9]
            if (r4 == r2) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            m3528a(r11)
            int r9 = r9 + -2
            return r9
        L_0x002e:
            if (r0 <= r3) goto L_0x0044
            boolean r4 = r11[r3]
            if (r4 == 0) goto L_0x0044
            byte r4 = r8[r9]
            if (r4 != 0) goto L_0x0044
            int r4 = r9 + 1
            byte r4 = r8[r4]
            if (r4 != r2) goto L_0x0044
            m3528a(r11)
            int r9 = r9 + -1
            return r9
        L_0x0044:
            int r4 = r10 + -1
            int r9 = r9 + r3
        L_0x0047:
            if (r9 >= r4) goto L_0x0068
            byte r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            int r6 = r9 + -2
            byte r7 = r8[r6]
            if (r7 != 0) goto L_0x0064
            int r9 = r9 + -1
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x0064
            if (r5 != r2) goto L_0x0064
            if (r11 == 0) goto L_0x0063
            m3528a(r11)
        L_0x0063:
            return r6
        L_0x0064:
            r9 = r6
        L_0x0065:
            int r9 = r9 + 3
            goto L_0x0047
        L_0x0068:
            if (r11 == 0) goto L_0x00c2
            if (r0 <= r3) goto L_0x0080
            int r9 = r10 + -3
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007e
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007e
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007d
            goto L_0x008b
        L_0x007d:
        L_0x007e:
            r9 = 0
            goto L_0x009d
        L_0x0080:
            if (r0 == r3) goto L_0x008d
            boolean r9 = r11[r2]
            if (r9 == 0) goto L_0x007e
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007e
        L_0x008b:
            r9 = 1
            goto L_0x009d
        L_0x008d:
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x007e
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007e
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007e
            goto L_0x008b
        L_0x009d:
            r11[r1] = r9
            if (r0 <= r2) goto L_0x00ad
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x00b8
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00ac
            goto L_0x00b6
        L_0x00ac:
            goto L_0x00b8
        L_0x00ad:
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x00b8
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00b8
        L_0x00b6:
            r9 = 1
            goto L_0x00b9
        L_0x00b8:
            r9 = 0
        L_0x00b9:
            r11[r2] = r9
            byte r8 = r8[r4]
            if (r8 != 0) goto L_0x00c0
            r1 = 1
        L_0x00c0:
            r11[r3] = r1
        L_0x00c2:
            return r10
        L_0x00c3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bkw.m3525a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: c */
    public static int m3531c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: b */
    public static int m3530b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: a */
    public static boolean m3529a(String str, byte b) {
        if (!"video/avc".equals(str) || (b & 31) != 6) {
            return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
        }
        return true;
    }

    /* renamed from: d */
    public static bku m3532d(byte[] bArr, int i) {
        bkz bkz = new bkz(bArr, 3, i);
        bkz.mo2093a(8);
        int e = bkz.mo2100e();
        int e2 = bkz.mo2100e();
        bkz.mo2092a();
        return new bku(e, e2, bkz.mo2095b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.bkv m3526a(byte[] r22, int r23, int r24) {
        /*
            bkz r0 = new bkz
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo2093a(r1)
            int r3 = r0.mo2097c(r1)
            int r4 = r0.mo2097c(r1)
            int r5 = r0.mo2097c(r1)
            int r6 = r0.mo2100e()
            r7 = 3
            r9 = 1
            r10 = 100
            if (r3 != r10) goto L_0x0027
            goto L_0x004e
        L_0x0027:
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 1
            r11 = 0
            goto L_0x00a7
        L_0x004e:
            int r10 = r0.mo2100e()
            if (r10 != r7) goto L_0x0059
            boolean r11 = r0.mo2095b()
            goto L_0x005b
        L_0x0059:
            r11 = 0
        L_0x005b:
            r0.mo2100e()
            r0.mo2100e()
            r0.mo2092a()
            boolean r12 = r0.mo2095b()
            if (r12 != 0) goto L_0x006b
        L_0x006a:
            goto L_0x00a7
        L_0x006b:
            if (r10 == r7) goto L_0x0071
            r12 = 8
            goto L_0x0074
        L_0x0071:
            r12 = 12
        L_0x0074:
            r13 = 0
        L_0x0075:
            if (r13 >= r12) goto L_0x006a
            boolean r14 = r0.mo2095b()
            if (r14 != 0) goto L_0x007e
        L_0x007d:
            goto L_0x00a4
        L_0x007e:
            r14 = 6
            if (r13 >= r14) goto L_0x0084
            r14 = 16
            goto L_0x0087
        L_0x0084:
            r14 = 64
        L_0x0087:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x008c:
            if (r15 >= r14) goto L_0x007d
            if (r16 == 0) goto L_0x009c
            int r16 = r0.mo2099d()
            int r8 = r17 + r16
            int r8 = r8 + 256
            int r8 = r8 % 256
            r16 = r8
        L_0x009c:
            if (r16 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r17 = r16
        L_0x00a1:
            int r15 = r15 + 1
            goto L_0x008c
        L_0x00a4:
            int r13 = r13 + 1
            goto L_0x0075
        L_0x00a7:
            int r8 = r0.mo2100e()
            int r12 = r8 + 4
            int r13 = r0.mo2100e()
            if (r13 != 0) goto L_0x00bc
            int r8 = r0.mo2100e()
            int r8 = r8 + 4
            r14 = r8
        L_0x00ba:
            r15 = 0
            goto L_0x00e5
        L_0x00bc:
            if (r13 != r9) goto L_0x00e3
            boolean r8 = r0.mo2095b()
            r0.mo2099d()
            r0.mo2099d()
            int r14 = r0.mo2100e()
            long r14 = (long) r14
            r2 = 0
        L_0x00cf:
            r16 = r8
            long r7 = (long) r2
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00df
            r0.mo2100e()
            int r2 = r2 + 1
            r8 = r16
            r7 = 3
            goto L_0x00cf
        L_0x00df:
            r15 = r16
            r14 = 0
            goto L_0x00e5
        L_0x00e3:
            r14 = 0
            goto L_0x00ba
        L_0x00e5:
            r0.mo2100e()
            r0.mo2092a()
            int r2 = r0.mo2100e()
            int r2 = r2 + r9
            int r7 = r0.mo2100e()
            boolean r16 = r0.mo2095b()
            r8 = 2
            int r17 = 2 - r16
            int r7 = r7 + r9
            int r7 = r7 * r17
            if (r16 != 0) goto L_0x0103
            r0.mo2092a()
        L_0x0103:
            r0.mo2092a()
            int r2 = r2 << 4
            int r7 = r7 << 4
            boolean r18 = r0.mo2095b()
            if (r18 == 0) goto L_0x013f
            int r18 = r0.mo2100e()
            int r19 = r0.mo2100e()
            int r20 = r0.mo2100e()
            int r21 = r0.mo2100e()
            if (r10 != 0) goto L_0x0124
            r8 = 1
            goto L_0x0132
        L_0x0124:
            r8 = 3
            if (r10 != r8) goto L_0x012a
            r8 = 1
            goto L_0x012b
        L_0x012a:
            r8 = 2
        L_0x012b:
            if (r10 != r9) goto L_0x012e
            r9 = 2
        L_0x012e:
            int r17 = r17 * r9
        L_0x0132:
            int r18 = r18 + r19
            int r18 = r18 * r8
            int r2 = r2 - r18
            int r20 = r20 + r21
            int r20 = r20 * r17
            int r7 = r7 - r20
            goto L_0x0140
        L_0x013f:
        L_0x0140:
            r8 = r7
            r7 = r2
            boolean r2 = r0.mo2095b()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0191
            boolean r2 = r0.mo2095b()
            if (r2 == 0) goto L_0x0190
            int r1 = r0.mo2097c(r1)
            r2 = 255(0xff, float:3.57E-43)
            if (r1 != r2) goto L_0x016c
            r1 = 16
            int r2 = r0.mo2097c(r1)
            int r0 = r0.mo2097c(r1)
            if (r2 != 0) goto L_0x0165
            goto L_0x0191
        L_0x0165:
            if (r0 == 0) goto L_0x0191
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            r9 = r1
            goto L_0x0192
        L_0x016c:
            float[] r0 = p000.bkw.f4251b
            int r2 = r0.length
            if (r1 < r2) goto L_0x018b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 46
            r0.<init>(r2)
            java.lang.String r2 = "Unexpected aspect_ratio_idc value: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NalUnitUtil"
            android.util.Log.w(r1, r0)
            goto L_0x0192
        L_0x018b:
            r0 = r0[r1]
            r9 = r0
            goto L_0x0192
        L_0x0190:
        L_0x0191:
        L_0x0192:
            bkv r0 = new bkv
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bkw.m3526a(byte[], int, int):bkv");
    }

    /* renamed from: a */
    public static int m3524a(byte[] bArr, int i) {
        int i2;
        synchronized (f4252c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    if (f4253d.length <= i4) {
                        int[] iArr = f4253d;
                        int length = f4253d.length;
                        f4253d = Arrays.copyOf(iArr, length + length);
                    }
                    f4253d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                try {
                    int i8 = f4253d[i5] - i6;
                    System.arraycopy(bArr, i6, bArr, i7, i8);
                    int i9 = i7 + i8;
                    int i10 = i9 + 1;
                    bArr[i9] = 0;
                    i7 = i10 + 1;
                    bArr[i10] = 0;
                    i6 += i8 + 3;
                    i5++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}
