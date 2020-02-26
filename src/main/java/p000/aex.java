package p000;

/* renamed from: aex */
/* compiled from: PG */
final class aex {

    /* renamed from: a */
    public final aew f218a;

    /* renamed from: b */
    private final Class f219b;

    /* renamed from: c */
    private final Class f220c;

    public aex(Class cls, Class cls2, aew aew) {
        this.f219b = cls;
        this.f220c = cls2;
        this.f218a = aew;
    }

    /* renamed from: a */
    public final boolean mo123a(Class cls, Class cls2) {
        return this.f219b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f220c);
    }
}
