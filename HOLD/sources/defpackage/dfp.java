package defpackage;

import java.io.Serializable;

/* renamed from: dfp  reason: default package */
/* compiled from: PG */
final class dfp implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    public dfp(Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return dfq.b(this.a);
    }
}
