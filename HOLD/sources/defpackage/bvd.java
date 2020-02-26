package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvd  reason: default package */
/* compiled from: PG */
public final class bvd extends buf {
    public static final Parcelable.Creator CREATOR = new bve();
    private int a;
    private int b;

    public bvd() {
        this(3, 0);
    }

    public bvd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 2, this.a);
        buj.b(parcel, 3, this.b);
        buj.b(parcel, a2);
    }
}
