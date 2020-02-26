package defpackage;

/* renamed from: aar  reason: default package */
/* compiled from: PG */
final class aar {
    public final Class a;
    public final aak b;
    private final Class c;

    public aar(Class cls, Class cls2, aak aak) {
        this.c = cls;
        this.a = cls2;
        this.b = aak;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }
}
