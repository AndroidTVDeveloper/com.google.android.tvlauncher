package p000;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: adi */
/* compiled from: PG */
final class adi implements acw {

    /* renamed from: a */
    private final adg f148a;

    /* renamed from: b */
    private final ahu f149b;

    public adi(adg adg, ahu ahu) {
        this.f148a = adg;
        this.f149b = ahu;
    }

    /* renamed from: a */
    public final void mo58a(C0630xg xgVar, Bitmap bitmap) {
        IOException iOException = this.f149b.f385c;
        if (iOException != null) {
            if (bitmap != null) {
                xgVar.mo60a(bitmap);
            }
            throw iOException;
        }
    }

    /* renamed from: a */
    public final void mo57a() {
        this.f148a.mo67a();
    }
}
