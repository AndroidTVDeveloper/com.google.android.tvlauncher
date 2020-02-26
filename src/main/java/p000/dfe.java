package p000;

/* renamed from: dfe */
/* compiled from: PG */
final class dfe extends dfc {
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f8444a;

    public dfe(Object obj) {
        this.f8444a = obj;
    }

    /* renamed from: a */
    public final boolean mo4219a() {
        return true;
    }

    /* renamed from: b */
    public final Object mo4220b() {
        return this.f8444a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfe) {
            return this.f8444a.equals(((dfe) obj).f8444a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8444a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8444a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
