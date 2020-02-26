package p000;

/* renamed from: awt */
/* compiled from: PG */
public final class awt {

    /* renamed from: a */
    public final Object f2566a;

    /* renamed from: b */
    public final int f2567b;

    /* renamed from: c */
    public final int f2568c;

    /* renamed from: d */
    public final long f2569d;

    /* renamed from: e */
    public final int f2570e;

    public awt(Object obj) {
        this(obj, -1);
    }

    /* renamed from: a */
    public final boolean mo1504a() {
        return this.f2567b != -1;
    }

    public awt(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private awt(Object obj, int i, int i2, long j, int i3) {
        this.f2566a = obj;
        this.f2567b = i;
        this.f2568c = i2;
        this.f2569d = j;
        this.f2570e = i3;
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
        return this.f2566a.equals(awt.f2566a) && this.f2567b == awt.f2567b && this.f2568c == awt.f2568c && this.f2569d == awt.f2569d && this.f2570e == awt.f2570e;
    }

    public final int hashCode() {
        return ((((((((this.f2566a.hashCode() + 527) * 31) + this.f2567b) * 31) + this.f2568c) * 31) + ((int) this.f2569d)) * 31) + this.f2570e;
    }
}
