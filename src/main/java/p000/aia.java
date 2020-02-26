package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: aia */
/* compiled from: PG */
public final class aia extends FilterInputStream {

    /* renamed from: a */
    private int f393a = Integer.MIN_VALUE;

    public aia(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final long m538a(long j) {
        int i = this.f393a;
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
        int i = this.f393a;
        if (i != Integer.MIN_VALUE) {
            return Math.min(i, super.available());
        }
        return super.available();
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f393a = i;
    }

    public final int read() {
        if (m538a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m539b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = (int) m538a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m539b((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f393a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        long a = m538a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m539b(skip);
        return skip;
    }

    /* renamed from: b */
    private final void m539b(long j) {
        int i = this.f393a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f393a = (int) (((long) i) - j);
        }
    }
}
