package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ru */
/* compiled from: PG */
public final class C0482ru extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0481rt();

    /* renamed from: a */
    public boolean f10282a;

    public C0482ru(Parcel parcel) {
        super(parcel);
        this.f10282a = parcel.readInt() != 1 ? false : true;
    }

    public C0482ru(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10282a ? 1 : 0);
    }
}
