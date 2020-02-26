package defpackage;

import java.util.List;

/* renamed from: bdr  reason: default package */
/* compiled from: PG */
public abstract class bdr extends ank implements bdl {
    private bdl d;
    private long e;

    public abstract void e();

    public final void a() {
        super.a();
        this.d = null;
    }

    public final List b(long j) {
        return ((bdl) bks.a(this.d)).b(j - this.e);
    }

    public final long a(int i) {
        return ((bdl) bks.a(this.d)).a(i) + this.e;
    }

    public final int b() {
        return ((bdl) bks.a(this.d)).b();
    }

    public final int a(long j) {
        return ((bdl) bks.a(this.d)).a(j - this.e);
    }

    public final void a(long j, bdl bdl, long j2) {
        this.b = j;
        this.d = bdl;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
