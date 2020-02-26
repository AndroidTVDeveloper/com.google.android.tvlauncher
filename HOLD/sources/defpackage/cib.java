package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cib  reason: default package */
/* compiled from: PG */
final class cib implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ cij b;

    public cib(cij cij, ArrayList arrayList) {
        this.b = cij;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            z = a(this.b.m, chn, 1) || z;
            if (this.b.g(2)) {
                z = a(this.b.n, chn, 2) || z;
            }
        }
        if (z && !this.a.isEmpty()) {
            if (!((chn) this.a.get(0)).g || !this.b.g(2)) {
                cij cij = this.b;
                cij.o.a((List) cij.m.a);
                return;
            }
            cij cij2 = this.b;
            cij2.o.a((List) cij2.n.a);
        }
    }

    private final boolean a(chq chq, chn chn, int i) {
        Pair a2 = chq.a(chn);
        boolean z = false;
        boolean z2 = chn.g && this.b.g(2);
        boolean z3 = i == 2;
        if (a2 == null) {
            if (z2 != z3) {
                return false;
            }
            int a3 = this.b.a(chn);
            if (a3 < chq.a.size()) {
                chq.a.add(a3, chn);
            } else {
                chq.a.add(chn);
                a3 = chq.a.size() - 1;
            }
            int intValue = ((Integer) chq.a(a3).first).intValue();
            ArrayList arrayList = this.b.k;
            Integer valueOf = Integer.valueOf(i);
            int indexOf = arrayList.indexOf(valueOf);
            int lastIndexOf = this.b.k.lastIndexOf(valueOf);
            int i2 = intValue + indexOf;
            if (indexOf != -1) {
                if ((lastIndexOf - indexOf) + 1 < chq.b()) {
                    lastIndexOf++;
                    this.b.k.add(lastIndexOf, valueOf);
                    this.b.d(lastIndexOf);
                }
                if (i2 != lastIndexOf) {
                    this.b.a(i2, (lastIndexOf - i2) + 1);
                    return true;
                }
                this.b.c(lastIndexOf);
                return true;
            }
            int h = this.b.h(i);
            this.b.k.add(h, 5);
            this.b.d(h);
            int i3 = h + 1;
            this.b.k.add(i3, valueOf);
            this.b.d(i3 - 1);
            return true;
        } else if (z2 == z3) {
            chq.a.set(chq.a(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue()), chn);
            cij cij = this.b;
            cij.a(cij.k.indexOf(Integer.valueOf(i)) + ((Integer) a2.first).intValue(), a2.second);
            return false;
        } else {
            int b2 = chq.b();
            if (chq.b(chn) != null) {
                z = true;
            }
            ArrayList arrayList2 = this.b.k;
            Integer valueOf2 = Integer.valueOf(i);
            int indexOf2 = arrayList2.indexOf(valueOf2) + ((Integer) a2.first).intValue();
            int lastIndexOf2 = this.b.k.lastIndexOf(valueOf2);
            if (chq.b() < b2) {
                this.b.a(indexOf2, lastIndexOf2 - indexOf2);
                this.b.k.remove(lastIndexOf2);
                this.b.e(lastIndexOf2);
                return z;
            }
            this.b.a(indexOf2, (lastIndexOf2 - indexOf2) + 1);
            return z;
        }
    }
}
