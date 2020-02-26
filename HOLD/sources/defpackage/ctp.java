package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: ctp  reason: default package */
/* compiled from: PG */
public final class ctp implements aew {
    private final Context a;
    private final xg b;
    private RenderScript c;
    private ScriptIntrinsicBlur d;

    public ctp(Context context) {
        this.a = context.getApplicationContext();
        this.b = si.a(context).a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    public final ww a(ww wwVar, tx txVar) {
        Bitmap bitmap = (Bitmap) wwVar.b();
        if (this.c == null) {
            RenderScript create = RenderScript.create(this.a);
            this.c = create;
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            this.d = create2;
            create2.setRadius(8.0f);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.5f, 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.c, createBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(this.c, createBitmap2);
        this.d.setInput(createFromBitmap);
        this.d.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap2);
        return new cto(new ctn(bitmap, createBitmap2, pp.a(bitmap).a()), this.b);
    }
}
