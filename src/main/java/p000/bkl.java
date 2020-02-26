package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bkl */
/* compiled from: PG */
public final /* synthetic */ class bkl implements Runnable {

    /* renamed from: a */
    private final bkm f4222a;

    public bkl(bkm bkm) {
        this.f4222a = bkm;
    }

    public final void run() {
        ali ali;
        bkm bkm = this.f4222a;
        if (!bkm.f4225c) {
            Object obj = bkm.f4224b;
            Map map = bid.f4023a;
            alk alk = (alk) obj;
            alj alj = alk.f697b;
            if (!alj.f688a.isEmpty()) {
                ArrayList arrayList = alj.f688a;
                ali = (ali) arrayList.get(arrayList.size() - 1);
            } else {
                ali = null;
            }
            alk.mo556a(ali);
            Iterator it = alk.f696a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).mo582c();
            }
        }
    }
}
