package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: ada  reason: default package */
/* compiled from: PG */
public final class ada implements ub {
    private final ub b;
    private final boolean c;

    public ada(ub ubVar, boolean z) {
        this.b = ubVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ada) {
            return this.b.equals(((ada) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final ww a(Context context, ww wwVar, int i, int i2) {
        xg xgVar = si.a(context).a;
        Drawable drawable = (Drawable) wwVar.b();
        ww a = acz.a(xgVar, drawable, i, i2);
        if (a != null) {
            ww a2 = this.b.a(context, a, i, i2);
            if (!a2.equals(a)) {
                return ade.a(context.getResources(), a2);
            }
            a2.d();
            return wwVar;
        } else if (!this.c) {
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

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}
