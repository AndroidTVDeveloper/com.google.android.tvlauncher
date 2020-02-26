package defpackage;

/* renamed from: dfs  reason: default package */
/* compiled from: PG */
final class dfs extends dfo {
    public static final dfo a = new dfs(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    public final Object[] b() {
        return this.b;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return this.c;
    }

    public final int size() {
        return this.c;
    }

    public dfs(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.b, 0, objArr, 0, this.c);
    }

    public final Object get(int i) {
        dgx.a(i, this.c);
        return this.b[i];
    }
}
