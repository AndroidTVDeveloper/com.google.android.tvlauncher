package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lg  reason: default package */
/* compiled from: PG */
public final class lg extends dh {
    public static final Parcelable.Creator CREATOR = new lf();
    public int c;
    public boolean d;

    public lg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    public lg(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
