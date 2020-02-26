package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ayc  reason: default package */
/* compiled from: PG */
public final class ayc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayb();
    public final int a;
    private final akh[] b;
    private int c;

    public final int describeContents() {
        return 0;
    }

    public ayc(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new akh[readInt];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (akh) parcel.readParcelable(akh.class.getClassLoader());
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
        bks.b(z);
        this.b = akhArr;
        this.a = length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ayc ayc = (ayc) obj;
        return this.a == ayc.a && Arrays.equals(this.b, ayc.b);
    }

    public final akh a(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b) + 527;
        this.c = hashCode;
        return hashCode;
    }

    public final int a(akh akh) {
        int i = 0;
        while (true) {
            akh[] akhArr = this.b;
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
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
