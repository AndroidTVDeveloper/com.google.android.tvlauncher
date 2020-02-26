package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bxu  reason: default package */
/* compiled from: PG */
public final class bxu extends buf {
    public static final Parcelable.Creator CREATOR = new bxv();
    public final int a;
    private final boolean b;
    private final List c;
    private final int d;
    private final String e;
    private final boolean f;

    public bxu(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 2, this.a);
        buj.a(parcel, 3, this.b);
        buj.a(parcel, 4, this.c);
        buj.b(parcel, 5, this.d);
        buj.a(parcel, 6, this.e);
        buj.a(parcel, 7, this.f);
        buj.b(parcel, a2);
    }
}
