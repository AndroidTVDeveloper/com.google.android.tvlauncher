package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: awa */
/* compiled from: PG */
final class awa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new awb(parcel.readLong(), parcel.readLong(), (byte) 0);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new awb[i];
    }
}
