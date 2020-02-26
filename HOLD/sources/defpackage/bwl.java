package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwl  reason: default package */
/* compiled from: PG */
public final class bwl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                i2 = buh.d(parcel, readInt);
            } else if (a != 3) {
                buh.b(parcel, readInt);
            } else {
                intent = (Intent) buh.a(parcel, readInt, Intent.CREATOR);
            }
        }
        buh.n(parcel, b);
        return new bwk(i, i2, intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bwk[i];
    }
}
