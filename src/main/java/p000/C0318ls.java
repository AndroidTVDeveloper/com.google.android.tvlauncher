package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: ls */
/* compiled from: PG */
final class C0318ls extends MediaDataSource {

    /* renamed from: a */
    private long f9866a;

    /* renamed from: b */
    private final /* synthetic */ C0319lt f9867b;

    public C0318ls(C0319lt ltVar) {
        this.f9867b = ltVar;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f9866a;
            if (j2 != j) {
                if (j2 >= 0) {
                    if (j >= j2 + ((long) this.f9867b.available())) {
                        return -1;
                    }
                }
                this.f9867b.mo5548a(j);
                this.f9866a = j;
            }
            if (i2 > this.f9867b.available()) {
                i2 = this.f9867b.available();
            }
            int read = this.f9867b.read(bArr, i, i2);
            if (read >= 0) {
                this.f9866a += (long) read;
                return read;
            }
        } catch (IOException e) {
        }
        this.f9866a = -1;
        return -1;
    }
}
