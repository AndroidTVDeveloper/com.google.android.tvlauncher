package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwu */
/* compiled from: PG */
public final class bwu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        bno bno = null;
        int i = 0;
        buc buc = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i = buh.m4217d(parcel, readInt);
            } else if (a == 2) {
                bno = (bno) buh.m4198a(parcel, readInt, bno.CREATOR);
            } else if (a != 3) {
                buh.m4210b(parcel, readInt);
            } else {
                buc = (buc) buh.m4198a(parcel, readInt, buc.CREATOR);
            }
        }
        buh.m4227n(parcel, b);
        return new bwt(i, bno, buc);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bwt[i];
    }
}
