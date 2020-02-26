package p000;

/* renamed from: axo */
/* compiled from: PG */
final class axo implements axx {

    /* renamed from: a */
    public final int f2635a;

    /* renamed from: b */
    private final /* synthetic */ axq f2636b;

    public axo(axq axq, int i) {
        this.f2636b = axq;
        this.f2635a = i;
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        axq axq = this.f2636b;
        return !axq.mo1553i() && axq.f2666n[this.f2635a].mo1589b(axq.f2677y);
    }

    /* renamed from: b */
    public final void mo1479b() {
        axq axq = this.f2636b;
        axq.f2666n[this.f2635a].mo1590c();
        axq.mo1552h();
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        axq axq = this.f2636b;
        int i = this.f2635a;
        if (axq.mo1553i()) {
            return -3;
        }
        axq.mo1547a(i);
        int a = axq.f2666n[i].mo1580a(aki, anj, z, axq.f2677y, axq.f2676x);
        if (a != -3) {
            return a;
        }
        axq.mo1550b(i);
        return -3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: a */
    public final int mo1476a(long j) {
        int i;
        axq axq = this.f2636b;
        int i2 = this.f2635a;
        if (axq.mo1553i()) {
            return 0;
        }
        axq.mo1547a(i2);
        axw axw = axq.f2666n[i2];
        if (!axq.f2677y || j <= axw.mo1595h()) {
            i = axw.mo1579a(j, true);
            if (i == -1) {
                i = 0;
            }
        } else {
            i = axw.mo1600m();
        }
        if (i != 0) {
            return i;
        }
        axq.mo1550b(i2);
        return 0;
    }
}
