package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bge */
/* compiled from: PG */
public final class bge implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bgd();

    /* renamed from: a */
    public final int f3785a;

    /* renamed from: b */
    public final int[] f3786b;

    /* renamed from: c */
    public final int f3787c;

    /* renamed from: d */
    public final int f3788d;

    public final int describeContents() {
        return 0;
    }

    public bge(int i, int... iArr) {
        this.f3785a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f3786b = copyOf;
        this.f3787c = 2;
        this.f3788d = 0;
        Arrays.sort(copyOf);
    }

    public bge(Parcel parcel) {
        this.f3785a = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.f3786b = iArr;
        parcel.readIntArray(iArr);
        this.f3787c = parcel.readInt();
        this.f3788d = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bge bge = (bge) obj;
        return this.f3785a == bge.f3785a && Arrays.equals(this.f3786b, bge.f3786b) && this.f3787c == bge.f3787c && this.f3788d == bge.f3788d;
    }

    public final int hashCode() {
        return (((((this.f3785a * 31) + Arrays.hashCode(this.f3786b)) * 31) + this.f3787c) * 31) + this.f3788d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3785a);
        parcel.writeInt(this.f3786b.length);
        parcel.writeIntArray(this.f3786b);
        parcel.writeInt(this.f3787c);
        parcel.writeInt(this.f3788d);
    }
}
