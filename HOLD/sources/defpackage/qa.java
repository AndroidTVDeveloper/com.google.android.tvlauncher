package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qa  reason: default package */
/* compiled from: PG */
public final class qa extends qk {
    public static final Parcelable.Creator CREATOR = new pz();
    public String a;

    public qa(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public qa(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
