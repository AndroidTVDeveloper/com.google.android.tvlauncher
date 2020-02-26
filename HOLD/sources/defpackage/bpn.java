package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bpn  reason: default package */
/* compiled from: PG */
public abstract class bpn extends BasePendingResult implements bpo {
    public final bok a;
    public final bog b;

    protected bpn(bok bok, bos bos) {
        super((bos) buh.a(bos, "GoogleApiClient must not be null"));
        buh.a(bok, "Api must not be null");
        this.b = bok.a();
        this.a = bok;
    }

    /* access modifiers changed from: protected */
    public abstract void a(boi boi);

    public /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public final void b(boi boi) {
        if (boi instanceof bue) {
            bue bue = (bue) boi;
            boi = null;
        }
        try {
            a(boi);
        } catch (DeadObjectException e) {
            a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    private final void a(RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), (byte) 0));
    }

    public final void b(Status status) {
        buh.b(!status.b(), "Failed result must not be success");
        a(a(status));
    }
}
