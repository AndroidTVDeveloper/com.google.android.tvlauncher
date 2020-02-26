package p000;

/* renamed from: aiy */
/* compiled from: PG */
public abstract class aiy implements akt {

    /* renamed from: a */
    public final alg f419a = new alg();

    /* renamed from: b */
    public final int mo340b() {
        alh r = mo404r();
        if (r.mo552c()) {
            return -1;
        }
        int k = mo397k();
        int s = mo405s();
        mo396j();
        return r.mo545a(k, s);
    }

    /* renamed from: c */
    public final int mo341c() {
        alh r = mo404r();
        if (r.mo552c()) {
            return -1;
        }
        int k = mo397k();
        int s = mo405s();
        mo396j();
        if (s != 0) {
            if (s == 1) {
                return k;
            }
            if (s != 2) {
                throw new IllegalStateException();
            } else if (k != r.mo553d()) {
                return k - 1;
            } else {
                return r.mo554e();
            }
        } else if (k == r.mo553d()) {
            return -1;
        } else {
            return k - 1;
        }
    }

    /* renamed from: s */
    private final int mo405s() {
        int i = mo395i();
        if (i == 1) {
            return 0;
        }
        return i;
    }

    /* renamed from: d */
    public final boolean mo342d() {
        alh r = mo404r();
        return !r.mo552c() && r.mo548a(mo397k(), this.f419a).f674c;
    }

    /* renamed from: a */
    public final boolean mo339a() {
        return mo392f() == 3 && mo394h() && mo393g() == 0;
    }
}
