package p000;

/* renamed from: dfs */
/* compiled from: PG */
final class dfs extends dfo {

    /* renamed from: a */
    public static final dfo f8463a = new dfs(new Object[0], 0);

    /* renamed from: b */
    private final transient Object[] f8464b;

    /* renamed from: c */
    private final transient int f8465c;

    /* renamed from: b */
    public final Object[] mo4239b() {
        return this.f8464b;
    }

    /* renamed from: c */
    public final int mo4240c() {
        return 0;
    }

    /* renamed from: d */
    public final int mo4242d() {
        return this.f8465c;
    }

    public final int size() {
        return this.f8465c;
    }

    public dfs(Object[] objArr, int i) {
        this.f8464b = objArr;
        this.f8465c = i;
    }

    /* renamed from: a */
    public final void mo4236a(Object[] objArr) {
        System.arraycopy(this.f8464b, 0, objArr, 0, this.f8465c);
    }

    public final Object get(int i) {
        dgx.m6406a(i, this.f8465c);
        return this.f8464b[i];
    }
}
