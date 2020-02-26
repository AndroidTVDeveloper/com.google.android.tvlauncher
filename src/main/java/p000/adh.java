package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: adh */
/* compiled from: PG */
public final class adh implements C0541tz {

    /* renamed from: a */
    private final aea f146a;

    /* renamed from: b */
    private final C0630xg f147b;

    public adh(aea aea, C0630xg xgVar) {
        this.f146a = aea;
        this.f147b = xgVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0619ww mo38a(Object obj, int i, int i2, C0539tx txVar) {
        C0619ww a = this.f146a.mo89a((Uri) obj);
        if (a == null) {
            return null;
        }
        return acz.m168a(this.f147b, (Drawable) a.mo33b(), i, i2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo39a(Object obj, C0539tx txVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
