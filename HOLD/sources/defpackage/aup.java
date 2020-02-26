package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aup  reason: default package */
/* compiled from: PG */
public final class aup extends avc {
    public static final Parcelable.Creator CREATOR = new auo();
    public final int a;
    public final byte[] b;
    private final String d;
    private final String e;

    public aup(Parcel parcel) {
        super("APIC");
        this.d = (String) blm.a((Object) parcel.readString());
        this.e = (String) blm.a((Object) parcel.readString());
        this.a = parcel.readInt();
        this.b = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public aup(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.d = str;
        this.e = str2;
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aup aup = (aup) obj;
        return this.a == aup.a && blm.a(this.d, aup.d) && blm.a(this.e, aup.e) && Arrays.equals(this.b, aup.b);
    }

    public final int hashCode() {
        int i = (this.a + 527) * 31;
        String str = this.d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
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
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
    }
}
