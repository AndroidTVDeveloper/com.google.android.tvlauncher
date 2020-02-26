package defpackage;

/* renamed from: ark  reason: default package */
/* compiled from: PG */
public final class ark implements aoi {
    private final arl a = new arl();
    private final bky b = new bky(2786);
    private boolean c;

    public final void a(aok aok) {
        this.a.a(aok, new asw(0, 1));
        aok.S();
        aok.a(new aor(-9223372036854775807L));
    }

    public final int a(aoj aoj, aop aop) {
        int a2 = aoj.a(this.b.a, 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.b.c(0);
        this.b.b(a2);
        if (!this.c) {
            this.a.a = 0;
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public final void a(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final boolean a(aoj aoj) {
        bky bky = new bky(10);
        int i = 0;
        while (true) {
            aoj.c(bky.a, 0, 10);
            bky.c(0);
            if (bky.g() != 4801587) {
                break;
            }
            bky.d(3);
            int m = bky.m();
            i += m + 10;
            aoj.b(m);
        }
        aoj.a();
        aoj.b(i);
        int i2 = i;
        int i3 = 0;
        while (true) {
            aoj.c(bky.a, 0, 6);
            bky.c(0);
            if (bky.e() != 2935) {
                aoj.a();
                i2++;
                if (i2 - i >= 8192) {
                    return false;
                }
                aoj.b(i2);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a2 = aln.a(bky.a);
                if (a2 == -1) {
                    return false;
                }
                aoj.b(a2 - 6);
            }
        }
    }
}
