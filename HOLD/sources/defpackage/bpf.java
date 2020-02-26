package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bpf  reason: default package */
/* compiled from: PG */
public final class bpf extends bpi {
    private final bpn a;

    public bpf(bpn bpn) {
        this.a = bpn;
    }

    public final void a(Status status) {
        this.a.b(status);
    }

    public final void a(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.b(new Status(10, sb.toString()));
    }

    public final void c(bre bre) {
        try {
            this.a.b(bre.b);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public final void a(bqb bqb, boolean z) {
        bpn bpn = this.a;
        bqb.a.put(bpn, Boolean.valueOf(z));
        bpn.a((bot) new bpz(bqb, bpn));
    }
}
