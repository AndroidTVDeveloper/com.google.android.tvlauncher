package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: aek */
/* compiled from: PG */
public final class aek implements C0544ub {

    /* renamed from: b */
    private final C0544ub f185b;

    public aek(C0544ub ubVar) {
        this.f185b = (C0544ub) aic.m542a(ubVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aek) {
            return this.f185b.equals(((aek) obj).f185b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f185b.hashCode();
    }

    /* renamed from: a */
    public final C0619ww mo36a(Context context, C0619ww wwVar, int i, int i2) {
        aeh aeh = (aeh) wwVar.mo33b();
        acf acf = new acf(aeh.mo98a(), C0497si.m8291a(context).f10362a);
        C0619ww a = this.f185b.mo36a(context, acf, i, i2);
        if (!acf.equals(a)) {
            acf.mo35d();
        }
        C0544ub ubVar = this.f185b;
        aeh.f175a.f174a.mo118a(ubVar, (Bitmap) a.mo33b());
        return wwVar;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        this.f185b.mo37a(messageDigest);
    }
}
