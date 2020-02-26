package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: tt  reason: default package */
/* compiled from: PG */
public final class tt implements ub {
    private final Collection b;

    @SafeVarargs
    public tt(ub... ubVarArr) {
        this.b = Arrays.asList(ubVarArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tt) {
            return this.b.equals(((tt) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final ww a(Context context, ww wwVar, int i, int i2) {
        ww wwVar2 = wwVar;
        for (ub a : this.b) {
            ww a2 = a.a(context, wwVar2, i, i2);
            if (wwVar2 != null && !wwVar2.equals(wwVar) && !wwVar2.equals(a2)) {
                wwVar2.d();
            }
            wwVar2 = a2;
        }
        return wwVar2;
    }

    public final void a(MessageDigest messageDigest) {
        for (ub a : this.b) {
            a.a(messageDigest);
        }
    }
}
