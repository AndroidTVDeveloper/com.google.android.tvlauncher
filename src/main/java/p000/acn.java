package p000;

import java.io.InputStream;

/* renamed from: acn */
/* compiled from: PG */
final class acn implements acm {

    /* renamed from: a */
    public final InputStream f96a;

    public acn(InputStream inputStream) {
        this.f96a = inputStream;
    }

    /* renamed from: c */
    public final int mo48c() {
        return this.f96a.read();
    }

    /* renamed from: a */
    public final int mo45a() {
        return ((this.f96a.read() << 8) & 65280) | (this.f96a.read() & 255);
    }

    /* renamed from: b */
    public final short mo47b() {
        return (short) (this.f96a.read() & 255);
    }

    /* renamed from: a */
    public final long mo46a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f96a.skip(j2);
            if (skip <= 0) {
                if (this.f96a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }
}
