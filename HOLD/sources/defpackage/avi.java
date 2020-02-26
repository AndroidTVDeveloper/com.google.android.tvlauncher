package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: avi  reason: default package */
/* compiled from: PG */
public final class avi extends avc {
    public static final Parcelable.Creator CREATOR = new avh();
    public final String a;
    public final byte[] b;

    public avi(Parcel parcel) {
        super("PRIV");
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public avi(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avi avi = (avi) obj;
        return blm.a(this.a, avi.a) && Arrays.equals(this.b, avi.b);
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((i + 527) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
