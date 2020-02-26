package p000;

/* renamed from: ap */
/* compiled from: PG */
final class C0015ap extends C0086dc {

    /* renamed from: a */
    public final C0014ao f1564a;

    /* renamed from: b */
    private final C0326m f1565b;

    public C0015ap(C0326m mVar, C0650y yVar) {
        this.f1565b = mVar;
        this.f1564a = C0014ao.m1606a(yVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.f1565b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f1565b)));
        sb.append("}}");
        return sb.toString();
    }
}
