package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agb */
/* compiled from: PG */
public final class agb {

    /* renamed from: a */
    private final List f256a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo181a(Class cls, C0531tp tpVar) {
        this.f256a.add(new aga(cls, tpVar));
    }

    /* renamed from: a */
    public final synchronized C0531tp mo180a(Class cls) {
        C0531tp tpVar;
        List list = this.f256a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tpVar = null;
                break;
            }
            aga aga = (aga) list.get(i);
            i++;
            if (aga.f254a.isAssignableFrom(cls)) {
                tpVar = aga.f255b;
                break;
            }
        }
        return tpVar;
    }
}
