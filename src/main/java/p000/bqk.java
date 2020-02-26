package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bqk */
/* compiled from: PG */
final class bqk extends bqo {

    /* renamed from: a */
    private final ArrayList f4586a;

    /* renamed from: b */
    private final /* synthetic */ bqp f4587b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqk(bqp bqp, ArrayList arrayList) {
        super(bqp);
        this.f4587b = bqp;
        this.f4586a = arrayList;
    }

    /* renamed from: a */
    public final void mo2315a() {
        Set set;
        bqp bqp = this.f4587b;
        bqt bqt = bqp.f4593a.f4655l;
        bsv bsv = bqp.f4603k;
        if (bsv != null) {
            set = new HashSet(bsv.f4769a);
            Map map = bqp.f4603k.f4771c;
            for (bok bok : map.keySet()) {
                if (!bqp.f4593a.f4650g.containsKey(bok.mo2237a())) {
                    bty bty = (bty) map.get(bok);
                    set.addAll(null);
                }
            }
        } else {
            set = Collections.emptySet();
        }
        bqt.f4623g = set;
        ArrayList arrayList = this.f4586a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bqp bqp2 = this.f4587b;
            ((boj) arrayList.get(i)).mo2226a(bqp2.f4600h, bqp2.f4593a.f4655l.f4623g);
        }
    }
}
