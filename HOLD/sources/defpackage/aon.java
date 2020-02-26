package defpackage;

import java.io.EOFException;

/* renamed from: aon  reason: default package */
/* compiled from: PG */
public final class aon {
    private final bky a = new bky(10);

    public final atw a(aoj aoj) {
        atw atw = null;
        int i = 0;
        while (true) {
            try {
                aoj.c(this.a.a, 0, 10);
                this.a.c(0);
                if (this.a.g() != 4801587) {
                    break;
                }
                this.a.d(3);
                int m = this.a.m();
                int i2 = m + 10;
                if (atw == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    aoj.c(bArr, 10, m);
                    atw = avb.a(bArr, i2);
                } else {
                    aoj.b(m);
                }
                i += i2;
            } catch (EOFException e) {
            }
        }
        aoj.a();
        aoj.b(i);
        return atw;
    }
}
