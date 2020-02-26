package p000;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.io.IOException;

/* renamed from: ddv */
/* compiled from: PG */
public final class ddv {

    /* renamed from: a */
    public static volatile ddv f8348a;

    /* renamed from: b */
    public boolean f8349b;

    /* renamed from: a */
    public final void mo4166a(Context context) {
        try {
            WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService("wallpaper");
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(context.getResources().getColor(R.color.wallpaper_color, null));
            wallpaperManager.suggestDesiredDimensions(createBitmap.getWidth(), createBitmap.getHeight());
            wallpaperManager.setBitmap(createBitmap);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("wallpaper_version", 2).putString("android_build_fingerprint", Build.FINGERPRINT).apply();
        } catch (IOException | OutOfMemoryError e) {
            Log.e("WallpaperInstaller", "Cannot install wallpaper", e);
        }
        this.f8349b = false;
    }
}
