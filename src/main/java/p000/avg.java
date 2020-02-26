package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: avg */
/* compiled from: PG */
public final class avg extends avc {
    public static final Parcelable.Creator CREATOR = new avf();

    /* renamed from: a */
    public final int f2487a;

    /* renamed from: b */
    public final int f2488b;

    /* renamed from: d */
    public final int[] f2489d;

    /* renamed from: e */
    public final int[] f2490e;

    /* renamed from: f */
    private final int f2491f;

    public final int describeContents() {
        return 0;
    }

    public avg(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2491f = i;
        this.f2487a = i2;
        this.f2488b = i3;
        this.f2489d = iArr;
        this.f2490e = iArr2;
    }

    public avg(Parcel parcel) {
        super("MLLT");
        this.f2491f = parcel.readInt();
        this.f2487a = parcel.readInt();
        this.f2488b = parcel.readInt();
        this.f2489d = (int[]) blm.m3636a(parcel.createIntArray());
        this.f2490e = (int[]) blm.m3636a(parcel.createIntArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avg avg = (avg) obj;
        return this.f2491f == avg.f2491f && this.f2487a == avg.f2487a && this.f2488b == avg.f2488b && Arrays.equals(this.f2489d, avg.f2489d) && Arrays.equals(this.f2490e, avg.f2490e);
    }

    public final int hashCode() {
        return ((((((((this.f2491f + 527) * 31) + this.f2487a) * 31) + this.f2488b) * 31) + Arrays.hashCode(this.f2489d)) * 31) + Arrays.hashCode(this.f2490e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2491f);
        parcel.writeInt(this.f2487a);
        parcel.writeInt(this.f2488b);
        parcel.writeIntArray(this.f2489d);
        parcel.writeIntArray(this.f2490e);
    }
}
