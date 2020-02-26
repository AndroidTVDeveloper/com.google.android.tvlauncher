package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvc */
/* compiled from: PG */
public final class bvc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 2) {
                str = buh.m4219f(parcel, readInt);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                z = buh.m4216c(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bvb(str, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bvb[i];
    }
}
