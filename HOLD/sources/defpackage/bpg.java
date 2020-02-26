package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpg  reason: default package */
/* compiled from: PG */
public final class bpg extends bpd {
    private final bsb a;
    private final bxe b;

    public bpg(bsb bsb, bxe bxe) {
        this.b = bxe;
        this.a = bsb;
    }

    public final bnr[] a(bre bre) {
        return new bnr[]{bus.a};
    }

    public final void b(bre bre) {
    }

    public final void a(Status status) {
        this.b.a(bsh.a(status));
    }

    public final void a(Exception exc) {
        this.b.a(exc);
    }

    public final void c(bre bre) {
        try {
            ((bvh) ((bvf) bre.b).p()).a(this.a.a);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(bpi.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    public final void a(bqb bqb, boolean z) {
        bxe bxe = this.b;
        bqb.b.put(bxe, Boolean.valueOf(z));
        bxe.a.a(new bqa(bqb, bxe));
    }
}
