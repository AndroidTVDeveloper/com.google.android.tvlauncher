package defpackage;

/* renamed from: hm  reason: default package */
/* compiled from: PG */
public final class hm {
    private long a = 0;
    private hm b;

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (i >= 64) {
            hm hmVar = this.b;
            if (hmVar != null) {
                hmVar.b(i - 64);
                return;
            }
            return;
        }
        this.a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: package-private */
    public final int e(int i) {
        hm hmVar = this.b;
        if (hmVar == null) {
            if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            }
            return Long.bitCount(this.a);
        } else if (i >= 64) {
            return hmVar.e(i - 64) + Long.bitCount(this.a);
        } else {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
    }

    private final void b() {
        if (this.b == null) {
            this.b = new hm();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        b();
        return this.b.c(i - 64);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, boolean z) {
        if (i < 64) {
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            long j3 = (-1 ^ j2) & j;
            this.a = (j & j2) | (j3 + j3);
            if (!z) {
                b(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                b();
                this.b.a(0, z2);
                return;
            }
            return;
        }
        b();
        this.b.a(i - 64, z);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(int i) {
        if (i < 64) {
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.a = j3;
            long j4 = j - 1;
            this.a = Long.rotateRight((j4 ^ -1) & j3, 1) | (j3 & j4);
            hm hmVar = this.b;
            if (hmVar != null) {
                if (hmVar.c(0)) {
                    a(63);
                }
                this.b.d(0);
            }
            return z;
        }
        b();
        return this.b.d(i - 64);
    }

    public final void a() {
        this.a = 0;
        hm hmVar = this.b;
        if (hmVar != null) {
            hmVar.a();
        }
    }

    public final void a(int i) {
        if (i >= 64) {
            b();
            this.b.a(i - 64);
            return;
        }
        this.a |= 1 << i;
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
