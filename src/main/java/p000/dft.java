package p000;

/* renamed from: dft */
/* compiled from: PG */
final class dft extends dfq {

    /* renamed from: b */
    public static final dft f8466b = new dft(new Object[0], 0, null, 0, 0);

    /* renamed from: c */
    private final transient Object[] f8467c;

    /* renamed from: d */
    private final transient Object[] f8468d;

    /* renamed from: e */
    private final transient int f8469e;

    /* renamed from: f */
    private final transient int f8470f;

    /* renamed from: g */
    private final transient int f8471g;

    /* renamed from: b */
    public final Object[] mo4239b() {
        return this.f8467c;
    }

    /* renamed from: c */
    public final int mo4240c() {
        return 0;
    }

    /* renamed from: d */
    public final int mo4242d() {
        return this.f8471g;
    }

    /* renamed from: e */
    public final boolean mo4268e() {
        return true;
    }

    public final int hashCode() {
        return this.f8470f;
    }

    public final int size() {
        return this.f8471g;
    }

    public dft(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f8467c = objArr;
        this.f8468d = objArr2;
        this.f8469e = i2;
        this.f8470f = i;
        this.f8471g = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f8468d;
        if (obj != null && objArr != null) {
            int a = dgx.m6398a(obj.hashCode());
            while (true) {
                int i = a & this.f8469e;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    a = i + 1;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4236a(Object[] objArr) {
        System.arraycopy(this.f8467c, 0, objArr, 0, this.f8471g);
    }

    /* renamed from: a */
    public final dfv iterator() {
        dfo dfo = this.f8460a;
        if (dfo == null) {
            dfo = dfo.m6316a(this.f8467c, this.f8471g);
            this.f8460a = dfo;
        }
        return dfo.listIterator();
    }
}
