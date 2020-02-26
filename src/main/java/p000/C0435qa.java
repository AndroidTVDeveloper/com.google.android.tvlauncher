package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qa */
/* compiled from: PG */
public final class C0435qa extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0433pz();

    /* renamed from: a */
    public String f10195a;

    public C0435qa(Parcel parcel) {
        super(parcel);
        this.f10195a = parcel.readString();
    }

    public C0435qa(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f10195a);
    }
}
