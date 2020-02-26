package defpackage;

import android.os.Looper;

/* renamed from: brj  reason: default package */
/* compiled from: PG */
public final class brj extends bqc {
    private final boo b;

    public brj(boo boo) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = boo;
    }

    public final Looper a() {
        return this.b.d;
    }

    public final bpn a(bpn bpn) {
        return this.b.a(bpn);
    }
}
