package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: ber */
/* compiled from: PG */
public final class ber extends anm {

    /* renamed from: d */
    private final bky f3587d = new bky();

    /* renamed from: e */
    private final bky f3588e = new bky();

    /* renamed from: f */
    private final beq f3589f = new beq();

    /* renamed from: g */
    private Inflater f3590g;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bdl mo1155a(byte[] bArr, int i, boolean z) {
        bdj bdj;
        bky bky;
        int i2;
        int i3;
        int g;
        ber ber = this;
        ber.f3587d.mo2068a(bArr, i);
        bky bky2 = ber.f3587d;
        if (bky2.mo2070b() > 0 && (bky2.f4258a[bky2.f4259b] & 255) == 120) {
            if (ber.f3590g == null) {
                ber.f3590g = new Inflater();
            }
            if (blm.m3651a(bky2, ber.f3588e, ber.f3590g)) {
                bky bky3 = ber.f3588e;
                bky2.mo2068a(bky3.f4258a, bky3.f4260c);
            }
        }
        ber.f3589f.mo1807a();
        ArrayList arrayList = new ArrayList();
        while (ber.f3587d.mo2070b() >= 3) {
            bky bky4 = ber.f3587d;
            beq beq = ber.f3589f;
            int i4 = bky4.f4260c;
            int d = bky4.mo2074d();
            int e = bky4.mo2076e();
            int i5 = bky4.f4259b + e;
            if (i5 <= i4) {
                if (d != 128) {
                    switch (d) {
                        case 20:
                            if (e % 5 != 2) {
                                bdj = null;
                                break;
                            } else {
                                bky4.mo2075d(2);
                                Arrays.fill(beq.f3579b, 0);
                                int i6 = 0;
                                for (int i7 = e / 5; i6 < i7; i7 = i7) {
                                    int d2 = bky4.mo2074d();
                                    int d3 = bky4.mo2074d();
                                    int d4 = bky4.mo2074d();
                                    int d5 = bky4.mo2074d();
                                    int d6 = bky4.mo2074d();
                                    double d7 = (double) d3;
                                    double d8 = (double) (d4 - 128);
                                    double d9 = (double) (d5 - 128);
                                    int[] iArr = beq.f3579b;
                                    Double.isNaN(d8);
                                    Double.isNaN(d7);
                                    int a = blm.m3624a((int) (d7 + (1.402d * d8)), 0, 255) << 16;
                                    Double.isNaN(d9);
                                    Double.isNaN(d7);
                                    Double.isNaN(d8);
                                    Double.isNaN(d9);
                                    Double.isNaN(d7);
                                    iArr[d2] = a | (d6 << 24) | (blm.m3624a((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255) << 8) | blm.m3624a((int) (d7 + (d9 * 1.772d)), 0, 255);
                                    i6++;
                                }
                                beq.f3580c = true;
                                bdj = null;
                                break;
                            }
                        case 21:
                            if (e >= 4) {
                                bky4.mo2075d(3);
                                int i8 = e - 4;
                                if ((bky4.mo2074d() & 128) != 0) {
                                    if (i8 >= 7 && (g = bky4.mo2080g()) >= 4) {
                                        beq.f3585h = bky4.mo2076e();
                                        beq.f3586i = bky4.mo2076e();
                                        beq.f3578a.mo2065a(g - 4);
                                        i8 -= 7;
                                    }
                                }
                                bky bky5 = beq.f3578a;
                                int i9 = bky5.f4259b;
                                int i10 = bky5.f4260c;
                                if (i9 < i10 && i8 > 0) {
                                    int min = Math.min(i8, i10 - i9);
                                    bky4.mo2069a(beq.f3578a.f4258a, i9, min);
                                    beq.f3578a.mo2073c(i9 + min);
                                    bdj = null;
                                    break;
                                }
                            }
                            bdj = null;
                            break;
                        case 22:
                            if (e >= 19) {
                                beq.f3581d = bky4.mo2076e();
                                beq.f3582e = bky4.mo2076e();
                                bky4.mo2075d(11);
                                beq.f3583f = bky4.mo2076e();
                                beq.f3584g = bky4.mo2076e();
                                bdj = null;
                                break;
                            }
                            bdj = null;
                            break;
                        default:
                            bdj = null;
                            break;
                    }
                } else {
                    if (beq.f3581d == 0 || beq.f3582e == 0 || beq.f3585h == 0 || beq.f3586i == 0 || (i2 = (bky = beq.f3578a).f4260c) == 0 || bky.f4259b != i2 || !beq.f3580c) {
                        bdj = null;
                    } else {
                        bky.mo2073c(0);
                        int i11 = beq.f3585h * beq.f3586i;
                        int[] iArr2 = new int[i11];
                        int i12 = 0;
                        while (i12 < i11) {
                            int d10 = beq.f3578a.mo2074d();
                            if (d10 != 0) {
                                iArr2[i12] = beq.f3579b[d10];
                                i12++;
                            } else {
                                int d11 = beq.f3578a.mo2074d();
                                if (d11 != 0) {
                                    if ((d11 & 64) != 0) {
                                        i3 = ((d11 & 63) << 8) | beq.f3578a.mo2074d();
                                    } else {
                                        i3 = d11 & 63;
                                    }
                                    int i13 = i3 + i12;
                                    Arrays.fill(iArr2, i12, i13, (d11 & 128) != 0 ? beq.f3579b[beq.f3578a.mo2074d()] : 0);
                                    i12 = i13;
                                }
                            }
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, beq.f3585h, beq.f3586i, Bitmap.Config.ARGB_8888);
                        int i14 = beq.f3583f;
                        float f = (float) beq.f3581d;
                        int i15 = beq.f3584g;
                        float f2 = (float) beq.f3582e;
                        bdj = new bdj(createBitmap, ((float) i14) / f, ((float) i15) / f2, 0, ((float) beq.f3585h) / f, ((float) beq.f3586i) / f2);
                    }
                    beq.mo1807a();
                }
                bky4.mo2073c(i5);
            } else {
                bky4.mo2073c(i4);
                bdj = null;
            }
            if (bdj != null) {
                arrayList.add(bdj);
                ber = this;
            } else {
                ber = this;
            }
        }
        return new bes(Collections.unmodifiableList(arrayList));
    }
}
