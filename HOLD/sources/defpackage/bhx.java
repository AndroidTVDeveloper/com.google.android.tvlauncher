package defpackage;

import java.io.InputStream;

/* renamed from: bhx  reason: default package */
/* compiled from: PG */
public final class bhx extends InputStream {
    private final bhv a;
    private final bhy b;
    private final byte[] c;
    private boolean d = false;
    private boolean e = false;
    private long f;

    public bhx(bhv bhv, bhy bhy) {
        this.a = bhv;
        this.b = bhy;
        this.c = new byte[1];
    }

    public final void a() {
        if (!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
    }

    public final void close() {
        if (!this.e) {
            this.a.c();
            this.e = true;
        }
    }

    public final int read() {
        if (read(this.c) != -1) {
            return this.c[0] & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bks.b(!this.e);
        a();
        int a2 = this.a.a(bArr, i, i2);
        if (a2 == -1) {
            return -1;
        }
        this.f += (long) a2;
        return a2;
    }
}
