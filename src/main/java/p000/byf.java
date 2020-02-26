package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: byf */
/* compiled from: PG */
public final class byf extends bxw {

    /* renamed from: a */
    private final bpo f5002a;

    public byf(bpo bpo) {
        this.f5002a = bpo;
    }

    /* renamed from: a */
    public final void mo2536a(Status status, bxu bxu) {
        if (!status.mo3189b()) {
            this.f5002a.mo2280a(new byc(status, null));
        } else {
            this.f5002a.mo2280a(new byc(Status.f6260a, bxu));
        }
    }
}
