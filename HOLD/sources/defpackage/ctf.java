package defpackage;

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

/* renamed from: ctf  reason: default package */
/* compiled from: PG */
public final class ctf extends acg {
    private static final byte[] b;
    private static final int c;
    private final int[] d;
    private final float[] e;

    static {
        byte[] bytes = ctf.class.getName().getBytes(a);
        b = bytes;
        c = Arrays.hashCode(bytes);
    }

    public final int hashCode() {
        return c;
    }

    public ctf(Context context) {
        Resources resources = context.getResources();
        float a = dcy.a(resources, (int) R.dimen.background_image_scrim_start_alpha);
        float fraction = resources.getFraction(R.fraction.home_background_image_scrim_midpoint_coordinate, 1, 1);
        this.d = new int[]{Color.argb(a, 0.0f, 0.0f, 0.0f), Color.argb(a, 0.0f, 0.0f, 0.0f), -16777216};
        this.e = new float[]{0.0f, fraction, 1.0f};
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
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap b2 = xgVar.b(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) height, this.d, this.e, Shader.TileMode.CLAMP));
        Rect rect = new Rect();
        rect.set(0, 0, width, height);
        canvas.drawRect(rect, paint);
        return b2;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
