package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bsx */
/* compiled from: PG */
public final class bsx extends buf {
    public static final Parcelable.Creator CREATOR = new bsy();

    /* renamed from: a */
    public Bundle f4777a;

    /* renamed from: b */
    public bnr[] f4778b;

    /* renamed from: c */
    private int f4779c;

    public bsx() {
    }

    public bsx(Bundle bundle, bnr[] bnrArr, int i) {
        this.f4777a = bundle;
        this.f4778b = bnrArr;
        this.f4779c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4236a(parcel, 1, this.f4777a);
        buj.m4244a(parcel, 2, this.f4778b, i);
        buj.m4251b(parcel, 3, this.f4779c);
        buj.m4250b(parcel, a);
    }
}
