package defpackage;

/* renamed from: dez  reason: default package */
/* compiled from: PG */
public final class dez extends dfc {
    public static final dez a = new dez();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    public final boolean a() {
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

    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
