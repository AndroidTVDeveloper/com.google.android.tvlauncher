package defpackage;

/* renamed from: lw  reason: default package */
/* compiled from: PG */
final class lw {
    public final long a;
    public final long b;

    public lw(long j, long j2) {
        if (j2 == 0) {
            this.a = 0;
            this.b = 1;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
