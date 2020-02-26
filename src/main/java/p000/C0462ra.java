package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ra */
/* compiled from: PG */
public final class C0462ra extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0460qz();

    /* renamed from: a */
    public final int f10234a;

    public C0462ra(Parcel parcel) {
        super(parcel);
        this.f10234a = parcel.readInt();
    }

    public C0462ra(Parcelable parcelable, int i) {
        super(parcelable);
        this.f10234a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10234a);
    }
}
