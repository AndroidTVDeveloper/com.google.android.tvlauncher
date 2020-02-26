package defpackage;

/* renamed from: axa  reason: default package */
/* compiled from: PG */
final /* synthetic */ class axa implements Runnable {
    private final axg a;
    private final axh b;
    private final buj c;
    private final buk d;

    public axa(axg axg, axh axh, buj buj, buk buk, byte b2, byte b3) {
        this.a = axg;
        this.b = axh;
        this.c = buj;
        this.d = buk;
    }

    public final void run() {
        axg axg = this.a;
        this.b.a(axg.a, this.c, this.d);
    }
}
