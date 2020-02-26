package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvs  reason: default package */
/* compiled from: PG */
public final class bvs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a != 2) {
                buh.b(parcel, readInt);
            } else {
                i2 = buh.d(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bvr(i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bvr[i];
    }
}
