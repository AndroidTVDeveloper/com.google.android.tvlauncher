package defpackage;

import java.io.IOException;

/* renamed from: axb  reason: default package */
/* compiled from: PG */
final /* synthetic */ class axb implements Runnable {
    private final axg a;
    private final axh b;
    private final IOException c;
    private final boolean d;
    private final buj e;
    private final buk f;

    public axb(axg axg, axh axh, buj buj, buk buk, IOException iOException, boolean z, byte b2, byte b3) {
        this.a = axg;
        this.b = axh;
        this.e = buj;
        this.f = buk;
        this.c = iOException;
        this.d = z;
    }

    public final void run() {
        axg axg = this.a;
        this.b.a(axg.a, this.e, this.f, this.c, this.d);
    }
}
