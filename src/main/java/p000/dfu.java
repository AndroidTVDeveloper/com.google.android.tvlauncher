package p000;

/* renamed from: dfu */
/* compiled from: PG */
final class dfu extends dfq {

    /* renamed from: b */
    private final transient Object f8472b;

    /* renamed from: c */
    private transient int f8473c;

    public dfu(Object obj) {
        this.f8472b = dgx.m6401a(obj);
    }

    /* renamed from: e */
    public final boolean mo4268e() {
        return this.f8473c != 0;
    }

    public final int size() {
        return 1;
    }

    public dfu(Object obj, int i) {
        this.f8472b = obj;
        this.f8473c = i;
    }

    public final boolean contains(Object obj) {
        return this.f8472b.equals(obj);
    }

    /* renamed from: a */
    public final void mo4236a(Object[] objArr) {
        objArr[0] = this.f8472b;
    }

    public final int hashCode() {
        int i = this.f8473c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f8472b.hashCode();
        this.f8473c = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public final dfv iterator() {
        return new dfr(this.f8472b);
    }

    public final String toString() {
        String obj = this.f8472b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
