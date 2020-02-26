package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bge  reason: default package */
/* compiled from: PG */
public final class bge implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bgd();
    public final int a;
    public final int[] b;
    public final int c;
    public final int d;

    public final int describeContents() {
        return 0;
    }

    public bge(int i, int... iArr) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        this.c = 2;
        this.d = 0;
        Arrays.sort(copyOf);
    }

    public bge(Parcel parcel) {
        this.a = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.b = iArr;
        parcel.readIntArray(iArr);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bge bge = (bge) obj;
        return this.a == bge.a && Arrays.equals(this.b, bge.b) && this.c == bge.c && this.d == bge.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeIntArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
