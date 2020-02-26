package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: ars */
/* compiled from: PG */
public final class ars implements art {

    /* renamed from: a */
    private final List f2063a;

    /* renamed from: b */
    private final aov[] f2064b;

    /* renamed from: c */
    private boolean f2065c;

    /* renamed from: d */
    private int f2066d;

    /* renamed from: e */
    private int f2067e;

    /* renamed from: f */
    private long f2068f;

    public ars(List list) {
        this.f2063a = list;
        this.f2064b = new aov[list.size()];
    }

    /* renamed from: a */
    private final boolean m1933a(bky bky, int i) {
        if (bky.mo2070b() == 0) {
            return false;
        }
        if (bky.mo2074d() != i) {
            this.f2065c = false;
        }
        this.f2066d--;
        return this.f2065c;
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        if (!this.f2065c) {
            return;
        }
        if (this.f2066d != 2 || m1933a(bky, 32)) {
            if (this.f2066d != 1 || m1933a(bky, 0)) {
                int i = bky.f4259b;
                int b = bky.mo2070b();
                for (aov a : this.f2064b) {
                    bky.mo2073c(i);
                    a.mo1205a(bky, b);
                }
                this.f2067e += b;
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        for (int i = 0; i < this.f2064b.length; i++) {
            ast ast = (ast) this.f2063a.get(i);
            asw.mo1308a();
            aov a = aok.mo1211a(asw.mo1309b(), 3);
            a.mo1204a(akh.m734a(asw.mo1310c(), "application/dvbsubs", 0, Collections.singletonList(ast.f2301b), ast.f2300a, null));
            this.f2064b[i] = a;
        }
    }

    /* renamed from: b */
    public final void mo1285b() {
        if (this.f2065c) {
            for (aov a : this.f2064b) {
                a.mo1203a(this.f2068f, 1, this.f2067e, 0, null);
            }
            this.f2065c = false;
        }
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        if ((i & 4) != 0) {
            this.f2065c = true;
            this.f2068f = j;
            this.f2067e = 0;
            this.f2066d = 2;
        }
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2065c = false;
    }
}
