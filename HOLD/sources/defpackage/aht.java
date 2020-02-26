package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aht  reason: default package */
/* compiled from: PG */
public final class aht extends FilterInputStream {
    private final long a;
    private int b;

    public aht(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public final synchronized int available() {
        return (int) Math.max(this.a - ((long) this.b), (long) this.in.available());
    }

    private final int a(int i) {
        if (i < 0) {
            long j = this.a;
            int i2 = this.b;
            if (j - ((long) i2) > 0) {
                StringBuilder sb = new StringBuilder(87);
                sb.append("Failed to read all expected data, expected: ");
                sb.append(j);
                sb.append(", but read: ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
        } else {
            this.b += i;
        }
        return i;
    }

    public final synchronized int read() {
        int read;
        int i;
        read = super.read();
        if (read >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        a(i);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return a(super.read(bArr, i, i2));
    }
}
