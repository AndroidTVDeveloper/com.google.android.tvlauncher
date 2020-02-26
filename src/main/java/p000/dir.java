package p000;

/* renamed from: dir */
/* compiled from: PG */
final class dir {

    /* renamed from: a */
    private final Object f8597a;

    /* renamed from: b */
    private final int f8598b;

    public dir(Object obj, int i) {
        this.f8597a = obj;
        this.f8598b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dir) {
            dir dir = (dir) obj;
            if (this.f8597a == dir.f8597a && this.f8598b == dir.f8598b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8597a) * 65535) + this.f8598b;
    }
}
