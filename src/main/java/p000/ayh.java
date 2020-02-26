package p000;

import java.util.Arrays;

/* renamed from: ayh */
/* compiled from: PG */
public final class ayh {

    /* renamed from: a */
    public static final ayh f2757a = new ayh(new long[0]);

    /* renamed from: b */
    public final int f2758b;

    /* renamed from: c */
    public final long[] f2759c;

    /* renamed from: d */
    public final ayg[] f2760d;

    private ayh(long... jArr) {
        int length = jArr.length;
        this.f2758b = length;
        this.f2759c = Arrays.copyOf(jArr, length);
        this.f2760d = new ayg[length];
        for (int i = 0; i < length; i++) {
            this.f2760d[i] = new ayg();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ayh ayh = (ayh) obj;
        return this.f2758b == ayh.f2758b && Arrays.equals(this.f2759c, ayh.f2759c) && Arrays.equals(this.f2760d, ayh.f2760d);
    }

    public final int hashCode() {
        return (((((this.f2758b * 961) + 1) * 31) + Arrays.hashCode(this.f2759c)) * 31) + Arrays.hashCode(this.f2760d);
    }
}
