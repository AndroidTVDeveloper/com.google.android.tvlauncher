package defpackage;

/* renamed from: kk  reason: default package */
/* compiled from: PG */
public final class kk {
    public int a = -1;
    public int b = 0;
    public int c = 0;
    public int d = 1;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;
    public int o;
    public int p;

    public final int a() {
        return this.g ? this.b - this.c : this.e;
    }

    public final void a(int i2) {
        if ((this.d & i2) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.d));
        }
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=" + ((Object) null) + ", mItemCount=" + this.e + ", mIsMeasuring=false, mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
