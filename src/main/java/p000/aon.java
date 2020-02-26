package p000;

import java.io.EOFException;

/* renamed from: aon */
/* compiled from: PG */
public final class aon {

    /* renamed from: a */
    private final bky f1499a = new bky(10);

    /* renamed from: a */
    public final atw mo1215a(aoj aoj) {
        atw atw = null;
        int i = 0;
        while (true) {
            try {
                aoj.mo1199c(this.f1499a.f4258a, 0, 10);
                this.f1499a.mo2073c(0);
                if (this.f1499a.mo2080g() != 4801587) {
                    break;
                }
                this.f1499a.mo2075d(3);
                int m = this.f1499a.mo2086m();
                int i2 = m + 10;
                if (atw == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f1499a.f4258a, 0, bArr, 0, 10);
                    aoj.mo1199c(bArr, 10, m);
                    atw = avb.m2176a(bArr, i2);
                } else {
                    aoj.mo1195b(m);
                }
                i += i2;
            } catch (EOFException e) {
            }
        }
        aoj.mo1191a();
        aoj.mo1195b(i);
        return atw;
    }
}
