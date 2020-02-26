package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bws */
/* compiled from: PG */
public final class bws implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        bua bua = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i = buh.m4217d(parcel, readInt);
            } else if (a != 2) {
                buh.m4210b(parcel, readInt);
            } else {
                bua = (bua) buh.m4198a(parcel, readInt, bua.CREATOR);
            }
        }
        buh.m4227n(parcel, b);
        return new bwr(i, bua);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bwr[i];
    }
}
