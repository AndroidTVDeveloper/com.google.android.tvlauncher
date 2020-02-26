package defpackage;

/* renamed from: akz  reason: default package */
/* compiled from: PG */
public final class akz {
    public static final akz a = new akz(0);
    public final int b;

    public final int hashCode() {
        return this.b;
    }

    public akz(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.b == ((akz) obj).b;
        }
        return true;
    }
}
