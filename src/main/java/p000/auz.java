package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: auz */
/* compiled from: PG */
public final class auz extends avc {
    public static final Parcelable.Creator CREATOR = new auy();

    /* renamed from: a */
    private final String f2476a;

    /* renamed from: b */
    private final String f2477b;

    /* renamed from: d */
    private final String f2478d;

    /* renamed from: e */
    private final byte[] f2479e;

    public auz(Parcel parcel) {
        super("GEOB");
        this.f2476a = (String) blm.m3636a((Object) parcel.readString());
        this.f2477b = (String) blm.m3636a((Object) parcel.readString());
        this.f2478d = (String) blm.m3636a((Object) parcel.readString());
        this.f2479e = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public auz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f2476a = str;
        this.f2477b = str2;
        this.f2478d = str3;
        this.f2479e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        auz auz = (auz) obj;
        return blm.m3652a(this.f2476a, auz.f2476a) && blm.m3652a(this.f2477b, auz.f2477b) && blm.m3652a(this.f2478d, auz.f2478d) && Arrays.equals(this.f2479e, auz.f2479e);
    }

    public final int hashCode() {
        String str = this.f2476a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f2477b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2478d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f2479e);
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2476a;
        String str3 = this.f2477b;
        String str4 = this.f2478d;
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
        parcel.writeString(this.f2476a);
        parcel.writeString(this.f2477b);
        parcel.writeString(this.f2478d);
        parcel.writeByteArray(this.f2479e);
    }
}
