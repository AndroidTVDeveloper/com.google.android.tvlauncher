package defpackage;

import java.util.Arrays;

/* renamed from: ayh  reason: default package */
/* compiled from: PG */
public final class ayh {
    public static final ayh a = new ayh(new long[0]);
    public final int b;
    public final long[] c;
    public final ayg[] d;

    private ayh(long... jArr) {
        int length = jArr.length;
        this.b = length;
        this.c = Arrays.copyOf(jArr, length);
        this.d = new ayg[length];
        for (int i = 0; i < length; i++) {
            this.d[i] = new ayg();
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
        return this.b == ayh.b && Arrays.equals(this.c, ayh.c) && Arrays.equals(this.d, ayh.d);
    }

    public final int hashCode() {
        return (((((this.b * 961) + 1) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
