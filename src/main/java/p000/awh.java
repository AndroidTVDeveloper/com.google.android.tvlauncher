package p000;

import java.io.IOException;

/* renamed from: awh */
/* compiled from: PG */
final class awh implements axh {

    /* renamed from: a */
    private axg f2551a;

    /* renamed from: b */
    private final /* synthetic */ awj f2552b;

    public awh(awj awj) {
        this.f2552b = awj;
        this.f2551a = awj.mo1464a((awt) null);
    }

    /* renamed from: d */
    private final void m2228d(awt awt) {
        if (awt == null) {
            awt = null;
        }
        if (!blm.m3652a(this.f2551a.f2609a, awt)) {
            this.f2551a = this.f2552b.f2538b.mo1516a(awt, 0);
        }
    }

    /* renamed from: a */
    public final void mo560a(awt awt, buk buk) {
        m2228d(awt);
        this.f2551a.mo1531b(buk);
    }

    /* renamed from: a */
    public final void mo558a(awt awt, buj buj, buk buk) {
        m2228d(awt);
        this.f2551a.mo1535c(buj, buk);
    }

    /* renamed from: b */
    public final void mo562b(awt awt, buj buj, buk buk) {
        m2228d(awt);
        this.f2551a.mo1530b(buj, buk);
    }

    /* renamed from: a */
    public final void mo559a(awt awt, buj buj, buk buk, IOException iOException, boolean z) {
        m2228d(awt);
        this.f2551a.mo1524a(buj, buk, iOException, z);
    }

    /* renamed from: c */
    public final void mo565c(awt awt, buj buj, buk buk) {
        m2228d(awt);
        this.f2551a.mo1523a(buj, buk);
    }

    /* renamed from: a */
    public final void mo557a(awt awt) {
        m2228d(awt);
        awt awt2 = (awt) bks.m3507a(this.f2551a.f2609a);
        this.f2551a.mo1517a();
    }

    /* renamed from: b */
    public final void mo561b(awt awt) {
        m2228d(awt);
        awt awt2 = (awt) bks.m3507a(this.f2551a.f2609a);
        this.f2551a.mo1526b();
    }

    /* renamed from: c */
    public final void mo564c(awt awt) {
        m2228d(awt);
        this.f2551a.mo1532c();
    }

    /* renamed from: b */
    public final void mo563b(awt awt, buk buk) {
        m2228d(awt);
        this.f2551a.mo1525a(buk);
    }
}
