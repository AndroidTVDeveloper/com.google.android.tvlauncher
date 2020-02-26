package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ra  reason: default package */
/* compiled from: PG */
public final class ra extends qk {
    public static final Parcelable.Creator CREATOR = new qz();
    public final int a;

    public ra(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public ra(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
