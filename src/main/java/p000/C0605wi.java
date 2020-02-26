package p000;

import java.util.concurrent.Executor;

/* renamed from: wi */
/* compiled from: PG */
final class C0605wi {

    /* renamed from: a */
    public final agr f10680a;

    /* renamed from: b */
    public final Executor f10681b;

    public C0605wi(agr agr, Executor executor) {
        this.f10680a = agr;
        this.f10681b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0605wi) {
            return this.f10680a.equals(((C0605wi) obj).f10680a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10680a.hashCode();
    }
}
