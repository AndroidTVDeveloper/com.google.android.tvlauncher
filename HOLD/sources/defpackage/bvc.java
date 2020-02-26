package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvc  reason: default package */
/* compiled from: PG */
public final class bvc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 2) {
                str = buh.f(parcel, readInt);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                z = buh.c(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bvb(str, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bvb[i];
    }
}
