package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aup */
/* compiled from: PG */
public final class aup extends avc {
    public static final Parcelable.Creator CREATOR = new auo();

    /* renamed from: a */
    public final int f2457a;

    /* renamed from: b */
    public final byte[] f2458b;

    /* renamed from: d */
    private final String f2459d;

    /* renamed from: e */
    private final String f2460e;

    public aup(Parcel parcel) {
        super("APIC");
        this.f2459d = (String) blm.m3636a((Object) parcel.readString());
        this.f2460e = (String) blm.m3636a((Object) parcel.readString());
        this.f2457a = parcel.readInt();
        this.f2458b = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public aup(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f2459d = str;
        this.f2460e = str2;
        this.f2457a = i;
        this.f2458b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aup aup = (aup) obj;
        return this.f2457a == aup.f2457a && blm.m3652a(this.f2459d, aup.f2459d) && blm.m3652a(this.f2460e, aup.f2460e) && Arrays.equals(this.f2458b, aup.f2458b);
    }

    public final int hashCode() {
        int i = (this.f2457a + 527) * 31;
        String str = this.f2459d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2460e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f2458b);
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2459d;
        String str3 = this.f2460e;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2459d);
        parcel.writeString(this.f2460e);
        parcel.writeInt(this.f2457a);
        parcel.writeByteArray(this.f2458b);
    }
}
