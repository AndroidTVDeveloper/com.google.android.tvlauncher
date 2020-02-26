package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bpa */
/* compiled from: PG */
public final class bpa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.m4209b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.m4195a(readInt);
            if (a == 1) {
                i2 = buh.m4217d(parcel, readInt);
            } else if (a == 2) {
                str = buh.m4219f(parcel, readInt);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) buh.m4198a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 1000) {
                buh.m4210b(parcel, readInt);
            } else {
                i = buh.m4217d(parcel, readInt);
            }
        }
        buh.m4227n(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
