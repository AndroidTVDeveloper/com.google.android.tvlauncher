package defpackage;

import java.io.Serializable;

/* renamed from: dfm  reason: default package */
/* compiled from: PG */
final class dfm implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    public dfm(Object[] objArr) {
        this.a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return dfo.b(this.a);
    }
}
