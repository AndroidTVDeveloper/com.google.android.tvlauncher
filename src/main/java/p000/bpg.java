package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpg */
/* compiled from: PG */
public final class bpg extends bpd {

    /* renamed from: a */
    private final bsb f4539a;

    /* renamed from: b */
    private final bxe f4540b;

    public bpg(bsb bsb, bxe bxe) {
        this.f4540b = bxe;
        this.f4539a = bsb;
    }

    /* renamed from: a */
    public final bnr[] mo2260a(bre bre) {
        return new bnr[]{bus.f4858a};
    }

    /* renamed from: b */
    public final void mo2261b(bre bre) {
    }

    /* renamed from: a */
    public final void mo2263a(Status status) {
        this.f4540b.mo2515a(bsh.m4093a(status));
    }

    /* renamed from: a */
    public final void mo2264a(Exception exc) {
        this.f4540b.mo2515a(exc);
    }

    /* renamed from: c */
    public final void mo2265c(bre bre) {
        try {
            ((bvh) ((bvf) bre.f4665b).mo2400p()).mo2470a(this.f4539a.f4720a);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo2263a(bpi.m3900a(e2));
        } catch (RuntimeException e3) {
            mo2264a(e3);
        }
    }

    /* renamed from: a */
    public final void mo2262a(bqb bqb, boolean z) {
        bxe bxe = this.f4540b;
        bqb.f4573b.put(bxe, Boolean.valueOf(z));
        bxe.f4974a.mo2511a(new bqa(bqb, bxe));
    }
}
