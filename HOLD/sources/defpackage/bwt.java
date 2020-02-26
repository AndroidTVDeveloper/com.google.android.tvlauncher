package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bwt  reason: default package */
/* compiled from: PG */
public final class bwt extends buf {
    public static final Parcelable.Creator CREATOR = new bwu();
    public final bno a;
    public final buc b;
    private final int c;

    public bwt() {
        this(1, new bno(8, null), null);
    }

    public bwt(int i, bno bno, buc buc) {
        this.c = i;
        this.a = bno;
        this.b = buc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.c);
        buj.a(parcel, 2, this.a, i);
        buj.a(parcel, 3, this.b, i);
        buj.b(parcel, a2);
    }
}
