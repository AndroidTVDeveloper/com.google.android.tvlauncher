package p000;

import java.io.EOFException;

/* renamed from: aoh */
/* compiled from: PG */
public final class aoh implements aov {
    /* renamed from: a */
    public final void mo1203a(long j, int i, int i2, int i3, aou aou) {
    }

    /* renamed from: a */
    public final void mo1204a(akh akh) {
    }

    /* renamed from: a */
    public final int mo1202a(aoj aoj, int i, boolean z) {
        aof aof = (aof) aoj;
        int c = aof.mo1198c(i);
        if (c == 0) {
            byte[] bArr = aof.f1488a;
            c = aof.mo1190a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        aof.mo1200d(c);
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final void mo1205a(bky bky, int i) {
        bky.mo2075d(i);
    }
}
