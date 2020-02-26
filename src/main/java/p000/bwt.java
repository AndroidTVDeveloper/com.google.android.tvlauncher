package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwt */
/* compiled from: PG */
public final class bwt extends buf {
    public static final Parcelable.Creator CREATOR = new bwu();

    /* renamed from: a */
    public final bno f4959a;

    /* renamed from: b */
    public final buc f4960b;

    /* renamed from: c */
    private final int f4961c;

    public bwt() {
        this(1, new bno(8, null), null);
    }

    public bwt(int i, bno bno, buc buc) {
        this.f4961c = i;
        this.f4959a = bno;
        this.f4960b = buc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4961c);
        buj.m4238a(parcel, 2, this.f4959a, i);
        buj.m4238a(parcel, 3, this.f4960b, i);
        buj.m4250b(parcel, a);
    }
}
