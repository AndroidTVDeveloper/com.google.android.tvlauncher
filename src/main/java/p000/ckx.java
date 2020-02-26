package p000;

import java.util.Set;

/* renamed from: ckx */
/* compiled from: PG */
final class ckx implements ckc {

    /* renamed from: a */
    public final /* synthetic */ cla f5845a;

    public /* synthetic */ ckx(cla cla) {
        this.f5845a = cla;
    }

    /* renamed from: a */
    public final Set mo2965a() {
        return this.f5845a.f5885m;
    }

    /* renamed from: b */
    public final Long mo2967b(long j) {
        return (Long) this.f5845a.f5894v.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final boolean mo2966a(long j) {
        return this.f5845a.f5882j.containsKey(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo3041a(Long l) {
        if (!this.f5845a.f5875c.containsKey(l) && !this.f5845a.mo3057a(l)) {
            this.f5845a.f5888p.add(l);
        } else {
            this.f5845a.mo3071e(l.longValue());
        }
    }
}
