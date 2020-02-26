package p000;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: tt */
/* compiled from: PG */
public final class C0535tt implements C0544ub {

    /* renamed from: b */
    private final Collection f10522b;

    @SafeVarargs
    public C0535tt(C0544ub... ubVarArr) {
        this.f10522b = Arrays.asList(ubVarArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0535tt) {
            return this.f10522b.equals(((C0535tt) obj).f10522b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10522b.hashCode();
    }

    /* renamed from: a */
    public final C0619ww mo36a(Context context, C0619ww wwVar, int i, int i2) {
        C0619ww wwVar2 = wwVar;
        for (C0544ub a : this.f10522b) {
            C0619ww a2 = a.mo36a(context, wwVar2, i, i2);
            if (wwVar2 != null && !wwVar2.equals(wwVar) && !wwVar2.equals(a2)) {
                wwVar2.mo35d();
            }
            wwVar2 = a2;
        }
        return wwVar2;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        for (C0544ub a : this.f10522b) {
            a.mo37a(messageDigest);
        }
    }
}
