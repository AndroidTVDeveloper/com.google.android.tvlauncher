package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: avg  reason: default package */
/* compiled from: PG */
public final class avg extends avc {
    public static final Parcelable.Creator CREATOR = new avf();
    public final int a;
    public final int b;
    public final int[] d;
    public final int[] e;
    private final int f;

    public final int describeContents() {
        return 0;
    }

    public avg(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f = i;
        this.a = i2;
        this.b = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public avg(Parcel parcel) {
        super("MLLT");
        this.f = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = (int[]) blm.a(parcel.createIntArray());
        this.e = (int[]) blm.a(parcel.createIntArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avg avg = (avg) obj;
        return this.f == avg.f && this.a == avg.a && this.b == avg.b && Arrays.equals(this.d, avg.d) && Arrays.equals(this.e, avg.e);
    }

    public final int hashCode() {
        return ((((((((this.f + 527) * 31) + this.a) * 31) + this.b) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }
}
