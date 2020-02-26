package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvb  reason: default package */
/* compiled from: PG */
public final class bvb extends buf {
    public static final Parcelable.Creator CREATOR = new bvc();
    private final String a;
    private final boolean b;

    public bvb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.a);
        buj.a(parcel, 3, this.b);
        buj.b(parcel, a2);
    }
}
