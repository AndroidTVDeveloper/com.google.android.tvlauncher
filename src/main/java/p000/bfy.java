package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfy */
/* compiled from: PG */
public abstract class bfy implements bgl {

    /* renamed from: a */
    private final ayc f3742a;

    /* renamed from: b */
    public final int f3743b;

    /* renamed from: c */
    private final int[] f3744c;

    /* renamed from: d */
    private final akh[] f3745d;

    /* renamed from: e */
    private final long[] f3746e;

    /* renamed from: f */
    private int f3747f;

    public bfy(ayc ayc, int... iArr) {
        int length = iArr.length;
        int i = 0;
        bks.m3512b(length > 0);
        this.f3742a = (ayc) bks.m3507a(ayc);
        this.f3743b = length;
        this.f3745d = new akh[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f3745d[i2] = ayc.mo1604a(iArr[i2]);
        }
        Arrays.sort(this.f3745d, new bfx((byte) 0));
        this.f3744c = new int[this.f3743b];
        while (true) {
            int i3 = this.f3743b;
            if (i < i3) {
                this.f3744c[i] = ayc.mo1603a(this.f3745d[i]);
                i++;
            } else {
                this.f3746e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo1824a(float f) {
    }

    /* renamed from: a */
    public void mo1710a(long j, long j2) {
        throw null;
    }

    /* renamed from: d */
    public void mo1825d() {
    }

    /* renamed from: e */
    public final ayc mo1833e() {
        return this.f3742a;
    }

    /* renamed from: i */
    public final void mo1839i() {
    }

    /* renamed from: a */
    public final boolean mo1829a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = mo1831b(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.f3743b) {
                if (b) {
                    break;
                }
                b = i2 != i && !mo1831b(i2, elapsedRealtime);
                i2++;
            } else if (!b) {
                return false;
            }
        }
        long[] jArr = this.f3746e;
        jArr[i] = Math.max(jArr[i], blm.m3662b(elapsedRealtime, j));
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
        return this.f3742a == bfy.f3742a && Arrays.equals(this.f3744c, bfy.f3744c);
    }

    /* renamed from: a */
    public int mo1823a(long j, List list) {
        return list.size();
    }

    /* renamed from: a */
    public final akh mo1828a(int i) {
        return this.f3745d[i];
    }

    /* renamed from: b */
    public final int mo1830b(int i) {
        return this.f3744c[i];
    }

    /* renamed from: g */
    public final akh mo1836g() {
        return this.f3745d[mo1709a()];
    }

    /* renamed from: h */
    public final int mo1837h() {
        return this.f3744c[mo1709a()];
    }

    public final int hashCode() {
        int i = this.f3747f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f3742a) * 31) + Arrays.hashCode(this.f3744c);
        this.f3747f = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: c */
    public final int mo1832c(int i) {
        for (int i2 = 0; i2 < this.f3743b; i2++) {
            if (this.f3744c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo1827a(akh akh) {
        for (int i = 0; i < this.f3743b; i++) {
            if (this.f3745d[i] == akh) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo1831b(int i, long j) {
        return this.f3746e[i] > j;
    }

    /* renamed from: f */
    public final int mo1835f() {
        return this.f3744c.length;
    }
}
