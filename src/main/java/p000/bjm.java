package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bjm */
/* compiled from: PG */
public final class bjm implements bht {

    /* renamed from: a */
    private final bjk f4132a;

    /* renamed from: b */
    private bhy f4133b;

    /* renamed from: c */
    private long f4134c;

    /* renamed from: d */
    private File f4135d;

    /* renamed from: e */
    private OutputStream f4136e;

    /* renamed from: f */
    private long f4137f;

    /* renamed from: g */
    private long f4138g;

    /* renamed from: h */
    private bla f4139h;

    public bjm(bjk bjk) {
        bks.m3513b(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        this.f4132a = (bjk) bks.m3507a(bjk);
    }

    /* renamed from: a */
    public final void mo1946a() {
        if (this.f4133b != null) {
            try {
                m3419c();
            } catch (IOException e) {
                throw new bjl(e);
            }
        }
    }

    /* renamed from: c */
    private final void m3419c() {
        OutputStream outputStream = this.f4136e;
        if (outputStream != null) {
            try {
                outputStream.flush();
                blm.m3645a((Closeable) this.f4136e);
                this.f4136e = null;
                File file = this.f4135d;
                this.f4135d = null;
                this.f4132a.mo2002a(file, this.f4137f);
            } catch (Throwable th) {
                blm.m3645a((Closeable) this.f4136e);
                this.f4136e = null;
                File file2 = this.f4135d;
                this.f4135d = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo1947a(bhy bhy) {
        long j;
        if (bhy.f4003f != -1 || !bhy.mo1957a(2)) {
            this.f4133b = bhy;
            if (!bhy.mo1957a(4)) {
                j = Long.MAX_VALUE;
            } else {
                j = 5242880;
            }
            this.f4134c = j;
            this.f4138g = 0;
            try {
                m3418b();
            } catch (IOException e) {
                throw new bjl(e);
            }
        } else {
            this.f4133b = null;
        }
    }

    /* renamed from: b */
    private final void m3418b() {
        long j = this.f4133b.f4003f;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f4138g, this.f4134c);
        }
        bjk bjk = this.f4132a;
        bhy bhy = this.f4133b;
        this.f4135d = bjk.mo2000a(bhy.f4004g, bhy.f4001d + this.f4138g, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f4135d);
        bla bla = this.f4139h;
        if (bla == null) {
            this.f4139h = new bla(fileOutputStream, (byte) 0);
        } else {
            bla.mo2103a(fileOutputStream);
        }
        this.f4136e = this.f4139h;
        this.f4137f = 0;
    }

    /* renamed from: a */
    public final void mo1948a(byte[] bArr, int i, int i2) {
        if (this.f4133b != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f4137f == this.f4134c) {
                        m3419c();
                        m3418b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f4134c - this.f4137f);
                    this.f4136e.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f4137f += j;
                    this.f4138g += j;
                } catch (IOException e) {
                    throw new bjl(e);
                }
            }
        }
    }
}
