package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ade */
/* compiled from: PG */
public final class ade implements C0619ww, C0614wr {

    /* renamed from: a */
    private final Resources f138a;

    /* renamed from: b */
    private final C0619ww f139b;

    private ade(Resources resources, C0619ww wwVar) {
        this.f138a = (Resources) aic.m542a(resources);
        this.f139b = (C0619ww) aic.m542a(wwVar);
    }

    /* renamed from: a */
    public final Class mo32a() {
        return BitmapDrawable.class;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo33b() {
        return new BitmapDrawable(this.f138a, (Bitmap) this.f139b.mo33b());
    }

    /* renamed from: c */
    public final int mo34c() {
        return this.f139b.mo34c();
    }

    /* renamed from: e */
    public final void mo41e() {
        C0619ww wwVar = this.f139b;
        if (wwVar instanceof C0614wr) {
            ((C0614wr) wwVar).mo41e();
        }
    }

    /* renamed from: a */
    public static C0619ww m178a(Resources resources, C0619ww wwVar) {
        if (wwVar != null) {
            return new ade(resources, wwVar);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo35d() {
        this.f139b.mo35d();
    }
}
