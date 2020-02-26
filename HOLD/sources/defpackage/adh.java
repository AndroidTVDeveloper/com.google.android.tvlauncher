package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: adh  reason: default package */
/* compiled from: PG */
public final class adh implements tz {
    private final aea a;
    private final xg b;

    public adh(aea aea, xg xgVar) {
        this.a = aea;
        this.b = xgVar;
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
        ww a2 = this.a.a((Uri) obj);
        if (a2 == null) {
            return null;
        }
        return acz.a(this.b, (Drawable) a2.b(), i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
