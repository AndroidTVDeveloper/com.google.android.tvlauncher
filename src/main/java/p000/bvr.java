package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvr */
/* compiled from: PG */
public final class bvr extends buf implements Comparable {
    public static final Parcelable.Creator CREATOR = new bvs();

    /* renamed from: a */
    private final int f4921a;

    /* renamed from: b */
    private final int f4922b;

    public final int hashCode() {
        return (this.f4921a * 31) + this.f4922b;
    }

    public bvr(int i, int i2) {
        this.f4921a = i;
        this.f4922b = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int compareTo(bvr bvr) {
        int i = this.f4921a;
        int i2 = bvr.f4921a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f4922b;
        int i4 = bvr.f4922b;
        if (i3 < i4) {
            return -1;
        }
        if (i3 <= i4) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bvr) || compareTo((bvr) obj) != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "GenericDimension" + "(" + this.f4921a + ", " + this.f4922b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4921a);
        buj.m4251b(parcel, 2, this.f4922b);
        buj.m4250b(parcel, a);
    }
}
