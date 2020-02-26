package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bjm  reason: default package */
/* compiled from: PG */
public final class bjm implements bht {
    private final bjk a;
    private bhy b;
    private long c;
    private File d;
    private OutputStream e;
    private long f;
    private long g;
    private bla h;

    public bjm(bjk bjk) {
        bks.b(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        this.a = (bjk) bks.a(bjk);
    }

    public final void a() {
        if (this.b != null) {
            try {
                c();
            } catch (IOException e2) {
                throw new bjl(e2);
            }
        }
    }

    private final void c() {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            try {
                outputStream.flush();
                blm.a((Closeable) this.e);
                this.e = null;
                File file = this.d;
                this.d = null;
                this.a.a(file, this.f);
            } catch (Throwable th) {
                blm.a((Closeable) this.e);
                this.e = null;
                File file2 = this.d;
                this.d = null;
                file2.delete();
                throw th;
            }
        }
    }

    public final void a(bhy bhy) {
        long j;
        if (bhy.f != -1 || !bhy.a(2)) {
            this.b = bhy;
            if (!bhy.a(4)) {
                j = Long.MAX_VALUE;
            } else {
                j = 5242880;
            }
            this.c = j;
            this.g = 0;
            try {
                b();
            } catch (IOException e2) {
                throw new bjl(e2);
            }
        } else {
            this.b = null;
        }
    }

    private final void b() {
        long j = this.b.f;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.g, this.c);
        }
        bjk bjk = this.a;
        bhy bhy = this.b;
        this.d = bjk.a(bhy.g, bhy.d + this.g, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.d);
        bla bla = this.h;
        if (bla == null) {
            this.h = new bla(fileOutputStream, (byte) 0);
        } else {
            bla.a(fileOutputStream);
        }
        this.e = this.h;
        this.f = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f == this.c) {
                        c();
                        b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.c - this.f);
                    this.e.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f += j;
                    this.g += j;
                } catch (IOException e2) {
                    throw new bjl(e2);
                }
            }
        }
    }
}
