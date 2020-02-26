package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wj */
/* compiled from: PG */
final class C0606wj implements Iterable {

    /* renamed from: a */
    public final List f10682a;

    public C0606wj() {
        this(new ArrayList(2));
    }

    private C0606wj(List list) {
        this.f10682a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo6061a(agr agr) {
        return this.f10682a.contains(m8539b(agr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0606wj mo6063c() {
        return new C0606wj(new ArrayList(this.f10682a));
    }

    /* renamed from: b */
    public static C0605wi m8539b(agr agr) {
        return new C0605wi(agr, ahx.f388b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo6060a() {
        return this.f10682a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f10682a.iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo6062b() {
        return this.f10682a.size();
    }
}
