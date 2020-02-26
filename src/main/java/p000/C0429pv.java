package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pv */
/* compiled from: PG */
public final class C0429pv extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0428pu();

    /* renamed from: a */
    public String f10190a;

    public C0429pv(Parcel parcel) {
        super(parcel);
        this.f10190a = parcel.readString();
    }

    public C0429pv(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f10190a);
    }
}
