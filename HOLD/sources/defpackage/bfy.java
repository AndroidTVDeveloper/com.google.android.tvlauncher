package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfy  reason: default package */
/* compiled from: PG */
public abstract class bfy implements bgl {
    private final ayc a;
    public final int b;
    private final int[] c;
    private final akh[] d;
    private final long[] e;
    private int f;

    public bfy(ayc ayc, int... iArr) {
        int length = iArr.length;
        int i = 0;
        bks.b(length > 0);
        this.a = (ayc) bks.a(ayc);
        this.b = length;
        this.d = new akh[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = ayc.a(iArr[i2]);
        }
        Arrays.sort(this.d, new bfx((byte) 0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = ayc.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public void a(float f2) {
    }

    public void a(long j, long j2) {
        throw null;
    }

    public void d() {
    }

    public final ayc e() {
        return this.a;
    }

    public final void i() {
    }

    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b2 = b(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.b) {
                if (b2) {
                    break;
                }
                b2 = i2 != i && !b(i2, elapsedRealtime);
                i2++;
            } else if (!b2) {
                return false;
            }
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], blm.b(elapsedRealtime, j));
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bfy bfy = (bfy) obj;
        return this.a == bfy.a && Arrays.equals(this.c, bfy.c);
    }

    public int a(long j, List list) {
        return list.size();
    }

    public final akh a(int i) {
        return this.d[i];
    }

    public final int b(int i) {
        return this.c[i];
    }

    public final akh g() {
        return this.d[a()];
    }

    public final int h() {
        return this.c[a()];
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.f = identityHashCode;
        return identityHashCode;
    }

    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int a(akh akh) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == akh) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    public final int f() {
        return this.c.length;
    }
}
