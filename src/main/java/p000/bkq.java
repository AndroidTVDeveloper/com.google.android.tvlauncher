package p000;

import java.util.Arrays;

/* renamed from: bkq */
/* compiled from: PG */
public final class bkq {

    /* renamed from: a */
    public int f4231a;

    /* renamed from: b */
    private long[] f4232b = new long[32];

    /* renamed from: a */
    public final void mo2047a(long j) {
        int i = this.f4231a;
        long[] jArr = this.f4232b;
        if (i == jArr.length) {
            this.f4232b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f4232b;
        int i2 = this.f4231a;
        this.f4231a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: a */
    public final long mo2046a(int i) {
        if (i >= 0 && i < this.f4231a) {
            return this.f4232b[i];
        }
        int i2 = this.f4231a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final long[] mo2048a() {
        return Arrays.copyOf(this.f4232b, this.f4231a);
    }
}
