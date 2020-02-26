package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: pk  reason: default package */
/* compiled from: PG */
final class pk {
    private static final Comparator f = new pi();
    public final int[] a;
    public final int[] b;
    public final List c;
    private final pn[] d;
    private final float[] e = new float[3];

    static int a(int i) {
        return (i >> 10) & 31;
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    private static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int c(int i) {
        return i & 31;
    }

    public pk(int[] iArr, pn[] pnVarArr) {
        pj pjVar;
        int i;
        this.d = pnVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b2 = b(Color.blue(i3), 8, 5) | (b(Color.red(i3), 8, 5) << 10) | (b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b2;
            iArr2[b2] = iArr2[b2] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                bd.a(d(i5), this.e);
                if (a(this.e)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > 16) {
            PriorityQueue<pj> priorityQueue = new PriorityQueue<>(16, f);
            priorityQueue.offer(new pj(this, 0, this.a.length - 1));
            while (priorityQueue.size() < 16 && (pjVar = (pj) priorityQueue.poll()) != null && pjVar.b()) {
                if (pjVar.b()) {
                    int i8 = pjVar.e - pjVar.d;
                    int i9 = pjVar.g - pjVar.f;
                    int i10 = pjVar.i - pjVar.h;
                    int i11 = (i8 < i9 || i8 < i10) ? (i9 < i8 || i9 < i10) ? -1 : -2 : -3;
                    pk pkVar = pjVar.j;
                    int[] iArr4 = pkVar.a;
                    int[] iArr5 = pkVar.b;
                    a(iArr4, i11, pjVar.a, pjVar.b);
                    Arrays.sort(iArr4, pjVar.a, pjVar.b + 1);
                    a(iArr4, i11, pjVar.a, pjVar.b);
                    int i12 = pjVar.c / 2;
                    int i13 = pjVar.a;
                    int i14 = 0;
                    while (true) {
                        int i15 = pjVar.b;
                        if (i13 > i15) {
                            i = pjVar.a;
                            break;
                        }
                        i14 += iArr5[iArr4[i13]];
                        if (i14 >= i12) {
                            i = Math.min(i15 - 1, i13);
                            break;
                        }
                        i13++;
                    }
                    pj pjVar2 = new pj(pjVar.j, i + 1, pjVar.b);
                    pjVar.b = i;
                    pjVar.c();
                    priorityQueue.offer(pjVar2);
                    priorityQueue.offer(pjVar);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            ArrayList arrayList = new ArrayList(priorityQueue.size());
            for (pj pjVar3 : priorityQueue) {
                pk pkVar2 = pjVar3.j;
                int[] iArr6 = pkVar2.a;
                int[] iArr7 = pkVar2.b;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                for (int i20 = pjVar3.a; i20 <= pjVar3.b; i20++) {
                    int i21 = iArr6[i20];
                    int i22 = iArr7[i21];
                    i16 += i22;
                    i17 += a(i21) * i22;
                    i18 += b(i21) * i22;
                    i19 += i22 * c(i21);
                }
                float f2 = (float) i16;
                po poVar = new po(a(Math.round(((float) i17) / f2), Math.round(((float) i18) / f2), Math.round(((float) i19) / f2)), i16);
                if (!a(poVar.a())) {
                    arrayList.add(poVar);
                }
            }
            this.c = arrayList;
            return;
        }
        this.c = new ArrayList();
        for (int i23 = 0; i23 < i4; i23++) {
            int i24 = iArr3[i23];
            this.c.add(new po(d(i24), iArr2[i24]));
        }
    }

    private static int d(int i) {
        return a(a(i), b(i), c(i));
    }

    private static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }

    private static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = c(i4) | (b(i4) << 10) | (a(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = a(i5) | (c(i5) << 10) | (b(i5) << 5);
                i2++;
            }
        }
    }

    private final boolean a(float[] fArr) {
        int length;
        pn[] pnVarArr = this.d;
        if (pnVarArr != null && (length = pnVarArr.length) > 0) {
            for (int i = 0; i < length; i++) {
                if (!this.d[i].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
