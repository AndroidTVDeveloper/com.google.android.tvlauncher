package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: blp */
/* compiled from: PG */
public final class blp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new blo();

    /* renamed from: a */
    public final int f4310a;

    /* renamed from: b */
    public final int f4311b;

    /* renamed from: c */
    public final int f4312c;

    /* renamed from: d */
    public final byte[] f4313d;

    /* renamed from: e */
    private int f4314e;

    public final int describeContents() {
        return 0;
    }

    public blp(int i, int i2, int i3, byte[] bArr) {
        this.f4310a = i;
        this.f4311b = i2;
        this.f4312c = i3;
        this.f4313d = bArr;
    }

    public blp(Parcel parcel) {
        this.f4310a = parcel.readInt();
        this.f4311b = parcel.readInt();
        this.f4312c = parcel.readInt();
        this.f4313d = blm.m3650a(parcel) ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        blp blp = (blp) obj;
        return this.f4310a == blp.f4310a && this.f4311b == blp.f4311b && this.f4312c == blp.f4312c && Arrays.equals(this.f4313d, blp.f4313d);
    }

    public final int hashCode() {
        int i = this.f4314e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f4310a + 527) * 31) + this.f4311b) * 31) + this.f4312c) * 31) + Arrays.hashCode(this.f4313d);
        this.f4314e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f4310a;
        int i2 = this.f4311b;
        int i3 = this.f4312c;
        boolean z = this.f4313d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        parcel.writeInt(this.f4310a);
        parcel.writeInt(this.f4311b);
        parcel.writeInt(this.f4312c);
        if (this.f4313d != null) {
            z = true;
        } else {
            z = false;
        }
        blm.m3643a(parcel, z);
        byte[] bArr = this.f4313d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
