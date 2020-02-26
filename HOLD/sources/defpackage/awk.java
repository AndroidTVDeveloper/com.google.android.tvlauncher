package defpackage;

/* renamed from: awk  reason: default package */
/* compiled from: PG */
public final class awk implements axz {
    private final axz[] a;

    public awk(axz[] axzArr) {
        this.a = axzArr;
    }

    public final boolean c(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            boolean z2 = false;
            for (axz axz : this.a) {
                long e2 = axz.e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= j2;
                if (e2 == e || z3) {
                    z2 |= axz.c(j2);
                }
            }
            z |= z2;
            if (!z2) {
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final long d() {
        long j = Long.MAX_VALUE;
        for (axz d : this.a) {
            long d2 = d.d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    public final long e() {
        long j = Long.MAX_VALUE;
        for (axz e : this.a) {
            long e2 = e.e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        for (axz f : this.a) {
            if (f.f()) {
                return true;
            }
        }
        return false;
    }

    public final void g(long j) {
        for (axz g : this.a) {
            g.g(j);
        }
    }
}
