package defpackage;

/* renamed from: awe  reason: default package */
/* compiled from: PG */
final class awe implements axx {
    public final axx a;
    public boolean b;
    private final /* synthetic */ awf c;

    public awe(awf awf, axx axx) {
        this.c = awf;
        this.a = axx;
    }

    public final boolean a() {
        return !this.c.g() && this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final int a(aki aki, anj anj, boolean z) {
        int i;
        if (this.c.g()) {
            return -3;
        }
        if (!this.b) {
            int a2 = this.a.a(aki, anj, z);
            if (a2 == -5) {
                akh akh = (akh) bks.a(aki.c);
                int i2 = akh.y;
                if (!(i2 == 0 && akh.z == 0)) {
                    if (this.c.b == Long.MIN_VALUE) {
                        i = akh.z;
                    } else {
                        i = 0;
                    }
                    aki.c = akh.a(i2, i);
                }
                return -5;
            }
            awf awf = this.c;
            long j = awf.b;
            if (j == Long.MIN_VALUE || ((a2 != -4 || anj.d < j) && (a2 != -3 || awf.d() != Long.MIN_VALUE))) {
                return a2;
            }
            anj.a();
            anj.a = 4;
            this.b = true;
            return -4;
        }
        anj.a = 4;
        return -4;
    }

    public final int a(long j) {
        if (!this.c.g()) {
            return this.a.a(j);
        }
        return -3;
    }
}
