package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rq  reason: default package */
/* compiled from: PG */
public final class rq extends qk {
    public static final Parcelable.Creator CREATOR = new rp();
    public int a;
    public int b;
    public int c;

    public rq(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public rq(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
