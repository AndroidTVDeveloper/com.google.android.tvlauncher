package defpackage;

import java.util.List;

/* renamed from: dfn  reason: default package */
/* compiled from: PG */
final class dfn extends dfo {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ dfo c;

    public dfn(dfo dfo, int i, int i2) {
        this.c = dfo;
        this.a = i;
        this.b = i2;
    }

    public final int size() {
        return this.b;
    }

    public final Object get(int i) {
        dgx.a(i, this.b);
        return this.c.get(i + this.a);
    }

    public final Object[] b() {
        return this.c.b();
    }

    public final int d() {
        return this.c.c() + this.a + this.b;
    }

    public final int c() {
        return this.c.c() + this.a;
    }

    public final dfo a(int i, int i2) {
        dgx.a(i, i2, this.b);
        dfo dfo = this.c;
        int i3 = this.a;
        return dfo.subList(i + i3, i2 + i3);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
