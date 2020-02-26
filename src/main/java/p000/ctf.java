package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.google.android.tvlauncher.R;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: ctf */
/* compiled from: PG */
public final class ctf extends acg {

    /* renamed from: b */
    private static final byte[] f7342b;

    /* renamed from: c */
    private static final int f7343c;

    /* renamed from: d */
    private final int[] f7344d;

    /* renamed from: e */
    private final float[] f7345e;

    static {
        byte[] bytes = ctf.class.getName().getBytes(f10521a);
        f7342b = bytes;
        f7343c = Arrays.hashCode(bytes);
    }

    public final int hashCode() {
        return f7343c;
    }

    public ctf(Context context) {
        Resources resources = context.getResources();
        float a = dcy.m6184a(resources, (int) R.dimen.background_image_scrim_start_alpha);
        float fraction = resources.getFraction(R.fraction.home_background_image_scrim_midpoint_coordinate, 1, 1);
        this.f7344d = new int[]{Color.argb(a, 0.0f, 0.0f, 0.0f), Color.argb(a, 0.0f, 0.0f, 0.0f), -16777216};
        this.f7345e = new float[]{0.0f, fraction, 1.0f};
    }

    public final boolean equals(Object obj) {
        return obj instanceof ctf;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [int, int, int, float, int[], float[], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap b = xgVar.mo6109b(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) height, this.f7344d, this.f7345e, Shader.TileMode.CLAMP));
        Rect rect = new Rect();
        rect.set(0, 0, width, height);
        canvas.drawRect(rect, paint);
        return b;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(f7342b);
    }
}
