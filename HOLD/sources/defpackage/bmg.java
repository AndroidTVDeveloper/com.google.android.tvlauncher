package defpackage;

/* renamed from: bmg  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bmg implements Runnable {
    private final bmj a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public bmg(bmj bmj, int i, int i2, int i3, float f) {
        this.a = bmj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final void run() {
        bmj bmj = this.a;
        bmj.b.a(this.b, this.c, this.d, this.e);
    }
}
