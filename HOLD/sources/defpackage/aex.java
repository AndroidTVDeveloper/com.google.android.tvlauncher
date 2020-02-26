package defpackage;

/* renamed from: aex  reason: default package */
/* compiled from: PG */
final class aex {
    public final aew a;
    private final Class b;
    private final Class c;

    public aex(Class cls, Class cls2, aew aew) {
        this.b = cls;
        this.c = cls2;
        this.a = aew;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
    }
}
