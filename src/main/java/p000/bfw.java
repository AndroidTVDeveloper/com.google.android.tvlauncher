package p000;

import android.os.SystemClock;
import java.util.List;

/* renamed from: bfw */
/* compiled from: PG */
public final class bfw extends bfy {

    /* renamed from: a */
    public final bft f3732a;

    /* renamed from: c */
    private final long f3733c;

    /* renamed from: d */
    private final long f3734d;

    /* renamed from: e */
    private final long f3735e;

    /* renamed from: f */
    private final float f3736f;

    /* renamed from: g */
    private final long f3737g;

    /* renamed from: h */
    private float f3738h = 1.0f;

    /* renamed from: i */
    private int f3739i;

    /* renamed from: j */
    private int f3740j = 0;

    /* renamed from: k */
    private long f3741k = -9223372036854775807L;

    public /* synthetic */ bfw(ayc ayc, int[] iArr, bft bft, long j, long j2, long j3, float f, long j4) {
        super(ayc, iArr);
        this.f3732a = bft;
        this.f3733c = j * 1000;
        this.f3734d = j2 * 1000;
        this.f3735e = j3 * 1000;
        this.f3736f = f;
        this.f3737g = j4;
    }

    /* renamed from: a */
    public final int mo1709a() {
        return this.f3739i;
    }

    /* renamed from: b */
    public final int mo1711b() {
        return this.f3740j;
    }

    /* renamed from: c */
    public final Object mo1712c() {
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
    /* renamed from: a */
    private final int m3077a(long j) {
        long j2;
        long[][] jArr;
        bfu bfu = (bfu) this.f3732a;
        long max = Math.max(0L, ((long) (((float) bfu.f3721a.mo1941a()) * bfu.f3722b)) - bfu.f3723c);
        if (bfu.f3724d != null) {
            int i = 1;
            while (true) {
                jArr = bfu.f3724d;
                if (i < jArr.length - 1 && jArr[i][0] < max) {
                    i++;
                }
            }
            long[] jArr2 = jArr[i - 1];
            long[] jArr3 = jArr[i];
            long j3 = jArr2[0];
            long j4 = jArr3[0];
            long j5 = jArr2[1];
            j2 = ((long) ((((float) (max - j3)) / ((float) (j4 - j3))) * ((float) (jArr3[1] - j5)))) + j5;
        } else {
            j2 = max;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3743b; i3++) {
            if (j == Long.MIN_VALUE || !mo1831b(i3, j)) {
                if (((long) Math.round(((float) mo1828a(i3).f552e) * this.f3738h)) <= j2) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public final void mo1825d() {
        this.f3741k = -9223372036854775807L;
    }

    /* renamed from: a */
    public final int mo1823a(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f3741k;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < this.f3737g) {
            return list.size();
        }
        this.f3741k = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long b = blm.m3661b(((ayx) list.get(size - 1)).f2772j - j, this.f3738h);
        long j3 = this.f3735e;
        if (b >= j3) {
            akh a = mo1828a(m3077a(elapsedRealtime));
            for (int i3 = 0; i3 < size; i3++) {
                ayx ayx = (ayx) list.get(i3);
                akh akh = ayx.f2769g;
                if (blm.m3661b(ayx.f2772j - j, this.f3738h) >= j3 && akh.f552e < a.f552e && (i = akh.f562o) != -1 && i < 720 && (i2 = akh.f561n) != -1 && i2 < 1280 && i < a.f562o) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* renamed from: a */
    public final void mo1824a(float f) {
        this.f3738h = f;
    }

    /* renamed from: a */
    public static void m3078a(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= r4) {
                break;
            }
            long[] jArr3 = jArr[i2][i];
            long j2 = jArr2[i2][iArr[i2]];
            jArr3[1] = j2;
            j += j2;
            i2++;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i][0] = j;
        }
    }

    /* renamed from: a */
    public final void mo1710a(long j, long j2) {
        long j3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f3740j == 0) {
            this.f3740j = 1;
            this.f3739i = m3077a(elapsedRealtime);
            return;
        }
        int i = this.f3739i;
        int a = m3077a(elapsedRealtime);
        this.f3739i = a;
        if (a != i) {
            if (!mo1831b(i, elapsedRealtime)) {
                akh a2 = mo1828a(i);
                int i2 = mo1828a(this.f3739i).f552e;
                int i3 = a2.f552e;
                if (i2 > i3) {
                    if (j2 != -9223372036854775807L && j2 <= this.f3733c) {
                        j3 = (long) (((float) j2) * this.f3736f);
                    } else {
                        j3 = this.f3733c;
                    }
                    if (j < j3) {
                        this.f3739i = i;
                    }
                }
                if (i2 < i3 && j >= this.f3734d) {
                    this.f3739i = i;
                }
            }
            if (this.f3739i != i) {
                this.f3740j = 3;
            }
        }
    }
}
