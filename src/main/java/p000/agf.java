package p000;

/* renamed from: agf */
/* compiled from: PG */
final class agf {

    /* renamed from: a */
    public final Class f263a;

    /* renamed from: b */
    public final C0541tz f264b;

    /* renamed from: c */
    private final Class f265c;

    public agf(Class cls, Class cls2, C0541tz tzVar) {
        this.f265c = cls;
        this.f263a = cls2;
        this.f264b = tzVar;
    }

    /* renamed from: a */
    public final boolean mo184a(Class cls, Class cls2) {
        return this.f265c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f263a);
    }
}
