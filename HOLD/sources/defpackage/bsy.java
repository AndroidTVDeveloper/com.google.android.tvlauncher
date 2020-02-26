package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bsy  reason: default package */
/* compiled from: PG */
public final class bsy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        Bundle bundle = null;
        bnr[] bnrArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                bundle = buh.h(parcel, readInt);
            } else if (a == 2) {
                bnrArr = (bnr[]) buh.b(parcel, readInt, bnr.CREATOR);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                i = buh.d(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bsx(bundle, bnrArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bsx[i];
    }
}
