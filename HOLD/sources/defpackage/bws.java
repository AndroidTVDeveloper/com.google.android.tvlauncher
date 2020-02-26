package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bws  reason: default package */
/* compiled from: PG */
public final class bws implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        bua bua = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a != 2) {
                buh.b(parcel, readInt);
            } else {
                bua = (bua) buh.a(parcel, readInt, bua.CREATOR);
            }
        }
        buh.n(parcel, b);
        return new bwr(i, bua);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bwr[i];
    }
}
