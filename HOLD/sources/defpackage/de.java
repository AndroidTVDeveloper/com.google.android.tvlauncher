package defpackage;

/* renamed from: de  reason: default package */
/* compiled from: PG */
public final class de implements Cloneable {
    public static final Object a = new Object();
    public boolean b = false;
    public int[] c;
    public Object[] d;
    public int e;

    public de() {
        int a2 = cq.a(10);
        this.c = new int[a2];
        this.d = new Object[a2];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final de clone() {
        try {
            de deVar = (de) super.clone();
            deVar.c = (int[]) this.c.clone();
            deVar.d = (Object[]) this.d.clone();
            return deVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int a(int i) {
        return this.c[i];
    }

    public final String toString() {
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            Object b2 = b(i2);
            if (b2 == this) {
                sb.append("(this Map)");
            } else {
                sb.append(b2);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object b(int i) {
        return this.d[i];
    }
}
