package p000;

import android.graphics.Bitmap;

/* renamed from: acf */
/* compiled from: PG */
public final class acf implements C0619ww, C0614wr {

    /* renamed from: a */
    private final Bitmap f89a;

    /* renamed from: b */
    private final C0630xg f90b;

    public acf(Bitmap bitmap, C0630xg xgVar) {
        this.f89a = (Bitmap) aic.m543a(bitmap, "Bitmap must not be null");
        this.f90b = (C0630xg) aic.m543a(xgVar, "BitmapPool must not be null");
    }

    /* renamed from: a */
    public final Class mo32a() {
        return Bitmap.class;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo33b() {
        return this.f89a;
    }

    /* renamed from: c */
    public final int mo34c() {
        return aie.m555a(this.f89a);
    }

    /* renamed from: e */
    public final void mo41e() {
        this.f89a.prepareToDraw();
    }

    /* renamed from: a */
    public static acf m107a(Bitmap bitmap, C0630xg xgVar) {
        if (bitmap != null) {
            return new acf(bitmap, xgVar);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo35d() {
        this.f90b.mo60a(this.f89a);
    }
}
