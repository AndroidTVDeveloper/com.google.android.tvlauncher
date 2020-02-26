package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bkn */
/* compiled from: PG */
public final class bkn {

    /* renamed from: a */
    public final CopyOnWriteArrayList f4226a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo2040a(Object obj) {
        Iterator it = this.f4226a.iterator();
        while (it.hasNext()) {
            bkm bkm = (bkm) it.next();
            if (bkm.f4224b == obj) {
                bkm.f4225c = true;
                this.f4226a.remove(bkm);
            }
        }
    }
}
