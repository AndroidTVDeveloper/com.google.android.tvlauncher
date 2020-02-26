package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: auz  reason: default package */
/* compiled from: PG */
public final class auz extends avc {
    public static final Parcelable.Creator CREATOR = new auy();
    private final String a;
    private final String b;
    private final String d;
    private final byte[] e;

    public auz(Parcel parcel) {
        super("GEOB");
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = (String) blm.a((Object) parcel.readString());
        this.d = (String) blm.a((Object) parcel.readString());
        this.e = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public auz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        auz auz = (auz) obj;
        return blm.a(this.a, auz.a) && blm.a(this.b, auz.b) && blm.a(this.d, auz.d) && Arrays.equals(this.e, auz.e);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String str3 = this.b;
        String str4 = this.d;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }
}
