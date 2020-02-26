package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cax */
/* compiled from: PG */
final class cax implements byt, ccl {

    /* renamed from: a */
    public final List f5155a = new ArrayList();

    /* renamed from: b */
    public boolean f5156b;

    /* renamed from: c */
    private final bze f5157c;

    public cax(bze bze) {
        this.f5157c = bze;
        bze.mo2564a(this);
    }

    /* renamed from: b */
    public final void mo2553b() {
        synchronized (this) {
            this.f5156b = true;
        }
        this.f5157c.mo2565b(this);
        List list = this.f5155a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cbx) list.get(i)).mo2587g();
        }
    }

    /* renamed from: a */
    public final void mo2543a() {
        this.f5157c.mo2565b(this);
    }
}
