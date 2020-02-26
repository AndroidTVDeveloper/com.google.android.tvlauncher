package defpackage;

import android.widget.ImageView;

/* renamed from: st  reason: default package */
/* compiled from: PG */
final /* synthetic */ class st {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[sm.values().length];
        b = iArr;
        try {
            iArr[sm.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[sm.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[sm.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[sm.IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
        try {
            a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
        }
        try {
            a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
        }
        try {
            a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError e12) {
        }
    }
}
