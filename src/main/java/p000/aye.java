package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aye */
/* compiled from: PG */
public final class aye implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayd();

    /* renamed from: a */
    public static final aye f2750a = new aye(new ayc[0]);

    /* renamed from: b */
    public final int f2751b;

    /* renamed from: c */
    private final ayc[] f2752c;

    /* renamed from: d */
    private int f2753d;

    public final int describeContents() {
        return 0;
    }

    public aye(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f2751b = readInt;
        this.f2752c = new ayc[readInt];
        for (int i = 0; i < this.f2751b; i++) {
            this.f2752c[i] = (ayc) parcel.readParcelable(ayc.class.getClassLoader());
        }
    }

    public aye(ayc... aycArr) {
        this.f2752c = aycArr;
        this.f2751b = aycArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aye aye = (aye) obj;
        return this.f2751b == aye.f2751b && Arrays.equals(this.f2752c, aye.f2752c);
    }

    /* renamed from: a */
    public final ayc mo1612a(int i) {
        return this.f2752c[i];
    }

    public final int hashCode() {
        int i = this.f2753d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f2752c);
        this.f2753d = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public final int mo1611a(ayc ayc) {
        for (int i = 0; i < this.f2751b; i++) {
            if (this.f2752c[i] == ayc) {
                return i;
            }
        }
        return -1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2751b);
        for (int i2 = 0; i2 < this.f2751b; i2++) {
            parcel.writeParcelable(this.f2752c[i2], 0);
        }
    }
}
