package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ahp */
/* compiled from: PG */
final class ahp extends InputStream {

    /* renamed from: a */
    private final ByteBuffer f374a;

    /* renamed from: b */
    private int f375b = -1;

    public ahp(ByteBuffer byteBuffer) {
        this.f374a = byteBuffer;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.f374a.remaining();
    }

    public final synchronized void mark(int i) {
        this.f375b = this.f374a.position();
    }

    public final int read() {
        if (this.f374a.hasRemaining()) {
            return this.f374a.get() & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f374a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.f374a.get(bArr, i, min);
        return min;
    }

    public final synchronized void reset() {
        int i = this.f375b;
        if (i != -1) {
            this.f374a.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        if (!this.f374a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        ByteBuffer byteBuffer = this.f374a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }
}
