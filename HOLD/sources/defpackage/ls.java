package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: ls  reason: default package */
/* compiled from: PG */
final class ls extends MediaDataSource {
    private long a;
    private final /* synthetic */ lt b;

    public ls(lt ltVar) {
        this.b = ltVar;
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
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0) {
                    if (j >= j2 + ((long) this.b.available())) {
                        return -1;
                    }
                }
                this.b.a(j);
                this.a = j;
            }
            if (i2 > this.b.available()) {
                i2 = this.b.available();
            }
            int read = this.b.read(bArr, i, i2);
            if (read >= 0) {
                this.a += (long) read;
                return read;
            }
        } catch (IOException e) {
        }
        this.a = -1;
        return -1;
    }
}
