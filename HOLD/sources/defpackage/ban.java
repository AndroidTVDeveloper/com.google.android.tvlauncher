package defpackage;

import java.util.List;

/* renamed from: ban  reason: default package */
/* compiled from: PG */
public abstract class ban extends bas {
    public final long a;
    public final long b;
    public final List c;

    public ban(baj baj, long j, long j2, long j3, long j4, List list) {
        super(baj, j, j2);
        this.a = j3;
        this.b = j4;
        this.c = list;
    }

    public abstract baj a(bam bam, long j);

    public boolean a() {
        return this.c != null;
    }

    public abstract int b(long j);

    public final long a(long j) {
        long j2;
        List list = this.c;
        if (list != null) {
            j2 = ((baq) list.get((int) (j - this.a))).a - this.h;
        } else {
            j2 = (j - this.a) * this.b;
        }
        return blm.b(j2, 1000000, this.g);
    }
}
