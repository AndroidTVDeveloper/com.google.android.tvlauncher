package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: cic  reason: default package */
/* compiled from: PG */
final class cic implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ cij b;

    public cic(cij cij, ArrayList arrayList) {
        this.b = cij;
        this.a = arrayList;
    }

    private final void a(chq chq, chn chn, int i) {
        int b2 = chq.b();
        Pair b3 = chq.b(chn);
        if (b3 != null) {
            ArrayList arrayList = this.b.k;
            Integer valueOf = Integer.valueOf(i);
            int indexOf = arrayList.indexOf(valueOf) + ((Integer) b3.first).intValue();
            int lastIndexOf = this.b.k.lastIndexOf(valueOf);
            if (b2 > chq.b()) {
                this.b.k.remove(lastIndexOf);
                this.b.e(lastIndexOf);
                if (lastIndexOf > 0) {
                    int i2 = lastIndexOf - 1;
                    if (((Integer) this.b.k.get(i2)).intValue() == 5) {
                        this.b.k.remove(i2);
                        this.b.e(i2);
                    }
                }
                this.b.a(indexOf, lastIndexOf - indexOf);
                return;
            }
            this.b.a(indexOf, (lastIndexOf - indexOf) + 1);
        }
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            if (chn.g && this.b.g(2)) {
                a(this.b.n, chn, 2);
            }
            a(this.b.m, chn, 1);
        }
    }
}
