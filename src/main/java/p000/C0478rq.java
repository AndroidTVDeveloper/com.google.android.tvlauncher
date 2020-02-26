package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rq */
/* compiled from: PG */
public final class C0478rq extends C0445qk {
    public static final Parcelable.Creator CREATOR = new C0477rp();

    /* renamed from: a */
    public int f10277a;

    /* renamed from: b */
    public int f10278b;

    /* renamed from: c */
    public int f10279c;

    public C0478rq(Parcel parcel) {
        super(parcel);
        this.f10277a = parcel.readInt();
        this.f10278b = parcel.readInt();
        this.f10279c = parcel.readInt();
    }

    public C0478rq(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10277a);
        parcel.writeInt(this.f10278b);
        parcel.writeInt(this.f10279c);
    }
}
