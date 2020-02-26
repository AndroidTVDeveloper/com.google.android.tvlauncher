package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvr  reason: default package */
/* compiled from: PG */
public final class bvr extends buf implements Comparable {
    public static final Parcelable.Creator CREATOR = new bvs();
    private final int a;
    private final int b;

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public bvr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int compareTo(bvr bvr) {
        int i = this.a;
        int i2 = bvr.a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.b;
        int i4 = bvr.b;
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
        return "GenericDimension" + "(" + this.a + ", " + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.b(parcel, 2, this.b);
        buj.b(parcel, a2);
    }
}
