package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ade  reason: default package */
/* compiled from: PG */
public final class ade implements ww, wr {
    private final Resources a;
    private final ww b;

    private ade(Resources resources, ww wwVar) {
        this.a = (Resources) aic.a(resources);
        this.b = (ww) aic.a(wwVar);
    }

    public final Class a() {
        return BitmapDrawable.class;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.b());
    }

    public final int c() {
        return this.b.c();
    }

    public final void e() {
        ww wwVar = this.b;
        if (wwVar instanceof wr) {
            ((wr) wwVar).e();
        }
    }

    public static ww a(Resources resources, ww wwVar) {
        if (wwVar != null) {
            return new ade(resources, wwVar);
        }
        return null;
    }

    public final void d() {
        this.b.d();
    }
}
