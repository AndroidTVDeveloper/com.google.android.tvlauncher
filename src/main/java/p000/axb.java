package p000;

import java.io.IOException;

/* renamed from: axb */
/* compiled from: PG */
final /* synthetic */ class axb implements Runnable {

    /* renamed from: a */
    private final axg f2593a;

    /* renamed from: b */
    private final axh f2594b;

    /* renamed from: c */
    private final IOException f2595c;

    /* renamed from: d */
    private final boolean f2596d;

    /* renamed from: e */
    private final buj f2597e;

    /* renamed from: f */
    private final buk f2598f;

    public axb(axg axg, axh axh, buj buj, buk buk, IOException iOException, boolean z, byte b, byte b2) {
        this.f2593a = axg;
        this.f2594b = axh;
        this.f2597e = buj;
        this.f2598f = buk;
        this.f2595c = iOException;
        this.f2596d = z;
    }

    public final void run() {
        axg axg = this.f2593a;
        this.f2594b.mo559a(axg.f2609a, this.f2597e, this.f2598f, this.f2595c, this.f2596d);
    }
}
