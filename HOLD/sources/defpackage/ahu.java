package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: ahu  reason: default package */
/* compiled from: PG */
public final class ahu extends InputStream {
    public static final Queue a = aie.a(0);
    public InputStream b;
    public IOException c;

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.b.available();
    }

    public final void close() {
        this.b.close();
    }

    public final void mark(int i) {
        this.b.mark(i);
    }

    public final int read() {
        try {
            return this.b.read();
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final void a() {
        this.c = null;
        this.b = null;
        synchronized (a) {
            a.offer(this);
        }
    }

    public final synchronized void reset() {
        this.b.reset();
    }

    public final long skip(long j) {
        try {
            return this.b.skip(j);
        } catch (IOException e) {
            this.c = e;
            return 0;
        }
    }
}
