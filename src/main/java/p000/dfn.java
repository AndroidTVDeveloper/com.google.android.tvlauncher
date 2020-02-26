package p000;

import java.util.List;

/* renamed from: dfn */
/* compiled from: PG */
final class dfn extends dfo {

    /* renamed from: a */
    private final transient int f8455a;

    /* renamed from: b */
    private final transient int f8456b;

    /* renamed from: c */
    private final /* synthetic */ dfo f8457c;

    public dfn(dfo dfo, int i, int i2) {
        this.f8457c = dfo;
        this.f8455a = i;
        this.f8456b = i2;
    }

    public final int size() {
        return this.f8456b;
    }

    public final Object get(int i) {
        dgx.m6406a(i, this.f8456b);
        return this.f8457c.get(i + this.f8455a);
    }

    /* renamed from: b */
    public final Object[] mo4239b() {
        return this.f8457c.mo4239b();
    }

    /* renamed from: d */
    public final int mo4242d() {
        return this.f8457c.mo4240c() + this.f8455a + this.f8456b;
    }

    /* renamed from: c */
    public final int mo4240c() {
        return this.f8457c.mo4240c() + this.f8455a;
    }

    /* renamed from: a */
    public final dfo mo4251a(int i, int i2) {
        dgx.m6407a(i, i2, this.f8456b);
        dfo dfo = this.f8457c;
        int i3 = this.f8455a;
        return dfo.subList(i + i3, i2 + i3);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
