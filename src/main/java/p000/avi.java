package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: avi */
/* compiled from: PG */
public final class avi extends avc {
    public static final Parcelable.Creator CREATOR = new avh();

    /* renamed from: a */
    public final String f2492a;

    /* renamed from: b */
    public final byte[] f2493b;

    public avi(Parcel parcel) {
        super("PRIV");
        this.f2492a = (String) blm.m3636a((Object) parcel.readString());
        this.f2493b = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public avi(String str, byte[] bArr) {
        super("PRIV");
        this.f2492a = str;
        this.f2493b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avi avi = (avi) obj;
        return blm.m3652a(this.f2492a, avi.f2492a) && Arrays.equals(this.f2493b, avi.f2493b);
    }

    public final int hashCode() {
        int i;
        String str = this.f2492a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((i + 527) * 31) + Arrays.hashCode(this.f2493b);
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2492a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2492a);
        parcel.writeByteArray(this.f2493b);
    }
}
