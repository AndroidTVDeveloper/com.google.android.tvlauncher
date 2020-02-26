package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnb */
/* compiled from: PG */
public final class bnb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                z = buh.m4216c(parcel, readInt);
            } else if (a == 2) {
                j2 = buh.m4218e(parcel, readInt);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                j = buh.m4218e(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bna(z, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bna[i];
    }
}
