package defpackage;

/* renamed from: aiw  reason: default package */
/* compiled from: PG */
public final class aiw {
    public final aks a;
    public boolean b;

    public aiw(aks aks) {
        this.a = aks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((aiw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
