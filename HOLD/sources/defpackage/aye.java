package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aye  reason: default package */
/* compiled from: PG */
public final class aye implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayd();
    public static final aye a = new aye(new ayc[0]);
    public final int b;
    private final ayc[] c;
    private int d;

    public final int describeContents() {
        return 0;
    }

    public aye(Parcel parcel) {
        int readInt = parcel.readInt();
        this.b = readInt;
        this.c = new ayc[readInt];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (ayc) parcel.readParcelable(ayc.class.getClassLoader());
        }
    }

    public aye(ayc... aycArr) {
        this.c = aycArr;
        this.b = aycArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aye aye = (aye) obj;
        return this.b == aye.b && Arrays.equals(this.c, aye.c);
    }

    public final ayc a(int i) {
        return this.c[i];
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public final int a(ayc ayc) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == ayc) {
                return i;
            }
        }
        return -1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }
}
