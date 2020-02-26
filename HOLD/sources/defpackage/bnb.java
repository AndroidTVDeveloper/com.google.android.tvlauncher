package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnb  reason: default package */
/* compiled from: PG */
public final class bnb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                z = buh.c(parcel, readInt);
            } else if (a == 2) {
                j2 = buh.e(parcel, readInt);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                j = buh.e(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bna(z, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bna[i];
    }
}
