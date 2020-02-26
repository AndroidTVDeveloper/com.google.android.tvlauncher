package p000;

/* renamed from: awe */
/* compiled from: PG */
final class awe implements axx {

    /* renamed from: a */
    public final axx f2542a;

    /* renamed from: b */
    public boolean f2543b;

    /* renamed from: c */
    private final /* synthetic */ awf f2544c;

    public awe(awf awf, axx axx) {
        this.f2544c = awf;
        this.f2542a = axx;
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        return !this.f2544c.mo1493g() && this.f2542a.mo1478a();
    }

    /* renamed from: b */
    public final void mo1479b() {
        this.f2542a.mo1479b();
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        int i;
        if (this.f2544c.mo1493g()) {
            return -3;
        }
        if (!this.f2543b) {
            int a = this.f2542a.mo1477a(aki, anj, z);
            if (a == -5) {
                akh akh = (akh) bks.m3507a(aki.f576c);
                int i2 = akh.f572y;
                if (!(i2 == 0 && akh.f573z == 0)) {
                    if (this.f2544c.f2546b == Long.MIN_VALUE) {
                        i = akh.f573z;
                    } else {
                        i = 0;
                    }
                    aki.f576c = akh.mo420a(i2, i);
                }
                return -5;
            }
            awf awf = this.f2544c;
            long j = awf.f2546b;
            if (j == Long.MIN_VALUE || ((a != -4 || anj.f1426d < j) && (a != -3 || awf.mo1488d() != Long.MIN_VALUE))) {
                return a;
            }
            anj.mo1139a();
            anj.f1407a = 4;
            this.f2543b = true;
            return -4;
        }
        anj.f1407a = 4;
        return -4;
    }

    /* renamed from: a */
    public final int mo1476a(long j) {
        if (!this.f2544c.mo1493g()) {
            return this.f2542a.mo1476a(j);
        }
        return -3;
    }
}
