package p000;

/* renamed from: hm */
/* compiled from: PG */
public final class C0204hm {

    /* renamed from: a */
    private long f9489a = 0;

    /* renamed from: b */
    private C0204hm f9490b;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5186b(int i) {
        if (i >= 64) {
            C0204hm hmVar = this.f9490b;
            if (hmVar != null) {
                hmVar.mo5186b(i - 64);
                return;
            }
            return;
        }
        this.f9489a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo5189e(int i) {
        C0204hm hmVar = this.f9490b;
        if (hmVar == null) {
            if (i < 64) {
                return Long.bitCount(this.f9489a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f9489a);
        } else if (i >= 64) {
            return hmVar.mo5189e(i - 64) + Long.bitCount(this.f9489a);
        } else {
            return Long.bitCount(this.f9489a & ((1 << i) - 1));
        }
    }

    /* renamed from: b */
    private final void m7517b() {
        if (this.f9490b == null) {
            this.f9490b = new C0204hm();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5187c(int i) {
        if (i < 64) {
            return (this.f9489a & (1 << i)) != 0;
        }
        m7517b();
        return this.f9490b.mo5187c(i - 64);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5185a(int i, boolean z) {
        if (i < 64) {
            long j = this.f9489a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            long j3 = (-1 ^ j2) & j;
            this.f9489a = (j & j2) | (j3 + j3);
            if (!z) {
                mo5186b(i);
            } else {
                mo5184a(i);
            }
            if (z2 || this.f9490b != null) {
                m7517b();
                this.f9490b.mo5185a(0, z2);
                return;
            }
            return;
        }
        m7517b();
        this.f9490b.mo5185a(i - 64, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5188d(int i) {
        if (i < 64) {
            long j = 1 << i;
            long j2 = this.f9489a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f9489a = j3;
            long j4 = j - 1;
            this.f9489a = Long.rotateRight((j4 ^ -1) & j3, 1) | (j3 & j4);
            C0204hm hmVar = this.f9490b;
            if (hmVar != null) {
                if (hmVar.mo5187c(0)) {
                    mo5184a(63);
                }
                this.f9490b.mo5188d(0);
            }
            return z;
        }
        m7517b();
        return this.f9490b.mo5188d(i - 64);
    }

    /* renamed from: a */
    public final void mo5183a() {
        this.f9489a = 0;
        C0204hm hmVar = this.f9490b;
        if (hmVar != null) {
            hmVar.mo5183a();
        }
    }

    /* renamed from: a */
    public final void mo5184a(int i) {
        if (i >= 64) {
            m7517b();
            this.f9490b.mo5184a(i - 64);
            return;
        }
        this.f9489a |= 1 << i;
    }

    public final String toString() {
        if (this.f9490b == null) {
            return Long.toBinaryString(this.f9489a);
        }
        return this.f9490b.toString() + "xx" + Long.toBinaryString(this.f9489a);
    }
}
