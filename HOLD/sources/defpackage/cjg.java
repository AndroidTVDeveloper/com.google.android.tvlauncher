package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.google.android.tvlauncher.R;

/* renamed from: cjg  reason: default package */
/* compiled from: PG */
public final class cjg implements tz {
    private final Context a;

    public cjg(Context context) {
        this.a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int, int, android.graphics.Bitmap$Config, boolean):android.graphics.Bitmap}
     arg types: [?[OBJECT, ARRAY], int, int, android.graphics.Bitmap$Config, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config, boolean, android.graphics.ColorSpace):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int, int, android.graphics.Bitmap$Config, boolean):android.graphics.Bitmap} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    private final Drawable b(ResolveInfo resolveInfo, PackageManager packageManager, int i, int i2) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, Bitmap.Config.ARGB_8888, false);
            try {
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(this.a.getColor(R.color.app_banner_background_color));
                float dimensionPixelSize = ((float) this.a.getResources().getDimensionPixelSize(R.dimen.app_banner_fallback_icon_height)) * this.a.getResources().getFraction(R.fraction.home_app_banner_focused_scale, 1, 1);
                float f = (float) i;
                int round = Math.round(((float) this.a.getResources().getDimensionPixelSize(R.dimen.app_banner_icon_size)) * (f / ((float) this.a.getResources().getDimensionPixelSize(R.dimen.app_banner_image_max_width))));
                Drawable a2 = a(resolveInfo, packageManager, round, round);
                Bitmap createBitmap2 = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                a2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                a2.draw(canvas2);
                float min = Math.min(1.0f, dimensionPixelSize / ((float) createBitmap2.getHeight()));
                int height = createBitmap2.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(min, min);
                matrix.postTranslate((f - (((float) createBitmap2.getWidth()) * min)) / 2.0f, (((float) i2) - (((float) height) * min)) / 2.0f);
                canvas.drawBitmap(createBitmap2, matrix, null);
            } catch (IllegalAccessError e) {
            }
            bitmap = createBitmap;
        } catch (IllegalAccessError e2) {
        }
        return new BitmapDrawable(this.a.getResources(), bitmap);
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
        Drawable drawable;
        cje cje = (cje) obj;
        ResolveInfo resolveInfo = cje.b;
        cjd cjd = cjd.ICON;
        int ordinal = cje.c.ordinal();
        if (ordinal == 0) {
            drawable = a(resolveInfo, this.a.getPackageManager(), i, i2);
        } else if (ordinal != 1) {
            drawable = b(resolveInfo, this.a.getPackageManager(), i, i2);
        } else {
            PackageManager packageManager = this.a.getPackageManager();
            Drawable drawable2 = null;
            if (!(resolveInfo == null || resolveInfo.activityInfo == null)) {
                drawable2 = resolveInfo.activityInfo.loadBanner(packageManager);
            }
            if (drawable2 == null) {
                drawable = b(resolveInfo, packageManager, i, i2);
            } else if (drawable2 instanceof BitmapDrawable) {
                drawable = new BitmapDrawable(this.a.getResources(), a(((BitmapDrawable) drawable2).getBitmap(), i, i2));
            } else {
                drawable = drawable2;
            }
        }
        return new cjf(drawable);
    }

    private final Drawable a(ResolveInfo resolveInfo, PackageManager packageManager, int i, int i2) {
        Drawable drawable;
        if (resolveInfo != null) {
            drawable = resolveInfo.loadIcon(packageManager);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = this.a.getDrawable(17301651);
        }
        return drawable instanceof BitmapDrawable ? new BitmapDrawable(this.a.getResources(), a(((BitmapDrawable) drawable).getBitmap(), i, i2)) : drawable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    private static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if ((width > i || height > i2) && width > 0 && height > 0) {
            float min = Math.min(1.0f, ((float) i2) / ((float) height));
            if (((double) min) < 1.0d || width > i) {
                float f = (float) width;
                float max = ((float) Math.max(Math.round(f * min) - i, 0)) / min;
                Matrix matrix = new Matrix();
                matrix.postScale(min, min);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, (int) (max / 2.0f), 0, (int) (f - max), height, matrix, true);
                if (createBitmap != null) {
                    return createBitmap;
                }
            }
        }
        return bitmap;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        cje cje = (cje) obj;
        return true;
    }
}
