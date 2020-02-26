package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ayc */
/* compiled from: PG */
public final class ayc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayb();

    /* renamed from: a */
    public final int f2747a;

    /* renamed from: b */
    private final akh[] f2748b;

    /* renamed from: c */
    private int f2749c;

    public final int describeContents() {
        return 0;
    }

    public ayc(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f2747a = readInt;
        this.f2748b = new akh[readInt];
        for (int i = 0; i < this.f2747a; i++) {
            this.f2748b[i] = (akh) parcel.readParcelable(akh.class.getClassLoader());
        }
    }

    public ayc(akh... akhArr) {
        boolean z;
        int length = akhArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        this.f2748b = akhArr;
        this.f2747a = length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ayc ayc = (ayc) obj;
        return this.f2747a == ayc.f2747a && Arrays.equals(this.f2748b, ayc.f2748b);
    }

    /* renamed from: a */
    public final akh mo1604a(int i) {
        return this.f2748b[i];
    }

    public final int hashCode() {
        int i = this.f2749c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f2748b) + 527;
        this.f2749c = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public final int mo1603a(akh akh) {
        int i = 0;
        while (true) {
            akh[] akhArr = this.f2748b;
            if (i >= akhArr.length) {
                return -1;
            }
            if (akh == akhArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2747a);
        for (int i2 = 0; i2 < this.f2747a; i2++) {
            parcel.writeParcelable(this.f2748b[i2], 0);
        }
    }
}
