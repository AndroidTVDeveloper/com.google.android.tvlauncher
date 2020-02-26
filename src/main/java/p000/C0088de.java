package p000;

/* renamed from: de */
/* compiled from: PG */
public final class C0088de implements Cloneable {

    /* renamed from: a */
    public static final Object f8357a = new Object();

    /* renamed from: b */
    public boolean f8358b = false;

    /* renamed from: c */
    public int[] f8359c;

    /* renamed from: d */
    public Object[] f8360d;

    /* renamed from: e */
    public int f8361e;

    public C0088de() {
        int a = C0073cq.m5504a(10);
        this.f8359c = new int[a];
        this.f8360d = new Object[a];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C0088de clone() {
        try {
            C0088de deVar = (C0088de) super.clone();
            deVar.f8359c = (int[]) this.f8359c.clone();
            deVar.f8360d = (Object[]) this.f8360d.clone();
            return deVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final int mo4170a(int i) {
        return this.f8359c[i];
    }

    public final String toString() {
        int i = this.f8361e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8361e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(mo4170a(i2));
            sb.append('=');
            Object b = mo4171b(i2);
            if (b == this) {
                sb.append("(this Map)");
            } else {
                sb.append(b);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final Object mo4171b(int i) {
        return this.f8360d[i];
    }
}
