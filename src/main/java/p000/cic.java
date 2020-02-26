package p000;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: cic */
/* compiled from: PG */
final class cic implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f5594a;

    /* renamed from: b */
    private final /* synthetic */ cij f5595b;

    public cic(cij cij, ArrayList arrayList) {
        this.f5595b = cij;
        this.f5594a = arrayList;
    }

    /* renamed from: a */
    private final void m4774a(chq chq, chn chn, int i) {
        int b = chq.mo2823b();
        Pair b2 = chq.mo2824b(chn);
        if (b2 != null) {
            ArrayList arrayList = this.f5595b.f5629k;
            Integer valueOf = Integer.valueOf(i);
            int indexOf = arrayList.indexOf(valueOf) + ((Integer) b2.first).intValue();
            int lastIndexOf = this.f5595b.f5629k.lastIndexOf(valueOf);
            if (b > chq.mo2823b()) {
                this.f5595b.f5629k.remove(lastIndexOf);
                this.f5595b.mo5314e(lastIndexOf);
                if (lastIndexOf > 0) {
                    int i2 = lastIndexOf - 1;
                    if (((Integer) this.f5595b.f5629k.get(i2)).intValue() == 5) {
                        this.f5595b.f5629k.remove(i2);
                        this.f5595b.mo5314e(i2);
                    }
                }
                this.f5595b.mo5304a(indexOf, lastIndexOf - indexOf);
                return;
            }
            this.f5595b.mo5304a(indexOf, (lastIndexOf - indexOf) + 1);
        }
    }

    public final void run() {
        ArrayList arrayList = this.f5594a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            if (chn.f5567g && this.f5595b.mo2858g(2)) {
                m4774a(this.f5595b.f5632n, chn, 2);
            }
            m4774a(this.f5595b.f5631m, chn, 1);
        }
    }
}
