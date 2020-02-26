package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: aek  reason: default package */
/* compiled from: PG */
public final class aek implements ub {
    private final ub b;

    public aek(ub ubVar) {
        this.b = (ub) aic.a(ubVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aek) {
            return this.b.equals(((aek) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final ww a(Context context, ww wwVar, int i, int i2) {
        aeh aeh = (aeh) wwVar.b();
        acf acf = new acf(aeh.a(), si.a(context).a);
        ww a = this.b.a(context, acf, i, i2);
        if (!acf.equals(a)) {
            acf.d();
        }
        ub ubVar = this.b;
        aeh.a.a.a(ubVar, (Bitmap) a.b());
        return wwVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}
