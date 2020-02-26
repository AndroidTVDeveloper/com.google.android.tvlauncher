package defpackage;

/* renamed from: axe  reason: default package */
/* compiled from: PG */
final /* synthetic */ class axe implements Runnable {
    private final axg a;
    private final axh b;
    private final buk c;

    public axe(axg axg, axh axh, buk buk, byte b2, byte b3) {
        this.a = axg;
        this.b = axh;
        this.c = buk;
    }

    public final void run() {
        axg axg = this.a;
        this.b.a(axg.a, this.c);
    }
}
