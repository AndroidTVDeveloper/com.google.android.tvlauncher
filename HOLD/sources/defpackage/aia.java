package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: aia  reason: default package */
/* compiled from: PG */
public final class aia extends FilterInputStream {
    private int a = Integer.MIN_VALUE;

    public aia(InputStream inputStream) {
        super(inputStream);
    }

    private final long a(long j) {
        int i = this.a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = (long) i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    public final int available() {
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            return Math.min(i, super.available());
        }
        return super.available();
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a2 = (int) a((long) i2);
        if (a2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a2);
        b((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        long a2 = a(j);
        if (a2 == -1) {
            return 0;
        }
        long skip = super.skip(a2);
        b(skip);
        return skip;
    }

    private final void b(long j) {
        int i = this.a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.a = (int) (((long) i) - j);
        }
    }
}
