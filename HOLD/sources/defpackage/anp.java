package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: anp  reason: default package */
/* compiled from: PG */
public final class anp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ano();
    public final UUID a;
    public final String b;
    public final String c;
    private int d;
    private final byte[] e;

    public final boolean a() {
        return this.e != null;
    }

    public final int describeContents() {
        return 0;
    }

    public anp(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        this.c = (String) blm.a((Object) parcel.readString());
        this.e = parcel.createByteArray();
    }

    public anp(UUID uuid, String str, String str2, byte[] bArr) {
        this.a = (UUID) bks.a(uuid);
        this.b = str;
        this.c = (String) bks.a((Object) str2);
        this.e = bArr;
    }

    public anp(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        anp anp = (anp) obj;
        return blm.a(this.b, anp.b) && blm.a(this.c, anp.c) && blm.a(this.a, anp.a) && Arrays.equals(this.e, anp.e);
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.e);
        this.d = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.e);
    }
}
