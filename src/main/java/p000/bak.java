package p000;

import java.util.List;

/* renamed from: bak */
/* compiled from: PG */
public final class bak extends bam implements azr {

    /* renamed from: f */
    private final ban f3010f;

    public bak(akh akh, String str, ban ban, List list) {
        super(akh, str, ban, list);
        this.f3010f = ban;
    }

    /* renamed from: a */
    public final long mo1657a() {
        return this.f3010f.f3018a;
    }

    /* renamed from: c */
    public final baj mo1691c() {
        return null;
    }

    /* renamed from: d */
    public final azr mo1692d() {
        return this;
    }

    /* renamed from: e */
    public final String mo1693e() {
        return null;
    }

    /* renamed from: b */
    public final long mo1660b(long j, long j2) {
        ban ban = this.f3010f;
        List list = ban.f3020c;
        if (list != null) {
            return (((baq) list.get((int) (j - ban.f3018a))).f3026b * 1000000) / ban.f3030g;
        }
        int b = ban.mo1697b(j2);
        if (b == -1 || j != (ban.f3018a + ((long) b)) - 1) {
            return (ban.f3019b * 1000000) / ban.f3030g;
        }
        return j2 - ban.mo1694a(j);
    }

    /* renamed from: c */
    public final int mo1663c(long j) {
        return this.f3010f.mo1697b(j);
    }

    /* renamed from: a */
    public final long mo1659a(long j, long j2) {
        ban ban = this.f3010f;
        long j3 = ban.f3018a;
        long b = (long) ban.mo1697b(j2);
        if (b == 0) {
            return j3;
        }
        if (ban.f3020c == null) {
            long j4 = (j / ((ban.f3019b * 1000000) / ban.f3030g)) + ban.f3018a;
            if (j4 >= j3) {
                return b != -1 ? Math.min(j4, (j3 + b) - 1) : j4;
            }
            return j3;
        }
        long j5 = (b + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long a = ban.mo1694a(j7);
            if (a < j) {
                j6 = j7 + 1;
            } else if (a <= j) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        if (j6 != j3) {
            return j5;
        }
        return j6;
    }

    /* renamed from: b */
    public final baj mo1661b(long j) {
        return this.f3010f.mo1695a(this, j);
    }

    /* renamed from: a */
    public final long mo1658a(long j) {
        return this.f3010f.mo1694a(j);
    }

    /* renamed from: b */
    public final boolean mo1662b() {
        return this.f3010f.mo1696a();
    }
}
