package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bns */
/* compiled from: PG */
public final class bns implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                str = buh.m4219f(parcel, readInt);
            } else if (a == 2) {
                i = buh.m4217d(parcel, readInt);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                j = buh.m4218e(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bnr(str, i, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bnr[i];
    }
}
