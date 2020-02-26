package p000;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* renamed from: dhz */
/* compiled from: PG */
public final class dhz {
    /* renamed from: a */
    public static double m6469a(int i) {
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

    /* renamed from: b */
    public static ctq m6485b(Context context) {
        Resources resources = context.getResources();
        ctq ctq = new ctq();
        ctq.f7400a = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctq.f7401b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
        ctq.f7402c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
        ctq.f7403d = resources.getDimensionPixelSize(R.dimen.program_default_margin_horizontal);
        ctq.f7404e = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
        ctq.f7405f = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
        ctq.f7406g = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        ctq.f7407h = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
        ctq.f7408i = resources.getDimensionPixelSize(R.dimen.program_default_height);
        ctq.f7409j = resources.getDimensionPixelSize(R.dimen.program_selected_margin_vertical);
        ctq.f7410k = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
        ctq.f7411l = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
        ctq.f7412m = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_horizontal);
        ctq.f7413n = resources.getInteger(R.integer.program_focused_animation_duration_ms);
        ctq.f7414o = resources.getFraction(R.fraction.program_focused_scale, 1, 1);
        ctq.f7415p = resources.getDimension(R.dimen.program_focused_elevation);
        return ctq;
    }

    /* renamed from: a */
    public static void m6480a(View view, int i, double d, ctq ctq) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        switch (i) {
            case 0:
                marginLayoutParams.height = ctq.f7400a;
                marginLayoutParams.setMargins(0, ctq.f7401b, 0, ctq.f7402c);
                marginLayoutParams.setMarginEnd(ctq.f7403d);
                break;
            case 1:
            case 2:
                marginLayoutParams.height = ctq.f7404e;
                marginLayoutParams.setMargins(0, ctq.f7405f, 0, ctq.f7407h);
                marginLayoutParams.setMarginEnd(ctq.f7403d);
                break;
            case 3:
                marginLayoutParams.height = ctq.f7404e;
                marginLayoutParams.setMargins(0, ctq.f7405f, 0, ctq.f7406g);
                marginLayoutParams.setMarginEnd(ctq.f7403d);
                break;
            case 4:
            case 5:
            case 13:
                marginLayoutParams.height = ctq.f7408i;
                int i2 = ctq.f7409j;
                marginLayoutParams.setMargins(0, i2, 0, i2);
                marginLayoutParams.setMarginEnd(ctq.f7403d);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                marginLayoutParams.height = ctq.f7410k;
                int i3 = ctq.f7411l;
                marginLayoutParams.setMargins(0, i3, 0, i3);
                marginLayoutParams.setMarginEnd(ctq.f7412m);
                break;
        }
        double d2 = (double) marginLayoutParams.height;
        Double.isNaN(d2);
        marginLayoutParams.width = (int) Math.round(d2 * d);
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public static boolean m6482a(Context context, String str) {
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

    /* renamed from: a */
    public static boolean m6481a(Context context) {
        return m6482a(context, "com.google.android.tv.operator_tier");
    }

    /* renamed from: e */
    static int m6490e(byte[] bArr, int i, dhy dhy) {
        int a = m6478a(bArr, i, dhy);
        int i2 = dhy.f8567a;
        if (i2 < 0) {
            throw djn.m6732b();
        } else if (i2 > bArr.length - a) {
            throw djn.m6731a();
        } else if (i2 != 0) {
            dhy.f8569c = dik.m6515a(bArr, a, i2);
            return a + i2;
        } else {
            dhy.f8569c = dik.f8583b;
            return a;
        }
    }

    /* renamed from: c */
    static double m6486c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m6484b(bArr, i));
    }

    /* renamed from: a */
    static int m6477a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m6484b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: d */
    static float m6488d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m6477a(bArr, i));
    }

    /* renamed from: a */
    static int m6475a(dkw dkw, byte[] bArr, int i, int i2, int i3, dhy dhy) {
        dkm dkm = (dkm) dkw;
        Object a = dkm.mo4576a();
        int a2 = dkm.mo4575a(a, bArr, i, i2, i3, dhy);
        dkm.mo4582c(a);
        dhy.f8569c = a;
        return a2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m6476a(p000.dkw r6, byte[] r7, int r8, int r9, p000.dhy r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000d
            int r0 = m6473a(r8, r7, r0, r10)
            int r8 = r10.f8567a
            goto L_0x000e
        L_0x000d:
        L_0x000e:
            r3 = r0
            if (r8 < 0) goto L_0x0027
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0027
            java.lang.Object r9 = r6.mo4576a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo4578a(r1, r2, r3, r4, r5)
            r6.mo4582c(r9)
            r10.f8569c = r9
            return r8
        L_0x0027:
            djn r6 = p000.djn.m6731a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dhz.m6476a(dkw, byte[], int, int, dhy):int");
    }

    /* renamed from: a */
    static int m6474a(dkw dkw, int i, byte[] bArr, int i2, int i3, djk djk, dhy dhy) {
        int a = m6476a(dkw, bArr, i2, i3, dhy);
        djk.add(dhy.f8569c);
        while (a < i3) {
            int a2 = m6478a(bArr, a, dhy);
            if (i != dhy.f8567a) {
                break;
            }
            a = m6476a(dkw, bArr, a2, i3, dhy);
            djk.add(dhy.f8569c);
        }
        return a;
    }

    /* renamed from: a */
    static int m6479a(byte[] bArr, int i, djk djk, dhy dhy) {
        djf djf = (djf) djk;
        int a = m6478a(bArr, i, dhy);
        int i2 = dhy.f8567a + a;
        while (a < i2) {
            a = m6478a(bArr, a, dhy);
            djf.mo4523d(dhy.f8567a);
        }
        if (a == i2) {
            return a;
        }
        throw djn.m6731a();
    }

    /* renamed from: c */
    static int m6487c(byte[] bArr, int i, dhy dhy) {
        int a = m6478a(bArr, i, dhy);
        int i2 = dhy.f8567a;
        if (i2 < 0) {
            throw djn.m6732b();
        } else if (i2 != 0) {
            dhy.f8569c = new String(bArr, a, i2, djl.f8682a);
            return a + i2;
        } else {
            dhy.f8569c = "";
            return a;
        }
    }

    /* renamed from: d */
    static int m6489d(byte[] bArr, int i, dhy dhy) {
        int a = m6478a(bArr, i, dhy);
        int i2 = dhy.f8567a;
        if (i2 < 0) {
            throw djn.m6732b();
        } else if (i2 != 0) {
            dhy.f8569c = dmb.f8794a.mo4668b(bArr, a, i2);
            return a + i2;
        } else {
            dhy.f8569c = "";
            return a;
        }
    }

    /* renamed from: a */
    static int m6472a(int i, byte[] bArr, int i2, int i3, dlm dlm, dhy dhy) {
        if (dme.m7094b(i) != 0) {
            int a = dme.m7092a(i);
            if (a == 0) {
                int b = m6483b(bArr, i2, dhy);
                dlm.mo4627a(i, Long.valueOf(dhy.f8568b));
                return b;
            } else if (a == 1) {
                dlm.mo4627a(i, Long.valueOf(m6484b(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int a2 = m6478a(bArr, i2, dhy);
                int i4 = dhy.f8567a;
                if (i4 < 0) {
                    throw djn.m6732b();
                } else if (i4 <= bArr.length - a2) {
                    if (i4 == 0) {
                        dlm.mo4627a(i, dik.f8583b);
                    } else {
                        dlm.mo4627a(i, dik.m6515a(bArr, a2, i4));
                    }
                    return a2 + i4;
                } else {
                    throw djn.m6731a();
                }
            } else if (a == 3) {
                int i5 = (i & -8) | 4;
                dlm a3 = dlm.m6972a();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a4 = m6478a(bArr, i2, dhy);
                    int i7 = dhy.f8567a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = a4;
                        break;
                    }
                    i6 = i7;
                    i2 = m6472a(i7, bArr, a4, i3, a3, dhy);
                }
                if (i2 > i3 || i6 != i5) {
                    throw djn.m6735e();
                }
                dlm.mo4627a(i, a3);
                return i2;
            } else if (a == 5) {
                dlm.mo4627a(i, Integer.valueOf(m6477a(bArr, i2)));
                return i2 + 4;
            } else {
                throw djn.m6733c();
            }
        } else {
            throw djn.m6733c();
        }
    }

    /* renamed from: a */
    static int m6473a(int i, byte[] bArr, int i2, dhy dhy) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            dhy.f8567a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            dhy.f8567a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dhy.f8567a = i7 | (b3 << 21);
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
                    dhy.f8567a = i11;
                    return i12;
                }
            }
        } else {
            dhy.f8567a = i9 | (b4 << 28);
            return i10;
        }
    }

    /* renamed from: a */
    static int m6478a(byte[] bArr, int i, dhy dhy) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m6473a(b, bArr, i2, dhy);
        }
        dhy.f8567a = b;
        return i2;
    }

    /* renamed from: a */
    static int m6471a(int i, byte[] bArr, int i2, int i3, djk djk, dhy dhy) {
        djf djf = (djf) djk;
        int a = m6478a(bArr, i2, dhy);
        djf.mo4523d(dhy.f8567a);
        while (a < i3) {
            int a2 = m6478a(bArr, a, dhy);
            if (i != dhy.f8567a) {
                break;
            }
            a = m6478a(bArr, a2, dhy);
            djf.mo4523d(dhy.f8567a);
        }
        return a;
    }

    /* renamed from: b */
    static int m6483b(byte[] bArr, int i, dhy dhy) {
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
            dhy.f8568b = j2;
            return i3;
        }
        dhy.f8568b = j;
        return i2;
    }

    /* renamed from: a */
    static int m6470a(int i, byte[] bArr, int i2, int i3, dhy dhy) {
        if (dme.m7094b(i) != 0) {
            int a = dme.m7092a(i);
            if (a == 0) {
                return m6483b(bArr, i2, dhy);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return m6478a(bArr, i2, dhy) + dhy.f8567a;
            }
            if (a == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m6478a(bArr, i2, dhy);
                    i5 = dhy.f8567a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m6470a(i5, bArr, i2, i3, dhy);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw djn.m6735e();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw djn.m6733c();
            }
        } else {
            throw djn.m6733c();
        }
    }
}
