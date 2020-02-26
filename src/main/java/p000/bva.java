package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: bva */
/* compiled from: PG */
public final class bva implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) buh.m4198a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a == 3) {
                str = buh.m4219f(parcel, readInt);
            } else if (a != 4) {
                buh.m4210b(parcel, readInt);
            } else {
                str2 = buh.m4219f(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new buz(parcelFileDescriptor, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new buz[i];
    }
}
