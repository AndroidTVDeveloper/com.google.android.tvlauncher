package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aip  reason: default package */
/* compiled from: PG */
public class aip extends Binder implements IInterface {
    protected aip(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return a(i, parcel, parcel2);
    }
}
