package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bns  reason: default package */
/* compiled from: PG */
public final class bns implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                str = buh.f(parcel, readInt);
            } else if (a == 2) {
                i = buh.d(parcel, readInt);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                j = buh.e(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bnr(str, i, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bnr[i];
    }
}
