package p000;

/* renamed from: alf */
/* compiled from: PG */
public final class alf {

    /* renamed from: a */
    public Object f667a;

    /* renamed from: b */
    public long f668b;

    /* renamed from: c */
    public long f669c;

    /* renamed from: d */
    public ayh f670d = ayh.f2757a;

    /* renamed from: e */
    private Object f671e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        alf alf = (alf) obj;
        return blm.m3652a(this.f671e, alf.f671e) && blm.m3652a(this.f667a, alf.f667a) && this.f668b == alf.f668b && this.f669c == alf.f669c && blm.m3652a(this.f670d, alf.f670d);
    }

    /* renamed from: b */
    public final long mo536b() {
        ayg[] aygArr = this.f670d.f2760d;
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public final int mo535b(long j) {
        int length;
        ayh ayh = this.f670d;
        long j2 = this.f668b;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int i = 0;
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        while (true) {
            long[] jArr = ayh.f2759c;
            length = jArr.length;
            if (i >= length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 != Long.MIN_VALUE) {
                if (j < j3) {
                    ayg[] aygArr = ayh.f2760d;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (i < length) {
            return i;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo530a(long j) {
        ayh ayh = this.f670d;
        int length = ayh.f2759c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j2 = ayh.f2759c[length];
            if (j2 != Long.MIN_VALUE && j >= j2) {
                break;
            }
            length--;
        }
        if (length < 0) {
            return -1;
        }
        ayg[] aygArr = ayh.f2760d;
        return length;
    }

    /* renamed from: a */
    public final long mo532a(int i) {
        return this.f670d.f2759c[i];
    }

    /* renamed from: b */
    public final int mo534b(int i) {
        int i2;
        ayg ayg = this.f670d.f2760d[i];
        int i3 = 0;
        while (true) {
            int[] iArr = ayg.f2754a;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: a */
    public final long mo531a() {
        return aja.m632a(this.f669c);
    }

    public final int hashCode() {
        Object obj = this.f671e;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) + 217) * 31;
        Object obj2 = this.f667a;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        long j = this.f668b;
        long j2 = this.f669c;
        int i2 = (((((hashCode + hashCode2) * 961) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        ayh ayh = this.f670d;
        if (ayh != null) {
            i = ayh.hashCode();
        }
        return i2 + i;
    }

    /* renamed from: c */
    public final void mo537c() {
        ayg[] aygArr = this.f670d.f2760d;
    }

    /* renamed from: a */
    public final void mo533a(Object obj, Object obj2, long j, long j2) {
        ayh ayh = ayh.f2757a;
        this.f671e = obj;
        this.f667a = obj2;
        this.f668b = j;
        this.f669c = j2;
        this.f670d = ayh;
    }
}
