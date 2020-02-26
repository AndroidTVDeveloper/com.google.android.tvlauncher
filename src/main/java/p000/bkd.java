package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bkd */
/* compiled from: PG */
public final class bkd extends OutputStream {

    /* renamed from: a */
    private final FileOutputStream f4202a;

    /* renamed from: b */
    private boolean f4203b = false;

    public bkd(File file) {
        this.f4202a = new FileOutputStream(file);
    }

    public final void close() {
        if (!this.f4203b) {
            this.f4203b = true;
            flush();
            try {
                this.f4202a.getFD().sync();
            } catch (IOException e) {
                Log.w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f4202a.close();
        }
    }

    public final void flush() {
        this.f4202a.flush();
    }

    public final void write(int i) {
        this.f4202a.write(i);
    }

    public final void write(byte[] bArr) {
        this.f4202a.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f4202a.write(bArr, i, i2);
    }
}
