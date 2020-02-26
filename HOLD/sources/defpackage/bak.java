package defpackage;

import java.util.List;

/* renamed from: bak  reason: default package */
/* compiled from: PG */
public final class bak extends bam implements azr {
    private final ban f;

    public bak(akh akh, String str, ban ban, List list) {
        super(akh, str, ban, list);
        this.f = ban;
    }

    public final long a() {
        return this.f.a;
    }

    public final baj c() {
        return null;
    }

    public final azr d() {
        return this;
    }

    public final String e() {
        return null;
    }

    public final long b(long j, long j2) {
        ban ban = this.f;
        List list = ban.c;
        if (list != null) {
            return (((baq) list.get((int) (j - ban.a))).b * 1000000) / ban.g;
        }
        int b = ban.b(j2);
        if (b == -1 || j != (ban.a + ((long) b)) - 1) {
            return (ban.b * 1000000) / ban.g;
        }
        return j2 - ban.a(j);
    }

    public final int c(long j) {
        return this.f.b(j);
    }

    public final long a(long j, long j2) {
        ban ban = this.f;
        long j3 = ban.a;
        long b = (long) ban.b(j2);
        if (b == 0) {
            return j3;
        }
        if (ban.c == null) {
            long j4 = (j / ((ban.b * 1000000) / ban.g)) + ban.a;
            if (j4 >= j3) {
                return b != -1 ? Math.min(j4, (j3 + b) - 1) : j4;
            }
            return j3;
        }
        long j5 = (b + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long a = ban.a(j7);
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

    public final baj b(long j) {
        return this.f.a(this, j);
    }

    public final long a(long j) {
        return this.f.a(j);
    }

    public final boolean b() {
        return this.f.a();
    }
}
