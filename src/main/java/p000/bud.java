package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bud */
/* compiled from: PG */
public final class bud implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        IBinder iBinder = null;
        bno bno = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i = buh.m4217d(parcel, readInt);
            } else if (a == 2) {
                iBinder = buh.m4220g(parcel, readInt);
            } else if (a == 3) {
                bno = (bno) buh.m4198a(parcel, readInt, bno.CREATOR);
            } else if (a == 4) {
                z = buh.m4216c(parcel, readInt);
            } else if (a != 5) {
                buh.m4210b(parcel, readInt);
            } else {
                z2 = buh.m4216c(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new buc(i, iBinder, bno, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new buc[i];
    }
}
