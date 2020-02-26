package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ahp  reason: default package */
/* compiled from: PG */
final class ahp extends InputStream {
    private final ByteBuffer a;
    private int b = -1;

    public ahp(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.a.remaining();
    }

    public final synchronized void mark(int i) {
        this.b = this.a.position();
    }

    public final int read() {
        if (this.a.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.a.get(bArr, i, min);
        return min;
    }

    public final synchronized void reset() {
        int i = this.b;
        if (i != -1) {
            this.a.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }
}
