package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpe  reason: default package */
/* compiled from: PG */
abstract class bpe extends bpd {
    public final bxe a;

    public bpe(bxe bxe) {
        this.a = bxe;
    }

    public void a(bqb bqb, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void d(bre bre);

    public final void a(Status status) {
        this.a.a(new bol(status));
    }

    public final void a(Exception exc) {
        this.a.a(exc);
    }

    public final void c(bre bre) {
        try {
            d(bre);
        } catch (DeadObjectException e) {
            a(bpi.a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            a(bpi.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }
}
