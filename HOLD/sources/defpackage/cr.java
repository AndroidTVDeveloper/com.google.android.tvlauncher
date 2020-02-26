package defpackage;

/* renamed from: cr  reason: default package */
/* compiled from: PG */
public final class cr implements Cloneable {
    public static final Object a = new Object();
    public boolean b = false;
    public long[] c;
    public Object[] d;
    public int e;

    public cr() {
        int b2 = cq.b(10);
        this.c = new long[b2];
        this.d = new Object[b2];
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final cr clone() {
        try {
            cr crVar = (cr) super.clone();
            crVar.c = (long[]) this.c.clone();
            crVar.d = (Object[]) this.d.clone();
            return crVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void c() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final Object a(long j) {
        int a2 = cq.a(this.c, this.e, j);
        if (a2 < 0) {
            return null;
        }
        Object[] objArr = this.d;
        if (objArr[a2] != a) {
            return objArr[a2];
        }
        return null;
    }

    public final void a(long j, Object obj) {
        int a2 = cq.a(this.c, this.e, j);
        if (a2 < 0) {
            int i = a2 ^ -1;
            if (i < this.e) {
                Object[] objArr = this.d;
                if (objArr[i] == a) {
                    this.c[i] = j;
                    objArr[i] = obj;
                    return;
                }
            }
            if (this.b && this.e >= this.c.length) {
                c();
                i = cq.a(this.c, this.e, j) ^ -1;
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b2 = cq.b(i2 + 1);
                long[] jArr = new long[b2];
                Object[] objArr2 = new Object[b2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.c = jArr;
                this.d = objArr2;
            }
            int i3 = this.e - i;
            if (i3 != 0) {
                long[] jArr3 = this.c;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3);
                Object[] objArr4 = this.d;
                System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
            }
            this.c[i] = j;
            this.d[i] = obj;
            this.e++;
            return;
        }
        this.d[a2] = obj;
    }

    public final int a() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.b) {
                c();
            }
            sb.append(this.c[i]);
            sb.append('=');
            Object a2 = a(i);
            if (a2 == this) {
                sb.append("(this Map)");
            } else {
                sb.append(a2);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object a(int i) {
        if (this.b) {
            c();
        }
        return this.d[i];
    }
}
