package p000;

import java.io.Serializable;

/* renamed from: dfp */
/* compiled from: PG */
final class dfp implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object[] f8459a;

    public dfp(Object[] objArr) {
        this.f8459a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return dfq.m6326b(this.f8459a);
    }
}
