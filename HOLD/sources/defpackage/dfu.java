package defpackage;

/* renamed from: dfu  reason: default package */
/* compiled from: PG */
final class dfu extends dfq {
    private final transient Object b;
    private transient int c;

    public dfu(Object obj) {
        this.b = dgx.a(obj);
    }

    public final boolean e() {
        return this.c != 0;
    }

    public final int size() {
        return 1;
    }

    public dfu(Object obj, int i) {
        this.b = obj;
        this.c = i;
    }

    public final boolean contains(Object obj) {
        return this.b.equals(obj);
    }

    public final void a(Object[] objArr) {
        objArr[0] = this.b;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public final dfv iterator() {
        return new dfr(this.b);
    }

    public final String toString() {
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
