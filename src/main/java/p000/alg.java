package p000;

/* renamed from: alg */
/* compiled from: PG */
public final class alg {

    /* renamed from: a */
    public static final Object f672a = new Object();

    /* renamed from: b */
    public Object f673b;

    /* renamed from: c */
    public boolean f674c;

    /* renamed from: d */
    public boolean f675d;

    /* renamed from: e */
    public int f676e;

    /* renamed from: f */
    public int f677f;

    /* renamed from: g */
    public long f678g;

    /* renamed from: h */
    public long f679h;

    /* renamed from: i */
    public long f680i;

    /* renamed from: j */
    private Object f681j = f672a;

    /* renamed from: k */
    private long f682k;

    /* renamed from: l */
    private long f683l;

    /* renamed from: m */
    private boolean f684m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        alg alg = (alg) obj;
        return blm.m3652a(this.f681j, alg.f681j) && blm.m3652a(null, null) && blm.m3652a(this.f673b, alg.f673b) && this.f682k == alg.f682k && this.f683l == alg.f683l && this.f674c == alg.f674c && this.f675d == alg.f675d && this.f684m == alg.f684m && this.f678g == alg.f678g && this.f679h == alg.f679h && this.f677f == alg.f677f && this.f680i == alg.f680i;
    }

    /* renamed from: a */
    public final long mo540a() {
        return aja.m632a(this.f678g);
    }

    /* renamed from: b */
    public final long mo542b() {
        return aja.m632a(this.f679h);
    }

    public final int hashCode() {
        int hashCode = (this.f681j.hashCode() + 217) * 961;
        Object obj = this.f673b;
        int hashCode2 = obj != null ? obj.hashCode() : 0;
        long j = this.f682k;
        long j2 = this.f683l;
        boolean z = this.f674c;
        boolean z2 = this.f675d;
        boolean z3 = this.f684m;
        long j3 = this.f678g;
        long j4 = this.f679h;
        int i = this.f677f;
        long j5 = this.f680i;
        return ((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 961) + i) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    /* renamed from: a */
    public final void mo541a(Object obj, Object obj2, long j, long j2, boolean z, boolean z2, boolean z3, long j3, long j4, int i, long j5) {
        this.f681j = obj;
        this.f673b = obj2;
        this.f682k = j;
        this.f683l = j2;
        this.f674c = z;
        this.f675d = z2;
        this.f684m = z3;
        this.f678g = j3;
        this.f679h = j4;
        this.f676e = 0;
        this.f677f = i;
        this.f680i = j5;
    }
}
