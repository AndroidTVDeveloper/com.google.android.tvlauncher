package p000;

/* renamed from: awk */
/* compiled from: PG */
public final class awk implements axz {

    /* renamed from: a */
    private final axz[] f2559a;

    public awk(axz[] axzArr) {
        this.f2559a = axzArr;
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long e = mo1490e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            boolean z2 = false;
            for (axz axz : this.f2559a) {
                long e2 = axz.mo1490e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= j2;
                if (e2 == e || z3) {
                    z2 |= axz.mo1487c(j2);
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

    /* renamed from: d */
    public final long mo1488d() {
        long j = Long.MAX_VALUE;
        for (axz d : this.f2559a) {
            long d2 = d.mo1488d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public final long mo1490e() {
        long j = Long.MAX_VALUE;
        for (axz e : this.f2559a) {
            long e2 = e.mo1490e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        for (axz f : this.f2559a) {
            if (f.mo1491f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
        for (axz g : this.f2559a) {
            g.mo1492g(j);
        }
    }
}
