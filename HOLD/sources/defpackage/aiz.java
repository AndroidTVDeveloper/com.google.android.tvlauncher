package defpackage;

/* renamed from: aiz  reason: default package */
/* compiled from: PG */
public abstract class aiz implements akx, aky {
    public akz a;
    public int b;
    public axx c;
    public akh[] d;
    public boolean e;
    private final int f;
    private final aki g = new aki();
    private long h;
    private long i = Long.MIN_VALUE;

    public aiz(int i2) {
        this.f = i2;
    }

    protected static boolean a(anq anq) {
        return anq == null;
    }

    public final aky R() {
        return this;
    }

    public final int a() {
        return this.f;
    }

    public void a(float f2) {
    }

    public void a(int i2, Object obj) {
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(akh[] akhArr, long j) {
    }

    public bkr c() {
        return null;
    }

    public final int d() {
        return this.b;
    }

    public final axx f() {
        return this.c;
    }

    public final boolean g() {
        return this.i == Long.MIN_VALUE;
    }

    public final long h() {
        return this.i;
    }

    public final boolean j() {
        return this.e;
    }

    public int o() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: protected */
    public void s() {
    }

    public final void u() {
    }

    public final void m() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        bks.b(z);
        this.g.a();
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = false;
        r();
    }

    public final void a(akz akz, akh[] akhArr, axx axx, long j, boolean z, long j2) {
        bks.b(this.b == 0);
        this.a = akz;
        this.b = 1;
        a(z);
        a(akhArr, axx, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public final aki t() {
        this.g.a();
        return this.g;
    }

    public final void k() {
        this.c.b();
    }

    /* access modifiers changed from: protected */
    public final int a(aki aki, anj anj, boolean z) {
        int a2 = this.c.a(aki, anj, z);
        if (a2 != -4) {
            if (a2 == -5) {
                akh akh = aki.c;
                long j = akh.m;
                if (j != Long.MAX_VALUE) {
                    aki.c = akh.a(j + this.h);
                    return -5;
                }
            }
        } else if (anj.c()) {
            this.i = Long.MIN_VALUE;
            if (!this.e) {
                return -3;
            }
            return -4;
        } else {
            long j2 = anj.d + this.h;
            anj.d = j2;
            this.i = Math.max(this.i, j2);
        }
        return a2;
    }

    public final void a(akh[] akhArr, axx axx, long j) {
        bks.b(!this.e);
        this.c = axx;
        this.i = j;
        this.d = akhArr;
        this.h = j;
        a(akhArr, j);
    }

    public final void n() {
        bks.b(this.b == 0);
        this.g.a();
        s();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(long, boolean):void
     arg types: [long, int]
     candidates:
      aiz.a(int, java.lang.Object):void
      aiz.a(akh[], long):void
      akx.a(long, long):void
      akv.a(int, java.lang.Object):void
      aiz.a(long, boolean):void */
    public final void a(long j) {
        this.e = false;
        this.i = j;
        a(j, false);
    }

    public final void i() {
        this.e = true;
    }

    /* access modifiers changed from: protected */
    public final int b(long j) {
        return this.c.a(j - this.h);
    }

    public final void e() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        bks.b(z);
        this.b = 2;
        p();
    }

    public final void l() {
        bks.b(this.b == 2);
        this.b = 1;
        q();
    }
}
