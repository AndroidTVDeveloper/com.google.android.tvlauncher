package p000;

/* renamed from: bmg */
/* compiled from: PG */
final /* synthetic */ class bmg implements Runnable {

    /* renamed from: a */
    private final bmj f4401a;

    /* renamed from: b */
    private final int f4402b;

    /* renamed from: c */
    private final int f4403c;

    /* renamed from: d */
    private final int f4404d;

    /* renamed from: e */
    private final float f4405e;

    public bmg(bmj bmj, int i, int i2, int i3, float f) {
        this.f4401a = bmj;
        this.f4402b = i;
        this.f4403c = i2;
        this.f4404d = i3;
        this.f4405e = f;
    }

    public final void run() {
        bmj bmj = this.f4401a;
        bmj.f4411b.mo495a(this.f4402b, this.f4403c, this.f4404d, this.f4405e);
    }
}
