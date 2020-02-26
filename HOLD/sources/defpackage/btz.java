package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: btz  reason: default package */
/* compiled from: PG */
public final class btz implements bot {
    private final /* synthetic */ bou a;
    private final /* synthetic */ bxe b;

    public btz(bou bou, bxe bxe) {
        this.a = bou;
        this.b = bxe;
    }

    public final void a(Status status) {
        if (status.b()) {
            this.a.a(TimeUnit.MILLISECONDS);
            bxh bxh = this.b.a;
            synchronized (bxh.a) {
                bxh.a();
                bxh.c = true;
            }
            bxh.b.a(bxh);
            return;
        }
        bxe bxe = this.b;
        bol a2 = bsh.a(status);
        bxh bxh2 = bxe.a;
        buh.a(a2, "Exception must not be null");
        synchronized (bxh2.a) {
            bxh2.a();
            bxh2.c = true;
            bxh2.e = a2;
        }
        bxh2.b.a(bxh2);
    }
}
