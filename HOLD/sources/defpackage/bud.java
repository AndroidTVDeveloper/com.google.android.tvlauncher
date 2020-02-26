package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bud  reason: default package */
/* compiled from: PG */
public final class bud implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        IBinder iBinder = null;
        bno bno = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                iBinder = buh.g(parcel, readInt);
            } else if (a == 3) {
                bno = (bno) buh.a(parcel, readInt, bno.CREATOR);
            } else if (a == 4) {
                z = buh.c(parcel, readInt);
            } else if (a != 5) {
                buh.b(parcel, readInt);
            } else {
                z2 = buh.c(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new buc(i, iBinder, bno, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new buc[i];
    }
}
