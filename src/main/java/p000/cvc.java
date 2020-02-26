package p000;

import java.util.Set;
import java.util.function.Predicate;

/* renamed from: cvc */
/* compiled from: PG */
final /* synthetic */ class cvc implements Predicate {

    /* renamed from: a */
    private final Set f7619a;

    public cvc(Set set) {
        this.f7619a = set;
    }

    public final boolean test(Object obj) {
        return this.f7619a.contains(((cvh) obj).f7646b);
    }
}
