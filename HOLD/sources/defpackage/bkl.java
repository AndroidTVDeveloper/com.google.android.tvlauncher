package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bkl  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class bkl implements Runnable {
    private final bkm a;

    public bkl(bkm bkm) {
        this.a = bkm;
    }

    public final void run() {
        ali ali;
        bkm bkm = this.a;
        if (!bkm.c) {
            Object obj = bkm.b;
            Map map = bid.a;
            alk alk = (alk) obj;
            alj alj = alk.b;
            if (!alj.a.isEmpty()) {
                ArrayList arrayList = alj.a;
                ali = (ali) arrayList.get(arrayList.size() - 1);
            } else {
                ali = null;
            }
            alk.a(ali);
            Iterator it = alk.a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).c();
            }
        }
    }
}
