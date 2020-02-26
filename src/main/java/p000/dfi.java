package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: dfi */
/* compiled from: PG */
public final class dfi implements Serializable, dff {
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f8451a;

    public dfi(Object obj) {
        this.f8451a = obj;
    }

    /* renamed from: a */
    public final Object mo2551a() {
        return this.f8451a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfi) {
            return dgx.m6410b(this.f8451a, ((dfi) obj).f8451a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8451a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8451a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
