package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aqv */
/* compiled from: PG */
final class aqv extends ard {

    /* renamed from: a */
    public bko f1925a;

    /* renamed from: o */
    private aqu f1926o;

    /* renamed from: a */
    private static boolean m1846a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo1269a(bky bky) {
        int i;
        int i2;
        int i3;
        bky bky2 = bky;
        if (!m1846a(bky2.f4258a)) {
            return -1;
        }
        int i4 = (bky2.f4258a[2] & 255) >> 4;
        int i5 = -1;
        switch (i4) {
            case 1:
                i5 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 576;
                i = i4 - 2;
                i5 = i2 << i;
                break;
            case 6:
            case 7:
                bky2.mo2075d(4);
                long j = (long) bky2.f4258a[bky2.f4259b];
                int i6 = 7;
                while (true) {
                    if (i6 >= 0) {
                        int i7 = 1 << i6;
                        if ((((long) i7) & j) != 0) {
                            i6--;
                        } else if (i6 < 6) {
                            j &= (long) (i7 - 1);
                            i3 = 7 - i6;
                        } else if (i6 == 7) {
                            i3 = 1;
                        }
                    }
                }
                i3 = 0;
                if (i3 != 0) {
                    int i8 = 1;
                    while (i8 < i3) {
                        byte b = bky2.f4258a[bky2.f4259b + i8];
                        if ((b & 192) == 128) {
                            j = (j << 6) | ((long) (b & 63));
                            i8++;
                        } else {
                            StringBuilder sb = new StringBuilder(62);
                            sb.append("Invalid UTF-8 sequence continuation byte: ");
                            sb.append(j);
                            throw new NumberFormatException(sb.toString());
                        }
                    }
                    bky2.f4259b += i3;
                    int d = i4 == 6 ? bky.mo2074d() : bky.mo2076e();
                    bky2.mo2073c(0);
                    i5 = d + 1;
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("Invalid UTF-8 sequence first byte: ");
                    sb2.append(j);
                    throw new NumberFormatException(sb2.toString());
                }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 256;
                i = i4 - 8;
                i5 = i2 << i;
                break;
        }
        return (long) i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1271a(bky bky, long j, arb arb) {
        bky bky2 = bky;
        arb arb2 = arb;
        byte[] bArr = bky2.f4258a;
        if (this.f1925a == null) {
            this.f1925a = new bko(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, bky2.f4260c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            bko bko = this.f1925a;
            int i = bko.f4229c;
            int i2 = bko.f4227a;
            arb2.f1946a = akh.m731a((String) null, "audio/flac", i * i2, -1, bko.f4228b, i2, singletonList, (anq) null, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                aqu aqu = new aqu(this);
                this.f1926o = aqu;
                bky2.mo2075d(1);
                int g = bky.mo2080g() / 18;
                aqu.f1920a = new long[g];
                aqu.f1921b = new long[g];
                for (int i3 = 0; i3 < g; i3++) {
                    aqu.f1920a[i3] = bky.mo2085l();
                    aqu.f1921b[i3] = bky.mo2085l();
                    bky2.mo2075d(2);
                }
            } else if (m1846a(bArr)) {
                aqu aqu2 = this.f1926o;
                if (aqu2 != null) {
                    aqu2.f1922c = j;
                    arb2.f1947b = aqu2;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1270a(boolean z) {
        super.mo1270a(z);
        if (z) {
            this.f1925a = null;
            this.f1926o = null;
        }
    }
}
