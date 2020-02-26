package defpackage;

/* renamed from: alf  reason: default package */
/* compiled from: PG */
public final class alf {
    public Object a;
    public long b;
    public long c;
    public ayh d = ayh.a;
    private Object e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        alf alf = (alf) obj;
        return blm.a(this.e, alf.e) && blm.a(this.a, alf.a) && this.b == alf.b && this.c == alf.c && blm.a(this.d, alf.d);
    }

    public final long b() {
        ayg[] aygArr = this.d.d;
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int length;
        ayh ayh = this.d;
        long j2 = this.b;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int i = 0;
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        while (true) {
            long[] jArr = ayh.c;
            length = jArr.length;
            if (i >= length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 != Long.MIN_VALUE) {
                if (j < j3) {
                    ayg[] aygArr = ayh.d;
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

    public final int a(long j) {
        ayh ayh = this.d;
        int length = ayh.c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j2 = ayh.c[length];
            if (j2 != Long.MIN_VALUE && j >= j2) {
                break;
            }
            length--;
        }
        if (length < 0) {
            return -1;
        }
        ayg[] aygArr = ayh.d;
        return length;
    }

    public final long a(int i) {
        return this.d.c[i];
    }

    public final int b(int i) {
        int i2;
        ayg ayg = this.d.d[i];
        int i3 = 0;
        while (true) {
            int[] iArr = ayg.a;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final long a() {
        return aja.a(this.c);
    }

    public final int hashCode() {
        Object obj = this.e;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) + 217) * 31;
        Object obj2 = this.a;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        long j = this.b;
        long j2 = this.c;
        int i2 = (((((hashCode + hashCode2) * 961) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        ayh ayh = this.d;
        if (ayh != null) {
            i = ayh.hashCode();
        }
        return i2 + i;
    }

    public final void c() {
        ayg[] aygArr = this.d.d;
    }

    public final void a(Object obj, Object obj2, long j, long j2) {
        ayh ayh = ayh.a;
        this.e = obj;
        this.a = obj2;
        this.b = j;
        this.c = j2;
        this.d = ayh;
    }
}
