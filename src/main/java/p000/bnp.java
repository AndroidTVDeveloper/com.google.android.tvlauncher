package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnp */
/* compiled from: PG */
public final class bnp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i = buh.m4217d(parcel, readInt);
            } else if (a == 2) {
                i2 = buh.m4217d(parcel, readInt);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) buh.m4198a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 4) {
                buh.m4210b(parcel, readInt);
            } else {
                str = buh.m4219f(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new bno(i, i2, pendingIntent, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bno[i];
    }
}
