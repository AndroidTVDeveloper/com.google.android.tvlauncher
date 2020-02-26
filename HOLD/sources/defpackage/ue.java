package defpackage;

import java.io.OutputStream;

/* renamed from: ue  reason: default package */
/* compiled from: PG */
public final class ue extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private final xe c;
    private int d;

    public ue(OutputStream outputStream, xe xeVar) {
        this.a = outputStream;
        this.c = xeVar;
        this.b = (byte[]) xeVar.a(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.c.a(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    public final void flush() {
        a();
        this.a.flush();
    }

    private final void a() {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private final void b() {
        if (this.d == this.b.length) {
            a();
        }
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            if (i6 == 0 && i4 >= this.b.length) {
                this.a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.d, min);
            this.d += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }
}
