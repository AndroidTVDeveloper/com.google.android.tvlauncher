package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bsy */
/* compiled from: PG */
public final class bsy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        Bundle bundle = null;
        bnr[] bnrArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                bundle = buh.m4221h(parcel, readInt);
            } else if (a == 2) {
                bnrArr = (bnr[]) buh.m4214b(parcel, readInt, bnr.CREATOR);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                i = buh.m4217d(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bsx(bundle, bnrArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bsx[i];
    }
}
