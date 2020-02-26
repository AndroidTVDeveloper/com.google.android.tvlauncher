package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: dfi  reason: default package */
/* compiled from: PG */
public final class dfi implements Serializable, dff {
    public static final long serialVersionUID = 0;
    public final Object a;

    public dfi(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfi) {
            return dgx.b(this.a, ((dfi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
