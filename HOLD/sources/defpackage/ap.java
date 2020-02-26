package defpackage;

/* renamed from: ap  reason: default package */
/* compiled from: PG */
final class ap extends dc {
    public final ao a;
    private final m b;

    public ap(m mVar, y yVar) {
        this.b = mVar;
        this.a = ao.a(yVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }
}
