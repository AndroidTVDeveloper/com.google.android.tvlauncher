package defpackage;

import java.io.EOFException;

/* renamed from: aoh  reason: default package */
/* compiled from: PG */
public final class aoh implements aov {
    public final void a(long j, int i, int i2, int i3, aou aou) {
    }

    public final void a(akh akh) {
    }

    public final int a(aoj aoj, int i, boolean z) {
        aof aof = (aof) aoj;
        int c = aof.c(i);
        if (c == 0) {
            byte[] bArr = aof.a;
            c = aof.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        aof.d(c);
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void a(bky bky, int i) {
        bky.d(i);
    }
}
