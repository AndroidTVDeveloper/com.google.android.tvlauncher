package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwr */
/* compiled from: PG */
public final class bwr extends buf {
    public static final Parcelable.Creator CREATOR = new bws();

    /* renamed from: a */
    private final int f4957a;

    /* renamed from: b */
    private final bua f4958b;

    public bwr(int i, bua bua) {
        this.f4957a = i;
        this.f4958b = bua;
    }

    public bwr(bua bua) {
        this(1, bua);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4957a);
        buj.m4238a(parcel, 2, this.f4958b, i);
        buj.m4250b(parcel, a);
    }
}
