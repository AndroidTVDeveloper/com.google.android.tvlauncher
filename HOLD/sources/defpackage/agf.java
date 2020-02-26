package defpackage;

/* renamed from: agf  reason: default package */
/* compiled from: PG */
final class agf {
    public final Class a;
    public final tz b;
    private final Class c;

    public agf(Class cls, Class cls2, tz tzVar) {
        this.c = cls;
        this.a = cls2;
        this.b = tzVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
