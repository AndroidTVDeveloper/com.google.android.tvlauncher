package defpackage;

/* renamed from: dfe  reason: default package */
/* compiled from: PG */
final class dfe extends dfc {
    public static final long serialVersionUID = 0;
    private final Object a;

    public dfe(Object obj) {
        this.a = obj;
    }

    public final boolean a() {
        return true;
    }

    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfe) {
            return this.a.equals(((dfe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
