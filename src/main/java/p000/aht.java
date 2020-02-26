package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aht */
/* compiled from: PG */
public final class aht extends FilterInputStream {

    /* renamed from: a */
    private final long f381a;

    /* renamed from: b */
    private int f382b;

    public aht(InputStream inputStream, long j) {
        super(inputStream);
        this.f381a = j;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f381a - ((long) this.f382b), (long) this.in.available());
    }

    /* renamed from: a */
    private final int m527a(int i) {
        if (i < 0) {
            long j = this.f381a;
            int i2 = this.f382b;
            if (j - ((long) i2) > 0) {
                StringBuilder sb = new StringBuilder(87);
                sb.append("Failed to read all expected data, expected: ");
                sb.append(j);
                sb.append(", but read: ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
        } else {
            this.f382b += i;
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
        m527a(i);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return m527a(super.read(bArr, i, i2));
    }
}
