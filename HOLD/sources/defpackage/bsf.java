package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: bsf  reason: default package */
/* compiled from: PG */
public final class bsf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) buh.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                i2 = buh.d(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
