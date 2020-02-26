package p000;

import java.io.EOFException;

/* renamed from: aqy */
/* compiled from: PG */
final class aqy {

    /* renamed from: a */
    public int f1935a;

    /* renamed from: b */
    public long f1936b;

    /* renamed from: c */
    public int f1937c;

    /* renamed from: d */
    public int f1938d;

    /* renamed from: e */
    public int f1939e;

    /* renamed from: f */
    public final int[] f1940f = new int[255];

    /* renamed from: g */
    private final bky f1941g = new bky(255);

    /* renamed from: a */
    public final boolean mo1274a(aoj aoj, boolean z) {
        aoj aoj2 = aoj;
        this.f1941g.mo2064a();
        mo1273a();
        long j = ((aof) aoj2).f1489b;
        if ((j != -1 && j - aoj.mo1194b() < 27) || !aoj2.mo1197b(this.f1941g.f4258a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f1941g.mo2081h() == 1332176723) {
            if (this.f1941g.mo2074d() == 0) {
                this.f1935a = this.f1941g.mo2074d();
                bky bky = this.f1941g;
                byte[] bArr = bky.f4258a;
                int i = bky.f4259b;
                int i2 = i + 1;
                bky.f4259b = i2;
                byte b = bArr[i];
                int i3 = i2 + 1;
                bky.f4259b = i3;
                byte b2 = bArr[i2];
                int i4 = i3 + 1;
                bky.f4259b = i4;
                byte b3 = bArr[i3];
                int i5 = i4 + 1;
                bky.f4259b = i5;
                byte b4 = bArr[i4];
                int i6 = i5 + 1;
                bky.f4259b = i6;
                byte b5 = bArr[i5];
                int i7 = i6 + 1;
                bky.f4259b = i7;
                byte b6 = bArr[i6];
                int i8 = i7 + 1;
                bky.f4259b = i8;
                byte b7 = bArr[i7];
                bky.f4259b = i8 + 1;
                this.f1936b = (((long) b) & 255) | ((((long) b2) & 255) << 8) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
                bky.mo2082i();
                this.f1941g.mo2082i();
                this.f1941g.mo2082i();
                int d = this.f1941g.mo2074d();
                this.f1937c = d;
                this.f1938d = d + 27;
                this.f1941g.mo2064a();
                aoj2.mo1199c(this.f1941g.f4258a, 0, this.f1937c);
                for (int i9 = 0; i9 < this.f1937c; i9++) {
                    this.f1940f[i9] = this.f1941g.mo2074d();
                    this.f1939e += this.f1940f[i9];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ako("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ako("expected OggS capture pattern at begin of page");
        }
    }

    /* renamed from: a */
    public final void mo1273a() {
        this.f1935a = 0;
        this.f1936b = 0;
        this.f1937c = 0;
        this.f1938d = 0;
        this.f1939e = 0;
    }
}
