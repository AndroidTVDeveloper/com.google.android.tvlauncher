package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bqk  reason: default package */
/* compiled from: PG */
final class bqk extends bqo {
    private final ArrayList a;
    private final /* synthetic */ bqp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqk(bqp bqp, ArrayList arrayList) {
        super(bqp);
        this.b = bqp;
        this.a = arrayList;
    }

    public final void a() {
        Set set;
        bqp bqp = this.b;
        bqt bqt = bqp.a.l;
        bsv bsv = bqp.k;
        if (bsv != null) {
            set = new HashSet(bsv.a);
            Map map = bqp.k.c;
            for (bok bok : map.keySet()) {
                if (!bqp.a.g.containsKey(bok.a())) {
                    bty bty = (bty) map.get(bok);
                    set.addAll(null);
                }
            }
        } else {
            set = Collections.emptySet();
        }
        bqt.g = set;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bqp bqp2 = this.b;
            ((boj) arrayList.get(i)).a(bqp2.h, bqp2.a.l.g);
        }
    }
}
