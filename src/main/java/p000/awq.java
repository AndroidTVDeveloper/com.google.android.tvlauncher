package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: awq */
/* compiled from: PG */
final class awq implements bhv {

    /* renamed from: a */
    private final bhv f2561a;

    /* renamed from: b */
    private final int f2562b;

    /* renamed from: c */
    private final awp f2563c;

    /* renamed from: d */
    private final byte[] f2564d;

    /* renamed from: e */
    private int f2565e;

    public awq(bhv bhv, int i, awp awp) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bks.m3510a(z);
        this.f2561a = bhv;
        this.f2562b = i;
        this.f2563c = awp;
        this.f2564d = new byte[1];
        this.f2565e = i;
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f2561a.mo1501a(bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Map mo1502b() {
        return this.f2561a.mo1502b();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f2561a.mo1500a();
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        long j;
        int i3 = this.f2565e;
        if (i3 == 0) {
            if (this.f2561a.mo1498a(this.f2564d, 0, 1) != -1) {
                int i4 = (this.f2564d[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr2 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int a = this.f2561a.mo1498a(bArr2, i6, i5);
                        if (a != -1) {
                            i6 += a;
                            i5 -= a;
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
                        awp awp = this.f2563c;
                        bky bky = new bky(bArr2, i4);
                        axk axk = (axk) awp;
                        if (axk.f2617d) {
                            axq axq = axk.f2618e;
                            Map map = axq.f2639a;
                            j = Math.max(axq.mo1554j(), axk.f2614a);
                        } else {
                            j = axk.f2614a;
                        }
                        int b = bky.mo2070b();
                        aov aov = (aov) bks.m3507a(axk.f2616c);
                        aov.mo1205a(bky, b);
                        aov.mo1203a(j, 1, b, 0, null);
                        axk.f2617d = true;
                    }
                }
                i3 = this.f2562b;
                this.f2565e = i3;
            }
            return -1;
        }
        int a2 = this.f2561a.mo1498a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.f2565e -= a2;
        }
        return a2;
    }
}
