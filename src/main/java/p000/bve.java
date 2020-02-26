package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bve */
/* compiled from: PG */
public final class bve implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 2) {
                i = buh.m4217d(parcel, readInt);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                i2 = buh.m4217d(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bvd(i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bvd[i];
    }
}
