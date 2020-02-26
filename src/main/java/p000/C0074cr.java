package p000;

/* renamed from: cr */
/* compiled from: PG */
public final class C0074cr implements Cloneable {

    /* renamed from: a */
    public static final Object f7060a = new Object();

    /* renamed from: b */
    public boolean f7061b = false;

    /* renamed from: c */
    public long[] f7062c;

    /* renamed from: d */
    public Object[] f7063d;

    /* renamed from: e */
    public int f7064e;

    public C0074cr() {
        int b = C0073cq.m5508b(10);
        this.f7062c = new long[b];
        this.f7063d = new Object[b];
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C0074cr clone() {
        try {
            C0074cr crVar = (C0074cr) super.clone();
            crVar.f7062c = (long[]) this.f7062c.clone();
            crVar.f7063d = (Object[]) this.f7063d.clone();
            return crVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    private final void m5575c() {
        int i = this.f7064e;
        long[] jArr = this.f7062c;
        Object[] objArr = this.f7063d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7060a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7061b = false;
        this.f7064e = i2;
    }

    /* renamed from: a */
    public final Object mo3642a(long j) {
        int a = C0073cq.m5506a(this.f7062c, this.f7064e, j);
        if (a < 0) {
            return null;
        }
        Object[] objArr = this.f7063d;
        if (objArr[a] != f7060a) {
            return objArr[a];
        }
        return null;
    }

    /* renamed from: a */
    public final void mo3643a(long j, Object obj) {
        int a = C0073cq.m5506a(this.f7062c, this.f7064e, j);
        if (a < 0) {
            int i = a ^ -1;
            if (i < this.f7064e) {
                Object[] objArr = this.f7063d;
                if (objArr[i] == f7060a) {
                    this.f7062c[i] = j;
                    objArr[i] = obj;
                    return;
                }
            }
            if (this.f7061b && this.f7064e >= this.f7062c.length) {
                m5575c();
                i = C0073cq.m5506a(this.f7062c, this.f7064e, j) ^ -1;
            }
            int i2 = this.f7064e;
            if (i2 >= this.f7062c.length) {
                int b = C0073cq.m5508b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr2 = new Object[b];
                long[] jArr2 = this.f7062c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f7063d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f7062c = jArr;
                this.f7063d = objArr2;
            }
            int i3 = this.f7064e - i;
            if (i3 != 0) {
                long[] jArr3 = this.f7062c;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3);
                Object[] objArr4 = this.f7063d;
                System.arraycopy(objArr4, i, objArr4, i4, this.f7064e - i);
            }
            this.f7062c[i] = j;
            this.f7063d[i] = obj;
            this.f7064e++;
            return;
        }
        this.f7063d[a] = obj;
    }

    /* renamed from: a */
    public final int mo3640a() {
        if (this.f7061b) {
            m5575c();
        }
        return this.f7064e;
    }

    public final String toString() {
        if (mo3640a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7064e * 28);
        sb.append('{');
        for (int i = 0; i < this.f7064e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f7061b) {
                m5575c();
            }
            sb.append(this.f7062c[i]);
            sb.append('=');
            Object a = mo3641a(i);
            if (a == this) {
                sb.append("(this Map)");
            } else {
                sb.append(a);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo3641a(int i) {
        if (this.f7061b) {
            m5575c();
        }
        return this.f7063d[i];
    }
}
