package p000;

import java.util.List;

/* renamed from: bdr */
/* compiled from: PG */
public abstract class bdr extends ank implements bdl {

    /* renamed from: d */
    private bdl f3424d;

    /* renamed from: e */
    private long f3425e;

    /* renamed from: e */
    public abstract void mo1153e();

    /* renamed from: a */
    public final void mo1139a() {
        super.mo1139a();
        this.f3424d = null;
    }

    /* renamed from: b */
    public final List mo1783b(long j) {
        return ((bdl) bks.m3507a(this.f3424d)).mo1783b(j - this.f3425e);
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        return ((bdl) bks.m3507a(this.f3424d)).mo1781a(i) + this.f3425e;
    }

    /* renamed from: b */
    public final int mo1782b() {
        return ((bdl) bks.m3507a(this.f3424d)).mo1782b();
    }

    /* renamed from: a */
    public final int mo1780a(long j) {
        return ((bdl) bks.m3507a(this.f3424d)).mo1780a(j - this.f3425e);
    }

    /* renamed from: a */
    public final void mo1785a(long j, bdl bdl, long j2) {
        this.f1429b = j;
        this.f3424d = bdl;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f3425e = j;
    }
}
