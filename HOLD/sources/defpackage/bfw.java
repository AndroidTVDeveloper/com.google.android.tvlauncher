package defpackage;

import android.os.SystemClock;
import java.util.List;

/* renamed from: bfw  reason: default package */
/* compiled from: PG */
public final class bfw extends bfy {
    public final bft a;
    private final long c;
    private final long d;
    private final long e;
    private final float f;
    private final long g;
    private float h = 1.0f;
    private int i;
    private int j = 0;
    private long k = -9223372036854775807L;

    public /* synthetic */ bfw(ayc ayc, int[] iArr, bft bft, long j2, long j3, long j4, float f2, long j5) {
        super(ayc, iArr);
        this.a = bft;
        this.c = j2 * 1000;
        this.d = j3 * 1000;
        this.e = j4 * 1000;
        this.f = f2;
        this.g = j5;
    }

    public final int a() {
        return this.i;
    }

    public final int b() {
        return this.j;
    }

    public final Object c() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    private final int a(long j2) {
        long j3;
        long[][] jArr;
        bfu bfu = (bfu) this.a;
        long max = Math.max(0L, ((long) (((float) bfu.a.a()) * bfu.b)) - bfu.c);
        if (bfu.d != null) {
            int i2 = 1;
            while (true) {
                jArr = bfu.d;
                if (i2 < jArr.length - 1 && jArr[i2][0] < max) {
                    i2++;
                }
            }
            long[] jArr2 = jArr[i2 - 1];
            long[] jArr3 = jArr[i2];
            long j4 = jArr2[0];
            long j5 = jArr3[0];
            long j6 = jArr2[1];
            j3 = ((long) ((((float) (max - j4)) / ((float) (j5 - j4))) * ((float) (jArr3[1] - j6)))) + j6;
        } else {
            j3 = max;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            if (j2 == Long.MIN_VALUE || !b(i4, j2)) {
                if (((long) Math.round(((float) a(i4).e) * this.h)) <= j3) {
                    return i4;
                }
                i3 = i4;
            }
        }
        return i3;
    }

    public final void d() {
        this.k = -9223372036854775807L;
    }

    public final int a(long j2, List list) {
        int i2;
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.k;
        if (j3 != -9223372036854775807L && elapsedRealtime - j3 < this.g) {
            return list.size();
        }
        this.k = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long b = blm.b(((ayx) list.get(size - 1)).j - j2, this.h);
        long j4 = this.e;
        if (b >= j4) {
            akh a2 = a(a(elapsedRealtime));
            for (int i4 = 0; i4 < size; i4++) {
                ayx ayx = (ayx) list.get(i4);
                akh akh = ayx.g;
                if (blm.b(ayx.j - j2, this.h) >= j4 && akh.e < a2.e && (i2 = akh.o) != -1 && i2 < 720 && (i3 = akh.n) != -1 && i3 < 1280 && i2 < a2.o) {
                    return i4;
                }
            }
        }
        return size;
    }

    public final void a(float f2) {
        this.h = f2;
    }

    public static void a(long[][][] jArr, int i2, long[][] jArr2, int[] iArr) {
        long j2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= r4) {
                break;
            }
            long[] jArr3 = jArr[i3][i2];
            long j3 = jArr2[i3][iArr[i3]];
            jArr3[1] = j3;
            j2 += j3;
            i3++;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i2][0] = j2;
        }
    }

    public final void a(long j2, long j3) {
        long j4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.j == 0) {
            this.j = 1;
            this.i = a(elapsedRealtime);
            return;
        }
        int i2 = this.i;
        int a2 = a(elapsedRealtime);
        this.i = a2;
        if (a2 != i2) {
            if (!b(i2, elapsedRealtime)) {
                akh a3 = a(i2);
                int i3 = a(this.i).e;
                int i4 = a3.e;
                if (i3 > i4) {
                    if (j3 != -9223372036854775807L && j3 <= this.c) {
                        j4 = (long) (((float) j3) * this.f);
                    } else {
                        j4 = this.c;
                    }
                    if (j2 < j4) {
                        this.i = i2;
                    }
                }
                if (i3 < i4 && j2 >= this.d) {
                    this.i = i2;
                }
            }
            if (this.i != i2) {
                this.j = 3;
            }
        }
    }
}
