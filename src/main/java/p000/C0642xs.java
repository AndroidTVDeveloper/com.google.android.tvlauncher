package p000;

import android.graphics.Bitmap;

/* renamed from: xs */
/* compiled from: PG */
final /* synthetic */ class C0642xs {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10792a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f10792a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f10792a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f10792a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f10792a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
