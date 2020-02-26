package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bxv  reason: default package */
/* compiled from: PG */
public final class bxv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (buh.a(readInt)) {
                case 2:
                    i = buh.d(parcel, readInt);
                    break;
                case 3:
                    z = buh.c(parcel, readInt);
                    break;
                case 4:
                    arrayList = buh.m(parcel, readInt);
                    break;
                case 5:
                    i2 = buh.d(parcel, readInt);
                    break;
                case 6:
                    str = buh.f(parcel, readInt);
                    break;
                case 7:
                    z2 = buh.c(parcel, readInt);
                    break;
                default:
                    buh.b(parcel, readInt);
                    break;
            }
        }
        buh.n(parcel, b);
        return new bxu(i, z, arrayList, i2, str, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bxu[i];
    }
}
