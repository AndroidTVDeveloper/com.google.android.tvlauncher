package p000;

import java.util.Map;

/* renamed from: bbr */
/* compiled from: PG */
final class bbr extends axw {

    /* renamed from: d */
    private final Map f3140d;

    public bbr(bhk bhk, anu anu, Map map) {
        super(bhk, anu);
        this.f3140d = map;
    }

    /* renamed from: a */
    public final void mo1204a(akh akh) {
        anq anq;
        anq anq2 = akh.f559l;
        if (!(anq2 == null || (anq = (anq) this.f3140d.get(anq2.f1450a)) == null)) {
            anq2 = anq;
        }
        atw atw = akh.f554g;
        if (atw != null) {
            int a = atw.mo1344a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= a) {
                    i2 = -1;
                    break;
                }
                atv a2 = atw.mo1345a(i2);
                if ((a2 instanceof avi) && "com.apple.streaming.transportStreamTimestamp".equals(((avi) a2).f2492a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (a != 1) {
                    atv[] atvArr = new atv[(a - 1)];
                    while (i < a) {
                        if (i != i2) {
                            atvArr[i >= i2 ? i - 1 : i] = atw.mo1345a(i);
                        }
                        i++;
                    }
                    atw = new atw(atvArr);
                }
            }
            super.mo1204a(akh.mo424a(anq2, atw));
        }
        atw = null;
        super.mo1204a(akh.mo424a(anq2, atw));
    }
}
