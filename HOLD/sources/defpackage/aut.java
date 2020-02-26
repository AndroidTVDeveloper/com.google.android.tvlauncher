package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aut  reason: default package */
/* compiled from: PG */
public final class aut extends avc {
    public static final Parcelable.Creator CREATOR = new aus();
    private final String a;
    private final int b;
    private final int d;
    private final long e;
    private final long f;
    private final avc[] g;

    public final int describeContents() {
        return 0;
    }

    public aut(Parcel parcel) {
        super("CHAP");
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new avc[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (avc) parcel.readParcelable(avc.class.getClassLoader());
        }
    }

    public aut(String str, int i, int i2, long j, long j2, avc[] avcArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = avcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aut aut = (aut) obj;
        return this.b == aut.b && this.d == aut.d && this.e == aut.e && this.f == aut.f && blm.a(this.a, aut.a) && Arrays.equals(this.g, aut.g);
    }

    public final int hashCode() {
        int i = (((((((this.b + 527) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (avc writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
