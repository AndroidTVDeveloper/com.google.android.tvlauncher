package defpackage;

/* renamed from: dft  reason: default package */
/* compiled from: PG */
final class dft extends dfq {
    public static final dft b = new dft(new Object[0], 0, null, 0, 0);
    private final transient Object[] c;
    private final transient Object[] d;
    private final transient int e;
    private final transient int f;
    private final transient int g;

    public final Object[] b() {
        return this.c;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return this.g;
    }

    public final boolean e() {
        return true;
    }

    public final int hashCode() {
        return this.f;
    }

    public final int size() {
        return this.g;
    }

    public dft(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.c = objArr;
        this.d = objArr2;
        this.e = i2;
        this.f = i;
        this.g = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj != null && objArr != null) {
            int a = dgx.a(obj.hashCode());
            while (true) {
                int i = a & this.e;
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

    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.g);
    }

    /* renamed from: a */
    public final dfv iterator() {
        dfo dfo = this.a;
        if (dfo == null) {
            dfo = dfo.a(this.c, this.g);
            this.a = dfo;
        }
        return dfo.listIterator();
    }
}
