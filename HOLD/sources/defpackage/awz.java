package defpackage;

/* renamed from: awz  reason: default package */
/* compiled from: PG */
final /* synthetic */ class awz implements Runnable {
    private final axg a;
    private final axh b;
    private final buj c;
    private final buk d;

    public awz(axg axg, axh axh, buj buj, buk buk, byte b2, byte b3) {
        this.a = axg;
        this.b = axh;
        this.c = buj;
        this.d = buk;
    }

    public final void run() {
        axg axg = this.a;
        this.b.b(axg.a, this.c, this.d);
    }
}
