package defpackage;

/* renamed from: alg  reason: default package */
/* compiled from: PG */
public final class alg {
    public static final Object a = new Object();
    public Object b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    private Object j = a;
    private long k;
    private long l;
    private boolean m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        alg alg = (alg) obj;
        return blm.a(this.j, alg.j) && blm.a(null, null) && blm.a(this.b, alg.b) && this.k == alg.k && this.l == alg.l && this.c == alg.c && this.d == alg.d && this.m == alg.m && this.g == alg.g && this.h == alg.h && this.f == alg.f && this.i == alg.i;
    }

    public final long a() {
        return aja.a(this.g);
    }

    public final long b() {
        return aja.a(this.h);
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + 217) * 961;
        Object obj = this.b;
        int hashCode2 = obj != null ? obj.hashCode() : 0;
        long j2 = this.k;
        long j3 = this.l;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.m;
        long j4 = this.g;
        long j5 = this.h;
        int i2 = this.f;
        long j6 = this.i;
        return ((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 961) + i2) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }

    public final void a(Object obj, Object obj2, long j2, long j3, boolean z, boolean z2, boolean z3, long j4, long j5, int i2, long j6) {
        this.j = obj;
        this.b = obj2;
        this.k = j2;
        this.l = j3;
        this.c = z;
        this.d = z2;
        this.m = z3;
        this.g = j4;
        this.h = j5;
        this.e = 0;
        this.f = i2;
        this.i = j6;
    }
}
