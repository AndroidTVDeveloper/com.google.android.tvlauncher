package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wj  reason: default package */
/* compiled from: PG */
final class wj implements Iterable {
    public final List a;

    public wj() {
        this(new ArrayList(2));
    }

    private wj(List list) {
        this.a = list;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(agr agr) {
        return this.a.contains(b(agr));
    }

    /* access modifiers changed from: package-private */
    public final wj c() {
        return new wj(new ArrayList(this.a));
    }

    public static wi b(agr agr) {
        return new wi(agr, ahx.b);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.a.size();
    }
}
