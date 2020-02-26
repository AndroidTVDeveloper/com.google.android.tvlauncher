package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aqi */
/* compiled from: PG */
public final class aqi implements atv {
    public static final Parcelable.Creator CREATOR = new aqh();

    /* renamed from: a */
    public final String f1834a;

    /* renamed from: b */
    public final byte[] f1835b;

    /* renamed from: c */
    public final int f1836c;

    /* renamed from: d */
    private final int f1837d;

    /* renamed from: a */
    public final akh mo1253a() {
        return null;
    }

    /* renamed from: b */
    public final byte[] mo1254b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ aqi(Parcel parcel) {
        this.f1834a = (String) blm.m3636a((Object) parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.f1835b = bArr;
        parcel.readByteArray(bArr);
        this.f1837d = parcel.readInt();
        this.f1836c = parcel.readInt();
    }

    public aqi(String str, byte[] bArr, int i, int i2) {
        this.f1834a = str;
        this.f1835b = bArr;
        this.f1837d = i;
        this.f1836c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqi aqi = (aqi) obj;
        return this.f1834a.equals(aqi.f1834a) && Arrays.equals(this.f1835b, aqi.f1835b) && this.f1837d == aqi.f1837d && this.f1836c == aqi.f1836c;
    }

    public final int hashCode() {
        return ((((((this.f1834a.hashCode() + 527) * 31) + Arrays.hashCode(this.f1835b)) * 31) + this.f1837d) * 31) + this.f1836c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1834a);
        return valueOf.length() == 0 ? new String("mdta: key=") : "mdta: key=".concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1834a);
        parcel.writeInt(this.f1835b.length);
        parcel.writeByteArray(this.f1835b);
        parcel.writeInt(this.f1837d);
        parcel.writeInt(this.f1836c);
    }
}
