package defpackage;

import android.graphics.Bitmap;

/* renamed from: acf  reason: default package */
/* compiled from: PG */
public final class acf implements ww, wr {
    private final Bitmap a;
    private final xg b;

    public acf(Bitmap bitmap, xg xgVar) {
        this.a = (Bitmap) aic.a(bitmap, "Bitmap must not be null");
        this.b = (xg) aic.a(xgVar, "BitmapPool must not be null");
    }

    public final Class a() {
        return Bitmap.class;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }

    public final int c() {
        return aie.a(this.a);
    }

    public final void e() {
        this.a.prepareToDraw();
    }

    public static acf a(Bitmap bitmap, xg xgVar) {
        if (bitmap != null) {
            return new acf(bitmap, xgVar);
        }
        return null;
    }

    public final void d() {
        this.b.a(this.a);
    }
}
