package p000;

/* renamed from: kk */
/* compiled from: PG */
public final class C0283kk {

    /* renamed from: a */
    public int f9759a = -1;

    /* renamed from: b */
    public int f9760b = 0;

    /* renamed from: c */
    public int f9761c = 0;

    /* renamed from: d */
    public int f9762d = 1;

    /* renamed from: e */
    public int f9763e = 0;

    /* renamed from: f */
    public boolean f9764f = false;

    /* renamed from: g */
    public boolean f9765g = false;

    /* renamed from: h */
    public boolean f9766h = false;

    /* renamed from: i */
    public boolean f9767i = false;

    /* renamed from: j */
    public boolean f9768j = false;

    /* renamed from: k */
    public boolean f9769k = false;

    /* renamed from: l */
    public int f9770l;

    /* renamed from: m */
    public long f9771m;

    /* renamed from: n */
    public int f9772n;

    /* renamed from: o */
    public int f9773o;

    /* renamed from: p */
    public int f9774p;

    /* renamed from: a */
    public final int mo5420a() {
        return this.f9765g ? this.f9760b - this.f9761c : this.f9763e;
    }

    /* renamed from: a */
    public final void mo5421a(int i) {
        if ((this.f9762d & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f9762d));
        }
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f9759a + ", mData=" + ((Object) null) + ", mItemCount=" + this.f9763e + ", mIsMeasuring=false, mPreviousLayoutItemCount=" + this.f9760b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9761c + ", mStructureChanged=" + this.f9764f + ", mInPreLayout=" + this.f9765g + ", mRunSimpleAnimations=" + this.f9768j + ", mRunPredictiveAnimations=" + this.f9769k + '}';
    }
}
