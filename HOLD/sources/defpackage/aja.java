package defpackage;

import java.util.UUID;

/* renamed from: aja  reason: default package */
/* compiled from: PG */
public final class aja {
    public static final UUID a = new UUID(0, 0);
    public static final UUID b = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID c = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID d = new UUID(-7348484286925749626L, -6083546864340672619L);

    static {
        new UUID(-2129748144642739255L, 8654423357094679310L);
    }

    public static long a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }
}
