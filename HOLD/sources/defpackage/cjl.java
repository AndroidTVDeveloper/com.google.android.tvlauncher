package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/* renamed from: cjl  reason: default package */
/* compiled from: PG */
public final class cjl implements aew {
    private final xg a;
    private final Paint b;

    public cjl(Context context, float f, float f2) {
        this.a = si.a(context).a;
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(f2);
        colorMatrix2.postConcat(colorMatrix);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
    }

    public final ww a(ww wwVar, tx txVar) {
        Bitmap bitmap = (Bitmap) wwVar.b();
        pp a2 = pp.a(bitmap).a();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, this.b);
        return new cjk(new cjj(createBitmap, a2), this.a);
    }
}
