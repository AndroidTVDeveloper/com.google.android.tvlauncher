package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: aao */
/* compiled from: PG */
final class aao implements C0549ug, C0548uf {

    /* renamed from: a */
    private final List f19a;

    /* renamed from: b */
    private final C0082cz f20b;

    /* renamed from: c */
    private int f21c = 0;

    /* renamed from: d */
    private C0501sm f22d;

    /* renamed from: e */
    private C0548uf f23e;

    /* renamed from: f */
    private List f24f;

    /* renamed from: g */
    private boolean f25g;

    public aao(List list, C0082cz czVar) {
        this.f20b = czVar;
        aic.m545a((Collection) list);
        this.f19a = list;
    }

    /* renamed from: c */
    public final void mo9c() {
        this.f25g = true;
        List list = this.f19a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C0549ug) list.get(i)).mo9c();
        }
    }

    /* renamed from: b */
    public final void mo8b() {
        List list = this.f24f;
        if (list != null) {
            this.f20b.mo318a(list);
        }
        this.f24f = null;
        List list2 = this.f19a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((C0549ug) list2.get(i)).mo8b();
        }
    }

    /* renamed from: a */
    public final Class mo6a() {
        return ((C0549ug) this.f19a.get(0)).mo6a();
    }

    /* renamed from: d */
    public final int mo10d() {
        return ((C0549ug) this.f19a.get(0)).mo10d();
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        this.f22d = smVar;
        this.f23e = ufVar;
        this.f24f = (List) this.f20b.mo317a();
        ((C0549ug) this.f19a.get(this.f21c)).mo7a(smVar, this);
        if (this.f25g) {
            mo9c();
        }
    }

    /* renamed from: a */
    public final void mo22a(Object obj) {
        if (obj != null) {
            this.f23e.mo22a(obj);
        } else {
            m19e();
        }
    }

    /* renamed from: a */
    public final void mo21a(Exception exc) {
        ((List) aic.m542a((Object) this.f24f)).add(exc);
        m19e();
    }

    /* renamed from: e */
    private final void m19e() {
        if (this.f25g) {
            return;
        }
        if (this.f21c < this.f19a.size() - 1) {
            this.f21c++;
            mo7a(this.f22d, this.f23e);
            return;
        }
        aic.m542a((Object) this.f24f);
        this.f23e.mo21a((Exception) new C0613wq("Fetch failed", new ArrayList(this.f24f)));
    }
}
