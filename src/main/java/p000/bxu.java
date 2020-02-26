package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bxu */
/* compiled from: PG */
public final class bxu extends buf {
    public static final Parcelable.Creator CREATOR = new bxv();

    /* renamed from: a */
    public final int f4993a;

    /* renamed from: b */
    private final boolean f4994b;

    /* renamed from: c */
    private final List f4995c;

    /* renamed from: d */
    private final int f4996d;

    /* renamed from: e */
    private final String f4997e;

    /* renamed from: f */
    private final boolean f4998f;

    public bxu(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.f4995c = arrayList;
        this.f4993a = i;
        this.f4994b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f4996d = i2;
        this.f4997e = str;
        this.f4998f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 2, this.f4993a);
        buj.m4241a(parcel, 3, this.f4994b);
        buj.m4240a(parcel, 4, this.f4995c);
        buj.m4251b(parcel, 5, this.f4996d);
        buj.m4239a(parcel, 6, this.f4997e);
        buj.m4241a(parcel, 7, this.f4998f);
        buj.m4250b(parcel, a);
    }
}
