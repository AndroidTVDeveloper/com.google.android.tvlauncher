package defpackage;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: bpi  reason: default package */
/* compiled from: PG */
public abstract class bpi {
    public abstract void a(bqb bqb, boolean z);

    public abstract void a(Status status);

    public abstract void a(Exception exc);

    public abstract void c(bre bre);

    public static Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
