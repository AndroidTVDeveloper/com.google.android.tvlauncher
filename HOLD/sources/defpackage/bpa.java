package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bpa  reason: default package */
/* compiled from: PG */
public final class bpa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i2 = buh.d(parcel, readInt);
            } else if (a == 2) {
                str = buh.f(parcel, readInt);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) buh.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 1000) {
                buh.b(parcel, readInt);
            } else {
                i = buh.d(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
