package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agb  reason: default package */
/* compiled from: PG */
public final class agb {
    private final List a = new ArrayList();

    public final synchronized void a(Class cls, tp tpVar) {
        this.a.add(new aga(cls, tpVar));
    }

    public final synchronized tp a(Class cls) {
        tp tpVar;
        List list = this.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tpVar = null;
                break;
            }
            aga aga = (aga) list.get(i);
            i++;
            if (aga.a.isAssignableFrom(cls)) {
                tpVar = aga.b;
                break;
            }
        }
        return tpVar;
    }
}
