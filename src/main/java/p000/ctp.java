package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: ctp */
/* compiled from: PG */
public final class ctp implements aew {

    /* renamed from: a */
    private final Context f7396a;

    /* renamed from: b */
    private final C0630xg f7397b;

    /* renamed from: c */
    private RenderScript f7398c;

    /* renamed from: d */
    private ScriptIntrinsicBlur f7399d;

    public ctp(Context context) {
        this.f7396a = context.getApplicationContext();
        this.f7397b = C0497si.m8291a(context).f10362a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    public final C0619ww mo122a(C0619ww wwVar, C0539tx txVar) {
        Bitmap bitmap = (Bitmap) wwVar.mo33b();
        if (this.f7398c == null) {
            RenderScript create = RenderScript.create(this.f7396a);
            this.f7398c = create;
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            this.f7399d = create2;
            create2.setRadius(8.0f);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.5f, 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f7398c, createBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(this.f7398c, createBitmap2);
        this.f7399d.setInput(createFromBitmap);
        this.f7399d.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap2);
        return new cto(new ctn(bitmap, createBitmap2, C0423pp.m8201a(bitmap).mo5747a()), this.f7397b);
    }
}
