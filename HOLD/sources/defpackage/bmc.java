package defpackage;

/* renamed from: bmc  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bmc implements Runnable {
    private final bmj a;
    private final ani b;

    public bmc(bmj bmj, ani ani) {
        this.a = bmj;
        this.b = ani;
    }

    public final void run() {
        bmj bmj = this.a;
        bmj.b.a(this.b);
    }
}
