package defpackage;

/* renamed from: awt  reason: default package */
/* compiled from: PG */
public final class awt {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public awt(Object obj) {
        this(obj, -1);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public awt(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private awt(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public awt(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public awt(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        awt awt = (awt) obj;
        return this.a.equals(awt.a) && this.b == awt.b && this.c == awt.c && this.d == awt.d && this.e == awt.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
