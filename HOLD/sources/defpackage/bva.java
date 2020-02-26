package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: bva  reason: default package */
/* compiled from: PG */
public final class bva implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) buh.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a == 3) {
                str = buh.f(parcel, readInt);
            } else if (a != 4) {
                buh.b(parcel, readInt);
            } else {
                str2 = buh.f(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new buz(parcelFileDescriptor, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new buz[i];
    }
}
