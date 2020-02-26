package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: bla  reason: default package */
/* compiled from: PG */
public final class bla extends BufferedOutputStream {
    private boolean a;

    public bla(OutputStream outputStream) {
        super(outputStream);
    }

    public bla(OutputStream outputStream, byte b) {
        super(outputStream, 20480);
    }

    public final void close() {
        this.a = true;
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
            int i = blm.a;
            throw th;
        }
    }

    public final void a(OutputStream outputStream) {
        bks.b(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }
}
