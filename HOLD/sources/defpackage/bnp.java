package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnp  reason: default package */
/* compiled from: PG */
public final class bnp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buh.b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = buh.a(readInt);
            if (a == 1) {
                i = buh.d(parcel, readInt);
            } else if (a == 2) {
                i2 = buh.d(parcel, readInt);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) buh.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 4) {
                buh.b(parcel, readInt);
            } else {
                str = buh.f(parcel, readInt);
            }
        }
        buh.n(parcel, b);
        return new bno(i, i2, pendingIntent, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bno[i];
    }
}
