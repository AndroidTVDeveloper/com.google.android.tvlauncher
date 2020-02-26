package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aut */
/* compiled from: PG */
public final class aut extends avc {
    public static final Parcelable.Creator CREATOR = new aus();

    /* renamed from: a */
    private final String f2462a;

    /* renamed from: b */
    private final int f2463b;

    /* renamed from: d */
    private final int f2464d;

    /* renamed from: e */
    private final long f2465e;

    /* renamed from: f */
    private final long f2466f;

    /* renamed from: g */
    private final avc[] f2467g;

    public final int describeContents() {
        return 0;
    }

    public aut(Parcel parcel) {
        super("CHAP");
        this.f2462a = (String) blm.m3636a((Object) parcel.readString());
        this.f2463b = parcel.readInt();
        this.f2464d = parcel.readInt();
        this.f2465e = parcel.readLong();
        this.f2466f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f2467g = new avc[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f2467g[i] = (avc) parcel.readParcelable(avc.class.getClassLoader());
        }
    }

    public aut(String str, int i, int i2, long j, long j2, avc[] avcArr) {
        super("CHAP");
        this.f2462a = str;
        this.f2463b = i;
        this.f2464d = i2;
        this.f2465e = j;
        this.f2466f = j2;
        this.f2467g = avcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aut aut = (aut) obj;
        return this.f2463b == aut.f2463b && this.f2464d == aut.f2464d && this.f2465e == aut.f2465e && this.f2466f == aut.f2466f && blm.m3652a(this.f2462a, aut.f2462a) && Arrays.equals(this.f2467g, aut.f2467g);
    }

    public final int hashCode() {
        int i = (((((((this.f2463b + 527) * 31) + this.f2464d) * 31) + ((int) this.f2465e)) * 31) + ((int) this.f2466f)) * 31;
        String str = this.f2462a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2462a);
        parcel.writeInt(this.f2463b);
        parcel.writeInt(this.f2464d);
        parcel.writeLong(this.f2465e);
        parcel.writeLong(this.f2466f);
        parcel.writeInt(this.f2467g.length);
        for (avc writeParcelable : this.f2467g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
