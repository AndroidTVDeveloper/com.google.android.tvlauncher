package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dh  reason: default package */
/* compiled from: PG */
public class dh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dg();
    public static final dh a = new df();
    public final Parcelable b;

    public final int describeContents() {
        return 0;
    }

    private dh() {
        this.b = null;
    }

    protected dh(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.b = readParcelable == null ? a : readParcelable;
    }

    protected dh(Parcelable parcelable) {
        if (parcelable != null) {
            this.b = parcelable == a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public /* synthetic */ dh(byte b2) {
        this.b = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
