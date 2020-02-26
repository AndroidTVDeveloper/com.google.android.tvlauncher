package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: ber  reason: default package */
/* compiled from: PG */
public final class ber extends anm {
    private final bky d = new bky();
    private final bky e = new bky();
    private final beq f = new beq();
    private Inflater g;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    public final bdl a(byte[] bArr, int i, boolean z) {
        bdj bdj;
        bky bky;
        int i2;
        int i3;
        int g2;
        ber ber = this;
        ber.d.a(bArr, i);
        bky bky2 = ber.d;
        if (bky2.b() > 0 && (bky2.a[bky2.b] & 255) == 120) {
            if (ber.g == null) {
                ber.g = new Inflater();
            }
            if (blm.a(bky2, ber.e, ber.g)) {
                bky bky3 = ber.e;
                bky2.a(bky3.a, bky3.c);
            }
        }
        ber.f.a();
        ArrayList arrayList = new ArrayList();
        while (ber.d.b() >= 3) {
            bky bky4 = ber.d;
            beq beq = ber.f;
            int i4 = bky4.c;
            int d2 = bky4.d();
            int e2 = bky4.e();
            int i5 = bky4.b + e2;
            if (i5 <= i4) {
                if (d2 != 128) {
                    switch (d2) {
                        case 20:
                            if (e2 % 5 != 2) {
                                bdj = null;
                                break;
                            } else {
                                bky4.d(2);
                                Arrays.fill(beq.b, 0);
                                int i6 = 0;
                                for (int i7 = e2 / 5; i6 < i7; i7 = i7) {
                                    int d3 = bky4.d();
                                    int d4 = bky4.d();
                                    int d5 = bky4.d();
                                    int d6 = bky4.d();
                                    int d7 = bky4.d();
                                    double d8 = (double) d4;
                                    double d9 = (double) (d5 - 128);
                                    double d10 = (double) (d6 - 128);
                                    int[] iArr = beq.b;
                                    Double.isNaN(d9);
                                    Double.isNaN(d8);
                                    int a = blm.a((int) (d8 + (1.402d * d9)), 0, 255) << 16;
                                    Double.isNaN(d10);
                                    Double.isNaN(d8);
                                    Double.isNaN(d9);
                                    Double.isNaN(d10);
                                    Double.isNaN(d8);
                                    iArr[d3] = a | (d7 << 24) | (blm.a((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255) << 8) | blm.a((int) (d8 + (d10 * 1.772d)), 0, 255);
                                    i6++;
                                }
                                beq.c = true;
                                bdj = null;
                                break;
                            }
                        case 21:
                            if (e2 >= 4) {
                                bky4.d(3);
                                int i8 = e2 - 4;
                                if ((bky4.d() & 128) != 0) {
                                    if (i8 >= 7 && (g2 = bky4.g()) >= 4) {
                                        beq.h = bky4.e();
                                        beq.i = bky4.e();
                                        beq.a.a(g2 - 4);
                                        i8 -= 7;
                                    }
                                }
                                bky bky5 = beq.a;
                                int i9 = bky5.b;
                                int i10 = bky5.c;
                                if (i9 < i10 && i8 > 0) {
                                    int min = Math.min(i8, i10 - i9);
                                    bky4.a(beq.a.a, i9, min);
                                    beq.a.c(i9 + min);
                                    bdj = null;
                                    break;
                                }
                            }
                            bdj = null;
                            break;
                        case 22:
                            if (e2 >= 19) {
                                beq.d = bky4.e();
                                beq.e = bky4.e();
                                bky4.d(11);
                                beq.f = bky4.e();
                                beq.g = bky4.e();
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
                    if (beq.d == 0 || beq.e == 0 || beq.h == 0 || beq.i == 0 || (i2 = (bky = beq.a).c) == 0 || bky.b != i2 || !beq.c) {
                        bdj = null;
                    } else {
                        bky.c(0);
                        int i11 = beq.h * beq.i;
                        int[] iArr2 = new int[i11];
                        int i12 = 0;
                        while (i12 < i11) {
                            int d11 = beq.a.d();
                            if (d11 != 0) {
                                iArr2[i12] = beq.b[d11];
                                i12++;
                            } else {
                                int d12 = beq.a.d();
                                if (d12 != 0) {
                                    if ((d12 & 64) != 0) {
                                        i3 = ((d12 & 63) << 8) | beq.a.d();
                                    } else {
                                        i3 = d12 & 63;
                                    }
                                    int i13 = i3 + i12;
                                    Arrays.fill(iArr2, i12, i13, (d12 & 128) != 0 ? beq.b[beq.a.d()] : 0);
                                    i12 = i13;
                                }
                            }
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, beq.h, beq.i, Bitmap.Config.ARGB_8888);
                        int i14 = beq.f;
                        float f2 = (float) beq.d;
                        int i15 = beq.g;
                        float f3 = (float) beq.e;
                        bdj = new bdj(createBitmap, ((float) i14) / f2, ((float) i15) / f3, 0, ((float) beq.h) / f2, ((float) beq.i) / f3);
                    }
                    beq.a();
                }
                bky4.c(i5);
            } else {
                bky4.c(i4);
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
