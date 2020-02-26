package defpackage;

import android.content.Context;

/* renamed from: cct  reason: default package */
/* compiled from: PG */
public final class cct implements dff {
    private static final ceh a;
    private final Context b;

    static {
        ceg a2 = new ceg("primes-ph").b("ShutdownFeature__").a("primes::");
        ceg ceg = new ceg(a2.a, a2.b, a2.c, a2.d, a2.e, true);
        a = new cee(new ceg(ceg.a, ceg.b, ceg.c, ceg.d, true, ceg.f), "shutdown_primes", false);
    }

    public cct(Context context) {
        this.b = context;
    }

    /* renamed from: b */
    public final Boolean a() {
        ceh.b(this.b);
        return (Boolean) a.c();
    }
}
