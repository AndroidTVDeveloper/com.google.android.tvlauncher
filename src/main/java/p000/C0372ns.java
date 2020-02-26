package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ns */
/* compiled from: PG */
final class C0372ns implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0371nr();

    /* renamed from: a */
    public int f10016a;

    /* renamed from: b */
    public Bundle f10017b = Bundle.EMPTY;

    public final int describeContents() {
        return 0;
    }

    public C0372ns() {
    }

    public C0372ns(Parcel parcel) {
        this.f10016a = parcel.readInt();
        this.f10017b = parcel.readBundle(C0373nt.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10016a);
        parcel.writeBundle(this.f10017b);
    }
}
