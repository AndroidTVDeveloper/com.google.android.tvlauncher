package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: aao  reason: default package */
/* compiled from: PG */
final class aao implements ug, uf {
    private final List a;
    private final cz b;
    private int c = 0;
    private sm d;
    private uf e;
    private List f;
    private boolean g;

    public aao(List list, cz czVar) {
        this.b = czVar;
        aic.a((Collection) list);
        this.a = list;
    }

    public final void c() {
        this.g = true;
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ug) list.get(i)).c();
        }
    }

    public final void b() {
        List list = this.f;
        if (list != null) {
            this.b.a(list);
        }
        this.f = null;
        List list2 = this.a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((ug) list2.get(i)).b();
        }
    }

    public final Class a() {
        return ((ug) this.a.get(0)).a();
    }

    public final int d() {
        return ((ug) this.a.get(0)).d();
    }

    public final void a(sm smVar, uf ufVar) {
        this.d = smVar;
        this.e = ufVar;
        this.f = (List) this.b.a();
        ((ug) this.a.get(this.c)).a(smVar, this);
        if (this.g) {
            c();
        }
    }

    public final void a(Object obj) {
        if (obj != null) {
            this.e.a(obj);
        } else {
            e();
        }
    }

    public final void a(Exception exc) {
        ((List) aic.a((Object) this.f)).add(exc);
        e();
    }

    private final void e() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            a(this.d, this.e);
            return;
        }
        aic.a((Object) this.f);
        this.e.a((Exception) new wq("Fetch failed", new ArrayList(this.f)));
    }
}
