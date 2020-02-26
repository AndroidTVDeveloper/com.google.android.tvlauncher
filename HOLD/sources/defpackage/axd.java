package defpackage;

/* renamed from: axd  reason: default package */
/* compiled from: PG */
final /* synthetic */ class axd implements Runnable {
    private final axh a;
    private final awt b;
    private final buk c;

    public axd(axh axh, awt awt, buk buk, byte b2, byte b3) {
        this.a = axh;
        this.b = awt;
        this.c = buk;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
