package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: bqj  reason: default package */
/* compiled from: PG */
final class bqj extends bqo {
    public final /* synthetic */ bqp a;
    private final Map b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqj(bqp bqp, Map map) {
        super(bqp);
        this.a = bqp;
        this.b = map;
    }

    public final void a() {
        bwi bwi;
        btn btn = new btn(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boj boj : this.b.keySet()) {
            boj.l();
            if (((bqg) this.b.get(boj)).a) {
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
                i = btn.a(this.a.c, (boj) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = btn.a(this.a.c, (boj) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            bno bno = new bno(i, null);
            bqp bqp = this.a;
            bqp.a.a(new bqh(this, bqp, bno));
            return;
        }
        bqp bqp2 = this.a;
        if (bqp2.f && (bwi = bqp2.e) != null) {
            bwi.n();
        }
        for (boj boj2 : this.b.keySet()) {
            bsn bsn = (bsn) this.b.get(boj2);
            boj2.l();
            if (btn.a(this.a.c, boj2) != 0) {
                bqp bqp3 = this.a;
                bqp3.a.a(new bqi(bqp3, bsn));
            } else {
                boj2.a(bsn);
            }
        }
    }
}
