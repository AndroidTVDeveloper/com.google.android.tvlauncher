package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bxl  reason: default package */
/* compiled from: PG */
public final class bxl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                arrayList = buh.c(parcel, readInt, bxj.CREATOR);
            } else if (a != 2) {
                buh.b(parcel, readInt);
            } else {
                z = buh.c(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bxk(arrayList, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bxk[i];
    }
}
