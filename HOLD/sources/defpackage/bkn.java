package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bkn  reason: default package */
/* compiled from: PG */
public final class bkn {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            bkm bkm = (bkm) it.next();
            if (bkm.b == obj) {
                bkm.c = true;
                this.a.remove(bkm);
            }
        }
    }
}
