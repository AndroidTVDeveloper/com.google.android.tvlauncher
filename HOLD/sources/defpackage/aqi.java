package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aqi  reason: default package */
/* compiled from: PG */
public final class aqi implements atv {
    public static final Parcelable.Creator CREATOR = new aqh();
    public final String a;
    public final byte[] b;
    public final int c;
    private final int d;

    public final akh a() {
        return null;
    }

    public final byte[] b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ aqi(Parcel parcel) {
        this.a = (String) blm.a((Object) parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.b = bArr;
        parcel.readByteArray(bArr);
        this.d = parcel.readInt();
        this.c = parcel.readInt();
    }

    public aqi(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.d = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqi aqi = (aqi) obj;
        return this.a.equals(aqi.a) && Arrays.equals(this.b, aqi.b) && this.d == aqi.d && this.c == aqi.c;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.d) * 31) + this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() == 0 ? new String("mdta: key=") : "mdta: key=".concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
