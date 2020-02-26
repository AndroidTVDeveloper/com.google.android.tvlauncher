package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: bpf */
/* compiled from: PG */
public final class bpf extends bpi {

    /* renamed from: a */
    private final bpn f4538a;

    public bpf(bpn bpn) {
        this.f4538a = bpn;
    }

    /* renamed from: a */
    public final void mo2263a(Status status) {
        this.f4538a.mo2282b(status);
    }

    /* renamed from: a */
    public final void mo2264a(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f4538a.mo2282b(new Status(10, sb.toString()));
    }

    /* renamed from: c */
    public final void mo2265c(bre bre) {
        try {
            this.f4538a.mo2281b(bre.f4665b);
        } catch (RuntimeException e) {
            mo2264a(e);
        }
    }

    /* renamed from: a */
    public final void mo2262a(bqb bqb, boolean z) {
        bpn bpn = this.f4538a;
        bqb.f4572a.put(bpn, Boolean.valueOf(z));
        bpn.mo2249a((bot) new bpz(bqb, bpn));
    }
}
