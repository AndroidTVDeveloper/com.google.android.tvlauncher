package defpackage;

import java.util.Set;
import java.util.function.Predicate;

/* renamed from: cvc  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cvc implements Predicate {
    private final Set a;

    public cvc(Set set) {
        this.a = set;
    }

    public final boolean test(Object obj) {
        return this.a.contains(((cvh) obj).b);
    }
}
