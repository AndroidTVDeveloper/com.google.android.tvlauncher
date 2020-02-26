package defpackage;

import android.graphics.Color;

/* renamed from: bd  reason: default package */
/* compiled from: PG */
public final class bd {
    private static final ThreadLocal a = new ThreadLocal();

    private static float a(float f, float f2) {
        if (f >= 0.0f) {
            return f <= f2 ? f : f2;
        }
        return 0.0f;
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (max == f3) {
                f2 = ((f4 - f5) / f6) % 6.0f;
            } else {
                f2 = max != f4 ? ((f3 - f4) / f6) + 4.0f : ((f5 - f3) / f6) + 2.0f;
            }
            f = f6 / (1.0f - Math.abs((f7 + f7) - 4.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = a(f8, 360.0f);
        fArr[1] = a(f, 1.0f);
        fArr[2] = a(f7, 1.0f);
    }

    private static double c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = a(i, i2);
            }
            double a2 = a(i) + 0.05d;
            double a3 = a(i2) + 0.05d;
            return Math.max(a2, a3) / Math.min(a2, a3);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    private static double a(int i) {
        double d;
        double d2;
        double d3;
        double[] dArr = (double[]) a.get();
        if (dArr == null) {
            dArr = new double[3];
            a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d4 = (double) red;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 >= 0.04045d) {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            } else {
                d = d5 / 12.92d;
            }
            double d6 = (double) green;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 >= 0.04045d) {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            } else {
                d2 = d7 / 12.92d;
            }
            double d8 = (double) blue;
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 >= 0.04045d) {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            } else {
                d3 = d9 / 12.92d;
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (c(b(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                double c = c(b(i, i6), i2);
                if (c >= d) {
                    i3 = i6;
                }
                if (c < d) {
                    i4 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static void a(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, a(Color.red(i), alpha2, Color.red(i2), alpha, i3), a(Color.green(i), alpha2, Color.green(i2), alpha, i3), a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
        }
        return 0;
    }

    public static int b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
