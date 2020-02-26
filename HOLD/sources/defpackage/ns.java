package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ns  reason: default package */
/* compiled from: PG */
final class ns implements Parcelable {
    public static final Parcelable.Creator CREATOR = new nr();
    public int a;
    public Bundle b = Bundle.EMPTY;

    public final int describeContents() {
        return 0;
    }

    public ns() {
    }

    public ns(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readBundle(nt.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }
}
