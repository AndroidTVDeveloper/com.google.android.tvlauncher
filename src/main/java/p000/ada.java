package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: ada */
/* compiled from: PG */
public final class ada implements C0544ub {

    /* renamed from: b */
    private final C0544ub f128b;

    /* renamed from: c */
    private final boolean f129c;

    public ada(C0544ub ubVar, boolean z) {
        this.f128b = ubVar;
        this.f129c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ada) {
            return this.f128b.equals(((ada) obj).f128b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f128b.hashCode();
    }

    /* renamed from: a */
    public final C0619ww mo36a(Context context, C0619ww wwVar, int i, int i2) {
        C0630xg xgVar = C0497si.m8291a(context).f10362a;
        Drawable drawable = (Drawable) wwVar.mo33b();
        C0619ww a = acz.m168a(xgVar, drawable, i, i2);
        if (a != null) {
            C0619ww a2 = this.f128b.mo36a(context, a, i, i2);
            if (!a2.equals(a)) {
                return ade.m178a(context.getResources(), a2);
            }
            a2.mo35d();
            return wwVar;
        } else if (!this.f129c) {
            return wwVar;
        } else {
            String valueOf = String.valueOf(drawable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unable to convert ");
            sb.append(valueOf);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        this.f128b.mo37a(messageDigest);
    }
}
