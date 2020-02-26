package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: byf  reason: default package */
/* compiled from: PG */
public final class byf extends bxw {
    private final bpo a;

    public byf(bpo bpo) {
        this.a = bpo;
    }

    public final void a(Status status, bxu bxu) {
        if (!status.b()) {
            this.a.a(new byc(status, null));
        } else {
            this.a.a(new byc(Status.a, bxu));
        }
    }
}
