package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpe */
/* compiled from: PG */
abstract class bpe extends bpd {

    /* renamed from: a */
    public final bxe f4537a;

    public bpe(bxe bxe) {
        this.f4537a = bxe;
    }

    /* renamed from: a */
    public void mo2262a(bqb bqb, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo2266d(bre bre);

    /* renamed from: a */
    public final void mo2263a(Status status) {
        this.f4537a.mo2515a(new bol(status));
    }

    /* renamed from: a */
    public final void mo2264a(Exception exc) {
        this.f4537a.mo2515a(exc);
    }

    /* renamed from: c */
    public final void mo2265c(bre bre) {
        try {
            mo2266d(bre);
        } catch (DeadObjectException e) {
            mo2263a(bpi.m3900a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo2263a(bpi.m3900a(e2));
        } catch (RuntimeException e3) {
            mo2264a(e3);
        }
    }
}
