package p000;

import android.content.Context;

/* renamed from: cct */
/* compiled from: PG */
public final class cct implements dff {

    /* renamed from: a */
    private static final ceh f5287a;

    /* renamed from: b */
    private final Context f5288b;

    static {
        ceg a = new ceg("primes-ph").mo2692b("ShutdownFeature__").mo2691a("primes::");
        ceg ceg = new ceg(a.f5353a, a.f5354b, a.f5355c, a.f5356d, a.f5357e, true);
        f5287a = new cee(new ceg(ceg.f5353a, ceg.f5354b, ceg.f5355c, ceg.f5356d, true, ceg.f5358f), "shutdown_primes", false);
    }

    public cct(Context context) {
        this.f5288b = context;
    }

    /* renamed from: b */
    public final Boolean mo2551a() {
        ceh.m4609b(this.f5288b);
        return (Boolean) f5287a.mo2694c();
    }
}
