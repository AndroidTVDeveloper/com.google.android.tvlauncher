package defpackage;

/* renamed from: dir  reason: default package */
/* compiled from: PG */
final class dir {
    private final Object a;
    private final int b;

    public dir(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dir) {
            dir dir = (dir) obj;
            if (this.a == dir.a && this.b == dir.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
