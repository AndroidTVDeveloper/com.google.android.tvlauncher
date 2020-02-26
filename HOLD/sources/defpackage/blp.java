package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: blp  reason: default package */
/* compiled from: PG */
public final class blp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new blo();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public final int describeContents() {
        return 0;
    }

    public blp(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public blp(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = blm.a(parcel) ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        blp blp = (blp) obj;
        return this.a == blp.a && this.b == blp.b && this.c == blp.c && Arrays.equals(this.d, blp.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d != null;
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
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        blm.a(parcel, z);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
