package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: ahu */
/* compiled from: PG */
public final class ahu extends InputStream {

    /* renamed from: a */
    public static final Queue f383a = aie.m558a(0);

    /* renamed from: b */
    public InputStream f384b;

    /* renamed from: c */
    public IOException f385c;

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.f384b.available();
    }

    public final void close() {
        this.f384b.close();
    }

    public final void mark(int i) {
        this.f384b.mark(i);
    }

    public final int read() {
        try {
            return this.f384b.read();
        } catch (IOException e) {
            this.f385c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f384b.read(bArr);
        } catch (IOException e) {
            this.f385c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f384b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f385c = e;
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo280a() {
        this.f385c = null;
        this.f384b = null;
        synchronized (f383a) {
            f383a.offer(this);
        }
    }

    public final synchronized void reset() {
        this.f384b.reset();
    }

    public final long skip(long j) {
        try {
            return this.f384b.skip(j);
        } catch (IOException e) {
            this.f385c = e;
            return 0;
        }
    }
}
