package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvb */
/* compiled from: PG */
public final class bvb extends buf {
    public static final Parcelable.Creator CREATOR = new bvc();

    /* renamed from: a */
    private final String f4897a;

    /* renamed from: b */
    private final boolean f4898b;

    public bvb(String str, boolean z) {
        this.f4897a = str;
        this.f4898b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 2, this.f4897a);
        buj.m4241a(parcel, 3, this.f4898b);
        buj.m4250b(parcel, a);
    }
}
