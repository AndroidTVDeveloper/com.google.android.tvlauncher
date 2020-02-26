package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: btz */
/* compiled from: PG */
public final class btz implements bot {

    /* renamed from: a */
    private final /* synthetic */ bou f4834a;

    /* renamed from: b */
    private final /* synthetic */ bxe f4835b;

    public btz(bou bou, bxe bxe) {
        this.f4834a = bou;
        this.f4835b = bxe;
    }

    /* renamed from: a */
    public final void mo2248a(Status status) {
        if (status.mo3189b()) {
            this.f4834a.mo2251a(TimeUnit.MILLISECONDS);
            bxh bxh = this.f4835b.f4974a;
            synchronized (bxh.f4977a) {
                bxh.mo2517a();
                bxh.f4979c = true;
            }
            bxh.f4978b.mo2513a(bxh);
            return;
        }
        bxe bxe = this.f4835b;
        bol a = bsh.m4093a(status);
        bxh bxh2 = bxe.f4974a;
        buh.m4200a(a, "Exception must not be null");
        synchronized (bxh2.f4977a) {
            bxh2.mo2517a();
            bxh2.f4979c = true;
            bxh2.f4981e = a;
        }
        bxh2.f4978b.mo2513a(bxh2);
    }
}
