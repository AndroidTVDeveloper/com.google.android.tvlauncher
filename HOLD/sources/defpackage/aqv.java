package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aqv  reason: default package */
/* compiled from: PG */
final class aqv extends ard {
    public bko a;
    private aqu o;

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long a(bky bky) {
        int i;
        int i2;
        int i3;
        bky bky2 = bky;
        if (!a(bky2.a)) {
            return -1;
        }
        int i4 = (bky2.a[2] & 255) >> 4;
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
                bky2.d(4);
                long j = (long) bky2.a[bky2.b];
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
                        byte b = bky2.a[bky2.b + i8];
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
                    bky2.b += i3;
                    int d = i4 == 6 ? bky.d() : bky.e();
                    bky2.c(0);
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
    public final boolean a(bky bky, long j, arb arb) {
        bky bky2 = bky;
        arb arb2 = arb;
        byte[] bArr = bky2.a;
        if (this.a == null) {
            this.a = new bko(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, bky2.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            bko bko = this.a;
            int i = bko.c;
            int i2 = bko.a;
            arb2.a = akh.a((String) null, "audio/flac", i * i2, -1, bko.b, i2, singletonList, (anq) null, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                aqu aqu = new aqu(this);
                this.o = aqu;
                bky2.d(1);
                int g = bky.g() / 18;
                aqu.a = new long[g];
                aqu.b = new long[g];
                for (int i3 = 0; i3 < g; i3++) {
                    aqu.a[i3] = bky.l();
                    aqu.b[i3] = bky.l();
                    bky2.d(2);
                }
            } else if (a(bArr)) {
                aqu aqu2 = this.o;
                if (aqu2 != null) {
                    aqu2.c = j;
                    arb2.b = aqu2;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }
}
