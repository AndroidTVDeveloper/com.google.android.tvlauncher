package p000;

/* renamed from: bcg */
/* compiled from: PG */
public final class bcg implements Comparable {

    /* renamed from: a */
    public final String f3250a;

    /* renamed from: b */
    public final bcg f3251b;

    /* renamed from: c */
    public final long f3252c;

    /* renamed from: d */
    public final int f3253d;

    /* renamed from: e */
    public final long f3254e;

    /* renamed from: f */
    public final anq f3255f;

    /* renamed from: g */
    public final String f3256g;

    /* renamed from: h */
    public final String f3257h;

    /* renamed from: i */
    public final long f3258i;

    /* renamed from: j */
    public final long f3259j;

    /* renamed from: k */
    public final boolean f3260k;

    public bcg(String str, long j, long j2, String str2, String str3) {
        this(str, null, 0, -1, -9223372036854775807L, null, str2, str3, j, j2, false);
    }

    public bcg(String str, bcg bcg, long j, int i, long j2, anq anq, String str2, String str3, long j3, long j4, boolean z) {
        this.f3250a = str;
        this.f3251b = bcg;
        this.f3252c = j;
        this.f3253d = i;
        this.f3254e = j2;
        this.f3255f = anq;
        this.f3256g = str2;
        this.f3257h = str3;
        this.f3258i = j3;
        this.f3259j = j4;
        this.f3260k = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f3254e <= l.longValue()) {
            return this.f3254e >= l.longValue() ? 0 : -1;
        }
        return 1;
    }
}
