package defpackage;

import java.io.IOException;

/* renamed from: awh  reason: default package */
/* compiled from: PG */
final class awh implements axh {
    private axg a;
    private final /* synthetic */ awj b;

    public awh(awj awj) {
        this.b = awj;
        this.a = awj.a((awt) null);
    }

    private final void d(awt awt) {
        if (awt == null) {
            awt = null;
        }
        if (!blm.a(this.a.a, awt)) {
            this.a = this.b.b.a(awt, 0);
        }
    }

    public final void a(awt awt, buk buk) {
        d(awt);
        this.a.b(buk);
    }

    public final void a(awt awt, buj buj, buk buk) {
        d(awt);
        this.a.c(buj, buk);
    }

    public final void b(awt awt, buj buj, buk buk) {
        d(awt);
        this.a.b(buj, buk);
    }

    public final void a(awt awt, buj buj, buk buk, IOException iOException, boolean z) {
        d(awt);
        this.a.a(buj, buk, iOException, z);
    }

    public final void c(awt awt, buj buj, buk buk) {
        d(awt);
        this.a.a(buj, buk);
    }

    public final void a(awt awt) {
        d(awt);
        awt awt2 = (awt) bks.a(this.a.a);
        this.a.a();
    }

    public final void b(awt awt) {
        d(awt);
        awt awt2 = (awt) bks.a(this.a.a);
        this.a.b();
    }

    public final void c(awt awt) {
        d(awt);
        this.a.c();
    }

    public final void b(awt awt, buk buk) {
        d(awt);
        this.a.a(buk);
    }
}
