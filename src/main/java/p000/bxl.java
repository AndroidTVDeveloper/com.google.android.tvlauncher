package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bxl */
/* compiled from: PG */
public final class bxl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                arrayList = buh.m4215c(parcel, readInt, bxj.CREATOR);
            } else if (a != 2) {
                buh.m4210b(parcel, readInt);
            } else {
                z = buh.m4216c(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bxk(arrayList, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bxk[i];
    }
}
