package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cib */
/* compiled from: PG */
final class cib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f5592a;

    /* renamed from: b */
    private final /* synthetic */ cij f5593b;

    public cib(cij cij, ArrayList arrayList) {
        this.f5593b = cij;
        this.f5592a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f5592a;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            z = m4773a(this.f5593b.f5631m, chn, 1) || z;
            if (this.f5593b.mo2858g(2)) {
                z = m4773a(this.f5593b.f5632n, chn, 2) || z;
            }
        }
        if (z && !this.f5592a.isEmpty()) {
            if (!((chn) this.f5592a.get(0)).f5567g || !this.f5593b.mo2858g(2)) {
                cij cij = this.f5593b;
                cij.f5633o.mo2888a((List) cij.f5631m.f5580a);
                return;
            }
            cij cij2 = this.f5593b;
            cij2.f5633o.mo2888a((List) cij2.f5632n.f5580a);
        }
    }

    /* renamed from: a */
    private final boolean m4773a(chq chq, chn chn, int i) {
        Pair a = chq.mo2820a(chn);
        boolean z = false;
        boolean z2 = chn.f5567g && this.f5593b.mo2858g(2);
        boolean z3 = i == 2;
        if (a == null) {
            if (z2 != z3) {
                return false;
            }
            int a2 = this.f5593b.mo2851a(chn);
            if (a2 < chq.f5580a.size()) {
                chq.f5580a.add(a2, chn);
            } else {
                chq.f5580a.add(chn);
                a2 = chq.f5580a.size() - 1;
            }
            int intValue = ((Integer) chq.m4748a(a2).first).intValue();
            ArrayList arrayList = this.f5593b.f5629k;
            Integer valueOf = Integer.valueOf(i);
            int indexOf = arrayList.indexOf(valueOf);
            int lastIndexOf = this.f5593b.f5629k.lastIndexOf(valueOf);
            int i2 = intValue + indexOf;
            if (indexOf != -1) {
                if ((lastIndexOf - indexOf) + 1 < chq.mo2823b()) {
                    lastIndexOf++;
                    this.f5593b.f5629k.add(lastIndexOf, valueOf);
                    this.f5593b.mo5313d(lastIndexOf);
                }
                if (i2 != lastIndexOf) {
                    this.f5593b.mo5304a(i2, (lastIndexOf - i2) + 1);
                    return true;
                }
                this.f5593b.mo5312c(lastIndexOf);
                return true;
            }
            int h = this.f5593b.mo2859h(i);
            this.f5593b.f5629k.add(h, 5);
            this.f5593b.mo5313d(h);
            int i3 = h + 1;
            this.f5593b.f5629k.add(i3, valueOf);
            this.f5593b.mo5313d(i3 - 1);
            return true;
        } else if (z2 == z3) {
            chq.f5580a.set(chq.m4747a(((Integer) a.first).intValue(), ((Integer) a.second).intValue()), chn);
            cij cij = this.f5593b;
            cij.mo5306a(cij.f5629k.indexOf(Integer.valueOf(i)) + ((Integer) a.first).intValue(), a.second);
            return false;
        } else {
            int b = chq.mo2823b();
            if (chq.mo2824b(chn) != null) {
                z = true;
            }
            ArrayList arrayList2 = this.f5593b.f5629k;
            Integer valueOf2 = Integer.valueOf(i);
            int indexOf2 = arrayList2.indexOf(valueOf2) + ((Integer) a.first).intValue();
            int lastIndexOf2 = this.f5593b.f5629k.lastIndexOf(valueOf2);
            if (chq.mo2823b() < b) {
                this.f5593b.mo5304a(indexOf2, lastIndexOf2 - indexOf2);
                this.f5593b.f5629k.remove(lastIndexOf2);
                this.f5593b.mo5314e(lastIndexOf2);
                return z;
            }
            this.f5593b.mo5304a(indexOf2, (lastIndexOf2 - indexOf2) + 1);
            return z;
        }
    }
}
