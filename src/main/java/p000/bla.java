package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: bla */
/* compiled from: PG */
public final class bla extends BufferedOutputStream {

    /* renamed from: a */
    private boolean f4265a;

    public bla(OutputStream outputStream) {
        super(outputStream);
    }

    public bla(OutputStream outputStream, byte b) {
        super(outputStream, 20480);
    }

    public final void close() {
        this.f4265a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int i = blm.f4293a;
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo2103a(OutputStream outputStream) {
        bks.m3512b(this.f4265a);
        this.out = outputStream;
        this.count = 0;
        this.f4265a = false;
    }
}
