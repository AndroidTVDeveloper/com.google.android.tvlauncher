package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: cjm  reason: default package */
/* compiled from: PG */
public final class cjm extends acg {
    private static final byte[] b = cjm.class.getName().getBytes(a);
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final Paint h;
    private int i;
    private boolean j = false;

    public cjm(int i2, float f2, float f3, int i3, int i4, float f4) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f4;
        byte[] bArr = b;
        byte[] bArr2 = new byte[(bArr.length + 9)];
        this.c = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.c;
        int length = bArr3.length;
        bArr3[length - 9] = (byte) (i3 & 15);
        bArr3[length - 8] = (byte) (i4 & 15);
        bArr3[length - 7] = Float.valueOf(f4).byteValue();
        byte[] bArr4 = this.c;
        bArr4[bArr4.length - 6] = Float.valueOf(f3).byteValue();
        byte[] bArr5 = this.c;
        bArr5[bArr5.length - 5] = Float.valueOf(f2).byteValue();
        byte[] bArr6 = this.c;
        int length2 = bArr6.length;
        bArr6[length2 - 4] = (byte) ((i2 >> 24) & 15);
        bArr6[length2 - 3] = (byte) ((i2 >> 16) & 15);
        bArr6[length2 - 2] = (byte) ((i2 >> 8) & 15);
        bArr6[length2 - 1] = (byte) (i2 & 15);
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(f3);
        colorMatrix2.postConcat(colorMatrix);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
    }

    public final int hashCode() {
        if (this.j) {
            return this.i;
        }
        this.j = true;
        int hashCode = Arrays.hashCode(this.c);
        this.i = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i2, int i3) {
        Bitmap.Config config = bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float min = Math.min(f2 / ((float) bitmap.getWidth()), f3 / ((float) bitmap.getHeight()));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap b2 = xgVar.b(i2, i3, config);
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        matrix.postTranslate(((float) (i2 - ((int) (((float) width) * min)))) / 2.0f, ((float) (i3 - ((int) (min * ((float) height))))) / 2.0f);
        new Canvas(b2).drawBitmap(bitmap, matrix, this.h);
        Bitmap b3 = xgVar.b(this.e, this.f, config);
        Canvas canvas = new Canvas(b3);
        int i4 = this.e;
        int i5 = this.f;
        canvas.drawColor(this.d);
        BitmapShader bitmapShader = new BitmapShader(b2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        canvas.translate((float) ((i4 - i2) / 2), (float) ((i5 - i3) / 2));
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        float f4 = this.g;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        return b3;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.c);
    }
}
