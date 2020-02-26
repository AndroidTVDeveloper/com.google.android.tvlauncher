package p000;

import java.io.InputStream;

/* renamed from: bhx */
/* compiled from: PG */
public final class bhx extends InputStream {

    /* renamed from: a */
    private final bhv f3992a;

    /* renamed from: b */
    private final bhy f3993b;

    /* renamed from: c */
    private final byte[] f3994c;

    /* renamed from: d */
    private boolean f3995d = false;

    /* renamed from: e */
    private boolean f3996e = false;

    /* renamed from: f */
    private long f3997f;

    public bhx(bhv bhv, bhy bhy) {
        this.f3992a = bhv;
        this.f3993b = bhy;
        this.f3994c = new byte[1];
    }

    /* renamed from: a */
    public final void mo1950a() {
        if (!this.f3995d) {
            this.f3992a.mo1499a(this.f3993b);
            this.f3995d = true;
        }
    }

    public final void close() {
        if (!this.f3996e) {
            this.f3992a.mo1503c();
            this.f3996e = true;
        }
    }

    public final int read() {
        if (read(this.f3994c) != -1) {
            return this.f3994c[0] & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bks.m3512b(!this.f3996e);
        mo1950a();
        int a = this.f3992a.mo1498a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f3997f += (long) a;
        return a;
    }
}
