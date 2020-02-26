package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvd */
/* compiled from: PG */
public final class bvd extends buf {
    public static final Parcelable.Creator CREATOR = new bve();

    /* renamed from: a */
    private int f4899a;

    /* renamed from: b */
    private int f4900b;

    public bvd() {
        this(3, 0);
    }

    public bvd(int i, int i2) {
        this.f4899a = i;
        this.f4900b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 2, this.f4899a);
        buj.m4251b(parcel, 3, this.f4900b);
        buj.m4250b(parcel, a);
    }
}
