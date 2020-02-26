package defpackage;

import java.io.EOFException;

/* renamed from: aqy  reason: default package */
/* compiled from: PG */
final class aqy {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final bky g = new bky(255);

    public final boolean a(aoj aoj, boolean z) {
        aoj aoj2 = aoj;
        this.g.a();
        a();
        long j = ((aof) aoj2).b;
        if ((j != -1 && j - aoj.b() < 27) || !aoj2.b(this.g.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.g.h() == 1332176723) {
            if (this.g.d() == 0) {
                this.a = this.g.d();
                bky bky = this.g;
                byte[] bArr = bky.a;
                int i = bky.b;
                int i2 = i + 1;
                bky.b = i2;
                byte b2 = bArr[i];
                int i3 = i2 + 1;
                bky.b = i3;
                byte b3 = bArr[i2];
                int i4 = i3 + 1;
                bky.b = i4;
                byte b4 = bArr[i3];
                int i5 = i4 + 1;
                bky.b = i5;
                byte b5 = bArr[i4];
                int i6 = i5 + 1;
                bky.b = i6;
                byte b6 = bArr[i5];
                int i7 = i6 + 1;
                bky.b = i7;
                byte b7 = bArr[i6];
                int i8 = i7 + 1;
                bky.b = i8;
                byte b8 = bArr[i7];
                bky.b = i8 + 1;
                this.b = (((long) b2) & 255) | ((((long) b3) & 255) << 8) | ((((long) b4) & 255) << 16) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 32) | ((((long) b7) & 255) << 40) | ((((long) b8) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
                bky.i();
                this.g.i();
                this.g.i();
                int d2 = this.g.d();
                this.c = d2;
                this.d = d2 + 27;
                this.g.a();
                aoj2.c(this.g.a, 0, this.c);
                for (int i9 = 0; i9 < this.c; i9++) {
                    this.f[i9] = this.g.d();
                    this.e += this.f[i9];
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

    public final void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }
}
