package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ars  reason: default package */
/* compiled from: PG */
public final class ars implements art {
    private final List a;
    private final aov[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public ars(List list) {
        this.a = list;
        this.b = new aov[list.size()];
    }

    private final boolean a(bky bky, int i) {
        if (bky.b() == 0) {
            return false;
        }
        if (bky.d() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    public final void a(bky bky) {
        if (!this.c) {
            return;
        }
        if (this.d != 2 || a(bky, 32)) {
            if (this.d != 1 || a(bky, 0)) {
                int i = bky.b;
                int b2 = bky.b();
                for (aov a2 : this.b) {
                    bky.c(i);
                    a2.a(bky, b2);
                }
                this.e += b2;
            }
        }
    }

    public final void a(aok aok, asw asw) {
        for (int i = 0; i < this.b.length; i++) {
            ast ast = (ast) this.a.get(i);
            asw.a();
            aov a2 = aok.a(asw.b(), 3);
            a2.a(akh.a(asw.c(), "application/dvbsubs", 0, Collections.singletonList(ast.b), ast.a, null));
            this.b[i] = a2;
        }
    }

    public final void b() {
        if (this.c) {
            for (aov a2 : this.b) {
                a2.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    public final void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final void a() {
        this.c = false;
    }
}
