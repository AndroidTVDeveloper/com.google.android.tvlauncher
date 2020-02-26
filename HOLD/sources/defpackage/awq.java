package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: awq  reason: default package */
/* compiled from: PG */
final class awq implements bhv {
    private final bhv a;
    private final int b;
    private final awp c;
    private final byte[] d;
    private int e;

    public awq(bhv bhv, int i, awp awp) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bks.a(z);
        this.a = bhv;
        this.b = i;
        this.c = awp;
        this.d = new byte[1];
        this.e = i;
    }

    public final void a(bjf bjf) {
        this.a.a(bjf);
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final Map b() {
        return this.a.b();
    }

    public final Uri a() {
        return this.a.a();
    }

    public final long a(bhy bhy) {
        throw new UnsupportedOperationException();
    }

    public final int a(byte[] bArr, int i, int i2) {
        long j;
        int i3 = this.e;
        if (i3 == 0) {
            if (this.a.a(this.d, 0, 1) != -1) {
                int i4 = (this.d[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr2 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int a2 = this.a.a(bArr2, i6, i5);
                        if (a2 != -1) {
                            i6 += a2;
                            i5 -= a2;
                        }
                    }
                    while (i4 > 0) {
                        int i7 = i4 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i4 = i7;
                    }
                    if (i4 > 0) {
                        awp awp = this.c;
                        bky bky = new bky(bArr2, i4);
                        axk axk = (axk) awp;
                        if (axk.d) {
                            axq axq = axk.e;
                            Map map = axq.a;
                            j = Math.max(axq.j(), axk.a);
                        } else {
                            j = axk.a;
                        }
                        int b2 = bky.b();
                        aov aov = (aov) bks.a(axk.c);
                        aov.a(bky, b2);
                        aov.a(j, 1, b2, 0, null);
                        axk.d = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int a3 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a3 != -1) {
            this.e -= a3;
        }
        return a3;
    }
}
