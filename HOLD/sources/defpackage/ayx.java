package defpackage;

/* renamed from: ayx  reason: default package */
/* compiled from: PG */
public abstract class ayx extends ayl {
    public final long m;

    public ayx(bhv bhv, bhy bhy, akh akh, int i, Object obj, long j, long j2, long j3) {
        super(bhv, bhy, 1, akh, i, obj, j, j2);
        bks.a(akh);
        this.m = j3;
    }

    public long d() {
        long j = this.m;
        if (j != -1) {
            return j + 1;
        }
        return -1;
    }

    public abstract boolean e();
}
