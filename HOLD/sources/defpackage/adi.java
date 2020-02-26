package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: adi  reason: default package */
/* compiled from: PG */
final class adi implements acw {
    private final adg a;
    private final ahu b;

    public adi(adg adg, ahu ahu) {
        this.a = adg;
        this.b = ahu;
    }

    public final void a(xg xgVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                xgVar.a(bitmap);
            }
            throw iOException;
        }
    }

    public final void a() {
        this.a.a();
    }
}
