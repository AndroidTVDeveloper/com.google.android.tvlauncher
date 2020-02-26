package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bpn */
/* compiled from: PG */
public abstract class bpn extends BasePendingResult implements bpo {

    /* renamed from: a */
    public final bok f4549a;

    /* renamed from: b */
    public final bog f4550b;

    protected bpn(bok bok, bos bos) {
        super((bos) buh.m4200a(bos, "GoogleApiClient must not be null"));
        buh.m4200a(bok, "Api must not be null");
        this.f4550b = bok.mo2237a();
        this.f4549a = bok;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2179a(boi boi);

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2280a(Object obj) {
        throw null;
    }

    /* renamed from: b */
    public final void mo2281b(boi boi) {
        if (boi instanceof bue) {
            bue bue = (bue) boi;
            boi = null;
        }
        try {
            mo2179a(boi);
        } catch (DeadObjectException e) {
            m3907a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m3907a(e2);
        }
    }

    /* renamed from: a */
    private final void m3907a(RemoteException remoteException) {
        mo2282b(new Status(8, remoteException.getLocalizedMessage(), (byte) 0));
    }

    /* renamed from: b */
    public final void mo2282b(Status status) {
        buh.m4213b(!status.mo3189b(), "Failed result must not be success");
        mo3195a(mo2178a(status));
    }
}
