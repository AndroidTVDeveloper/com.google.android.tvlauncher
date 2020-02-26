package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: bts  reason: default package */
/* compiled from: PG */
public final class bts extends aip implements btt {
    private bst a;
    private final int b;

    public bts(bst bst, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = bst;
        this.b = i;
    }

    private final void a(int i, IBinder iBinder, Bundle bundle) {
        buh.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }

    public bts() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) aiq.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) aiq.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            bsx bsx = (bsx) aiq.a(parcel, bsx.CREATOR);
            buh.a(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            buh.a(bsx);
            this.a.o = bsx;
            a(readInt, readStrongBinder, bsx.a);
        }
        parcel2.writeNoException();
        return true;
    }
}
