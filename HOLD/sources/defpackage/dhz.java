package defpackage;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* renamed from: dhz  reason: default package */
/* compiled from: PG */
public final class dhz {
    public static double a(int i) {
        if (i == 1) {
            return 1.5d;
        }
        if (i == 2) {
            return 1.3333333333333333d;
        }
        if (i == 3) {
            return 1.0d;
        }
        if (i != 4) {
            return i != 5 ? 1.7777777777777777d : 0.6939625260235947d;
        }
        return 0.6666666666666666d;
    }

    public static ctq b(Context context) {
        Resources resources = context.getResources();
        ctq ctq = new ctq();
        ctq.a = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctq.b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
        ctq.c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
        ctq.d = resources.getDimensionPixelSize(R.dimen.program_default_margin_horizontal);
        ctq.e = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
        ctq.f = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
        ctq.g = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        ctq.h = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        ctq.i = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctq.j = resources.getDimensionPixelSize(R.dimen.program_selected_margin_vertical);
        ctq.k = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
        ctq.l = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
        ctq.m = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_horizontal);
        ctq.n = resources.getInteger(R.integer.program_focused_animation_duration_ms);
        ctq.o = resources.getFraction(R.fraction.program_focused_scale, 1, 1);
        ctq.p = resources.getDimension(R.dimen.program_focused_elevation);
        return ctq;
    }

    public static void a(View view, int i, double d, ctq ctq) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        switch (i) {
            case 0:
                marginLayoutParams.height = ctq.a;
                marginLayoutParams.setMargins(0, ctq.b, 0, ctq.c);
                marginLayoutParams.setMarginEnd(ctq.d);
                break;
            case 1:
            case 2:
                marginLayoutParams.height = ctq.e;
                marginLayoutParams.setMargins(0, ctq.f, 0, ctq.h);
                marginLayoutParams.setMarginEnd(ctq.d);
                break;
            case 3:
                marginLayoutParams.height = ctq.e;
                marginLayoutParams.setMargins(0, ctq.f, 0, ctq.g);
                marginLayoutParams.setMarginEnd(ctq.d);
                break;
            case 4:
            case 5:
            case 13:
                marginLayoutParams.height = ctq.i;
                int i2 = ctq.j;
                marginLayoutParams.setMargins(0, i2, 0, i2);
                marginLayoutParams.setMarginEnd(ctq.d);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                marginLayoutParams.height = ctq.k;
                int i3 = ctq.l;
                marginLayoutParams.setMargins(0, i3, 0, i3);
                marginLayoutParams.setMarginEnd(ctq.m);
                break;
        }
        double d2 = (double) marginLayoutParams.height;
        Double.isNaN(d2);
        marginLayoutParams.width = (int) Math.round(d2 * d);
        view.setLayoutParams(marginLayoutParams);
    }

    public static boolean a(Context context, String str) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (str.equals(featureInfo.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        return a(context, "com.google.android.tv.operator_tier");
    }

    static int e(byte[] bArr, int i, dhy dhy) {
        int a = a(bArr, i, dhy);
        int i2 = dhy.a;
        if (i2 < 0) {
            throw djn.b();
        } else if (i2 > bArr.length - a) {
            throw djn.a();
        } else if (i2 != 0) {
            dhy.c = dik.a(bArr, a, i2);
            return a + i2;
        } else {
            dhy.c = dik.b;
            return a;
        }
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int a(dkw dkw, byte[] bArr, int i, int i2, int i3, dhy dhy) {
        dkm dkm = (dkm) dkw;
        Object a = dkm.a();
        int a2 = dkm.a(a, bArr, i, i2, i3, dhy);
        dkm.c(a);
        dhy.c = a;
        return a2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(defpackage.dkw r6, byte[] r7, int r8, int r9, defpackage.dhy r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000d
            int r0 = a(r8, r7, r0, r10)
            int r8 = r10.a
            goto L_0x000e
        L_0x000d:
        L_0x000e:
            r3 = r0
            if (r8 < 0) goto L_0x0027
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0027
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.c = r9
            return r8
        L_0x0027:
            djn r6 = defpackage.djn.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhz.a(dkw, byte[], int, int, dhy):int");
    }

    static int a(dkw dkw, int i, byte[] bArr, int i2, int i3, djk djk, dhy dhy) {
        int a = a(dkw, bArr, i2, i3, dhy);
        djk.add(dhy.c);
        while (a < i3) {
            int a2 = a(bArr, a, dhy);
            if (i != dhy.a) {
                break;
            }
            a = a(dkw, bArr, a2, i3, dhy);
            djk.add(dhy.c);
        }
        return a;
    }

    static int a(byte[] bArr, int i, djk djk, dhy dhy) {
        djf djf = (djf) djk;
        int a = a(bArr, i, dhy);
        int i2 = dhy.a + a;
        while (a < i2) {
            a = a(bArr, a, dhy);
            djf.d(dhy.a);
        }
        if (a == i2) {
            return a;
        }
        throw djn.a();
    }

    static int c(byte[] bArr, int i, dhy dhy) {
        int a = a(bArr, i, dhy);
        int i2 = dhy.a;
        if (i2 < 0) {
            throw djn.b();
        } else if (i2 != 0) {
            dhy.c = new String(bArr, a, i2, djl.a);
            return a + i2;
        } else {
            dhy.c = "";
            return a;
        }
    }

    static int d(byte[] bArr, int i, dhy dhy) {
        int a = a(bArr, i, dhy);
        int i2 = dhy.a;
        if (i2 < 0) {
            throw djn.b();
        } else if (i2 != 0) {
            dhy.c = dmb.a.b(bArr, a, i2);
            return a + i2;
        } else {
            dhy.c = "";
            return a;
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, dlm dlm, dhy dhy) {
        if (dme.b(i) != 0) {
            int a = dme.a(i);
            if (a == 0) {
                int b = b(bArr, i2, dhy);
                dlm.a(i, Long.valueOf(dhy.b));
                return b;
            } else if (a == 1) {
                dlm.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int a2 = a(bArr, i2, dhy);
                int i4 = dhy.a;
                if (i4 < 0) {
                    throw djn.b();
                } else if (i4 <= bArr.length - a2) {
                    if (i4 == 0) {
                        dlm.a(i, dik.b);
                    } else {
                        dlm.a(i, dik.a(bArr, a2, i4));
                    }
                    return a2 + i4;
                } else {
                    throw djn.a();
                }
            } else if (a == 3) {
                int i5 = (i & -8) | 4;
                dlm a3 = dlm.a();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a4 = a(bArr, i2, dhy);
                    int i7 = dhy.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = a4;
                        break;
                    }
                    i6 = i7;
                    i2 = a(i7, bArr, a4, i3, a3, dhy);
                }
                if (i2 > i3 || i6 != i5) {
                    throw djn.e();
                }
                dlm.a(i, a3);
                return i2;
            } else if (a == 5) {
                dlm.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw djn.c();
            }
        } else {
            throw djn.c();
        }
    }

    static int a(int i, byte[] bArr, int i2, dhy dhy) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            dhy.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            dhy.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dhy.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 < 0) {
            int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
            while (true) {
                int i12 = i10 + 1;
                if (bArr[i10] < 0) {
                    i10 = i12;
                } else {
                    dhy.a = i11;
                    return i12;
                }
            }
        } else {
            dhy.a = i9 | (b4 << 28);
            return i10;
        }
    }

    static int a(byte[] bArr, int i, dhy dhy) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a(b, bArr, i2, dhy);
        }
        dhy.a = b;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, djk djk, dhy dhy) {
        djf djf = (djf) djk;
        int a = a(bArr, i2, dhy);
        djf.d(dhy.a);
        while (a < i3) {
            int a2 = a(bArr, a, dhy);
            if (i != dhy.a) {
                break;
            }
            a = a(bArr, a2, dhy);
            djf.d(dhy.a);
        }
        return a;
    }

    static int b(byte[] bArr, int i, dhy dhy) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            dhy.b = j2;
            return i3;
        }
        dhy.b = j;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, dhy dhy) {
        if (dme.b(i) != 0) {
            int a = dme.a(i);
            if (a == 0) {
                return b(bArr, i2, dhy);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return a(bArr, i2, dhy) + dhy.a;
            }
            if (a == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, dhy);
                    i5 = dhy.a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = a(i5, bArr, i2, i3, dhy);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw djn.e();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw djn.c();
            }
        } else {
            throw djn.c();
        }
    }
}
