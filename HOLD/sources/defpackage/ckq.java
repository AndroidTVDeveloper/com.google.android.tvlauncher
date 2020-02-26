package defpackage;

import java.util.function.Predicate;

/* renamed from: ckq  reason: default package */
/* compiled from: PG */
final /* synthetic */ class ckq implements Predicate {
    private final cla a;

    public ckq(cla cla) {
        this.a = cla;
    }

    public final boolean test(Object obj) {
        return !this.a.m.contains((Long) obj);
    }
}
