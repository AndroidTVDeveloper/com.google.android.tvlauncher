package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwu  reason: default package */
/* compiled from: PG */
public final class bwu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        bno bno = null;
        int i = 0;
        buc buc = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                bno = (bno) buh.a(parcel, readInt, bno.CREATOR);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                buc = (buc) buh.a(parcel, readInt, buc.CREATOR);
            }
        }
        buh.n(parcel, b);
        return new bwt(i, bno, buc);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bwt[i];
    }
}
