package p000;

import java.io.Serializable;

/* renamed from: dfm */
/* compiled from: PG */
final class dfm implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object[] f8454a;

    public dfm(Object[] objArr) {
        this.f8454a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return dfo.m6318b(this.f8454a);
    }
}
