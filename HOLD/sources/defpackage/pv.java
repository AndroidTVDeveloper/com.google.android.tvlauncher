package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pv  reason: default package */
/* compiled from: PG */
public final class pv extends qk {
    public static final Parcelable.Creator CREATOR = new pu();
    public String a;

    public pv(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public pv(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
