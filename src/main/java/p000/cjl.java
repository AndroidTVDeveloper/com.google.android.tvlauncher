package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/* renamed from: cjl */
/* compiled from: PG */
public final class cjl implements aew {

    /* renamed from: a */
    private final C0630xg f5717a;

    /* renamed from: b */
    private final Paint f5718b;

    public cjl(Context context, float f, float f2) {
        this.f5717a = C0497si.m8291a(context).f10362a;
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(f2);
        colorMatrix2.postConcat(colorMatrix);
        Paint paint = new Paint();
        this.f5718b = paint;
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
    }

    /* renamed from: a */
    public final C0619ww mo122a(C0619ww wwVar, C0539tx txVar) {
        Bitmap bitmap = (Bitmap) wwVar.mo33b();
        C0423pp a = C0423pp.m8201a(bitmap).mo5747a();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, this.f5718b);
        return new cjk(new cjj(createBitmap, a), this.f5717a);
    }
}
