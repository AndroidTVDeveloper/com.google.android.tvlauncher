package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bxv */
/* compiled from: PG */
public final class bxv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.m4195a(readInt)) {
                case 2:
                    i = buh.m4217d(parcel, readInt);
                    break;
                case 3:
                    z = buh.m4216c(parcel, readInt);
                    break;
                case 4:
                    arrayList = buh.m4226m(parcel, readInt);
                    break;
                case 5:
                    i2 = buh.m4217d(parcel, readInt);
                    break;
                case 6:
                    str = buh.m4219f(parcel, readInt);
                    break;
                case 7:
                    z2 = buh.m4216c(parcel, readInt);
                    break;
                default:
                    buh.m4210b(parcel, readInt);
                    break;
            }
        }
        buh.m4227n(parcel, b);
        return new bxu(i, z, arrayList, i2, str, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bxu[i];
    }
}
