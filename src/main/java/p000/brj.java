package p000;

import android.os.Looper;

/* renamed from: brj */
/* compiled from: PG */
public final class brj extends bqc {

    /* renamed from: b */
    private final boo f4701b;

    public brj(boo boo) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f4701b = boo;
    }

    /* renamed from: a */
    public final Looper mo2244a() {
        return this.f4701b.f4518d;
    }

    /* renamed from: a */
    public final bpn mo2245a(bpn bpn) {
        return this.f4701b.mo2240a(bpn);
    }
}
