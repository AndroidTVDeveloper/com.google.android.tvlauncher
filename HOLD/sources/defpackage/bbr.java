package defpackage;

import java.util.Map;

/* renamed from: bbr  reason: default package */
/* compiled from: PG */
final class bbr extends axw {
    private final Map d;

    public bbr(bhk bhk, anu anu, Map map) {
        super(bhk, anu);
        this.d = map;
    }

    public final void a(akh akh) {
        anq anq;
        anq anq2 = akh.l;
        if (!(anq2 == null || (anq = (anq) this.d.get(anq2.a)) == null)) {
            anq2 = anq;
        }
        atw atw = akh.g;
        if (atw != null) {
            int a = atw.a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= a) {
                    i2 = -1;
                    break;
                }
                atv a2 = atw.a(i2);
                if ((a2 instanceof avi) && "com.apple.streaming.transportStreamTimestamp".equals(((avi) a2).a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (a != 1) {
                    atv[] atvArr = new atv[(a - 1)];
                    while (i < a) {
                        if (i != i2) {
                            atvArr[i >= i2 ? i - 1 : i] = atw.a(i);
                        }
                        i++;
                    }
                    atw = new atw(atvArr);
                }
            }
            super.a(akh.a(anq2, atw));
        }
        atw = null;
        super.a(akh.a(anq2, atw));
    }
}
