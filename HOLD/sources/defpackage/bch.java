package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bch  reason: default package */
/* compiled from: PG */
public final class bch extends bci {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;
    public final int e;
    public final long f;
    public final int g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final anq k;
    public final List l;
    public final long m;

    public final long a() {
        return this.c + this.m;
    }

    public bch(int i2, String str, List list, long j2, long j3, boolean z, int i3, long j4, int i4, long j5, boolean z2, boolean z3, boolean z4, anq anq, List list2) {
        super(str, list, z2);
        long j6;
        this.a = i2;
        this.c = j3;
        this.d = z;
        this.e = i3;
        this.f = j4;
        this.g = i4;
        this.h = j5;
        this.i = z3;
        this.j = z4;
        this.k = anq;
        this.l = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.m = 0;
            j6 = 0;
        } else {
            bcg bcg = (bcg) list2.get(list2.size() - 1);
            j6 = bcg.e + bcg.c;
            this.m = j6;
        }
        this.b = j2 != -9223372036854775807L ? j2 < 0 ? j6 + j2 : j2 : -9223372036854775807L;
    }
}
