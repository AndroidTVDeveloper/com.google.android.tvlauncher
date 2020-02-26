package p000;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpi */
/* compiled from: PG */
public abstract class bpi {
    /* renamed from: a */
    public abstract void mo2262a(bqb bqb, boolean z);

    /* renamed from: a */
    public abstract void mo2263a(Status status);

    /* renamed from: a */
    public abstract void mo2264a(Exception exc);

    /* renamed from: c */
    public abstract void mo2265c(bre bre);

    /* renamed from: a */
    public static Status m3900a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
