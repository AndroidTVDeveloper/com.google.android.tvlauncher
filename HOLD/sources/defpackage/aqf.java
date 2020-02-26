package defpackage;

/* renamed from: aqf  reason: default package */
/* compiled from: PG */
final class aqf {
    public final aov a;
    public final aqq b = new aqq();
    public aqo c;
    public aqc d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final bky i = new bky(1);
    public final bky j = new bky();

    public aqf(aov aov) {
        this.a = aov;
    }

    public final aqp c() {
        aqq aqq = this.b;
        int i2 = aqq.a.a;
        aqp aqp = aqq.n;
        if (aqp == null) {
            aqp = this.c.a(i2);
        }
        if (aqp == null || !aqp.a) {
            return null;
        }
        return aqp;
    }

    public final void a(aqo aqo, aqc aqc) {
        this.c = (aqo) bks.a(aqo);
        this.d = (aqc) bks.a(aqc);
        this.a.a(aqo.f);
        a();
    }

    public final boolean b() {
        this.e++;
        int i2 = this.f + 1;
        this.f = i2;
        int[] iArr = this.b.g;
        int i3 = this.g;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.g = i3 + 1;
        this.f = 0;
        return false;
    }

    public final void a() {
        aqq aqq = this.b;
        aqq.d = 0;
        aqq.r = 0;
        aqq.l = false;
        aqq.q = false;
        aqq.n = null;
        this.e = 0;
        this.g = 0;
        this.f = 0;
        this.h = 0;
    }
}
