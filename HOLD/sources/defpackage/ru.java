package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ru  reason: default package */
/* compiled from: PG */
public final class ru extends qk {
    public static final Parcelable.Creator CREATOR = new rt();
    public boolean a;

    public ru(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() != 1 ? false : true;
    }

    public ru(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
