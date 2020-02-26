package defpackage;

/* renamed from: aiy  reason: default package */
/* compiled from: PG */
public abstract class aiy implements akt {
    public final alg a = new alg();

    public final int b() {
        alh r = r();
        if (r.c()) {
            return -1;
        }
        int k = k();
        int s = s();
        j();
        return r.a(k, s);
    }

    public final int c() {
        alh r = r();
        if (r.c()) {
            return -1;
        }
        int k = k();
        int s = s();
        j();
        if (s != 0) {
            if (s == 1) {
                return k;
            }
            if (s != 2) {
                throw new IllegalStateException();
            } else if (k != r.d()) {
                return k - 1;
            } else {
                return r.e();
            }
        } else if (k == r.d()) {
            return -1;
        } else {
            return k - 1;
        }
    }

    private final int s() {
        int i = i();
        if (i == 1) {
            return 0;
        }
        return i;
    }

    public final boolean d() {
        alh r = r();
        return !r.c() && r.a(k(), this.a).c;
    }

    public final boolean a() {
        return f() == 3 && h() && g() == 0;
    }
}
