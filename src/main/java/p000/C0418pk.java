package p000;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: pk */
/* compiled from: PG */
final class C0418pk {

    /* renamed from: f */
    private static final Comparator f10154f = new C0416pi();

    /* renamed from: a */
    public final int[] f10155a;

    /* renamed from: b */
    public final int[] f10156b;

    /* renamed from: c */
    public final List f10157c;

    /* renamed from: d */
    private final C0421pn[] f10158d;

    /* renamed from: e */
    private final float[] f10159e = new float[3];

    /* renamed from: a */
    static int m8188a(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: b */
    static int m8192b(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: b */
    private static int m8193b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: c */
    static int m8194c(int i) {
        return i & 31;
    }

    public C0418pk(int[] iArr, C0421pn[] pnVarArr) {
        C0417pj pjVar;
        int i;
        this.f10158d = pnVarArr;
        int[] iArr2 = new int[32768];
        this.f10156b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b = m8193b(Color.blue(i3), 8, 5) | (m8193b(Color.red(i3), 8, 5) << 10) | (m8193b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                C0032bd.m2863a(m8195d(i5), this.f10159e);
                if (m8191a(this.f10159e)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f10155a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > 16) {
            PriorityQueue<C0417pj> priorityQueue = new PriorityQueue<>(16, f10154f);
            priorityQueue.offer(new C0417pj(this, 0, this.f10155a.length - 1));
            while (priorityQueue.size() < 16 && (pjVar = (C0417pj) priorityQueue.poll()) != null && pjVar.mo5744b()) {
                if (pjVar.mo5744b()) {
                    int i8 = pjVar.f10148e - pjVar.f10147d;
                    int i9 = pjVar.f10150g - pjVar.f10149f;
                    int i10 = pjVar.f10152i - pjVar.f10151h;
                    int i11 = (i8 < i9 || i8 < i10) ? (i9 < i8 || i9 < i10) ? -1 : -2 : -3;
                    C0418pk pkVar = pjVar.f10153j;
                    int[] iArr4 = pkVar.f10155a;
                    int[] iArr5 = pkVar.f10156b;
                    m8190a(iArr4, i11, pjVar.f10144a, pjVar.f10145b);
                    Arrays.sort(iArr4, pjVar.f10144a, pjVar.f10145b + 1);
                    m8190a(iArr4, i11, pjVar.f10144a, pjVar.f10145b);
                    int i12 = pjVar.f10146c / 2;
                    int i13 = pjVar.f10144a;
                    int i14 = 0;
                    while (true) {
                        int i15 = pjVar.f10145b;
                        if (i13 > i15) {
                            i = pjVar.f10144a;
                            break;
                        }
                        i14 += iArr5[iArr4[i13]];
                        if (i14 >= i12) {
                            i = Math.min(i15 - 1, i13);
                            break;
                        }
                        i13++;
                    }
                    C0417pj pjVar2 = new C0417pj(pjVar.f10153j, i + 1, pjVar.f10145b);
                    pjVar.f10145b = i;
                    pjVar.mo5745c();
                    priorityQueue.offer(pjVar2);
                    priorityQueue.offer(pjVar);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            ArrayList arrayList = new ArrayList(priorityQueue.size());
            for (C0417pj pjVar3 : priorityQueue) {
                C0418pk pkVar2 = pjVar3.f10153j;
                int[] iArr6 = pkVar2.f10155a;
                int[] iArr7 = pkVar2.f10156b;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                for (int i20 = pjVar3.f10144a; i20 <= pjVar3.f10145b; i20++) {
                    int i21 = iArr6[i20];
                    int i22 = iArr7[i21];
                    i16 += i22;
                    i17 += m8188a(i21) * i22;
                    i18 += m8192b(i21) * i22;
                    i19 += i22 * m8194c(i21);
                }
                float f = (float) i16;
                C0422po poVar = new C0422po(m8189a(Math.round(((float) i17) / f), Math.round(((float) i18) / f), Math.round(((float) i19) / f)), i16);
                if (!m8191a(poVar.mo5748a())) {
                    arrayList.add(poVar);
                }
            }
            this.f10157c = arrayList;
            return;
        }
        this.f10157c = new ArrayList();
        for (int i23 = 0; i23 < i4; i23++) {
            int i24 = iArr3[i23];
            this.f10157c.add(new C0422po(m8195d(i24), iArr2[i24]));
        }
    }

    /* renamed from: d */
    private static int m8195d(int i) {
        return m8189a(m8188a(i), m8192b(i), m8194c(i));
    }

    /* renamed from: a */
    private static int m8189a(int i, int i2, int i3) {
        return Color.rgb(m8193b(i, 5, 8), m8193b(i2, 5, 8), m8193b(i3, 5, 8));
    }

    /* renamed from: a */
    private static void m8190a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m8194c(i4) | (m8192b(i4) << 10) | (m8188a(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m8188a(i5) | (m8194c(i5) << 10) | (m8192b(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private final boolean m8191a(float[] fArr) {
        int length;
        C0421pn[] pnVarArr = this.f10158d;
        if (pnVarArr != null && (length = pnVarArr.length) > 0) {
            for (int i = 0; i < length; i++) {
                if (!this.f10158d[i].mo5746a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
