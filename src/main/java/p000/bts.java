package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: bts */
/* compiled from: PG */
public final class bts extends aip implements btt {

    /* renamed from: a */
    private bst f4826a;

    /* renamed from: b */
    private final int f4827b;

    public bts(bst bst, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f4826a = bst;
        this.f4827b = i;
    }

    /* renamed from: a */
    private final void m4177a(int i, IBinder iBinder, Bundle bundle) {
        buh.m4200a(this.f4826a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f4826a.mo2384a(i, iBinder, bundle, this.f4827b);
        this.f4826a = null;
    }

    public bts() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo326a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            m4177a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) aiq.m585a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) aiq.m585a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            bsx bsx = (bsx) aiq.m585a(parcel, bsx.CREATOR);
            buh.m4200a(this.f4826a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            buh.m4199a(bsx);
            this.f4826a.f4754o = bsx;
            m4177a(readInt, readStrongBinder, bsx.f4777a);
        }
        parcel2.writeNoException();
        return true;
    }
}
