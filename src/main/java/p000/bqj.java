package p000;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: bqj */
/* compiled from: PG */
final class bqj extends bqo {

    /* renamed from: a */
    public final /* synthetic */ bqp f4584a;

    /* renamed from: b */
    private final Map f4585b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqj(bqp bqp, Map map) {
        super(bqp);
        this.f4584a = bqp;
        this.f4585b = map;
    }

    /* renamed from: a */
    public final void mo2315a() {
        bwi bwi;
        btn btn = new btn(this.f4584a.f4596d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boj boj : this.f4585b.keySet()) {
            boj.mo2236l();
            if (((bqg) this.f4585b.get(boj)).f4578a) {
                arrayList2.add(boj);
            } else {
                arrayList.add(boj);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                i = btn.mo2435a(this.f4584a.f4595c, (boj) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = btn.mo2435a(this.f4584a.f4595c, (boj) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            bno bno = new bno(i, null);
            bqp bqp = this.f4584a;
            bqp.f4593a.mo2332a(new bqh(this, bqp, bno));
            return;
        }
        bqp bqp2 = this.f4584a;
        if (bqp2.f4598f && (bwi = bqp2.f4597e) != null) {
            bwi.mo2492n();
        }
        for (boj boj2 : this.f4585b.keySet()) {
            bsn bsn = (bsn) this.f4585b.get(boj2);
            boj2.mo2236l();
            if (btn.mo2435a(this.f4584a.f4595c, boj2) != 0) {
                bqp bqp3 = this.f4584a;
                bqp3.f4593a.mo2332a(new bqi(bqp3, bsn));
            } else {
                boj2.mo2224a(bsn);
            }
        }
    }
}
