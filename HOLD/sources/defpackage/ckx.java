package defpackage;

import java.util.Set;

/* renamed from: ckx  reason: default package */
/* compiled from: PG */
final class ckx implements ckc {
    public final /* synthetic */ cla a;

    public /* synthetic */ ckx(cla cla) {
        this.a = cla;
    }

    public final Set a() {
        return this.a.m;
    }

    public final Long b(long j) {
        return (Long) this.a.v.get(Long.valueOf(j));
    }

    public final boolean a(long j) {
        return this.a.j.containsKey(Long.valueOf(j));
    }

    public final void a(Long l) {
        if (!this.a.c.containsKey(l) && !this.a.a(l)) {
            this.a.p.add(l);
        } else {
            this.a.e(l.longValue());
        }
    }
}
