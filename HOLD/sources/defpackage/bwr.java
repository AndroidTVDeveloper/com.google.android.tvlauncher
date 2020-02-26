package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwr  reason: default package */
/* compiled from: PG */
public final class bwr extends buf {
    public static final Parcelable.Creator CREATOR = new bws();
    private final int a;
    private final bua b;

    public bwr(int i, bua bua) {
        this.a = i;
        this.b = bua;
    }

    public bwr(bua bua) {
        this(1, bua);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.a(parcel, 2, this.b, i);
        buj.b(parcel, a2);
    }
}
