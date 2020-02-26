package p000;

/* renamed from: dez */
/* compiled from: PG */
public final class dez extends dfc {

    /* renamed from: a */
    public static final dez f8438a = new dez();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return f8438a;
    }

    /* renamed from: a */
    public final boolean mo4219a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    private dez() {
    }

    /* renamed from: b */
    public final Object mo4220b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
