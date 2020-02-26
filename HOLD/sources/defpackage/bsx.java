package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bsx  reason: default package */
/* compiled from: PG */
public final class bsx extends buf {
    public static final Parcelable.Creator CREATOR = new bsy();
    public Bundle a;
    public bnr[] b;
    private int c;

    public bsx() {
    }

    public bsx(Bundle bundle, bnr[] bnrArr, int i) {
        this.a = bundle;
        this.b = bnrArr;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 1, this.a);
        buj.a(parcel, 2, this.b, i);
        buj.b(parcel, 3, this.c);
        buj.b(parcel, a2);
    }
}
