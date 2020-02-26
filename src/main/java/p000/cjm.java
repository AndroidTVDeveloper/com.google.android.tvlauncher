package p000;

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

/* renamed from: cjm */
/* compiled from: PG */
public final class cjm extends acg {

    /* renamed from: b */
    private static final byte[] f5719b = cjm.class.getName().getBytes(f10521a);

    /* renamed from: c */
    private final byte[] f5720c;

    /* renamed from: d */
    private final int f5721d;

    /* renamed from: e */
    private final int f5722e;

    /* renamed from: f */
    private final int f5723f;

    /* renamed from: g */
    private final float f5724g;

    /* renamed from: h */
    private final Paint f5725h;

    /* renamed from: i */
    private int f5726i;

    /* renamed from: j */
    private boolean f5727j = false;

    public cjm(int i, float f, float f2, int i2, int i3, float f3) {
        this.f5721d = i;
        this.f5722e = i2;
        this.f5723f = i3;
        this.f5724g = f3;
        byte[] bArr = f5719b;
        byte[] bArr2 = new byte[(bArr.length + 9)];
        this.f5720c = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f5720c;
        int length = bArr3.length;
        bArr3[length - 9] = (byte) (i2 & 15);
        bArr3[length - 8] = (byte) (i3 & 15);
        bArr3[length - 7] = Float.valueOf(f3).byteValue();
        byte[] bArr4 = this.f5720c;
        bArr4[bArr4.length - 6] = Float.valueOf(f2).byteValue();
        byte[] bArr5 = this.f5720c;
        bArr5[bArr5.length - 5] = Float.valueOf(f).byteValue();
        byte[] bArr6 = this.f5720c;
        int length2 = bArr6.length;
        bArr6[length2 - 4] = (byte) ((i >> 24) & 15);
        bArr6[length2 - 3] = (byte) ((i >> 16) & 15);
        bArr6[length2 - 2] = (byte) ((i >> 8) & 15);
        bArr6[length2 - 1] = (byte) (i & 15);
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(f2);
        colorMatrix2.postConcat(colorMatrix);
        Paint paint = new Paint();
        this.f5725h = paint;
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
    }

    public final int hashCode() {
        if (this.f5727j) {
            return this.f5726i;
        }
        this.f5727j = true;
        int hashCode = Arrays.hashCode(this.f5720c);
        this.f5726i = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config = bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        float f = (float) i;
        float f2 = (float) i2;
        float min = Math.min(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap b = xgVar.mo6109b(i, i2, config);
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        matrix.postTranslate(((float) (i - ((int) (((float) width) * min)))) / 2.0f, ((float) (i2 - ((int) (min * ((float) height))))) / 2.0f);
        new Canvas(b).drawBitmap(bitmap, matrix, this.f5725h);
        Bitmap b2 = xgVar.mo6109b(this.f5722e, this.f5723f, config);
        Canvas canvas = new Canvas(b2);
        int i3 = this.f5722e;
        int i4 = this.f5723f;
        canvas.drawColor(this.f5721d);
        BitmapShader bitmapShader = new BitmapShader(b, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        canvas.translate((float) ((i3 - i) / 2), (float) ((i4 - i2) / 2));
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float f3 = this.f5724g;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        return b2;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(this.f5720c);
    }
}
