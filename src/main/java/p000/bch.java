package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bch */
/* compiled from: PG */
public final class bch extends bci {

    /* renamed from: a */
    public final int f3261a;

    /* renamed from: b */
    public final long f3262b;

    /* renamed from: c */
    public final long f3263c;

    /* renamed from: d */
    public final boolean f3264d;

    /* renamed from: e */
    public final int f3265e;

    /* renamed from: f */
    public final long f3266f;

    /* renamed from: g */
    public final int f3267g;

    /* renamed from: h */
    public final long f3268h;

    /* renamed from: i */
    public final boolean f3269i;

    /* renamed from: j */
    public final boolean f3270j;

    /* renamed from: k */
    public final anq f3271k;

    /* renamed from: l */
    public final List f3272l;

    /* renamed from: m */
    public final long f3273m;

    /* renamed from: a */
    public final long mo1761a() {
        return this.f3263c + this.f3273m;
    }

    public bch(int i, String str, List list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, anq anq, List list2) {
        super(str, list, z2);
        long j5;
        this.f3261a = i;
        this.f3263c = j2;
        this.f3264d = z;
        this.f3265e = i2;
        this.f3266f = j3;
        this.f3267g = i3;
        this.f3268h = j4;
        this.f3269i = z3;
        this.f3270j = z4;
        this.f3271k = anq;
        this.f3272l = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f3273m = 0;
            j5 = 0;
        } else {
            bcg bcg = (bcg) list2.get(list2.size() - 1);
            j5 = bcg.f3254e + bcg.f3252c;
            this.f3273m = j5;
        }
        this.f3262b = j != -9223372036854775807L ? j < 0 ? j5 + j : j : -9223372036854775807L;
    }
}
